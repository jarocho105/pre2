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

import com.bydan.erp.nomina.util.HistorialPagoMesNomiConstantesFunciones;
import com.bydan.erp.nomina.util.HistorialPagoMesNomiParameterReturnGeneral;
//import com.bydan.erp.nomina.util.HistorialPagoMesNomiParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.HistorialPagoMesNomiBean;
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
public class HistorialPagoMesNomiBeanSwingJInternalFrame extends HistorialPagoMesNomiJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(HistorialPagoMesNomiBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<HistorialPagoMesNomi> historialpagomesnomiValidator = new ClassValidator<HistorialPagoMesNomi>(HistorialPagoMesNomi.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public HistorialPagoMesNomi historialpagomesnomi;	
	public HistorialPagoMesNomi historialpagomesnomiAux;
	public HistorialPagoMesNomi historialpagomesnomiAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public HistorialPagoMesNomi historialpagomesnomiTotales;
	public Long idHistorialPagoMesNomiActual;
	public Long iIdNuevoHistorialPagoMesNomi=0L;
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

	public String sFinalQueryComboAnio="";

	public List<Anio> aniosForeignKey;

	public List<Anio> getaniosForeignKey() {
		return aniosForeignKey;
	}

	public void setaniosForeignKey(List<Anio> aniosForeignKey) {
		this.aniosForeignKey = aniosForeignKey;
	}

	//OBJETO FK ACTUAL
	public Anio anioForeignKey;

	public Anio getanioForeignKey() {
		return anioForeignKey;
	}

	public void setanioForeignKey(Anio anioForeignKey) {
		this.anioForeignKey = anioForeignKey;
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
	
	public Boolean isPermisoTodoHistorialPagoMesNomi;
	public Boolean isPermisoNuevoHistorialPagoMesNomi;
	public Boolean isPermisoActualizarHistorialPagoMesNomi;
	public Boolean isPermisoActualizarOriginalHistorialPagoMesNomi;
	public Boolean isPermisoEliminarHistorialPagoMesNomi;
	public Boolean isPermisoGuardarCambiosHistorialPagoMesNomi;
	public Boolean isPermisoConsultaHistorialPagoMesNomi;
	public Boolean isPermisoBusquedaHistorialPagoMesNomi;
	public Boolean isPermisoReporteHistorialPagoMesNomi;
	public Boolean isPermisoPaginacionMedioHistorialPagoMesNomi;
	public Boolean isPermisoPaginacionAltoHistorialPagoMesNomi;
	public Boolean isPermisoPaginacionTodoHistorialPagoMesNomi;
	public Boolean isPermisoCopiarHistorialPagoMesNomi;
	public Boolean isPermisoVerFormHistorialPagoMesNomi;
	public Boolean isPermisoDuplicarHistorialPagoMesNomi;
	public Boolean isPermisoOrdenHistorialPagoMesNomi;
	
	
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
	
	public HistorialPagoMesNomiParameterReturnGeneral historialpagomesnomiReturnGeneral;
	public HistorialPagoMesNomiParameterReturnGeneral historialpagomesnomiParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoHistorialPagoMesNomi=false;
	public Boolean esParaAccionDesdeFormularioHistorialPagoMesNomi=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected HistorialPagoMesNomiSessionBeanAdditional historialpagomesnomiSessionBeanAdditional=null;
	
	public HistorialPagoMesNomiSessionBeanAdditional getHistorialPagoMesNomiSessionBeanAdditional() {
		return this.historialpagomesnomiSessionBeanAdditional;
	}
	
	public void setHistorialPagoMesNomiSessionBeanAdditional(HistorialPagoMesNomiSessionBeanAdditional historialpagomesnomiSessionBeanAdditional) {
		try {
			this.historialpagomesnomiSessionBeanAdditional=historialpagomesnomiSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected HistorialPagoMesNomiBeanSwingJInternalFrameAdditional historialpagomesnomiBeanSwingJInternalFrameAdditional=null;
	//public class HistorialPagoMesNomiBeanSwingJInternalFrame
	
	public HistorialPagoMesNomiBeanSwingJInternalFrameAdditional getHistorialPagoMesNomiBeanSwingJInternalFrameAdditional() {
		return this.historialpagomesnomiBeanSwingJInternalFrameAdditional;
	}
	
	public void setHistorialPagoMesNomiBeanSwingJInternalFrameAdditional(HistorialPagoMesNomiBeanSwingJInternalFrameAdditional historialpagomesnomiBeanSwingJInternalFrameAdditional) {
		try {
			this.historialpagomesnomiBeanSwingJInternalFrameAdditional=historialpagomesnomiBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public HistorialPagoMesNomiLogic historialpagomesnomiLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public HistorialPagoMesNomi historialpagomesnomiBean;
	public HistorialPagoMesNomiConstantesFunciones historialpagomesnomiConstantesFunciones;
	//public HistorialPagoMesNomiParameterReturnGeneral historialpagomesnomiReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public RubroEmpleaLogic rubroempleaLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<HistorialPagoMesNomi> historialpagomesnomis;	
	//public List<HistorialPagoMesNomi> historialpagomesnomisEliminados;
	//public List<HistorialPagoMesNomi> historialpagomesnomisAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoHistorialPagoMesNomi=false;
	public Boolean isVisibilidadCeldaDuplicarHistorialPagoMesNomi=true;
	public Boolean isVisibilidadCeldaCopiarHistorialPagoMesNomi=true;
	public Boolean isVisibilidadCeldaVerFormHistorialPagoMesNomi=true;
	public Boolean isVisibilidadCeldaOrdenHistorialPagoMesNomi=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=false;
	public Boolean isVisibilidadCeldaModificarHistorialPagoMesNomi=false;
	public Boolean isVisibilidadCeldaActualizarHistorialPagoMesNomi=false;
	public Boolean isVisibilidadCeldaEliminarHistorialPagoMesNomi=false;
	public Boolean isVisibilidadCeldaCancelarHistorialPagoMesNomi=false;
	public Boolean isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdRubroEmplea=false;
	
	public Long getiIdNuevoHistorialPagoMesNomi() {
		return this.iIdNuevoHistorialPagoMesNomi;
	}

	public void setiIdNuevoHistorialPagoMesNomi(Long iIdNuevoHistorialPagoMesNomi) {
		this.iIdNuevoHistorialPagoMesNomi = iIdNuevoHistorialPagoMesNomi;
	}
	
	public Long getidHistorialPagoMesNomiActual() {
		return this.idHistorialPagoMesNomiActual;
	}

	public void setidHistorialPagoMesNomiActual(Long idHistorialPagoMesNomiActual) {
		this.idHistorialPagoMesNomiActual = idHistorialPagoMesNomiActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public HistorialPagoMesNomi gethistorialpagomesnomi() {
		return this.historialpagomesnomi;
	}

	public void sethistorialpagomesnomi(HistorialPagoMesNomi historialpagomesnomi) {
		this.historialpagomesnomi = historialpagomesnomi;
	}
	
	public HistorialPagoMesNomi gethistorialpagomesnomiAux() {
		return this.historialpagomesnomiAux;
	}

	public void sethistorialpagomesnomiAux(HistorialPagoMesNomi historialpagomesnomiAux) {
		this.historialpagomesnomiAux = historialpagomesnomiAux;
	}				
	
	public HistorialPagoMesNomi gethistorialpagomesnomiAnterior() {
		return this.historialpagomesnomiAnterior;
	}

	public void sethistorialpagomesnomiAnterior(HistorialPagoMesNomi historialpagomesnomiAnterior) {
		this.historialpagomesnomiAnterior = historialpagomesnomiAnterior;
	}	
	
	public HistorialPagoMesNomi gethistorialpagomesnomiTotales() {
		return this.historialpagomesnomiTotales;
	}

	public void sethistorialpagomesnomiTotales(HistorialPagoMesNomi historialpagomesnomiTotales) {
		this.historialpagomesnomiTotales = historialpagomesnomiTotales;
	}	
	
	public HistorialPagoMesNomi gethistorialpagomesnomiBean() {
		return this.historialpagomesnomiBean;
	}

	public void sethistorialpagomesnomiBean(HistorialPagoMesNomi historialpagomesnomiBean) {
		this.historialpagomesnomiBean = historialpagomesnomiBean;
	}	
	
	public HistorialPagoMesNomiParameterReturnGeneral gethistorialpagomesnomiReturnGeneral() {
		return this.historialpagomesnomiReturnGeneral;
	}

	public void sethistorialpagomesnomiReturnGeneral(HistorialPagoMesNomiParameterReturnGeneral historialpagomesnomiReturnGeneral) {
		this.historialpagomesnomiReturnGeneral = historialpagomesnomiReturnGeneral;
	}	
	
	
	public Long id_anioFK_IdAnio=null;

	public Long getid_anioFK_IdAnio() {
		return this.id_anioFK_IdAnio;
	}

	public void setid_anioFK_IdAnio(Long id_anioFK_IdAnio) {
		this.id_anioFK_IdAnio = id_anioFK_IdAnio;
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
	
	
	public HistorialPagoMesNomiLogic getHistorialPagoMesNomiLogic()	{		
		return historialpagomesnomiLogic;
	}

	public void setHistorialPagoMesNomiLogic(HistorialPagoMesNomiLogic historialpagomesnomiLogic) {
		this.historialpagomesnomiLogic = historialpagomesnomiLogic;
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
	
	public Boolean getIsEsNuevoHistorialPagoMesNomi() {
		return isEsNuevoHistorialPagoMesNomi;
	}

	public void setIsEsNuevoHistorialPagoMesNomi(Boolean isEsNuevoHistorialPagoMesNomi) {
		this.isEsNuevoHistorialPagoMesNomi = isEsNuevoHistorialPagoMesNomi;
	}

	public Boolean getEsParaAccionDesdeFormularioHistorialPagoMesNomi() {
		return esParaAccionDesdeFormularioHistorialPagoMesNomi;
	}
	
	public void setEsParaAccionDesdeFormularioHistorialPagoMesNomi(Boolean esParaAccionDesdeFormularioHistorialPagoMesNomi) {
		this.esParaAccionDesdeFormularioHistorialPagoMesNomi = esParaAccionDesdeFormularioHistorialPagoMesNomi;
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

			if(this.historialpagomesnomiSessionBean==null) {
				this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
			}

			if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(historialpagomesnomiSessionBean.getlidEmpresaActual());
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

			if(this.historialpagomesnomiSessionBean==null) {
				this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
			}

			if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(historialpagomesnomiSessionBean.getlidEmpleadoActual());
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

			if(this.historialpagomesnomiSessionBean==null) {
				this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
			}

			if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
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
					rubroempleaLogic.getEntityWithConnection(historialpagomesnomiSessionBean.getlidRubroEmpleaActual());
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

	public void cargarCombosAniosForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.aniosForeignKey=new ArrayList<Anio>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			AnioLogic anioLogic=new AnioLogic();

			//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

			if(this.historialpagomesnomiSessionBean==null) {
				this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
			}

			if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//anioLogic.getAnioDataAccess().setIsForForeingKeyData(true);

					anioLogic.getTodosAniosWithConnection(sFinalQuery,new Pagination());

					this.aniosForeignKey=anioLogic.getAnios();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaAnio(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					anioLogic.getEntityWithConnection(historialpagomesnomiSessionBean.getlidAnioActual());
					this.aniosForeignKey.add(anioLogic.getAnio());
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

			if(this.historialpagomesnomiSessionBean==null) {
				this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
			}

			if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(historialpagomesnomiSessionBean.getlidMesActual());
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

					if(this.historialpagomesnomi!=null) {
						this.historialpagomesnomi.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
						this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaHistorialPagoMesNomi.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaHistorialPagoMesNomiGenerico)throws Exception
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
				jComboBoxid_empresaHistorialPagoMesNomiGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaHistorialPagoMesNomiGenerico!=null && jComboBoxid_empresaHistorialPagoMesNomiGenerico.getItemCount()>0) {
					jComboBoxid_empresaHistorialPagoMesNomiGenerico.setSelectedIndex(0);
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

					if(this.historialpagomesnomi!=null) {
						this.historialpagomesnomi.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
						this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoHistorialPagoMesNomi.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoHistorialPagoMesNomiGenerico)throws Exception
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
				jComboBoxid_empleadoHistorialPagoMesNomiGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoHistorialPagoMesNomiGenerico!=null && jComboBoxid_empleadoHistorialPagoMesNomiGenerico.getItemCount()>0) {
					jComboBoxid_empleadoHistorialPagoMesNomiGenerico.setSelectedIndex(0);
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

					if(this.historialpagomesnomi!=null) {
						this.historialpagomesnomi.setRubroEmplea(rubroempleaTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
						this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.setSelectedItem(rubroempleaTemp);
					}
				} else {
					//jComboBoxid_rubro_empleaHistorialPagoMesNomi.setSelectedItem(rubroempleaTemp);
					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){
					if(rubroempleaTemp!=null && jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi!=null) {
						jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setSelectedItem(rubroempleaTemp);
					} else {
						if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi!=null) {
							//jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setSelectedItem(rubroempleaTemp);
							if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.getItemCount()>0) {
								jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setSelectedIndex(0);
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
	public void setActualRubroEmpleaForeignKeyGenerico(Long idRubroEmpleaSeleccionado,JComboBox jComboBoxid_rubro_empleaHistorialPagoMesNomiGenerico)throws Exception
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
				jComboBoxid_rubro_empleaHistorialPagoMesNomiGenerico.setSelectedItem(rubroempleaTemp);
			} else {
				if(jComboBoxid_rubro_empleaHistorialPagoMesNomiGenerico!=null && jComboBoxid_rubro_empleaHistorialPagoMesNomiGenerico.getItemCount()>0) {
					jComboBoxid_rubro_empleaHistorialPagoMesNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualAnioForeignKey(Long idAnioSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(anioTemp!=null) {

					if(this.historialpagomesnomi!=null) {
						this.historialpagomesnomi.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
						this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioHistorialPagoMesNomi.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi!=null) {
						jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi!=null) {
							//jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.setSelectedIndex(0);
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

	public String getActualAnioForeignKeyDescripcion(Long idAnioSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}


			sDescripcion=AnioConstantesFunciones.getAnioDescripcion(anioTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioHistorialPagoMesNomiGenerico)throws Exception
	{
		try
		{
			Anio  anioTemp=null;

			for(Anio anioAux:aniosForeignKey) {
				if(anioAux.getId()!=null && anioAux.getId().equals(idAnioSeleccionado)) {
					anioTemp=anioAux;
					break;
				}
			}

			if(anioTemp!=null) {
				jComboBoxid_anioHistorialPagoMesNomiGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioHistorialPagoMesNomiGenerico!=null && jComboBoxid_anioHistorialPagoMesNomiGenerico.getItemCount()>0) {
					jComboBoxid_anioHistorialPagoMesNomiGenerico.setSelectedIndex(0);
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

					if(this.historialpagomesnomi!=null) {
						this.historialpagomesnomi.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
						this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesHistorialPagoMesNomi.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.getItemCount()>0) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesHistorialPagoMesNomi!=null) {
						jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesHistorialPagoMesNomi!=null) {
							//jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesHistorialPagoMesNomiGenerico)throws Exception
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
				jComboBoxid_mesHistorialPagoMesNomiGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesHistorialPagoMesNomiGenerico!=null && jComboBoxid_mesHistorialPagoMesNomiGenerico.getItemCount()>0) {
					jComboBoxid_mesHistorialPagoMesNomiGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(HistorialPagoMesNomi historialpagomesnomi,JComboBox jComboBoxid_empresaHistorialPagoMesNomiGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaHistorialPagoMesNomiGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaHistorialPagoMesNomiGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				historialpagomesnomi.setid_empresa(empresaAux.getId());
				historialpagomesnomi.setempresa_descripcion(HistorialPagoMesNomiConstantesFunciones.getEmpresaDescripcion(empresaAux));
				historialpagomesnomi.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(HistorialPagoMesNomi historialpagomesnomi,JComboBox jComboBoxid_empleadoHistorialPagoMesNomiGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoHistorialPagoMesNomiGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoHistorialPagoMesNomiGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				historialpagomesnomi.setid_empleado(empleadoAux.getId());
				historialpagomesnomi.setempleado_descripcion(HistorialPagoMesNomiConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				historialpagomesnomi.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRubroEmpleaForeignKey(HistorialPagoMesNomi historialpagomesnomi,JComboBox jComboBoxid_rubro_empleaHistorialPagoMesNomiGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaAux=new RubroEmplea();

			if(jComboBoxid_rubro_empleaHistorialPagoMesNomiGenerico==null) {
				rubroempleaAux=(RubroEmplea)this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.getSelectedItem();
			} else {
				rubroempleaAux=(RubroEmplea)jComboBoxid_rubro_empleaHistorialPagoMesNomiGenerico.getSelectedItem();
			}

			if(rubroempleaAux!=null && rubroempleaAux.getId()!=null) {
				historialpagomesnomi.setid_rubro_emplea(rubroempleaAux.getId());
				historialpagomesnomi.setrubroemplea_descripcion(HistorialPagoMesNomiConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaAux));
				historialpagomesnomi.setRubroEmplea(rubroempleaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(HistorialPagoMesNomi historialpagomesnomi,JComboBox jComboBoxid_anioHistorialPagoMesNomiGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioHistorialPagoMesNomiGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioHistorialPagoMesNomiGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				historialpagomesnomi.setid_anio(anioAux.getId());
				historialpagomesnomi.setanio_descripcion(HistorialPagoMesNomiConstantesFunciones.getAnioDescripcion(anioAux));
				historialpagomesnomi.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(HistorialPagoMesNomi historialpagomesnomi,JComboBox jComboBoxid_mesHistorialPagoMesNomiGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesHistorialPagoMesNomiGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesHistorialPagoMesNomiGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				historialpagomesnomi.setid_mes(mesAux.getId());
				historialpagomesnomi.setmes_descripcion(HistorialPagoMesNomiConstantesFunciones.getMesDescripcion(mesAux));
				historialpagomesnomi.setMes(mesAux);			}
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

					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { 
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { 
					}

					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {


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

					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { 
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { 
					}

					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.addItem(empleado);
							}
						}

						if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { 
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.addItem(rubroemplea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { 
					}

					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.addItem(rubroemplea);
							}
						}

						if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameAniosForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingAnio=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { 
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { 
					}

					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.addItem(anio);
							}
						}

						if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
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

					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { 
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { 
					}

					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.addItem(mes);
							}
						}

						if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.setSelectedIndex(iIndexSelected);
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

		public void setSelectedItemCombosFrameEmpleadoForeignKey(Empleado empleado,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.setSelectedItem(rubroemplea);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setSelectedItem(rubroemplea);
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameAnioForeignKey(Anio anio,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesHistorialPagoMesNomi() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			HistorialPagoMesNomiConstantesFunciones.refrescarForeignKeysDescripcionesHistorialPagoMesNomi(this.historialpagomesnomiLogic.getHistorialPagoMesNomis());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			HistorialPagoMesNomiConstantesFunciones.refrescarForeignKeysDescripcionesHistorialPagoMesNomi(this.historialpagomesnomis);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(RubroEmplea.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//historialpagomesnomiLogic.setHistorialPagoMesNomis(this.historialpagomesnomis);
			historialpagomesnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public HistorialPagoMesNomiParameterReturnGeneral getHistorialPagoMesNomiParameterGeneral() {
		return this.historialpagomesnomiParameterGeneral;
	}
	
	public void setHistorialPagoMesNomiParameterGeneral(HistorialPagoMesNomiParameterReturnGeneral historialpagomesnomiParameterGeneral) {
		this.historialpagomesnomiParameterGeneral = historialpagomesnomiParameterGeneral;
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
	
	public Boolean getIsPermisoTodoHistorialPagoMesNomi() {
		return isPermisoTodoHistorialPagoMesNomi;
	}

	public void setIsPermisoTodoHistorialPagoMesNomi(Boolean isPermisoTodoHistorialPagoMesNomi) {
		this.isPermisoTodoHistorialPagoMesNomi = isPermisoTodoHistorialPagoMesNomi;
	}

	public Boolean getIsPermisoNuevoHistorialPagoMesNomi() {
		return isPermisoNuevoHistorialPagoMesNomi;
	}

	public void setIsPermisoNuevoHistorialPagoMesNomi(Boolean isPermisoNuevoHistorialPagoMesNomi) {
		this.isPermisoNuevoHistorialPagoMesNomi = isPermisoNuevoHistorialPagoMesNomi;
	}

	public Boolean getIsPermisoActualizarHistorialPagoMesNomi() {
		return isPermisoActualizarHistorialPagoMesNomi;
	}

	public void setIsPermisoActualizarHistorialPagoMesNomi(Boolean isPermisoActualizarHistorialPagoMesNomi) {
		this.isPermisoActualizarHistorialPagoMesNomi = isPermisoActualizarHistorialPagoMesNomi;
	}

	public Boolean getIsPermisoEliminarHistorialPagoMesNomi() {
		return isPermisoEliminarHistorialPagoMesNomi;
	}

	public void setIsPermisoEliminarHistorialPagoMesNomi(Boolean isPermisoEliminarHistorialPagoMesNomi) {
		this.isPermisoEliminarHistorialPagoMesNomi = isPermisoEliminarHistorialPagoMesNomi;
	}

	public Boolean getIsPermisoGuardarCambiosHistorialPagoMesNomi() {
		return isPermisoGuardarCambiosHistorialPagoMesNomi;
	}

	public void setIsPermisoGuardarCambiosHistorialPagoMesNomi(Boolean isPermisoGuardarCambiosHistorialPagoMesNomi) {
		this.isPermisoGuardarCambiosHistorialPagoMesNomi = isPermisoGuardarCambiosHistorialPagoMesNomi;
	}
	
	public Boolean getIsPermisoConsultaHistorialPagoMesNomi() {
		return isPermisoConsultaHistorialPagoMesNomi;
	}

	public void setIsPermisoConsultaHistorialPagoMesNomi(Boolean isPermisoConsultaHistorialPagoMesNomi) {
		this.isPermisoConsultaHistorialPagoMesNomi = isPermisoConsultaHistorialPagoMesNomi;
	}

	public Boolean getIsPermisoBusquedaHistorialPagoMesNomi() {
		return isPermisoBusquedaHistorialPagoMesNomi;
	}

	public void setIsPermisoBusquedaHistorialPagoMesNomi(Boolean isPermisoBusquedaHistorialPagoMesNomi) {
		this.isPermisoBusquedaHistorialPagoMesNomi = isPermisoBusquedaHistorialPagoMesNomi;
	}

	public Boolean getIsPermisoReporteHistorialPagoMesNomi() {
		return isPermisoReporteHistorialPagoMesNomi;
	}

	public void setIsPermisoReporteHistorialPagoMesNomi(Boolean isPermisoReporteHistorialPagoMesNomi) {
		this.isPermisoReporteHistorialPagoMesNomi = isPermisoReporteHistorialPagoMesNomi;
	}
	
	public Boolean getIsPermisoPaginacionMedioHistorialPagoMesNomi() {
		return isPermisoPaginacionMedioHistorialPagoMesNomi;
	}

	public void setIsPermisoPaginacionMedioHistorialPagoMesNomi(Boolean isPermisoPaginacionMedioHistorialPagoMesNomi) {
		this.isPermisoPaginacionMedioHistorialPagoMesNomi = isPermisoPaginacionMedioHistorialPagoMesNomi;
	}
	
	public Boolean getIsPermisoPaginacionTodoHistorialPagoMesNomi() {
		return isPermisoPaginacionTodoHistorialPagoMesNomi;
	}

	public void setIsPermisoPaginacionTodoHistorialPagoMesNomi(Boolean isPermisoPaginacionTodoHistorialPagoMesNomi) {
		this.isPermisoPaginacionTodoHistorialPagoMesNomi = isPermisoPaginacionTodoHistorialPagoMesNomi;
	}
	
	public Boolean getIsPermisoPaginacionAltoHistorialPagoMesNomi() {
		return isPermisoPaginacionAltoHistorialPagoMesNomi;
	}

	public void setIsPermisoPaginacionAltoHistorialPagoMesNomi(Boolean isPermisoPaginacionAltoHistorialPagoMesNomi) {
		this.isPermisoPaginacionAltoHistorialPagoMesNomi = isPermisoPaginacionAltoHistorialPagoMesNomi;
	}
	
	public Boolean getIsPermisoCopiarHistorialPagoMesNomi() {
		return isPermisoCopiarHistorialPagoMesNomi;
	}

	public void setIsPermisoCopiarHistorialPagoMesNomi(Boolean isPermisoCopiarHistorialPagoMesNomi) {
		this.isPermisoCopiarHistorialPagoMesNomi = isPermisoCopiarHistorialPagoMesNomi;
	}
	
	public Boolean getIsPermisoVerFormHistorialPagoMesNomi() {
		return isPermisoVerFormHistorialPagoMesNomi;
	}

	public void setIsPermisoVerFormHistorialPagoMesNomi(Boolean isPermisoVerFormHistorialPagoMesNomi) {
		this.isPermisoVerFormHistorialPagoMesNomi = isPermisoVerFormHistorialPagoMesNomi;
	}
	
	public Boolean getIsPermisoDuplicarHistorialPagoMesNomi() {
		return isPermisoDuplicarHistorialPagoMesNomi;
	}

	public void setIsPermisoDuplicarHistorialPagoMesNomi(Boolean isPermisoDuplicarHistorialPagoMesNomi) {
		this.isPermisoDuplicarHistorialPagoMesNomi = isPermisoDuplicarHistorialPagoMesNomi;
	}
	
	public Boolean getIsPermisoOrdenHistorialPagoMesNomi() {
		return isPermisoOrdenHistorialPagoMesNomi;
	}

	public void setIsPermisoOrdenHistorialPagoMesNomi(Boolean isPermisoOrdenHistorialPagoMesNomi) {
		this.isPermisoOrdenHistorialPagoMesNomi = isPermisoOrdenHistorialPagoMesNomi;
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
	
	public Boolean getIsVisibilidadCeldaNuevoHistorialPagoMesNomi() {
		return isVisibilidadCeldaNuevoHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaNuevoHistorialPagoMesNomi(Boolean isVisibilidadCeldaNuevoHistorialPagoMesNomi) {
		this.isVisibilidadCeldaNuevoHistorialPagoMesNomi = isVisibilidadCeldaNuevoHistorialPagoMesNomi;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarHistorialPagoMesNomi() {
		return isVisibilidadCeldaDuplicarHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaDuplicarHistorialPagoMesNomi(Boolean isVisibilidadCeldaDuplicarHistorialPagoMesNomi) {
		this.isVisibilidadCeldaDuplicarHistorialPagoMesNomi = isVisibilidadCeldaDuplicarHistorialPagoMesNomi;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarHistorialPagoMesNomi() {
		return isVisibilidadCeldaCopiarHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaCopiarHistorialPagoMesNomi(Boolean isVisibilidadCeldaCopiarHistorialPagoMesNomi) {
		this.isVisibilidadCeldaCopiarHistorialPagoMesNomi = isVisibilidadCeldaCopiarHistorialPagoMesNomi;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormHistorialPagoMesNomi() {
		return isVisibilidadCeldaVerFormHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaVerFormHistorialPagoMesNomi(Boolean isVisibilidadCeldaVerFormHistorialPagoMesNomi) {
		this.isVisibilidadCeldaVerFormHistorialPagoMesNomi = isVisibilidadCeldaVerFormHistorialPagoMesNomi;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenHistorialPagoMesNomi() {
		return isVisibilidadCeldaOrdenHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaOrdenHistorialPagoMesNomi(Boolean isVisibilidadCeldaOrdenHistorialPagoMesNomi) {
		this.isVisibilidadCeldaOrdenHistorialPagoMesNomi = isVisibilidadCeldaOrdenHistorialPagoMesNomi;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi() {
		return isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi(Boolean isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi) {
		this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi = isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi;
	}
	
	public Boolean getIsVisibilidadCeldaModificarHistorialPagoMesNomi() {
		return isVisibilidadCeldaModificarHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaModificarHistorialPagoMesNomi(Boolean isVisibilidadCeldaModificarHistorialPagoMesNomi) {
		this.isVisibilidadCeldaModificarHistorialPagoMesNomi = isVisibilidadCeldaModificarHistorialPagoMesNomi;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarHistorialPagoMesNomi() {
		return isVisibilidadCeldaActualizarHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaActualizarHistorialPagoMesNomi(Boolean isVisibilidadCeldaActualizarHistorialPagoMesNomi) {
		this.isVisibilidadCeldaActualizarHistorialPagoMesNomi = isVisibilidadCeldaActualizarHistorialPagoMesNomi;
	}

	public Boolean getIsVisibilidadCeldaEliminarHistorialPagoMesNomi() {
		return isVisibilidadCeldaEliminarHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaEliminarHistorialPagoMesNomi(Boolean isVisibilidadCeldaEliminarHistorialPagoMesNomi) {
		this.isVisibilidadCeldaEliminarHistorialPagoMesNomi = isVisibilidadCeldaEliminarHistorialPagoMesNomi;
	}

	public Boolean getIsVisibilidadCeldaCancelarHistorialPagoMesNomi() {
		return isVisibilidadCeldaCancelarHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaCancelarHistorialPagoMesNomi(Boolean isVisibilidadCeldaCancelarHistorialPagoMesNomi) {
		this.isVisibilidadCeldaCancelarHistorialPagoMesNomi = isVisibilidadCeldaCancelarHistorialPagoMesNomi;
	}

	public Boolean getIsVisibilidadCeldaGuardarHistorialPagoMesNomi() {
		return isVisibilidadCeldaGuardarHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaGuardarHistorialPagoMesNomi(Boolean isVisibilidadCeldaGuardarHistorialPagoMesNomi) {
		this.isVisibilidadCeldaGuardarHistorialPagoMesNomi = isVisibilidadCeldaGuardarHistorialPagoMesNomi;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi() {
		return isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi;
	}

	public void setIsVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi(Boolean isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi) {
		this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi = isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi;
	}
		
	public HistorialPagoMesNomiSessionBean gethistorialpagomesnomiSessionBean() {
		return this.historialpagomesnomiSessionBean;
	}
	
	public void sethistorialpagomesnomiSessionBean(HistorialPagoMesNomiSessionBean historialpagomesnomiSessionBean) {
		this.historialpagomesnomiSessionBean=historialpagomesnomiSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdAnio() {
		return this.isVisibilidadFK_IdAnio;
	}

	public void setisVisibilidadFK_IdAnio(Boolean isVisibilidadFK_IdAnio) {
		this.isVisibilidadFK_IdAnio=isVisibilidadFK_IdAnio;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(historialpagomesnomi,null);
				this.setActualParaGuardarEmpleadoForeignKey(historialpagomesnomi,null);
				this.setActualParaGuardarRubroEmpleaForeignKey(historialpagomesnomi,null);
				this.setActualParaGuardarAnioForeignKey(historialpagomesnomi,null);
				this.setActualParaGuardarMesForeignKey(historialpagomesnomi,null);
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
	
	public void bugActualizarReferenciaActual(HistorialPagoMesNomi historialpagomesnomi,HistorialPagoMesNomi historialpagomesnomiAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalHistorialPagoMesNomi(historialpagomesnomi);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		historialpagomesnomiAux.setId(historialpagomesnomi.getId());
		historialpagomesnomiAux.setVersionRow(historialpagomesnomi.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessHistorialPagoMesNomi();
		
			int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = historialpagomesnomiValidator.getInvalidValues(this.historialpagomesnomi);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			historialpagomesnomiLogic.setDatosCliente(datosCliente);
			historialpagomesnomiLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				historialpagomesnomiAux=new  HistorialPagoMesNomi();
				
				historialpagomesnomiAux.setIsNew(true);
				historialpagomesnomiAux.setIsChanged(true);
				
				historialpagomesnomiAux.setHistorialPagoMesNomiOriginal(this.historialpagomesnomi);
				
				historialpagomesnomiAux.setId(this.historialpagomesnomi.getId());	
				historialpagomesnomiAux.setVersionRow(this.historialpagomesnomi.getVersionRow());	
				historialpagomesnomiAux.setid_empresa(this.historialpagomesnomi.getid_empresa());	
				historialpagomesnomiAux.setid_empleado(this.historialpagomesnomi.getid_empleado());	
				historialpagomesnomiAux.setid_rubro_emplea(this.historialpagomesnomi.getid_rubro_emplea());	
				historialpagomesnomiAux.setid_anio(this.historialpagomesnomi.getid_anio());	
				historialpagomesnomiAux.setid_mes(this.historialpagomesnomi.getid_mes());	
				historialpagomesnomiAux.setvalor(this.historialpagomesnomi.getvalor());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialpagomesnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(historialpagomesnomiAux,historialpagomesnomiLogic.getHistorialPagoMesNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialpagomesnomiAux,historialpagomesnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomiLogic.saveHistorialPagoMesNomis();//WithConnection
						//historialpagomesnomiLogic.getSetVersionRowHistorialPagoMesNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.historialpagomesnomi,historialpagomesnomiAux);
					
					this.refrescarForeignKeysDescripcionesHistorialPagoMesNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialpagomesnomiLogic.saveHistorialPagoMesNomiRelaciones(historialpagomesnomiAux);//WithConnection
								//historialpagomesnomiLogic.getSetVersionRowHistorialPagoMesNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.historialpagomesnomi,historialpagomesnomiAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.historialpagomesnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(historialpagomesnomiAux,historialpagomesnomiLogic.getHistorialPagoMesNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(historialpagomesnomiAux,historialpagomesnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.historialpagomesnomi,historialpagomesnomiAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				historialpagomesnomiAux=new  HistorialPagoMesNomi();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado() 
					|| (this.historialpagomesnomiSessionBean.getEsGuardarRelacionado() && this.historialpagomesnomi.getId()>=0)) {
						
					historialpagomesnomiAux.setIsNew(false);
				}
				
				historialpagomesnomiAux.setIsDeleted(false);
			
				historialpagomesnomiAux.setId(this.historialpagomesnomi.getId());	
				historialpagomesnomiAux.setVersionRow(this.historialpagomesnomi.getVersionRow());	
				historialpagomesnomiAux.setid_empresa(this.historialpagomesnomi.getid_empresa());	
				historialpagomesnomiAux.setid_empleado(this.historialpagomesnomi.getid_empleado());	
				historialpagomesnomiAux.setid_rubro_emplea(this.historialpagomesnomi.getid_rubro_emplea());	
				historialpagomesnomiAux.setid_anio(this.historialpagomesnomi.getid_anio());	
				historialpagomesnomiAux.setid_mes(this.historialpagomesnomi.getid_mes());	
				historialpagomesnomiAux.setvalor(this.historialpagomesnomi.getvalor());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialpagomesnomiAux,historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialpagomesnomiAux,historialpagomesnomis);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomiLogic.saveHistorialPagoMesNomis();//WithConnection
						//historialpagomesnomiLogic.getSetVersionRowHistorialPagoMesNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.historialpagomesnomi,historialpagomesnomiAux);
					
					this.refrescarForeignKeysDescripcionesHistorialPagoMesNomi();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialpagomesnomiLogic.saveHistorialPagoMesNomiRelaciones(historialpagomesnomiAux);//WithConnection
								//historialpagomesnomiLogic.getSetVersionRowHistorialPagoMesNomis();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.historialpagomesnomi,historialpagomesnomiAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones() 
									|| this.historialpagomesnomiSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(historialpagomesnomiAux,historialpagomesnomiLogic.getHistorialPagoMesNomis());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(historialpagomesnomiAux,historialpagomesnomis);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.historialpagomesnomi,historialpagomesnomiAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				historialpagomesnomiAux=new  HistorialPagoMesNomi();
				
				historialpagomesnomiAux.setIsNew(false);
				historialpagomesnomiAux.setIsChanged(false);
				
				historialpagomesnomiAux.setIsDeleted(true);
				
				historialpagomesnomiAux.setId(this.historialpagomesnomi.getId());	
				historialpagomesnomiAux.setVersionRow(this.historialpagomesnomi.getVersionRow());	
				historialpagomesnomiAux.setid_empresa(this.historialpagomesnomi.getid_empresa());	
				historialpagomesnomiAux.setid_empleado(this.historialpagomesnomi.getid_empleado());	
				historialpagomesnomiAux.setid_rubro_emplea(this.historialpagomesnomi.getid_rubro_emplea());	
				historialpagomesnomiAux.setid_anio(this.historialpagomesnomi.getid_anio());	
				historialpagomesnomiAux.setid_mes(this.historialpagomesnomi.getid_mes());	
				historialpagomesnomiAux.setvalor(this.historialpagomesnomi.getvalor());	
				
				if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.historialpagomesnomiAux.getId()>=0) {	
						this.historialpagomesnomisEliminados.add(historialpagomesnomiAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(historialpagomesnomiAux,historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialpagomesnomiAux,historialpagomesnomis);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomiLogic.saveHistorialPagoMesNomis();//WithConnection
						//historialpagomesnomiLogic.getSetVersionRowHistorialPagoMesNomis();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								historialpagomesnomiLogic.saveHistorialPagoMesNomiRelaciones(historialpagomesnomiAux);//WithConnection
								//historialpagomesnomiLogic.getSetVersionRowHistorialPagoMesNomis();//WithConnection
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
							if(this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones() 
								|| this.historialpagomesnomiSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(historialpagomesnomiAux,historialpagomesnomiLogic.getHistorialPagoMesNomis());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(historialpagomesnomiAux,historialpagomesnomis);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.getHistorialPagoMesNomis().addAll(this.historialpagomesnomisEliminados);
					
					historialpagomesnomiLogic.saveHistorialPagoMesNomis();//WithConnection
					//historialpagomesnomiLogic.getSetVersionRowHistorialPagoMesNomis();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesHistorialPagoMesNomi();
				
				this.historialpagomesnomisEliminados= new ArrayList<HistorialPagoMesNomi>();		
			}
			
			if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Historial Pago Mes Nomi GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Historial Pago Mes Nomi",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.historialpagomesnomi=historialpagomesnomiAux;
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
      		//this.finishProcessHistorialPagoMesNomi();
      	}
		
	}	
	
	public void actualizarRelaciones(HistorialPagoMesNomi historialpagomesnomiLocal) throws Exception {
		
		if(this.historialpagomesnomiSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(HistorialPagoMesNomi historialpagomesnomiLocal) throws Exception {	
		if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				historialpagomesnomiLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				historialpagomesnomiLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RubroEmpleaDetalleFormJInternalFrame.class)) {
				RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrameLocal=(RubroEmpleaBeanSwingJInternalFrame) ((RubroEmpleaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rubroempleaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.getrubroemplea(),true);
				rubroempleaBeanSwingJInternalFrameLocal.actualizarLista(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea,this.rubroempleasForeignKey);

				rubroempleaBeanSwingJInternalFrameLocal.actualizarRelaciones(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				historialpagomesnomiLocal.setRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey("Formulario");
				this.setActualRubroEmpleaForeignKey(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				historialpagomesnomiLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				historialpagomesnomiLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarHistorialPagoMesNomiActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = historialpagomesnomiValidator.getInvalidValues(this.historialpagomesnomi);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(HistorialPagoMesNomi historialpagomesnomi,List<HistorialPagoMesNomi> historialpagomesnomis) throws Exception {
		try	{		
			HistorialPagoMesNomiConstantesFunciones.actualizarLista(historialpagomesnomi,historialpagomesnomis,this.historialpagomesnomiSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(HistorialPagoMesNomi historialpagomesnomi,List<HistorialPagoMesNomi> historialpagomesnomis) throws Exception {
		try	{			
			HistorialPagoMesNomiConstantesFunciones.actualizarSelectedLista(historialpagomesnomi,historialpagomesnomis);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<HistorialPagoMesNomi> historialpagomesnomisLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				historialpagomesnomisLocal=this.historialpagomesnomiLogic.getHistorialPagoMesNomis();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				historialpagomesnomisLocal=this.historialpagomesnomis;
			}
			//ARCHITECTURE
		
			for(HistorialPagoMesNomi historialpagomesnomiLocal:historialpagomesnomisLocal) {
				if(this.permiteMantenimiento(historialpagomesnomiLocal) && historialpagomesnomiLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+HistorialPagoMesNomiConstantesFunciones.getHistorialPagoMesNomiLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(HistorialPagoMesNomiConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelid_empresaHistorialPagoMesNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoMesNomiConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelid_empleadoHistorialPagoMesNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoMesNomiConstantesFunciones.IDRUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelid_rubro_empleaHistorialPagoMesNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoMesNomiConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelid_anioHistorialPagoMesNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoMesNomiConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelid_mesHistorialPagoMesNomi,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(HistorialPagoMesNomiConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelvalorHistorialPagoMesNomi,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelid_empresaHistorialPagoMesNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelid_empleadoHistorialPagoMesNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelid_rubro_empleaHistorialPagoMesNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelid_anioHistorialPagoMesNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelid_mesHistorialPagoMesNomi,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelvalorHistorialPagoMesNomi,"");
		
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
		this.iIdNuevoHistorialPagoMesNomi--;	
		
		
		this.historialpagomesnomiAux=new HistorialPagoMesNomi();
		
		this.historialpagomesnomiAux.setId(this.iIdNuevoHistorialPagoMesNomi);
		this.historialpagomesnomiAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.historialpagomesnomiLogic.getHistorialPagoMesNomis().add(this.historialpagomesnomiAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.historialpagomesnomis.add(this.historialpagomesnomiAux);
		}
		//ARCHITECTURE
		
		this.historialpagomesnomi=this.historialpagomesnomiAux;
		
		if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioHistorialPagoMesNomi(this.historialpagomesnomi);
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialPagoMesNomi(this.historialpagomesnomi);
		}
				
		//this.setDefaultControlesHistorialPagoMesNomi();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyHistorialPagoMesNomi();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyHistorialPagoMesNomi();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialPagoMesNomi();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomiBean,this.historialpagomesnomi,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
			classes=HistorialPagoMesNomiConstantesFunciones.getClassesRelationshipsOfHistorialPagoMesNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.historialpagomesnomiReturnGeneral=historialpagomesnomiLogic.procesarEventosHistorialPagoMesNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialpagomesnomiLogic.getHistorialPagoMesNomis(),this.historialpagomesnomi,this.historialpagomesnomiParameterGeneral,this.isEsNuevoHistorialPagoMesNomi,classes);//this.historialpagomesnomiLogic.getHistorialPagoMesNomi()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanHistorialPagoMesNomi(this.historialpagomesnomiReturnGeneral,this.historialpagomesnomiBean,false);
		
		if(this.historialpagomesnomiReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyHistorialPagoMesNomi(this.historialpagomesnomiReturnGeneral.getHistorialPagoMesNomi());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioHistorialPagoMesNomi(this.historialpagomesnomiReturnGeneral.getHistorialPagoMesNomi());
		}
		
		if(this.historialpagomesnomiReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioHistorialPagoMesNomi(this.historialpagomesnomiReturnGeneral.getHistorialPagoMesNomi(),classes);//this.historialpagomesnomiBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyHistorialPagoMesNomi();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyHistorialPagoMesNomi();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.RecargarFormHistorialPagoMesNomi(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingHistorialPagoMesNomi(false);
						
			if(historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialPagoMesNomi();
			}
			
			this.actualizarVisualTableDatosHistorialPagoMesNomi();
			
			this.jTableDatosHistorialPagoMesNomi.setRowSelectionInterval(this.getIndiceNuevoHistorialPagoMesNomi(), this.getIndiceNuevoHistorialPagoMesNomi());
			
			this.seleccionarFilaTablaHistorialPagoMesNomiActual();
						
			this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesHistorialPagoMesNomi(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTextFieldvalorHistorialPagoMesNomi.setEnabled(isHabilitar && this.historialpagomesnomiConstantesFunciones.activarvalorHistorialPagoMesNomi);	
		//
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.setEnabled(isHabilitar && this.historialpagomesnomiConstantesFunciones.activarid_empresaHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.setEnabled(isHabilitar && this.historialpagomesnomiConstantesFunciones.activarid_empleadoHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.setEnabled(isHabilitar && this.historialpagomesnomiConstantesFunciones.activarid_rubro_empleaHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.setEnabled(isHabilitar && this.historialpagomesnomiConstantesFunciones.activarid_anioHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.setEnabled(isHabilitar && this.historialpagomesnomiConstantesFunciones.activarid_mesHistorialPagoMesNomi);
	};
	
	public void setDefaultControlesHistorialPagoMesNomi() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoHistorialPagoMesNomi(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.historialpagomesnomiSessionBean.setConGuardarRelaciones(true);			
			this.historialpagomesnomiSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTabbedPaneRelacionesHistorialPagoMesNomi.setVisible(true);
			
					
		} else {
			//this.historialpagomesnomiSessionBean.setConGuardarRelaciones(false);			
			this.historialpagomesnomiSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTabbedPaneRelacionesHistorialPagoMesNomi.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoHistorialPagoMesNomi() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
				if(historialpagomesnomiAux.getId().equals(this.iIdNuevoHistorialPagoMesNomi)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomis) {
				if(historialpagomesnomiAux.getId().equals(this.iIdNuevoHistorialPagoMesNomi)) {
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
	
	public int getIndiceActualHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
				if(historialpagomesnomiAux.getId().equals(historialpagomesnomi.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomis) {
				if(historialpagomesnomiAux.getId().equals(historialpagomesnomi.getId())) {
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
	
	public void setCamposBaseDesdeOriginalHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomiOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
				if(historialpagomesnomiAux.getHistorialPagoMesNomiOriginal().getId().equals(historialpagomesnomiOriginal.getId())) {
					existe=true;
					historialpagomesnomiOriginal.setId(historialpagomesnomiAux.getId());
					historialpagomesnomiOriginal.setVersionRow(historialpagomesnomiAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomis) {
				if(historialpagomesnomiAux.getHistorialPagoMesNomiOriginal().getId().equals(historialpagomesnomiOriginal.getId())) {
					existe=true;
					historialpagomesnomiOriginal.setId(historialpagomesnomiAux.getId());
					historialpagomesnomiOriginal.setVersionRow(historialpagomesnomiAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosHistorialPagoMesNomi(Boolean esParaCancelar) throws Exception {
		historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
		historialpagomesnomiAux=new HistorialPagoMesNomi();
		
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
					if(historialpagomesnomiAux.getId()<0) {
						historialpagomesnomisAux.add(historialpagomesnomiAux);
					}		
				}
				this.iIdNuevoHistorialPagoMesNomi=0L;
				this.historialpagomesnomiLogic.getHistorialPagoMesNomis().removeAll(historialpagomesnomisAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomis) {
					if(historialpagomesnomiAux.getId()<0) {
						historialpagomesnomisAux.add(historialpagomesnomiAux);
					}		
				}
				this.iIdNuevoHistorialPagoMesNomi=0L;
				this.historialpagomesnomis.removeAll(historialpagomesnomisAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoHistorialPagoMesNomi 
					&& this.historialpagomesnomiLogic.getHistorialPagoMesNomis().size()>0
					) {
					historialpagomesnomiAux=this.historialpagomesnomiLogic.getHistorialPagoMesNomis().get(this.historialpagomesnomiLogic.getHistorialPagoMesNomis().size() - 1);
				
					if(historialpagomesnomiAux.getId()<0) {
						this.historialpagomesnomiLogic.getHistorialPagoMesNomis().remove(historialpagomesnomiAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoHistorialPagoMesNomi && this.historialpagomesnomis.size()>0) {
					historialpagomesnomiAux=this.historialpagomesnomis.get(this.historialpagomesnomis.size() - 1);
				
					if(historialpagomesnomiAux.getId()<0) {
						this.historialpagomesnomis.remove(historialpagomesnomiAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoHistorialPagoMesNomi(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(historialpagomesnomi.getId()<0) {
				this.historialpagomesnomiLogic.getHistorialPagoMesNomis().remove(this.historialpagomesnomi);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(historialpagomesnomi.getId()<0) {
				this.historialpagomesnomis.remove(this.historialpagomesnomi);
			}
		}			
	}
	
	public void setEstadosInicialesHistorialPagoMesNomi(List<HistorialPagoMesNomi> historialpagomesnomisAux) throws Exception {
		HistorialPagoMesNomiConstantesFunciones.setEstadosInicialesHistorialPagoMesNomi(historialpagomesnomisAux);
	}
	
	public void setEstadosInicialesHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomiAux) throws Exception {
		HistorialPagoMesNomiConstantesFunciones.setEstadosInicialesHistorialPagoMesNomi(historialpagomesnomiAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarHistorialPagoMesNomiActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarHistorialPagoMesNomiActual()) {
				if(!this.isEsNuevoHistorialPagoMesNomi) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoHistorialPagoMesNomi=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarHistorialPagoMesNomiActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Historial Pago Mes Nomi ?", "MANTENIMIENTO DE Historial Pago Mes Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(HistorialPagoMesNomi historialpagomesnomi) throws Exception {
		HistorialPagoMesNomiConstantesFunciones.seleccionarAsignar(this.historialpagomesnomi,historialpagomesnomi);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarHistorialPagoMesNomi=this.isPermisoActualizarOriginalHistorialPagoMesNomi;
			
			
			this.seleccionarAsignar(historialpagomesnomi);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			HistorialPagoMesNomiConstantesFunciones.quitarEspaciosHistorialPagoMesNomi(this.historialpagomesnomi,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.historialpagomesnomiSessionBean.setsFuncionBusquedaRapida(this.historialpagomesnomiSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoHistorialPagoMesNomi) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosHistorialPagoMesNomi(esParaCancelar);				
				this.cancelarNuevoHistorialPagoMesNomi(esParaCancelar);								
			}
			
			this.historialpagomesnomi=new HistorialPagoMesNomi();
			
			this.inicializarHistorialPagoMesNomi();
			
			this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarHistorialPagoMesNomi() throws Exception {
		try {
			HistorialPagoMesNomiConstantesFunciones.inicializarHistorialPagoMesNomi(this.historialpagomesnomi);
			
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
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.historialpagomesnomiLogic.getHistorialPagoMesNomis().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteHistorialPagoMesNomis(String sAccionBusqueda,List<HistorialPagoMesNomi> historialpagomesnomisParaReportes) throws Exception {
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
					sPathReporteFinal="HistorialPagoMesNomi"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="HistorialPagoMesNomiMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("HistorialPagoMesNomiMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="HistorialPagoMesNomi"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Historial Pago Mes Nomis");		
		parameters.put("busquedapor", HistorialPagoMesNomiConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceHistorialPagoMesNomi=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			HistorialPagoMesNomiConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			HistorialPagoMesNomiConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceHistorialPagoMesNomi=new JRBeanArrayDataSource(HistorialPagoMesNomiJInternalFrame.TraerHistorialPagoMesNomiBeans(historialpagomesnomisParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceHistorialPagoMesNomi);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+HistorialPagoMesNomiConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+HistorialPagoMesNomiConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(HistorialPagoMesNomiBean.TraerHistorialPagoMesNomiBeans(historialpagomesnomisParaReportes).toArray()));
							
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
				this.generarExcelReporteHistorialPagoMesNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagomesnomisParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalHistorialPagoMesNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagomesnomisParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomiActionPerformed(null);
					//this.generarExcelReporteHistorialPagoMesNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagomesnomisParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalHistorialPagoMesNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagomesnomisParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesHistorialPagoMesNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagomesnomisParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesHistorialPagoMesNomis(sAccionBusqueda,sTipoArchivoReporte,historialpagomesnomisParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHistorialPagoMesNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialPagoMesNomi> historialpagomesnomisParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagomesnomi";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialPagoMesNomis");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialPagoMesNomi("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(HistorialPagoMesNomi historialpagomesnomi : historialpagomesnomisParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			HistorialPagoMesNomiConstantesFunciones.generarExcelReporteDataHistorialPagoMesNomi("NORMAL",row,workbook,historialpagomesnomi,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Mes Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderHistorialPagoMesNomi(String sTipo,Row row,Workbook workbook) {
		
		HistorialPagoMesNomiConstantesFunciones.generarExcelReporteHeaderHistorialPagoMesNomi(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalHistorialPagoMesNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialPagoMesNomi> historialpagomesnomisParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagomesnomi_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialPagoMesNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(HistorialPagoMesNomi historialpagomesnomi : historialpagomesnomisParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.getHistorialPagoMesNomiDescripcion(historialpagomesnomi));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagomesnomi.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagomesnomi.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagomesnomi.getrubroemplea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagomesnomi.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagomesnomi.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(historialpagomesnomi.getvalor());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Mes Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesHistorialPagoMesNomis(String sAccionBusqueda,String sTipoArchivoReporte,List<HistorialPagoMesNomi> historialpagomesnomisParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<HistorialPagoMesNomi> historialpagomesnomisRespaldo=null;
		
		classes=HistorialPagoMesNomiConstantesFunciones.getClassesRelationshipsOfHistorialPagoMesNomi(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.historialpagomesnomiLogic.setDatosCliente(this.datosCliente);
		this.historialpagomesnomiLogic.setDatosDeep(this.datosDeep);
		this.historialpagomesnomiLogic.setIsConDeep(true);
		
		historialpagomesnomisRespaldo=this.historialpagomesnomiLogic.getHistorialPagoMesNomis();
		
		this.historialpagomesnomiLogic.setHistorialPagoMesNomis(historialpagomesnomisParaReportes);	
		this.historialpagomesnomiLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		historialpagomesnomisParaReportes=this.historialpagomesnomiLogic.getHistorialPagoMesNomis();
		this.historialpagomesnomiLogic.setHistorialPagoMesNomis(historialpagomesnomisRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagomesnomi_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("HistorialPagoMesNomis");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderHistorialPagoMesNomi("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(HistorialPagoMesNomi historialpagomesnomi : historialpagomesnomisParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderHistorialPagoMesNomi("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			HistorialPagoMesNomiConstantesFunciones.generarExcelReporteDataHistorialPagoMesNomi("NORMAL",row,workbook,historialpagomesnomi,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.getHistorialPagoMesNomiDescripcion(historialpagomesnomi));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Mes Nomi",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessHistorialPagoMesNomi() throws Exception {		
		this.startProcessHistorialPagoMesNomi(true);
	}
	
	public void startProcessHistorialPagoMesNomi(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasHistorialPagoMesNomi ,this.jPanelParametrosReportesHistorialPagoMesNomi, this.jScrollPanelDatosHistorialPagoMesNomi,this.jPanelPaginacionHistorialPagoMesNomi, this.jScrollPanelDatosEdicionHistorialPagoMesNomi, this.jPanelAccionesHistorialPagoMesNomi,this.jPanelAccionesFormularioHistorialPagoMesNomi,this.jmenuBarHistorialPagoMesNomi,this.jmenuBarDetalleHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,this.jTtoolBarDetalleHistorialPagoMesNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialPagoMesNomi=this.jTabbedPaneBusquedasHistorialPagoMesNomi; 
		
		final JPanel jPanelParametrosReportesHistorialPagoMesNomi=this.jPanelParametrosReportesHistorialPagoMesNomi;
		//final JScrollPane jScrollPanelDatosHistorialPagoMesNomi=this.jScrollPanelDatosHistorialPagoMesNomi;
		final JTable jTableDatosHistorialPagoMesNomi=this.jTableDatosHistorialPagoMesNomi;		
		final JPanel jPanelPaginacionHistorialPagoMesNomi=this.jPanelPaginacionHistorialPagoMesNomi;
		//final JScrollPane jScrollPanelDatosEdicionHistorialPagoMesNomi=this.jScrollPanelDatosEdicionHistorialPagoMesNomi;
		final JPanel jPanelAccionesHistorialPagoMesNomi=this.jPanelAccionesHistorialPagoMesNomi;
		
		JPanel jPanelCamposAuxiliarHistorialPagoMesNomi=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarHistorialPagoMesNomi=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			jPanelCamposAuxiliarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelCamposHistorialPagoMesNomi;
			jPanelAccionesFormularioAuxiliarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelAccionesFormularioHistorialPagoMesNomi;
		}
		
		final JPanel jPanelCamposHistorialPagoMesNomi=jPanelCamposAuxiliarHistorialPagoMesNomi;
		final JPanel jPanelAccionesFormularioHistorialPagoMesNomi=jPanelAccionesFormularioAuxiliarHistorialPagoMesNomi;
		
		
		final JMenuBar jmenuBarHistorialPagoMesNomi=this.jmenuBarHistorialPagoMesNomi;
		final JToolBar jTtoolBarHistorialPagoMesNomi=this.jTtoolBarHistorialPagoMesNomi;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarHistorialPagoMesNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialPagoMesNomi=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			jmenuBarDetalleAuxiliarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jmenuBarDetalleHistorialPagoMesNomi;
			jTtoolBarDetalleAuxiliarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTtoolBarDetalleHistorialPagoMesNomi;
		}
		
		final JMenuBar jmenuBarDetalleHistorialPagoMesNomi=jmenuBarDetalleAuxiliarHistorialPagoMesNomi;
		final JToolBar jTtoolBarDetalleHistorialPagoMesNomi=jTtoolBarDetalleAuxiliarHistorialPagoMesNomi;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialPagoMesNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialPagoMesNomi;
			processRunnable.jTableDatos=jTableDatosHistorialPagoMesNomi;
			processRunnable.jPanelCampos=jPanelCamposHistorialPagoMesNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialPagoMesNomi;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialPagoMesNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialPagoMesNomi;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialPagoMesNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialPagoMesNomi;
			processRunnable.jTtoolBar=jTtoolBarHistorialPagoMesNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialPagoMesNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialPagoMesNomi ,jPanelParametrosReportesHistorialPagoMesNomi,jTableDatosHistorialPagoMesNomi, /*jScrollPanelDatosHistorialPagoMesNomi,*/jPanelCamposHistorialPagoMesNomi,jPanelPaginacionHistorialPagoMesNomi, /*jScrollPanelDatosEdicionHistorialPagoMesNomi,*/ jPanelAccionesHistorialPagoMesNomi,jPanelAccionesFormularioHistorialPagoMesNomi,jmenuBarHistorialPagoMesNomi,jmenuBarDetalleHistorialPagoMesNomi,jTtoolBarHistorialPagoMesNomi,jTtoolBarDetalleHistorialPagoMesNomi);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasHistorialPagoMesNomi ,jPanelParametrosReportesHistorialPagoMesNomi, jScrollPanelDatosHistorialPagoMesNomi,jPanelPaginacionHistorialPagoMesNomi, jScrollPanelDatosEdicionHistorialPagoMesNomi, jPanelAccionesHistorialPagoMesNomi,jPanelAccionesFormularioHistorialPagoMesNomi,jmenuBarHistorialPagoMesNomi,jmenuBarDetalleHistorialPagoMesNomi,jTtoolBarHistorialPagoMesNomi,jTtoolBarDetalleHistorialPagoMesNomi);
						
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
	
	public void finishProcessHistorialPagoMesNomi() {// throws Exception 
		this.finishProcessHistorialPagoMesNomi(true);
	}
	
	public void finishProcessHistorialPagoMesNomi(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasHistorialPagoMesNomi ,this.jPanelParametrosReportesHistorialPagoMesNomi, this.jScrollPanelDatosHistorialPagoMesNomi,this.jPanelPaginacionHistorialPagoMesNomi, this.jScrollPanelDatosEdicionHistorialPagoMesNomi, this.jPanelAccionesHistorialPagoMesNomi,this.jPanelAccionesFormularioHistorialPagoMesNomi,this.jmenuBarHistorialPagoMesNomi,this.jmenuBarDetalleHistorialPagoMesNomi,this.jTtoolBarHistorialPagoMesNomi,this.jTtoolBarDetalleHistorialPagoMesNomi);		
		
		final JTabbedPane jTabbedPaneBusquedasHistorialPagoMesNomi=this.jTabbedPaneBusquedasHistorialPagoMesNomi; 
		
		final JPanel jPanelParametrosReportesHistorialPagoMesNomi=this.jPanelParametrosReportesHistorialPagoMesNomi;
		//final JScrollPane jScrollPanelDatosHistorialPagoMesNomi=this.jScrollPanelDatosHistorialPagoMesNomi;
		final JTable jTableDatosHistorialPagoMesNomi=this.jTableDatosHistorialPagoMesNomi;		
		final JPanel jPanelPaginacionHistorialPagoMesNomi=this.jPanelPaginacionHistorialPagoMesNomi;
		//final JScrollPane jScrollPanelDatosEdicionHistorialPagoMesNomi=this.jScrollPanelDatosEdicionHistorialPagoMesNomi;
		final JPanel jPanelAccionesHistorialPagoMesNomi=this.jPanelAccionesHistorialPagoMesNomi;
		
		JPanel jPanelCamposAuxiliarHistorialPagoMesNomi=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarHistorialPagoMesNomi=new JPanel();
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			jPanelCamposAuxiliarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelCamposHistorialPagoMesNomi;
			jPanelAccionesFormularioAuxiliarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelAccionesFormularioHistorialPagoMesNomi;
		}
		
		final JPanel jPanelCamposHistorialPagoMesNomi=jPanelCamposAuxiliarHistorialPagoMesNomi;
		final JPanel jPanelAccionesFormularioHistorialPagoMesNomi=jPanelAccionesFormularioAuxiliarHistorialPagoMesNomi;
		
		
		final JMenuBar jmenuBarHistorialPagoMesNomi=this.jmenuBarHistorialPagoMesNomi;		
		final JToolBar jTtoolBarHistorialPagoMesNomi=this.jTtoolBarHistorialPagoMesNomi;
				
		JMenuBar jmenuBarDetalleAuxiliarHistorialPagoMesNomi=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarHistorialPagoMesNomi=new JToolBar();
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			jmenuBarDetalleAuxiliarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jmenuBarDetalleHistorialPagoMesNomi;
			jTtoolBarDetalleAuxiliarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTtoolBarDetalleHistorialPagoMesNomi;		
		}
		
		final JMenuBar jmenuBarDetalleHistorialPagoMesNomi=jmenuBarDetalleAuxiliarHistorialPagoMesNomi;
		final JToolBar jTtoolBarDetalleHistorialPagoMesNomi=jTtoolBarDetalleAuxiliarHistorialPagoMesNomi;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasHistorialPagoMesNomi;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesHistorialPagoMesNomi;
			processRunnable.jTableDatos=jTableDatosHistorialPagoMesNomi;
			processRunnable.jPanelCampos=jPanelCamposHistorialPagoMesNomi;
			processRunnable.jPanelPaginacion=jPanelPaginacionHistorialPagoMesNomi;
			processRunnable.jPanelAcciones=jPanelAccionesHistorialPagoMesNomi;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioHistorialPagoMesNomi;
			
			
			processRunnable.jmenuBar=jmenuBarHistorialPagoMesNomi;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleHistorialPagoMesNomi;
			processRunnable.jTtoolBar=jTtoolBarHistorialPagoMesNomi;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleHistorialPagoMesNomi;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasHistorialPagoMesNomi ,jPanelParametrosReportesHistorialPagoMesNomi, jTableDatosHistorialPagoMesNomi,/*jScrollPanelDatosHistorialPagoMesNomi,*/jPanelCamposHistorialPagoMesNomi,jPanelPaginacionHistorialPagoMesNomi, /*jScrollPanelDatosEdicionHistorialPagoMesNomi,*/ jPanelAccionesHistorialPagoMesNomi,jPanelAccionesFormularioHistorialPagoMesNomi,jmenuBarHistorialPagoMesNomi,jmenuBarDetalleHistorialPagoMesNomi,jTtoolBarHistorialPagoMesNomi,jTtoolBarDetalleHistorialPagoMesNomi));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesHistorialPagoMesNomi(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarHistorialPagoMesNomi(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuHistorialPagoMesNomi(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarHistorialPagoMesNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarHistorialPagoMesNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleHistorialPagoMesNomi,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuHistorialPagoMesNomi(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarHistorialPagoMesNomi,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleHistorialPagoMesNomi,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.historialpagomesnomiConstantesFunciones.getsFinalQueryHistorialPagoMesNomi();
		String  finalQueryPaginacionTodos=this.historialpagomesnomiConstantesFunciones.getsFinalQueryHistorialPagoMesNomi();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=HistorialPagoMesNomiConstantesFunciones.getArrayColumnasGlobalesNoHistorialPagoMesNomi(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=HistorialPagoMesNomiConstantesFunciones.getArrayColumnasGlobalesHistorialPagoMesNomi(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,HistorialPagoMesNomiConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.historialpagomesnomisEliminados= new ArrayList<HistorialPagoMesNomi>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessHistorialPagoMesNomi();
		
				///*HistorialPagoMesNomiSessionBean*/this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
			
			if(this.historialpagomesnomiSessionBean==null) {
				this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
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
					this.iNumeroPaginacion=HistorialPagoMesNomiConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=HistorialPagoMesNomiConstantesFunciones.getClassesForeignKeysOfHistorialPagoMesNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/historialpagomesnomi."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			historialpagomesnomisAux= new ArrayList<HistorialPagoMesNomi>();
			
				
			historialpagomesnomiLogic.setDatosCliente(this.datosCliente);
			historialpagomesnomiLogic.setDatosDeep(this.datosDeep);
			historialpagomesnomiLogic.setIsConDeep(true);
			
			
			historialpagomesnomiLogic.getHistorialPagoMesNomiDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					historialpagomesnomiLogic.getTodosHistorialPagoMesNomis(finalQueryGlobal,pagination);
					
					//historialpagomesnomiLogic.getTodosHistorialPagoMesNomisWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(historialpagomesnomiLogic.getHistorialPagoMesNomis()==null|| historialpagomesnomiLogic.getHistorialPagoMesNomis().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialpagomesnomisAux= new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomisAux.addAll(historialpagomesnomiLogic.getHistorialPagoMesNomis());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomisAux= new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomisAux.addAll(historialpagomesnomis);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialpagomesnomiLogic.getTodosHistorialPagoMesNomis(finalQueryGlobal+"",this.pagination);												
							
							//historialpagomesnomiLogic.getTodosHistorialPagoMesNomisWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteHistorialPagoMesNomis("Todos",historialpagomesnomiLogic.getHistorialPagoMesNomis() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							historialpagomesnomiLogic.setHistorialPagoMesNomis(new ArrayList<HistorialPagoMesNomi>());					
							historialpagomesnomiLogic.getHistorialPagoMesNomis().addAll(historialpagomesnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomis=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomis.addAll(historialpagomesnomisAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idHistorialPagoMesNomi=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idHistorialPagoMesNomi=this.idActual;
				
				} else if(this.idHistorialPagoMesNomiActual!=null && this.idHistorialPagoMesNomiActual!=0L) {
					idHistorialPagoMesNomi=idHistorialPagoMesNomiActual;
				}
				
					
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndicePorId(idHistorialPagoMesNomi);
				
				this.historialpagomesnomis=new ArrayList<HistorialPagoMesNomi>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					historialpagomesnomiLogic.getEntity(idHistorialPagoMesNomi);
					
					//historialpagomesnomiLogic.getEntityWithConnection(idHistorialPagoMesNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagomesnomiLogic.setHistorialPagoMesNomis(new ArrayList<HistorialPagoMesNomi>());
					historialpagomesnomiLogic.getHistorialPagoMesNomis().add(historialpagomesnomiLogic.getHistorialPagoMesNomi());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagomesnomis=new ArrayList<HistorialPagoMesNomi>();
					this.historialpagomesnomis.add(historialpagomesnomi);
				}
				
				if(historialpagomesnomiLogic.getHistorialPagoMesNomi()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialpagomesnomiLogic.getHistorialPagoMesNomis()==null||historialpagomesnomiLogic.getHistorialPagoMesNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialpagomesnomis==null|| historialpagomesnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
						historialpagomesnomisAux.addAll(historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomisAux.addAll(historialpagomesnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialPagoMesNomis("FK_IdAnio",historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialPagoMesNomis("FK_IdAnio",historialpagomesnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomiLogic.setHistorialPagoMesNomis(new ArrayList<HistorialPagoMesNomi>());
						historialpagomesnomiLogic.getHistorialPagoMesNomis().addAll(historialpagomesnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomis=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomis.addAll(historialpagomesnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialpagomesnomiLogic.getHistorialPagoMesNomis()==null||historialpagomesnomiLogic.getHistorialPagoMesNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialpagomesnomis==null|| historialpagomesnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
						historialpagomesnomisAux.addAll(historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomisAux.addAll(historialpagomesnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialPagoMesNomis("FK_IdEmpleado",historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialPagoMesNomis("FK_IdEmpleado",historialpagomesnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomiLogic.setHistorialPagoMesNomis(new ArrayList<HistorialPagoMesNomi>());
						historialpagomesnomiLogic.getHistorialPagoMesNomis().addAll(historialpagomesnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomis=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomis.addAll(historialpagomesnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialpagomesnomiLogic.getHistorialPagoMesNomis()==null||historialpagomesnomiLogic.getHistorialPagoMesNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialpagomesnomis==null|| historialpagomesnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
						historialpagomesnomisAux.addAll(historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomisAux.addAll(historialpagomesnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialPagoMesNomis("FK_IdEmpresa",historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialPagoMesNomis("FK_IdEmpresa",historialpagomesnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomiLogic.setHistorialPagoMesNomis(new ArrayList<HistorialPagoMesNomi>());
						historialpagomesnomiLogic.getHistorialPagoMesNomis().addAll(historialpagomesnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomis=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomis.addAll(historialpagomesnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialpagomesnomiLogic.getHistorialPagoMesNomis()==null||historialpagomesnomiLogic.getHistorialPagoMesNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialpagomesnomis==null|| historialpagomesnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
						historialpagomesnomisAux.addAll(historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomisAux.addAll(historialpagomesnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialPagoMesNomis("FK_IdMes",historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialPagoMesNomis("FK_IdMes",historialpagomesnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomiLogic.setHistorialPagoMesNomis(new ArrayList<HistorialPagoMesNomi>());
						historialpagomesnomiLogic.getHistorialPagoMesNomis().addAll(historialpagomesnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomis=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomis.addAll(historialpagomesnomisAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRubroEmplea")) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=historialpagomesnomiLogic.getHistorialPagoMesNomis()==null||historialpagomesnomiLogic.getHistorialPagoMesNomis().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=historialpagomesnomis==null|| historialpagomesnomis.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
						historialpagomesnomisAux.addAll(historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomisAux=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomisAux.addAll(historialpagomesnomis);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=HistorialPagoMesNomiConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteHistorialPagoMesNomis("FK_IdRubroEmplea",historialpagomesnomiLogic.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteHistorialPagoMesNomis("FK_IdRubroEmplea",historialpagomesnomis);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomiLogic.setHistorialPagoMesNomis(new ArrayList<HistorialPagoMesNomi>());
						historialpagomesnomiLogic.getHistorialPagoMesNomis().addAll(historialpagomesnomisAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomis=new ArrayList<HistorialPagoMesNomi>();
							historialpagomesnomis.addAll(historialpagomesnomisAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesHistorialPagoMesNomi();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessHistorialPagoMesNomi();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialpagomesnomiLogic.getHistorialPagoMesNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialpagomesnomis.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=historialpagomesnomiLogic.getHistorialPagoMesNomis().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=historialpagomesnomis.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(HistorialPagoMesNomi historialpagomesnomi) {
		Boolean permite=true;
		
		if(this.historialpagomesnomi.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=HistorialPagoMesNomiConstantesFunciones.getOrderByListaHistorialPagoMesNomi();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=HistorialPagoMesNomiConstantesFunciones.getOrderByListaHistorialPagoMesNomi();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialPagoMesNomi historialpagomesnomi:historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
				if(historialpagomesnomi.getsType().equals(Constantes2.S_TOTALES)) {
					historialpagomesnomiTotales=historialpagomesnomi;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialPagoMesNomi historialpagomesnomi:this.historialpagomesnomis) {
				if(historialpagomesnomi.getsType().equals(Constantes2.S_TOTALES)) {
					historialpagomesnomiTotales=historialpagomesnomi;
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
			this.historialpagomesnomiAux=new HistorialPagoMesNomi();
			this.historialpagomesnomiAux.setsType(Constantes2.S_TOTALES);
			this.historialpagomesnomiAux.setIsNew(false);
			this.historialpagomesnomiAux.setIsChanged(false);
			this.historialpagomesnomiAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				HistorialPagoMesNomiConstantesFunciones.TotalizarValoresFilaHistorialPagoMesNomi(this.historialpagomesnomiLogic.getHistorialPagoMesNomis(),this.historialpagomesnomiAux);
				
				this.historialpagomesnomiLogic.getHistorialPagoMesNomis().add(this.historialpagomesnomiAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				HistorialPagoMesNomiConstantesFunciones.TotalizarValoresFilaHistorialPagoMesNomi(this.historialpagomesnomis,this.historialpagomesnomiAux);
				
				this.historialpagomesnomis.add(this.historialpagomesnomiAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		historialpagomesnomiTotales=new HistorialPagoMesNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialpagomesnomiLogic.getHistorialPagoMesNomis().remove(historialpagomesnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.historialpagomesnomis.remove(historialpagomesnomiTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		historialpagomesnomiTotales=new HistorialPagoMesNomi();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(HistorialPagoMesNomi historialpagomesnomi:historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
				if(historialpagomesnomi.getsType().equals(Constantes2.S_TOTALES)) {
					historialpagomesnomiTotales=historialpagomesnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialPagoMesNomiConstantesFunciones.TotalizarValoresFilaHistorialPagoMesNomi(this.historialpagomesnomiLogic.getHistorialPagoMesNomis(),historialpagomesnomiTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(HistorialPagoMesNomi historialpagomesnomi:this.historialpagomesnomis) {
				if(historialpagomesnomi.getsType().equals(Constantes2.S_TOTALES)) {
					historialpagomesnomiTotales=historialpagomesnomi;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				HistorialPagoMesNomiConstantesFunciones.TotalizarValoresFilaHistorialPagoMesNomi(this.historialpagomesnomis,historialpagomesnomiTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getHistorialPagoMesNomisFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialPagoMesNomisFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialPagoMesNomisFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialPagoMesNomisFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getHistorialPagoMesNomisFK_IdRubroEmplea()throws Exception {
		try {
			sAccionBusqueda="FK_IdRubroEmplea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getHistorialPagoMesNomisFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialPagoMesNomisFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialPagoMesNomisFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialPagoMesNomisFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getHistorialPagoMesNomisFK_IdRubroEmplea(String sFinalQuery,Long id_rubro_emplea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagomesnomiLogic.getHistorialPagoMesNomisFK_IdRubroEmplea(sFinalQuery,this.pagination,id_rubro_emplea);
				
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
	
	public void inicializarPermisosHistorialPagoMesNomi() {
		this.isPermisoTodoHistorialPagoMesNomi=false;
		this.isPermisoNuevoHistorialPagoMesNomi=false;
		this.isPermisoActualizarHistorialPagoMesNomi=false;
		this.isPermisoActualizarOriginalHistorialPagoMesNomi=false;
		this.isPermisoEliminarHistorialPagoMesNomi=false;
		this.isPermisoGuardarCambiosHistorialPagoMesNomi=false;
		this.isPermisoConsultaHistorialPagoMesNomi=false;
		this.isPermisoBusquedaHistorialPagoMesNomi=false;
		this.isPermisoReporteHistorialPagoMesNomi=false;		
		this.isPermisoOrdenHistorialPagoMesNomi=false;		
		this.isPermisoPaginacionMedioHistorialPagoMesNomi=false;		
		this.isPermisoPaginacionAltoHistorialPagoMesNomi=false;
		this.isPermisoPaginacionTodoHistorialPagoMesNomi=false;
		this.isPermisoCopiarHistorialPagoMesNomi=false;		
		this.isPermisoVerFormHistorialPagoMesNomi=false;		
		this.isPermisoDuplicarHistorialPagoMesNomi=false;		
		this.isPermisoOrdenHistorialPagoMesNomi=false;		
	}
	
	public void setPermisosUsuarioHistorialPagoMesNomi(Boolean isPermiso) {
		this.isPermisoTodoHistorialPagoMesNomi=isPermiso;
		this.isPermisoNuevoHistorialPagoMesNomi=isPermiso;
		this.isPermisoActualizarHistorialPagoMesNomi=isPermiso;
		this.isPermisoActualizarOriginalHistorialPagoMesNomi=isPermiso;
		this.isPermisoEliminarHistorialPagoMesNomi=isPermiso;
		this.isPermisoGuardarCambiosHistorialPagoMesNomi=isPermiso;
		this.isPermisoConsultaHistorialPagoMesNomi=isPermiso;
		this.isPermisoBusquedaHistorialPagoMesNomi=isPermiso;
		this.isPermisoReporteHistorialPagoMesNomi=isPermiso;
		this.isPermisoOrdenHistorialPagoMesNomi=isPermiso;		
		this.isPermisoPaginacionMedioHistorialPagoMesNomi=isPermiso;		
		this.isPermisoPaginacionAltoHistorialPagoMesNomi=isPermiso;		
		this.isPermisoPaginacionTodoHistorialPagoMesNomi=isPermiso;		
		this.isPermisoCopiarHistorialPagoMesNomi=isPermiso;		
		this.isPermisoVerFormHistorialPagoMesNomi=isPermiso;		
		this.isPermisoDuplicarHistorialPagoMesNomi=isPermiso;
		this.isPermisoOrdenHistorialPagoMesNomi=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioHistorialPagoMesNomi(Boolean isPermiso) {
		//this.isPermisoTodoHistorialPagoMesNomi=isPermiso;
		this.isPermisoNuevoHistorialPagoMesNomi=isPermiso;
		this.isPermisoActualizarHistorialPagoMesNomi=isPermiso;
		this.isPermisoActualizarOriginalHistorialPagoMesNomi=isPermiso;
		this.isPermisoEliminarHistorialPagoMesNomi=isPermiso;
		this.isPermisoGuardarCambiosHistorialPagoMesNomi=isPermiso;
		//this.isPermisoConsultaHistorialPagoMesNomi=isPermiso;
		//this.isPermisoBusquedaHistorialPagoMesNomi=isPermiso;
		//this.isPermisoReporteHistorialPagoMesNomi=isPermiso;
		//this.isPermisoOrdenHistorialPagoMesNomi=isPermiso;		
		//this.isPermisoPaginacionMedioHistorialPagoMesNomi=isPermiso;		
		//this.isPermisoPaginacionAltoHistorialPagoMesNomi=isPermiso;		
		//this.isPermisoPaginacionTodoHistorialPagoMesNomi=isPermiso;		
		//this.isPermisoCopiarHistorialPagoMesNomi=isPermiso;		
		//this.isPermisoDuplicarHistorialPagoMesNomi=isPermiso;
		//this.isPermisoOrdenHistorialPagoMesNomi=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioHistorialPagoMesNomiClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(HistorialPagoMesNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebHistorialPagoMesNomi(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioHistorialPagoMesNomiClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioHistorialPagoMesNomiClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionHistorialPagoMesNomiClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioHistorialPagoMesNomiClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioHistorialPagoMesNomi() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(HistorialPagoMesNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, HistorialPagoMesNomiConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoHistorialPagoMesNomi=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarHistorialPagoMesNomi=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalHistorialPagoMesNomi=this.isPermisoActualizarHistorialPagoMesNomi;
			this.isPermisoEliminarHistorialPagoMesNomi=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosHistorialPagoMesNomi=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaHistorialPagoMesNomi=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaHistorialPagoMesNomi=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoHistorialPagoMesNomi=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteHistorialPagoMesNomi=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialPagoMesNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioHistorialPagoMesNomi=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoHistorialPagoMesNomi=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoHistorialPagoMesNomi=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarHistorialPagoMesNomi=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormHistorialPagoMesNomi=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarHistorialPagoMesNomi=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenHistorialPagoMesNomi=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosHistorialPagoMesNomi.setToolTipText(this.jTableDatosHistorialPagoMesNomi.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioHistorialPagoMesNomi(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioHistorialPagoMesNomi(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(HistorialPagoMesNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(HistorialPagoMesNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioHistorialPagoMesNomi() throws Exception {
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
	public void inicializarCombosForeignKeyHistorialPagoMesNomiListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.rubroempleasForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyHistorialPagoMesNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(HistorialPagoMesNomiJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyHistorialPagoMesNomiListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyRubroEmpleaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyAnioListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=AnioConstantesFunciones.SFINALQUERY;

				this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
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
	
	public void cargarCombosLoteForeignKeyHistorialPagoMesNomiListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			HistorialPagoMesNomiParameterReturnGeneral historialpagomesnomiReturnGeneral=new HistorialPagoMesNomiParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.historialpagomesnomiConstantesFunciones.cargarid_empresaHistorialPagoMesNomi)
					 || (this.esRecargarFks && this.historialpagomesnomiConstantesFunciones.cargarid_empresaHistorialPagoMesNomi)) {

					if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+historialpagomesnomiSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.historialpagomesnomiConstantesFunciones.cargarid_empleadoHistorialPagoMesNomi)
					 || (this.esRecargarFks && this.historialpagomesnomiConstantesFunciones.cargarid_empleadoHistorialPagoMesNomi)) {

					if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+historialpagomesnomiSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalRubroEmplea="";

				if(((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0) && this.historialpagomesnomiConstantesFunciones.cargarid_rubro_empleaHistorialPagoMesNomi)
					 || (this.esRecargarFks && this.historialpagomesnomiConstantesFunciones.cargarid_rubro_empleaHistorialPagoMesNomi)) {

					if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRubroEmplea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

						finalQueryGlobalRubroEmplea=Funciones.GetFinalQueryAppend(finalQueryGlobalRubroEmplea, "");
						finalQueryGlobalRubroEmplea+=RubroEmpleaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRubroEmplea=" WHERE " + ConstantesSql.ID + "="+historialpagomesnomiSessionBean.getlidRubroEmpleaActual();
					}
				} else {
					finalQueryGlobalRubroEmplea="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.historialpagomesnomiConstantesFunciones.cargarid_anioHistorialPagoMesNomi)
					 || (this.esRecargarFks && this.historialpagomesnomiConstantesFunciones.cargarid_anioHistorialPagoMesNomi)) {

					if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+historialpagomesnomiSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.historialpagomesnomiConstantesFunciones.cargarid_mesHistorialPagoMesNomi)
					 || (this.esRecargarFks && this.historialpagomesnomiConstantesFunciones.cargarid_mesHistorialPagoMesNomi)) {

					if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+historialpagomesnomiSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				historialpagomesnomiReturnGeneral=historialpagomesnomiLogic.cargarCombosLoteForeignKeyHistorialPagoMesNomi(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalRubroEmplea,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=historialpagomesnomiReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=historialpagomesnomiReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalRubroEmplea.equals("NONE")) {
				this.rubroempleasForeignKey=historialpagomesnomiReturnGeneral.getrubroempleasForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=historialpagomesnomiReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=historialpagomesnomiReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyHistorialPagoMesNomi()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyRubroEmplea();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.historialpagomesnomiSessionBean==null) {
				this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
			}

			if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

	public void addItemDefectoCombosForeignKeyEmpleado()throws Exception {
		try {

			if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

			if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
				Anio anio=new Anio();
				AnioConstantesFunciones.setAnioDescripcion(anio,Constantes.SMENSAJE_ESCOJA_OPCION);
				anio.setId(null);

				if(!AnioConstantesFunciones.ExisteEnLista(this.aniosForeignKey,anio,true)) {

					this.aniosForeignKey.add(0,anio);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}

	public void addItemDefectoCombosForeignKeyMes()throws Exception {
		try {

			if(!this.historialpagomesnomiSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyHistorialPagoMesNomi()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyHistorialPagoMesNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyHistorialPagoMesNomi()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialPagoMesNomi();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(historialpagomesnomi.getid_empleado(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(historialpagomesnomi.getid_rubro_emplea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyHistorialPagoMesNomi()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.historialpagomesnomiConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(this.historialpagomesnomiConstantesFunciones.getid_rubro_emplea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyHistorialPagoMesNomi()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyHistorialPagoMesNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyHistorialPagoMesNomi()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroHistorialPagoMesNomi()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyHistorialPagoMesNomi()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyHistorialPagoMesNomi(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyHistorialPagoMesNomi()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.getItemCount()>0) {
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public HistorialPagoMesNomiBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public HistorialPagoMesNomiBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public HistorialPagoMesNomiBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean(); 
		this.historialpagomesnomiConstantesFunciones=new HistorialPagoMesNomiConstantesFunciones(); 
		this.historialpagomesnomiBean=new HistorialPagoMesNomi();//(this.historialpagomesnomiConstantesFunciones); 		
		this.historialpagomesnomiReturnGeneral=new HistorialPagoMesNomiParameterReturnGeneral(); 
		
		this.historialpagomesnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.historialpagomesnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public HistorialPagoMesNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public HistorialPagoMesNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public HistorialPagoMesNomiBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessHistorialPagoMesNomi(true);
			
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
			
			this.historialpagomesnomiConstantesFunciones=new HistorialPagoMesNomiConstantesFunciones(); 
			this.historialpagomesnomiBean=new HistorialPagoMesNomi();//this.historialpagomesnomiConstantesFunciones); 			
			this.historialpagomesnomiReturnGeneral=new HistorialPagoMesNomiParameterReturnGeneral(); 
		
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Historial Pago Mes Nomi Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.historialpagomesnomi=new HistorialPagoMesNomi();
			this.historialpagomesnomis = new ArrayList<HistorialPagoMesNomi>();
			this.historialpagomesnomisAux = new ArrayList<HistorialPagoMesNomi>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic=new HistorialPagoMesNomiLogic();
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.historialpagomesnomiSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.historialpagomesnomiSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormHistorialPagoMesNomi);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialPagoMesNomi);	
					}
					
					if(this.jInternalFrameImportacionHistorialPagoMesNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialPagoMesNomi);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByHistorialPagoMesNomi!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByHistorialPagoMesNomi);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialPagoMesNomi);
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.setVisible(false);
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi);
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setVisible(false);
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionHistorialPagoMesNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionHistorialPagoMesNomi);
					this.jInternalFrameImportacionHistorialPagoMesNomi.setVisible(false);
					this.jInternalFrameImportacionHistorialPagoMesNomi.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByHistorialPagoMesNomi!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByHistorialPagoMesNomi);
					this.jInternalFrameOrderByHistorialPagoMesNomi.setVisible(false);
					this.jInternalFrameOrderByHistorialPagoMesNomi.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idHistorialPagoMesNomiActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=HistorialPagoMesNomiConstantesFunciones.INUMEROPAGINACION;
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
			
			this.historialpagomesnomiReturnGeneral=new HistorialPagoMesNomiParameterReturnGeneral();
			
			this.historialpagomesnomiParameterGeneral=new HistorialPagoMesNomiParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.historialpagomesnomiLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
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
			
			if(HistorialPagoMesNomiJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialPagoMesNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialpagomesnomiSessionBean.getEsGuardarRelacionado(),this.historialpagomesnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,HistorialPagoMesNomiConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.historialpagomesnomiSessionBean.getEsGuardarRelacionado(),this.historialpagomesnomiSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaDuplicarHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaCopiarHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaVerFormHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaOrdenHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaModificarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdRubroEmplea=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosHistorialPagoMesNomi();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioHistorialPagoMesNomi(false);
			
			this.setPermisosUsuarioHistorialPagoMesNomi();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado() 
				|| (this.historialpagomesnomiSessionBean.getEsGuardarRelacionado() && this.historialpagomesnomiSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioHistorialPagoMesNomiClasesRelacionadas();
			}
			
			if(this.historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioHistorialPagoMesNomiClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosHistorialPagoMesNomi();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualHistorialPagoMesNomi();
			}
			
			if(!this.isPermisoBusquedaHistorialPagoMesNomi) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioHistorialPagoMesNomi,this.isPermisoPaginacionMedioHistorialPagoMesNomi,this.isPermisoPaginacionTodoHistorialPagoMesNomi);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(HistorialPagoMesNomiConstantesFunciones.getTiposSeleccionarHistorialPagoMesNomi());
				
				this.tiposColumnasSelect=HistorialPagoMesNomiConstantesFunciones.getTiposSeleccionarHistorialPagoMesNomi(true);
				
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
			//if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioHistorialPagoMesNomi();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioHistorialPagoMesNomi(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioHistorialPagoMesNomi(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialPagoMesNomi() ;
			
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
			this.empleadoLogic=new EmpleadoLogic();
			this.rubroempleaLogic=new RubroEmpleaLogic();
			this.anioLogic=new AnioLogic();
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
				historialpagomesnomiImplementable= (HistorialPagoMesNomiImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialPagoMesNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				historialpagomesnomiImplementableHome= (HistorialPagoMesNomiImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+HistorialPagoMesNomiConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.historialpagomesnomis= new ArrayList<HistorialPagoMesNomi>();
			this.historialpagomesnomisEliminados= new ArrayList<HistorialPagoMesNomi>();
						
			this.isEsNuevoHistorialPagoMesNomi=false;
			this.esParaAccionDesdeFormularioHistorialPagoMesNomi=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyHistorialPagoMesNomi(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroHistorialPagoMesNomi();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=HistorialPagoMesNomiConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingHistorialPagoMesNomi(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioHistorialPagoMesNomi();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioHistorialPagoMesNomi();
			}
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasHistorialPagoMesNomi.getTabCount(); i++) {
					this.jTabbedPaneBusquedasHistorialPagoMesNomi.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasHistorialPagoMesNomi.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessHistorialPagoMesNomi(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga HistorialPagoMesNomi: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectHistorialPagoMesNomi() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesHistorialPagoMesNomi")) {
				iIndex=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTabbedPaneRelacionesHistorialPagoMesNomi.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTabbedPaneRelacionesHistorialPagoMesNomi.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessHistorialPagoMesNomi();	
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
	
	public void cargarCombosForeignKeyHistorialPagoMesNomi(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyHistorialPagoMesNomi(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyHistorialPagoMesNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyHistorialPagoMesNomiListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyHistorialPagoMesNomi();
		
		this.cargarCombosFrameForeignKeyHistorialPagoMesNomi();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyHistorialPagoMesNomi();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyHistorialPagoMesNomi();
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

	public void cargarCombosForeignKeyAnio(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaAnio(this.aniosForeignKey);

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
	
	public void jButtonNuevoHistorialPagoMesNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
			
			if(jTableDatosHistorialPagoMesNomi.getRowCount()>=1) {
				jTableDatosHistorialPagoMesNomi.removeRowSelectionInterval(0, jTableDatosHistorialPagoMesNomi.getRowCount()-1);						
			}
			
			this.isEsNuevoHistorialPagoMesNomi=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoHistorialPagoMesNomi(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesHistorialPagoMesNomi(true);			
			//this.historialpagomesnomi=new HistorialPagoMesNomi();
			//this.historialpagomesnomi.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialPagoMesNomi(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialPagoMesNomi() ;
			
			if(HistorialPagoMesNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialPagoMesNomi(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.historialpagomesnomi);	
			this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);				
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
			if(this.historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar HistorialPagoMesNomi: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarHistorialPagoMesNomiActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosHistorialPagoMesNomi.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosHistorialPagoMesNomi.getSelectedRows().length;			
			}
			
			historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoHistorialPagoMesNomi--;			
				//HistorialPagoMesNomi historialpagomesnomiAux= new HistorialPagoMesNomi();			
				//historialpagomesnomiAux.setId(this.iIdNuevoHistorialPagoMesNomi);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//HistorialPagoMesNomi historialpagomesnomiOrigen=new HistorialPagoMesNomi();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(HistorialPagoMesNomi historialpagomesnomiOrigen : historialpagomesnomisSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							historialpagomesnomiOrigen =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							historialpagomesnomiOrigen =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaHistorialPagoMesNomi();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.historialpagomesnomi.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosHistorialPagoMesNomi(historialpagomesnomiOrigen,this.historialpagomesnomi,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialpagomesnomiLogic.getHistorialPagoMesNomis().add(this.historialpagomesnomiAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialpagomesnomis.add(this.historialpagomesnomiAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
				
				this.jTableDatosHistorialPagoMesNomi.setRowSelectionInterval(this.getIndiceNuevoHistorialPagoMesNomi(), this.getIndiceNuevoHistorialPagoMesNomi());
				
				int iLastRow =  this.jTableDatosHistorialPagoMesNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialPagoMesNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialPagoMesNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();									
		
			HistorialPagoMesNomi historialpagomesnomiOrigen=new HistorialPagoMesNomi();
			HistorialPagoMesNomi historialpagomesnomiDestino=new HistorialPagoMesNomi();
				
			historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosHistorialPagoMesNomi.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || historialpagomesnomisSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosHistorialPagoMesNomi.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomiOrigen =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialpagomesnomiOrigen =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						historialpagomesnomiDestino =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						historialpagomesnomiDestino =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				historialpagomesnomiOrigen =historialpagomesnomisSeleccionados.get(0);
				historialpagomesnomiDestino =historialpagomesnomisSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosHistorialPagoMesNomi(historialpagomesnomiOrigen,historialpagomesnomiDestino,true,false);
				
				historialpagomesnomiDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(historialpagomesnomiDestino,historialpagomesnomiLogic.getHistorialPagoMesNomis());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(historialpagomesnomiDestino,historialpagomesnomis);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
				
				//this.jTableDatosHistorialPagoMesNomi.setRowSelectionInterval(this.getIndiceNuevoHistorialPagoMesNomi(), this.getIndiceNuevoHistorialPagoMesNomi());
				
				int iLastRow =  this.jTableDatosHistorialPagoMesNomi.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosHistorialPagoMesNomi.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosHistorialPagoMesNomi.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesHistorialPagoMesNomi.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesHistorialPagoMesNomi.setVisible(!isVisible);
			this.jPanelPaginacionHistorialPagoMesNomi.setVisible(!isVisible);
			this.jPanelAccionesHistorialPagoMesNomi.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameHistorialPagoMesNomi();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoHistorialPagoMesNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionHistorialPagoMesNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByHistorialPagoMesNomi();
			
			this.abrirFrameOrderByHistorialPagoMesNomi();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByHistorialPagoMesNomi();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleHistorialPagoMesNomi(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialPagoMesNomi);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.isMaximum()) {
					this.jInternalFrameDetalleFormHistorialPagoMesNomi.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormHistorialPagoMesNomi.setSize(this.jInternalFrameDetalleFormHistorialPagoMesNomi.iWidthFormulario,this.jInternalFrameDetalleFormHistorialPagoMesNomi.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormHistorialPagoMesNomi.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormHistorialPagoMesNomi.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormHistorialPagoMesNomi.isMaximum()) {
						this.jInternalFrameDetalleFormHistorialPagoMesNomi.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jContentPaneDetalleHistorialPagoMesNomi.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTabbedPaneRelacionesHistorialPagoMesNomi.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jContentPaneDetalleHistorialPagoMesNomi.getWidth(),HistorialPagoMesNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTabbedPaneRelacionesHistorialPagoMesNomi.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jContentPaneDetalleHistorialPagoMesNomi.getWidth(),HistorialPagoMesNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTabbedPaneRelacionesHistorialPagoMesNomi.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jContentPaneDetalleHistorialPagoMesNomi.getWidth(),HistorialPagoMesNomiConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormHistorialPagoMesNomi.setVisible(true);
	        this.jInternalFrameDetalleFormHistorialPagoMesNomi.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByHistorialPagoMesNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByHistorialPagoMesNomi==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByHistorialPagoMesNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialPagoMesNomi,false,this);
				} else {
					this.jInternalFrameOrderByHistorialPagoMesNomi=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByHistorialPagoMesNomi,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByHistorialPagoMesNomi);
				this.jInternalFrameOrderByHistorialPagoMesNomi.setVisible(false);
				this.jInternalFrameOrderByHistorialPagoMesNomi.setSelected(false);
				
				this.jInternalFrameOrderByHistorialPagoMesNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialPagoMesNomi"));
				
				this.inicializarActualizarBindingTablaOrderByHistorialPagoMesNomi();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionHistorialPagoMesNomi() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionHistorialPagoMesNomi==null) {
				
				this.jInternalFrameImportacionHistorialPagoMesNomi=new ImportacionJInternalFrame(HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionHistorialPagoMesNomi);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionHistorialPagoMesNomi);
				this.jInternalFrameImportacionHistorialPagoMesNomi.setVisible(false);
				this.jInternalFrameImportacionHistorialPagoMesNomi.setSelected(false);


				this.jInternalFrameImportacionHistorialPagoMesNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialPagoMesNomi"));
				this.jInternalFrameImportacionHistorialPagoMesNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialPagoMesNomi"));
				this.jInternalFrameImportacionHistorialPagoMesNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialPagoMesNomi"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoHistorialPagoMesNomi() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi==null) {
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi=new ReporteDinamicoJInternalFrame(HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoHistorialPagoMesNomi);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi);
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setVisible(false);
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialPagoMesNomi"));
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialPagoMesNomi"));
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialPagoMesNomi"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialPagoMesNomi();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleHistorialPagoMesNomi() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormHistorialPagoMesNomi);
			
	       	this.jInternalFrameDetalleFormHistorialPagoMesNomi.setVisible(false);
	        this.jInternalFrameDetalleFormHistorialPagoMesNomi.setSelected(false);
			
			//this.jInternalFrameDetalleFormHistorialPagoMesNomi.dispose();
			//this.jInternalFrameDetalleFormHistorialPagoMesNomi=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoHistorialPagoMesNomi() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setVisible(true);
	        this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionHistorialPagoMesNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionHistorialPagoMesNomi.setVisible(true);
	        this.jInternalFrameImportacionHistorialPagoMesNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByHistorialPagoMesNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByHistorialPagoMesNomi.setVisible(true);
	        this.jInternalFrameOrderByHistorialPagoMesNomi.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByHistorialPagoMesNomi() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByHistorialPagoMesNomi.setVisible(false);
	        this.jInternalFrameOrderByHistorialPagoMesNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoHistorialPagoMesNomi() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setVisible(false);
	        this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionHistorialPagoMesNomi() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionHistorialPagoMesNomi.setVisible(false);
	        this.jInternalFrameImportacionHistorialPagoMesNomi.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarHistorialPagoMesNomi(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarHistorialPagoMesNomi(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesHistorialPagoMesNomi(true);
			//this.isEsNuevoHistorialPagoMesNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialPagoMesNomi(false) ;
			
			if(historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(HistorialPagoMesNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialPagoMesNomi(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialPagoMesNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaHistorialPagoMesNomiActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarHistorialPagoMesNomi(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesHistorialPagoMesNomi(true);
			//this.isEsNuevoHistorialPagoMesNomi=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.historialpagomesnomi.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesHistorialPagoMesNomi(false) ;
			
			if(HistorialPagoMesNomiJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleHistorialPagoMesNomi(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialPagoMesNomi(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

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
		TableColumn tableColumnRubroEmplea=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA));
		TableCellEditor tableCellEditorRubroEmplea =tableColumnRubroEmplea.getCellEditor();

		RubroEmpleaTableCell rubroempleaTableCellFk=(RubroEmpleaTableCell)tableCellEditorRubroEmplea;

		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.setrubroempleasForeignKey(rubroempleasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//rubroempleaTableCellFk.setRowActual(intSelectedRow);
			//rubroempleaTableCellFk.setrubroempleasForeignKeyActual(rubroempleasForeignKey);
		//}


		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.RecargarRubroEmpleasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//anioTableCellFk.setRowActual(intSelectedRow);
			//anioTableCellFk.setaniosForeignKeyActual(aniosForeignKey);
		//}


		if(anioTableCellFk!=null) {
			anioTableCellFk.RecargarAniosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaMes(List<Mes> messForeignKey)throws Exception{
		TableColumn tableColumnMes=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesHistorialPagoMesNomi(false);
			
			//if(!this.isEsNuevoHistorialPagoMesNomi) {								
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
				
			}
			
			if(this.permiteMantenimiento(this.historialpagomesnomi)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoHistorialPagoMesNomi=true;
					this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
					this.isEsNuevoHistorialPagoMesNomi=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoHistorialPagoMesNomi=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoHistorialPagoMesNomi=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialPagoMesNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialPagoMesNomi(false);
				
				this.habilitarDeshabilitarControlesHistorialPagoMesNomi(false);
			
												
				
				if(HistorialPagoMesNomiJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleHistorialPagoMesNomi();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,historialpagomesnomiSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualHistorialPagoMesNomi(this.historialpagomesnomi,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosHistorialPagoMesNomi.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,historialpagomesnomiSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.historialpagomesnomi.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				this.historialpagomesnomi.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				this.historialpagomesnomi.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.historialpagomesnomi)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((HistorialPagoMesNomiModel) this.jTableDatosHistorialPagoMesNomi.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoHistorialPagoMesNomi=true;
				this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
				this.isEsNuevoHistorialPagoMesNomi=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesHistorialPagoMesNomi(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialPagoMesNomi(false);
				
				this.habilitarDeshabilitarControlesHistorialPagoMesNomi(false);
				
				
				
				if(HistorialPagoMesNomiJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleHistorialPagoMesNomi();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosHistorialPagoMesNomi.getRowCount()>=1) {
				jTableDatosHistorialPagoMesNomi.removeRowSelectionInterval(0, jTableDatosHistorialPagoMesNomi.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesHistorialPagoMesNomi(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesHistorialPagoMesNomi(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualHistorialPagoMesNomi(false) ;
			
			this.isEsNuevoHistorialPagoMesNomi=false;
			
			if(HistorialPagoMesNomiJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleHistorialPagoMesNomi();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingHistorialPagoMesNomi(false);
				
				//SI ES MANUAL
				if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualHistorialPagoMesNomi();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoHistorialPagoMesNomi--;			
			//HistorialPagoMesNomi historialpagomesnomiAux= new HistorialPagoMesNomi();			
			//historialpagomesnomiAux.setId(this.iIdNuevoHistorialPagoMesNomi);
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaHistorialPagoMesNomi();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
			
			this.historialpagomesnomi.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.historialpagomesnomiLogic.getHistorialPagoMesNomis().add(this.historialpagomesnomiAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.historialpagomesnomis.add(this.historialpagomesnomiAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
			
			this.jTableDatosHistorialPagoMesNomi.setRowSelectionInterval(this.getIndiceNuevoHistorialPagoMesNomi(), this.getIndiceNuevoHistorialPagoMesNomi());
			
			int iLastRow =  this.jTableDatosHistorialPagoMesNomi.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosHistorialPagoMesNomi.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosHistorialPagoMesNomi.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialPagoMesNomi(false);
			
			//SI ES MANUAL
			if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialPagoMesNomi();
			}
			
			//this.abrirFrameTreeHistorialPagoMesNomi();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Historial Pago Mes NomiS ?", "MANTENIMIENTO DE Historial Pago Mes Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionHistorialPagoMesNomi.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralHistorialPagoMesNomi();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.historialpagomesnomiReturnGeneral=historialpagomesnomiLogic.procesarImportacionHistorialPagoMesNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.historialpagomesnomiParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarHistorialPagoMesNomiReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionHistorialPagoMesNomi.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionHistorialPagoMesNomi.setFileImportacion(this.jInternalFrameImportacionHistorialPagoMesNomi.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionHistorialPagoMesNomi.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionHistorialPagoMesNomi.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionHistorialPagoMesNomi.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionHistorialPagoMesNomi.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();		

		historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("HistorialPagoMesNomiBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"HistorialPagoMesNomiBaseDesign.jrxml";
			
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
			
			this.generarReporteHistorialPagoMesNomis("Todos",historialpagomesnomisSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Mes Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RubroEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoria="id_rubro_emplea";
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoriaValor="id_rubro_emplea";
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_rubro_emplea");
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
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
	
	public void jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();		
		
		historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagomesnomi";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("HistorialPagoMesNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(HistorialPagoMesNomi historialpagomesnomi:historialpagomesnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagomesnomi.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(HistorialPagoMesNomi historialpagomesnomi:historialpagomesnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagomesnomi.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA);
					iRow++;

					for(HistorialPagoMesNomi historialpagomesnomi:historialpagomesnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagomesnomi.getrubroemplea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(HistorialPagoMesNomi historialpagomesnomi:historialpagomesnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagomesnomi.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(HistorialPagoMesNomi historialpagomesnomi:historialpagomesnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagomesnomi.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(HistorialPagoMesNomi historialpagomesnomi:historialpagomesnomisSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(historialpagomesnomi.getvalor());
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
			//	this.getFilaCabeceraExportarExcelHistorialPagoMesNomi(row);				
			//	iRow++;
			//}				
			
			//for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomisSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelHistorialPagoMesNomi(historialpagomesnomiAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Mes Nomi",JOptionPane.INFORMATION_MESSAGE);
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
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialPagoMesNomi(false);
			
			//SI ES MANUAL
			if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualHistorialPagoMesNomi();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialPagoMesNomi(false);
			
			//SI ES MANUAL
			if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialPagoMesNomi();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingHistorialPagoMesNomi(false);
			
			//SI ES MANUAL
			if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualHistorialPagoMesNomi();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaHistorialPagoMesNomi() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosHistorialPagoMesNomi.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosHistorialPagoMesNomi.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosHistorialPagoMesNomi.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosHistorialPagoMesNomi.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosHistorialPagoMesNomi.setMinimumSize(dimensionMinimum);
		this.jTableDatosHistorialPagoMesNomi.setMaximumSize(dimensionMaximum);
		this.jTableDatosHistorialPagoMesNomi.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingHistorialPagoMesNomi(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingHistorialPagoMesNomi(esInicializar,true);
	}
	
	public void inicializarActualizarBindingHistorialPagoMesNomi(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaHistorialPagoMesNomi(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesHistorialPagoMesNomi(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasHistorialPagoMesNomi(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialPagoMesNomi(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesHistorialPagoMesNomi(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualHistorialPagoMesNomi() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaHistorialPagoMesNomi();
		
		this.inicializarActualizarBindingBotonesManualHistorialPagoMesNomi(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialPagoMesNomi();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesHistorialPagoMesNomi() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialPagoMesNomi(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialPagoMesNomi(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosHistorialPagoMesNomi.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteHistorialPagoMesNomi.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jCheckBoxPostAccionNuevoHistorialPagoMesNomi.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jCheckBoxPostAccionSinCerrarHistorialPagoMesNomi.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jCheckBoxPostAccionSinMensajeHistorialPagoMesNomi.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosHistorialPagoMesNomi.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteHistorialPagoMesNomi.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.jCheckBoxPostAccionNuevoHistorialPagoMesNomi.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.jCheckBoxPostAccionSinCerrarHistorialPagoMesNomi.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.jCheckBoxPostAccionSinMensajeHistorialPagoMesNomi.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionHistorialPagoMesNomi.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionHistorialPagoMesNomi.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesHistorialPagoMesNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesHistorialPagoMesNomi.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesHistorialPagoMesNomi.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralHistorialPagoMesNomi.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesHistorialPagoMesNomi(Boolean esInicializar) throws Exception {
		try	{	
			if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualHistorialPagoMesNomi(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesHistorialPagoMesNomi() throws Exception {
		try	{
			if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialPagoMesNomi();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialPagoMesNomi() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualHistorialPagoMesNomi() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesHistorialPagoMesNomi.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesHistorialPagoMesNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesHistorialPagoMesNomi.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesHistorialPagoMesNomi.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionHistorialPagoMesNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionHistorialPagoMesNomi.addItem(reporte);
			}
			
			
			if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionHistorialPagoMesNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionHistorialPagoMesNomi.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesHistorialPagoMesNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesHistorialPagoMesNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesHistorialPagoMesNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesHistorialPagoMesNomi.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialPagoMesNomi();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualHistorialPagoMesNomi() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi!=null) {
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi!=null) {
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi!=null) {
				
				if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=HistorialPagoMesNomiConstantesFunciones.getTiposSeleccionarHistorialPagoMesNomi(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=HistorialPagoMesNomiConstantesFunciones.getTiposSeleccionarHistorialPagoMesNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=HistorialPagoMesNomiConstantesFunciones.getTiposSeleccionarHistorialPagoMesNomi(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualHistorialPagoMesNomi()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioHistorialPagoMesNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoHistorialPagoMesNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesHistorialPagoMesNomi.getSelectedItem()).getId();}
		if(this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.getSelectedItem()!=null){this.id_rubro_empleaFK_IdRubroEmplea=((RubroEmplea)this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaHistorialPagoMesNomi.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasHistorialPagoMesNomi(Boolean esInicializar) throws Exception {				
		if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualHistorialPagoMesNomi();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaHistorialPagoMesNomi() throws Exception {
		this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByHistorialPagoMesNomi() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosHistorialPagoMesNomiOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomiOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaHistorialPagoMesNomi(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=historialpagomesnomiLogic.getHistorialPagoMesNomis().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=historialpagomesnomis.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosHistorialPagoMesNomi.setModel(new HistorialPagoMesNomiModel(this.historialpagomesnomiLogic.getHistorialPagoMesNomis(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosHistorialPagoMesNomi.setModel(new HistorialPagoMesNomiModel(this.historialpagomesnomis,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByHistorialPagoMesNomi!=null && this.jInternalFrameOrderByHistorialPagoMesNomi.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByHistorialPagoMesNomi();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO,historialpagomesnomiConstantesFunciones.resaltarSeleccionarHistorialPagoMesNomi,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+HistorialPagoMesNomiConstantesFunciones.SCLASSWEBTITULO,historialpagomesnomiConstantesFunciones.resaltarSeleccionarHistorialPagoMesNomi,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_ID));

		if(this.historialpagomesnomiConstantesFunciones.mostraridHistorialPagoMesNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoMesNomiConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialpagomesnomiConstantesFunciones.resaltaridHistorialPagoMesNomi,this.historialpagomesnomiConstantesFunciones.activaridHistorialPagoMesNomi,iSizeTabla,this,true,"idHistorialPagoMesNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialpagomesnomiConstantesFunciones.resaltaridHistorialPagoMesNomi,this.historialpagomesnomiConstantesFunciones.activaridHistorialPagoMesNomi,this,true,"idHistorialPagoMesNomi","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA));

		if(this.historialpagomesnomiConstantesFunciones.mostrarid_empresaHistorialPagoMesNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.historialpagomesnomiConstantesFunciones.resaltarid_empresaHistorialPagoMesNomi,this,this.historialpagomesnomiConstantesFunciones.activarid_empresaHistorialPagoMesNomi,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.historialpagomesnomiConstantesFunciones.resaltarid_empresaHistorialPagoMesNomi,this,this.historialpagomesnomiConstantesFunciones.activarid_empresaHistorialPagoMesNomi,false,"id_empresaHistorialPagoMesNomi","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.historialpagomesnomiConstantesFunciones.mostrarid_empleadoHistorialPagoMesNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.historialpagomesnomiConstantesFunciones.resaltarid_empleadoHistorialPagoMesNomi,this,this.historialpagomesnomiConstantesFunciones.activarid_empleadoHistorialPagoMesNomi,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.historialpagomesnomiConstantesFunciones.resaltarid_empleadoHistorialPagoMesNomi,this,this.historialpagomesnomiConstantesFunciones.activarid_empleadoHistorialPagoMesNomi,true,"id_empleadoHistorialPagoMesNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA));

		if(this.historialpagomesnomiConstantesFunciones.mostrarid_rubro_empleaHistorialPagoMesNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.historialpagomesnomiConstantesFunciones.resaltarid_rubro_empleaHistorialPagoMesNomi,this,this.historialpagomesnomiConstantesFunciones.activarid_rubro_empleaHistorialPagoMesNomi,iSizeTabla));
			tableColumn.setCellEditor(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.historialpagomesnomiConstantesFunciones.resaltarid_rubro_empleaHistorialPagoMesNomi,this,this.historialpagomesnomiConstantesFunciones.activarid_rubro_empleaHistorialPagoMesNomi,true,"id_rubro_empleaHistorialPagoMesNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO));

		if(this.historialpagomesnomiConstantesFunciones.mostrarid_anioHistorialPagoMesNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.historialpagomesnomiConstantesFunciones.resaltarid_anioHistorialPagoMesNomi,this,this.historialpagomesnomiConstantesFunciones.activarid_anioHistorialPagoMesNomi,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.historialpagomesnomiConstantesFunciones.resaltarid_anioHistorialPagoMesNomi,this,this.historialpagomesnomiConstantesFunciones.activarid_anioHistorialPagoMesNomi,true,"id_anioHistorialPagoMesNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES));

		if(this.historialpagomesnomiConstantesFunciones.mostrarid_mesHistorialPagoMesNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.historialpagomesnomiConstantesFunciones.resaltarid_mesHistorialPagoMesNomi,this,this.historialpagomesnomiConstantesFunciones.activarid_mesHistorialPagoMesNomi,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.historialpagomesnomiConstantesFunciones.resaltarid_mesHistorialPagoMesNomi,this,this.historialpagomesnomiConstantesFunciones.activarid_mesHistorialPagoMesNomi,true,"id_mesHistorialPagoMesNomi","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR));

		if(this.historialpagomesnomiConstantesFunciones.mostrarvalorHistorialPagoMesNomi && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.historialpagomesnomiConstantesFunciones.resaltarvalorHistorialPagoMesNomi,this.historialpagomesnomiConstantesFunciones.activarvalorHistorialPagoMesNomi,iSizeTabla,this,true,"valorHistorialPagoMesNomi","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.historialpagomesnomiConstantesFunciones.resaltarvalorHistorialPagoMesNomi,this.historialpagomesnomiConstantesFunciones.activarvalorHistorialPagoMesNomi,this,true,"valorHistorialPagoMesNomi","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new HistorialPagoMesNomiPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialpagomesnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialpagomesnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialPagoMesNomi.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.historialpagomesnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.historialpagomesnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosHistorialPagoMesNomi.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.historialpagomesnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.historialpagomesnomiSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosHistorialPagoMesNomi.addColumn(tableColumn);
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
			
			this.jTableDatosHistorialPagoMesNomi.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosHistorialPagoMesNomi.moveColumn(this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosHistorialPagoMesNomi.moveColumn(this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosHistorialPagoMesNomi.moveColumn(this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosHistorialPagoMesNomi.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosHistorialPagoMesNomi.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosHistorialPagoMesNomi,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosHistorialPagoMesNomi.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosHistorialPagoMesNomi.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosHistorialPagoMesNomi.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=historialpagomesnomiLogic.getHistorialPagoMesNomis().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=historialpagomesnomis.size()-1;
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
		//this.jTableDatosHistorialPagoMesNomi.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosHistorialPagoMesNomi.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosHistorialPagoMesNomi();
			
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
				
				//this.isEsNuevoHistorialPagoMesNomi=false;
					
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
				if(this.historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialPagoMesNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialPagoMesNomi.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.historialpagomesnomi.getsType().equals("DUPLICADO")
				   || this.historialpagomesnomi.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoHistorialPagoMesNomi=true;
				
				} else {
					this.isEsNuevoHistorialPagoMesNomi=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
					if(this.historialpagomesnomi.getId()>=0 && !this.historialpagomesnomi.getIsNew()) {						
						this.isEsNuevoHistorialPagoMesNomi=false;
						
					} else {
						this.isEsNuevoHistorialPagoMesNomi=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoHistorialPagoMesNomi(esRelaciones);						
				
				this.seleccionarHistorialPagoMesNomi(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.historialpagomesnomi.getId()<0) {
					this.isEsNuevoHistorialPagoMesNomi=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarHistorialPagoMesNomi(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarHistorialPagoMesNomi(evt,rowIndex);
				}	
				
				if(this.historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion HistorialPagoMesNomi: " + this.dDif); 
					}
				}								
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarHistorialPagoMesNomi(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.historialpagomesnomi)) {
					if(this.historialpagomesnomi.getId()>0) {
						this.historialpagomesnomi.setIsDeleted(true);
						
						this.historialpagomesnomisEliminados.add(this.historialpagomesnomi);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.historialpagomesnomiLogic.getHistorialPagoMesNomis().remove(this.historialpagomesnomi);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.historialpagomesnomis.remove(this.historialpagomesnomi);				
					}
					
					
					((HistorialPagoMesNomiModel) this.jTableDatosHistorialPagoMesNomi.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarHistorialPagoMesNomi(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoHistorialPagoMesNomi) {
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosHistorialPagoMesNomi.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosHistorialPagoMesNomi.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioHistorialPagoMesNomi(this.historialpagomesnomi);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.historialpagomesnomiConstantesFunciones.cargarid_empresaHistorialPagoMesNomi || this.historialpagomesnomiConstantesFunciones.event_dependid_empresaHistorialPagoMesNomi) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.historialpagomesnomi.getid_empresa());
									//this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(historialpagomesnomi.getEmpresa()!=null) {
							this.empresasForeignKey.add(historialpagomesnomi.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.historialpagomesnomi.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.historialpagomesnomiConstantesFunciones.cargarid_empleadoHistorialPagoMesNomi || this.historialpagomesnomiConstantesFunciones.event_dependid_empleadoHistorialPagoMesNomi) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.historialpagomesnomi.getid_empleado());
									//this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(historialpagomesnomi.getEmpleado()!=null) {
							this.empleadosForeignKey.add(historialpagomesnomi.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.historialpagomesnomi.getid_empleado(),false,"Formulario");

					//RubroEmplea
					if(!this.historialpagomesnomiConstantesFunciones.cargarid_rubro_empleaHistorialPagoMesNomi || this.historialpagomesnomiConstantesFunciones.event_dependid_rubro_empleaHistorialPagoMesNomi) {
						//this.cargarCombosRubroEmpleasForeignKeyLista(" where id="+this.historialpagomesnomi.getid_rubro_emplea());
									//this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
						this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

						if(historialpagomesnomi.getRubroEmplea()!=null) {
							this.rubroempleasForeignKey.add(historialpagomesnomi.getRubroEmplea());
						}

						this.addItemDefectoCombosForeignKeyRubroEmplea();
						this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
					}
					this.setActualRubroEmpleaForeignKey(this.historialpagomesnomi.getid_rubro_emplea(),false,"Formulario");

					//Anio
					if(!this.historialpagomesnomiConstantesFunciones.cargarid_anioHistorialPagoMesNomi || this.historialpagomesnomiConstantesFunciones.event_dependid_anioHistorialPagoMesNomi) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.historialpagomesnomi.getid_anio());
									//this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(historialpagomesnomi.getAnio()!=null) {
							this.aniosForeignKey.add(historialpagomesnomi.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.historialpagomesnomi.getid_anio(),false,"Formulario");

					//Mes
					if(!this.historialpagomesnomiConstantesFunciones.cargarid_mesHistorialPagoMesNomi || this.historialpagomesnomiConstantesFunciones.event_dependid_mesHistorialPagoMesNomi) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.historialpagomesnomi.getid_mes());
									//this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(historialpagomesnomi.getMes()!=null) {
							this.messForeignKey.add(historialpagomesnomi.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.historialpagomesnomi.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesHistorialPagoMesNomi("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesHistorialPagoMesNomi(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualHistorialPagoMesNomi() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoHistorialPagoMesNomi(historialpagomesnomi,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioHistorialPagoMesNomi(historialpagomesnomi);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyHistorialPagoMesNomi(historialpagomesnomi,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyHistorialPagoMesNomi(historialpagomesnomi);
	}
	
	public void setVariablesObjetoActualToFormularioHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.setText(historialpagomesnomi.getId().toString());
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTextFieldvalorHistorialPagoMesNomi.setText(historialpagomesnomi.getvalor().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,HistorialPagoMesNomi historialpagomesnomiLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,historialpagomesnomiLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,HistorialPagoMesNomi historialpagomesnomiLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				historialpagomesnomiLocal=this.historialpagomesnomi;
			} else {
				historialpagomesnomiLocal=this.historialpagomesnomiAnterior;
			}
		}
		
		if(this.permiteMantenimiento(historialpagomesnomiLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoHistorialPagoMesNomi(historialpagomesnomiLocal,true);
					
					if(historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(historialpagomesnomiLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(historialpagomesnomiLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(historialpagomesnomi,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(historialpagomesnomi);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(historialpagomesnomi,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.getText()==null || this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.getText()=="" || this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.getText()=="Id") {
				this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.setText("0");
			}

			if(conColumnasBase) {historialpagomesnomi.setId(Long.parseLong(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialPagoMesNomiConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelIdHistorialPagoMesNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			historialpagomesnomi.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTextFieldvalorHistorialPagoMesNomi.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelvalorHistorialPagoMesNomi,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomiBean,HistorialPagoMesNomi historialpagomesnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomiOrigen,HistorialPagoMesNomi historialpagomesnomi,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialpagomesnomiOrigen.getId()!=null && !historialpagomesnomiOrigen.getId().equals(0L))) {historialpagomesnomi.setId(historialpagomesnomiOrigen.getId());}}
			if(conDefault || (!conDefault && historialpagomesnomiOrigen.getvalor()!=null && !historialpagomesnomiOrigen.getvalor().equals(0.0))) {historialpagomesnomi.setvalor(historialpagomesnomiOrigen.getvalor());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.setText(historialpagomesnomi.getId().toString());
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTextFieldvalorHistorialPagoMesNomi.setText(historialpagomesnomi.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioHistorialPagoMesNomi(HistorialPagoMesNomiBean historialpagomesnomiBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.setText(historialpagomesnomiBean.getId().toString());
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTextFieldvalorHistorialPagoMesNomi.setText(historialpagomesnomiBean.getvalor().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanHistorialPagoMesNomi(HistorialPagoMesNomiParameterReturnGeneral historialpagomesnomiReturnGeneral,HistorialPagoMesNomiBean historialpagomesnomiBean,Boolean conDefault) throws Exception { 
		try {
			HistorialPagoMesNomi historialpagomesnomiLocal=new HistorialPagoMesNomi();
			
			historialpagomesnomiLocal=historialpagomesnomiReturnGeneral.getHistorialPagoMesNomi();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && historialpagomesnomiLocal.getId()!=null && !historialpagomesnomiLocal.getId().equals(0L))) {historialpagomesnomiBean.setId(historialpagomesnomiLocal.getId());}}
			if(conDefault || (!conDefault && historialpagomesnomiLocal.getvalor()!=null && !historialpagomesnomiLocal.getvalor().equals(0.0))) {historialpagomesnomiBean.setvalor(historialpagomesnomiLocal.getvalor());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxHistorialPagoMesNomiGenerico(Long idHistorialPagoMesNomiSeleccionado,JComboBox jComboBoxHistorialPagoMesNomi,List<HistorialPagoMesNomi> historialpagomesnomisLocal)throws Exception {
		try {
			HistorialPagoMesNomi  historialpagomesnomiTemp=null;

			for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomisLocal) {
				if(historialpagomesnomiAux.getId()!=null && historialpagomesnomiAux.getId().equals(idHistorialPagoMesNomiSeleccionado)) {
					historialpagomesnomiTemp=historialpagomesnomiAux;
					break;
				}
			}

			jComboBoxHistorialPagoMesNomi.setSelectedItem(historialpagomesnomiTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxHistorialPagoMesNomiGenerico(JComboBox jComboBoxHistorialPagoMesNomi,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialPagoMesNomi.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxHistorialPagoMesNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxHistorialPagoMesNomi.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxHistorialPagoMesNomi.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxHistorialPagoMesNomi.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxHistorialPagoMesNomi.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialpagomesnomi=(HistorialPagoMesNomi) historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialpagomesnomi =(HistorialPagoMesNomi) historialpagomesnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!historialpagomesnomi.getIsNew() && !historialpagomesnomi.getIsChanged() && !historialpagomesnomi.getIsDeleted()) {
				sDescripcion=historialpagomesnomi.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=historialpagomesnomi.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!historialpagomesnomi.getIsNew() && !historialpagomesnomi.getIsChanged() && !historialpagomesnomi.getIsDeleted()) {
				sDescripcion=historialpagomesnomi.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=historialpagomesnomi.getempleado_descripcion();
			}
		}

		if(sTipo.equals("RubroEmplea")) {
			//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
			if(!historialpagomesnomi.getIsNew() && !historialpagomesnomi.getIsChanged() && !historialpagomesnomi.getIsDeleted()) {
				sDescripcion=historialpagomesnomi.getrubroemplea_descripcion();
			} else {
				//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
				sDescripcion=historialpagomesnomi.getrubroemplea_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!historialpagomesnomi.getIsNew() && !historialpagomesnomi.getIsChanged() && !historialpagomesnomi.getIsDeleted()) {
				sDescripcion=historialpagomesnomi.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=historialpagomesnomi.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!historialpagomesnomi.getIsNew() && !historialpagomesnomi.getIsChanged() && !historialpagomesnomi.getIsDeleted()) {
				sDescripcion=historialpagomesnomi.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=historialpagomesnomi.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		HistorialPagoMesNomi historialpagomesnomiRow=new HistorialPagoMesNomi();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialpagomesnomiRow=(HistorialPagoMesNomi) historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			historialpagomesnomiRow=(HistorialPagoMesNomi) historialpagomesnomis.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualHistorialPagoMesNomi(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoMesNomi && this.isPermisoNuevoHistorialPagoMesNomi));			
			this.jButtonDuplicarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaDuplicarHistorialPagoMesNomi && this.isPermisoDuplicarHistorialPagoMesNomi));			
			this.jButtonCopiarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaCopiarHistorialPagoMesNomi && this.isPermisoCopiarHistorialPagoMesNomi));
			this.jButtonVerFormHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaVerFormHistorialPagoMesNomi && this.isPermisoVerFormHistorialPagoMesNomi));
			
			this.jButtonAbrirOrderByHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoMesNomi && this.isPermisoOrdenHistorialPagoMesNomi));			
			
			this.jButtonNuevoRelacionesHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi && this.isPermisoNuevoHistorialPagoMesNomi));			
			this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoMesNomi && this.isPermisoNuevoHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi));
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonModificarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaModificarHistorialPagoMesNomi && this.isPermisoActualizarHistorialPagoMesNomi));	
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonActualizarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaActualizarHistorialPagoMesNomi && this.isPermisoActualizarHistorialPagoMesNomi));	
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonEliminarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaEliminarHistorialPagoMesNomi && this.isPermisoEliminarHistorialPagoMesNomi));
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonCancelarHistorialPagoMesNomi.setVisible(this.isVisibilidadCeldaCancelarHistorialPagoMesNomi);							
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaGuardarHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi));			
			
			}
						
			this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoMesNomi && this.isPermisoNuevoHistorialPagoMesNomi));						
			this.jButtonDuplicarToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaDuplicarHistorialPagoMesNomi && this.isPermisoDuplicarHistorialPagoMesNomi));						
			this.jButtonCopiarToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaCopiarHistorialPagoMesNomi && this.isPermisoCopiarHistorialPagoMesNomi));			
			this.jButtonVerFormToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaVerFormHistorialPagoMesNomi && this.isPermisoVerFormHistorialPagoMesNomi));			
			this.jButtonAbrirOrderByToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoMesNomi && this.isPermisoOrdenHistorialPagoMesNomi));
			this.jButtonNuevoRelacionesToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi && this.isPermisoNuevoHistorialPagoMesNomi));			
			this.jButtonNuevoGuardarCambiosToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoMesNomi && this.isPermisoNuevoHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi));			
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonModificarToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaModificarHistorialPagoMesNomi && this.isPermisoActualizarHistorialPagoMesNomi));	
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonActualizarToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaActualizarHistorialPagoMesNomi  && this.isPermisoActualizarHistorialPagoMesNomi));	
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonEliminarToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaEliminarHistorialPagoMesNomi && this.isPermisoEliminarHistorialPagoMesNomi));
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonCancelarToolBarHistorialPagoMesNomi.setVisible(this.isVisibilidadCeldaCancelarHistorialPagoMesNomi);				
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaGuardarHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoMesNomi && this.isPermisoNuevoHistorialPagoMesNomi));			
			this.jMenuItemDuplicarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaDuplicarHistorialPagoMesNomi && this.isPermisoDuplicarHistorialPagoMesNomi));			
			this.jMenuItemCopiarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaCopiarHistorialPagoMesNomi && this.isPermisoCopiarHistorialPagoMesNomi));			
			this.jMenuItemVerFormHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaVerFormHistorialPagoMesNomi && this.isPermisoVerFormHistorialPagoMesNomi));			
			this.jMenuItemAbrirOrderByHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoMesNomi && this.isPermisoOrdenHistorialPagoMesNomi));			
			//this.jMenuItemMostrarOcultarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoMesNomi && this.isPermisoOrdenHistorialPagoMesNomi));
			this.jMenuItemDetalleAbrirOrderByHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoMesNomi && this.isPermisoOrdenHistorialPagoMesNomi));			
			//this.jMenuItemDetalleMostrarOcultarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaOrdenHistorialPagoMesNomi && this.isPermisoOrdenHistorialPagoMesNomi));			
			this.jMenuItemNuevoRelacionesHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi && this.isPermisoNuevoHistorialPagoMesNomi));			
			this.jMenuItemNuevoGuardarCambiosHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaNuevoHistorialPagoMesNomi && this.isPermisoNuevoHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi));									
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemModificarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaModificarHistorialPagoMesNomi && this.isPermisoActualizarHistorialPagoMesNomi));	
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemActualizarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaActualizarHistorialPagoMesNomi && this.isPermisoActualizarHistorialPagoMesNomi));	
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemEliminarHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaEliminarHistorialPagoMesNomi && this.isPermisoEliminarHistorialPagoMesNomi));
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemCancelarHistorialPagoMesNomi.setVisible(this.isVisibilidadCeldaCancelarHistorialPagoMesNomi);				
			}
			
			this.jMenuItemGuardarCambiosHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaGuardarHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi));						
			this.jMenuItemGuardarCambiosTablaHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=this.jButtonNuevoHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaDuplicarHistorialPagoMesNomi=this.jButtonDuplicarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaCopiarHistorialPagoMesNomi=this.jButtonCopiarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaVerFormHistorialPagoMesNomi=this.jButtonVerFormHistorialPagoMesNomi.isVisible();
			
			this.isVisibilidadCeldaOrdenHistorialPagoMesNomi=this.jButtonAbrirOrderByHistorialPagoMesNomi.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=this.jButtonNuevoRelacionesHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaModificarHistorialPagoMesNomi=this.jButtonModificarHistorialPagoMesNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonActualizarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonEliminarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonCancelarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosHistorialPagoMesNomi.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=this.jButtonNuevoToolBarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=this.jButtonNuevoRelacionesToolBarHistorialPagoMesNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			this.isVisibilidadCeldaModificarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonModificarToolBarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonActualizarToolBarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonEliminarToolBarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonCancelarToolBarHistorialPagoMesNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=this.jButtonGuardarCambiosToolBarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=this.jButtonGuardarCambiosTablaToolBarHistorialPagoMesNomi.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=this.jMenuItemNuevoHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=this.jMenuItemNuevoRelacionesHistorialPagoMesNomi.isVisible();
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			this.isVisibilidadCeldaModificarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemModificarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemActualizarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemEliminarHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemCancelarHistorialPagoMesNomi.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=this.jMenuItemGuardarCambiosHistorialPagoMesNomi.isVisible();
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=this.jMenuItemGuardarCambiosTablaHistorialPagoMesNomi.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesHistorialPagoMesNomi(Boolean esInicializar) {
		if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {			
			if(this.historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
				//if(this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialPagoMesNomi();
			}
			
			this.inicializarActualizarBindingBotonesManualHistorialPagoMesNomi(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualHistorialPagoMesNomi() {
		this.jButtonNuevoHistorialPagoMesNomi.setVisible(this.isPermisoNuevoHistorialPagoMesNomi);			
		this.jButtonDuplicarHistorialPagoMesNomi.setVisible(this.isPermisoDuplicarHistorialPagoMesNomi);			
		this.jButtonCopiarHistorialPagoMesNomi.setVisible(this.isPermisoCopiarHistorialPagoMesNomi);			
		this.jButtonVerFormHistorialPagoMesNomi.setVisible(this.isPermisoVerFormHistorialPagoMesNomi);			
		
		this.jButtonAbrirOrderByHistorialPagoMesNomi.setVisible(this.isPermisoOrdenHistorialPagoMesNomi);					
		
		this.jButtonNuevoRelacionesHistorialPagoMesNomi.setVisible(this.isPermisoNuevoHistorialPagoMesNomi);			
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonModificarHistorialPagoMesNomi.setVisible(this.isPermisoActualizarHistorialPagoMesNomi);	
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonActualizarHistorialPagoMesNomi.setVisible(this.isPermisoActualizarHistorialPagoMesNomi);	
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonEliminarHistorialPagoMesNomi.setVisible(this.isPermisoEliminarHistorialPagoMesNomi);
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonCancelarHistorialPagoMesNomi.setVisible(this.isVisibilidadCeldaCancelarHistorialPagoMesNomi);						
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosHistorialPagoMesNomi.setVisible(this.isPermisoGuardarCambiosHistorialPagoMesNomi);							
		}
		
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.setVisible(this.isPermisoActualizarHistorialPagoMesNomi);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialPagoMesNomi() {
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonModificarHistorialPagoMesNomi.setVisible(this.isPermisoActualizarHistorialPagoMesNomi);	
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonActualizarHistorialPagoMesNomi.setVisible(this.isPermisoActualizarHistorialPagoMesNomi);	
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonEliminarHistorialPagoMesNomi.setVisible(this.isPermisoEliminarHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonCancelarHistorialPagoMesNomi.setVisible(this.isVisibilidadCeldaCancelarHistorialPagoMesNomi);							
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosHistorialPagoMesNomi.setVisible((this.isVisibilidadCeldaGuardarHistorialPagoMesNomi && this.isPermisoGuardarCambiosHistorialPagoMesNomi));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosHistorialPagoMesNomi() {
		if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualHistorialPagoMesNomi();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesHistorialPagoMesNomi() {
	}
	
	public void jTableDatosHistorialPagoMesNomiListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarHistorialPagoMesNomi(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidHistorialPagoMesNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagomesnomi==null) {
						this.historialpagomesnomi = new HistorialPagoMesNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
				}

				if(this.historialpagomesnomi.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.historialpagomesnomi.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoMesNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaHistorialPagoMesNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebHistorialPagoMesNomi(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialPagoMesNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialPagoMesNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.historialpagomesnomiLogic.getConnexion());

				if(this.historialpagomesnomi.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.historialpagomesnomi.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialPagoMesNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoMesNomi.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderHistorialPagoMesNomi.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaHistorialPagoMesNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagomesnomi==null) {
						this.historialpagomesnomi = new HistorialPagoMesNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
				}

				if(this.historialpagomesnomi.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.historialpagomesnomi.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoMesNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoHistorialPagoMesNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebHistorialPagoMesNomi(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialPagoMesNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialPagoMesNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.historialpagomesnomiLogic.getConnexion());

				if(this.historialpagomesnomi.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.historialpagomesnomi.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialPagoMesNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoMesNomi.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderHistorialPagoMesNomi.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoHistorialPagoMesNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagomesnomi==null) {
						this.historialpagomesnomi = new HistorialPagoMesNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
				}

				if(this.historialpagomesnomi.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.historialpagomesnomi.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoMesNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rubro_empleaHistorialPagoMesNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorubroemplea=true;

			idTienePermisorubroemplea=this.tienePermisosUsuarioEnPaginaWebHistorialPagoMesNomi(RubroEmpleaConstantesFunciones.CLASSNAME);

			if(idTienePermisorubroemplea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialPagoMesNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialPagoMesNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.historialpagomesnomiLogic.getConnexion());

				if(this.historialpagomesnomi.getid_rubro_emplea()!=null) {
					this.rubroempleaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rubroempleaBeanSwingJInternalFrame.setIdActual(this.historialpagomesnomi.getid_rubro_emplea());
					this.rubroempleaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea();
				}

				JInternalFrameBase jinternalFrame =this.rubroempleaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialPagoMesNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoMesNomi.getBorder();
				TitledBorder titledBorderrubroemplea=(TitledBorder)this.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

				titledBorderrubroemplea.setTitle(titledBorderHistorialPagoMesNomi.getTitle() + " -> Rubro Emplea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rubro_empleaHistorialPagoMesNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagomesnomi==null) {
						this.historialpagomesnomi = new HistorialPagoMesNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
				}

				if(this.historialpagomesnomi.getid_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rubro_emplea = "+this.historialpagomesnomi.getid_rubro_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoMesNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioHistorialPagoMesNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebHistorialPagoMesNomi(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialPagoMesNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialPagoMesNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.historialpagomesnomiLogic.getConnexion());

				if(this.historialpagomesnomi.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.historialpagomesnomi.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialPagoMesNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoMesNomi.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderHistorialPagoMesNomi.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioHistorialPagoMesNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagomesnomi==null) {
						this.historialpagomesnomi = new HistorialPagoMesNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
				}

				if(this.historialpagomesnomi.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.historialpagomesnomi.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoMesNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesHistorialPagoMesNomiUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebHistorialPagoMesNomi(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosHistorialPagoMesNomi.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosHistorialPagoMesNomi.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.historialpagomesnomiLogic.getConnexion());

				if(this.historialpagomesnomi.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.historialpagomesnomi.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderHistorialPagoMesNomi=(TitledBorder)this.jScrollPanelDatosHistorialPagoMesNomi.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderHistorialPagoMesNomi.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesHistorialPagoMesNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagomesnomi==null) {
						this.historialpagomesnomi = new HistorialPagoMesNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
				}

				if(this.historialpagomesnomi.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.historialpagomesnomi.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoMesNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorHistorialPagoMesNomiBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.gethistorialpagomesnomi(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.historialpagomesnomi==null) {
						this.historialpagomesnomi = new HistorialPagoMesNomi();
					}

					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);
				}

				if(this.historialpagomesnomi.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.historialpagomesnomi.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingHistorialPagoMesNomi(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);

			this.getHistorialPagoMesNomisFK_IdAnio();

			this.inicializarActualizarBindingHistorialPagoMesNomi(false);

			//if(HistorialPagoMesNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);

			this.getHistorialPagoMesNomisFK_IdEmpleado();

			this.inicializarActualizarBindingHistorialPagoMesNomi(false);

			//if(HistorialPagoMesNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);

			this.getHistorialPagoMesNomisFK_IdEmpresa();

			this.inicializarActualizarBindingHistorialPagoMesNomi(false);

			//if(HistorialPagoMesNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);

			this.getHistorialPagoMesNomisFK_IdMes();

			this.inicializarActualizarBindingHistorialPagoMesNomi(false);

			//if(HistorialPagoMesNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRubroEmpleaHistorialPagoMesNomiActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);

			this.getHistorialPagoMesNomisFK_IdRubroEmplea();

			this.inicializarActualizarBindingHistorialPagoMesNomi(false);

			//if(HistorialPagoMesNomiBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.historialpagomesnomiLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameHistorialPagoMesNomi() {
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.setVisible(false);	    			
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.dispose();
			this.jInternalFrameDetalleFormHistorialPagoMesNomi=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi!=null) {
			this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.dispose();
			this.jInternalFrameReporteDinamicoHistorialPagoMesNomi=null;
		}
		
		if(this.jInternalFrameImportacionHistorialPagoMesNomi!=null) {
			this.jInternalFrameImportacionHistorialPagoMesNomi.setVisible(false);	    			
			this.jInternalFrameImportacionHistorialPagoMesNomi.dispose();
			this.jInternalFrameImportacionHistorialPagoMesNomi=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessHistorialPagoMesNomi();
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
			
			if(sTipo.equals("NuevoHistorialPagoMesNomi")) {
				jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarHistorialPagoMesNomi")) {
				jButtonDuplicarHistorialPagoMesNomiActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarHistorialPagoMesNomi")) {
				jButtonCopiarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormHistorialPagoMesNomi")) {
				jButtonVerFormHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarHistorialPagoMesNomi")) {
				jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarHistorialPagoMesNomi")) {
				jButtonDuplicarHistorialPagoMesNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoHistorialPagoMesNomi")) {
				jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarHistorialPagoMesNomi")) {
				jButtonDuplicarHistorialPagoMesNomiActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesHistorialPagoMesNomi")) {
				jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarHistorialPagoMesNomi")) {
				jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesHistorialPagoMesNomi")) {
				jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarHistorialPagoMesNomi")) {
				jButtonModificarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarHistorialPagoMesNomi")) {
				jButtonModificarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarHistorialPagoMesNomi")) {
				jButtonModificarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarHistorialPagoMesNomi")) {
				jButtonActualizarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarHistorialPagoMesNomi")) {
				jButtonActualizarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarHistorialPagoMesNomi")) {
				jButtonActualizarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarHistorialPagoMesNomi")) {
				jButtonEliminarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarHistorialPagoMesNomi")) {
				jButtonEliminarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarHistorialPagoMesNomi")) {
				jButtonEliminarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarHistorialPagoMesNomi")) {
				jButtonCancelarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarHistorialPagoMesNomi")) {
				jButtonCancelarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarHistorialPagoMesNomi")) {
				jButtonCancelarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarHistorialPagoMesNomi")) {
				jButtonCerrarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarHistorialPagoMesNomi")) {
				jButtonCerrarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarHistorialPagoMesNomi")) {
				jButtonCerrarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarHistorialPagoMesNomi")) {
				jButtonMostrarOcultarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarHistorialPagoMesNomi")) {
				jButtonCancelarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosHistorialPagoMesNomi")) {
				jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarHistorialPagoMesNomi")) {
				jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarHistorialPagoMesNomi")) {
				jButtonCopiarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarHistorialPagoMesNomi")) {
				jButtonVerFormHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosHistorialPagoMesNomi")) {
				jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarHistorialPagoMesNomi")) {
				jButtonCopiarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormHistorialPagoMesNomi")) {
				jButtonVerFormHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaHistorialPagoMesNomi")) {
				jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarHistorialPagoMesNomi")) {
				jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaHistorialPagoMesNomi")) {
				jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionHistorialPagoMesNomi")) {
				jButtonRecargarInformacionHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarHistorialPagoMesNomi")) {
				jButtonRecargarInformacionHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionHistorialPagoMesNomi")) {
				jButtonRecargarInformacionHistorialPagoMesNomiActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresHistorialPagoMesNomi")) {
				jButtonAnterioresHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarHistorialPagoMesNomi")) {
				jButtonAnterioresHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreHistorialPagoMesNomi")) {
				jButtonAnterioresHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesHistorialPagoMesNomi")) {
				jButtonSiguientesHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarHistorialPagoMesNomi")) {
				jButtonSiguientesHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesHistorialPagoMesNomi")) {
				jButtonSiguientesHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByHistorialPagoMesNomi") || sTipo.equals("MenuItemDetalleAbrirOrderByHistorialPagoMesNomi")) {
				jButtonAbrirOrderByHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarHistorialPagoMesNomi") || sTipo.equals("MenuItemDetalleMostrarOcultarHistorialPagoMesNomi")) {
				jButtonMostrarOcultarHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialPagoMesNomi")) {
				jButtonNuevoGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarHistorialPagoMesNomi")) {
				jButtonNuevoGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosHistorialPagoMesNomi")) {
				jButtonNuevoGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoHistorialPagoMesNomi")) {
				jButtonCerrarReporteDinamicoHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoHistorialPagoMesNomi")) {
				jButtonGenerarReporteDinamicoHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoHistorialPagoMesNomi")) {
				
				jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionHistorialPagoMesNomi")) {
				jButtonCerrarImportacionHistorialPagoMesNomiActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionHistorialPagoMesNomi")) {
				
				jButtonGenerarImportacionHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionHistorialPagoMesNomi")) {
				
				jButtonAbrirImportacionHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesHistorialPagoMesNomi")) {
				jComboBoxTiposAccionesHistorialPagoMesNomiActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesHistorialPagoMesNomi")) {
				jComboBoxTiposRelacionesHistorialPagoMesNomiActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioHistorialPagoMesNomi")) {
				jComboBoxTiposAccionesHistorialPagoMesNomiActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarHistorialPagoMesNomi")) {
				
				jComboBoxTiposSeleccionarHistorialPagoMesNomiActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralHistorialPagoMesNomi")) {
				jTextFieldValorCampoGeneralHistorialPagoMesNomiActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByHistorialPagoMesNomi")) {
				jButtonAbrirOrderByHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarHistorialPagoMesNomi")) {
				jButtonAbrirOrderByHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByHistorialPagoMesNomi")) {
				jButtonCerrarOrderByHistorialPagoMesNomiActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialPagoMesNomiBusqueda")) {
				this.jButtonidHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHistorialPagoMesNomiUpdate")) {
				this.jButtonid_empresaHistorialPagoMesNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHistorialPagoMesNomiBusqueda")) {
				this.jButtonid_empresaHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoHistorialPagoMesNomiUpdate")) {
				this.jButtonid_empleadoHistorialPagoMesNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoHistorialPagoMesNomiBusqueda")) {
				this.jButtonid_empleadoHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaHistorialPagoMesNomiUpdate")) {
				this.jButtonid_rubro_empleaHistorialPagoMesNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaHistorialPagoMesNomiBusqueda")) {
				this.jButtonid_rubro_empleaHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioHistorialPagoMesNomiUpdate")) {
				this.jButtonid_anioHistorialPagoMesNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioHistorialPagoMesNomiBusqueda")) {
				this.jButtonid_anioHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesHistorialPagoMesNomiUpdate")) {
				this.jButtonid_mesHistorialPagoMesNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesHistorialPagoMesNomiBusqueda")) {
				this.jButtonid_mesHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorHistorialPagoMesNomiBusqueda")) {
				this.jButtonvalorHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioHistorialPagoMesNomi")) {
				this.jButtonFK_IdAnioHistorialPagoMesNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoHistorialPagoMesNomi")) {
				this.jButtonFK_IdEmpleadoHistorialPagoMesNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesHistorialPagoMesNomi")) {
				this.jButtonFK_IdMesHistorialPagoMesNomiActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRubroEmpleaHistorialPagoMesNomi")) {
				this.jButtonFK_IdRubroEmpleaHistorialPagoMesNomiActionPerformed(evt);
			}
			
			;
			
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessHistorialPagoMesNomi();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoMesNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				


				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			HistorialPagoMesNomi historialpagomesnomiLocal=null;
			
			if(!this.getEsControlTabla()) {
				historialpagomesnomiLocal=this.historialpagomesnomi;
			} else {
				historialpagomesnomiLocal=this.historialpagomesnomiAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
							
				
				


				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoMesNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
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
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
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
			
			


			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoMesNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
								
						
				


				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
								
				
				


				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoMesNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoMesNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoMesNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
							
				
				


				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoMesNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
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
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
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
			
			


			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoMesNomiActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
								
				
				


				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoMesNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoMesNomiActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
			
			this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoMesNomiActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosHistorialPagoMesNomi")) {
					jCheckBoxSeleccionarTodosHistorialPagoMesNomiItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosHistorialPagoMesNomi")) {
					jCheckBoxSeleccionadosHistorialPagoMesNomiItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarHistorialPagoMesNomi")) {
					
				}
				
				


				
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
												
				
				


				
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoMesNomiActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoMesNomiActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
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
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
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
			
			


			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaHistorialPagoMesNomiActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.historialpagomesnomi);
				
				this.actualizarInformacion("INFO_PADRE",false,this.historialpagomesnomi);
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
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
				
				


				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(HistorialPagoMesNomi.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",HistorialPagoMesNomi.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaHistorialPagoMesNomiActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.historialpagomesnomiAnterior =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarHistorialPagoMesNomi")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosHistorialPagoMesNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosHistorialPagoMesNomi.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.historialpagomesnomi =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.historialpagomesnomi);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarHistorialPagoMesNomi")) {
				
				}
				
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarHistorialPagoMesNomi")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosHistorialPagoMesNomi.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarHistorialPagoMesNomi")) {
			
			}
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessHistorialPagoMesNomi();
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
			if(sTipo.equals("NuevoHistorialPagoMesNomi")) {
				jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarHistorialPagoMesNomi")) {
				jButtonDuplicarHistorialPagoMesNomiActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarHistorialPagoMesNomi")) {
				jButtonCopiarHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormHistorialPagoMesNomi")) {
				jButtonVerFormHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesHistorialPagoMesNomi")) {
				jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarHistorialPagoMesNomi")) {
				jButtonModificarHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarHistorialPagoMesNomi")) {
				jButtonActualizarHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarHistorialPagoMesNomi")) {
				jButtonEliminarHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaHistorialPagoMesNomi")) {
				jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarHistorialPagoMesNomi")) {
				jButtonCancelarHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarHistorialPagoMesNomi")) {
				jButtonCerrarHistorialPagoMesNomiActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosHistorialPagoMesNomi")) {
				jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosHistorialPagoMesNomi")) {
				jButtonNuevoGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByHistorialPagoMesNomi")) {
				jButtonAbrirOrderByHistorialPagoMesNomiActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionHistorialPagoMesNomi")) {
				jButtonRecargarInformacionHistorialPagoMesNomiActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresHistorialPagoMesNomi")) {
				jButtonAnterioresHistorialPagoMesNomiActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesHistorialPagoMesNomi")) {
				jButtonSiguientesHistorialPagoMesNomiActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idHistorialPagoMesNomiBusqueda")) {
				this.jButtonidHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaHistorialPagoMesNomiUpdate")) {
				this.jButtonid_empresaHistorialPagoMesNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaHistorialPagoMesNomiBusqueda")) {
				this.jButtonid_empresaHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoHistorialPagoMesNomiUpdate")) {
				this.jButtonid_empleadoHistorialPagoMesNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoHistorialPagoMesNomiBusqueda")) {
				this.jButtonid_empleadoHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaHistorialPagoMesNomiUpdate")) {
				this.jButtonid_rubro_empleaHistorialPagoMesNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaHistorialPagoMesNomiBusqueda")) {
				this.jButtonid_rubro_empleaHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioHistorialPagoMesNomiUpdate")) {
				this.jButtonid_anioHistorialPagoMesNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioHistorialPagoMesNomiBusqueda")) {
				this.jButtonid_anioHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesHistorialPagoMesNomiUpdate")) {
				this.jButtonid_mesHistorialPagoMesNomiUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesHistorialPagoMesNomiBusqueda")) {
				this.jButtonid_mesHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorHistorialPagoMesNomiBusqueda")) {
				this.jButtonvalorHistorialPagoMesNomiBusquedaActionPerformed(evt);
			}
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessHistorialPagoMesNomi();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameHistorialPagoMesNomi")) {
				closingInternalFrameHistorialPagoMesNomi();
				
			} else if(sTipo.equals("jButtonCancelarHistorialPagoMesNomi")) {
				JInternalFrameBase jInternalFrameDetalleFormHistorialPagoMesNomi = (JInternalFrameBase)evt.getSource();
	            	
	            HistorialPagoMesNomiBeanSwingJInternalFrame jInternalFrameParent=(HistorialPagoMesNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialPagoMesNomi.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarHistorialPagoMesNomiActionPerformed(null);
			}
			
			HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.historialpagomesnomi,new Object(),this.historialpagomesnomiParameterGeneral,this.historialpagomesnomiReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormHistorialPagoMesNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormHistorialPagoMesNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormHistorialPagoMesNomi(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.historialpagomesnomi)) {
			if(!esControlTabla) {
				if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);			
				}
				
				if(this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.historialpagomesnomiReturnGeneral=historialpagomesnomiLogic.procesarEventosHistorialPagoMesNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialpagomesnomiLogic.getHistorialPagoMesNomis(),this.historialpagomesnomi,this.historialpagomesnomiParameterGeneral,this.isEsNuevoHistorialPagoMesNomi,classes);//this.historialpagomesnomiLogic.getHistorialPagoMesNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanHistorialPagoMesNomi(this.historialpagomesnomiReturnGeneral,this.historialpagomesnomiBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanHistorialPagoMesNomi(classes,this.historialpagomesnomiReturnGeneral,this.historialpagomesnomiBean,false);
					}
						
					if(this.historialpagomesnomiReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyHistorialPagoMesNomi(this.historialpagomesnomiReturnGeneral.getHistorialPagoMesNomi());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioHistorialPagoMesNomi(this.historialpagomesnomiReturnGeneral.getHistorialPagoMesNomi());	
					}
						
					if(this.historialpagomesnomiReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioHistorialPagoMesNomi(this.historialpagomesnomiReturnGeneral.getHistorialPagoMesNomi(),classes);//this.historialpagomesnomiBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioHistorialPagoMesNomi(this.historialpagomesnomi,classes);//this.historialpagomesnomiBean);									
				}
			
				if(HistorialPagoMesNomiJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualHistorialPagoMesNomi(this.historialpagomesnomi,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysHistorialPagoMesNomi(this.historialpagomesnomi);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.historialpagomesnomiAnterior!=null) {
						this.historialpagomesnomi=this.historialpagomesnomiAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.historialpagomesnomiReturnGeneral=historialpagomesnomiLogic.procesarEventosHistorialPagoMesNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialpagomesnomiLogic.getHistorialPagoMesNomis(),this.historialpagomesnomi,this.historialpagomesnomiParameterGeneral,this.isEsNuevoHistorialPagoMesNomi,classes);//this.historialpagomesnomiLogic.getHistorialPagoMesNomi()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.historialpagomesnomiSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.historialpagomesnomiSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.historialpagomesnomiReturnGeneral.getHistorialPagoMesNomi(),historialpagomesnomiLogic.getHistorialPagoMesNomis());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.historialpagomesnomiReturnGeneral.getHistorialPagoMesNomi(),this.historialpagomesnomis);
				}
				//ARCHITECTURE
				
				//this.jTableDatosHistorialPagoMesNomi.repaint();
				
				//((AbstractTableModel) this.jTableDatosHistorialPagoMesNomi.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosHistorialPagoMesNomi();
			}
		}
	}
	
	public void actualizarVisualTableDatosHistorialPagoMesNomi() throws Exception {
		
		HistorialPagoMesNomiModel historialpagomesnomiModel=(HistorialPagoMesNomiModel)this.jTableDatosHistorialPagoMesNomi.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			historialpagomesnomiModel.historialpagomesnomis=this.historialpagomesnomiLogic.getHistorialPagoMesNomis();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			historialpagomesnomiModel.historialpagomesnomis=this.historialpagomesnomis;
		}
		
		
		((HistorialPagoMesNomiModel) this.jTableDatosHistorialPagoMesNomi.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaHistorialPagoMesNomi() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.gethistorialpagomesnomiAnterior(),this.historialpagomesnomiLogic.getHistorialPagoMesNomis());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.gethistorialpagomesnomiAnterior(),this.historialpagomesnomis);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosHistorialPagoMesNomi();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
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
										
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialpagomesnomi,new Object(),generalEntityParameterGeneral,this.historialpagomesnomiReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=HistorialPagoMesNomiConstantesFunciones.getClassesRelationshipsOfHistorialPagoMesNomi(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=HistorialPagoMesNomiConstantesFunciones.getClassesRelationshipsFromStringsOfHistorialPagoMesNomi(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormHistorialPagoMesNomi(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.historialpagomesnomi,new Object(),generalEntityParameterGeneral,this.historialpagomesnomiReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioHistorialPagoMesNomi(HistorialPagoMesNomiBean historialpagomesnomiBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanHistorialPagoMesNomi(ArrayList<Classe> classes,HistorialPagoMesNomiReturnGeneral historialpagomesnomiReturnGeneral,HistorialPagoMesNomiBean historialpagomesnomiBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.historialpagomesnomi)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi = new HistorialPagoMesNomiDetalleFormJInternalFrame(jDesktopPane,this.historialpagomesnomiSessionBean.getConGuardarRelaciones(),this.historialpagomesnomiSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.setVisible(false);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.setSelected(false);						
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.historialpagomesnomiLogic=this.historialpagomesnomiLogic;
		
		this.cargarCombosFrameForeignKeyHistorialPagoMesNomi("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleHistorialPagoMesNomi();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleHistorialPagoMesNomi();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyHistorialPagoMesNomi("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyHistorialPagoMesNomi();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialPagoMesNomi"));
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonModificarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"ModificarHistorialPagoMesNomi"));

		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonModificarToolBarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialPagoMesNomi"));
					
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemModificarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialPagoMesNomi"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonActualizarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"ActualizarHistorialPagoMesNomi"));
		
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonActualizarToolBarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialPagoMesNomi"));
						
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemActualizarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialPagoMesNomi"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonEliminarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"EliminarHistorialPagoMesNomi"));
		
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonEliminarToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialPagoMesNomi"));
								
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemEliminarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialPagoMesNomi"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonCancelarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"CancelarHistorialPagoMesNomi"));
		
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonCancelarToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialPagoMesNomi"));
					
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemCancelarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialPagoMesNomi"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemDetalleCerrarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialPagoMesNomi"));		
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialPagoMesNomi"));
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialPagoMesNomi"));
		
		
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialPagoMesNomi"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonidHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empresaHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empresaHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empleadoHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empleadoHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_anioHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_anioHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_anioHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_anioHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_mesHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_mesHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoMesNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonvalorHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorHistorialPagoMesNomiBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTabbedPaneRelacionesHistorialPagoMesNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialPagoMesNomi"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameHistorialPagoMesNomi"));
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarHistorialPagoMesNomi"));
		}
		
		this.jTableDatosHistorialPagoMesNomi.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarHistorialPagoMesNomi"));
		
		this.jTableDatosHistorialPagoMesNomi.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarHistorialPagoMesNomi"));
		
		this.jButtonNuevoHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"NuevoHistorialPagoMesNomi"));
		
		this.jButtonDuplicarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"DuplicarHistorialPagoMesNomi"));
		
		this.jButtonCopiarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"CopiarHistorialPagoMesNomi"));
		
		this.jButtonVerFormHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"VerFormHistorialPagoMesNomi"));
		
		
		this.jButtonNuevoToolBarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"NuevoToolBarHistorialPagoMesNomi"));
			
		this.jButtonDuplicarToolBarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"DuplicarToolBarHistorialPagoMesNomi"));
			
		this.jMenuItemNuevoHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoHistorialPagoMesNomi"));
			
		this.jMenuItemDuplicarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarHistorialPagoMesNomi"));		
		
		
		this.jButtonNuevoRelacionesHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"NuevoRelacionesHistorialPagoMesNomi"));
		
		
		this.jButtonNuevoRelacionesToolBarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarHistorialPagoMesNomi"));
			
		this.jMenuItemNuevoRelacionesHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesHistorialPagoMesNomi"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonModificarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"ModificarHistorialPagoMesNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonModificarToolBarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"ModificarToolBarHistorialPagoMesNomi"));
			
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemModificarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"MenuItemModificarHistorialPagoMesNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonActualizarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"ActualizarHistorialPagoMesNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonActualizarToolBarHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"ActualizarToolBarHistorialPagoMesNomi"));
				
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemActualizarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemActualizarHistorialPagoMesNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonEliminarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"EliminarHistorialPagoMesNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonEliminarToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"EliminarToolBarHistorialPagoMesNomi"));
						
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemEliminarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemEliminarHistorialPagoMesNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonCancelarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"CancelarHistorialPagoMesNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonCancelarToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"CancelarToolBarHistorialPagoMesNomi"));
			
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemCancelarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemCancelarHistorialPagoMesNomi"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarHistorialPagoMesNomi"));		
		
		
		this.jButtonCerrarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"CerrarHistorialPagoMesNomi"));
		
		
		this.jButtonCerrarToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"CerrarToolBarHistorialPagoMesNomi"));
			
		this.jMenuItemCerrarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemCerrarHistorialPagoMesNomi"));
			
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jMenuItemDetalleCerrarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarHistorialPagoMesNomi"));		
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosHistorialPagoMesNomi"));
		}
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarHistorialPagoMesNomi"));
		}
		
		this.jButtonCopiarToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"CopiarToolBarHistorialPagoMesNomi"));
			
		this.jButtonVerFormToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"VerFormToolBarHistorialPagoMesNomi"));
		
		this.jMenuItemGuardarCambiosHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosHistorialPagoMesNomi"));
			
		this.jMenuItemCopiarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemCopiarHistorialPagoMesNomi"));		
		
		this.jMenuItemVerFormHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemVerFormHistorialPagoMesNomi"));		
		
		
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialPagoMesNomi"));
		
		
		this.jButtonGuardarCambiosTablaToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarHistorialPagoMesNomi"));
			
		this.jMenuItemGuardarCambiosTablaHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaHistorialPagoMesNomi"));		
		
		
		
		this.jButtonRecargarInformacionHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionHistorialPagoMesNomi"));
					
		this.jButtonRecargarInformacionToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarHistorialPagoMesNomi"));
		
		this.jMenuItemRecargarInformacionHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionHistorialPagoMesNomi"));		
		
		
		
		this.jButtonAnterioresHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"AnterioresHistorialPagoMesNomi"));
		
		
		this.jButtonAnterioresToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"AnterioresToolBarHistorialPagoMesNomi"));
		
		this.jMenuItemAnterioresHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresHistorialPagoMesNomi"));		
		
		
		this.jButtonSiguientesHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"SiguientesHistorialPagoMesNomi"));
		
		
		this.jButtonSiguientesToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"SiguientesToolBarHistorialPagoMesNomi"));
			
		this.jMenuItemSiguientesHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesHistorialPagoMesNomi"));
			
		this.jMenuItemAbrirOrderByHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByHistorialPagoMesNomi"));
			
		this.jMenuItemMostrarOcultarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarHistorialPagoMesNomi"));
			
		this.jMenuItemDetalleAbrirOrderByHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByHistorialPagoMesNomi"));
			
		this.jMenuItemDetalleMostarOcultarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarHistorialPagoMesNomi"));		
		
		
		this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosHistorialPagoMesNomi"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarHistorialPagoMesNomi"));
			
		this.jMenuItemNuevoGuardarCambiosHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosHistorialPagoMesNomi"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosHistorialPagoMesNomi"));

		this.jCheckBoxSeleccionadosHistorialPagoMesNomi.addItemListener(new CheckBoxItemListener(this,"SeleccionadosHistorialPagoMesNomi"));
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioHistorialPagoMesNomi"));
		}
		
		
		this.jComboBoxTiposRelacionesHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"TiposRelacionesHistorialPagoMesNomi"));
			
		this.jComboBoxTiposAccionesHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"TiposAccionesHistorialPagoMesNomi"));
					
		this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"TiposSeleccionarHistorialPagoMesNomi"));
			
		this.jTextFieldValorCampoGeneralHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralHistorialPagoMesNomi"));		
		
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonidHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empresaHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empresaHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empleadoHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empleadoHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_anioHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_anioHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_anioHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_anioHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_mesHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_mesHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoMesNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonvalorHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorHistorialPagoMesNomiBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"FK_IdAnioHistorialPagoMesNomi"));

			this.jButtonFK_IdEmpleadoHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoHistorialPagoMesNomi"));

			this.jButtonFK_IdMesHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"FK_IdMesHistorialPagoMesNomi"));

			this.jButtonFK_IdRubroEmpleaHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaHistorialPagoMesNomi"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoHistorialPagoMesNomi!=null) {
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialPagoMesNomi"));
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialPagoMesNomi"));
				this.jInternalFrameReporteDinamicoHistorialPagoMesNomi.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialPagoMesNomi"));
			}
			
			//this.jButtonCerrarReporteDinamicoHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoHistorialPagoMesNomi"));				
			//this.jButtonGenerarReporteDinamicoHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoHistorialPagoMesNomi"));
			//this.jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoHistorialPagoMesNomi"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionHistorialPagoMesNomi!=null) {
				this.jInternalFrameImportacionHistorialPagoMesNomi.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionHistorialPagoMesNomi"));
				this.jInternalFrameImportacionHistorialPagoMesNomi.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionHistorialPagoMesNomi"));
				this.jInternalFrameImportacionHistorialPagoMesNomi.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionHistorialPagoMesNomi"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByHistorialPagoMesNomi"));
			
			this.jButtonAbrirOrderByToolBarHistorialPagoMesNomi.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarHistorialPagoMesNomi"));			
			
			if(this.jInternalFrameOrderByHistorialPagoMesNomi!=null) {
				this.jInternalFrameOrderByHistorialPagoMesNomi.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByHistorialPagoMesNomi"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTabbedPaneRelacionesHistorialPagoMesNomi.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesHistorialPagoMesNomi"));
		
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
            		closingInternalFrameHistorialPagoMesNomi();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormHistorialPagoMesNomi = (JInternalFrameBase)event.getSource();
	            	
	            HistorialPagoMesNomiBeanSwingJInternalFrame jInternalFrameParent=(HistorialPagoMesNomiBeanSwingJInternalFrame)jInternalFrameDetalleFormHistorialPagoMesNomi.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarHistorialPagoMesNomiActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosHistorialPagoMesNomi.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosHistorialPagoMesNomiListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosHistorialPagoMesNomi.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosHistorialPagoMesNomi.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoHistorialPagoMesNomi";
		inputMap = this.jButtonNuevoHistorialPagoMesNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoHistorialPagoMesNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesHistorialPagoMesNomi";
		inputMap = this.jButtonNuevoRelacionesHistorialPagoMesNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesHistorialPagoMesNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoHistorialPagoMesNomiActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarHistorialPagoMesNomi";
		inputMap = this.jButtonModificarHistorialPagoMesNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarHistorialPagoMesNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarHistorialPagoMesNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarHistorialPagoMesNomi";
		inputMap = this.jButtonActualizarHistorialPagoMesNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarHistorialPagoMesNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarHistorialPagoMesNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarHistorialPagoMesNomi";
		inputMap = this.jButtonEliminarHistorialPagoMesNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarHistorialPagoMesNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarHistorialPagoMesNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarHistorialPagoMesNomi";
		inputMap = this.jButtonCancelarHistorialPagoMesNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarHistorialPagoMesNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarHistorialPagoMesNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarHistorialPagoMesNomi";
		inputMap = this.jButtonCerrarHistorialPagoMesNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarHistorialPagoMesNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarHistorialPagoMesNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosHistorialPagoMesNomi";
		inputMap = this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosHistorialPagoMesNomi.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonGuardarCambiosHistorialPagoMesNomi.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosHistorialPagoMesNomi.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosHistorialPagoMesNomiItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesHistorialPagoMesNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesHistorialPagoMesNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarHistorialPagoMesNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralHistorialPagoMesNomi.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralHistorialPagoMesNomiActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonidHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"idHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empresaHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empresaHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empleadoHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_empleadoHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_rubro_empleaHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_rubro_empleaHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_anioHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_anioHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_anioHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_anioHistorialPagoMesNomiBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_mesHistorialPagoMesNomiUpdate.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoMesNomiUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonid_mesHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"id_mesHistorialPagoMesNomiBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jButtonvalorHistorialPagoMesNomiBusqueda.addActionListener(new ButtonActionListener(this,"valorHistorialPagoMesNomiBusqueda"));
		
		
		this.jButtonFK_IdAnioHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"FK_IdAnioHistorialPagoMesNomi"));

		this.jButtonFK_IdEmpleadoHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoHistorialPagoMesNomi"));

		this.jButtonFK_IdMesHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"FK_IdMesHistorialPagoMesNomi"));

		this.jButtonFK_IdRubroEmpleaHistorialPagoMesNomi.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaHistorialPagoMesNomi"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionHistorialPagoMesNomi.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionHistorialPagoMesNomiActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarHistorialPagoMesNomiActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarHistorialPagoMesNomi.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosHistorialPagoMesNomi(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
					historialpagomesnomiAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomis) {
					historialpagomesnomiAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosHistorialPagoMesNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
						historialpagomesnomiAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomis) {
						historialpagomesnomiAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomis) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialPagoMesNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialPagoMesNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosHistorialPagoMesNomiItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosHistorialPagoMesNomi.getSelectedRows();
			
			HistorialPagoMesNomi historialpagomesnomiLocal=new HistorialPagoMesNomi();
			
			//this.seleccionarTodosHistorialPagoMesNomi(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					historialpagomesnomiLocal =(HistorialPagoMesNomi) this.historialpagomesnomiLogic.getHistorialPagoMesNomis().toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					historialpagomesnomiLocal =(HistorialPagoMesNomi) this.historialpagomesnomis.toArray()[this.jTableDatosHistorialPagoMesNomi.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				historialpagomesnomiLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
						historialpagomesnomiAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomis) {
						historialpagomesnomiAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosHistorialPagoMesNomi.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosHistorialPagoMesNomi.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosHistorialPagoMesNomi,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualHistorialPagoMesNomiItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarHistorialPagoMesNomiParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralHistorialPagoMesNomiActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralHistorialPagoMesNomi.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
				
						if(sTipoSeleccionar.equals(HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							historialpagomesnomiAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomis) {
					
						if(sTipoSeleccionar.equals(HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							historialpagomesnomiAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesHistorialPagoMesNomiActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioHistorialPagoMesNomi=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesHistorialPagoMesNomi.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteHistorialPagoMesNomi) {				
					conSplash=true;//false;										
					
					//this.startProcessHistorialPagoMesNomi(conSplash);
				
					this.generarReporteHistorialPagoMesNomisSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoHistorialPagoMesNomisSeleccionados();
				//this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialPagoMesNomisSeleccionados(false);
				//this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoHistorialPagoMesNomisSeleccionados(true);
				//this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialPagoMesNomi();
				
				this.exportarHistorialPagoMesNomisSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionHistorialPagoMesNomis();
				//this.importarHistorialPagoMesNomis();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessHistorialPagoMesNomi();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelHistorialPagoMesNomisSeleccionados();
				//this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Historial Pago Mes Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessHistorialPagoMesNomi();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoHistorialPagoMesNomi)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyHistorialPagoMesNomi(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Historial Pago Mes Nomi",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setSelectedIndex(0);					
				}	
			} 			
			else if(HistorialPagoMesNomiBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteHistorialPagoMesNomi) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessHistorialPagoMesNomi(conSplash);
					
						//this.actualizarParametrosGeneralHistorialPagoMesNomi();
						
						this.generarReporteProcesoAccionHistorialPagoMesNomisSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Historial Pago Mes NomiS SELECCIONADOS?", "MANTENIMIENTO DE Historial Pago Mes Nomi", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessHistorialPagoMesNomi();
				
						this.actualizarParametrosGeneralHistorialPagoMesNomi();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.historialpagomesnomiReturnGeneral=historialpagomesnomiLogic.procesarAccionHistorialPagoMesNomisWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.historialpagomesnomiLogic.getHistorialPagoMesNomis(),this.historialpagomesnomiParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarHistorialPagoMesNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralHistorialPagoMesNomi();
					
					HistorialPagoMesNomiBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarHistorialPagoMesNomiReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesHistorialPagoMesNomi.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxTiposAccionesFormularioHistorialPagoMesNomi.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessHistorialPagoMesNomi(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesHistorialPagoMesNomiActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessHistorialPagoMesNomi();
			
			if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();		
			HistorialPagoMesNomi historialpagomesnomi=new HistorialPagoMesNomi();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingHistorialPagoMesNomi(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesHistorialPagoMesNomi.getSelectedItem();
			
			
			
			
			historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
			//this.sTipoAccion;
			
			if(historialpagomesnomisSeleccionados.size()==1) {
				for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomisSeleccionados) {
					historialpagomesnomi=historialpagomesnomiAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessHistorialPagoMesNomi();
			
      		//this.finishProcessHistorialPagoMesNomi(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarHistorialPagoMesNomiReturnGeneral() throws Exception {
		if(this.historialpagomesnomiReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.historialpagomesnomiReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.historialpagomesnomiReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.historialpagomesnomiReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.historialpagomesnomiReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.historialpagomesnomiReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingHistorialPagoMesNomi(false);
		}
		
		if(this.historialpagomesnomiReturnGeneral.getConRetornoLista() || this.historialpagomesnomiReturnGeneral.getConRetornoObjeto()) {
			if(this.historialpagomesnomiReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialpagomesnomiLogic.setHistorialPagoMesNomis(this.historialpagomesnomiReturnGeneral.getHistorialPagoMesNomis());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.historialpagomesnomiReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.historialpagomesnomiLogic.setHistorialPagoMesNomi(this.historialpagomesnomiReturnGeneral.getHistorialPagoMesNomi());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingHistorialPagoMesNomi(false);
		}
	}
	
	public void actualizarParametrosGeneralHistorialPagoMesNomi() throws Exception {
		
		
	}
	
	public ArrayList<HistorialPagoMesNomi> getHistorialPagoMesNomisSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioHistorialPagoMesNomi) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomiLogic.getHistorialPagoMesNomis()) {
					if(historialpagomesnomiAux.getIsSelected()) {
						historialpagomesnomisSeleccionados.add(historialpagomesnomiAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(HistorialPagoMesNomi historialpagomesnomiAux:this.historialpagomesnomis) {
					if(historialpagomesnomiAux.getIsSelected()) {
						historialpagomesnomisSeleccionados.add(historialpagomesnomiAux);				
					}
				}
			}
			
			if(historialpagomesnomisSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						historialpagomesnomisSeleccionados.addAll(this.historialpagomesnomiLogic.getHistorialPagoMesNomis());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						historialpagomesnomisSeleccionados.addAll(this.historialpagomesnomis);				
					}
				}
			}
		} else {
			historialpagomesnomisSeleccionados.add(this.historialpagomesnomi);
		}
		
		return historialpagomesnomisSeleccionados;
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
	
	public void generarReporteHistorialPagoMesNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalHistorialPagoMesNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoHistorialPagoMesNomisSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialPagoMesNomisSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoHistorialPagoMesNomisSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Historial Pago Mes Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesHistorialPagoMesNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();		
		
		historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteHistorialPagoMesNomis("Todos",historialpagomesnomisSeleccionados);
		
	}	
	
	public void generarReporteNormalHistorialPagoMesNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();		
		
		historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteHistorialPagoMesNomis("Todos",historialpagomesnomisSeleccionados);
	}		
	
	public void generarReporteProcesoAccionHistorialPagoMesNomisSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();
		
		historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteHistorialPagoMesNomis("Todos",historialpagomesnomisSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoHistorialPagoMesNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();		
		
		
		this.abrirInicializarFrameReporteDinamicoHistorialPagoMesNomi();
		
		
		historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoHistorialPagoMesNomi();
		
		
		//this.generarReporteHistorialPagoMesNomis("Todos",historialpagomesnomisSeleccionados ,historialpagomesnomiImplementable,historialpagomesnomiImplementableHome);
	}
	
	public void mostrarImportacionHistorialPagoMesNomis() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionHistorialPagoMesNomi();
		
		this.abrirFrameImportacionHistorialPagoMesNomi();		
		
			
		//this.generarReporteHistorialPagoMesNomis("Todos",historialpagomesnomisSeleccionados ,historialpagomesnomiImplementable,historialpagomesnomiImplementableHome);
	}
	
	public void importarHistorialPagoMesNomis() throws Exception {		
	
	}
	
	public void exportarHistorialPagoMesNomisSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelHistorialPagoMesNomisSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoHistorialPagoMesNomisSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlHistorialPagoMesNomisSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Historial Pago Mes Nomi",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoHistorialPagoMesNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();		
		
		historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagomesnomi."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarHistorialPagoMesNomi(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomisSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarHistorialPagoMesNomi(historialpagomesnomiAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//historialpagomesnomiAux.setsDetalleGeneralEntityReporte(historialpagomesnomiAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Mes Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarHistorialPagoMesNomi(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=HistorialPagoMesNomiConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoMesNomiConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=historialpagomesnomi.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagomesnomi.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagomesnomi.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagomesnomi.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagomesnomi.getrubroemplea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagomesnomi.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagomesnomi.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=historialpagomesnomi.getvalor().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelHistorialPagoMesNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();		
		
		historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagomesnomi.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("HistorialPagoMesNomis");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelHistorialPagoMesNomi(row);				
				iRow++;
			}				
			
			for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomisSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelHistorialPagoMesNomi(historialpagomesnomiAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Mes Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlHistorialPagoMesNomisSeleccionados() throws Exception {
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();		
		
		historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"historialpagomesnomi.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("historialpagomesnomis");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("historialpagomesnomi");
			//elementRoot.appendChild(element);
		
			for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomisSeleccionados) {
				element = document.createElement("historialpagomesnomi");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlHistorialPagoMesNomi(historialpagomesnomiAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Historial Pago Mes Nomi",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelHistorialPagoMesNomi(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(HistorialPagoMesNomiConstantesFunciones.LABEL_VALOR);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagomesnomi.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagomesnomi.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagomesnomi.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagomesnomi.getrubroemplea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagomesnomi.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagomesnomi.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(historialpagomesnomi.getvalor());				
	}
	
	public void setFilaDatosExportarXmlHistorialPagoMesNomi(HistorialPagoMesNomi historialpagomesnomi,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(HistorialPagoMesNomiConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(historialpagomesnomi.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(HistorialPagoMesNomiConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(historialpagomesnomi.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(HistorialPagoMesNomiConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(historialpagomesnomi.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(HistorialPagoMesNomiConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(historialpagomesnomi.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementrubroemplea_descripcion = document.createElement(HistorialPagoMesNomiConstantesFunciones.IDRUBROEMPLEA);
		elementrubroemplea_descripcion.appendChild(document.createTextNode(historialpagomesnomi.getrubroemplea_descripcion()));
		element.appendChild(elementrubroemplea_descripcion);

		Element elementanio_descripcion = document.createElement(HistorialPagoMesNomiConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(historialpagomesnomi.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(HistorialPagoMesNomiConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(historialpagomesnomi.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementvalor = document.createElement(HistorialPagoMesNomiConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(historialpagomesnomi.getvalor().toString().trim()));
		element.appendChild(elementvalor);
	}
	
	public void generarReporteGroupGenericoHistorialPagoMesNomisSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados=new ArrayList<HistorialPagoMesNomi>();
		
		historialpagomesnomisSeleccionados=this.getHistorialPagoMesNomisSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoHistorialPagoMesNomi(historialpagomesnomisSeleccionados);
		
		this.generarReporteHistorialPagoMesNomis("Todos",historialpagomesnomisSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoHistorialPagoMesNomi(ArrayList<HistorialPagoMesNomi> historialpagomesnomisSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(HistorialPagoMesNomi historialpagomesnomiAux:historialpagomesnomisSeleccionados) {
				historialpagomesnomiAux.setsDetalleGeneralEntityReporte(historialpagomesnomiAux.toString());
			
				if(sTipoSeleccionar.equals(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					historialpagomesnomiAux.setsDescripcionGeneralEntityReporte1(historialpagomesnomiAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialPagoMesNomiConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					historialpagomesnomiAux.setsDescripcionGeneralEntityReporte1(historialpagomesnomiAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialPagoMesNomiConstantesFunciones.LABEL_IDRUBROEMPLEA)) {
					existe=true;
					historialpagomesnomiAux.setsDescripcionGeneralEntityReporte1(historialpagomesnomiAux.getrubroemplea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialPagoMesNomiConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					historialpagomesnomiAux.setsDescripcionGeneralEntityReporte1(historialpagomesnomiAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(HistorialPagoMesNomiConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					historialpagomesnomiAux.setsDescripcionGeneralEntityReporte1(historialpagomesnomiAux.getmes_descripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,HistorialPagoMesNomiConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesHistorialPagoMesNomi(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=true;
				this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=true;
				this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=true;
			}
			
			this.isVisibilidadCeldaModificarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaModificarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaModificarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaModificarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaModificarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=true;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaModificarHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaCancelarHistorialPagoMesNomi=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
				} else {
					this.isVisibilidadCeldaGuardarHistorialPagoMesNomi=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(HistorialPagoMesNomiJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=true;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=true;
		} else {
			this.actualizarEstadoPanelsHistorialPagoMesNomi(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarHistorialPagoMesNomi=false;
			//this.isVisibilidadCeldaVerFormHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaDuplicarHistorialPagoMesNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!historialpagomesnomiSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=false;
		} else {
			this.isVisibilidadCeldaNuevoHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaGuardarCambiosHistorialPagoMesNomi=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
			if(!historialpagomesnomiSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=false;												
			}
			
			this.jButtonCerrarHistorialPagoMesNomi.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesHistorialPagoMesNomi=false;
		}
		
		if(!this.permiteMantenimiento(this.historialpagomesnomi)) {
			this.isVisibilidadCeldaActualizarHistorialPagoMesNomi=false;
			this.isVisibilidadCeldaEliminarHistorialPagoMesNomi=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesHistorialPagoMesNomi() {
	}
	
	public void actualizarEstadoPanelsHistorialPagoMesNomi(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoMesNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosHistorialPagoMesNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialPagoMesNomi!=null) {
				this.jPanelPaginacionHistorialPagoMesNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoMesNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoMesNomi.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoMesNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosHistorialPagoMesNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialPagoMesNomi!=null) {
				this.jPanelPaginacionHistorialPagoMesNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoMesNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoMesNomi.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoMesNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosHistorialPagoMesNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialPagoMesNomi!=null) {
				this.jPanelPaginacionHistorialPagoMesNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoMesNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoMesNomi.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoMesNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosHistorialPagoMesNomi.setVisible(false);
			}
			
			if(this.jPanelPaginacionHistorialPagoMesNomi!=null) {
				this.jPanelPaginacionHistorialPagoMesNomi.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoMesNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoMesNomi.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoMesNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosHistorialPagoMesNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialPagoMesNomi!=null) {
				this.jPanelPaginacionHistorialPagoMesNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoMesNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoMesNomi.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoMesNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosHistorialPagoMesNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialPagoMesNomi!=null) {
				this.jPanelPaginacionHistorialPagoMesNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoMesNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoMesNomi.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosEdicionHistorialPagoMesNomi.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoMesNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosHistorialPagoMesNomi!=null) {
				this.jScrollPanelDatosHistorialPagoMesNomi.setVisible(true);
			}
			
			if(this.jPanelPaginacionHistorialPagoMesNomi!=null) {
				this.jPanelPaginacionHistorialPagoMesNomi.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesHistorialPagoMesNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoMesNomi.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasHistorialPagoMesNomi!=null) {
					this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesHistorialPagoMesNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoMesNomi.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.historialpagomesnomiSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasHistorialPagoMesNomi!=null) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesHistorialPagoMesNomi!=null) {
				this.jPanelParametrosReportesHistorialPagoMesNomi.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdAnioHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdEmpleadoHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdMes=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdMesHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdRubroEmpleaHistorialPagoMesNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdAnio=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdAnioHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdEmpleadoHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdMes=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdMesHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdRubroEmpleaHistorialPagoMesNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaRubroEmplea(Boolean isParaRubroEmplea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRubroEmpleaNegation=!isParaRubroEmplea;

			this.isVisibilidadFK_IdAnio=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdAnioHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdEmpleado=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdEmpleadoHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdMes=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdMesHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdRubroEmplea=isParaRubroEmplea;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdRubroEmpleaHistorialPagoMesNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdAnioHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdEmpleado=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdEmpleadoHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdMesHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdRubroEmplea=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdRubroEmpleaHistorialPagoMesNomi);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdAnioHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdEmpleado=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdEmpleadoHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdMesHistorialPagoMesNomi);}

			this.isVisibilidadFK_IdRubroEmplea=isParaMesNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(jPanelFK_IdRubroEmpleaHistorialPagoMesNomi);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//HistorialPagoMesNomiSessionBean historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
		
		if(this.historialpagomesnomiSessionBean==null) {
			this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
		}
		
		this.historialpagomesnomiSessionBean.setsUltimaBusquedaHistorialPagoMesNomi(this.getsAccionBusqueda());
		this.historialpagomesnomiSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.historialpagomesnomiSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			historialpagomesnomiSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			historialpagomesnomiSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			historialpagomesnomiSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			historialpagomesnomiSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
			historialpagomesnomiSessionBean.setid_rubro_emplea(this.getid_rubro_empleaFK_IdRubroEmplea());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//HistorialPagoMesNomiSessionBean historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
		
		if(this.historialpagomesnomiSessionBean==null) {
			this.historialpagomesnomiSessionBean=new HistorialPagoMesNomiSessionBean();
		}
		
		if(this.historialpagomesnomiSessionBean.getsUltimaBusquedaHistorialPagoMesNomi()!=null&&!this.historialpagomesnomiSessionBean.getsUltimaBusquedaHistorialPagoMesNomi().equals("")) {
			this.setsAccionBusqueda(historialpagomesnomiSessionBean.getsUltimaBusquedaHistorialPagoMesNomi());
			this.setiNumeroPaginacion(historialpagomesnomiSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(historialpagomesnomiSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(historialpagomesnomiSessionBean.getid_anio());
				historialpagomesnomiSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(historialpagomesnomiSessionBean.getid_empleado());
				historialpagomesnomiSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(historialpagomesnomiSessionBean.getid_empresa());
				historialpagomesnomiSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(historialpagomesnomiSessionBean.getid_mes());
				historialpagomesnomiSessionBean.setid_mes(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
				this.setid_rubro_empleaFK_IdRubroEmplea(historialpagomesnomiSessionBean.getid_rubro_emplea());
				historialpagomesnomiSessionBean.setid_rubro_emplea(-1L);
			}
		}
		
		this.historialpagomesnomiSessionBean.setsUltimaBusquedaHistorialPagoMesNomi("");
		this.historialpagomesnomiSessionBean.setiNumeroPaginacion(HistorialPagoMesNomiConstantesFunciones.INUMEROPAGINACION);
		this.historialpagomesnomiSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaHistorialPagoMesNomi(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioHistorialPagoMesNomi() {
		this.updateBorderResaltarBusquedasFormularioHistorialPagoMesNomi();
		this.updateVisibilidadBusquedasFormularioHistorialPagoMesNomi();
		this.updateHabilitarBusquedasFormularioHistorialPagoMesNomi();
	}
	
	public void updateBorderResaltarBusquedasFormularioHistorialPagoMesNomi() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponents().length>0) {
	

		if(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdAnioHistorialPagoMesNomi!=null) {
			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdAnioHistorialPagoMesNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
				jPanel.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdAnioHistorialPagoMesNomi);
			}
		}

		if(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdEmpleadoHistorialPagoMesNomi!=null) {
			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdEmpleadoHistorialPagoMesNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
				jPanel.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdEmpleadoHistorialPagoMesNomi);
			}
		}

		if(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdMesHistorialPagoMesNomi!=null) {
			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdMesHistorialPagoMesNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
				jPanel.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdMesHistorialPagoMesNomi);
			}
		}

		if(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdRubroEmpleaHistorialPagoMesNomi!=null) {
			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdRubroEmpleaHistorialPagoMesNomi);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
				jPanel.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdRubroEmpleaHistorialPagoMesNomi);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioHistorialPagoMesNomi() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdAnioHistorialPagoMesNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarFK_IdAnioHistorialPagoMesNomi);
			if(!this.historialpagomesnomiConstantesFunciones.mostrarFK_IdAnioHistorialPagoMesNomi && index>-1) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdEmpleadoHistorialPagoMesNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarFK_IdEmpleadoHistorialPagoMesNomi);
			if(!this.historialpagomesnomiConstantesFunciones.mostrarFK_IdEmpleadoHistorialPagoMesNomi && index>-1) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdMesHistorialPagoMesNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarFK_IdMesHistorialPagoMesNomi);
			if(!this.historialpagomesnomiConstantesFunciones.mostrarFK_IdMesHistorialPagoMesNomi && index>-1) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(index);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdRubroEmpleaHistorialPagoMesNomi);
			jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarFK_IdRubroEmpleaHistorialPagoMesNomi);
			if(!this.historialpagomesnomiConstantesFunciones.mostrarFK_IdRubroEmpleaHistorialPagoMesNomi && index>-1) {
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioHistorialPagoMesNomi() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdAnioHistorialPagoMesNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialpagomesnomiConstantesFunciones.activarFK_IdAnioHistorialPagoMesNomi);
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setEnabledAt(index,this.historialpagomesnomiConstantesFunciones.activarFK_IdAnioHistorialPagoMesNomi);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdEmpleadoHistorialPagoMesNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialpagomesnomiConstantesFunciones.activarFK_IdEmpleadoHistorialPagoMesNomi);
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setEnabledAt(index,this.historialpagomesnomiConstantesFunciones.activarFK_IdEmpleadoHistorialPagoMesNomi);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdMesHistorialPagoMesNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialpagomesnomiConstantesFunciones.activarFK_IdMesHistorialPagoMesNomi);
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setEnabledAt(index,this.historialpagomesnomiConstantesFunciones.activarFK_IdMesHistorialPagoMesNomi);
			}

			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdRubroEmpleaHistorialPagoMesNomi);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.historialpagomesnomiConstantesFunciones.activarFK_IdRubroEmpleaHistorialPagoMesNomi);
				this.jTabbedPaneBusquedasHistorialPagoMesNomi.setEnabledAt(index,this.historialpagomesnomiConstantesFunciones.activarFK_IdRubroEmpleaHistorialPagoMesNomi);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaHistorialPagoMesNomi(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdAnioHistorialPagoMesNomi);

			this.jTabbedPaneBusquedasHistorialPagoMesNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);

			this.historialpagomesnomiConstantesFunciones.setResaltarFK_IdAnioHistorialPagoMesNomi(resaltar);

			jPanel.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdAnioHistorialPagoMesNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdEmpleadoHistorialPagoMesNomi);

			this.jTabbedPaneBusquedasHistorialPagoMesNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);

			this.historialpagomesnomiConstantesFunciones.setResaltarFK_IdEmpleadoHistorialPagoMesNomi(resaltar);

			jPanel.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdEmpleadoHistorialPagoMesNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdMesHistorialPagoMesNomi);

			this.jTabbedPaneBusquedasHistorialPagoMesNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);

			this.historialpagomesnomiConstantesFunciones.setResaltarFK_IdMesHistorialPagoMesNomi(resaltar);

			jPanel.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdMesHistorialPagoMesNomi);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRubroEmplea")) {
			index= this.jTabbedPaneBusquedasHistorialPagoMesNomi.indexOfComponent(this.jPanelFK_IdRubroEmpleaHistorialPagoMesNomi);

			this.jTabbedPaneBusquedasHistorialPagoMesNomi.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasHistorialPagoMesNomi.getComponent(index);

			this.historialpagomesnomiConstantesFunciones.setResaltarFK_IdRubroEmpleaHistorialPagoMesNomi(resaltar);

			jPanel.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarFK_IdRubroEmpleaHistorialPagoMesNomi);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarHistorialPagoMesNomi.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioHistorialPagoMesNomi() throws Exception {

		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioHistorialPagoMesNomi();
		this.updateVisibilidadResaltarControlesFormularioHistorialPagoMesNomi();
		this.updateHabilitarResaltarControlesFormularioHistorialPagoMesNomi();
		
	}
	
	public void updateBorderResaltarControlesFormularioHistorialPagoMesNomi() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.historialpagomesnomiConstantesFunciones.resaltaridHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.setBorder(this.historialpagomesnomiConstantesFunciones.resaltaridHistorialPagoMesNomi);}
		if(this.historialpagomesnomiConstantesFunciones.resaltarid_empresaHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarid_empresaHistorialPagoMesNomi);}
		if(this.historialpagomesnomiConstantesFunciones.resaltarid_empleadoHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarid_empleadoHistorialPagoMesNomi);}
		if(this.historialpagomesnomiConstantesFunciones.resaltarid_rubro_empleaHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarid_rubro_empleaHistorialPagoMesNomi);}
		if(this.historialpagomesnomiConstantesFunciones.resaltarid_anioHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarid_anioHistorialPagoMesNomi);}
		if(this.historialpagomesnomiConstantesFunciones.resaltarid_mesHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarid_mesHistorialPagoMesNomi);}
		if(this.historialpagomesnomiConstantesFunciones.resaltarvalorHistorialPagoMesNomi!=null && this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTextFieldvalorHistorialPagoMesNomi.setBorder(this.historialpagomesnomiConstantesFunciones.resaltarvalorHistorialPagoMesNomi);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioHistorialPagoMesNomi() throws Exception {		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
	
		//this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostraridHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelidHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostraridHistorialPagoMesNomi);
		//this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarid_empresaHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelid_empresaHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarid_empresaHistorialPagoMesNomi);
		//this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarid_empleadoHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelid_empleadoHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarid_empleadoHistorialPagoMesNomi);
		//this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarid_rubro_empleaHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelid_rubro_empleaHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarid_rubro_empleaHistorialPagoMesNomi);
		//this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarid_anioHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelid_anioHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarid_anioHistorialPagoMesNomi);
		//this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarid_mesHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelid_mesHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarid_mesHistorialPagoMesNomi);
		//this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTextFieldvalorHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarvalorHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jPanelvalorHistorialPagoMesNomi.setVisible(this.historialpagomesnomiConstantesFunciones.mostrarvalorHistorialPagoMesNomi);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioHistorialPagoMesNomi() throws Exception {
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormHistorialPagoMesNomi!=null) {
	
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jLabelidHistorialPagoMesNomi.setEnabled(this.historialpagomesnomiConstantesFunciones.activaridHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empresaHistorialPagoMesNomi.setEnabled(this.historialpagomesnomiConstantesFunciones.activarid_empresaHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_empleadoHistorialPagoMesNomi.setEnabled(this.historialpagomesnomiConstantesFunciones.activarid_empleadoHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_rubro_empleaHistorialPagoMesNomi.setEnabled(this.historialpagomesnomiConstantesFunciones.activarid_rubro_empleaHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_anioHistorialPagoMesNomi.setEnabled(this.historialpagomesnomiConstantesFunciones.activarid_anioHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jComboBoxid_mesHistorialPagoMesNomi.setEnabled(this.historialpagomesnomiConstantesFunciones.activarid_mesHistorialPagoMesNomi);
		this.jInternalFrameDetalleFormHistorialPagoMesNomi.jTextFieldvalorHistorialPagoMesNomi.setEnabled(this.historialpagomesnomiConstantesFunciones.activarvalorHistorialPagoMesNomi);
		}
	}
	
		
}