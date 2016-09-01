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
package com.bydan.erp.nomina.presentation.swing.jinternalframes;




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

import com.bydan.erp.nomina.util.HistorialPagoNomiConstantesFunciones;
import com.bydan.erp.nomina.util.HistorialPagoNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.HistorialPagoNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.HistorialPagoNomiBean;
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

import com.bydan.erp.nomina.presentation.swing.jinternalframes.auxiliar.*;
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
import com.bydan.erp.nomina.resources.reportes.AuxiliarReportes;


import com.bydan.erp.nomina.util.*;
import com.bydan.erp.nomina.business.logic.*;

import com.bydan.erp.seguridad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
//import com.bydan.framework.erp.business.entity.ConexionBeanFace;
//import com.bydan.framework.erp.business.entity.Mensajes;


import com.bydan.erp.seguridad.presentation.swing.jinternalframes.*;

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


import com.bydan.erp.nomina.presentation.web.jsf.sessionbean.*;

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
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class HistorialPagoNomiBeanSwingJInternalFrame extends HistorialPagoNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(HistorialPagoNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<HistorialPagoNomi> historialpagonomiValidator = new ClassValidator<HistorialPagoNomi>(HistorialPagoNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public HistorialPagoNomi historialpagonomi;	
	public HistorialPagoNomi historialpagonomiAux;
	public HistorialPagoNomi historialpagonomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public HistorialPagoNomi historialpagonomiTotales;
	public Long idHistorialPagoNomiActual;
	public Long iIdNuevoHistorialPagoNomi=0L;
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

	public String sFinalQueryComboEstructura="";

	public List<Estructura> estructurasForeignKey;

	public List<Estructura> getestructurasForeignKey() {
		return estructurasForeignKey;
	}

	public void setestructurasForeignKey(List<Estructura> estructurasForeignKey) {
		this.estructurasForeignKey = estructurasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Estructura estructuraForeignKey;

	public Estructura getestructuraForeignKey() {
		return estructuraForeignKey;
	}

	public void setestructuraForeignKey(Estructura estructuraForeignKey) {
		this.estructuraForeignKey = estructuraForeignKey;
	}

	public String sFinalQueryComboEmpleado="";

	public List<Empleado> empleadosForeignKey;

	public List<Empleado> getempleadosForeignKey() {
		return empleadosForeignKey;
	}

	public void setempleadosForeignKey(List<Empleado> empleadosForeignKey) {
		this.empleadosForeignKey = empleadosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Empleado empleadoForeignKey;

	public Empleado getempleadoForeignKey() {
		return empleadoForeignKey;
	}

	public void setempleadoForeignKey(Empleado empleadoForeignKey) {
		this.empleadoForeignKey = empleadoForeignKey;
	}

	public String sFinalQueryComboRubroEmplea="";

	public List<RubroEmplea> rubroempleasForeignKey;

	public List<RubroEmplea> getrubroempleasForeignKey() {
		return rubroempleasForeignKey;
	}

	public void setrubroempleasForeignKey(List<RubroEmplea> rubroempleasForeignKey) {
		this.rubroempleasForeignKey = rubroempleasForeignKey;
	}

	//OBJETO FK ACTUAL
	public RubroEmplea rubroempleaForeignKey;

	public RubroEmplea getrubroempleaForeignKey() {
		return rubroempleaForeignKey;
	}

	public void setrubroempleaForeignKey(RubroEmplea rubroempleaForeignKey) {
		this.rubroempleaForeignKey = rubroempleaForeignKey;
	}

	public String sFinalQueryComboMes="";

	public List<Mes> messForeignKey;

	public List<Mes> getmessForeignKey() {
		return messForeignKey;
	}

	public void setmessForeignKey(List<Mes> messForeignKey) {
		this.messForeignKey = messForeignKey;
	}

	//OBJETO FK ACTUAL
	public Mes mesForeignKey;

	public Mes getmesForeignKey() {
		return mesForeignKey;
	}

	public void setmesForeignKey(Mes mesForeignKey) {
		this.mesForeignKey = mesForeignKey;
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
	
	public Boolean isPermisoTodoHistorialPagoNomi;
	public Boolean isPermisoNuevoHistorialPagoNomi;
	public Boolean isPermisoActualizarHistorialPagoNomi;
	public Boolean isPermisoActualizarOriginalHistorialPagoNomi;
	public Boolean isPermisoEliminarHistorialPagoNomi;
	public Boolean isPermisoGuardarCambiosHistorialPagoNomi;
	public Boolean isPermisoConsultaHistorialPagoNomi;
	public Boolean isPermisoBusquedaHistorialPagoNomi;
	public Boolean isPermisoReporteHistorialPagoNomi;
	public Boolean isPermisoPaginacionMedioHistorialPagoNomi;
	public Boolean isPermisoPaginacionAltoHistorialPagoNomi;
	public Boolean isPermisoPaginacionTodoHistorialPagoNomi;
	public Boolean isPermisoCopiarHistorialPagoNomi;
	public Boolean isPermisoVerFormHistorialPagoNomi;
	public Boolean isPermisoDuplicarHistorialPagoNomi;
	public Boolean isPermisoOrdenHistorialPagoNomi;
	
	
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
	
	public HistorialPagoNomiParameterReturnGeneral historialpagonomiReturnGeneral;
	public HistorialPagoNomiParameterReturnGeneral historialpagonomiParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoHistorialPagoNomi=false;
	public Boolean esParaAccionDesdeFormularioHistorialPagoNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected HistorialPagoNomiSessionBeanAdditional historialpagonomiSessionBeanAdditional=null;
	
	public HistorialPagoNomiSessionBeanAdditional getHistorialPagoNomiSessionBeanAdditional() {
		return this.historialpagonomiSessionBeanAdditional;
	}
	
	public void setHistorialPagoNomiSessionBeanAdditional(HistorialPagoNomiSessionBeanAdditional historialpagonomiSessionBeanAdditional) {
		try {
			this.historialpagonomiSessionBeanAdditional=historialpagonomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected HistorialPagoNomiBeanSwingJInternalFrameAdditional historialpagonomiBeanSwingJInternalFrameAdditional=null;
	//public class HistorialPagoNomiBeanSwingJInternalFrame
	
	public HistorialPagoNomiBeanSwingJInternalFrameAdditional getHistorialPagoNomiBeanSwingJInternalFrameAdditional() {
		return this.historialpagonomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setHistorialPagoNomiBeanSwingJInternalFrameAdditional(HistorialPagoNomiBeanSwingJInternalFrameAdditional historialpagonomiBeanSwingJInternalFrameAdditional) {
		try {
			this.historialpagonomiBeanSwingJInternalFrameAdditional=historialpagonomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public HistorialPagoNomiLogic historialpagonomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public HistorialPagoNomi historialpagonomiBean;
	public HistorialPagoNomiConstantesFunciones historialpagonomiConstantesFunciones;
	//public HistorialPagoNomiParameterReturnGeneral historialpagonomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EstructuraLogic estructuraLogic;
	public EmpleadoLogic empleadoLogic;
	public RubroEmpleaLogic rubroempleaLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<HistorialPagoNomi> historialpagonomis;	
	//public List<HistorialPagoNomi> historialpagonomisEliminados;
	//public List<HistorialPagoNomi> historialpagonomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoHistorialPagoNomi=false;
	public Boolean isVisibilidadCeldaDuplicarHistorialPagoNomi=true;
	public Boolean isVisibilidadCeldaCopiarHistorialPagoNomi=true;
	public Boolean isVisibilidadCeldaVerFormHistorialPagoNomi=true;
	public Boolean isVisibilidadCeldaOrdenHistorialPagoNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=false;
	public Boolean isVisibilidadCeldaModificarHistorialPagoNomi=false;
	public Boolean isVisibilidadCeldaActualizarHistorialPagoNomi=false;
	public Boolean isVisibilidadCeldaEliminarHistorialPagoNomi=false;
	public Boolean isVisibilidadCeldaCancelarHistorialPagoNomi=false;
	public Boolean isVisibilidadCeldaGuardarHistorialPagoNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdRubroEmplea=false;
	
	public Long getiIdNuevoHistorialPagoNomi() {
		return this.iIdNuevoHistorialPagoNomi;
	}

	public void setiIdNuevoHistorialPagoNomi(Long iIdNuevoHistorialPagoNomi) {
		this.iIdNuevoHistorialPagoNomi = iIdNuevoHistorialPagoNomi;
	}
	
	public Long getidHistorialPagoNomiActual() {
		return this.idHistorialPagoNomiActual;
	}

	public void setidHistorialPagoNomiActual(Long idHistorialPagoNomiActual) {
		this.idHistorialPagoNomiActual = idHistorialPagoNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public HistorialPagoNomi gethistorialpagonomi() {
		return this.historialpagonomi;
	}

	public void sethistorialpagonomi(HistorialPagoNomi historialpagonomi) {
		this.historialpagonomi = historialpagonomi;
	}
	
	public HistorialPagoNomi gethistorialpagonomiAux() {
		return this.historialpagonomiAux;
	}

	public void sethistorialpagonomiAux(HistorialPagoNomi historialpagonomiAux) {
		this.historialpagonomiAux = historialpagonomiAux;
	}				
	
	public HistorialPagoNomi gethistorialpagonomiAnterior() {
		return this.historialpagonomiAnterior;
	}

	public void sethistorialpagonomiAnterior(HistorialPagoNomi historialpagonomiAnterior) {
		this.historialpagonomiAnterior = historialpagonomiAnterior;
	}	
	
	public HistorialPagoNomi gethistorialpagonomiTotales() {
		return this.historialpagonomiTotales;
	}

	public void sethistorialpagonomiTotales(HistorialPagoNomi historialpagonomiTotales) {
		this.historialpagonomiTotales = historialpagonomiTotales;
	}	
	
	public HistorialPagoNomi gethistorialpagonomiBean() {
		return this.historialpagonomiBean;
	}

	public void sethistorialpagonomiBean(HistorialPagoNomi historialpagonomiBean) {
		this.historialpagonomiBean = historialpagonomiBean;
	}	
	
	public HistorialPagoNomiParameterReturnGeneral gethistorialpagonomiReturnGeneral() {
		return this.historialpagonomiReturnGeneral;
	}

	public void sethistorialpagonomiReturnGeneral(HistorialPagoNomiParameterReturnGeneral historialpagonomiReturnGeneral) {
		this.historialpagonomiReturnGeneral = historialpagonomiReturnGeneral;
	}	
	
	
	public Long id_empleadoFK_IdEmpleado=-1L;

	public Long getid_empleadoFK_IdEmpleado() {
		return this.id_empleadoFK_IdEmpleado;
	}

	public void setid_empleadoFK_IdEmpleado(Long id_empleadoFK_IdEmpleado) {
		this.id_empleadoFK_IdEmpleado = id_empleadoFK_IdEmpleado;
	}

	public Long id_empresaFK_IdEmpresa=-1L;

	public Long getid_empresaFK_IdEmpresa() {
		return this.id_empresaFK_IdEmpresa;
	}

	public void setid_empresaFK_IdEmpresa(Long id_empresaFK_IdEmpresa) {
		this.id_empresaFK_IdEmpresa = id_empresaFK_IdEmpresa;
	}

	public Long id_estructuraFK_IdEstructura=-1L;

	public Long getid_estructuraFK_IdEstructura() {
		return this.id_estructuraFK_IdEstructura;
	}

	public void setid_estructuraFK_IdEstructura(Long id_estructuraFK_IdEstructura) {
		this.id_estructuraFK_IdEstructura = id_estructuraFK_IdEstructura;
	}

	public Long id_mesFK_IdMes=null;

	public Long getid_mesFK_IdMes() {
		return this.id_mesFK_IdMes;
	}

	public void setid_mesFK_IdMes(Long id_mesFK_IdMes) {
		this.id_mesFK_IdMes = id_mesFK_IdMes;
	}

	public Long id_rubro_empleaFK_IdRubroEmplea=-1L;

	public Long getid_rubro_empleaFK_IdRubroEmplea() {
		return this.id_rubro_empleaFK_IdRubroEmplea;
	}

	public void setid_rubro_empleaFK_IdRubroEmplea(Long id_rubro_empleaFK_IdRubroEmplea) {
		this.id_rubro_empleaFK_IdRubroEmplea = id_rubro_empleaFK_IdRubroEmplea;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public HistorialPagoNomiLogic getHistorialPagoNomiLogic()	{		
		return historialpagonomiLogic;
	}

	public void setHistorialPagoNomiLogic(HistorialPagoNomiLogic historialpagonomiLogic) {
		this.historialpagonomiLogic = historialpagonomiLogic;
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
	
	public Boolean getIsEsNuevoHistorialPagoNomi() {
		return isEsNuevoHistorialPagoNomi;
	}

	public void setIsEsNuevoHistorialPagoNomi(Boolean isEsNuevoHistorialPagoNomi) {
		this.isEsNuevoHistorialPagoNomi = isEsNuevoHistorialPagoNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioHistorialPagoNomi() {
		return esParaAccionDesdeFormularioHistorialPagoNomi;
	}
	
	public void setEsParaAccionDesdeFormularioHistorialPagoNomi(Boolean esParaAccionDesdeFormularioHistorialPagoNomi) {
		this.esParaAccionDesdeFormularioHistorialPagoNomi = esParaAccionDesdeFormularioHistorialPagoNomi;
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

			if(this.historialpagonomiSessionBean==null) {
				this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
			}

			if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(historialpagonomiSessionBean.getlidEmpresaActual());
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

	public void cargarCombosEstructurasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.estructurasForeignKey=new ArrayList<Estructura>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EstructuraLogic estructuraLogic=new EstructuraLogic();

			//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

			if(this.historialpagonomiSessionBean==null) {
				this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
			}

			if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//estructuraLogic.getEstructuraDataAccess().setIsForForeingKeyData(true);

					estructuraLogic.getTodosEstructurasWithConnection(sFinalQuery,new Pagination());

					this.estructurasForeignKey=estructuraLogic.getEstructuras();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEstructura(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					estructuraLogic.getEntityWithConnection(historialpagonomiSessionBean.getlidEstructuraActual());
					this.estructurasForeignKey.add(estructuraLogic.getEstructura());
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

	public void cargarCombosEmpleadosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.empleadosForeignKey=new ArrayList<Empleado>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			EmpleadoLogic empleadoLogic=new EmpleadoLogic();

			//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

			if(this.historialpagonomiSessionBean==null) {
				this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
			}

			if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//empleadoLogic.getEmpleadoDataAccess().setIsForForeingKeyData(true);

					empleadoLogic.getTodosEmpleadosWithConnection(sFinalQuery,new Pagination());

					this.empleadosForeignKey=empleadoLogic.getEmpleados();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaEmpleado(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(historialpagonomiSessionBean.getlidEmpleadoActual());
					this.empleadosForeignKey.add(empleadoLogic.getEmpleado());
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

	public void cargarCombosRubroEmpleasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			RubroEmpleaLogic rubroempleaLogic=new RubroEmpleaLogic();

			//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

			if(this.historialpagonomiSessionBean==null) {
				this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
			}

			if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//rubroempleaLogic.getRubroEmpleaDataAccess().setIsForForeingKeyData(true);

					rubroempleaLogic.getTodosRubroEmpleasWithConnection(sFinalQuery,new Pagination());

					this.rubroempleasForeignKey=rubroempleaLogic.getRubroEmpleas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaRubroEmplea(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					rubroempleaLogic.getEntityWithConnection(historialpagonomiSessionBean.getlidRubroEmpleaActual());
					this.rubroempleasForeignKey.add(rubroempleaLogic.getRubroEmplea());
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

	public void cargarCombosMessForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.messForeignKey=new ArrayList<Mes>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			MesLogic mesLogic=new MesLogic();

			//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

			if(this.historialpagonomiSessionBean==null) {
				this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
			}

			if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//mesLogic.getMesDataAccess().setIsForForeingKeyData(true);

					mesLogic.getTodosMessWithConnection(sFinalQuery,new Pagination());

					this.messForeignKey=mesLogic.getMess();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaMes(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					mesLogic.getEntityWithConnection(historialpagonomiSessionBean.getlidMesActual());
					this.messForeignKey.add(mesLogic.getMes());
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

					if(this.historialpagonomi!=null) {
						this.historialpagonomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
						this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaHistorialPagoNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaHistorialPagoNomiGenerico)throws Exception
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
				jComboBoxid_empresaHistorialPagoNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaHistorialPagoNomiGenerico!=null && jComboBoxid_empresaHistorialPagoNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaHistorialPagoNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEstructuraForeignKey(Long idEstructuraSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(estructuraTemp!=null) {

					if(this.historialpagonomi!=null) {
						this.historialpagonomi.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
						this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraHistorialPagoNomi.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi!=null) {
						jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.setSelectedIndex(0);
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

	public String getActualEstructuraForeignKeyDescripcion(Long idEstructuraSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}


			sDescripcion=EstructuraConstantesFunciones.getEstructuraDescripcion(estructuraTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraHistorialPagoNomiGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraTemp=null;

			for(Estructura estructuraAux:estructurasForeignKey) {
				if(estructuraAux.getId()!=null && estructuraAux.getId().equals(idEstructuraSeleccionado)) {
					estructuraTemp=estructuraAux;
					break;
				}
			}

			if(estructuraTemp!=null) {
				jComboBoxid_estructuraHistorialPagoNomiGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraHistorialPagoNomiGenerico!=null && jComboBoxid_estructuraHistorialPagoNomiGenerico.getItemCount()>0) {
					jComboBoxid_estructuraHistorialPagoNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualEmpleadoForeignKey(Long idEmpleadoSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(empleadoTemp!=null) {

					if(this.historialpagonomi!=null) {
						this.historialpagonomi.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
						this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoHistorialPagoNomi.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.setSelectedIndex(0);
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

	public String getActualEmpleadoForeignKeyDescripcion(Long idEmpleadoSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}


			sDescripcion=EmpleadoConstantesFunciones.getEmpleadoDescripcion(empleadoTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoHistorialPagoNomiGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoTemp=null;

			for(Empleado empleadoAux:empleadosForeignKey) {
				if(empleadoAux.getId()!=null && empleadoAux.getId().equals(idEmpleadoSeleccionado)) {
					empleadoTemp=empleadoAux;
					break;
				}
			}

			if(empleadoTemp!=null) {
				jComboBoxid_empleadoHistorialPagoNomiGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoHistorialPagoNomiGenerico!=null && jComboBoxid_empleadoHistorialPagoNomiGenerico.getItemCount()>0) {
					jComboBoxid_empleadoHistorialPagoNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualRubroEmpleaForeignKey(Long idRubroEmpleaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(rubroempleaTemp!=null) {

					if(this.historialpagonomi!=null) {
						this.historialpagonomi.setRubroEmplea(rubroempleaTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
						this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.setSelectedItem(rubroempleaTemp);
					}
				} else {
					//jComboBoxid_rubro_empleaHistorialPagoNomi.setSelectedItem(rubroempleaTemp);
					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){
					if(rubroempleaTemp!=null && jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi!=null) {
						jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setSelectedItem(rubroempleaTemp);
					} else {
						if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi!=null) {
							//jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setSelectedItem(rubroempleaTemp);
							if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.getItemCount()>0) {
								jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setSelectedIndex(0);
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

	public String getActualRubroEmpleaForeignKeyDescripcion(Long idRubroEmpleaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}


			sDescripcion=RubroEmpleaConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualRubroEmpleaForeignKeyGenerico(Long idRubroEmpleaSeleccionado,JComboBox jComboBoxid_rubro_empleaHistorialPagoNomiGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaTemp=null;

			for(RubroEmplea rubroempleaAux:rubroempleasForeignKey) {
				if(rubroempleaAux.getId()!=null && rubroempleaAux.getId().equals(idRubroEmpleaSeleccionado)) {
					rubroempleaTemp=rubroempleaAux;
					break;
				}
			}

			if(rubroempleaTemp!=null) {
				jComboBoxid_rubro_empleaHistorialPagoNomiGenerico.setSelectedItem(rubroempleaTemp);
			} else {
				if(jComboBoxid_rubro_empleaHistorialPagoNomiGenerico!=null && jComboBoxid_rubro_empleaHistorialPagoNomiGenerico.getItemCount()>0) {
					jComboBoxid_rubro_empleaHistorialPagoNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualMesForeignKey(Long idMesSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(mesTemp!=null) {

					if(this.historialpagonomi!=null) {
						this.historialpagonomi.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
						this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesHistorialPagoNomi.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesHistorialPagoNomi!=null) {
						jComboBoxid_mesFK_IdMesHistorialPagoNomi.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesHistorialPagoNomi!=null) {
							//jComboBoxid_mesFK_IdMesHistorialPagoNomi.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesHistorialPagoNomi.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesHistorialPagoNomi.setSelectedIndex(0);
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

	public String getActualMesForeignKeyDescripcion(Long idMesSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}


			sDescripcion=MesConstantesFunciones.getMesDescripcion(mesTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesHistorialPagoNomiGenerico)throws Exception
	{
		try
		{
			Mes  mesTemp=null;

			for(Mes mesAux:messForeignKey) {
				if(mesAux.getId()!=null && mesAux.getId().equals(idMesSeleccionado)) {
					mesTemp=mesAux;
					break;
				}
			}

			if(mesTemp!=null) {
				jComboBoxid_mesHistorialPagoNomiGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesHistorialPagoNomiGenerico!=null && jComboBoxid_mesHistorialPagoNomiGenerico.getItemCount()>0) {
					jComboBoxid_mesHistorialPagoNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(HistorialPagoNomi historialpagonomi,JComboBox jComboBoxid_empresaHistorialPagoNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaHistorialPagoNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaHistorialPagoNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				historialpagonomi.setid_empresa(empresaAux.getId());
				historialpagonomi.setempresa_descripcion(HistorialPagoNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				historialpagonomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(HistorialPagoNomi historialpagonomi,JComboBox jComboBoxid_estructuraHistorialPagoNomiGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraHistorialPagoNomiGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraHistorialPagoNomiGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				historialpagonomi.setid_estructura(estructuraAux.getId());
				historialpagonomi.setestructura_descripcion(HistorialPagoNomiConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				historialpagonomi.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(HistorialPagoNomi historialpagonomi,JComboBox jComboBoxid_empleadoHistorialPagoNomiGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoHistorialPagoNomiGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoHistorialPagoNomiGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				historialpagonomi.setid_empleado(empleadoAux.getId());
				historialpagonomi.setempleado_descripcion(HistorialPagoNomiConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				historialpagonomi.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRubroEmpleaForeignKey(HistorialPagoNomi historialpagonomi,JComboBox jComboBoxid_rubro_empleaHistorialPagoNomiGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaAux=new RubroEmplea();

			if(jComboBoxid_rubro_empleaHistorialPagoNomiGenerico==null) {
				rubroempleaAux=(RubroEmplea)this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.getSelectedItem();
			} else {
				rubroempleaAux=(RubroEmplea)jComboBoxid_rubro_empleaHistorialPagoNomiGenerico.getSelectedItem();
			}

			if(rubroempleaAux!=null && rubroempleaAux.getId()!=null) {
				historialpagonomi.setid_rubro_emplea(rubroempleaAux.getId());
				historialpagonomi.setrubroemplea_descripcion(HistorialPagoNomiConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaAux));
				historialpagonomi.setRubroEmplea(rubroempleaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(HistorialPagoNomi historialpagonomi,JComboBox jComboBoxid_mesHistorialPagoNomiGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesHistorialPagoNomiGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesHistorialPagoNomiGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				historialpagonomi.setid_mes(mesAux.getId());
				historialpagonomi.setmes_descripcion(HistorialPagoNomiConstantesFunciones.getMesDescripcion(mesAux));
				historialpagonomi.setMes(mesAux);			}
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

					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { 
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { 
					}

					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEstructurasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEstructura=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { 
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { 
					}

					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.addItem(estructura);
							}
						}

						if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameEmpleadosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingEmpleado=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { 
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { 
					}

					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.addItem(empleado);
							}
						}

						if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameRubroEmpleasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingRubroEmplea=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { 
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.addItem(rubroemplea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { 
					}

					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.addItem(rubroemplea);
							}
						}

						if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameMessForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingMes=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { 
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { 
					}

					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesHistorialPagoNomi.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesHistorialPagoNomi.addItem(mes);
							}
						}

						if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEstructuraForeignKey(Estructura estructura,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameRubroEmpleaForeignKey(RubroEmplea rubroemplea,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.setSelectedItem(rubroemplea);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setSelectedItem(rubroemplea);
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameMesForeignKey(Mes mes,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesHistorialPagoNomi.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesHistorialPagoNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesHistorialPagoNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			HistorialPagoNomiConstantesFunciones.refrescarForeignKeysDescripcionesHistorialPagoNomi(this.historialpagonomiLogic.getHistorialPagoNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			HistorialPagoNomiConstantesFunciones.refrescarForeignKeysDescripcionesHistorialPagoNomi(this.historialpagonomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(RubroEmplea.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//historialpagonomiLogic.setHistorialPagoNomis(this.historialpagonomis);
			historialpagonomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public HistorialPagoNomiParameterReturnGeneral getHistorialPagoNomiParameterGeneral() {
		return this.historialpagonomiParameterGeneral;
	}
	
	public void setHistorialPagoNomiParameterGeneral(HistorialPagoNomiParameterReturnGeneral historialpagonomiParameterGeneral) {
		this.historialpagonomiParameterGeneral = historialpagonomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoHistorialPagoNomi() {
		return isPermisoTodoHistorialPagoNomi;
	}

	public void setIsPermisoTodoHistorialPagoNomi(Boolean isPermisoTodoHistorialPagoNomi) {
		this.isPermisoTodoHistorialPagoNomi = isPermisoTodoHistorialPagoNomi;
	}

	public Boolean getIsPermisoNuevoHistorialPagoNomi() {
		return isPermisoNuevoHistorialPagoNomi;
	}

	public void setIsPermisoNuevoHistorialPagoNomi(Boolean isPermisoNuevoHistorialPagoNomi) {
		this.isPermisoNuevoHistorialPagoNomi = isPermisoNuevoHistorialPagoNomi;
	}

	public Boolean getIsPermisoActualizarHistorialPagoNomi() {
		return isPermisoActualizarHistorialPagoNomi;
	}

	public void setIsPermisoActualizarHistorialPagoNomi(Boolean isPermisoActualizarHistorialPagoNomi) {
		this.isPermisoActualizarHistorialPagoNomi = isPermisoActualizarHistorialPagoNomi;
	}

	public Boolean getIsPermisoEliminarHistorialPagoNomi() {
		return isPermisoEliminarHistorialPagoNomi;
	}

	public void setIsPermisoEliminarHistorialPagoNomi(Boolean isPermisoEliminarHistorialPagoNomi) {
		this.isPermisoEliminarHistorialPagoNomi = isPermisoEliminarHistorialPagoNomi;
	}

	public Boolean getIsPermisoGuardarCambiosHistorialPagoNomi() {
		return isPermisoGuardarCambiosHistorialPagoNomi;
	}

	public void setIsPermisoGuardarCambiosHistorialPagoNomi(Boolean isPermisoGuardarCambiosHistorialPagoNomi) {
		this.isPermisoGuardarCambiosHistorialPagoNomi = isPermisoGuardarCambiosHistorialPagoNomi;
	}
	
	public Boolean getIsPermisoConsultaHistorialPagoNomi() {
		return isPermisoConsultaHistorialPagoNomi;
	}

	public void setIsPermisoConsultaHistorialPagoNomi(Boolean isPermisoConsultaHistorialPagoNomi) {
		this.isPermisoConsultaHistorialPagoNomi = isPermisoConsultaHistorialPagoNomi;
	}

	public Boolean getIsPermisoBusquedaHistorialPagoNomi() {
		return isPermisoBusquedaHistorialPagoNomi;
	}

	public void setIsPermisoBusquedaHistorialPagoNomi(Boolean isPermisoBusquedaHistorialPagoNomi) {
		this.isPermisoBusquedaHistorialPagoNomi = isPermisoBusquedaHistorialPagoNomi;
	}

	public Boolean getIsPermisoReporteHistorialPagoNomi() {
		return isPermisoReporteHistorialPagoNomi;
	}

	public void setIsPermisoReporteHistorialPagoNomi(Boolean isPermisoReporteHistorialPagoNomi) {
		this.isPermisoReporteHistorialPagoNomi = isPermisoReporteHistorialPagoNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioHistorialPagoNomi() {
		return isPermisoPaginacionMedioHistorialPagoNomi;
	}

	public void setIsPermisoPaginacionMedioHistorialPagoNomi(Boolean isPermisoPaginacionMedioHistorialPagoNomi) {
		this.isPermisoPaginacionMedioHistorialPagoNomi = isPermisoPaginacionMedioHistorialPagoNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoHistorialPagoNomi() {
		return isPermisoPaginacionTodoHistorialPagoNomi;
	}

	public void setIsPermisoPaginacionTodoHistorialPagoNomi(Boolean isPermisoPaginacionTodoHistorialPagoNomi) {
		this.isPermisoPaginacionTodoHistorialPagoNomi = isPermisoPaginacionTodoHistorialPagoNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoHistorialPagoNomi() {
		return isPermisoPaginacionAltoHistorialPagoNomi;
	}

	public void setIsPermisoPaginacionAltoHistorialPagoNomi(Boolean isPermisoPaginacionAltoHistorialPagoNomi) {
		this.isPermisoPaginacionAltoHistorialPagoNomi = isPermisoPaginacionAltoHistorialPagoNomi;
	}
	
	public Boolean getIsPermisoCopiarHistorialPagoNomi() {
		return isPermisoCopiarHistorialPagoNomi;
	}

	public void setIsPermisoCopiarHistorialPagoNomi(Boolean isPermisoCopiarHistorialPagoNomi) {
		this.isPermisoCopiarHistorialPagoNomi = isPermisoCopiarHistorialPagoNomi;
	}
	
	public Boolean getIsPermisoVerFormHistorialPagoNomi() {
		return isPermisoVerFormHistorialPagoNomi;
	}

	public void setIsPermisoVerFormHistorialPagoNomi(Boolean isPermisoVerFormHistorialPagoNomi) {
		this.isPermisoVerFormHistorialPagoNomi = isPermisoVerFormHistorialPagoNomi;
	}
	
	public Boolean getIsPermisoDuplicarHistorialPagoNomi() {
		return isPermisoDuplicarHistorialPagoNomi;
	}

	public void setIsPermisoDuplicarHistorialPagoNomi(Boolean isPermisoDuplicarHistorialPagoNomi) {
		this.isPermisoDuplicarHistorialPagoNomi = isPermisoDuplicarHistorialPagoNomi;
	}
	
	public Boolean getIsPermisoOrdenHistorialPagoNomi() {
		return isPermisoOrdenHistorialPagoNomi;
	}

	public void setIsPermisoOrdenHistorialPagoNomi(Boolean isPermisoOrdenHistorialPagoNomi) {
		this.isPermisoOrdenHistorialPagoNomi = isPermisoOrdenHistorialPagoNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoHistorialPagoNomi() {
		return isVisibilidadCeldaNuevoHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaNuevoHistorialPagoNomi(Boolean isVisibilidadCeldaNuevoHistorialPagoNomi) {
		this.isVisibilidadCeldaNuevoHistorialPagoNomi = isVisibilidadCeldaNuevoHistorialPagoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarHistorialPagoNomi() {
		return isVisibilidadCeldaDuplicarHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaDuplicarHistorialPagoNomi(Boolean isVisibilidadCeldaDuplicarHistorialPagoNomi) {
		this.isVisibilidadCeldaDuplicarHistorialPagoNomi = isVisibilidadCeldaDuplicarHistorialPagoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarHistorialPagoNomi() {
		return isVisibilidadCeldaCopiarHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaCopiarHistorialPagoNomi(Boolean isVisibilidadCeldaCopiarHistorialPagoNomi) {
		this.isVisibilidadCeldaCopiarHistorialPagoNomi = isVisibilidadCeldaCopiarHistorialPagoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormHistorialPagoNomi() {
		return isVisibilidadCeldaVerFormHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaVerFormHistorialPagoNomi(Boolean isVisibilidadCeldaVerFormHistorialPagoNomi) {
		this.isVisibilidadCeldaVerFormHistorialPagoNomi = isVisibilidadCeldaVerFormHistorialPagoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenHistorialPagoNomi() {
		return isVisibilidadCeldaOrdenHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaOrdenHistorialPagoNomi(Boolean isVisibilidadCeldaOrdenHistorialPagoNomi) {
		this.isVisibilidadCeldaOrdenHistorialPagoNomi = isVisibilidadCeldaOrdenHistorialPagoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesHistorialPagoNomi() {
		return isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesHistorialPagoNomi(Boolean isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi) {
		this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi = isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarHistorialPagoNomi() {
		return isVisibilidadCeldaModificarHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaModificarHistorialPagoNomi(Boolean isVisibilidadCeldaModificarHistorialPagoNomi) {
		this.isVisibilidadCeldaModificarHistorialPagoNomi = isVisibilidadCeldaModificarHistorialPagoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarHistorialPagoNomi() {
		return isVisibilidadCeldaActualizarHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaActualizarHistorialPagoNomi(Boolean isVisibilidadCeldaActualizarHistorialPagoNomi) {
		this.isVisibilidadCeldaActualizarHistorialPagoNomi = isVisibilidadCeldaActualizarHistorialPagoNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarHistorialPagoNomi() {
		return isVisibilidadCeldaEliminarHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaEliminarHistorialPagoNomi(Boolean isVisibilidadCeldaEliminarHistorialPagoNomi) {
		this.isVisibilidadCeldaEliminarHistorialPagoNomi = isVisibilidadCeldaEliminarHistorialPagoNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarHistorialPagoNomi() {
		return isVisibilidadCeldaCancelarHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaCancelarHistorialPagoNomi(Boolean isVisibilidadCeldaCancelarHistorialPagoNomi) {
		this.isVisibilidadCeldaCancelarHistorialPagoNomi = isVisibilidadCeldaCancelarHistorialPagoNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarHistorialPagoNomi() {
		return isVisibilidadCeldaGuardarHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaGuardarHistorialPagoNomi(Boolean isVisibilidadCeldaGuardarHistorialPagoNomi) {
		this.isVisibilidadCeldaGuardarHistorialPagoNomi = isVisibilidadCeldaGuardarHistorialPagoNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosHistorialPagoNomi() {
		return isVisibilidadCeldaGuardarCambiosHistorialPagoNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosHistorialPagoNomi(Boolean isVisibilidadCeldaGuardarCambiosHistorialPagoNomi) {
		this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi = isVisibilidadCeldaGuardarCambiosHistorialPagoNomi;
	}
		
	public HistorialPagoNomiSessionBean gethistorialpagonomiSessionBean() {
		return this.historialpagonomiSessionBean;
	}
	
	public void sethistorialpagonomiSessionBean(HistorialPagoNomiSessionBean historialpagonomiSessionBean) {
		this.historialpagonomiSessionBean=historialpagonomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEmpleado() {
		return this.isVisibilidadFK_IdEmpleado;
	}

	public void setisVisibilidadFK_IdEmpleado(Boolean isVisibilidadFK_IdEmpleado) {
		this.isVisibilidadFK_IdEmpleado=isVisibilidadFK_IdEmpleado;
	}

	public Boolean getisVisibilidadFK_IdEmpresa() {
		return this.isVisibilidadFK_IdEmpresa;
	}

	public void setisVisibilidadFK_IdEmpresa(Boolean isVisibilidadFK_IdEmpresa) {
		this.isVisibilidadFK_IdEmpresa=isVisibilidadFK_IdEmpresa;
	}

	public Boolean getisVisibilidadFK_IdEstructura() {
		return this.isVisibilidadFK_IdEstructura;
	}

	public void setisVisibilidadFK_IdEstructura(Boolean isVisibilidadFK_IdEstructura) {
		this.isVisibilidadFK_IdEstructura=isVisibilidadFK_IdEstructura;
	}

	public Boolean getisVisibilidadFK_IdMes() {
		return this.isVisibilidadFK_IdMes;
	}

	public void setisVisibilidadFK_IdMes(Boolean isVisibilidadFK_IdMes) {
		this.isVisibilidadFK_IdMes=isVisibilidadFK_IdMes;
	}

	public Boolean getisVisibilidadFK_IdRubroEmplea() {
		return this.isVisibilidadFK_IdRubroEmplea;
	}

	public void setisVisibilidadFK_IdRubroEmplea(Boolean isVisibilidadFK_IdRubroEmplea) {
		this.isVisibilidadFK_IdRubroEmplea=isVisibilidadFK_IdRubroEmplea;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(HistorialPagoNomi historialpagonomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(historialpagonomi,null);
				this.setActualParaGuardarEstructuraForeignKey(historialpagonomi,null);
				this.setActualParaGuardarEmpleadoForeignKey(historialpagonomi,null);
				this.setActualParaGuardarRubroEmpleaForeignKey(historialpagonomi,null);
				this.setActualParaGuardarMesForeignKey(historialpagonomi,null);
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
	
	public void bugActualizarReferenciaActual(HistorialPagoNomi historialpagonomi,HistorialPagoNomi historialpagonomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalHistorialPagoNomi(historialpagonomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		historialpagonomiAux.setId(historialpagonomi.getId());
		historialpagonomiAux.setVersionRow(historialpagonomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessHistorialPagoNomi();
		
			int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = historialpagonomiValidator.getInvalidValues(this.historialpagonomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			historialpagonomiLogic.setDatosCliente(datosCliente);
			historialpagonomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				historialpagonomiAux=new  HistorialPagoNomi();
				
				historialpagonomiAux.setIsNew(true);
				historialpagonomiAux.setIsChanged(true);
				
				historialpagonomiAux.setHistorialPagoNomiOriginal(this.historialpagonomi);
				
				historialpagonomiAux.setId(this.historialpagonomi.getId());	
				historialpagonomiAux.setVersionRow(this.historialpagonomi.getVersionRow());	
				historialpagonomiAux.setid_empresa(this.historialpagonomi.getid_empresa());	
				historialpagonomiAux.setid_estructura(this.historialpagonomi.getid_estructura());	
				historialpagonomiAux.setid_empleado(this.historialpagonomi.getid_empleado());	
				historialpagonomiAux.setid_rubro_emplea(this.historialpagonomi.getid_rubro_emplea());	
				historialpagonomiAux.setid_mes(this.historialpagonomi.getid_mes());	
				historialpagonomiAux.setvalor(this.historialpagonomi.getvalor());	
				historialpagonomiAux.setfecha(this.historialpagonomi.getfecha());	
				historialpagonomiAux.setfecha_liquidacion(this.historialpagonomi.getfecha_liquidacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialpagonomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(historialpagonomiAux,historialpagonomiLogic.getHistorialPagoNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialpagonomiAux,historialpagonomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialpagonomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomiLogic.saveHistorialPagoNomis();//WithConnection
						//historialpagonomiLogic.getSetVersionRowHistorialPagoNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.historialpagonomi,historialpagonomiAux);
					
					this.refrescarForeignKeysDescripcionesHistorialPagoNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialpagonomiLogic.saveHistorialPagoNomiRelaciones(historialpagonomiAux);//WithConnection
								//historialpagonomiLogic.getSetVersionRowHistorialPagoNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.historialpagonomi,historialpagonomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.historialpagonomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(historialpagonomiAux,historialpagonomiLogic.getHistorialPagoNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(historialpagonomiAux,historialpagonomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.historialpagonomi,historialpagonomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				historialpagonomiAux=new  HistorialPagoNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado() 
					|| (this.historialpagonomiSessionBean.getEsGuardarRelacionado() && this.historialpagonomi.getId()>=0)) {
						
					historialpagonomiAux.setIsNew(false);
				}
				
				historialpagonomiAux.setIsDeleted(false);
			
				historialpagonomiAux.setId(this.historialpagonomi.getId());	
				historialpagonomiAux.setVersionRow(this.historialpagonomi.getVersionRow());	
				historialpagonomiAux.setid_empresa(this.historialpagonomi.getid_empresa());	
				historialpagonomiAux.setid_estructura(this.historialpagonomi.getid_estructura());	
				historialpagonomiAux.setid_empleado(this.historialpagonomi.getid_empleado());	
				historialpagonomiAux.setid_rubro_emplea(this.historialpagonomi.getid_rubro_emplea());	
				historialpagonomiAux.setid_mes(this.historialpagonomi.getid_mes());	
				historialpagonomiAux.setvalor(this.historialpagonomi.getvalor());	
				historialpagonomiAux.setfecha(this.historialpagonomi.getfecha());	
				historialpagonomiAux.setfecha_liquidacion(this.historialpagonomi.getfecha_liquidacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialpagonomiAux,historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialpagonomiAux,historialpagonomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialpagonomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomiLogic.saveHistorialPagoNomis();//WithConnection
						//historialpagonomiLogic.getSetVersionRowHistorialPagoNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.historialpagonomi,historialpagonomiAux);
					
					this.refrescarForeignKeysDescripcionesHistorialPagoNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialpagonomiLogic.saveHistorialPagoNomiRelaciones(historialpagonomiAux);//WithConnection
								//historialpagonomiLogic.getSetVersionRowHistorialPagoNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.historialpagonomi,historialpagonomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.historialpagonomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(historialpagonomiAux,historialpagonomiLogic.getHistorialPagoNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(historialpagonomiAux,historialpagonomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.historialpagonomi,historialpagonomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				historialpagonomiAux=new  HistorialPagoNomi();
				
				historialpagonomiAux.setIsNew(false);
				historialpagonomiAux.setIsChanged(false);
				
				historialpagonomiAux.setIsDeleted(true);
				
				historialpagonomiAux.setId(this.historialpagonomi.getId());	
				historialpagonomiAux.setVersionRow(this.historialpagonomi.getVersionRow());	
				historialpagonomiAux.setid_empresa(this.historialpagonomi.getid_empresa());	
				historialpagonomiAux.setid_estructura(this.historialpagonomi.getid_estructura());	
				historialpagonomiAux.setid_empleado(this.historialpagonomi.getid_empleado());	
				historialpagonomiAux.setid_rubro_emplea(this.historialpagonomi.getid_rubro_emplea());	
				historialpagonomiAux.setid_mes(this.historialpagonomi.getid_mes());	
				historialpagonomiAux.setvalor(this.historialpagonomi.getvalor());	
				historialpagonomiAux.setfecha(this.historialpagonomi.getfecha());	
				historialpagonomiAux.setfecha_liquidacion(this.historialpagonomi.getfecha_liquidacion());	
				
				if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.historialpagonomiAux.getId()>=0) {	
						this.historialpagonomisEliminados.add(historialpagonomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(historialpagonomiAux,historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialpagonomiAux,historialpagonomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialpagonomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomiLogic.saveHistorialPagoNomis();//WithConnection
						//historialpagonomiLogic.getSetVersionRowHistorialPagoNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialpagonomiLogic.saveHistorialPagoNomiRelaciones(historialpagonomiAux);//WithConnection
								//historialpagonomiLogic.getSetVersionRowHistorialPagoNomis();//WithConnection
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
							if(this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.historialpagonomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(historialpagonomiAux,historialpagonomiLogic.getHistorialPagoNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(historialpagonomiAux,historialpagonomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.getHistorialPagoNomis().addAll(this.historialpagonomisEliminados);
					
					historialpagonomiLogic.saveHistorialPagoNomis();//WithConnection
					//historialpagonomiLogic.getSetVersionRowHistorialPagoNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesHistorialPagoNomi();
				
				this.historialpagonomisEliminados= new ArrayList<HistorialPagoNomi>();		
			}
			
			if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Historial Pago Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Historial Pago Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.historialpagonomi=historialpagonomiAux;
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
      		//this.finishProcessHistorialPagoNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(HistorialPagoNomi historialpagonomiLocal) throws Exception {
		
		if(this.historialpagonomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(HistorialPagoNomi historialpagonomiLocal) throws Exception {	
		if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				historialpagonomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				historialpagonomiLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				historialpagonomiLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RubroEmpleaDetalleFormJInternalFrame.class)) {
				RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrameLocal=(RubroEmpleaBeanSwingJInternalFrame) ((RubroEmpleaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rubroempleaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.getrubroemplea(),true);
				rubroempleaBeanSwingJInternalFrameLocal.actualizarLista(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea,this.rubroempleasForeignKey);

				rubroempleaBeanSwingJInternalFrameLocal.actualizarRelaciones(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				historialpagonomiLocal.setRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey("Formulario");
				this.setActualRubroEmpleaForeignKey(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				historialpagonomiLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarHistorialPagoNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = historialpagonomiValidator.getInvalidValues(this.historialpagonomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(HistorialPagoNomi historialpagonomi,List<HistorialPagoNomi> historialpagonomis) throws Exception {
		try	{		
			HistorialPagoNomiConstantesFunciones.actualizarLista(historialpagonomi,historialpagonomis,this.historialpagonomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(HistorialPagoNomi historialpagonomi,List<HistorialPagoNomi> historialpagonomis) throws Exception {
		try	{			
			HistorialPagoNomiConstantesFunciones.actualizarSelectedLista(historialpagonomi,historialpagonomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<HistorialPagoNomi> historialpagonomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				historialpagonomisLocal=this.historialpagonomiLogic.getHistorialPagoNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				historialpagonomisLocal=this.historialpagonomis;
			}
			//ARCHITECTURE
		
			for(HistorialPagoNomi historialpagonomiLocal:historialpagonomisLocal) {
				if(this.permiteMantenimiento(historialpagonomiLocal) && historialpagonomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+HistorialPagoNomiConstantesFunciones.getHistorialPagoNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(HistorialPagoNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelid_empresaHistorialPagoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoNomiConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelid_estructuraHistorialPagoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoNomiConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelid_empleadoHistorialPagoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoNomiConstantesFunciones.IDRUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelid_rubro_empleaHistorialPagoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoNomiConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelid_mesHistorialPagoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoNomiConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelvalorHistorialPagoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoNomiConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelfechaHistorialPagoNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoNomiConstantesFunciones.FECHALIQUIDACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelfecha_liquidacionHistorialPagoNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelid_empresaHistorialPagoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelid_estructuraHistorialPagoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelid_empleadoHistorialPagoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelid_rubro_empleaHistorialPagoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelid_mesHistorialPagoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelvalorHistorialPagoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelfechaHistorialPagoNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelfecha_liquidacionHistorialPagoNomi,"");
		
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
		this.iIdNuevoHistorialPagoNomi--;	
		
		
		this.historialpagonomiAux=new HistorialPagoNomi();
		
		this.historialpagonomiAux.setId(this.iIdNuevoHistorialPagoNomi);
		this.historialpagonomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialpagonomiLogic.getHistorialPagoNomis().add(this.historialpagonomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.historialpagonomis.add(this.historialpagonomiAux);
		}
		//ARCHITECTURE
		
		this.historialpagonomi=this.historialpagonomiAux;
		
		if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioHistorialPagoNomi(this.historialpagonomi);
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialPagoNomi(this.historialpagonomi);
		}
				
		//this.setDefaultControlesHistorialPagoNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyHistorialPagoNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyHistorialPagoNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialPagoNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialPagoNomi(this.historialpagonomiBean,this.historialpagonomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.historialpagonomiSessionBean.getConGuardarRelaciones()) {
			classes=HistorialPagoNomiConstantesFunciones.getClassesRelationshipsOfHistorialPagoNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.historialpagonomiReturnGeneral=historialpagonomiLogic.procesarEventosHistorialPagoNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialpagonomiLogic.getHistorialPagoNomis(),this.historialpagonomi,this.historialpagonomiParameterGeneral,this.isEsNuevoHistorialPagoNomi,classes);//this.historialpagonomiLogic.getHistorialPagoNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanHistorialPagoNomi(this.historialpagonomiReturnGeneral,this.historialpagonomiBean,false);
		
		if(this.historialpagonomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialPagoNomi(this.historialpagonomiReturnGeneral.getHistorialPagoNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioHistorialPagoNomi(this.historialpagonomiReturnGeneral.getHistorialPagoNomi());
		}
		
		if(this.historialpagonomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioHistorialPagoNomi(this.historialpagonomiReturnGeneral.getHistorialPagoNomi(),classes);//this.historialpagonomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyHistorialPagoNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyHistorialPagoNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.RecargarFormHistorialPagoNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingHistorialPagoNomi(false);
						
			if(historialpagonomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialPagoNomi();
			}
			
			this.actualizarVisualTableDatosHistorialPagoNomi();
			
			this.jTableDatosHistorialPagoNomi.setRowSelectionInterval(this.getIndiceNuevoHistorialPagoNomi(), this.getIndiceNuevoHistorialPagoNomi());
			
			this.seleccionarFilaTablaHistorialPagoNomiActual();
						
			this.actualizarEstadoCeldasBotonesHistorialPagoNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesHistorialPagoNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jTextFieldvalorHistorialPagoNomi.setEnabled(isHabilitar && this.historialpagonomiConstantesFunciones.activarvalorHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfechaHistorialPagoNomi.setEnabled(isHabilitar && this.historialpagonomiConstantesFunciones.activarfechaHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfecha_liquidacionHistorialPagoNomi.setEnabled(isHabilitar && this.historialpagonomiConstantesFunciones.activarfecha_liquidacionHistorialPagoNomi);	
		//
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.setEnabled(isHabilitar && this.historialpagonomiConstantesFunciones.activarid_empresaHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.setEnabled(isHabilitar && this.historialpagonomiConstantesFunciones.activarid_estructuraHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.setEnabled(isHabilitar && this.historialpagonomiConstantesFunciones.activarid_empleadoHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.setEnabled(isHabilitar && this.historialpagonomiConstantesFunciones.activarid_rubro_empleaHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.setEnabled(isHabilitar && this.historialpagonomiConstantesFunciones.activarid_mesHistorialPagoNomi);
	};
	
	public void setDefaultControlesHistorialPagoNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoHistorialPagoNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.historialpagonomiSessionBean.setConGuardarRelaciones(true);			
			this.historialpagonomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormHistorialPagoNomi.jTabbedPaneRelacionesHistorialPagoNomi.setVisible(true);
			
					
		} else {
			//this.historialpagonomiSessionBean.setConGuardarRelaciones(false);			
			this.historialpagonomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormHistorialPagoNomi.jTabbedPaneRelacionesHistorialPagoNomi.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoHistorialPagoNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomiLogic.getHistorialPagoNomis()) {
				if(historialpagonomiAux.getId().equals(this.iIdNuevoHistorialPagoNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomis) {
				if(historialpagonomiAux.getId().equals(this.iIdNuevoHistorialPagoNomi)) {
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
	
	public int getIndiceActualHistorialPagoNomi(HistorialPagoNomi historialpagonomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomiLogic.getHistorialPagoNomis()) {
				if(historialpagonomiAux.getId().equals(historialpagonomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomis) {
				if(historialpagonomiAux.getId().equals(historialpagonomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalHistorialPagoNomi(HistorialPagoNomi historialpagonomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomiLogic.getHistorialPagoNomis()) {
				if(historialpagonomiAux.getHistorialPagoNomiOriginal().getId().equals(historialpagonomiOriginal.getId())) {
					existe=true;
					historialpagonomiOriginal.setId(historialpagonomiAux.getId());
					historialpagonomiOriginal.setVersionRow(historialpagonomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomis) {
				if(historialpagonomiAux.getHistorialPagoNomiOriginal().getId().equals(historialpagonomiOriginal.getId())) {
					existe=true;
					historialpagonomiOriginal.setId(historialpagonomiAux.getId());
					historialpagonomiOriginal.setVersionRow(historialpagonomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosHistorialPagoNomi(Boolean esParaCancelar) throws Exception {
		historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
		historialpagonomiAux=new HistorialPagoNomi();
		
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomiLogic.getHistorialPagoNomis()) {
					if(historialpagonomiAux.getId()<0) {
						historialpagonomisAux.add(historialpagonomiAux);
					}		
				}
				this.iIdNuevoHistorialPagoNomi=0L;
				this.historialpagonomiLogic.getHistorialPagoNomis().removeAll(historialpagonomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomis) {
					if(historialpagonomiAux.getId()<0) {
						historialpagonomisAux.add(historialpagonomiAux);
					}		
				}
				this.iIdNuevoHistorialPagoNomi=0L;
				this.historialpagonomis.removeAll(historialpagonomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoHistorialPagoNomi 
					&& this.historialpagonomiLogic.getHistorialPagoNomis().size()>0
					) {
					historialpagonomiAux=this.historialpagonomiLogic.getHistorialPagoNomis().get(this.historialpagonomiLogic.getHistorialPagoNomis().size() - 1);
				
					if(historialpagonomiAux.getId()<0) {
						this.historialpagonomiLogic.getHistorialPagoNomis().remove(historialpagonomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoHistorialPagoNomi && this.historialpagonomis.size()>0) {
					historialpagonomiAux=this.historialpagonomis.get(this.historialpagonomis.size() - 1);
				
					if(historialpagonomiAux.getId()<0) {
						this.historialpagonomis.remove(historialpagonomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoHistorialPagoNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(historialpagonomi.getId()<0) {
				this.historialpagonomiLogic.getHistorialPagoNomis().remove(this.historialpagonomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(historialpagonomi.getId()<0) {
				this.historialpagonomis.remove(this.historialpagonomi);
			}
		}			
	}
	
	public void setEstadosInicialesHistorialPagoNomi(List<HistorialPagoNomi> historialpagonomisAux) throws Exception {
		HistorialPagoNomiConstantesFunciones.setEstadosInicialesHistorialPagoNomi(historialpagonomisAux);
	}
	
	public void setEstadosInicialesHistorialPagoNomi(HistorialPagoNomi historialpagonomiAux) throws Exception {
		HistorialPagoNomiConstantesFunciones.setEstadosInicialesHistorialPagoNomi(historialpagonomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarHistorialPagoNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesHistorialPagoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarHistorialPagoNomiActual()) {
				if(!this.isEsNuevoHistorialPagoNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesHistorialPagoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoHistorialPagoNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarHistorialPagoNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Historial Pago Nomi ?", "MANTENIMIENTO DE Historial Pago Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesHistorialPagoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(HistorialPagoNomi historialpagonomi) throws Exception {
		HistorialPagoNomiConstantesFunciones.seleccionarAsignar(this.historialpagonomi,historialpagonomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarHistorialPagoNomi=this.isPermisoActualizarOriginalHistorialPagoNomi;
			
			
			this.seleccionarAsignar(historialpagonomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialPagoNomiConstantesFunciones.quitarEspaciosHistorialPagoNomi(this.historialpagonomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesHistorialPagoNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.historialpagonomiSessionBean.setsFuncionBusquedaRapida(this.historialpagonomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoHistorialPagoNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosHistorialPagoNomi(esParaCancelar);				
				this.cancelarNuevoHistorialPagoNomi(esParaCancelar);								
			}
			
			this.historialpagonomi=new HistorialPagoNomi();
			
			this.inicializarHistorialPagoNomi();
			
			this.actualizarEstadoCeldasBotonesHistorialPagoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarHistorialPagoNomi() throws Exception {
		try {
			HistorialPagoNomiConstantesFunciones.inicializarHistorialPagoNomi(this.historialpagonomi);
			
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
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.historialpagonomiLogic.getHistorialPagoNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteHistorialPagoNomis(String sAccionBusqueda,List<HistorialPagoNomi> historialpagonomisParaReportes) throws Exception {
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
					sPathReporteFinal="HistorialPagoNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="HistorialPagoNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("HistorialPagoNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="HistorialPagoNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Historial Pago Nomis");		
		parameters.put("busquedapor", HistorialPagoNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceHistorialPagoNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			HistorialPagoNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			HistorialPagoNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceHistorialPagoNomi=new JRBeanArrayDataSource(HistorialPagoNomiJInternalFrame.TraerHistorialPagoNomiBeans(historialpagonomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceHistorialPagoNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+HistorialPagoNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+HistorialPagoNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(HistorialPagoNomiBean.TraerHistorialPagoNomiBeans(historialpagonomisParaReportes).toArray()));
							
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
				this.generarExcelReporteHistorialPagoNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagonomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalHistorialPagoNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagonomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoHistorialPagoNomiActionPerformed(null);
					//this.generarExcelReporteHistorialPagoNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagonomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalHistorialPagoNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagonomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesHistorialPagoNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagonomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesHistorialPagoNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagonomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHistorialPagoNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialPagoNomi> historialpagonomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagonomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialPagoNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialPagoNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(HistorialPagoNomi historialpagonomi : historialpagonomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			HistorialPagoNomiConstantesFunciones.generarExcelReporteDataHistorialPagoNomi("NORMAL",row,workbook,historialpagonomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderHistorialPagoNomi(String sTipo,Row row,Workbook workbook) {
		
		HistorialPagoNomiConstantesFunciones.generarExcelReporteHeaderHistorialPagoNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalHistorialPagoNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialPagoNomi> historialpagonomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagonomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialPagoNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(HistorialPagoNomi historialpagonomi : historialpagonomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(HistorialPagoNomiConstantesFunciones.getHistorialPagoNomiDescripcion(historialpagonomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagonomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagonomi.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagonomi.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagonomi.getrubroemplea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoNomiConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagonomi.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoNomiConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagonomi.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoNomiConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagonomi.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagonomi.getfecha_liquidacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesHistorialPagoNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialPagoNomi> historialpagonomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<HistorialPagoNomi> historialpagonomisRespaldo=null;
		
		classes=HistorialPagoNomiConstantesFunciones.getClassesRelationshipsOfHistorialPagoNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.historialpagonomiLogic.setDatosCliente(this.datosCliente);
		this.historialpagonomiLogic.setDatosDeep(this.datosDeep);
		this.historialpagonomiLogic.setIsConDeep(true);
		
		historialpagonomisRespaldo=this.historialpagonomiLogic.getHistorialPagoNomis();
		
		this.historialpagonomiLogic.setHistorialPagoNomis(historialpagonomisParaReportes);	
		this.historialpagonomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		historialpagonomisParaReportes=this.historialpagonomiLogic.getHistorialPagoNomis();
		this.historialpagonomiLogic.setHistorialPagoNomis(historialpagonomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagonomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialPagoNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialPagoNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(HistorialPagoNomi historialpagonomi : historialpagonomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderHistorialPagoNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			HistorialPagoNomiConstantesFunciones.generarExcelReporteDataHistorialPagoNomi("NORMAL",row,workbook,historialpagonomi,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(HistorialPagoNomiConstantesFunciones.getHistorialPagoNomiDescripcion(historialpagonomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessHistorialPagoNomi() throws Exception {		
		this.startProcessHistorialPagoNomi(true);
	}
	
	public void startProcessHistorialPagoNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasHistorialPagoNomi ,this.jPanelParametrosReportesHistorialPagoNomi, this.jScrollPanelDatosHistorialPagoNomi,this.jPanelPaginacionHistorialPagoNomi, this.jScrollPanelDatosEdicionHistorialPagoNomi, this.jPanelAccionesHistorialPagoNomi,this.jPanelAccionesFormularioHistorialPagoNomi,this.jmenuBarHistorialPagoNomi,this.jmenuBarDetalleHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,this.jTtoolBarDetalleHistorialPagoNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialPagoNomi=this.jTabbedPaneBusquedasHistorialPagoNomi; 
		
		final JPanel jPanelParametrosReportesHistorialPagoNomi=this.jPanelParametrosReportesHistorialPagoNomi;
		//final JScrollPane jScrollPanelDatosHistorialPagoNomi=this.jScrollPanelDatosHistorialPagoNomi;
		final JTable jTableDatosHistorialPagoNomi=this.jTableDatosHistorialPagoNomi;		
		final JPanel jPanelPaginacionHistorialPagoNomi=this.jPanelPaginacionHistorialPagoNomi;
		//final JScrollPane jScrollPanelDatosEdicionHistorialPagoNomi=this.jScrollPanelDatosEdicionHistorialPagoNomi;
		final JPanel jPanelAccionesHistorialPagoNomi=this.jPanelAccionesHistorialPagoNomi;
		
		JPanel jPanelCamposAuxiliarHistorialPagoNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarHistorialPagoNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			jPanelCamposAuxiliarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelCamposHistorialPagoNomi;
			jPanelAccionesFormularioAuxiliarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelAccionesFormularioHistorialPagoNomi;
		}
		
		final JPanel jPanelCamposHistorialPagoNomi=jPanelCamposAuxiliarHistorialPagoNomi;
		final JPanel jPanelAccionesFormularioHistorialPagoNomi=jPanelAccionesFormularioAuxiliarHistorialPagoNomi;
		
		
		final JMenuBar jmenuBarHistorialPagoNomi=this.jmenuBarHistorialPagoNomi;
		final JToolBar jTtoolBarHistorialPagoNomi=this.jTtoolBarHistorialPagoNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarHistorialPagoNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialPagoNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			jmenuBarDetalleAuxiliarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jmenuBarDetalleHistorialPagoNomi;
			jTtoolBarDetalleAuxiliarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jTtoolBarDetalleHistorialPagoNomi;
		}
		
		final JMenuBar jmenuBarDetalleHistorialPagoNomi=jmenuBarDetalleAuxiliarHistorialPagoNomi;
		final JToolBar jTtoolBarDetalleHistorialPagoNomi=jTtoolBarDetalleAuxiliarHistorialPagoNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialPagoNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialPagoNomi;
			processRunnable.jTableDatos=jTableDatosHistorialPagoNomi;
			processRunnable.jPanelCampos=jPanelCamposHistorialPagoNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialPagoNomi;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialPagoNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialPagoNomi;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialPagoNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialPagoNomi;
			processRunnable.jTtoolBar=jTtoolBarHistorialPagoNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialPagoNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialPagoNomi ,jPanelParametrosReportesHistorialPagoNomi,jTableDatosHistorialPagoNomi, /*jScrollPanelDatosHistorialPagoNomi,*/jPanelCamposHistorialPagoNomi,jPanelPaginacionHistorialPagoNomi, /*jScrollPanelDatosEdicionHistorialPagoNomi,*/ jPanelAccionesHistorialPagoNomi,jPanelAccionesFormularioHistorialPagoNomi,jmenuBarHistorialPagoNomi,jmenuBarDetalleHistorialPagoNomi,jTtoolBarHistorialPagoNomi,jTtoolBarDetalleHistorialPagoNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialPagoNomi ,jPanelParametrosReportesHistorialPagoNomi, jScrollPanelDatosHistorialPagoNomi,jPanelPaginacionHistorialPagoNomi, jScrollPanelDatosEdicionHistorialPagoNomi, jPanelAccionesHistorialPagoNomi,jPanelAccionesFormularioHistorialPagoNomi,jmenuBarHistorialPagoNomi,jmenuBarDetalleHistorialPagoNomi,jTtoolBarHistorialPagoNomi,jTtoolBarDetalleHistorialPagoNomi);
						
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
	
	public void finishProcessHistorialPagoNomi() {// throws Exception 
		this.finishProcessHistorialPagoNomi(true);
	}
	
	public void finishProcessHistorialPagoNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasHistorialPagoNomi ,this.jPanelParametrosReportesHistorialPagoNomi, this.jScrollPanelDatosHistorialPagoNomi,this.jPanelPaginacionHistorialPagoNomi, this.jScrollPanelDatosEdicionHistorialPagoNomi, this.jPanelAccionesHistorialPagoNomi,this.jPanelAccionesFormularioHistorialPagoNomi,this.jmenuBarHistorialPagoNomi,this.jmenuBarDetalleHistorialPagoNomi,this.jTtoolBarHistorialPagoNomi,this.jTtoolBarDetalleHistorialPagoNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialPagoNomi=this.jTabbedPaneBusquedasHistorialPagoNomi; 
		
		final JPanel jPanelParametrosReportesHistorialPagoNomi=this.jPanelParametrosReportesHistorialPagoNomi;
		//final JScrollPane jScrollPanelDatosHistorialPagoNomi=this.jScrollPanelDatosHistorialPagoNomi;
		final JTable jTableDatosHistorialPagoNomi=this.jTableDatosHistorialPagoNomi;		
		final JPanel jPanelPaginacionHistorialPagoNomi=this.jPanelPaginacionHistorialPagoNomi;
		//final JScrollPane jScrollPanelDatosEdicionHistorialPagoNomi=this.jScrollPanelDatosEdicionHistorialPagoNomi;
		final JPanel jPanelAccionesHistorialPagoNomi=this.jPanelAccionesHistorialPagoNomi;
		
		JPanel jPanelCamposAuxiliarHistorialPagoNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarHistorialPagoNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			jPanelCamposAuxiliarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelCamposHistorialPagoNomi;
			jPanelAccionesFormularioAuxiliarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelAccionesFormularioHistorialPagoNomi;
		}
		
		final JPanel jPanelCamposHistorialPagoNomi=jPanelCamposAuxiliarHistorialPagoNomi;
		final JPanel jPanelAccionesFormularioHistorialPagoNomi=jPanelAccionesFormularioAuxiliarHistorialPagoNomi;
		
		
		final JMenuBar jmenuBarHistorialPagoNomi=this.jmenuBarHistorialPagoNomi;		
		final JToolBar jTtoolBarHistorialPagoNomi=this.jTtoolBarHistorialPagoNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarHistorialPagoNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialPagoNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			jmenuBarDetalleAuxiliarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jmenuBarDetalleHistorialPagoNomi;
			jTtoolBarDetalleAuxiliarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jTtoolBarDetalleHistorialPagoNomi;		
		}
		
		final JMenuBar jmenuBarDetalleHistorialPagoNomi=jmenuBarDetalleAuxiliarHistorialPagoNomi;
		final JToolBar jTtoolBarDetalleHistorialPagoNomi=jTtoolBarDetalleAuxiliarHistorialPagoNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialPagoNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialPagoNomi;
			processRunnable.jTableDatos=jTableDatosHistorialPagoNomi;
			processRunnable.jPanelCampos=jPanelCamposHistorialPagoNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialPagoNomi;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialPagoNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialPagoNomi;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialPagoNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialPagoNomi;
			processRunnable.jTtoolBar=jTtoolBarHistorialPagoNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialPagoNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasHistorialPagoNomi ,jPanelParametrosReportesHistorialPagoNomi, jTableDatosHistorialPagoNomi,/*jScrollPanelDatosHistorialPagoNomi,*/jPanelCamposHistorialPagoNomi,jPanelPaginacionHistorialPagoNomi, /*jScrollPanelDatosEdicionHistorialPagoNomi,*/ jPanelAccionesHistorialPagoNomi,jPanelAccionesFormularioHistorialPagoNomi,jmenuBarHistorialPagoNomi,jmenuBarDetalleHistorialPagoNomi,jTtoolBarHistorialPagoNomi,jTtoolBarDetalleHistorialPagoNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesHistorialPagoNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarHistorialPagoNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuHistorialPagoNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarHistorialPagoNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarHistorialPagoNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleHistorialPagoNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuHistorialPagoNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarHistorialPagoNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleHistorialPagoNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.historialpagonomiConstantesFunciones.getsFinalQueryHistorialPagoNomi();
		String  finalQueryPaginacionTodos=this.historialpagonomiConstantesFunciones.getsFinalQueryHistorialPagoNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=HistorialPagoNomiConstantesFunciones.getArrayColumnasGlobalesNoHistorialPagoNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=HistorialPagoNomiConstantesFunciones.getArrayColumnasGlobalesHistorialPagoNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,HistorialPagoNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.historialpagonomisEliminados= new ArrayList<HistorialPagoNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessHistorialPagoNomi();
		
				///*HistorialPagoNomiSessionBean*/this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
			
			if(this.historialpagonomiSessionBean==null) {
				this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
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
					this.iNumeroPaginacion=HistorialPagoNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=HistorialPagoNomiConstantesFunciones.getClassesForeignKeysOfHistorialPagoNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/historialpagonomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			historialpagonomisAux= new ArrayList<HistorialPagoNomi>();
			
				
			historialpagonomiLogic.setDatosCliente(this.datosCliente);
			historialpagonomiLogic.setDatosDeep(this.datosDeep);
			historialpagonomiLogic.setIsConDeep(true);
			
			
			historialpagonomiLogic.getHistorialPagoNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					historialpagonomiLogic.getTodosHistorialPagoNomis(finalQueryGlobal,pagination);
					
					//historialpagonomiLogic.getTodosHistorialPagoNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(historialpagonomiLogic.getHistorialPagoNomis()==null|| historialpagonomiLogic.getHistorialPagoNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialpagonomisAux= new ArrayList<HistorialPagoNomi>();
							historialpagonomisAux.addAll(historialpagonomiLogic.getHistorialPagoNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomisAux= new ArrayList<HistorialPagoNomi>();
							historialpagonomisAux.addAll(historialpagonomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialpagonomiLogic.getTodosHistorialPagoNomis(finalQueryGlobal+"",this.pagination);												
							
							//historialpagonomiLogic.getTodosHistorialPagoNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteHistorialPagoNomis("Todos",historialpagonomiLogic.getHistorialPagoNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialpagonomiLogic.setHistorialPagoNomis(new ArrayList<HistorialPagoNomi>());					
							historialpagonomiLogic.getHistorialPagoNomis().addAll(historialpagonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomis=new ArrayList<HistorialPagoNomi>();
							historialpagonomis.addAll(historialpagonomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idHistorialPagoNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idHistorialPagoNomi=this.idActual;
				
				} else if(this.idHistorialPagoNomiActual!=null && this.idHistorialPagoNomiActual!=0L) {
					idHistorialPagoNomi=idHistorialPagoNomiActual;
				}
				
					
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndicePorId(idHistorialPagoNomi);
				
				this.historialpagonomis=new ArrayList<HistorialPagoNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					historialpagonomiLogic.getEntity(idHistorialPagoNomi);
					
					//historialpagonomiLogic.getEntityWithConnection(idHistorialPagoNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagonomiLogic.setHistorialPagoNomis(new ArrayList<HistorialPagoNomi>());
					historialpagonomiLogic.getHistorialPagoNomis().add(historialpagonomiLogic.getHistorialPagoNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagonomis=new ArrayList<HistorialPagoNomi>();
					this.historialpagonomis.add(historialpagonomi);
				}
				
				if(historialpagonomiLogic.getHistorialPagoNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialpagonomiLogic.getHistorialPagoNomisFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialpagonomiLogic.getHistorialPagoNomis()==null||historialpagonomiLogic.getHistorialPagoNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialpagonomis==null|| historialpagonomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
						historialpagonomisAux.addAll(historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
							historialpagonomisAux.addAll(historialpagonomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialpagonomiLogic.getHistorialPagoNomisFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialPagoNomis("FK_IdEmpleado",historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialPagoNomis("FK_IdEmpleado",historialpagonomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomiLogic.setHistorialPagoNomis(new ArrayList<HistorialPagoNomi>());
						historialpagonomiLogic.getHistorialPagoNomis().addAll(historialpagonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomis=new ArrayList<HistorialPagoNomi>();
							historialpagonomis.addAll(historialpagonomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialpagonomiLogic.getHistorialPagoNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialpagonomiLogic.getHistorialPagoNomis()==null||historialpagonomiLogic.getHistorialPagoNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialpagonomis==null|| historialpagonomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
						historialpagonomisAux.addAll(historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
							historialpagonomisAux.addAll(historialpagonomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialpagonomiLogic.getHistorialPagoNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialPagoNomis("FK_IdEmpresa",historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialPagoNomis("FK_IdEmpresa",historialpagonomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomiLogic.setHistorialPagoNomis(new ArrayList<HistorialPagoNomi>());
						historialpagonomiLogic.getHistorialPagoNomis().addAll(historialpagonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomis=new ArrayList<HistorialPagoNomi>();
							historialpagonomis.addAll(historialpagonomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialpagonomiLogic.getHistorialPagoNomisFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialpagonomiLogic.getHistorialPagoNomis()==null||historialpagonomiLogic.getHistorialPagoNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialpagonomis==null|| historialpagonomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
						historialpagonomisAux.addAll(historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
							historialpagonomisAux.addAll(historialpagonomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialpagonomiLogic.getHistorialPagoNomisFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialPagoNomis("FK_IdEstructura",historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialPagoNomis("FK_IdEstructura",historialpagonomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomiLogic.setHistorialPagoNomis(new ArrayList<HistorialPagoNomi>());
						historialpagonomiLogic.getHistorialPagoNomis().addAll(historialpagonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomis=new ArrayList<HistorialPagoNomi>();
							historialpagonomis.addAll(historialpagonomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialpagonomiLogic.getHistorialPagoNomisFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialpagonomiLogic.getHistorialPagoNomis()==null||historialpagonomiLogic.getHistorialPagoNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialpagonomis==null|| historialpagonomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
						historialpagonomisAux.addAll(historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
							historialpagonomisAux.addAll(historialpagonomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialpagonomiLogic.getHistorialPagoNomisFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialPagoNomis("FK_IdMes",historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialPagoNomis("FK_IdMes",historialpagonomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomiLogic.setHistorialPagoNomis(new ArrayList<HistorialPagoNomi>());
						historialpagonomiLogic.getHistorialPagoNomis().addAll(historialpagonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomis=new ArrayList<HistorialPagoNomi>();
							historialpagonomis.addAll(historialpagonomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRubroEmplea")) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialpagonomiLogic.getHistorialPagoNomisFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialpagonomiLogic.getHistorialPagoNomis()==null||historialpagonomiLogic.getHistorialPagoNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialpagonomis==null|| historialpagonomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
						historialpagonomisAux.addAll(historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomisAux=new ArrayList<HistorialPagoNomi>();
							historialpagonomisAux.addAll(historialpagonomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialpagonomiLogic.getHistorialPagoNomisFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoNomiConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialPagoNomis("FK_IdRubroEmplea",historialpagonomiLogic.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialPagoNomis("FK_IdRubroEmplea",historialpagonomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomiLogic.setHistorialPagoNomis(new ArrayList<HistorialPagoNomi>());
						historialpagonomiLogic.getHistorialPagoNomis().addAll(historialpagonomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomis=new ArrayList<HistorialPagoNomi>();
							historialpagonomis.addAll(historialpagonomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesHistorialPagoNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessHistorialPagoNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialpagonomiLogic.getHistorialPagoNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialpagonomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialpagonomiLogic.getHistorialPagoNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialpagonomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(HistorialPagoNomi historialpagonomi) {
		Boolean permite=true;
		
		if(this.historialpagonomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=HistorialPagoNomiConstantesFunciones.getOrderByListaHistorialPagoNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=HistorialPagoNomiConstantesFunciones.getOrderByListaHistorialPagoNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialPagoNomi historialpagonomi:historialpagonomiLogic.getHistorialPagoNomis()) {
				if(historialpagonomi.getsType().equals(Constantes2.S_TOTALES)) {
					historialpagonomiTotales=historialpagonomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialPagoNomi historialpagonomi:this.historialpagonomis) {
				if(historialpagonomi.getsType().equals(Constantes2.S_TOTALES)) {
					historialpagonomiTotales=historialpagonomi;
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
			this.historialpagonomiAux=new HistorialPagoNomi();
			this.historialpagonomiAux.setsType(Constantes2.S_TOTALES);
			this.historialpagonomiAux.setIsNew(false);
			this.historialpagonomiAux.setIsChanged(false);
			this.historialpagonomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				HistorialPagoNomiConstantesFunciones.TotalizarValoresFilaHistorialPagoNomi(this.historialpagonomiLogic.getHistorialPagoNomis(),this.historialpagonomiAux);
				
				this.historialpagonomiLogic.getHistorialPagoNomis().add(this.historialpagonomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				HistorialPagoNomiConstantesFunciones.TotalizarValoresFilaHistorialPagoNomi(this.historialpagonomis,this.historialpagonomiAux);
				
				this.historialpagonomis.add(this.historialpagonomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		historialpagonomiTotales=new HistorialPagoNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialpagonomiLogic.getHistorialPagoNomis().remove(historialpagonomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialpagonomis.remove(historialpagonomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		historialpagonomiTotales=new HistorialPagoNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialPagoNomi historialpagonomi:historialpagonomiLogic.getHistorialPagoNomis()) {
				if(historialpagonomi.getsType().equals(Constantes2.S_TOTALES)) {
					historialpagonomiTotales=historialpagonomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialPagoNomiConstantesFunciones.TotalizarValoresFilaHistorialPagoNomi(this.historialpagonomiLogic.getHistorialPagoNomis(),historialpagonomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialPagoNomi historialpagonomi:this.historialpagonomis) {
				if(historialpagonomi.getsType().equals(Constantes2.S_TOTALES)) {
					historialpagonomiTotales=historialpagonomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialPagoNomiConstantesFunciones.TotalizarValoresFilaHistorialPagoNomi(this.historialpagonomis,historialpagonomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getHistorialPagoNomisFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialPagoNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialPagoNomisFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialPagoNomisFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialPagoNomisFK_IdRubroEmplea()throws Exception {
		try {
			sAccionBusqueda="FK_IdRubroEmplea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getHistorialPagoNomisFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagonomiLogic.getHistorialPagoNomisFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialPagoNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagonomiLogic.getHistorialPagoNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialPagoNomisFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagonomiLogic.getHistorialPagoNomisFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialPagoNomisFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagonomiLogic.getHistorialPagoNomisFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialPagoNomisFK_IdRubroEmplea(String sFinalQuery,Long id_rubro_emplea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagonomiLogic.getHistorialPagoNomisFK_IdRubroEmplea(sFinalQuery,this.pagination,id_rubro_emplea);
				
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
	
	public void inicializarPermisosHistorialPagoNomi() {
		this.isPermisoTodoHistorialPagoNomi=false;
		this.isPermisoNuevoHistorialPagoNomi=false;
		this.isPermisoActualizarHistorialPagoNomi=false;
		this.isPermisoActualizarOriginalHistorialPagoNomi=false;
		this.isPermisoEliminarHistorialPagoNomi=false;
		this.isPermisoGuardarCambiosHistorialPagoNomi=false;
		this.isPermisoConsultaHistorialPagoNomi=false;
		this.isPermisoBusquedaHistorialPagoNomi=false;
		this.isPermisoReporteHistorialPagoNomi=false;		
		this.isPermisoOrdenHistorialPagoNomi=false;		
		this.isPermisoPaginacionMedioHistorialPagoNomi=false;		
		this.isPermisoPaginacionAltoHistorialPagoNomi=false;
		this.isPermisoPaginacionTodoHistorialPagoNomi=false;
		this.isPermisoCopiarHistorialPagoNomi=false;		
		this.isPermisoVerFormHistorialPagoNomi=false;		
		this.isPermisoDuplicarHistorialPagoNomi=false;		
		this.isPermisoOrdenHistorialPagoNomi=false;		
	}
	
	public void setPermisosUsuarioHistorialPagoNomi(Boolean isPermiso) {
		this.isPermisoTodoHistorialPagoNomi=isPermiso;
		this.isPermisoNuevoHistorialPagoNomi=isPermiso;
		this.isPermisoActualizarHistorialPagoNomi=isPermiso;
		this.isPermisoActualizarOriginalHistorialPagoNomi=isPermiso;
		this.isPermisoEliminarHistorialPagoNomi=isPermiso;
		this.isPermisoGuardarCambiosHistorialPagoNomi=isPermiso;
		this.isPermisoConsultaHistorialPagoNomi=isPermiso;
		this.isPermisoBusquedaHistorialPagoNomi=isPermiso;
		this.isPermisoReporteHistorialPagoNomi=isPermiso;
		this.isPermisoOrdenHistorialPagoNomi=isPermiso;		
		this.isPermisoPaginacionMedioHistorialPagoNomi=isPermiso;		
		this.isPermisoPaginacionAltoHistorialPagoNomi=isPermiso;		
		this.isPermisoPaginacionTodoHistorialPagoNomi=isPermiso;		
		this.isPermisoCopiarHistorialPagoNomi=isPermiso;		
		this.isPermisoVerFormHistorialPagoNomi=isPermiso;		
		this.isPermisoDuplicarHistorialPagoNomi=isPermiso;
		this.isPermisoOrdenHistorialPagoNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioHistorialPagoNomi(Boolean isPermiso) {
		//this.isPermisoTodoHistorialPagoNomi=isPermiso;
		this.isPermisoNuevoHistorialPagoNomi=isPermiso;
		this.isPermisoActualizarHistorialPagoNomi=isPermiso;
		this.isPermisoActualizarOriginalHistorialPagoNomi=isPermiso;
		this.isPermisoEliminarHistorialPagoNomi=isPermiso;
		this.isPermisoGuardarCambiosHistorialPagoNomi=isPermiso;
		//this.isPermisoConsultaHistorialPagoNomi=isPermiso;
		//this.isPermisoBusquedaHistorialPagoNomi=isPermiso;
		//this.isPermisoReporteHistorialPagoNomi=isPermiso;
		//this.isPermisoOrdenHistorialPagoNomi=isPermiso;		
		//this.isPermisoPaginacionMedioHistorialPagoNomi=isPermiso;		
		//this.isPermisoPaginacionAltoHistorialPagoNomi=isPermiso;		
		//this.isPermisoPaginacionTodoHistorialPagoNomi=isPermiso;		
		//this.isPermisoCopiarHistorialPagoNomi=isPermiso;		
		//this.isPermisoDuplicarHistorialPagoNomi=isPermiso;
		//this.isPermisoOrdenHistorialPagoNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioHistorialPagoNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(HistorialPagoNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebHistorialPagoNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioHistorialPagoNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioHistorialPagoNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionHistorialPagoNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioHistorialPagoNomiClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioHistorialPagoNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(HistorialPagoNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, HistorialPagoNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoHistorialPagoNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarHistorialPagoNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalHistorialPagoNomi=this.isPermisoActualizarHistorialPagoNomi;
			this.isPermisoEliminarHistorialPagoNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosHistorialPagoNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaHistorialPagoNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaHistorialPagoNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoHistorialPagoNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteHistorialPagoNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialPagoNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioHistorialPagoNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoHistorialPagoNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoHistorialPagoNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarHistorialPagoNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormHistorialPagoNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarHistorialPagoNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialPagoNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosHistorialPagoNomi.setToolTipText(this.jTableDatosHistorialPagoNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioHistorialPagoNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioHistorialPagoNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(HistorialPagoNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(HistorialPagoNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioHistorialPagoNomi() throws Exception {
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
	public void inicializarCombosForeignKeyHistorialPagoNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.rubroempleasForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyHistorialPagoNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(HistorialPagoNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyHistorialPagoNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyEstructuraListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EstructuraConstantesFunciones.SFINALQUERY;

				this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleadoListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=EmpleadoConstantesFunciones.SFINALQUERY;

				this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyRubroEmpleaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=RubroEmpleaConstantesFunciones.SFINALQUERY;

				this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMesListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.messForeignKey==null||this.messForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=MesConstantesFunciones.SFINALQUERY;

				this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyHistorialPagoNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			HistorialPagoNomiParameterReturnGeneral historialpagonomiReturnGeneral=new HistorialPagoNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.historialpagonomiConstantesFunciones.cargarid_empresaHistorialPagoNomi)
					 || (this.esRecargarFks && this.historialpagonomiConstantesFunciones.cargarid_empresaHistorialPagoNomi)) {

					if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+historialpagonomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.historialpagonomiConstantesFunciones.cargarid_estructuraHistorialPagoNomi)
					 || (this.esRecargarFks && this.historialpagonomiConstantesFunciones.cargarid_estructuraHistorialPagoNomi)) {

					if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+historialpagonomiSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.historialpagonomiConstantesFunciones.cargarid_empleadoHistorialPagoNomi)
					 || (this.esRecargarFks && this.historialpagonomiConstantesFunciones.cargarid_empleadoHistorialPagoNomi)) {

					if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+historialpagonomiSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalRubroEmplea="";

				if(((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0) && this.historialpagonomiConstantesFunciones.cargarid_rubro_empleaHistorialPagoNomi)
					 || (this.esRecargarFks && this.historialpagonomiConstantesFunciones.cargarid_rubro_empleaHistorialPagoNomi)) {

					if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRubroEmplea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

						finalQueryGlobalRubroEmplea=Funciones.GetFinalQueryAppend(finalQueryGlobalRubroEmplea, "");
						finalQueryGlobalRubroEmplea+=RubroEmpleaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRubroEmplea=" WHERE " + ConstantesSql.ID + "="+historialpagonomiSessionBean.getlidRubroEmpleaActual();
					}
				} else {
					finalQueryGlobalRubroEmplea="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.historialpagonomiConstantesFunciones.cargarid_mesHistorialPagoNomi)
					 || (this.esRecargarFks && this.historialpagonomiConstantesFunciones.cargarid_mesHistorialPagoNomi)) {

					if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+historialpagonomiSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				historialpagonomiReturnGeneral=historialpagonomiLogic.cargarCombosLoteForeignKeyHistorialPagoNomi(finalQueryGlobalEmpresa,finalQueryGlobalEstructura,finalQueryGlobalEmpleado,finalQueryGlobalRubroEmplea,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=historialpagonomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=historialpagonomiReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=historialpagonomiReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalRubroEmplea.equals("NONE")) {
				this.rubroempleasForeignKey=historialpagonomiReturnGeneral.getrubroempleasForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=historialpagonomiReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyHistorialPagoNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyRubroEmplea();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.historialpagonomiSessionBean==null) {
				this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
			}

			if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
				Estructura estructura=new Estructura();
				EstructuraConstantesFunciones.setEstructuraDescripcion(estructura,Constantes.SMENSAJE_ESCOJA_OPCION);
				estructura.setId(null);

				if(!EstructuraConstantesFunciones.ExisteEnLista(this.estructurasForeignKey,estructura,true)) {

					this.estructurasForeignKey.add(0,estructura);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
				Empleado empleado=new Empleado();
				EmpleadoConstantesFunciones.setEmpleadoDescripcion(empleado,Constantes.SMENSAJE_ESCOJA_OPCION);
				empleado.setId(null);

				if(!EmpleadoConstantesFunciones.ExisteEnLista(this.empleadosForeignKey,empleado,true)) {

					this.empleadosForeignKey.add(0,empleado);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyRubroEmplea()throws Exception {
		try {

			if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
				RubroEmplea rubroemplea=new RubroEmplea();
				RubroEmpleaConstantesFunciones.setRubroEmpleaDescripcion(rubroemplea,Constantes.SMENSAJE_ESCOJA_OPCION);
				rubroemplea.setId(null);

				if(!RubroEmpleaConstantesFunciones.ExisteEnLista(this.rubroempleasForeignKey,rubroemplea,true)) {

					this.rubroempleasForeignKey.add(0,rubroemplea);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.historialpagonomiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
				Mes mes=new Mes();
				MesConstantesFunciones.setMesDescripcion(mes,Constantes.SMENSAJE_ESCOJA_OPCION);
				mes.setId(null);

				if(!MesConstantesFunciones.ExisteEnLista(this.messForeignKey,mes,true)) {

					this.messForeignKey.add(0,mes);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyHistorialPagoNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyHistorialPagoNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyHistorialPagoNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.historialpagonomi.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
				this.historialpagonomi.setfecha_liquidacion(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialPagoNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyHistorialPagoNomi(HistorialPagoNomi historialpagonomi)throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(historialpagonomi.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(historialpagonomi.getid_empleado(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(historialpagonomi.getid_rubro_emplea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyHistorialPagoNomi(HistorialPagoNomi historialpagonomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyHistorialPagoNomi()throws Exception {	
		try {
			
			this.setActualEstructuraForeignKey(this.historialpagonomiConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualEmpleadoForeignKey(this.historialpagonomiConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(this.historialpagonomiConstantesFunciones.getid_rubro_emplea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialPagoNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyHistorialPagoNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyHistorialPagoNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroHistorialPagoNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyHistorialPagoNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyHistorialPagoNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyHistorialPagoNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public HistorialPagoNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public HistorialPagoNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public HistorialPagoNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean(); 
		this.historialpagonomiConstantesFunciones=new HistorialPagoNomiConstantesFunciones(); 
		this.historialpagonomiBean=new HistorialPagoNomi();//(this.historialpagonomiConstantesFunciones); 		
		this.historialpagonomiReturnGeneral=new HistorialPagoNomiParameterReturnGeneral(); 
		
		this.historialpagonomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialpagonomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public HistorialPagoNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public HistorialPagoNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public HistorialPagoNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessHistorialPagoNomi(true);
			
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
			
			this.historialpagonomiConstantesFunciones=new HistorialPagoNomiConstantesFunciones(); 
			this.historialpagonomiBean=new HistorialPagoNomi();//this.historialpagonomiConstantesFunciones); 			
			this.historialpagonomiReturnGeneral=new HistorialPagoNomiParameterReturnGeneral(); 
		
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Pago Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.historialpagonomi=new HistorialPagoNomi();
			this.historialpagonomis = new ArrayList<HistorialPagoNomi>();
			this.historialpagonomisAux = new ArrayList<HistorialPagoNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic=new HistorialPagoNomiLogic();
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}
			
			//this.historialpagonomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.historialpagonomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormHistorialPagoNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoHistorialPagoNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialPagoNomi);	
					}
					
					if(this.jInternalFrameImportacionHistorialPagoNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialPagoNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByHistorialPagoNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByHistorialPagoNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialPagoNomi);
				this.jInternalFrameDetalleFormHistorialPagoNomi.setVisible(false);
				this.jInternalFrameDetalleFormHistorialPagoNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialPagoNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialPagoNomi);
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionHistorialPagoNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionHistorialPagoNomi);
					this.jInternalFrameImportacionHistorialPagoNomi.setVisible(false);
					this.jInternalFrameImportacionHistorialPagoNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByHistorialPagoNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByHistorialPagoNomi);
					this.jInternalFrameOrderByHistorialPagoNomi.setVisible(false);
					this.jInternalFrameOrderByHistorialPagoNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idHistorialPagoNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=HistorialPagoNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.historialpagonomiReturnGeneral=new HistorialPagoNomiParameterReturnGeneral();
			
			this.historialpagonomiParameterGeneral=new HistorialPagoNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.historialpagonomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(HistorialPagoNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialPagoNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialpagonomiSessionBean.getEsGuardarRelacionado(),this.historialpagonomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialPagoNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialpagonomiSessionBean.getEsGuardarRelacionado(),this.historialpagonomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=false;
			this.isVisibilidadCeldaDuplicarHistorialPagoNomi=true;
			this.isVisibilidadCeldaCopiarHistorialPagoNomi=true;
			this.isVisibilidadCeldaVerFormHistorialPagoNomi=true;
			this.isVisibilidadCeldaOrdenHistorialPagoNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=false;
			this.isVisibilidadCeldaModificarHistorialPagoNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=false;
			this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdRubroEmplea=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesHistorialPagoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosHistorialPagoNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioHistorialPagoNomi(false);
			
			this.setPermisosUsuarioHistorialPagoNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado() 
				|| (this.historialpagonomiSessionBean.getEsGuardarRelacionado() && this.historialpagonomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioHistorialPagoNomiClasesRelacionadas();
			}
			
			if(this.historialpagonomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioHistorialPagoNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosHistorialPagoNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualHistorialPagoNomi();
			}
			
			if(!this.isPermisoBusquedaHistorialPagoNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioHistorialPagoNomi,this.isPermisoPaginacionMedioHistorialPagoNomi,this.isPermisoPaginacionTodoHistorialPagoNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(HistorialPagoNomiConstantesFunciones.getTiposSeleccionarHistorialPagoNomi());
				
				this.tiposColumnasSelect=HistorialPagoNomiConstantesFunciones.getTiposSeleccionarHistorialPagoNomi(true);
				
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
			//if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioHistorialPagoNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioHistorialPagoNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioHistorialPagoNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialPagoNomi() ;
			
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
			this.estructuraLogic=new EstructuraLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.rubroempleaLogic=new RubroEmpleaLogic();
			this.mesLogic=new MesLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				historialpagonomiImplementable= (HistorialPagoNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialPagoNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				historialpagonomiImplementableHome= (HistorialPagoNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialPagoNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.historialpagonomis= new ArrayList<HistorialPagoNomi>();
			this.historialpagonomisEliminados= new ArrayList<HistorialPagoNomi>();
						
			this.isEsNuevoHistorialPagoNomi=false;
			this.esParaAccionDesdeFormularioHistorialPagoNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyHistorialPagoNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroHistorialPagoNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=HistorialPagoNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesHistorialPagoNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingHistorialPagoNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioHistorialPagoNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioHistorialPagoNomi();
			}
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasHistorialPagoNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasHistorialPagoNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasHistorialPagoNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessHistorialPagoNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga HistorialPagoNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectHistorialPagoNomi() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesHistorialPagoNomi")) {
				iIndex=this.jInternalFrameDetalleFormHistorialPagoNomi.jTabbedPaneRelacionesHistorialPagoNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormHistorialPagoNomi.jTabbedPaneRelacionesHistorialPagoNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessHistorialPagoNomi();	
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
	
	public void cargarCombosForeignKeyHistorialPagoNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyHistorialPagoNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyHistorialPagoNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyHistorialPagoNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyHistorialPagoNomi();
		
		this.cargarCombosFrameForeignKeyHistorialPagoNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyHistorialPagoNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyHistorialPagoNomi();
		}
	}
	
	

	public void cargarCombosForeignKeyEstructura(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEstructura(this.estructurasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyEmpleado(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaEmpleado(this.empleadosForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyRubroEmplea(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaRubroEmplea(this.rubroempleasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}

	public void cargarCombosForeignKeyMes(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaMes(this.messForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoHistorialPagoNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.historialpagonomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
			
			if(jTableDatosHistorialPagoNomi.getRowCount()>=1) {
				jTableDatosHistorialPagoNomi.removeRowSelectionInterval(0, jTableDatosHistorialPagoNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoHistorialPagoNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoHistorialPagoNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesHistorialPagoNomi(true);			
			//this.historialpagonomi=new HistorialPagoNomi();
			//this.historialpagonomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialPagoNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialPagoNomi() ;
			
			if(HistorialPagoNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialPagoNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.historialpagonomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);				
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
			if(this.historialpagonomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar HistorialPagoNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarHistorialPagoNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosHistorialPagoNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosHistorialPagoNomi.getSelectedRows().length;			
			}
			
			historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoHistorialPagoNomi--;			
				//HistorialPagoNomi historialpagonomiAux= new HistorialPagoNomi();			
				//historialpagonomiAux.setId(this.iIdNuevoHistorialPagoNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//HistorialPagoNomi historialpagonomiOrigen=new HistorialPagoNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(HistorialPagoNomi historialpagonomiOrigen : historialpagonomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							historialpagonomiOrigen =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagonomiOrigen =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaHistorialPagoNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.historialpagonomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosHistorialPagoNomi(historialpagonomiOrigen,this.historialpagonomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialpagonomiLogic.getHistorialPagoNomis().add(this.historialpagonomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialpagonomis.add(this.historialpagonomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
				
				this.jTableDatosHistorialPagoNomi.setRowSelectionInterval(this.getIndiceNuevoHistorialPagoNomi(), this.getIndiceNuevoHistorialPagoNomi());
				
				int iLastRow =  this.jTableDatosHistorialPagoNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialPagoNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialPagoNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();									
		
			HistorialPagoNomi historialpagonomiOrigen=new HistorialPagoNomi();
			HistorialPagoNomi historialpagonomiDestino=new HistorialPagoNomi();
				
			historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosHistorialPagoNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || historialpagonomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosHistorialPagoNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomiOrigen =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialpagonomiOrigen =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagonomiDestino =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialpagonomiDestino =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				historialpagonomiOrigen =historialpagonomisSeleccionados.get(0);
				historialpagonomiDestino =historialpagonomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosHistorialPagoNomi(historialpagonomiOrigen,historialpagonomiDestino,true,false);
				
				historialpagonomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialpagonomiDestino,historialpagonomiLogic.getHistorialPagoNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialpagonomiDestino,historialpagonomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
				
				//this.jTableDatosHistorialPagoNomi.setRowSelectionInterval(this.getIndiceNuevoHistorialPagoNomi(), this.getIndiceNuevoHistorialPagoNomi());
				
				int iLastRow =  this.jTableDatosHistorialPagoNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialPagoNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialPagoNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormHistorialPagoNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesHistorialPagoNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesHistorialPagoNomi.setVisible(!isVisible);
			this.jPanelPaginacionHistorialPagoNomi.setVisible(!isVisible);
			this.jPanelAccionesHistorialPagoNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameHistorialPagoNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoHistorialPagoNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionHistorialPagoNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByHistorialPagoNomi();
			
			this.abrirFrameOrderByHistorialPagoNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByHistorialPagoNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleHistorialPagoNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialPagoNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormHistorialPagoNomi.isMaximum()) {
					this.jInternalFrameDetalleFormHistorialPagoNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormHistorialPagoNomi.setSize(this.jInternalFrameDetalleFormHistorialPagoNomi.iWidthFormulario,this.jInternalFrameDetalleFormHistorialPagoNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormHistorialPagoNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormHistorialPagoNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormHistorialPagoNomi.isMaximum()) {
						this.jInternalFrameDetalleFormHistorialPagoNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormHistorialPagoNomi.jContentPaneDetalleHistorialPagoNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormHistorialPagoNomi.jTabbedPaneRelacionesHistorialPagoNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormHistorialPagoNomi.jContentPaneDetalleHistorialPagoNomi.getWidth(),HistorialPagoNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialPagoNomi.jTabbedPaneRelacionesHistorialPagoNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormHistorialPagoNomi.jContentPaneDetalleHistorialPagoNomi.getWidth(),HistorialPagoNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialPagoNomi.jTabbedPaneRelacionesHistorialPagoNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormHistorialPagoNomi.jContentPaneDetalleHistorialPagoNomi.getWidth(),HistorialPagoNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormHistorialPagoNomi.setVisible(true);
	        this.jInternalFrameDetalleFormHistorialPagoNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByHistorialPagoNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByHistorialPagoNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByHistorialPagoNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialPagoNomi,false,this);
				} else {
					this.jInternalFrameOrderByHistorialPagoNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialPagoNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByHistorialPagoNomi);
				this.jInternalFrameOrderByHistorialPagoNomi.setVisible(false);
				this.jInternalFrameOrderByHistorialPagoNomi.setSelected(false);
				
				this.jInternalFrameOrderByHistorialPagoNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialPagoNomi"));
				
				this.inicializarActualizarBindingTablaOrderByHistorialPagoNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionHistorialPagoNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionHistorialPagoNomi==null) {
				
				this.jInternalFrameImportacionHistorialPagoNomi=new ImportacionJInternalFrame(HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialPagoNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionHistorialPagoNomi);
				this.jInternalFrameImportacionHistorialPagoNomi.setVisible(false);
				this.jInternalFrameImportacionHistorialPagoNomi.setSelected(false);


				this.jInternalFrameImportacionHistorialPagoNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialPagoNomi"));
				this.jInternalFrameImportacionHistorialPagoNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialPagoNomi"));
				this.jInternalFrameImportacionHistorialPagoNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialPagoNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoHistorialPagoNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoHistorialPagoNomi==null) {
				this.jInternalFrameReporteDinamicoHistorialPagoNomi=new ReporteDinamicoJInternalFrame(HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialPagoNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialPagoNomi);
				this.jInternalFrameReporteDinamicoHistorialPagoNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoHistorialPagoNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialPagoNomi"));
				this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialPagoNomi"));
				this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialPagoNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialPagoNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleHistorialPagoNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialPagoNomi);
			
	       	this.jInternalFrameDetalleFormHistorialPagoNomi.setVisible(false);
	        this.jInternalFrameDetalleFormHistorialPagoNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormHistorialPagoNomi.dispose();
			//this.jInternalFrameDetalleFormHistorialPagoNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoHistorialPagoNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoHistorialPagoNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoHistorialPagoNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionHistorialPagoNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionHistorialPagoNomi.setVisible(true);
	        this.jInternalFrameImportacionHistorialPagoNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByHistorialPagoNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByHistorialPagoNomi.setVisible(true);
	        this.jInternalFrameOrderByHistorialPagoNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByHistorialPagoNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByHistorialPagoNomi.setVisible(false);
	        this.jInternalFrameOrderByHistorialPagoNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoHistorialPagoNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoHistorialPagoNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoHistorialPagoNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionHistorialPagoNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionHistorialPagoNomi.setVisible(false);
	        this.jInternalFrameImportacionHistorialPagoNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	

				public void abrirFrameTreeEstructura(String sTipoProceso) { //throws Exception
					try {
						//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
						//this.jDesktopPane.add(jInternalFrameTreeEstructura);
						EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
						estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setsTipoProceso(sTipoProceso);

						if(sTipoProceso.equals("BUSQUEDA_FK")) {
							estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.sTipoBusqueda="Estructura";
						}

						estructuraBeanSwingJInternalFrame.getTodosEstructuraArbol();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setEstructuras(estructuraBeanSwingJInternalFrame.estructurasArbol);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.CargarTreeEstructura();
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setVisible(true);
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.setSelected(true);

						//SE CAMBIA PARENT ORIGINAL PARA QUE RETORNE EN ESTE FORMULARIO
						estructuraBeanSwingJInternalFrame.jInternalFrameTreeEstructura.jInternalFrameParent=this;
						TitledBorder titledBorderHistorialPagoNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoNomi.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderHistorialPagoNomi.getTitle() + " -> Estructura");


						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,estructuraBeanSwingJInternalFrame);
						}
						this.jDesktopPane.add(estructuraBeanSwingJInternalFrame);

					} catch (Exception e) {
						e.getStackTrace();
						//Funciones<%=getFrameworkDomain()%>.manageException(this, e,logger,<%=GetNombreClaseC(TablaBase.ToString())%>ConstantesFunciones.CLASSNAME);
					}
				}

				public void cerrarFrameTreeEstructura(EstructuraBeanSwingJInternalFrame jInternalFrameTreeEstructura) throws Exception {
					try {
						//jDesktopPane.add(jInternalFrameTreeEstructura);
						jInternalFrameTreeEstructura.setVisible(false);
						jInternalFrameTreeEstructura.setSelected(false);
						//jInternalFrameTreeEstructura.dispose();
						//jInternalFrameTreeEstructura=null;
					} catch (final java.beans.PropertyVetoException e) {
						FuncionesSwing.manageException(this, e,logger);
					}
				}
	
	public void jButtonModificarHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarHistorialPagoNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarHistorialPagoNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesHistorialPagoNomi(true);
			//this.isEsNuevoHistorialPagoNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesHistorialPagoNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialPagoNomi(false) ;
			
			if(historialpagonomiSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(HistorialPagoNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialPagoNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialPagoNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaHistorialPagoNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarHistorialPagoNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesHistorialPagoNomi(true);
			//this.isEsNuevoHistorialPagoNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.historialpagonomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesHistorialPagoNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesHistorialPagoNomi(false) ;
			
			if(HistorialPagoNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialPagoNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialPagoNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialPagoNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialPagoNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaRubroEmplea(List<RubroEmplea> rubroempleasForeignKey)throws Exception{
		TableColumn tableColumnRubroEmplea=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA));
		TableCellEditor tableCellEditorRubroEmplea =tableColumnRubroEmplea.getCellEditor();

		RubroEmpleaTableCell rubroempleaTableCellFk=(RubroEmpleaTableCell)tableCellEditorRubroEmplea;

		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.setrubroempleasForeignKey(rubroempleasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialPagoNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//rubroempleaTableCellFk.setRowActual(intSelectedRow);
			//rubroempleaTableCellFk.setrubroempleasForeignKeyActual(rubroempleasForeignKey);
		//}


		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.RecargarRubroEmpleasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialPagoNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesHistorialPagoNomi(false);
			
			//if(!this.isEsNuevoHistorialPagoNomi) {								
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				
			}
			
			if(this.permiteMantenimiento(this.historialpagonomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoHistorialPagoNomi=true;
					this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
					this.isEsNuevoHistorialPagoNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoHistorialPagoNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoHistorialPagoNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialPagoNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialPagoNomi(false);
				
				this.habilitarDeshabilitarControlesHistorialPagoNomi(false);
			
												
				
				if(HistorialPagoNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleHistorialPagoNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoHistorialPagoNomiActionPerformed(evt,historialpagonomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualHistorialPagoNomi(this.historialpagonomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosHistorialPagoNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,historialpagonomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.historialpagonomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				this.historialpagonomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				this.historialpagonomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.historialpagonomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((HistorialPagoNomiModel) this.jTableDatosHistorialPagoNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoHistorialPagoNomi=true;
				this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
				this.isEsNuevoHistorialPagoNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialPagoNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialPagoNomi(false);
				
				this.habilitarDeshabilitarControlesHistorialPagoNomi(false);
				
				
				
				if(HistorialPagoNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleHistorialPagoNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosHistorialPagoNomi.getRowCount()>=1) {
				jTableDatosHistorialPagoNomi.removeRowSelectionInterval(0, jTableDatosHistorialPagoNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesHistorialPagoNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialPagoNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialPagoNomi(false) ;
			
			this.isEsNuevoHistorialPagoNomi=false;
			
			if(HistorialPagoNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleHistorialPagoNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingHistorialPagoNomi(false);
				
				//SI ES MANUAL
				if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualHistorialPagoNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoHistorialPagoNomi--;			
			//HistorialPagoNomi historialpagonomiAux= new HistorialPagoNomi();			
			//historialpagonomiAux.setId(this.iIdNuevoHistorialPagoNomi);
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaHistorialPagoNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
			
			this.historialpagonomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.historialpagonomiLogic.getHistorialPagoNomis().add(this.historialpagonomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.historialpagonomis.add(this.historialpagonomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
			
			this.jTableDatosHistorialPagoNomi.setRowSelectionInterval(this.getIndiceNuevoHistorialPagoNomi(), this.getIndiceNuevoHistorialPagoNomi());
			
			int iLastRow =  this.jTableDatosHistorialPagoNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosHistorialPagoNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosHistorialPagoNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialPagoNomi(false);
			
			//SI ES MANUAL
			if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialPagoNomi();
			}
			
			//this.abrirFrameTreeHistorialPagoNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Historial Pago NomiS ?", "MANTENIMIENTO DE Historial Pago Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionHistorialPagoNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralHistorialPagoNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.historialpagonomiReturnGeneral=historialpagonomiLogic.procesarImportacionHistorialPagoNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.historialpagonomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarHistorialPagoNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionHistorialPagoNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionHistorialPagoNomi.setFileImportacion(this.jInternalFrameImportacionHistorialPagoNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionHistorialPagoNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionHistorialPagoNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionHistorialPagoNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionHistorialPagoNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();		

		historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("HistorialPagoNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"HistorialPagoNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteHistorialPagoNomis("Todos",historialpagonomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RubroEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaLiquidacion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaLiquidacion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaLiquidacion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaLiquidacion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoria="id_rubro_emplea";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION:
					sNombreCampoCategoria="fecha_liquidacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoriaValor="id_rubro_emplea";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION:
					sNombreCampoCategoriaValor="fecha_liquidacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_rubro_emplea");
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Liquacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_liquidacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();		
		
		historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagonomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("HistorialPagoNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(HistorialPagoNomi historialpagonomi:historialpagonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagonomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(HistorialPagoNomi historialpagonomi:historialpagonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagonomi.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(HistorialPagoNomi historialpagonomi:historialpagonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagonomi.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA);
					iRow++;

					for(HistorialPagoNomi historialpagonomi:historialpagonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagonomi.getrubroemplea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(HistorialPagoNomi historialpagonomi:historialpagonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagonomi.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(HistorialPagoNomi historialpagonomi:historialpagonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagonomi.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(HistorialPagoNomi historialpagonomi:historialpagonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagonomi.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION);
					iRow++;

					for(HistorialPagoNomi historialpagonomi:historialpagonomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagonomi.getfecha_liquidacion());
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
			//	this.getFilaCabeceraExportarExcelHistorialPagoNomi(row);				
			//	iRow++;
			//}				
			
			//for(HistorialPagoNomi historialpagonomiAux:historialpagonomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelHistorialPagoNomi(historialpagonomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialPagoNomi(false);
			
			//SI ES MANUAL
			if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialPagoNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialPagoNomi(false);
			
			//SI ES MANUAL
			if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialPagoNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialPagoNomi(false);
			
			//SI ES MANUAL
			if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialPagoNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaHistorialPagoNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosHistorialPagoNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosHistorialPagoNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosHistorialPagoNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosHistorialPagoNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosHistorialPagoNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosHistorialPagoNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosHistorialPagoNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingHistorialPagoNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingHistorialPagoNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingHistorialPagoNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaHistorialPagoNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesHistorialPagoNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasHistorialPagoNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialPagoNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesHistorialPagoNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualHistorialPagoNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaHistorialPagoNomi();
		
		this.inicializarActualizarBindingBotonesManualHistorialPagoNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialPagoNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialPagoNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialPagoNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialPagoNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosHistorialPagoNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosHistorialPagoNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteHistorialPagoNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormHistorialPagoNomi.jCheckBoxPostAccionNuevoHistorialPagoNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormHistorialPagoNomi.jCheckBoxPostAccionSinCerrarHistorialPagoNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormHistorialPagoNomi.jCheckBoxPostAccionSinMensajeHistorialPagoNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosHistorialPagoNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosHistorialPagoNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteHistorialPagoNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
				this.jInternalFrameDetalleFormHistorialPagoNomi.jCheckBoxPostAccionNuevoHistorialPagoNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormHistorialPagoNomi.jCheckBoxPostAccionSinCerrarHistorialPagoNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormHistorialPagoNomi.jCheckBoxPostAccionSinMensajeHistorialPagoNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionHistorialPagoNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionHistorialPagoNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesHistorialPagoNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoHistorialPagoNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesHistorialPagoNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesHistorialPagoNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarHistorialPagoNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesHistorialPagoNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoHistorialPagoNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesHistorialPagoNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralHistorialPagoNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesHistorialPagoNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialPagoNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesHistorialPagoNomi() throws Exception {
		try	{
			if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialPagoNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialPagoNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialPagoNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesHistorialPagoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesHistorialPagoNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesHistorialPagoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesHistorialPagoNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesHistorialPagoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesHistorialPagoNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionHistorialPagoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionHistorialPagoNomi.addItem(reporte);
			}
			
			
			if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionHistorialPagoNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionHistorialPagoNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesHistorialPagoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesHistorialPagoNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesHistorialPagoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesHistorialPagoNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarHistorialPagoNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarHistorialPagoNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarHistorialPagoNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialPagoNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialPagoNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialPagoNomi!=null) {
				this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialPagoNomi!=null) {
				this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoHistorialPagoNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=HistorialPagoNomiConstantesFunciones.getTiposSeleccionarHistorialPagoNomi(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=HistorialPagoNomiConstantesFunciones.getTiposSeleccionarHistorialPagoNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=HistorialPagoNomiConstantesFunciones.getTiposSeleccionarHistorialPagoNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualHistorialPagoNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraHistorialPagoNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesHistorialPagoNomi.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesHistorialPagoNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.getSelectedItem()!=null){this.id_rubro_empleaFK_IdRubroEmplea=((RubroEmplea)this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasHistorialPagoNomi(Boolean esInicializar) throws Exception {				
		if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialPagoNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaHistorialPagoNomi() throws Exception {
		this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByHistorialPagoNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosHistorialPagoNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaHistorialPagoNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=historialpagonomiLogic.getHistorialPagoNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=historialpagonomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosHistorialPagoNomi.setModel(new HistorialPagoNomiModel(this.historialpagonomiLogic.getHistorialPagoNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosHistorialPagoNomi.setModel(new HistorialPagoNomiModel(this.historialpagonomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByHistorialPagoNomi!=null && this.jInternalFrameOrderByHistorialPagoNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByHistorialPagoNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO,historialpagonomiConstantesFunciones.resaltarSeleccionarHistorialPagoNomi,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+HistorialPagoNomiConstantesFunciones.SCLASSWEBTITULO,historialpagonomiConstantesFunciones.resaltarSeleccionarHistorialPagoNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_ID));

		if(this.historialpagonomiConstantesFunciones.mostraridHistorialPagoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialpagonomiConstantesFunciones.resaltaridHistorialPagoNomi,this.historialpagonomiConstantesFunciones.activaridHistorialPagoNomi,iSizeTabla,this,true,"idHistorialPagoNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialpagonomiConstantesFunciones.resaltaridHistorialPagoNomi,this.historialpagonomiConstantesFunciones.activaridHistorialPagoNomi,this,true,"idHistorialPagoNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.historialpagonomiConstantesFunciones.mostrarid_empresaHistorialPagoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.historialpagonomiConstantesFunciones.resaltarid_empresaHistorialPagoNomi,this,this.historialpagonomiConstantesFunciones.activarid_empresaHistorialPagoNomi,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.historialpagonomiConstantesFunciones.resaltarid_empresaHistorialPagoNomi,this,this.historialpagonomiConstantesFunciones.activarid_empresaHistorialPagoNomi,false,"id_empresaHistorialPagoNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.historialpagonomiConstantesFunciones.mostrarid_estructuraHistorialPagoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.historialpagonomiConstantesFunciones.resaltarid_estructuraHistorialPagoNomi,this,this.historialpagonomiConstantesFunciones.activarid_estructuraHistorialPagoNomi,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.historialpagonomiConstantesFunciones.resaltarid_estructuraHistorialPagoNomi,this,this.historialpagonomiConstantesFunciones.activarid_estructuraHistorialPagoNomi,true,"id_estructuraHistorialPagoNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.historialpagonomiConstantesFunciones.mostrarid_empleadoHistorialPagoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.historialpagonomiConstantesFunciones.resaltarid_empleadoHistorialPagoNomi,this,this.historialpagonomiConstantesFunciones.activarid_empleadoHistorialPagoNomi,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.historialpagonomiConstantesFunciones.resaltarid_empleadoHistorialPagoNomi,this,this.historialpagonomiConstantesFunciones.activarid_empleadoHistorialPagoNomi,true,"id_empleadoHistorialPagoNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA));

		if(this.historialpagonomiConstantesFunciones.mostrarid_rubro_empleaHistorialPagoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.historialpagonomiConstantesFunciones.resaltarid_rubro_empleaHistorialPagoNomi,this,this.historialpagonomiConstantesFunciones.activarid_rubro_empleaHistorialPagoNomi,iSizeTabla));
			tableColumn.setCellEditor(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.historialpagonomiConstantesFunciones.resaltarid_rubro_empleaHistorialPagoNomi,this,this.historialpagonomiConstantesFunciones.activarid_rubro_empleaHistorialPagoNomi,true,"id_rubro_empleaHistorialPagoNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_IDMES));

		if(this.historialpagonomiConstantesFunciones.mostrarid_mesHistorialPagoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoNomiConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.historialpagonomiConstantesFunciones.resaltarid_mesHistorialPagoNomi,this,this.historialpagonomiConstantesFunciones.activarid_mesHistorialPagoNomi,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.historialpagonomiConstantesFunciones.resaltarid_mesHistorialPagoNomi,this,this.historialpagonomiConstantesFunciones.activarid_mesHistorialPagoNomi,true,"id_mesHistorialPagoNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_VALOR));

		if(this.historialpagonomiConstantesFunciones.mostrarvalorHistorialPagoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoNomiConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialpagonomiConstantesFunciones.resaltarvalorHistorialPagoNomi,this.historialpagonomiConstantesFunciones.activarvalorHistorialPagoNomi,iSizeTabla,this,true,"valorHistorialPagoNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialpagonomiConstantesFunciones.resaltarvalorHistorialPagoNomi,this.historialpagonomiConstantesFunciones.activarvalorHistorialPagoNomi,this,true,"valorHistorialPagoNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_FECHA));

		if(this.historialpagonomiConstantesFunciones.mostrarfechaHistorialPagoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoNomiConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.historialpagonomiConstantesFunciones.resaltarfechaHistorialPagoNomi,this.historialpagonomiConstantesFunciones.activarfechaHistorialPagoNomi,iSizeTabla,this,true,"fechaHistorialPagoNomi","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.historialpagonomiConstantesFunciones.resaltarfechaHistorialPagoNomi,this.historialpagonomiConstantesFunciones.activarfechaHistorialPagoNomi,this,true,"fechaHistorialPagoNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION));

		if(this.historialpagonomiConstantesFunciones.mostrarfecha_liquidacionHistorialPagoNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.historialpagonomiConstantesFunciones.resaltarfecha_liquidacionHistorialPagoNomi,this.historialpagonomiConstantesFunciones.activarfecha_liquidacionHistorialPagoNomi,iSizeTabla,this,true,"fecha_liquidacionHistorialPagoNomi","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.historialpagonomiConstantesFunciones.resaltarfecha_liquidacionHistorialPagoNomi,this.historialpagonomiConstantesFunciones.activarfecha_liquidacionHistorialPagoNomi,this,true,"fecha_liquidacionHistorialPagoNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new HistorialPagoNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialpagonomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialpagonomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialPagoNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialpagonomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialpagonomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialPagoNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.historialpagonomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.historialpagonomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosHistorialPagoNomi.addColumn(tableColumn);
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
			
			this.jTableDatosHistorialPagoNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosHistorialPagoNomi.moveColumn(this.jTableDatosHistorialPagoNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosHistorialPagoNomi.moveColumn(this.jTableDatosHistorialPagoNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosHistorialPagoNomi.moveColumn(this.jTableDatosHistorialPagoNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosHistorialPagoNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosHistorialPagoNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosHistorialPagoNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosHistorialPagoNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosHistorialPagoNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosHistorialPagoNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosHistorialPagoNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=historialpagonomiLogic.getHistorialPagoNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=historialpagonomis.size()-1;
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
		//this.jTableDatosHistorialPagoNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosHistorialPagoNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosHistorialPagoNomi();
			
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
				
				//this.isEsNuevoHistorialPagoNomi=false;
					
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
				if(this.historialpagonomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialPagoNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialPagoNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.historialpagonomi.getsType().equals("DUPLICADO")
				   || this.historialpagonomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoHistorialPagoNomi=true;
				
				} else {
					this.isEsNuevoHistorialPagoNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
					if(this.historialpagonomi.getId()>=0 && !this.historialpagonomi.getIsNew()) {						
						this.isEsNuevoHistorialPagoNomi=false;
						
					} else {
						this.isEsNuevoHistorialPagoNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoHistorialPagoNomi(esRelaciones);						
				
				this.seleccionarHistorialPagoNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.historialpagonomi.getId()<0) {
					this.isEsNuevoHistorialPagoNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarHistorialPagoNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarHistorialPagoNomi(evt,rowIndex);
				}	
				
				if(this.historialpagonomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion HistorialPagoNomi: " + this.dDif); 
					}
				}								
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarHistorialPagoNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.historialpagonomi)) {
					if(this.historialpagonomi.getId()>0) {
						this.historialpagonomi.setIsDeleted(true);
						
						this.historialpagonomisEliminados.add(this.historialpagonomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialpagonomiLogic.getHistorialPagoNomis().remove(this.historialpagonomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialpagonomis.remove(this.historialpagonomi);				
					}
					
					
					((HistorialPagoNomiModel) this.jTableDatosHistorialPagoNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialPagoNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarHistorialPagoNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoHistorialPagoNomi) {
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialPagoNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialPagoNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioHistorialPagoNomi(this.historialpagonomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.historialpagonomiConstantesFunciones.cargarid_empresaHistorialPagoNomi || this.historialpagonomiConstantesFunciones.event_dependid_empresaHistorialPagoNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.historialpagonomi.getid_empresa());
									//this.inicializarActualizarBindingHistorialPagoNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(historialpagonomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(historialpagonomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.historialpagonomi.getid_empresa(),false,"Formulario");

					//Estructura
					if(!this.historialpagonomiConstantesFunciones.cargarid_estructuraHistorialPagoNomi || this.historialpagonomiConstantesFunciones.event_dependid_estructuraHistorialPagoNomi) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.historialpagonomi.getid_estructura());
									//this.inicializarActualizarBindingHistorialPagoNomi(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(historialpagonomi.getEstructura()!=null) {
							this.estructurasForeignKey.add(historialpagonomi.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.historialpagonomi.getid_estructura(),false,"Formulario");

					//Empleado
					if(!this.historialpagonomiConstantesFunciones.cargarid_empleadoHistorialPagoNomi || this.historialpagonomiConstantesFunciones.event_dependid_empleadoHistorialPagoNomi) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.historialpagonomi.getid_empleado());
									//this.inicializarActualizarBindingHistorialPagoNomi(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(historialpagonomi.getEmpleado()!=null) {
							this.empleadosForeignKey.add(historialpagonomi.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.historialpagonomi.getid_empleado(),false,"Formulario");

					//RubroEmplea
					if(!this.historialpagonomiConstantesFunciones.cargarid_rubro_empleaHistorialPagoNomi || this.historialpagonomiConstantesFunciones.event_dependid_rubro_empleaHistorialPagoNomi) {
						//this.cargarCombosRubroEmpleasForeignKeyLista(" where id="+this.historialpagonomi.getid_rubro_emplea());
									//this.inicializarActualizarBindingHistorialPagoNomi(false,false);
						this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

						if(historialpagonomi.getRubroEmplea()!=null) {
							this.rubroempleasForeignKey.add(historialpagonomi.getRubroEmplea());
						}

						this.addItemDefectoCombosForeignKeyRubroEmplea();
						this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
					}
					this.setActualRubroEmpleaForeignKey(this.historialpagonomi.getid_rubro_emplea(),false,"Formulario");

					//Mes
					if(!this.historialpagonomiConstantesFunciones.cargarid_mesHistorialPagoNomi || this.historialpagonomiConstantesFunciones.event_dependid_mesHistorialPagoNomi) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.historialpagonomi.getid_mes());
									//this.inicializarActualizarBindingHistorialPagoNomi(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(historialpagonomi.getMes()!=null) {
							this.messForeignKey.add(historialpagonomi.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.historialpagonomi.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesHistorialPagoNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesHistorialPagoNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialPagoNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialPagoNomi(HistorialPagoNomi historialpagonomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoHistorialPagoNomi(historialpagonomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialPagoNomi(HistorialPagoNomi historialpagonomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioHistorialPagoNomi(historialpagonomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyHistorialPagoNomi(historialpagonomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyHistorialPagoNomi(historialpagonomi);
	}
	
	public void setVariablesObjetoActualToFormularioHistorialPagoNomi(HistorialPagoNomi historialpagonomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.setText(historialpagonomi.getId().toString());
			this.jInternalFrameDetalleFormHistorialPagoNomi.jTextFieldvalorHistorialPagoNomi.setText(historialpagonomi.getvalor().toString());
			this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfechaHistorialPagoNomi.setDate(historialpagonomi.getfecha());
			this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfecha_liquidacionHistorialPagoNomi.setDate(historialpagonomi.getfecha_liquidacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,HistorialPagoNomi historialpagonomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,historialpagonomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,HistorialPagoNomi historialpagonomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				historialpagonomiLocal=this.historialpagonomi;
			} else {
				historialpagonomiLocal=this.historialpagonomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(historialpagonomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoHistorialPagoNomi(historialpagonomiLocal,true);
					
					if(historialpagonomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(historialpagonomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(historialpagonomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoHistorialPagoNomi(HistorialPagoNomi historialpagonomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialPagoNomi(historialpagonomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(historialpagonomi);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialPagoNomi(HistorialPagoNomi historialpagonomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialPagoNomi(historialpagonomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialPagoNomi(HistorialPagoNomi historialpagonomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.getText()==null || this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.getText()=="" || this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.setText("0");
			}

			if(conColumnasBase) {historialpagonomi.setId(Long.parseLong(this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialPagoNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelIdHistorialPagoNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialpagonomi.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormHistorialPagoNomi.jTextFieldvalorHistorialPagoNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialPagoNomiConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelvalorHistorialPagoNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialpagonomi.setfecha(this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfechaHistorialPagoNomi.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialPagoNomiConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelfechaHistorialPagoNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialpagonomi.setfecha_liquidacion(this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfecha_liquidacionHistorialPagoNomi.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelfecha_liquidacionHistorialPagoNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialPagoNomi(HistorialPagoNomi historialpagonomiBean,HistorialPagoNomi historialpagonomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosHistorialPagoNomi(HistorialPagoNomi historialpagonomiOrigen,HistorialPagoNomi historialpagonomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialpagonomiOrigen.getId()!=null && !historialpagonomiOrigen.getId().equals(0L))) {historialpagonomi.setId(historialpagonomiOrigen.getId());}}
			if(conDefault || (!conDefault && historialpagonomiOrigen.getvalor()!=null && !historialpagonomiOrigen.getvalor().equals(0.0))) {historialpagonomi.setvalor(historialpagonomiOrigen.getvalor());}
			if(conDefault || (!conDefault && historialpagonomiOrigen.getfecha()!=null && !historialpagonomiOrigen.getfecha().equals(new Date()))) {historialpagonomi.setfecha(historialpagonomiOrigen.getfecha());}
			if(conDefault || (!conDefault && historialpagonomiOrigen.getfecha_liquidacion()!=null && !historialpagonomiOrigen.getfecha_liquidacion().equals(new Date()))) {historialpagonomi.setfecha_liquidacion(historialpagonomiOrigen.getfecha_liquidacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialPagoNomi(HistorialPagoNomi historialpagonomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.setText(historialpagonomi.getId().toString());
			this.jInternalFrameDetalleFormHistorialPagoNomi.jTextFieldvalorHistorialPagoNomi.setText(historialpagonomi.getvalor().toString());
			this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfechaHistorialPagoNomi.setDate(historialpagonomi.getfecha());
			this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfecha_liquidacionHistorialPagoNomi.setDate(historialpagonomi.getfecha_liquidacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialPagoNomi(HistorialPagoNomiBean historialpagonomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.setText(historialpagonomiBean.getId().toString());
			this.jInternalFrameDetalleFormHistorialPagoNomi.jTextFieldvalorHistorialPagoNomi.setText(historialpagonomiBean.getvalor().toString());
			this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfechaHistorialPagoNomi.setDate(historialpagonomiBean.getfecha());
			this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfecha_liquidacionHistorialPagoNomi.setDate(historialpagonomiBean.getfecha_liquidacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanHistorialPagoNomi(HistorialPagoNomiParameterReturnGeneral historialpagonomiReturnGeneral,HistorialPagoNomiBean historialpagonomiBean,Boolean conDefault) throws Exception { 
		try {
			HistorialPagoNomi historialpagonomiLocal=new HistorialPagoNomi();
			
			historialpagonomiLocal=historialpagonomiReturnGeneral.getHistorialPagoNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialpagonomiLocal.getId()!=null && !historialpagonomiLocal.getId().equals(0L))) {historialpagonomiBean.setId(historialpagonomiLocal.getId());}}
			if(conDefault || (!conDefault && historialpagonomiLocal.getvalor()!=null && !historialpagonomiLocal.getvalor().equals(0.0))) {historialpagonomiBean.setvalor(historialpagonomiLocal.getvalor());}
			if(conDefault || (!conDefault && historialpagonomiLocal.getfecha()!=null && !historialpagonomiLocal.getfecha().equals(new Date()))) {historialpagonomiBean.setfecha(historialpagonomiLocal.getfecha());}
			if(conDefault || (!conDefault && historialpagonomiLocal.getfecha_liquidacion()!=null && !historialpagonomiLocal.getfecha_liquidacion().equals(new Date()))) {historialpagonomiBean.setfecha_liquidacion(historialpagonomiLocal.getfecha_liquidacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxHistorialPagoNomiGenerico(Long idHistorialPagoNomiSeleccionado,JComboBox jComboBoxHistorialPagoNomi,List<HistorialPagoNomi> historialpagonomisLocal)throws Exception {
		try {
			HistorialPagoNomi  historialpagonomiTemp=null;

			for(HistorialPagoNomi historialpagonomiAux:historialpagonomisLocal) {
				if(historialpagonomiAux.getId()!=null && historialpagonomiAux.getId().equals(idHistorialPagoNomiSeleccionado)) {
					historialpagonomiTemp=historialpagonomiAux;
					break;
				}
			}

			jComboBoxHistorialPagoNomi.setSelectedItem(historialpagonomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxHistorialPagoNomiGenerico(JComboBox jComboBoxHistorialPagoNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialPagoNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxHistorialPagoNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialPagoNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxHistorialPagoNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxHistorialPagoNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxHistorialPagoNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialpagonomi=(HistorialPagoNomi) historialpagonomiLogic.getHistorialPagoNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialpagonomi =(HistorialPagoNomi) historialpagonomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!historialpagonomi.getIsNew() && !historialpagonomi.getIsChanged() && !historialpagonomi.getIsDeleted()) {
				sDescripcion=historialpagonomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=historialpagonomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!historialpagonomi.getIsNew() && !historialpagonomi.getIsChanged() && !historialpagonomi.getIsDeleted()) {
				sDescripcion=historialpagonomi.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=historialpagonomi.getestructura_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!historialpagonomi.getIsNew() && !historialpagonomi.getIsChanged() && !historialpagonomi.getIsDeleted()) {
				sDescripcion=historialpagonomi.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=historialpagonomi.getempleado_descripcion();
			}
		}

		if(sTipo.equals("RubroEmplea")) {
			//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
			if(!historialpagonomi.getIsNew() && !historialpagonomi.getIsChanged() && !historialpagonomi.getIsDeleted()) {
				sDescripcion=historialpagonomi.getrubroemplea_descripcion();
			} else {
				//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
				sDescripcion=historialpagonomi.getrubroemplea_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!historialpagonomi.getIsNew() && !historialpagonomi.getIsChanged() && !historialpagonomi.getIsDeleted()) {
				sDescripcion=historialpagonomi.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=historialpagonomi.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		HistorialPagoNomi historialpagonomiRow=new HistorialPagoNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialpagonomiRow=(HistorialPagoNomi) historialpagonomiLogic.getHistorialPagoNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialpagonomiRow=(HistorialPagoNomi) historialpagonomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualHistorialPagoNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoHistorialPagoNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoNomi && this.isPermisoNuevoHistorialPagoNomi));			
			this.jButtonDuplicarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaDuplicarHistorialPagoNomi && this.isPermisoDuplicarHistorialPagoNomi));			
			this.jButtonCopiarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaCopiarHistorialPagoNomi && this.isPermisoCopiarHistorialPagoNomi));
			this.jButtonVerFormHistorialPagoNomi.setVisible((this.isVisibilidadCeldaVerFormHistorialPagoNomi && this.isPermisoVerFormHistorialPagoNomi));
			
			this.jButtonAbrirOrderByHistorialPagoNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoNomi && this.isPermisoOrdenHistorialPagoNomi));			
			
			this.jButtonNuevoRelacionesHistorialPagoNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi && this.isPermisoNuevoHistorialPagoNomi));			
			this.jButtonNuevoGuardarCambiosHistorialPagoNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoNomi && this.isPermisoNuevoHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi));
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonModificarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaModificarHistorialPagoNomi && this.isPermisoActualizarHistorialPagoNomi));	
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonActualizarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaActualizarHistorialPagoNomi && this.isPermisoActualizarHistorialPagoNomi));	
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonEliminarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaEliminarHistorialPagoNomi && this.isPermisoEliminarHistorialPagoNomi));
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonCancelarHistorialPagoNomi.setVisible(this.isVisibilidadCeldaCancelarHistorialPagoNomi);							
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosHistorialPagoNomi.setVisible((this.isVisibilidadCeldaGuardarHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaHistorialPagoNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoNomi && this.isPermisoNuevoHistorialPagoNomi));						
			this.jButtonDuplicarToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaDuplicarHistorialPagoNomi && this.isPermisoDuplicarHistorialPagoNomi));						
			this.jButtonCopiarToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaCopiarHistorialPagoNomi && this.isPermisoCopiarHistorialPagoNomi));			
			this.jButtonVerFormToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaVerFormHistorialPagoNomi && this.isPermisoVerFormHistorialPagoNomi));			
			this.jButtonAbrirOrderByToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoNomi && this.isPermisoOrdenHistorialPagoNomi));
			this.jButtonNuevoRelacionesToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi && this.isPermisoNuevoHistorialPagoNomi));			
			this.jButtonNuevoGuardarCambiosToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoNomi && this.isPermisoNuevoHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi));			
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonModificarToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaModificarHistorialPagoNomi && this.isPermisoActualizarHistorialPagoNomi));	
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonActualizarToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaActualizarHistorialPagoNomi  && this.isPermisoActualizarHistorialPagoNomi));	
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonEliminarToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaEliminarHistorialPagoNomi && this.isPermisoEliminarHistorialPagoNomi));
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonCancelarToolBarHistorialPagoNomi.setVisible(this.isVisibilidadCeldaCancelarHistorialPagoNomi);				
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaGuardarHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoHistorialPagoNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoNomi && this.isPermisoNuevoHistorialPagoNomi));			
			this.jMenuItemDuplicarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaDuplicarHistorialPagoNomi && this.isPermisoDuplicarHistorialPagoNomi));			
			this.jMenuItemCopiarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaCopiarHistorialPagoNomi && this.isPermisoCopiarHistorialPagoNomi));			
			this.jMenuItemVerFormHistorialPagoNomi.setVisible((this.isVisibilidadCeldaVerFormHistorialPagoNomi && this.isPermisoVerFormHistorialPagoNomi));			
			this.jMenuItemAbrirOrderByHistorialPagoNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoNomi && this.isPermisoOrdenHistorialPagoNomi));			
			//this.jMenuItemMostrarOcultarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoNomi && this.isPermisoOrdenHistorialPagoNomi));
			this.jMenuItemDetalleAbrirOrderByHistorialPagoNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoNomi && this.isPermisoOrdenHistorialPagoNomi));			
			//this.jMenuItemDetalleMostrarOcultarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoNomi && this.isPermisoOrdenHistorialPagoNomi));			
			this.jMenuItemNuevoRelacionesHistorialPagoNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi && this.isPermisoNuevoHistorialPagoNomi));			
			this.jMenuItemNuevoGuardarCambiosHistorialPagoNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoNomi && this.isPermisoNuevoHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi));									
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemModificarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaModificarHistorialPagoNomi && this.isPermisoActualizarHistorialPagoNomi));	
			this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemActualizarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaActualizarHistorialPagoNomi && this.isPermisoActualizarHistorialPagoNomi));	
			this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemEliminarHistorialPagoNomi.setVisible((this.isVisibilidadCeldaEliminarHistorialPagoNomi && this.isPermisoEliminarHistorialPagoNomi));
			this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemCancelarHistorialPagoNomi.setVisible(this.isVisibilidadCeldaCancelarHistorialPagoNomi);				
			}
			
			this.jMenuItemGuardarCambiosHistorialPagoNomi.setVisible((this.isVisibilidadCeldaGuardarHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi));						
			this.jMenuItemGuardarCambiosTablaHistorialPagoNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=this.jButtonNuevoHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaDuplicarHistorialPagoNomi=this.jButtonDuplicarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaCopiarHistorialPagoNomi=this.jButtonCopiarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaVerFormHistorialPagoNomi=this.jButtonVerFormHistorialPagoNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenHistorialPagoNomi=this.jButtonAbrirOrderByHistorialPagoNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=this.jButtonNuevoRelacionesHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaModificarHistorialPagoNomi=this.jButtonModificarHistorialPagoNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonActualizarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonEliminarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonCancelarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaGuardarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosHistorialPagoNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=this.jButtonGuardarCambiosTablaHistorialPagoNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=this.jButtonNuevoToolBarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=this.jButtonNuevoRelacionesToolBarHistorialPagoNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			this.isVisibilidadCeldaModificarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonModificarToolBarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonActualizarToolBarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonEliminarToolBarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonCancelarToolBarHistorialPagoNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialPagoNomi=this.jButtonGuardarCambiosToolBarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=this.jButtonGuardarCambiosTablaToolBarHistorialPagoNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=this.jMenuItemNuevoHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=this.jMenuItemNuevoRelacionesHistorialPagoNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			this.isVisibilidadCeldaModificarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemModificarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemActualizarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemEliminarHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemCancelarHistorialPagoNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialPagoNomi=this.jMenuItemGuardarCambiosHistorialPagoNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=this.jMenuItemGuardarCambiosTablaHistorialPagoNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesHistorialPagoNomi(Boolean esInicializar) {
		if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.historialpagonomiSessionBean.getConGuardarRelaciones()) {
				//if(this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialPagoNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualHistorialPagoNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualHistorialPagoNomi() {
		this.jButtonNuevoHistorialPagoNomi.setVisible(this.isPermisoNuevoHistorialPagoNomi);			
		this.jButtonDuplicarHistorialPagoNomi.setVisible(this.isPermisoDuplicarHistorialPagoNomi);			
		this.jButtonCopiarHistorialPagoNomi.setVisible(this.isPermisoCopiarHistorialPagoNomi);			
		this.jButtonVerFormHistorialPagoNomi.setVisible(this.isPermisoVerFormHistorialPagoNomi);			
		
		this.jButtonAbrirOrderByHistorialPagoNomi.setVisible(this.isPermisoOrdenHistorialPagoNomi);					
		
		this.jButtonNuevoRelacionesHistorialPagoNomi.setVisible(this.isPermisoNuevoHistorialPagoNomi);			
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonModificarHistorialPagoNomi.setVisible(this.isPermisoActualizarHistorialPagoNomi);	
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonActualizarHistorialPagoNomi.setVisible(this.isPermisoActualizarHistorialPagoNomi);	
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonEliminarHistorialPagoNomi.setVisible(this.isPermisoEliminarHistorialPagoNomi);
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonCancelarHistorialPagoNomi.setVisible(this.isVisibilidadCeldaCancelarHistorialPagoNomi);						
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosHistorialPagoNomi.setVisible(this.isPermisoGuardarCambiosHistorialPagoNomi);							
		}
		
		this.jButtonGuardarCambiosTablaHistorialPagoNomi.setVisible(this.isPermisoActualizarHistorialPagoNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialPagoNomi() {
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonModificarHistorialPagoNomi.setVisible(this.isPermisoActualizarHistorialPagoNomi);	
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonActualizarHistorialPagoNomi.setVisible(this.isPermisoActualizarHistorialPagoNomi);	
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonEliminarHistorialPagoNomi.setVisible(this.isPermisoEliminarHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonCancelarHistorialPagoNomi.setVisible(this.isVisibilidadCeldaCancelarHistorialPagoNomi);							
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosHistorialPagoNomi.setVisible((this.isVisibilidadCeldaGuardarHistorialPagoNomi && this.isPermisoGuardarCambiosHistorialPagoNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosHistorialPagoNomi() {
		if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualHistorialPagoNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesHistorialPagoNomi() {
	}
	
	public void jTableDatosHistorialPagoNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarHistorialPagoNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidHistorialPagoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagonomi==null) {
						this.historialpagonomi = new HistorialPagoNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				}

				if(this.historialpagonomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.historialpagonomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaHistorialPagoNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebHistorialPagoNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialPagoNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialPagoNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.historialpagonomiLogic.getConnexion());

				if(this.historialpagonomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.historialpagonomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialPagoNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderHistorialPagoNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaHistorialPagoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagonomi==null) {
						this.historialpagonomi = new HistorialPagoNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				}

				if(this.historialpagonomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.historialpagonomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraHistorialPagoNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebHistorialPagoNomi(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialPagoNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialPagoNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.historialpagonomiLogic.getConnexion());

				if(this.historialpagonomi.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.historialpagonomi.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialPagoNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoNomi.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderHistorialPagoNomi.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraHistorialPagoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagonomi==null) {
						this.historialpagonomi = new HistorialPagoNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				}

				if(this.historialpagonomi.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.historialpagonomi.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoHistorialPagoNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebHistorialPagoNomi(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialPagoNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialPagoNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.historialpagonomiLogic.getConnexion());

				if(this.historialpagonomi.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.historialpagonomi.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialPagoNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoNomi.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderHistorialPagoNomi.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoHistorialPagoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagonomi==null) {
						this.historialpagonomi = new HistorialPagoNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				}

				if(this.historialpagonomi.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.historialpagonomi.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rubro_empleaHistorialPagoNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorubroemplea=true;

			idTienePermisorubroemplea=this.tienePermisosUsuarioEnPaginaWebHistorialPagoNomi(RubroEmpleaConstantesFunciones.CLASSNAME);

			if(idTienePermisorubroemplea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialPagoNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialPagoNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.historialpagonomiLogic.getConnexion());

				if(this.historialpagonomi.getid_rubro_emplea()!=null) {
					this.rubroempleaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rubroempleaBeanSwingJInternalFrame.setIdActual(this.historialpagonomi.getid_rubro_emplea());
					this.rubroempleaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea();
				}

				JInternalFrameBase jinternalFrame =this.rubroempleaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialPagoNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoNomi.getBorder();
				TitledBorder titledBorderrubroemplea=(TitledBorder)this.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

				titledBorderrubroemplea.setTitle(titledBorderHistorialPagoNomi.getTitle() + " -> Rubro Emplea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rubro_empleaHistorialPagoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagonomi==null) {
						this.historialpagonomi = new HistorialPagoNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				}

				if(this.historialpagonomi.getid_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rubro_emplea = "+this.historialpagonomi.getid_rubro_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesHistorialPagoNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebHistorialPagoNomi(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialPagoNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialPagoNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.historialpagonomiLogic.getConnexion());

				if(this.historialpagonomi.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.historialpagonomi.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialPagoNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoNomi.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderHistorialPagoNomi.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesHistorialPagoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagonomi==null) {
						this.historialpagonomi = new HistorialPagoNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				}

				if(this.historialpagonomi.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.historialpagonomi.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorHistorialPagoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagonomi==null) {
						this.historialpagonomi = new HistorialPagoNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				}

				if(this.historialpagonomi.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.historialpagonomi.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaHistorialPagoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagonomi==null) {
						this.historialpagonomi = new HistorialPagoNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				}

				if(this.historialpagonomi.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.historialpagonomi.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_liquidacionHistorialPagoNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.gethistorialpagonomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagonomi==null) {
						this.historialpagonomi = new HistorialPagoNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);
				}

				if(this.historialpagonomi.getfecha_liquidacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_liquidacion = '"+Funciones2.getStringPostgresDate(this.historialpagonomi.getfecha_liquidacion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);

			this.getHistorialPagoNomisFK_IdEmpleado();

			this.inicializarActualizarBindingHistorialPagoNomi(false);

			//if(HistorialPagoNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);

			this.getHistorialPagoNomisFK_IdEmpresa();

			this.inicializarActualizarBindingHistorialPagoNomi(false);

			//if(HistorialPagoNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);

			this.getHistorialPagoNomisFK_IdEstructura();

			this.inicializarActualizarBindingHistorialPagoNomi(false);

			//if(HistorialPagoNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);

			this.getHistorialPagoNomisFK_IdMes();

			this.inicializarActualizarBindingHistorialPagoNomi(false);

			//if(HistorialPagoNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRubroEmpleaHistorialPagoNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);

			this.getHistorialPagoNomisFK_IdRubroEmplea();

			this.inicializarActualizarBindingHistorialPagoNomi(false);

			//if(HistorialPagoNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagonomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameHistorialPagoNomi() {
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormHistorialPagoNomi.dispose();
			this.jInternalFrameDetalleFormHistorialPagoNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoHistorialPagoNomi!=null) {
			this.jInternalFrameReporteDinamicoHistorialPagoNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoHistorialPagoNomi.dispose();
			this.jInternalFrameReporteDinamicoHistorialPagoNomi=null;
		}
		
		if(this.jInternalFrameImportacionHistorialPagoNomi!=null) {
			this.jInternalFrameImportacionHistorialPagoNomi.setVisible(false);	    			
			this.jInternalFrameImportacionHistorialPagoNomi.dispose();
			this.jInternalFrameImportacionHistorialPagoNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessHistorialPagoNomi();
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoHistorialPagoNomi")) {
				jButtonNuevoHistorialPagoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarHistorialPagoNomi")) {
				jButtonDuplicarHistorialPagoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarHistorialPagoNomi")) {
				jButtonCopiarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormHistorialPagoNomi")) {
				jButtonVerFormHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarHistorialPagoNomi")) {
				jButtonNuevoHistorialPagoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarHistorialPagoNomi")) {
				jButtonDuplicarHistorialPagoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoHistorialPagoNomi")) {
				jButtonNuevoHistorialPagoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarHistorialPagoNomi")) {
				jButtonDuplicarHistorialPagoNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesHistorialPagoNomi")) {
				jButtonNuevoHistorialPagoNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarHistorialPagoNomi")) {
				jButtonNuevoHistorialPagoNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesHistorialPagoNomi")) {
				jButtonNuevoHistorialPagoNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarHistorialPagoNomi")) {
				jButtonModificarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarHistorialPagoNomi")) {
				jButtonModificarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarHistorialPagoNomi")) {
				jButtonModificarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarHistorialPagoNomi")) {
				jButtonActualizarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarHistorialPagoNomi")) {
				jButtonActualizarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarHistorialPagoNomi")) {
				jButtonActualizarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarHistorialPagoNomi")) {
				jButtonEliminarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarHistorialPagoNomi")) {
				jButtonEliminarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarHistorialPagoNomi")) {
				jButtonEliminarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarHistorialPagoNomi")) {
				jButtonCancelarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarHistorialPagoNomi")) {
				jButtonCancelarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarHistorialPagoNomi")) {
				jButtonCancelarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarHistorialPagoNomi")) {
				jButtonCerrarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarHistorialPagoNomi")) {
				jButtonCerrarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarHistorialPagoNomi")) {
				jButtonCerrarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarHistorialPagoNomi")) {
				jButtonMostrarOcultarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarHistorialPagoNomi")) {
				jButtonCancelarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosHistorialPagoNomi")) {
				jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarHistorialPagoNomi")) {
				jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarHistorialPagoNomi")) {
				jButtonCopiarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarHistorialPagoNomi")) {
				jButtonVerFormHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosHistorialPagoNomi")) {
				jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarHistorialPagoNomi")) {
				jButtonCopiarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormHistorialPagoNomi")) {
				jButtonVerFormHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaHistorialPagoNomi")) {
				jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarHistorialPagoNomi")) {
				jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaHistorialPagoNomi")) {
				jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionHistorialPagoNomi")) {
				jButtonRecargarInformacionHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarHistorialPagoNomi")) {
				jButtonRecargarInformacionHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionHistorialPagoNomi")) {
				jButtonRecargarInformacionHistorialPagoNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresHistorialPagoNomi")) {
				jButtonAnterioresHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarHistorialPagoNomi")) {
				jButtonAnterioresHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreHistorialPagoNomi")) {
				jButtonAnterioresHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesHistorialPagoNomi")) {
				jButtonSiguientesHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarHistorialPagoNomi")) {
				jButtonSiguientesHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesHistorialPagoNomi")) {
				jButtonSiguientesHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByHistorialPagoNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByHistorialPagoNomi")) {
				jButtonAbrirOrderByHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarHistorialPagoNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarHistorialPagoNomi")) {
				jButtonMostrarOcultarHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialPagoNomi")) {
				jButtonNuevoGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarHistorialPagoNomi")) {
				jButtonNuevoGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosHistorialPagoNomi")) {
				jButtonNuevoGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoHistorialPagoNomi")) {
				jButtonCerrarReporteDinamicoHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoHistorialPagoNomi")) {
				jButtonGenerarReporteDinamicoHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoHistorialPagoNomi")) {
				
				jButtonGenerarExcelReporteDinamicoHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionHistorialPagoNomi")) {
				jButtonCerrarImportacionHistorialPagoNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionHistorialPagoNomi")) {
				
				jButtonGenerarImportacionHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionHistorialPagoNomi")) {
				
				jButtonAbrirImportacionHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesHistorialPagoNomi")) {
				jComboBoxTiposAccionesHistorialPagoNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesHistorialPagoNomi")) {
				jComboBoxTiposRelacionesHistorialPagoNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioHistorialPagoNomi")) {
				jComboBoxTiposAccionesHistorialPagoNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarHistorialPagoNomi")) {
				
				jComboBoxTiposSeleccionarHistorialPagoNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralHistorialPagoNomi")) {
				jTextFieldValorCampoGeneralHistorialPagoNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByHistorialPagoNomi")) {
				jButtonAbrirOrderByHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarHistorialPagoNomi")) {
				jButtonAbrirOrderByHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByHistorialPagoNomi")) {
				jButtonCerrarOrderByHistorialPagoNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialPagoNomiBusqueda")) {
				this.jButtonidHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHistorialPagoNomiUpdate")) {
				this.jButtonid_empresaHistorialPagoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHistorialPagoNomiBusqueda")) {
				this.jButtonid_empresaHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraHistorialPagoNomiUpdate")) {
				this.jButtonid_estructuraHistorialPagoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraHistorialPagoNomiBusqueda")) {
				this.jButtonid_estructuraHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoHistorialPagoNomiUpdate")) {
				this.jButtonid_empleadoHistorialPagoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoHistorialPagoNomiBusqueda")) {
				this.jButtonid_empleadoHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaHistorialPagoNomiUpdate")) {
				this.jButtonid_rubro_empleaHistorialPagoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaHistorialPagoNomiBusqueda")) {
				this.jButtonid_rubro_empleaHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesHistorialPagoNomiUpdate")) {
				this.jButtonid_mesHistorialPagoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesHistorialPagoNomiBusqueda")) {
				this.jButtonid_mesHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorHistorialPagoNomiBusqueda")) {
				this.jButtonvalorHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaHistorialPagoNomiBusqueda")) {
				this.jButtonfechaHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_liquidacionHistorialPagoNomiBusqueda")) {
				this.jButtonfecha_liquidacionHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoHistorialPagoNomi")) {
				this.jButtonFK_IdEmpleadoHistorialPagoNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraHistorialPagoNomi")) {
				this.jButtonFK_IdEstructuraHistorialPagoNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesHistorialPagoNomi")) {
				this.jButtonFK_IdMesHistorialPagoNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRubroEmpleaHistorialPagoNomi")) {
				this.jButtonFK_IdRubroEmpleaHistorialPagoNomiActionPerformed(evt);
			}
			
			;
			
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessHistorialPagoNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				


				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			HistorialPagoNomi historialpagonomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				historialpagonomiLocal=this.historialpagonomi;
			} else {
				historialpagonomiLocal=this.historialpagonomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
							
				
				


				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
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
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
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
			
			


			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
								
						
				


				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
								
				
				


				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
							
				
				


				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
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
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
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
			
			


			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
								
				
				


				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosHistorialPagoNomi")) {
					jCheckBoxSeleccionarTodosHistorialPagoNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosHistorialPagoNomi")) {
					jCheckBoxSeleccionadosHistorialPagoNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarHistorialPagoNomi")) {
					
				}
				
				


				
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
												
				
				


				
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
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
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
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
			
			


			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagonomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagonomi);
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
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
				
				


				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagonomiAnterior =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarHistorialPagoNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosHistorialPagoNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosHistorialPagoNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.historialpagonomi =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.historialpagonomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarHistorialPagoNomi")) {
				
				}
				
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarHistorialPagoNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosHistorialPagoNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarHistorialPagoNomi")) {
			
			}
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessHistorialPagoNomi();
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
			if(sTipo.equals("NuevoHistorialPagoNomi")) {
				jButtonNuevoHistorialPagoNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarHistorialPagoNomi")) {
				jButtonDuplicarHistorialPagoNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarHistorialPagoNomi")) {
				jButtonCopiarHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormHistorialPagoNomi")) {
				jButtonVerFormHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesHistorialPagoNomi")) {
				jButtonNuevoHistorialPagoNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarHistorialPagoNomi")) {
				jButtonModificarHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarHistorialPagoNomi")) {
				jButtonActualizarHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarHistorialPagoNomi")) {
				jButtonEliminarHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaHistorialPagoNomi")) {
				jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarHistorialPagoNomi")) {
				jButtonCancelarHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarHistorialPagoNomi")) {
				jButtonCerrarHistorialPagoNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosHistorialPagoNomi")) {
				jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialPagoNomi")) {
				jButtonNuevoGuardarCambiosHistorialPagoNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByHistorialPagoNomi")) {
				jButtonAbrirOrderByHistorialPagoNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionHistorialPagoNomi")) {
				jButtonRecargarInformacionHistorialPagoNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresHistorialPagoNomi")) {
				jButtonAnterioresHistorialPagoNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesHistorialPagoNomi")) {
				jButtonSiguientesHistorialPagoNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialPagoNomiBusqueda")) {
				this.jButtonidHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHistorialPagoNomiUpdate")) {
				this.jButtonid_empresaHistorialPagoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHistorialPagoNomiBusqueda")) {
				this.jButtonid_empresaHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraHistorialPagoNomiUpdate")) {
				this.jButtonid_estructuraHistorialPagoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraHistorialPagoNomiBusqueda")) {
				this.jButtonid_estructuraHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoHistorialPagoNomiUpdate")) {
				this.jButtonid_empleadoHistorialPagoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoHistorialPagoNomiBusqueda")) {
				this.jButtonid_empleadoHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaHistorialPagoNomiUpdate")) {
				this.jButtonid_rubro_empleaHistorialPagoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaHistorialPagoNomiBusqueda")) {
				this.jButtonid_rubro_empleaHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesHistorialPagoNomiUpdate")) {
				this.jButtonid_mesHistorialPagoNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesHistorialPagoNomiBusqueda")) {
				this.jButtonid_mesHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorHistorialPagoNomiBusqueda")) {
				this.jButtonvalorHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaHistorialPagoNomiBusqueda")) {
				this.jButtonfechaHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_liquidacionHistorialPagoNomiBusqueda")) {
				this.jButtonfecha_liquidacionHistorialPagoNomiBusquedaActionPerformed(evt);
			}
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessHistorialPagoNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameHistorialPagoNomi")) {
				closingInternalFrameHistorialPagoNomi();
				
			} else if(sTipo.equals("jButtonCancelarHistorialPagoNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormHistorialPagoNomi = (JInternalFrameBase)evt.getSource();
	            	
	            HistorialPagoNomiBeanSwingJInternalFrame jInternalFrameParent=(HistorialPagoNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialPagoNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarHistorialPagoNomiActionPerformed(null);
			}
			
			HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialpagonomi,new Object(),this.historialpagonomiParameterGeneral,this.historialpagonomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormHistorialPagoNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormHistorialPagoNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormHistorialPagoNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.historialpagonomi)) {
			if(!esControlTabla) {
				if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);			
				}
				
				if(this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualHistorialPagoNomi(this.historialpagonomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.historialpagonomiReturnGeneral=historialpagonomiLogic.procesarEventosHistorialPagoNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialpagonomiLogic.getHistorialPagoNomis(),this.historialpagonomi,this.historialpagonomiParameterGeneral,this.isEsNuevoHistorialPagoNomi,classes);//this.historialpagonomiLogic.getHistorialPagoNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanHistorialPagoNomi(this.historialpagonomiReturnGeneral,this.historialpagonomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanHistorialPagoNomi(classes,this.historialpagonomiReturnGeneral,this.historialpagonomiBean,false);
					}
						
					if(this.historialpagonomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyHistorialPagoNomi(this.historialpagonomiReturnGeneral.getHistorialPagoNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioHistorialPagoNomi(this.historialpagonomiReturnGeneral.getHistorialPagoNomi());	
					}
						
					if(this.historialpagonomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioHistorialPagoNomi(this.historialpagonomiReturnGeneral.getHistorialPagoNomi(),classes);//this.historialpagonomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioHistorialPagoNomi(this.historialpagonomi,classes);//this.historialpagonomiBean);									
				}
			
				if(HistorialPagoNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualHistorialPagoNomi(this.historialpagonomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoNomi(this.historialpagonomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.historialpagonomiAnterior!=null) {
						this.historialpagonomi=this.historialpagonomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.historialpagonomiReturnGeneral=historialpagonomiLogic.procesarEventosHistorialPagoNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialpagonomiLogic.getHistorialPagoNomis(),this.historialpagonomi,this.historialpagonomiParameterGeneral,this.isEsNuevoHistorialPagoNomi,classes);//this.historialpagonomiLogic.getHistorialPagoNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialpagonomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialpagonomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.historialpagonomiReturnGeneral.getHistorialPagoNomi(),historialpagonomiLogic.getHistorialPagoNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.historialpagonomiReturnGeneral.getHistorialPagoNomi(),this.historialpagonomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosHistorialPagoNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosHistorialPagoNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosHistorialPagoNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosHistorialPagoNomi() throws Exception {
		
		HistorialPagoNomiModel historialpagonomiModel=(HistorialPagoNomiModel)this.jTableDatosHistorialPagoNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialpagonomiModel.historialpagonomis=this.historialpagonomiLogic.getHistorialPagoNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			historialpagonomiModel.historialpagonomis=this.historialpagonomis;
		}
		
		
		((HistorialPagoNomiModel) this.jTableDatosHistorialPagoNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaHistorialPagoNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gethistorialpagonomiAnterior(),this.historialpagonomiLogic.getHistorialPagoNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gethistorialpagonomiAnterior(),this.historialpagonomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosHistorialPagoNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioHistorialPagoNomi(HistorialPagoNomi historialpagonomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
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
										
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialpagonomi,new Object(),generalEntityParameterGeneral,this.historialpagonomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.historialpagonomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=HistorialPagoNomiConstantesFunciones.getClassesRelationshipsOfHistorialPagoNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=HistorialPagoNomiConstantesFunciones.getClassesRelationshipsFromStringsOfHistorialPagoNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormHistorialPagoNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				HistorialPagoNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialpagonomi,new Object(),generalEntityParameterGeneral,this.historialpagonomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioHistorialPagoNomi(HistorialPagoNomiBean historialpagonomiBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanHistorialPagoNomi(ArrayList<Classe> classes,HistorialPagoNomiReturnGeneral historialpagonomiReturnGeneral,HistorialPagoNomiBean historialpagonomiBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualHistorialPagoNomi(HistorialPagoNomi historialpagonomi,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.historialpagonomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormHistorialPagoNomi = new HistorialPagoNomiDetalleFormJInternalFrame(jDesktopPane,this.historialpagonomiSessionBean.getConGuardarRelaciones(),this.historialpagonomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.setVisible(false);
		this.jInternalFrameDetalleFormHistorialPagoNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.historialpagonomiLogic=this.historialpagonomiLogic;
		
		this.cargarCombosFrameForeignKeyHistorialPagoNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialPagoNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialPagoNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyHistorialPagoNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyHistorialPagoNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialPagoNomi"));
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonModificarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"ModificarHistorialPagoNomi"));

		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonModificarToolBarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialPagoNomi"));
					
		this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemModificarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialPagoNomi"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonActualizarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"ActualizarHistorialPagoNomi"));
		
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonActualizarToolBarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialPagoNomi"));
						
		this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemActualizarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialPagoNomi"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonEliminarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"EliminarHistorialPagoNomi"));
		
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonEliminarToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialPagoNomi"));
								
		this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemEliminarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialPagoNomi"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonCancelarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"CancelarHistorialPagoNomi"));
		
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonCancelarToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialPagoNomi"));
					
		this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemCancelarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialPagoNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemDetalleCerrarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialPagoNomi"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialPagoNomi"));
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialPagoNomi"));
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialPagoNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonidHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empresaHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empresaHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_estructuraHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_estructuraHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empleadoHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empleadoHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_rubro_empleaHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_rubro_empleaHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_mesHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_mesHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonvalorHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorHistorialPagoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonfechaHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaHistorialPagoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonfecha_liquidacionHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionHistorialPagoNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormHistorialPagoNomi.jTabbedPaneRelacionesHistorialPagoNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialPagoNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameHistorialPagoNomi"));
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialPagoNomi"));
		}
		
		this.jTableDatosHistorialPagoNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarHistorialPagoNomi"));
		
		this.jTableDatosHistorialPagoNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarHistorialPagoNomi"));
		
		this.jButtonNuevoHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"NuevoHistorialPagoNomi"));
		
		this.jButtonDuplicarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"DuplicarHistorialPagoNomi"));
		
		this.jButtonCopiarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"CopiarHistorialPagoNomi"));
		
		this.jButtonVerFormHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"VerFormHistorialPagoNomi"));
		
		
		this.jButtonNuevoToolBarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarHistorialPagoNomi"));
			
		this.jButtonDuplicarToolBarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarHistorialPagoNomi"));
			
		this.jMenuItemNuevoHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoHistorialPagoNomi"));
			
		this.jMenuItemDuplicarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarHistorialPagoNomi"));		
		
		
		this.jButtonNuevoRelacionesHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesHistorialPagoNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarHistorialPagoNomi"));
			
		this.jMenuItemNuevoRelacionesHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesHistorialPagoNomi"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonModificarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"ModificarHistorialPagoNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonModificarToolBarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialPagoNomi"));
			
			this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemModificarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialPagoNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonActualizarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"ActualizarHistorialPagoNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonActualizarToolBarHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialPagoNomi"));
				
			this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemActualizarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialPagoNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonEliminarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"EliminarHistorialPagoNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonEliminarToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialPagoNomi"));
						
			this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemEliminarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialPagoNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonCancelarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"CancelarHistorialPagoNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonCancelarToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialPagoNomi"));
			
			this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemCancelarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialPagoNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarHistorialPagoNomi"));		
		
		
		this.jButtonCerrarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"CerrarHistorialPagoNomi"));
		
		
		this.jButtonCerrarToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarHistorialPagoNomi"));
			
		this.jMenuItemCerrarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarHistorialPagoNomi"));
			
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jMenuItemDetalleCerrarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialPagoNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosHistorialPagoNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialPagoNomi"));
		}
		
		this.jButtonCopiarToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarHistorialPagoNomi"));
			
		this.jButtonVerFormToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarHistorialPagoNomi"));
		
		this.jMenuItemGuardarCambiosHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosHistorialPagoNomi"));
			
		this.jMenuItemCopiarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarHistorialPagoNomi"));		
		
		this.jMenuItemVerFormHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormHistorialPagoNomi"));		
		
		
		this.jButtonGuardarCambiosTablaHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialPagoNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarHistorialPagoNomi"));
			
		this.jMenuItemGuardarCambiosTablaHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialPagoNomi"));		
		
		
		
		this.jButtonRecargarInformacionHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionHistorialPagoNomi"));
					
		this.jButtonRecargarInformacionToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarHistorialPagoNomi"));
		
		this.jMenuItemRecargarInformacionHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionHistorialPagoNomi"));		
		
		
		
		this.jButtonAnterioresHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"AnterioresHistorialPagoNomi"));
		
		
		this.jButtonAnterioresToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarHistorialPagoNomi"));
		
		this.jMenuItemAnterioresHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresHistorialPagoNomi"));		
		
		
		this.jButtonSiguientesHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"SiguientesHistorialPagoNomi"));
		
		
		this.jButtonSiguientesToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarHistorialPagoNomi"));
			
		this.jMenuItemSiguientesHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesHistorialPagoNomi"));
			
		this.jMenuItemAbrirOrderByHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByHistorialPagoNomi"));
			
		this.jMenuItemMostrarOcultarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarHistorialPagoNomi"));
			
		this.jMenuItemDetalleAbrirOrderByHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByHistorialPagoNomi"));
			
		this.jMenuItemDetalleMostarOcultarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarHistorialPagoNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosHistorialPagoNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarHistorialPagoNomi"));
			
		this.jMenuItemNuevoGuardarCambiosHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosHistorialPagoNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosHistorialPagoNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosHistorialPagoNomi"));

		this.jCheckBoxSeleccionadosHistorialPagoNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosHistorialPagoNomi"));
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialPagoNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesHistorialPagoNomi"));
			
		this.jComboBoxTiposAccionesHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesHistorialPagoNomi"));
					
		this.jComboBoxTiposSeleccionarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarHistorialPagoNomi"));
			
		this.jTextFieldValorCampoGeneralHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralHistorialPagoNomi"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonidHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empresaHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empresaHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_estructuraHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_estructuraHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empleadoHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empleadoHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_rubro_empleaHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_rubro_empleaHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_mesHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_mesHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonvalorHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorHistorialPagoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonfechaHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaHistorialPagoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonfecha_liquidacionHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionHistorialPagoNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoHistorialPagoNomi"));

			this.jButtonFK_IdEstructuraHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraHistorialPagoNomi"));

			this.jButtonFK_IdMesHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"FK_IdMesHistorialPagoNomi"));

			this.jButtonFK_IdRubroEmpleaHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaHistorialPagoNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoHistorialPagoNomi!=null) {
				this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialPagoNomi"));
				this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialPagoNomi"));
				this.jInternalFrameReporteDinamicoHistorialPagoNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialPagoNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialPagoNomi"));				
			//this.jButtonGenerarReporteDinamicoHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialPagoNomi"));
			//this.jButtonGenerarExcelReporteDinamicoHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialPagoNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionHistorialPagoNomi!=null) {
				this.jInternalFrameImportacionHistorialPagoNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialPagoNomi"));
				this.jInternalFrameImportacionHistorialPagoNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialPagoNomi"));
				this.jInternalFrameImportacionHistorialPagoNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialPagoNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByHistorialPagoNomi"));
			
			this.jButtonAbrirOrderByToolBarHistorialPagoNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarHistorialPagoNomi"));			
			
			if(this.jInternalFrameOrderByHistorialPagoNomi!=null) {
				this.jInternalFrameOrderByHistorialPagoNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialPagoNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoNomi.jTabbedPaneRelacionesHistorialPagoNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialPagoNomi"));
		
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
            		closingInternalFrameHistorialPagoNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormHistorialPagoNomi = (JInternalFrameBase)event.getSource();
	            	
	            HistorialPagoNomiBeanSwingJInternalFrame jInternalFrameParent=(HistorialPagoNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialPagoNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarHistorialPagoNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosHistorialPagoNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosHistorialPagoNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosHistorialPagoNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosHistorialPagoNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoHistorialPagoNomi";
		inputMap = this.jButtonNuevoHistorialPagoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoHistorialPagoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialPagoNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesHistorialPagoNomi";
		inputMap = this.jButtonNuevoRelacionesHistorialPagoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesHistorialPagoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialPagoNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarHistorialPagoNomi";
		inputMap = this.jButtonModificarHistorialPagoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarHistorialPagoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarHistorialPagoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarHistorialPagoNomi";
		inputMap = this.jButtonActualizarHistorialPagoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarHistorialPagoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarHistorialPagoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarHistorialPagoNomi";
		inputMap = this.jButtonEliminarHistorialPagoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarHistorialPagoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarHistorialPagoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarHistorialPagoNomi";
		inputMap = this.jButtonCancelarHistorialPagoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarHistorialPagoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarHistorialPagoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarHistorialPagoNomi";
		inputMap = this.jButtonCerrarHistorialPagoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarHistorialPagoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarHistorialPagoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosHistorialPagoNomi";
		inputMap = this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosHistorialPagoNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonGuardarCambiosHistorialPagoNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosHistorialPagoNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosHistorialPagoNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosHistorialPagoNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesHistorialPagoNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesHistorialPagoNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarHistorialPagoNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarHistorialPagoNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralHistorialPagoNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralHistorialPagoNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonidHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empresaHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empresaHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_estructuraHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_estructuraHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empleadoHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_empleadoHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_rubro_empleaHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_rubro_empleaHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_mesHistorialPagoNomiUpdate.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonid_mesHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonvalorHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorHistorialPagoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonfechaHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"fechaHistorialPagoNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoNomi.jButtonfecha_liquidacionHistorialPagoNomiBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionHistorialPagoNomiBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoHistorialPagoNomi"));

		this.jButtonFK_IdEstructuraHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraHistorialPagoNomi"));

		this.jButtonFK_IdMesHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"FK_IdMesHistorialPagoNomi"));

		this.jButtonFK_IdRubroEmpleaHistorialPagoNomi.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaHistorialPagoNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionHistorialPagoNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionHistorialPagoNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarHistorialPagoNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarHistorialPagoNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosHistorialPagoNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomiLogic.getHistorialPagoNomis()) {
					historialpagonomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialPagoNomi historialpagonomiAux:historialpagonomis) {
					historialpagonomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosHistorialPagoNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomiLogic.getHistorialPagoNomis()) {
						historialpagonomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialPagoNomi historialpagonomiAux:historialpagonomis) {
						historialpagonomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomiLogic.getHistorialPagoNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialPagoNomi historialpagonomiAux:historialpagonomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialPagoNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialPagoNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosHistorialPagoNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosHistorialPagoNomi.getSelectedRows();
			
			HistorialPagoNomi historialpagonomiLocal=new HistorialPagoNomi();
			
			//this.seleccionarTodosHistorialPagoNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagonomiLocal =(HistorialPagoNomi) this.historialpagonomiLogic.getHistorialPagoNomis().toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					historialpagonomiLocal =(HistorialPagoNomi) this.historialpagonomis.toArray()[this.jTableDatosHistorialPagoNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				historialpagonomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomiLogic.getHistorialPagoNomis()) {
						historialpagonomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialPagoNomi historialpagonomiAux:historialpagonomis) {
						historialpagonomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialPagoNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialPagoNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualHistorialPagoNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarHistorialPagoNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralHistorialPagoNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralHistorialPagoNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomiLogic.getHistorialPagoNomis()) {
				
						if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							historialpagonomiAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							historialpagonomiAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION)) {
							existe=true;
							historialpagonomiAux.setfecha_liquidacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialPagoNomi historialpagonomiAux:historialpagonomis) {
					
						if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							historialpagonomiAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							historialpagonomiAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION)) {
							existe=true;
							historialpagonomiAux.setfecha_liquidacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesHistorialPagoNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioHistorialPagoNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesHistorialPagoNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteHistorialPagoNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessHistorialPagoNomi(conSplash);
				
					this.generarReporteHistorialPagoNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoHistorialPagoNomisSeleccionados();
				//this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialPagoNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialPagoNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialPagoNomi();
				
				this.exportarHistorialPagoNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionHistorialPagoNomis();
				//this.importarHistorialPagoNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialPagoNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelHistorialPagoNomisSeleccionados();
				//this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Historial Pago Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessHistorialPagoNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoHistorialPagoNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyHistorialPagoNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Historial Pago Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(HistorialPagoNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteHistorialPagoNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessHistorialPagoNomi(conSplash);
					
						//this.actualizarParametrosGeneralHistorialPagoNomi();
						
						this.generarReporteProcesoAccionHistorialPagoNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(HistorialPagoNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Historial Pago NomiS SELECCIONADOS?", "MANTENIMIENTO DE Historial Pago Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessHistorialPagoNomi();
				
						this.actualizarParametrosGeneralHistorialPagoNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.historialpagonomiReturnGeneral=historialpagonomiLogic.procesarAccionHistorialPagoNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.historialpagonomiLogic.getHistorialPagoNomis(),this.historialpagonomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarHistorialPagoNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralHistorialPagoNomi();
					
					HistorialPagoNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarHistorialPagoNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialPagoNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxTiposAccionesFormularioHistorialPagoNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessHistorialPagoNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesHistorialPagoNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessHistorialPagoNomi();
			
			if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();		
			HistorialPagoNomi historialpagonomi=new HistorialPagoNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingHistorialPagoNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesHistorialPagoNomi.getSelectedItem();
			
			
			
			
			historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(historialpagonomisSeleccionados.size()==1) {
				for(HistorialPagoNomi historialpagonomiAux:historialpagonomisSeleccionados) {
					historialpagonomi=historialpagonomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessHistorialPagoNomi();
			
      		//this.finishProcessHistorialPagoNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarHistorialPagoNomiReturnGeneral() throws Exception {
		if(this.historialpagonomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.historialpagonomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.historialpagonomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.historialpagonomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.historialpagonomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.historialpagonomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingHistorialPagoNomi(false);
		}
		
		if(this.historialpagonomiReturnGeneral.getConRetornoLista() || this.historialpagonomiReturnGeneral.getConRetornoObjeto()) {
			if(this.historialpagonomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialpagonomiLogic.setHistorialPagoNomis(this.historialpagonomiReturnGeneral.getHistorialPagoNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.historialpagonomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialpagonomiLogic.setHistorialPagoNomi(this.historialpagonomiReturnGeneral.getHistorialPagoNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingHistorialPagoNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralHistorialPagoNomi() throws Exception {
		
		
	}
	
	public ArrayList<HistorialPagoNomi> getHistorialPagoNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioHistorialPagoNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(HistorialPagoNomi historialpagonomiAux:historialpagonomiLogic.getHistorialPagoNomis()) {
					if(historialpagonomiAux.getIsSelected()) {
						historialpagonomisSeleccionados.add(historialpagonomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialPagoNomi historialpagonomiAux:this.historialpagonomis) {
					if(historialpagonomiAux.getIsSelected()) {
						historialpagonomisSeleccionados.add(historialpagonomiAux);				
					}
				}
			}
			
			if(historialpagonomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						historialpagonomisSeleccionados.addAll(this.historialpagonomiLogic.getHistorialPagoNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						historialpagonomisSeleccionados.addAll(this.historialpagonomis);				
					}
				}
			}
		} else {
			historialpagonomisSeleccionados.add(this.historialpagonomi);
		}
		
		return historialpagonomisSeleccionados;
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
	
	public void generarReporteHistorialPagoNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalHistorialPagoNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoHistorialPagoNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialPagoNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialPagoNomisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Historial Pago Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesHistorialPagoNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();		
		
		historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteHistorialPagoNomis("Todos",historialpagonomisSeleccionados);
		
	}	
	
	public void generarReporteNormalHistorialPagoNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();		
		
		historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteHistorialPagoNomis("Todos",historialpagonomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionHistorialPagoNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();
		
		historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteHistorialPagoNomis("Todos",historialpagonomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoHistorialPagoNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoHistorialPagoNomi();
		
		
		historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoHistorialPagoNomi();
		
		
		//this.generarReporteHistorialPagoNomis("Todos",historialpagonomisSeleccionados ,historialpagonomiImplementable,historialpagonomiImplementableHome);
	}
	
	public void mostrarImportacionHistorialPagoNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionHistorialPagoNomi();
		
		this.abrirFrameImportacionHistorialPagoNomi();		
		
			
		//this.generarReporteHistorialPagoNomis("Todos",historialpagonomisSeleccionados ,historialpagonomiImplementable,historialpagonomiImplementableHome);
	}
	
	public void importarHistorialPagoNomis() throws Exception {		
	
	}
	
	public void exportarHistorialPagoNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelHistorialPagoNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoHistorialPagoNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlHistorialPagoNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Historial Pago Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoHistorialPagoNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();		
		
		historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagonomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarHistorialPagoNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(HistorialPagoNomi historialpagonomiAux:historialpagonomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarHistorialPagoNomi(historialpagonomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//historialpagonomiAux.setsDetalleGeneralEntityReporte(historialpagonomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarHistorialPagoNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=HistorialPagoNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoNomiConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoNomiConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoNomiConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarHistorialPagoNomi(HistorialPagoNomi historialpagonomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=historialpagonomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagonomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagonomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagonomi.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagonomi.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagonomi.getrubroemplea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagonomi.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagonomi.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagonomi.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagonomi.getfecha_liquidacion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelHistorialPagoNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();		
		
		historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagonomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("HistorialPagoNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelHistorialPagoNomi(row);				
				iRow++;
			}				
			
			for(HistorialPagoNomi historialpagonomiAux:historialpagonomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelHistorialPagoNomi(historialpagonomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlHistorialPagoNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();		
		
		historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagonomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("historialpagonomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("historialpagonomi");
			//elementRoot.appendChild(element);
		
			for(HistorialPagoNomi historialpagonomiAux:historialpagonomisSeleccionados) {
				element = document.createElement("historialpagonomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlHistorialPagoNomi(historialpagonomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelHistorialPagoNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelHistorialPagoNomi(HistorialPagoNomi historialpagonomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagonomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagonomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagonomi.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagonomi.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagonomi.getrubroemplea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagonomi.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagonomi.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagonomi.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagonomi.getfecha_liquidacion());				
	}
	
	public void setFilaDatosExportarXmlHistorialPagoNomi(HistorialPagoNomi historialpagonomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(HistorialPagoNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(historialpagonomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(HistorialPagoNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(historialpagonomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(HistorialPagoNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(historialpagonomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementestructura_descripcion = document.createElement(HistorialPagoNomiConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(historialpagonomi.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementempleado_descripcion = document.createElement(HistorialPagoNomiConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(historialpagonomi.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementrubroemplea_descripcion = document.createElement(HistorialPagoNomiConstantesFunciones.IDRUBROEMPLEA);
		elementrubroemplea_descripcion.appendChild(document.createTextNode(historialpagonomi.getrubroemplea_descripcion()));
		element.appendChild(elementrubroemplea_descripcion);

		Element elementmes_descripcion = document.createElement(HistorialPagoNomiConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(historialpagonomi.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementvalor = document.createElement(HistorialPagoNomiConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(historialpagonomi.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementfecha = document.createElement(HistorialPagoNomiConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(historialpagonomi.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementfecha_liquidacion = document.createElement(HistorialPagoNomiConstantesFunciones.FECHALIQUIDACION);
		elementfecha_liquidacion.appendChild(document.createTextNode(historialpagonomi.getfecha_liquidacion().toString().trim()));
		element.appendChild(elementfecha_liquidacion);
	}
	
	public void generarReporteGroupGenericoHistorialPagoNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados=new ArrayList<HistorialPagoNomi>();
		
		historialpagonomisSeleccionados=this.getHistorialPagoNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoHistorialPagoNomi(historialpagonomisSeleccionados);
		
		this.generarReporteHistorialPagoNomis("Todos",historialpagonomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoHistorialPagoNomi(ArrayList<HistorialPagoNomi> historialpagonomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(HistorialPagoNomi historialpagonomiAux:historialpagonomisSeleccionados) {
				historialpagonomiAux.setsDetalleGeneralEntityReporte(historialpagonomiAux.toString());
			
				if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					historialpagonomiAux.setsDescripcionGeneralEntityReporte1(historialpagonomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					historialpagonomiAux.setsDescripcionGeneralEntityReporte1(historialpagonomiAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					historialpagonomiAux.setsDescripcionGeneralEntityReporte1(historialpagonomiAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_IDRUBROEMPLEA)) {
					existe=true;
					historialpagonomiAux.setsDescripcionGeneralEntityReporte1(historialpagonomiAux.getrubroemplea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					historialpagonomiAux.setsDescripcionGeneralEntityReporte1(historialpagonomiAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					historialpagonomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(historialpagonomiAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(HistorialPagoNomiConstantesFunciones.LABEL_FECHALIQUIDACION)) {
					existe=true;
					historialpagonomiAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(historialpagonomiAux.getfecha_liquidacion()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesHistorialPagoNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoHistorialPagoNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=true;
				this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=true;
			}
			
			this.isVisibilidadCeldaModificarHistorialPagoNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=false;
			this.isVisibilidadCeldaModificarHistorialPagoNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=true;
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=false;
			this.isVisibilidadCeldaModificarHistorialPagoNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=true;
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=true;
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=false;
			this.isVisibilidadCeldaModificarHistorialPagoNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=true;
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=true;
			this.isVisibilidadCeldaModificarHistorialPagoNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=false;
			this.isVisibilidadCeldaModificarHistorialPagoNomi=true;
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(HistorialPagoNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=true;
		} else {
			this.actualizarEstadoPanelsHistorialPagoNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarHistorialPagoNomi=false;
			//this.isVisibilidadCeldaVerFormHistorialPagoNomi=false;
			this.isVisibilidadCeldaDuplicarHistorialPagoNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!historialpagonomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoHistorialPagoNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(historialpagonomiSessionBean.getEsGuardarRelacionado()) {
			if(!historialpagonomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=false;												
			}
			
			this.jButtonCerrarHistorialPagoNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.historialpagonomi)) {
			this.isVisibilidadCeldaActualizarHistorialPagoNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialPagoNomi() {
	}
	
	public void actualizarEstadoPanelsHistorialPagoNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionHistorialPagoNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoNomi!=null) {
				this.jScrollPanelDatosHistorialPagoNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialPagoNomi!=null) {
				this.jPanelPaginacionHistorialPagoNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionHistorialPagoNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosHistorialPagoNomi!=null) {
				this.jScrollPanelDatosHistorialPagoNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialPagoNomi!=null) {
				this.jPanelPaginacionHistorialPagoNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionHistorialPagoNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoNomi!=null) {
				this.jScrollPanelDatosHistorialPagoNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialPagoNomi!=null) {
				this.jPanelPaginacionHistorialPagoNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionHistorialPagoNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoNomi!=null) {
				this.jScrollPanelDatosHistorialPagoNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialPagoNomi!=null) {
				this.jPanelPaginacionHistorialPagoNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionHistorialPagoNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoNomi!=null) {
				this.jScrollPanelDatosHistorialPagoNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialPagoNomi!=null) {
				this.jPanelPaginacionHistorialPagoNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionHistorialPagoNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoNomi!=null) {
				this.jScrollPanelDatosHistorialPagoNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialPagoNomi!=null) {
				this.jPanelPaginacionHistorialPagoNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionHistorialPagoNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoNomi!=null) {
				this.jScrollPanelDatosHistorialPagoNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialPagoNomi!=null) {
				this.jPanelPaginacionHistorialPagoNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasHistorialPagoNomi!=null) {
					this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesHistorialPagoNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.historialpagonomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesHistorialPagoNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdEmpleadoHistorialPagoNomi);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdEstructuraHistorialPagoNomi);}

			this.isVisibilidadFK_IdMes=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdMesHistorialPagoNomi);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdRubroEmpleaHistorialPagoNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdEmpleadoHistorialPagoNomi);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdEstructuraHistorialPagoNomi);}

			this.isVisibilidadFK_IdMes=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdMesHistorialPagoNomi);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdRubroEmpleaHistorialPagoNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdEmpleadoHistorialPagoNomi);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdEstructuraHistorialPagoNomi);}

			this.isVisibilidadFK_IdMes=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdMesHistorialPagoNomi);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdRubroEmpleaHistorialPagoNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaRubroEmplea(Boolean isParaRubroEmplea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRubroEmpleaNegation=!isParaRubroEmplea;

			this.isVisibilidadFK_IdEmpleado=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdEmpleadoHistorialPagoNomi);}

			this.isVisibilidadFK_IdEstructura=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdEstructuraHistorialPagoNomi);}

			this.isVisibilidadFK_IdMes=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdMesHistorialPagoNomi);}

			this.isVisibilidadFK_IdRubroEmplea=isParaRubroEmplea;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdRubroEmpleaHistorialPagoNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdEmpleado=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdEmpleadoHistorialPagoNomi);}

			this.isVisibilidadFK_IdEstructura=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdEstructuraHistorialPagoNomi);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdMesHistorialPagoNomi);}

			this.isVisibilidadFK_IdRubroEmplea=isParaMesNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasHistorialPagoNomi.remove(jPanelFK_IdRubroEmpleaHistorialPagoNomi);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//HistorialPagoNomiSessionBean historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
		
		if(this.historialpagonomiSessionBean==null) {
			this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
		}
		
		this.historialpagonomiSessionBean.setsUltimaBusquedaHistorialPagoNomi(this.getsAccionBusqueda());
		this.historialpagonomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.historialpagonomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			historialpagonomiSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			historialpagonomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			historialpagonomiSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			historialpagonomiSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
			historialpagonomiSessionBean.setid_rubro_emplea(this.getid_rubro_empleaFK_IdRubroEmplea());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//HistorialPagoNomiSessionBean historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
		
		if(this.historialpagonomiSessionBean==null) {
			this.historialpagonomiSessionBean=new HistorialPagoNomiSessionBean();
		}
		
		if(this.historialpagonomiSessionBean.getsUltimaBusquedaHistorialPagoNomi()!=null&&!this.historialpagonomiSessionBean.getsUltimaBusquedaHistorialPagoNomi().equals("")) {
			this.setsAccionBusqueda(historialpagonomiSessionBean.getsUltimaBusquedaHistorialPagoNomi());
			this.setiNumeroPaginacion(historialpagonomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(historialpagonomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(historialpagonomiSessionBean.getid_empleado());
				historialpagonomiSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(historialpagonomiSessionBean.getid_empresa());
				historialpagonomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(historialpagonomiSessionBean.getid_estructura());
				historialpagonomiSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(historialpagonomiSessionBean.getid_mes());
				historialpagonomiSessionBean.setid_mes(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
				this.setid_rubro_empleaFK_IdRubroEmplea(historialpagonomiSessionBean.getid_rubro_emplea());
				historialpagonomiSessionBean.setid_rubro_emplea(-1L);
			}
		}
		
		this.historialpagonomiSessionBean.setsUltimaBusquedaHistorialPagoNomi("");
		this.historialpagonomiSessionBean.setiNumeroPaginacion(HistorialPagoNomiConstantesFunciones.INUMEROPAGINACION);
		this.historialpagonomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaHistorialPagoNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioHistorialPagoNomi() {
		this.updateBorderResaltarBusquedasFormularioHistorialPagoNomi();
		this.updateVisibilidadBusquedasFormularioHistorialPagoNomi();
		this.updateHabilitarBusquedasFormularioHistorialPagoNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioHistorialPagoNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasHistorialPagoNomi.getComponents().length>0) {
	

		if(this.historialpagonomiConstantesFunciones.resaltarFK_IdEmpleadoHistorialPagoNomi!=null) {
			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdEmpleadoHistorialPagoNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
				jPanel.setBorder(this.historialpagonomiConstantesFunciones.resaltarFK_IdEmpleadoHistorialPagoNomi);
			}
		}

		if(this.historialpagonomiConstantesFunciones.resaltarFK_IdEstructuraHistorialPagoNomi!=null) {
			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdEstructuraHistorialPagoNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
				jPanel.setBorder(this.historialpagonomiConstantesFunciones.resaltarFK_IdEstructuraHistorialPagoNomi);
			}
		}

		if(this.historialpagonomiConstantesFunciones.resaltarFK_IdMesHistorialPagoNomi!=null) {
			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdMesHistorialPagoNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
				jPanel.setBorder(this.historialpagonomiConstantesFunciones.resaltarFK_IdMesHistorialPagoNomi);
			}
		}

		if(this.historialpagonomiConstantesFunciones.resaltarFK_IdRubroEmpleaHistorialPagoNomi!=null) {
			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdRubroEmpleaHistorialPagoNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
				jPanel.setBorder(this.historialpagonomiConstantesFunciones.resaltarFK_IdRubroEmpleaHistorialPagoNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioHistorialPagoNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasHistorialPagoNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdEmpleadoHistorialPagoNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialpagonomiConstantesFunciones.mostrarFK_IdEmpleadoHistorialPagoNomi);
			if(!this.historialpagonomiConstantesFunciones.mostrarFK_IdEmpleadoHistorialPagoNomi && index>-1) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdEstructuraHistorialPagoNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialpagonomiConstantesFunciones.mostrarFK_IdEstructuraHistorialPagoNomi);
			if(!this.historialpagonomiConstantesFunciones.mostrarFK_IdEstructuraHistorialPagoNomi && index>-1) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdMesHistorialPagoNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialpagonomiConstantesFunciones.mostrarFK_IdMesHistorialPagoNomi);
			if(!this.historialpagonomiConstantesFunciones.mostrarFK_IdMesHistorialPagoNomi && index>-1) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdRubroEmpleaHistorialPagoNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialpagonomiConstantesFunciones.mostrarFK_IdRubroEmpleaHistorialPagoNomi);
			if(!this.historialpagonomiConstantesFunciones.mostrarFK_IdRubroEmpleaHistorialPagoNomi && index>-1) {
				this.jTabbedPaneBusquedasHistorialPagoNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioHistorialPagoNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasHistorialPagoNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdEmpleadoHistorialPagoNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialpagonomiConstantesFunciones.activarFK_IdEmpleadoHistorialPagoNomi);
				this.jTabbedPaneBusquedasHistorialPagoNomi.setEnabledAt(index,this.historialpagonomiConstantesFunciones.activarFK_IdEmpleadoHistorialPagoNomi);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdEstructuraHistorialPagoNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialpagonomiConstantesFunciones.activarFK_IdEstructuraHistorialPagoNomi);
				this.jTabbedPaneBusquedasHistorialPagoNomi.setEnabledAt(index,this.historialpagonomiConstantesFunciones.activarFK_IdEstructuraHistorialPagoNomi);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdMesHistorialPagoNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialpagonomiConstantesFunciones.activarFK_IdMesHistorialPagoNomi);
				this.jTabbedPaneBusquedasHistorialPagoNomi.setEnabledAt(index,this.historialpagonomiConstantesFunciones.activarFK_IdMesHistorialPagoNomi);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdRubroEmpleaHistorialPagoNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialpagonomiConstantesFunciones.activarFK_IdRubroEmpleaHistorialPagoNomi);
				this.jTabbedPaneBusquedasHistorialPagoNomi.setEnabledAt(index,this.historialpagonomiConstantesFunciones.activarFK_IdRubroEmpleaHistorialPagoNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaHistorialPagoNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdEmpleadoHistorialPagoNomi);

			this.jTabbedPaneBusquedasHistorialPagoNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);

			this.historialpagonomiConstantesFunciones.setResaltarFK_IdEmpleadoHistorialPagoNomi(resaltar);

			jPanel.setBorder(this.historialpagonomiConstantesFunciones.resaltarFK_IdEmpleadoHistorialPagoNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdEstructuraHistorialPagoNomi);

			this.jTabbedPaneBusquedasHistorialPagoNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);

			this.historialpagonomiConstantesFunciones.setResaltarFK_IdEstructuraHistorialPagoNomi(resaltar);

			jPanel.setBorder(this.historialpagonomiConstantesFunciones.resaltarFK_IdEstructuraHistorialPagoNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdMesHistorialPagoNomi);

			this.jTabbedPaneBusquedasHistorialPagoNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);

			this.historialpagonomiConstantesFunciones.setResaltarFK_IdMesHistorialPagoNomi(resaltar);

			jPanel.setBorder(this.historialpagonomiConstantesFunciones.resaltarFK_IdMesHistorialPagoNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRubroEmplea")) {
			index= this.jTabbedPaneBusquedasHistorialPagoNomi.indexOfComponent(this.jPanelFK_IdRubroEmpleaHistorialPagoNomi);

			this.jTabbedPaneBusquedasHistorialPagoNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoNomi.getComponent(index);

			this.historialpagonomiConstantesFunciones.setResaltarFK_IdRubroEmpleaHistorialPagoNomi(resaltar);

			jPanel.setBorder(this.historialpagonomiConstantesFunciones.resaltarFK_IdRubroEmpleaHistorialPagoNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarHistorialPagoNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioHistorialPagoNomi() throws Exception {

		if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioHistorialPagoNomi();
		this.updateVisibilidadResaltarControlesFormularioHistorialPagoNomi();
		this.updateHabilitarResaltarControlesFormularioHistorialPagoNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioHistorialPagoNomi() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.historialpagonomiConstantesFunciones.resaltaridHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.setBorder(this.historialpagonomiConstantesFunciones.resaltaridHistorialPagoNomi);}
		if(this.historialpagonomiConstantesFunciones.resaltarid_empresaHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.setBorder(this.historialpagonomiConstantesFunciones.resaltarid_empresaHistorialPagoNomi);}
		if(this.historialpagonomiConstantesFunciones.resaltarid_estructuraHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.setBorder(this.historialpagonomiConstantesFunciones.resaltarid_estructuraHistorialPagoNomi);}
		if(this.historialpagonomiConstantesFunciones.resaltarid_empleadoHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.setBorder(this.historialpagonomiConstantesFunciones.resaltarid_empleadoHistorialPagoNomi);}
		if(this.historialpagonomiConstantesFunciones.resaltarid_rubro_empleaHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.setBorder(this.historialpagonomiConstantesFunciones.resaltarid_rubro_empleaHistorialPagoNomi);}
		if(this.historialpagonomiConstantesFunciones.resaltarid_mesHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.setBorder(this.historialpagonomiConstantesFunciones.resaltarid_mesHistorialPagoNomi);}
		if(this.historialpagonomiConstantesFunciones.resaltarvalorHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoNomi.jTextFieldvalorHistorialPagoNomi.setBorder(this.historialpagonomiConstantesFunciones.resaltarvalorHistorialPagoNomi);}
		if(this.historialpagonomiConstantesFunciones.resaltarfechaHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfechaHistorialPagoNomi.setBorder(this.historialpagonomiConstantesFunciones.resaltarfechaHistorialPagoNomi);}
		if(this.historialpagonomiConstantesFunciones.resaltarfecha_liquidacionHistorialPagoNomi!=null && this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfecha_liquidacionHistorialPagoNomi.setBorder(this.historialpagonomiConstantesFunciones.resaltarfecha_liquidacionHistorialPagoNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioHistorialPagoNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
	
		//this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostraridHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelidHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostraridHistorialPagoNomi);
		//this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarid_empresaHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelid_empresaHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarid_empresaHistorialPagoNomi);
		//this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarid_estructuraHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelid_estructuraHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarid_estructuraHistorialPagoNomi);
		//this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarid_empleadoHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelid_empleadoHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarid_empleadoHistorialPagoNomi);
		//this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarid_rubro_empleaHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelid_rubro_empleaHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarid_rubro_empleaHistorialPagoNomi);
		//this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarid_mesHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelid_mesHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarid_mesHistorialPagoNomi);
		//this.jInternalFrameDetalleFormHistorialPagoNomi.jTextFieldvalorHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarvalorHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelvalorHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarvalorHistorialPagoNomi);
		//this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfechaHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarfechaHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelfechaHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarfechaHistorialPagoNomi);
		//this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfecha_liquidacionHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarfecha_liquidacionHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jPanelfecha_liquidacionHistorialPagoNomi.setVisible(this.historialpagonomiConstantesFunciones.mostrarfecha_liquidacionHistorialPagoNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioHistorialPagoNomi() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialPagoNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialPagoNomi!=null) {
	
		this.jInternalFrameDetalleFormHistorialPagoNomi.jLabelidHistorialPagoNomi.setEnabled(this.historialpagonomiConstantesFunciones.activaridHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empresaHistorialPagoNomi.setEnabled(this.historialpagonomiConstantesFunciones.activarid_empresaHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_estructuraHistorialPagoNomi.setEnabled(this.historialpagonomiConstantesFunciones.activarid_estructuraHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_empleadoHistorialPagoNomi.setEnabled(this.historialpagonomiConstantesFunciones.activarid_empleadoHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_rubro_empleaHistorialPagoNomi.setEnabled(this.historialpagonomiConstantesFunciones.activarid_rubro_empleaHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jComboBoxid_mesHistorialPagoNomi.setEnabled(this.historialpagonomiConstantesFunciones.activarid_mesHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jTextFieldvalorHistorialPagoNomi.setEnabled(this.historialpagonomiConstantesFunciones.activarvalorHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfechaHistorialPagoNomi.setEnabled(this.historialpagonomiConstantesFunciones.activarfechaHistorialPagoNomi);
		this.jInternalFrameDetalleFormHistorialPagoNomi.jDateChooserfecha_liquidacionHistorialPagoNomi.setEnabled(this.historialpagonomiConstantesFunciones.activarfecha_liquidacionHistorialPagoNomi);
		}
	}
	
		
}