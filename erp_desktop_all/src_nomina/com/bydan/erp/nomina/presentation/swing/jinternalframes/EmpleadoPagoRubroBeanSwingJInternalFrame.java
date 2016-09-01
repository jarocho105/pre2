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

import com.bydan.erp.nomina.util.EmpleadoPagoRubroConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoPagoRubroParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoPagoRubroParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EmpleadoPagoRubroBean;
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
public class EmpleadoPagoRubroBeanSwingJInternalFrame extends EmpleadoPagoRubroJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoPagoRubroBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoPagoRubro> empleadopagorubroValidator = new ClassValidator<EmpleadoPagoRubro>(EmpleadoPagoRubro.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoPagoRubro empleadopagorubro;	
	public EmpleadoPagoRubro empleadopagorubroAux;
	public EmpleadoPagoRubro empleadopagorubroAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoPagoRubro empleadopagorubroTotales;
	public Long idEmpleadoPagoRubroActual;
	public Long iIdNuevoEmpleadoPagoRubro=0L;
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
	
	public Boolean isPermisoTodoEmpleadoPagoRubro;
	public Boolean isPermisoNuevoEmpleadoPagoRubro;
	public Boolean isPermisoActualizarEmpleadoPagoRubro;
	public Boolean isPermisoActualizarOriginalEmpleadoPagoRubro;
	public Boolean isPermisoEliminarEmpleadoPagoRubro;
	public Boolean isPermisoGuardarCambiosEmpleadoPagoRubro;
	public Boolean isPermisoConsultaEmpleadoPagoRubro;
	public Boolean isPermisoBusquedaEmpleadoPagoRubro;
	public Boolean isPermisoReporteEmpleadoPagoRubro;
	public Boolean isPermisoPaginacionMedioEmpleadoPagoRubro;
	public Boolean isPermisoPaginacionAltoEmpleadoPagoRubro;
	public Boolean isPermisoPaginacionTodoEmpleadoPagoRubro;
	public Boolean isPermisoCopiarEmpleadoPagoRubro;
	public Boolean isPermisoVerFormEmpleadoPagoRubro;
	public Boolean isPermisoDuplicarEmpleadoPagoRubro;
	public Boolean isPermisoOrdenEmpleadoPagoRubro;
	
	
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
	
	public EmpleadoPagoRubroParameterReturnGeneral empleadopagorubroReturnGeneral;
	public EmpleadoPagoRubroParameterReturnGeneral empleadopagorubroParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoPagoRubro=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoPagoRubro=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoPagoRubroSessionBeanAdditional empleadopagorubroSessionBeanAdditional=null;
	
	public EmpleadoPagoRubroSessionBeanAdditional getEmpleadoPagoRubroSessionBeanAdditional() {
		return this.empleadopagorubroSessionBeanAdditional;
	}
	
	public void setEmpleadoPagoRubroSessionBeanAdditional(EmpleadoPagoRubroSessionBeanAdditional empleadopagorubroSessionBeanAdditional) {
		try {
			this.empleadopagorubroSessionBeanAdditional=empleadopagorubroSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoPagoRubroBeanSwingJInternalFrameAdditional empleadopagorubroBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoPagoRubroBeanSwingJInternalFrame
	
	public EmpleadoPagoRubroBeanSwingJInternalFrameAdditional getEmpleadoPagoRubroBeanSwingJInternalFrameAdditional() {
		return this.empleadopagorubroBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoPagoRubroBeanSwingJInternalFrameAdditional(EmpleadoPagoRubroBeanSwingJInternalFrameAdditional empleadopagorubroBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadopagorubroBeanSwingJInternalFrameAdditional=empleadopagorubroBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoPagoRubroLogic empleadopagorubroLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoPagoRubro empleadopagorubroBean;
	public EmpleadoPagoRubroConstantesFunciones empleadopagorubroConstantesFunciones;
	//public EmpleadoPagoRubroParameterReturnGeneral empleadopagorubroReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public EstructuraLogic estructuraLogic;
	public RubroEmpleaLogic rubroempleaLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoPagoRubro> empleadopagorubros;	
	//public List<EmpleadoPagoRubro> empleadopagorubrosEliminados;
	//public List<EmpleadoPagoRubro> empleadopagorubrosAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoPagoRubro=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoPagoRubro=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoPagoRubro=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoPagoRubro=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoPagoRubro=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoPagoRubro=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoPagoRubro=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoPagoRubro=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoPagoRubro=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	public Boolean isVisibilidadFK_IdRubroEmplea=false;
	
	public Long getiIdNuevoEmpleadoPagoRubro() {
		return this.iIdNuevoEmpleadoPagoRubro;
	}

	public void setiIdNuevoEmpleadoPagoRubro(Long iIdNuevoEmpleadoPagoRubro) {
		this.iIdNuevoEmpleadoPagoRubro = iIdNuevoEmpleadoPagoRubro;
	}
	
	public Long getidEmpleadoPagoRubroActual() {
		return this.idEmpleadoPagoRubroActual;
	}

	public void setidEmpleadoPagoRubroActual(Long idEmpleadoPagoRubroActual) {
		this.idEmpleadoPagoRubroActual = idEmpleadoPagoRubroActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoPagoRubro getempleadopagorubro() {
		return this.empleadopagorubro;
	}

	public void setempleadopagorubro(EmpleadoPagoRubro empleadopagorubro) {
		this.empleadopagorubro = empleadopagorubro;
	}
	
	public EmpleadoPagoRubro getempleadopagorubroAux() {
		return this.empleadopagorubroAux;
	}

	public void setempleadopagorubroAux(EmpleadoPagoRubro empleadopagorubroAux) {
		this.empleadopagorubroAux = empleadopagorubroAux;
	}				
	
	public EmpleadoPagoRubro getempleadopagorubroAnterior() {
		return this.empleadopagorubroAnterior;
	}

	public void setempleadopagorubroAnterior(EmpleadoPagoRubro empleadopagorubroAnterior) {
		this.empleadopagorubroAnterior = empleadopagorubroAnterior;
	}	
	
	public EmpleadoPagoRubro getempleadopagorubroTotales() {
		return this.empleadopagorubroTotales;
	}

	public void setempleadopagorubroTotales(EmpleadoPagoRubro empleadopagorubroTotales) {
		this.empleadopagorubroTotales = empleadopagorubroTotales;
	}	
	
	public EmpleadoPagoRubro getempleadopagorubroBean() {
		return this.empleadopagorubroBean;
	}

	public void setempleadopagorubroBean(EmpleadoPagoRubro empleadopagorubroBean) {
		this.empleadopagorubroBean = empleadopagorubroBean;
	}	
	
	public EmpleadoPagoRubroParameterReturnGeneral getempleadopagorubroReturnGeneral() {
		return this.empleadopagorubroReturnGeneral;
	}

	public void setempleadopagorubroReturnGeneral(EmpleadoPagoRubroParameterReturnGeneral empleadopagorubroReturnGeneral) {
		this.empleadopagorubroReturnGeneral = empleadopagorubroReturnGeneral;
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
	
	
	public EmpleadoPagoRubroLogic getEmpleadoPagoRubroLogic()	{		
		return empleadopagorubroLogic;
	}

	public void setEmpleadoPagoRubroLogic(EmpleadoPagoRubroLogic empleadopagorubroLogic) {
		this.empleadopagorubroLogic = empleadopagorubroLogic;
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
	
	public Boolean getIsEsNuevoEmpleadoPagoRubro() {
		return isEsNuevoEmpleadoPagoRubro;
	}

	public void setIsEsNuevoEmpleadoPagoRubro(Boolean isEsNuevoEmpleadoPagoRubro) {
		this.isEsNuevoEmpleadoPagoRubro = isEsNuevoEmpleadoPagoRubro;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoPagoRubro() {
		return esParaAccionDesdeFormularioEmpleadoPagoRubro;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoPagoRubro(Boolean esParaAccionDesdeFormularioEmpleadoPagoRubro) {
		this.esParaAccionDesdeFormularioEmpleadoPagoRubro = esParaAccionDesdeFormularioEmpleadoPagoRubro;
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

			if(this.empleadopagorubroSessionBean==null) {
				this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
			}

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empleadopagorubroSessionBean.getlidEmpresaActual());
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

			if(this.empleadopagorubroSessionBean==null) {
				this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
			}

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(empleadopagorubroSessionBean.getlidEmpleadoActual());
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

			if(this.empleadopagorubroSessionBean==null) {
				this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
			}

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(empleadopagorubroSessionBean.getlidEstructuraActual());
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

			if(this.empleadopagorubroSessionBean==null) {
				this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
			}

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
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
					rubroempleaLogic.getEntityWithConnection(empleadopagorubroSessionBean.getlidRubroEmpleaActual());
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

			if(this.empleadopagorubroSessionBean==null) {
				this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
			}

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(empleadopagorubroSessionBean.getlidAnioActual());
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

			if(this.empleadopagorubroSessionBean==null) {
				this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
			}

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(empleadopagorubroSessionBean.getlidMesActual());
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

					if(this.empleadopagorubro!=null) {
						this.empleadopagorubro.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoPagoRubro.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoPagoRubroGenerico)throws Exception
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
				jComboBoxid_empresaEmpleadoPagoRubroGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoPagoRubroGenerico!=null && jComboBoxid_empresaEmpleadoPagoRubroGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoPagoRubroGenerico.setSelectedIndex(0);
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

					if(this.empleadopagorubro!=null) {
						this.empleadopagorubro.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoPagoRubro.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoPagoRubroGenerico)throws Exception
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
				jComboBoxid_empleadoEmpleadoPagoRubroGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoPagoRubroGenerico!=null && jComboBoxid_empleadoEmpleadoPagoRubroGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoPagoRubroGenerico.setSelectedIndex(0);
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

					if(this.empleadopagorubro!=null) {
						this.empleadopagorubro.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraEmpleadoPagoRubro.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro!=null) {
						jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraEmpleadoPagoRubroGenerico)throws Exception
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
				jComboBoxid_estructuraEmpleadoPagoRubroGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraEmpleadoPagoRubroGenerico!=null && jComboBoxid_estructuraEmpleadoPagoRubroGenerico.getItemCount()>0) {
					jComboBoxid_estructuraEmpleadoPagoRubroGenerico.setSelectedIndex(0);
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

					if(this.empleadopagorubro!=null) {
						this.empleadopagorubro.setRubroEmplea(rubroempleaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.setSelectedItem(rubroempleaTemp);
					}
				} else {
					//jComboBoxid_rubro_empleaEmpleadoPagoRubro.setSelectedItem(rubroempleaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){
					if(rubroempleaTemp!=null && jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro!=null) {
						jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setSelectedItem(rubroempleaTemp);
					} else {
						if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro!=null) {
							//jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setSelectedItem(rubroempleaTemp);
							if(jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.getItemCount()>0) {
								jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setSelectedIndex(0);
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
	public void setActualRubroEmpleaForeignKeyGenerico(Long idRubroEmpleaSeleccionado,JComboBox jComboBoxid_rubro_empleaEmpleadoPagoRubroGenerico)throws Exception
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
				jComboBoxid_rubro_empleaEmpleadoPagoRubroGenerico.setSelectedItem(rubroempleaTemp);
			} else {
				if(jComboBoxid_rubro_empleaEmpleadoPagoRubroGenerico!=null && jComboBoxid_rubro_empleaEmpleadoPagoRubroGenerico.getItemCount()>0) {
					jComboBoxid_rubro_empleaEmpleadoPagoRubroGenerico.setSelectedIndex(0);
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

					if(this.empleadopagorubro!=null) {
						this.empleadopagorubro.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioEmpleadoPagoRubro.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro!=null) {
						jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro!=null) {
							//jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioEmpleadoPagoRubroGenerico)throws Exception
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
				jComboBoxid_anioEmpleadoPagoRubroGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioEmpleadoPagoRubroGenerico!=null && jComboBoxid_anioEmpleadoPagoRubroGenerico.getItemCount()>0) {
					jComboBoxid_anioEmpleadoPagoRubroGenerico.setSelectedIndex(0);
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

					if(this.empleadopagorubro!=null) {
						this.empleadopagorubro.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesEmpleadoPagoRubro.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesEmpleadoPagoRubro!=null) {
						jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesEmpleadoPagoRubro!=null) {
							//jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesEmpleadoPagoRubroGenerico)throws Exception
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
				jComboBoxid_mesEmpleadoPagoRubroGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesEmpleadoPagoRubroGenerico!=null && jComboBoxid_mesEmpleadoPagoRubroGenerico.getItemCount()>0) {
					jComboBoxid_mesEmpleadoPagoRubroGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoPagoRubro empleadopagorubro,JComboBox jComboBoxid_empresaEmpleadoPagoRubroGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoPagoRubroGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoPagoRubroGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadopagorubro.setid_empresa(empresaAux.getId());
				empleadopagorubro.setempresa_descripcion(EmpleadoPagoRubroConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadopagorubro.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoPagoRubro empleadopagorubro,JComboBox jComboBoxid_empleadoEmpleadoPagoRubroGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoPagoRubroGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoPagoRubroGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadopagorubro.setid_empleado(empleadoAux.getId());
				empleadopagorubro.setempleado_descripcion(EmpleadoPagoRubroConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadopagorubro.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(EmpleadoPagoRubro empleadopagorubro,JComboBox jComboBoxid_estructuraEmpleadoPagoRubroGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraEmpleadoPagoRubroGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraEmpleadoPagoRubroGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				empleadopagorubro.setid_estructura(estructuraAux.getId());
				empleadopagorubro.setestructura_descripcion(EmpleadoPagoRubroConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				empleadopagorubro.setEstructura(estructuraAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarRubroEmpleaForeignKey(EmpleadoPagoRubro empleadopagorubro,JComboBox jComboBoxid_rubro_empleaEmpleadoPagoRubroGenerico)throws Exception
	{
		try
		{
			RubroEmplea  rubroempleaAux=new RubroEmplea();

			if(jComboBoxid_rubro_empleaEmpleadoPagoRubroGenerico==null) {
				rubroempleaAux=(RubroEmplea)this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.getSelectedItem();
			} else {
				rubroempleaAux=(RubroEmplea)jComboBoxid_rubro_empleaEmpleadoPagoRubroGenerico.getSelectedItem();
			}

			if(rubroempleaAux!=null && rubroempleaAux.getId()!=null) {
				empleadopagorubro.setid_rubro_emplea(rubroempleaAux.getId());
				empleadopagorubro.setrubroemplea_descripcion(EmpleadoPagoRubroConstantesFunciones.getRubroEmpleaDescripcion(rubroempleaAux));
				empleadopagorubro.setRubroEmplea(rubroempleaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(EmpleadoPagoRubro empleadopagorubro,JComboBox jComboBoxid_anioEmpleadoPagoRubroGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioEmpleadoPagoRubroGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioEmpleadoPagoRubroGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				empleadopagorubro.setid_anio(anioAux.getId());
				empleadopagorubro.setanio_descripcion(EmpleadoPagoRubroConstantesFunciones.getAnioDescripcion(anioAux));
				empleadopagorubro.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(EmpleadoPagoRubro empleadopagorubro,JComboBox jComboBoxid_mesEmpleadoPagoRubroGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesEmpleadoPagoRubroGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesEmpleadoPagoRubroGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				empleadopagorubro.setid_mes(mesAux.getId());
				empleadopagorubro.setmes_descripcion(EmpleadoPagoRubroConstantesFunciones.getMesDescripcion(mesAux));
				empleadopagorubro.setMes(mesAux);			}
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

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
					}

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
					}

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.addItem(empleado);
							}
						}

						if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

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

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
					}

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.addItem(estructura);
							}
						}

						if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.addItem(rubroemplea);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
					}

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdRubroEmplea") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.removeAllItems();

							for(RubroEmplea rubroemplea:this.rubroempleasForeignKey) {
								this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.addItem(rubroemplea);
							}
						}

						if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
					}

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.addItem(anio);
							}
						}

						if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { 
					}

					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.addItem(mes);
							}
						}

						if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
						}

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
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.setSelectedItem(rubroemplea);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setSelectedItem(rubroemplea);
						} else {
							this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoPagoRubro() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoPagoRubroConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoPagoRubro(this.empleadopagorubroLogic.getEmpleadoPagoRubros());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoPagoRubroConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoPagoRubro(this.empleadopagorubros);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Estructura.class));
		classes.add(new Classe(RubroEmplea.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadopagorubroLogic.setEmpleadoPagoRubros(this.empleadopagorubros);
			empleadopagorubroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpleadoPagoRubroParameterReturnGeneral getEmpleadoPagoRubroParameterGeneral() {
		return this.empleadopagorubroParameterGeneral;
	}
	
	public void setEmpleadoPagoRubroParameterGeneral(EmpleadoPagoRubroParameterReturnGeneral empleadopagorubroParameterGeneral) {
		this.empleadopagorubroParameterGeneral = empleadopagorubroParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpleadoPagoRubro() {
		return isPermisoTodoEmpleadoPagoRubro;
	}

	public void setIsPermisoTodoEmpleadoPagoRubro(Boolean isPermisoTodoEmpleadoPagoRubro) {
		this.isPermisoTodoEmpleadoPagoRubro = isPermisoTodoEmpleadoPagoRubro;
	}

	public Boolean getIsPermisoNuevoEmpleadoPagoRubro() {
		return isPermisoNuevoEmpleadoPagoRubro;
	}

	public void setIsPermisoNuevoEmpleadoPagoRubro(Boolean isPermisoNuevoEmpleadoPagoRubro) {
		this.isPermisoNuevoEmpleadoPagoRubro = isPermisoNuevoEmpleadoPagoRubro;
	}

	public Boolean getIsPermisoActualizarEmpleadoPagoRubro() {
		return isPermisoActualizarEmpleadoPagoRubro;
	}

	public void setIsPermisoActualizarEmpleadoPagoRubro(Boolean isPermisoActualizarEmpleadoPagoRubro) {
		this.isPermisoActualizarEmpleadoPagoRubro = isPermisoActualizarEmpleadoPagoRubro;
	}

	public Boolean getIsPermisoEliminarEmpleadoPagoRubro() {
		return isPermisoEliminarEmpleadoPagoRubro;
	}

	public void setIsPermisoEliminarEmpleadoPagoRubro(Boolean isPermisoEliminarEmpleadoPagoRubro) {
		this.isPermisoEliminarEmpleadoPagoRubro = isPermisoEliminarEmpleadoPagoRubro;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoPagoRubro() {
		return isPermisoGuardarCambiosEmpleadoPagoRubro;
	}

	public void setIsPermisoGuardarCambiosEmpleadoPagoRubro(Boolean isPermisoGuardarCambiosEmpleadoPagoRubro) {
		this.isPermisoGuardarCambiosEmpleadoPagoRubro = isPermisoGuardarCambiosEmpleadoPagoRubro;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoPagoRubro() {
		return isPermisoConsultaEmpleadoPagoRubro;
	}

	public void setIsPermisoConsultaEmpleadoPagoRubro(Boolean isPermisoConsultaEmpleadoPagoRubro) {
		this.isPermisoConsultaEmpleadoPagoRubro = isPermisoConsultaEmpleadoPagoRubro;
	}

	public Boolean getIsPermisoBusquedaEmpleadoPagoRubro() {
		return isPermisoBusquedaEmpleadoPagoRubro;
	}

	public void setIsPermisoBusquedaEmpleadoPagoRubro(Boolean isPermisoBusquedaEmpleadoPagoRubro) {
		this.isPermisoBusquedaEmpleadoPagoRubro = isPermisoBusquedaEmpleadoPagoRubro;
	}

	public Boolean getIsPermisoReporteEmpleadoPagoRubro() {
		return isPermisoReporteEmpleadoPagoRubro;
	}

	public void setIsPermisoReporteEmpleadoPagoRubro(Boolean isPermisoReporteEmpleadoPagoRubro) {
		this.isPermisoReporteEmpleadoPagoRubro = isPermisoReporteEmpleadoPagoRubro;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoPagoRubro() {
		return isPermisoPaginacionMedioEmpleadoPagoRubro;
	}

	public void setIsPermisoPaginacionMedioEmpleadoPagoRubro(Boolean isPermisoPaginacionMedioEmpleadoPagoRubro) {
		this.isPermisoPaginacionMedioEmpleadoPagoRubro = isPermisoPaginacionMedioEmpleadoPagoRubro;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoPagoRubro() {
		return isPermisoPaginacionTodoEmpleadoPagoRubro;
	}

	public void setIsPermisoPaginacionTodoEmpleadoPagoRubro(Boolean isPermisoPaginacionTodoEmpleadoPagoRubro) {
		this.isPermisoPaginacionTodoEmpleadoPagoRubro = isPermisoPaginacionTodoEmpleadoPagoRubro;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoPagoRubro() {
		return isPermisoPaginacionAltoEmpleadoPagoRubro;
	}

	public void setIsPermisoPaginacionAltoEmpleadoPagoRubro(Boolean isPermisoPaginacionAltoEmpleadoPagoRubro) {
		this.isPermisoPaginacionAltoEmpleadoPagoRubro = isPermisoPaginacionAltoEmpleadoPagoRubro;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoPagoRubro() {
		return isPermisoCopiarEmpleadoPagoRubro;
	}

	public void setIsPermisoCopiarEmpleadoPagoRubro(Boolean isPermisoCopiarEmpleadoPagoRubro) {
		this.isPermisoCopiarEmpleadoPagoRubro = isPermisoCopiarEmpleadoPagoRubro;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoPagoRubro() {
		return isPermisoVerFormEmpleadoPagoRubro;
	}

	public void setIsPermisoVerFormEmpleadoPagoRubro(Boolean isPermisoVerFormEmpleadoPagoRubro) {
		this.isPermisoVerFormEmpleadoPagoRubro = isPermisoVerFormEmpleadoPagoRubro;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoPagoRubro() {
		return isPermisoDuplicarEmpleadoPagoRubro;
	}

	public void setIsPermisoDuplicarEmpleadoPagoRubro(Boolean isPermisoDuplicarEmpleadoPagoRubro) {
		this.isPermisoDuplicarEmpleadoPagoRubro = isPermisoDuplicarEmpleadoPagoRubro;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoPagoRubro() {
		return isPermisoOrdenEmpleadoPagoRubro;
	}

	public void setIsPermisoOrdenEmpleadoPagoRubro(Boolean isPermisoOrdenEmpleadoPagoRubro) {
		this.isPermisoOrdenEmpleadoPagoRubro = isPermisoOrdenEmpleadoPagoRubro;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoPagoRubro() {
		return isVisibilidadCeldaNuevoEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoPagoRubro(Boolean isVisibilidadCeldaNuevoEmpleadoPagoRubro) {
		this.isVisibilidadCeldaNuevoEmpleadoPagoRubro = isVisibilidadCeldaNuevoEmpleadoPagoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoPagoRubro() {
		return isVisibilidadCeldaDuplicarEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoPagoRubro(Boolean isVisibilidadCeldaDuplicarEmpleadoPagoRubro) {
		this.isVisibilidadCeldaDuplicarEmpleadoPagoRubro = isVisibilidadCeldaDuplicarEmpleadoPagoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoPagoRubro() {
		return isVisibilidadCeldaCopiarEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoPagoRubro(Boolean isVisibilidadCeldaCopiarEmpleadoPagoRubro) {
		this.isVisibilidadCeldaCopiarEmpleadoPagoRubro = isVisibilidadCeldaCopiarEmpleadoPagoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoPagoRubro() {
		return isVisibilidadCeldaVerFormEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoPagoRubro(Boolean isVisibilidadCeldaVerFormEmpleadoPagoRubro) {
		this.isVisibilidadCeldaVerFormEmpleadoPagoRubro = isVisibilidadCeldaVerFormEmpleadoPagoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoPagoRubro() {
		return isVisibilidadCeldaOrdenEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoPagoRubro(Boolean isVisibilidadCeldaOrdenEmpleadoPagoRubro) {
		this.isVisibilidadCeldaOrdenEmpleadoPagoRubro = isVisibilidadCeldaOrdenEmpleadoPagoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro = isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoPagoRubro() {
		return isVisibilidadCeldaModificarEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoPagoRubro(Boolean isVisibilidadCeldaModificarEmpleadoPagoRubro) {
		this.isVisibilidadCeldaModificarEmpleadoPagoRubro = isVisibilidadCeldaModificarEmpleadoPagoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoPagoRubro() {
		return isVisibilidadCeldaActualizarEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoPagoRubro(Boolean isVisibilidadCeldaActualizarEmpleadoPagoRubro) {
		this.isVisibilidadCeldaActualizarEmpleadoPagoRubro = isVisibilidadCeldaActualizarEmpleadoPagoRubro;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoPagoRubro() {
		return isVisibilidadCeldaEliminarEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoPagoRubro(Boolean isVisibilidadCeldaEliminarEmpleadoPagoRubro) {
		this.isVisibilidadCeldaEliminarEmpleadoPagoRubro = isVisibilidadCeldaEliminarEmpleadoPagoRubro;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoPagoRubro() {
		return isVisibilidadCeldaCancelarEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoPagoRubro(Boolean isVisibilidadCeldaCancelarEmpleadoPagoRubro) {
		this.isVisibilidadCeldaCancelarEmpleadoPagoRubro = isVisibilidadCeldaCancelarEmpleadoPagoRubro;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoPagoRubro() {
		return isVisibilidadCeldaGuardarEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoPagoRubro(Boolean isVisibilidadCeldaGuardarEmpleadoPagoRubro) {
		this.isVisibilidadCeldaGuardarEmpleadoPagoRubro = isVisibilidadCeldaGuardarEmpleadoPagoRubro;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro = isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro;
	}
		
	public EmpleadoPagoRubroSessionBean getempleadopagorubroSessionBean() {
		return this.empleadopagorubroSessionBean;
	}
	
	public void setempleadopagorubroSessionBean(EmpleadoPagoRubroSessionBean empleadopagorubroSessionBean) {
		this.empleadopagorubroSessionBean=empleadopagorubroSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadopagorubro,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadopagorubro,null);
				this.setActualParaGuardarEstructuraForeignKey(empleadopagorubro,null);
				this.setActualParaGuardarRubroEmpleaForeignKey(empleadopagorubro,null);
				this.setActualParaGuardarAnioForeignKey(empleadopagorubro,null);
				this.setActualParaGuardarMesForeignKey(empleadopagorubro,null);
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
	
	public void bugActualizarReferenciaActual(EmpleadoPagoRubro empleadopagorubro,EmpleadoPagoRubro empleadopagorubroAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoPagoRubro(empleadopagorubro);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadopagorubroAux.setId(empleadopagorubro.getId());
		empleadopagorubroAux.setVersionRow(empleadopagorubro.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoPagoRubro();
		
			int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadopagorubroValidator.getInvalidValues(this.empleadopagorubro);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadopagorubroLogic.setDatosCliente(datosCliente);
			empleadopagorubroLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadopagorubroAux=new  EmpleadoPagoRubro();
				
				empleadopagorubroAux.setIsNew(true);
				empleadopagorubroAux.setIsChanged(true);
				
				empleadopagorubroAux.setEmpleadoPagoRubroOriginal(this.empleadopagorubro);
				
				empleadopagorubroAux.setId(this.empleadopagorubro.getId());	
				empleadopagorubroAux.setVersionRow(this.empleadopagorubro.getVersionRow());	
				empleadopagorubroAux.setid_empresa(this.empleadopagorubro.getid_empresa());	
				empleadopagorubroAux.setid_empleado(this.empleadopagorubro.getid_empleado());	
				empleadopagorubroAux.setid_estructura(this.empleadopagorubro.getid_estructura());	
				empleadopagorubroAux.setid_rubro_emplea(this.empleadopagorubro.getid_rubro_emplea());	
				empleadopagorubroAux.setid_anio(this.empleadopagorubro.getid_anio());	
				empleadopagorubroAux.setid_mes(this.empleadopagorubro.getid_mes());	
				empleadopagorubroAux.setvalor_pago(this.empleadopagorubro.getvalor_pago());	
				empleadopagorubroAux.setfecha(this.empleadopagorubro.getfecha());	
				empleadopagorubroAux.setfecha_liquidacion(this.empleadopagorubro.getfecha_liquidacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadopagorubroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadopagorubroAux,empleadopagorubroLogic.getEmpleadoPagoRubros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadopagorubroAux,empleadopagorubros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadopagorubroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroLogic.saveEmpleadoPagoRubros();//WithConnection
						//empleadopagorubroLogic.getSetVersionRowEmpleadoPagoRubros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadopagorubro,empleadopagorubroAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoPagoRubro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadopagorubroLogic.saveEmpleadoPagoRubroRelaciones(empleadopagorubroAux);//WithConnection
								//empleadopagorubroLogic.getSetVersionRowEmpleadoPagoRubros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadopagorubro,empleadopagorubroAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadopagorubroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadopagorubroAux,empleadopagorubroLogic.getEmpleadoPagoRubros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadopagorubroAux,empleadopagorubros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadopagorubro,empleadopagorubroAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadopagorubroAux=new  EmpleadoPagoRubro();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado() 
					|| (this.empleadopagorubroSessionBean.getEsGuardarRelacionado() && this.empleadopagorubro.getId()>=0)) {
						
					empleadopagorubroAux.setIsNew(false);
				}
				
				empleadopagorubroAux.setIsDeleted(false);
			
				empleadopagorubroAux.setId(this.empleadopagorubro.getId());	
				empleadopagorubroAux.setVersionRow(this.empleadopagorubro.getVersionRow());	
				empleadopagorubroAux.setid_empresa(this.empleadopagorubro.getid_empresa());	
				empleadopagorubroAux.setid_empleado(this.empleadopagorubro.getid_empleado());	
				empleadopagorubroAux.setid_estructura(this.empleadopagorubro.getid_estructura());	
				empleadopagorubroAux.setid_rubro_emplea(this.empleadopagorubro.getid_rubro_emplea());	
				empleadopagorubroAux.setid_anio(this.empleadopagorubro.getid_anio());	
				empleadopagorubroAux.setid_mes(this.empleadopagorubro.getid_mes());	
				empleadopagorubroAux.setvalor_pago(this.empleadopagorubro.getvalor_pago());	
				empleadopagorubroAux.setfecha(this.empleadopagorubro.getfecha());	
				empleadopagorubroAux.setfecha_liquidacion(this.empleadopagorubro.getfecha_liquidacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadopagorubroAux,empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadopagorubroAux,empleadopagorubros);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadopagorubroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroLogic.saveEmpleadoPagoRubros();//WithConnection
						//empleadopagorubroLogic.getSetVersionRowEmpleadoPagoRubros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadopagorubro,empleadopagorubroAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoPagoRubro();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadopagorubroLogic.saveEmpleadoPagoRubroRelaciones(empleadopagorubroAux);//WithConnection
								//empleadopagorubroLogic.getSetVersionRowEmpleadoPagoRubros();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadopagorubro,empleadopagorubroAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadopagorubroSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadopagorubroAux,empleadopagorubroLogic.getEmpleadoPagoRubros());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadopagorubroAux,empleadopagorubros);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadopagorubro,empleadopagorubroAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadopagorubroAux=new  EmpleadoPagoRubro();
				
				empleadopagorubroAux.setIsNew(false);
				empleadopagorubroAux.setIsChanged(false);
				
				empleadopagorubroAux.setIsDeleted(true);
				
				empleadopagorubroAux.setId(this.empleadopagorubro.getId());	
				empleadopagorubroAux.setVersionRow(this.empleadopagorubro.getVersionRow());	
				empleadopagorubroAux.setid_empresa(this.empleadopagorubro.getid_empresa());	
				empleadopagorubroAux.setid_empleado(this.empleadopagorubro.getid_empleado());	
				empleadopagorubroAux.setid_estructura(this.empleadopagorubro.getid_estructura());	
				empleadopagorubroAux.setid_rubro_emplea(this.empleadopagorubro.getid_rubro_emplea());	
				empleadopagorubroAux.setid_anio(this.empleadopagorubro.getid_anio());	
				empleadopagorubroAux.setid_mes(this.empleadopagorubro.getid_mes());	
				empleadopagorubroAux.setvalor_pago(this.empleadopagorubro.getvalor_pago());	
				empleadopagorubroAux.setfecha(this.empleadopagorubro.getfecha());	
				empleadopagorubroAux.setfecha_liquidacion(this.empleadopagorubro.getfecha_liquidacion());	
				
				if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadopagorubroAux.getId()>=0) {	
						this.empleadopagorubrosEliminados.add(empleadopagorubroAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadopagorubroAux,empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadopagorubroAux,empleadopagorubros);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadopagorubroSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroLogic.saveEmpleadoPagoRubros();//WithConnection
						//empleadopagorubroLogic.getSetVersionRowEmpleadoPagoRubros();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadopagorubroLogic.saveEmpleadoPagoRubroRelaciones(empleadopagorubroAux);//WithConnection
								//empleadopagorubroLogic.getSetVersionRowEmpleadoPagoRubros();//WithConnection
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
							if(this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadopagorubroSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadopagorubroAux,empleadopagorubroLogic.getEmpleadoPagoRubros());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadopagorubroAux,empleadopagorubros);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getEmpleadoPagoRubros().addAll(this.empleadopagorubrosEliminados);
					
					empleadopagorubroLogic.saveEmpleadoPagoRubros();//WithConnection
					//empleadopagorubroLogic.getSetVersionRowEmpleadoPagoRubros();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoPagoRubro();
				
				this.empleadopagorubrosEliminados= new ArrayList<EmpleadoPagoRubro>();		
			}
			
			if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Pago Rubro GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Pago Rubro",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadopagorubro=empleadopagorubroAux;
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
      		//this.finishProcessEmpleadoPagoRubro();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoPagoRubro empleadopagorubroLocal) throws Exception {
		
		if(this.empleadopagorubroSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoPagoRubro empleadopagorubroLocal) throws Exception {	
		if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadopagorubroLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadopagorubroLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				empleadopagorubroLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(RubroEmpleaDetalleFormJInternalFrame.class)) {
				RubroEmpleaBeanSwingJInternalFrame rubroempleaBeanSwingJInternalFrameLocal=(RubroEmpleaBeanSwingJInternalFrame) ((RubroEmpleaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				rubroempleaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.getrubroemplea(),true);
				rubroempleaBeanSwingJInternalFrameLocal.actualizarLista(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea,this.rubroempleasForeignKey);

				rubroempleaBeanSwingJInternalFrameLocal.actualizarRelaciones(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				empleadopagorubroLocal.setRubroEmplea(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea);

				this.addItemDefectoCombosForeignKeyRubroEmplea();
				this.cargarCombosFrameRubroEmpleasForeignKey("Formulario");
				this.setActualRubroEmpleaForeignKey(rubroempleaBeanSwingJInternalFrameLocal.rubroemplea.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				empleadopagorubroLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				empleadopagorubroLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoPagoRubroActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadopagorubroValidator.getInvalidValues(this.empleadopagorubro);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoPagoRubro empleadopagorubro,List<EmpleadoPagoRubro> empleadopagorubros) throws Exception {
		try	{		
			EmpleadoPagoRubroConstantesFunciones.actualizarLista(empleadopagorubro,empleadopagorubros,this.empleadopagorubroSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoPagoRubro empleadopagorubro,List<EmpleadoPagoRubro> empleadopagorubros) throws Exception {
		try	{			
			EmpleadoPagoRubroConstantesFunciones.actualizarSelectedLista(empleadopagorubro,empleadopagorubros);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoPagoRubro> empleadopagorubrosLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadopagorubrosLocal=this.empleadopagorubroLogic.getEmpleadoPagoRubros();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadopagorubrosLocal=this.empleadopagorubros;
			}
			//ARCHITECTURE
		
			for(EmpleadoPagoRubro empleadopagorubroLocal:empleadopagorubrosLocal) {
				if(this.permiteMantenimiento(empleadopagorubroLocal) && empleadopagorubroLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpleadoPagoRubroConstantesFunciones.getEmpleadoPagoRubroLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoPagoRubroConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_empresaEmpleadoPagoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoPagoRubroConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_empleadoEmpleadoPagoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoPagoRubroConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_estructuraEmpleadoPagoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoPagoRubroConstantesFunciones.IDRUBROEMPLEA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_rubro_empleaEmpleadoPagoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoPagoRubroConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_anioEmpleadoPagoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoPagoRubroConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_mesEmpleadoPagoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoPagoRubroConstantesFunciones.VALORPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelvalor_pagoEmpleadoPagoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoPagoRubroConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelfechaEmpleadoPagoRubro,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoPagoRubroConstantesFunciones.FECHALIQUIDACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelfecha_liquidacionEmpleadoPagoRubro,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_empresaEmpleadoPagoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_empleadoEmpleadoPagoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_estructuraEmpleadoPagoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_rubro_empleaEmpleadoPagoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_anioEmpleadoPagoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelid_mesEmpleadoPagoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelvalor_pagoEmpleadoPagoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelfechaEmpleadoPagoRubro,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelfecha_liquidacionEmpleadoPagoRubro,"");
		
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
		this.iIdNuevoEmpleadoPagoRubro--;	
		
		
		this.empleadopagorubroAux=new EmpleadoPagoRubro();
		
		this.empleadopagorubroAux.setId(this.iIdNuevoEmpleadoPagoRubro);
		this.empleadopagorubroAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadopagorubroLogic.getEmpleadoPagoRubros().add(this.empleadopagorubroAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadopagorubros.add(this.empleadopagorubroAux);
		}
		//ARCHITECTURE
		
		this.empleadopagorubro=this.empleadopagorubroAux;
		
		if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoPagoRubro(this.empleadopagorubro);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoPagoRubro(this.empleadopagorubro);
		}
				
		//this.setDefaultControlesEmpleadoPagoRubro();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoPagoRubro();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoPagoRubro();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoPagoRubro();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoPagoRubro(this.empleadopagorubroBean,this.empleadopagorubro,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadopagorubroSessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoPagoRubroConstantesFunciones.getClassesRelationshipsOfEmpleadoPagoRubro(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadopagorubroReturnGeneral=empleadopagorubroLogic.procesarEventosEmpleadoPagoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadopagorubroLogic.getEmpleadoPagoRubros(),this.empleadopagorubro,this.empleadopagorubroParameterGeneral,this.isEsNuevoEmpleadoPagoRubro,classes);//this.empleadopagorubroLogic.getEmpleadoPagoRubro()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoPagoRubro(this.empleadopagorubroReturnGeneral,this.empleadopagorubroBean,false);
		
		if(this.empleadopagorubroReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoPagoRubro(this.empleadopagorubroReturnGeneral.getEmpleadoPagoRubro());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoPagoRubro(this.empleadopagorubroReturnGeneral.getEmpleadoPagoRubro());
		}
		
		if(this.empleadopagorubroReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoPagoRubro(this.empleadopagorubroReturnGeneral.getEmpleadoPagoRubro(),classes);//this.empleadopagorubroBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoPagoRubro();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoPagoRubro();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoPagoRubro(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoPagoRubro(false);
						
			if(empleadopagorubroSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoPagoRubro();
			}
			
			this.actualizarVisualTableDatosEmpleadoPagoRubro();
			
			this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(this.getIndiceNuevoEmpleadoPagoRubro(), this.getIndiceNuevoEmpleadoPagoRubro());
			
			this.seleccionarFilaTablaEmpleadoPagoRubroActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoPagoRubro(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTextFieldvalor_pagoEmpleadoPagoRubro.setEnabled(isHabilitar && this.empleadopagorubroConstantesFunciones.activarvalor_pagoEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfechaEmpleadoPagoRubro.setEnabled(isHabilitar && this.empleadopagorubroConstantesFunciones.activarfechaEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfecha_liquidacionEmpleadoPagoRubro.setEnabled(isHabilitar && this.empleadopagorubroConstantesFunciones.activarfecha_liquidacionEmpleadoPagoRubro);	
		//
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.setEnabled(isHabilitar && this.empleadopagorubroConstantesFunciones.activarid_empresaEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.setEnabled(isHabilitar && this.empleadopagorubroConstantesFunciones.activarid_empleadoEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.setEnabled(isHabilitar && this.empleadopagorubroConstantesFunciones.activarid_estructuraEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.setEnabled(isHabilitar && this.empleadopagorubroConstantesFunciones.activarid_rubro_empleaEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.setEnabled(isHabilitar && this.empleadopagorubroConstantesFunciones.activarid_anioEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.setEnabled(isHabilitar && this.empleadopagorubroConstantesFunciones.activarid_mesEmpleadoPagoRubro);
	};
	
	public void setDefaultControlesEmpleadoPagoRubro() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoPagoRubro(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadopagorubroSessionBean.setConGuardarRelaciones(true);			
			this.empleadopagorubroSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTabbedPaneRelacionesEmpleadoPagoRubro.setVisible(true);
			
					
		} else {
			//this.empleadopagorubroSessionBean.setConGuardarRelaciones(false);			
			this.empleadopagorubroSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTabbedPaneRelacionesEmpleadoPagoRubro.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoPagoRubro() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubroLogic.getEmpleadoPagoRubros()) {
				if(empleadopagorubroAux.getId().equals(this.iIdNuevoEmpleadoPagoRubro)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubros) {
				if(empleadopagorubroAux.getId().equals(this.iIdNuevoEmpleadoPagoRubro)) {
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
	
	public int getIndiceActualEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubroLogic.getEmpleadoPagoRubros()) {
				if(empleadopagorubroAux.getId().equals(empleadopagorubro.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubros) {
				if(empleadopagorubroAux.getId().equals(empleadopagorubro.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubroOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubroLogic.getEmpleadoPagoRubros()) {
				if(empleadopagorubroAux.getEmpleadoPagoRubroOriginal().getId().equals(empleadopagorubroOriginal.getId())) {
					existe=true;
					empleadopagorubroOriginal.setId(empleadopagorubroAux.getId());
					empleadopagorubroOriginal.setVersionRow(empleadopagorubroAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubros) {
				if(empleadopagorubroAux.getEmpleadoPagoRubroOriginal().getId().equals(empleadopagorubroOriginal.getId())) {
					existe=true;
					empleadopagorubroOriginal.setId(empleadopagorubroAux.getId());
					empleadopagorubroOriginal.setVersionRow(empleadopagorubroAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoPagoRubro(Boolean esParaCancelar) throws Exception {
		empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
		empleadopagorubroAux=new EmpleadoPagoRubro();
		
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubroLogic.getEmpleadoPagoRubros()) {
					if(empleadopagorubroAux.getId()<0) {
						empleadopagorubrosAux.add(empleadopagorubroAux);
					}		
				}
				this.iIdNuevoEmpleadoPagoRubro=0L;
				this.empleadopagorubroLogic.getEmpleadoPagoRubros().removeAll(empleadopagorubrosAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubros) {
					if(empleadopagorubroAux.getId()<0) {
						empleadopagorubrosAux.add(empleadopagorubroAux);
					}		
				}
				this.iIdNuevoEmpleadoPagoRubro=0L;
				this.empleadopagorubros.removeAll(empleadopagorubrosAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoPagoRubro 
					&& this.empleadopagorubroLogic.getEmpleadoPagoRubros().size()>0
					) {
					empleadopagorubroAux=this.empleadopagorubroLogic.getEmpleadoPagoRubros().get(this.empleadopagorubroLogic.getEmpleadoPagoRubros().size() - 1);
				
					if(empleadopagorubroAux.getId()<0) {
						this.empleadopagorubroLogic.getEmpleadoPagoRubros().remove(empleadopagorubroAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoPagoRubro && this.empleadopagorubros.size()>0) {
					empleadopagorubroAux=this.empleadopagorubros.get(this.empleadopagorubros.size() - 1);
				
					if(empleadopagorubroAux.getId()<0) {
						this.empleadopagorubros.remove(empleadopagorubroAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoPagoRubro(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadopagorubro.getId()<0) {
				this.empleadopagorubroLogic.getEmpleadoPagoRubros().remove(this.empleadopagorubro);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadopagorubro.getId()<0) {
				this.empleadopagorubros.remove(this.empleadopagorubro);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoPagoRubro(List<EmpleadoPagoRubro> empleadopagorubrosAux) throws Exception {
		EmpleadoPagoRubroConstantesFunciones.setEstadosInicialesEmpleadoPagoRubro(empleadopagorubrosAux);
	}
	
	public void setEstadosInicialesEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubroAux) throws Exception {
		EmpleadoPagoRubroConstantesFunciones.setEstadosInicialesEmpleadoPagoRubro(empleadopagorubroAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoPagoRubroActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoPagoRubroActual()) {
				if(!this.isEsNuevoEmpleadoPagoRubro) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoPagoRubro=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoPagoRubroActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Pago Rubro ?", "MANTENIMIENTO DE Empleado Pago Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoPagoRubro empleadopagorubro) throws Exception {
		EmpleadoPagoRubroConstantesFunciones.seleccionarAsignar(this.empleadopagorubro,empleadopagorubro);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoPagoRubro=this.isPermisoActualizarOriginalEmpleadoPagoRubro;
			
			
			this.seleccionarAsignar(empleadopagorubro);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoPagoRubroConstantesFunciones.quitarEspaciosEmpleadoPagoRubro(this.empleadopagorubro,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadopagorubroSessionBean.setsFuncionBusquedaRapida(this.empleadopagorubroSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEmpleadoPagoRubro) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoPagoRubro(esParaCancelar);				
				this.cancelarNuevoEmpleadoPagoRubro(esParaCancelar);								
			}
			
			this.empleadopagorubro=new EmpleadoPagoRubro();
			
			this.inicializarEmpleadoPagoRubro();
			
			this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoPagoRubro() throws Exception {
		try {
			EmpleadoPagoRubroConstantesFunciones.inicializarEmpleadoPagoRubro(this.empleadopagorubro);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadopagorubroLogic.getEmpleadoPagoRubros().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoPagoRubros(String sAccionBusqueda,List<EmpleadoPagoRubro> empleadopagorubrosParaReportes) throws Exception {
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
					sPathReporteFinal="EmpleadoPagoRubro"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoPagoRubroMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoPagoRubroMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoPagoRubro"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empleado Pago Rubros");		
		parameters.put("busquedapor", EmpleadoPagoRubroConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoPagoRubro=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoPagoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoPagoRubroConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoPagoRubro=new JRBeanArrayDataSource(EmpleadoPagoRubroJInternalFrame.TraerEmpleadoPagoRubroBeans(empleadopagorubrosParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoPagoRubro);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoPagoRubroConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoPagoRubroConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoPagoRubroBean.TraerEmpleadoPagoRubroBeans(empleadopagorubrosParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpleadoPagoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadopagorubrosParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoPagoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadopagorubrosParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubroActionPerformed(null);
					//this.generarExcelReporteEmpleadoPagoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadopagorubrosParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoPagoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadopagorubrosParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoPagoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadopagorubrosParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoPagoRubros(sAccionBusqueda,sTipoArchivoReporte,empleadopagorubrosParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoPagoRubros(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoPagoRubro> empleadopagorubrosParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadopagorubro";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoPagoRubros");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoPagoRubro("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoPagoRubro empleadopagorubro : empleadopagorubrosParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoPagoRubroConstantesFunciones.generarExcelReporteDataEmpleadoPagoRubro("NORMAL",row,workbook,empleadopagorubro,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Pago Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoPagoRubro(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoPagoRubroConstantesFunciones.generarExcelReporteHeaderEmpleadoPagoRubro(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoPagoRubros(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoPagoRubro> empleadopagorubrosParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadopagorubro_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoPagoRubros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoPagoRubro empleadopagorubro : empleadopagorubrosParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.getEmpleadoPagoRubroDescripcion(empleadopagorubro));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadopagorubro.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadopagorubro.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadopagorubro.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadopagorubro.getrubroemplea_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadopagorubro.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadopagorubro.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadopagorubro.getvalor_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadopagorubro.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadopagorubro.getfecha_liquidacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Pago Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoPagoRubros(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoPagoRubro> empleadopagorubrosParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoPagoRubro> empleadopagorubrosRespaldo=null;
		
		classes=EmpleadoPagoRubroConstantesFunciones.getClassesRelationshipsOfEmpleadoPagoRubro(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadopagorubroLogic.setDatosCliente(this.datosCliente);
		this.empleadopagorubroLogic.setDatosDeep(this.datosDeep);
		this.empleadopagorubroLogic.setIsConDeep(true);
		
		empleadopagorubrosRespaldo=this.empleadopagorubroLogic.getEmpleadoPagoRubros();
		
		this.empleadopagorubroLogic.setEmpleadoPagoRubros(empleadopagorubrosParaReportes);	
		this.empleadopagorubroLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadopagorubrosParaReportes=this.empleadopagorubroLogic.getEmpleadoPagoRubros();
		this.empleadopagorubroLogic.setEmpleadoPagoRubros(empleadopagorubrosRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadopagorubro_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoPagoRubros");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoPagoRubro("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoPagoRubro empleadopagorubro : empleadopagorubrosParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoPagoRubro("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoPagoRubroConstantesFunciones.generarExcelReporteDataEmpleadoPagoRubro("NORMAL",row,workbook,empleadopagorubro,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.getEmpleadoPagoRubroDescripcion(empleadopagorubro));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Pago Rubro",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoPagoRubro() throws Exception {		
		this.startProcessEmpleadoPagoRubro(true);
	}
	
	public void startProcessEmpleadoPagoRubro(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoPagoRubro ,this.jPanelParametrosReportesEmpleadoPagoRubro, this.jScrollPanelDatosEmpleadoPagoRubro,this.jPanelPaginacionEmpleadoPagoRubro, this.jScrollPanelDatosEdicionEmpleadoPagoRubro, this.jPanelAccionesEmpleadoPagoRubro,this.jPanelAccionesFormularioEmpleadoPagoRubro,this.jmenuBarEmpleadoPagoRubro,this.jmenuBarDetalleEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,this.jTtoolBarDetalleEmpleadoPagoRubro);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoPagoRubro=this.jTabbedPaneBusquedasEmpleadoPagoRubro; 
		
		final JPanel jPanelParametrosReportesEmpleadoPagoRubro=this.jPanelParametrosReportesEmpleadoPagoRubro;
		//final JScrollPane jScrollPanelDatosEmpleadoPagoRubro=this.jScrollPanelDatosEmpleadoPagoRubro;
		final JTable jTableDatosEmpleadoPagoRubro=this.jTableDatosEmpleadoPagoRubro;		
		final JPanel jPanelPaginacionEmpleadoPagoRubro=this.jPanelPaginacionEmpleadoPagoRubro;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoPagoRubro=this.jScrollPanelDatosEdicionEmpleadoPagoRubro;
		final JPanel jPanelAccionesEmpleadoPagoRubro=this.jPanelAccionesEmpleadoPagoRubro;
		
		JPanel jPanelCamposAuxiliarEmpleadoPagoRubro=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoPagoRubro=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			jPanelCamposAuxiliarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelCamposEmpleadoPagoRubro;
			jPanelAccionesFormularioAuxiliarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelAccionesFormularioEmpleadoPagoRubro;
		}
		
		final JPanel jPanelCamposEmpleadoPagoRubro=jPanelCamposAuxiliarEmpleadoPagoRubro;
		final JPanel jPanelAccionesFormularioEmpleadoPagoRubro=jPanelAccionesFormularioAuxiliarEmpleadoPagoRubro;
		
		
		final JMenuBar jmenuBarEmpleadoPagoRubro=this.jmenuBarEmpleadoPagoRubro;
		final JToolBar jTtoolBarEmpleadoPagoRubro=this.jTtoolBarEmpleadoPagoRubro;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoPagoRubro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoPagoRubro=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			jmenuBarDetalleAuxiliarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jmenuBarDetalleEmpleadoPagoRubro;
			jTtoolBarDetalleAuxiliarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTtoolBarDetalleEmpleadoPagoRubro;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoPagoRubro=jmenuBarDetalleAuxiliarEmpleadoPagoRubro;
		final JToolBar jTtoolBarDetalleEmpleadoPagoRubro=jTtoolBarDetalleAuxiliarEmpleadoPagoRubro;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoPagoRubro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoPagoRubro;
			processRunnable.jTableDatos=jTableDatosEmpleadoPagoRubro;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoPagoRubro;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoPagoRubro;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoPagoRubro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoPagoRubro;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoPagoRubro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoPagoRubro;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoPagoRubro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoPagoRubro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoPagoRubro ,jPanelParametrosReportesEmpleadoPagoRubro,jTableDatosEmpleadoPagoRubro, /*jScrollPanelDatosEmpleadoPagoRubro,*/jPanelCamposEmpleadoPagoRubro,jPanelPaginacionEmpleadoPagoRubro, /*jScrollPanelDatosEdicionEmpleadoPagoRubro,*/ jPanelAccionesEmpleadoPagoRubro,jPanelAccionesFormularioEmpleadoPagoRubro,jmenuBarEmpleadoPagoRubro,jmenuBarDetalleEmpleadoPagoRubro,jTtoolBarEmpleadoPagoRubro,jTtoolBarDetalleEmpleadoPagoRubro);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoPagoRubro ,jPanelParametrosReportesEmpleadoPagoRubro, jScrollPanelDatosEmpleadoPagoRubro,jPanelPaginacionEmpleadoPagoRubro, jScrollPanelDatosEdicionEmpleadoPagoRubro, jPanelAccionesEmpleadoPagoRubro,jPanelAccionesFormularioEmpleadoPagoRubro,jmenuBarEmpleadoPagoRubro,jmenuBarDetalleEmpleadoPagoRubro,jTtoolBarEmpleadoPagoRubro,jTtoolBarDetalleEmpleadoPagoRubro);
						
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
	
	public void finishProcessEmpleadoPagoRubro() {// throws Exception 
		this.finishProcessEmpleadoPagoRubro(true);
	}
	
	public void finishProcessEmpleadoPagoRubro(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoPagoRubro ,this.jPanelParametrosReportesEmpleadoPagoRubro, this.jScrollPanelDatosEmpleadoPagoRubro,this.jPanelPaginacionEmpleadoPagoRubro, this.jScrollPanelDatosEdicionEmpleadoPagoRubro, this.jPanelAccionesEmpleadoPagoRubro,this.jPanelAccionesFormularioEmpleadoPagoRubro,this.jmenuBarEmpleadoPagoRubro,this.jmenuBarDetalleEmpleadoPagoRubro,this.jTtoolBarEmpleadoPagoRubro,this.jTtoolBarDetalleEmpleadoPagoRubro);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoPagoRubro=this.jTabbedPaneBusquedasEmpleadoPagoRubro; 
		
		final JPanel jPanelParametrosReportesEmpleadoPagoRubro=this.jPanelParametrosReportesEmpleadoPagoRubro;
		//final JScrollPane jScrollPanelDatosEmpleadoPagoRubro=this.jScrollPanelDatosEmpleadoPagoRubro;
		final JTable jTableDatosEmpleadoPagoRubro=this.jTableDatosEmpleadoPagoRubro;		
		final JPanel jPanelPaginacionEmpleadoPagoRubro=this.jPanelPaginacionEmpleadoPagoRubro;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoPagoRubro=this.jScrollPanelDatosEdicionEmpleadoPagoRubro;
		final JPanel jPanelAccionesEmpleadoPagoRubro=this.jPanelAccionesEmpleadoPagoRubro;
		
		JPanel jPanelCamposAuxiliarEmpleadoPagoRubro=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoPagoRubro=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			jPanelCamposAuxiliarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelCamposEmpleadoPagoRubro;
			jPanelAccionesFormularioAuxiliarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelAccionesFormularioEmpleadoPagoRubro;
		}
		
		final JPanel jPanelCamposEmpleadoPagoRubro=jPanelCamposAuxiliarEmpleadoPagoRubro;
		final JPanel jPanelAccionesFormularioEmpleadoPagoRubro=jPanelAccionesFormularioAuxiliarEmpleadoPagoRubro;
		
		
		final JMenuBar jmenuBarEmpleadoPagoRubro=this.jmenuBarEmpleadoPagoRubro;		
		final JToolBar jTtoolBarEmpleadoPagoRubro=this.jTtoolBarEmpleadoPagoRubro;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoPagoRubro=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoPagoRubro=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			jmenuBarDetalleAuxiliarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jmenuBarDetalleEmpleadoPagoRubro;
			jTtoolBarDetalleAuxiliarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTtoolBarDetalleEmpleadoPagoRubro;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoPagoRubro=jmenuBarDetalleAuxiliarEmpleadoPagoRubro;
		final JToolBar jTtoolBarDetalleEmpleadoPagoRubro=jTtoolBarDetalleAuxiliarEmpleadoPagoRubro;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoPagoRubro;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoPagoRubro;
			processRunnable.jTableDatos=jTableDatosEmpleadoPagoRubro;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoPagoRubro;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoPagoRubro;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoPagoRubro;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoPagoRubro;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoPagoRubro;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoPagoRubro;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoPagoRubro;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoPagoRubro;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoPagoRubro ,jPanelParametrosReportesEmpleadoPagoRubro, jTableDatosEmpleadoPagoRubro,/*jScrollPanelDatosEmpleadoPagoRubro,*/jPanelCamposEmpleadoPagoRubro,jPanelPaginacionEmpleadoPagoRubro, /*jScrollPanelDatosEdicionEmpleadoPagoRubro,*/ jPanelAccionesEmpleadoPagoRubro,jPanelAccionesFormularioEmpleadoPagoRubro,jmenuBarEmpleadoPagoRubro,jmenuBarDetalleEmpleadoPagoRubro,jTtoolBarEmpleadoPagoRubro,jTtoolBarDetalleEmpleadoPagoRubro));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoPagoRubro(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoPagoRubro(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoPagoRubro(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoPagoRubro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoPagoRubro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoPagoRubro,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoPagoRubro(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoPagoRubro,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoPagoRubro,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadopagorubroConstantesFunciones.getsFinalQueryEmpleadoPagoRubro();
		String  finalQueryPaginacionTodos=this.empleadopagorubroConstantesFunciones.getsFinalQueryEmpleadoPagoRubro();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoPagoRubroConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoPagoRubro(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoPagoRubroConstantesFunciones.getArrayColumnasGlobalesEmpleadoPagoRubro(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoPagoRubroConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadopagorubrosEliminados= new ArrayList<EmpleadoPagoRubro>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoPagoRubro();
		
				///*EmpleadoPagoRubroSessionBean*/this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
			
			if(this.empleadopagorubroSessionBean==null) {
				this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
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
					this.iNumeroPaginacion=EmpleadoPagoRubroConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoPagoRubroConstantesFunciones.getClassesForeignKeysOfEmpleadoPagoRubro(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadopagorubro."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadopagorubrosAux= new ArrayList<EmpleadoPagoRubro>();
			
				
			empleadopagorubroLogic.setDatosCliente(this.datosCliente);
			empleadopagorubroLogic.setDatosDeep(this.datosDeep);
			empleadopagorubroLogic.setIsConDeep(true);
			
			
			empleadopagorubroLogic.getEmpleadoPagoRubroDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadopagorubroLogic.getTodosEmpleadoPagoRubros(finalQueryGlobal,pagination);
					
					//empleadopagorubroLogic.getTodosEmpleadoPagoRubrosWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadopagorubroLogic.getEmpleadoPagoRubros()==null|| empleadopagorubroLogic.getEmpleadoPagoRubros().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadopagorubrosAux= new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubrosAux.addAll(empleadopagorubroLogic.getEmpleadoPagoRubros());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubrosAux= new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubrosAux.addAll(empleadopagorubros);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadopagorubroLogic.getTodosEmpleadoPagoRubros(finalQueryGlobal+"",this.pagination);												
							
							//empleadopagorubroLogic.getTodosEmpleadoPagoRubrosWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoPagoRubros("Todos",empleadopagorubroLogic.getEmpleadoPagoRubros() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadopagorubroLogic.setEmpleadoPagoRubros(new ArrayList<EmpleadoPagoRubro>());					
							empleadopagorubroLogic.getEmpleadoPagoRubros().addAll(empleadopagorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubros=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubros.addAll(empleadopagorubrosAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoPagoRubro=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoPagoRubro=this.idActual;
				
				} else if(this.idEmpleadoPagoRubroActual!=null && this.idEmpleadoPagoRubroActual!=0L) {
					idEmpleadoPagoRubro=idEmpleadoPagoRubroActual;
				}
				
					
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndicePorId(idEmpleadoPagoRubro);
				
				this.empleadopagorubros=new ArrayList<EmpleadoPagoRubro>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadopagorubroLogic.getEntity(idEmpleadoPagoRubro);
					
					//empleadopagorubroLogic.getEntityWithConnection(idEmpleadoPagoRubro);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadopagorubroLogic.setEmpleadoPagoRubros(new ArrayList<EmpleadoPagoRubro>());
					empleadopagorubroLogic.getEmpleadoPagoRubros().add(empleadopagorubroLogic.getEmpleadoPagoRubro());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadopagorubros=new ArrayList<EmpleadoPagoRubro>();
					this.empleadopagorubros.add(empleadopagorubro);
				}
				
				if(empleadopagorubroLogic.getEmpleadoPagoRubro()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadopagorubroLogic.getEmpleadoPagoRubros()==null||empleadopagorubroLogic.getEmpleadoPagoRubros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadopagorubros==null|| empleadopagorubros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
						empleadopagorubrosAux.addAll(empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubrosAux.addAll(empleadopagorubros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoPagoRubros("FK_IdAnio",empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoPagoRubros("FK_IdAnio",empleadopagorubros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroLogic.setEmpleadoPagoRubros(new ArrayList<EmpleadoPagoRubro>());
						empleadopagorubroLogic.getEmpleadoPagoRubros().addAll(empleadopagorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubros=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubros.addAll(empleadopagorubrosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadopagorubroLogic.getEmpleadoPagoRubros()==null||empleadopagorubroLogic.getEmpleadoPagoRubros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadopagorubros==null|| empleadopagorubros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
						empleadopagorubrosAux.addAll(empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubrosAux.addAll(empleadopagorubros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoPagoRubros("FK_IdEmpleado",empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoPagoRubros("FK_IdEmpleado",empleadopagorubros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroLogic.setEmpleadoPagoRubros(new ArrayList<EmpleadoPagoRubro>());
						empleadopagorubroLogic.getEmpleadoPagoRubros().addAll(empleadopagorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubros=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubros.addAll(empleadopagorubrosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadopagorubroLogic.getEmpleadoPagoRubros()==null||empleadopagorubroLogic.getEmpleadoPagoRubros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadopagorubros==null|| empleadopagorubros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
						empleadopagorubrosAux.addAll(empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubrosAux.addAll(empleadopagorubros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoPagoRubros("FK_IdEmpresa",empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoPagoRubros("FK_IdEmpresa",empleadopagorubros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroLogic.setEmpleadoPagoRubros(new ArrayList<EmpleadoPagoRubro>());
						empleadopagorubroLogic.getEmpleadoPagoRubros().addAll(empleadopagorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubros=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubros.addAll(empleadopagorubrosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadopagorubroLogic.getEmpleadoPagoRubros()==null||empleadopagorubroLogic.getEmpleadoPagoRubros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadopagorubros==null|| empleadopagorubros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
						empleadopagorubrosAux.addAll(empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubrosAux.addAll(empleadopagorubros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoPagoRubros("FK_IdEstructura",empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoPagoRubros("FK_IdEstructura",empleadopagorubros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroLogic.setEmpleadoPagoRubros(new ArrayList<EmpleadoPagoRubro>());
						empleadopagorubroLogic.getEmpleadoPagoRubros().addAll(empleadopagorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubros=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubros.addAll(empleadopagorubrosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadopagorubroLogic.getEmpleadoPagoRubros()==null||empleadopagorubroLogic.getEmpleadoPagoRubros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadopagorubros==null|| empleadopagorubros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
						empleadopagorubrosAux.addAll(empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubrosAux.addAll(empleadopagorubros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoPagoRubros("FK_IdMes",empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoPagoRubros("FK_IdMes",empleadopagorubros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroLogic.setEmpleadoPagoRubros(new ArrayList<EmpleadoPagoRubro>());
						empleadopagorubroLogic.getEmpleadoPagoRubros().addAll(empleadopagorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubros=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubros.addAll(empleadopagorubrosAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdRubroEmplea")) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadopagorubroLogic.getEmpleadoPagoRubros()==null||empleadopagorubroLogic.getEmpleadoPagoRubros().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadopagorubros==null|| empleadopagorubros.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
						empleadopagorubrosAux.addAll(empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubrosAux=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubrosAux.addAll(empleadopagorubros);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdRubroEmplea(finalQueryGlobal,pagination,id_rubro_empleaFK_IdRubroEmplea);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoPagoRubroConstantesFunciones.getDetalleIndiceFK_IdRubroEmplea(id_rubro_empleaFK_IdRubroEmplea);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoPagoRubros("FK_IdRubroEmplea",empleadopagorubroLogic.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoPagoRubros("FK_IdRubroEmplea",empleadopagorubros);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroLogic.setEmpleadoPagoRubros(new ArrayList<EmpleadoPagoRubro>());
						empleadopagorubroLogic.getEmpleadoPagoRubros().addAll(empleadopagorubrosAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubros=new ArrayList<EmpleadoPagoRubro>();
							empleadopagorubros.addAll(empleadopagorubrosAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoPagoRubro();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoPagoRubro();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadopagorubroLogic.getEmpleadoPagoRubros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadopagorubros.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadopagorubroLogic.getEmpleadoPagoRubros().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadopagorubros.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoPagoRubro empleadopagorubro) {
		Boolean permite=true;
		
		if(this.empleadopagorubro.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoPagoRubroConstantesFunciones.getOrderByListaEmpleadoPagoRubro();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoPagoRubroConstantesFunciones.getOrderByListaEmpleadoPagoRubro();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubroLogic.getEmpleadoPagoRubros()) {
				if(empleadopagorubro.getsType().equals(Constantes2.S_TOTALES)) {
					empleadopagorubroTotales=empleadopagorubro;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoPagoRubro empleadopagorubro:this.empleadopagorubros) {
				if(empleadopagorubro.getsType().equals(Constantes2.S_TOTALES)) {
					empleadopagorubroTotales=empleadopagorubro;
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
			this.empleadopagorubroAux=new EmpleadoPagoRubro();
			this.empleadopagorubroAux.setsType(Constantes2.S_TOTALES);
			this.empleadopagorubroAux.setIsNew(false);
			this.empleadopagorubroAux.setIsChanged(false);
			this.empleadopagorubroAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoPagoRubroConstantesFunciones.TotalizarValoresFilaEmpleadoPagoRubro(this.empleadopagorubroLogic.getEmpleadoPagoRubros(),this.empleadopagorubroAux);
				
				this.empleadopagorubroLogic.getEmpleadoPagoRubros().add(this.empleadopagorubroAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoPagoRubroConstantesFunciones.TotalizarValoresFilaEmpleadoPagoRubro(this.empleadopagorubros,this.empleadopagorubroAux);
				
				this.empleadopagorubros.add(this.empleadopagorubroAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadopagorubroTotales=new EmpleadoPagoRubro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadopagorubroLogic.getEmpleadoPagoRubros().remove(empleadopagorubroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadopagorubros.remove(empleadopagorubroTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadopagorubroTotales=new EmpleadoPagoRubro();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubroLogic.getEmpleadoPagoRubros()) {
				if(empleadopagorubro.getsType().equals(Constantes2.S_TOTALES)) {
					empleadopagorubroTotales=empleadopagorubro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoPagoRubroConstantesFunciones.TotalizarValoresFilaEmpleadoPagoRubro(this.empleadopagorubroLogic.getEmpleadoPagoRubros(),empleadopagorubroTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoPagoRubro empleadopagorubro:this.empleadopagorubros) {
				if(empleadopagorubro.getsType().equals(Constantes2.S_TOTALES)) {
					empleadopagorubroTotales=empleadopagorubro;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoPagoRubroConstantesFunciones.TotalizarValoresFilaEmpleadoPagoRubro(this.empleadopagorubros,empleadopagorubroTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoPagoRubrosFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoPagoRubrosFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoPagoRubrosFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoPagoRubrosFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoPagoRubrosFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoPagoRubrosFK_IdRubroEmplea()throws Exception {
		try {
			sAccionBusqueda="FK_IdRubroEmplea";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoPagoRubrosFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoPagoRubrosFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoPagoRubrosFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoPagoRubrosFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoPagoRubrosFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoPagoRubrosFK_IdRubroEmplea(String sFinalQuery,Long id_rubro_emplea)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadopagorubroLogic.getEmpleadoPagoRubrosFK_IdRubroEmplea(sFinalQuery,this.pagination,id_rubro_emplea);
				
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
	
	public void inicializarPermisosEmpleadoPagoRubro() {
		this.isPermisoTodoEmpleadoPagoRubro=false;
		this.isPermisoNuevoEmpleadoPagoRubro=false;
		this.isPermisoActualizarEmpleadoPagoRubro=false;
		this.isPermisoActualizarOriginalEmpleadoPagoRubro=false;
		this.isPermisoEliminarEmpleadoPagoRubro=false;
		this.isPermisoGuardarCambiosEmpleadoPagoRubro=false;
		this.isPermisoConsultaEmpleadoPagoRubro=false;
		this.isPermisoBusquedaEmpleadoPagoRubro=false;
		this.isPermisoReporteEmpleadoPagoRubro=false;		
		this.isPermisoOrdenEmpleadoPagoRubro=false;		
		this.isPermisoPaginacionMedioEmpleadoPagoRubro=false;		
		this.isPermisoPaginacionAltoEmpleadoPagoRubro=false;
		this.isPermisoPaginacionTodoEmpleadoPagoRubro=false;
		this.isPermisoCopiarEmpleadoPagoRubro=false;		
		this.isPermisoVerFormEmpleadoPagoRubro=false;		
		this.isPermisoDuplicarEmpleadoPagoRubro=false;		
		this.isPermisoOrdenEmpleadoPagoRubro=false;		
	}
	
	public void setPermisosUsuarioEmpleadoPagoRubro(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoPagoRubro=isPermiso;
		this.isPermisoNuevoEmpleadoPagoRubro=isPermiso;
		this.isPermisoActualizarEmpleadoPagoRubro=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoPagoRubro=isPermiso;
		this.isPermisoEliminarEmpleadoPagoRubro=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoPagoRubro=isPermiso;
		this.isPermisoConsultaEmpleadoPagoRubro=isPermiso;
		this.isPermisoBusquedaEmpleadoPagoRubro=isPermiso;
		this.isPermisoReporteEmpleadoPagoRubro=isPermiso;
		this.isPermisoOrdenEmpleadoPagoRubro=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoPagoRubro=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoPagoRubro=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoPagoRubro=isPermiso;		
		this.isPermisoCopiarEmpleadoPagoRubro=isPermiso;		
		this.isPermisoVerFormEmpleadoPagoRubro=isPermiso;		
		this.isPermisoDuplicarEmpleadoPagoRubro=isPermiso;
		this.isPermisoOrdenEmpleadoPagoRubro=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoPagoRubro(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoPagoRubro=isPermiso;
		this.isPermisoNuevoEmpleadoPagoRubro=isPermiso;
		this.isPermisoActualizarEmpleadoPagoRubro=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoPagoRubro=isPermiso;
		this.isPermisoEliminarEmpleadoPagoRubro=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoPagoRubro=isPermiso;
		//this.isPermisoConsultaEmpleadoPagoRubro=isPermiso;
		//this.isPermisoBusquedaEmpleadoPagoRubro=isPermiso;
		//this.isPermisoReporteEmpleadoPagoRubro=isPermiso;
		//this.isPermisoOrdenEmpleadoPagoRubro=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoPagoRubro=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoPagoRubro=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoPagoRubro=isPermiso;		
		//this.isPermisoCopiarEmpleadoPagoRubro=isPermiso;		
		//this.isPermisoDuplicarEmpleadoPagoRubro=isPermiso;
		//this.isPermisoOrdenEmpleadoPagoRubro=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoPagoRubroClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoPagoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoPagoRubro(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoPagoRubroClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoPagoRubroClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoPagoRubroClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoPagoRubroClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoPagoRubro() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoPagoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoPagoRubroConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoPagoRubro=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoPagoRubro=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoPagoRubro=this.isPermisoActualizarEmpleadoPagoRubro;
			this.isPermisoEliminarEmpleadoPagoRubro=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoPagoRubro=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoPagoRubro=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoPagoRubro=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoPagoRubro=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoPagoRubro=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoPagoRubro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoPagoRubro=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoPagoRubro=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoPagoRubro=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoPagoRubro=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoPagoRubro=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoPagoRubro=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoPagoRubro=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoPagoRubro.setToolTipText(this.jTableDatosEmpleadoPagoRubro.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoPagoRubro(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoPagoRubro(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoPagoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpleadoPagoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpleadoPagoRubro() throws Exception {
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
	public void inicializarCombosForeignKeyEmpleadoPagoRubroListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
				this.rubroempleasForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoPagoRubroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoPagoRubroJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoPagoRubroListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyEmpleadoPagoRubroListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoPagoRubroParameterReturnGeneral empleadopagorubroReturnGeneral=new EmpleadoPagoRubroParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadopagorubroConstantesFunciones.cargarid_empresaEmpleadoPagoRubro)
					 || (this.esRecargarFks && this.empleadopagorubroConstantesFunciones.cargarid_empresaEmpleadoPagoRubro)) {

					if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadopagorubroSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadopagorubroConstantesFunciones.cargarid_empleadoEmpleadoPagoRubro)
					 || (this.esRecargarFks && this.empleadopagorubroConstantesFunciones.cargarid_empleadoEmpleadoPagoRubro)) {

					if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadopagorubroSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.empleadopagorubroConstantesFunciones.cargarid_estructuraEmpleadoPagoRubro)
					 || (this.esRecargarFks && this.empleadopagorubroConstantesFunciones.cargarid_estructuraEmpleadoPagoRubro)) {

					if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+empleadopagorubroSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}


				String finalQueryGlobalRubroEmplea="";

				if(((this.rubroempleasForeignKey==null||this.rubroempleasForeignKey.size()<=0) && this.empleadopagorubroConstantesFunciones.cargarid_rubro_empleaEmpleadoPagoRubro)
					 || (this.esRecargarFks && this.empleadopagorubroConstantesFunciones.cargarid_rubro_empleaEmpleadoPagoRubro)) {

					if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=RubroEmpleaConstantesFunciones.getArrayColumnasGlobalesRubroEmplea(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalRubroEmplea=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,RubroEmpleaConstantesFunciones.TABLENAME);

						finalQueryGlobalRubroEmplea=Funciones.GetFinalQueryAppend(finalQueryGlobalRubroEmplea, "");
						finalQueryGlobalRubroEmplea+=RubroEmpleaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosRubroEmpleasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalRubroEmplea=" WHERE " + ConstantesSql.ID + "="+empleadopagorubroSessionBean.getlidRubroEmpleaActual();
					}
				} else {
					finalQueryGlobalRubroEmplea="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.empleadopagorubroConstantesFunciones.cargarid_anioEmpleadoPagoRubro)
					 || (this.esRecargarFks && this.empleadopagorubroConstantesFunciones.cargarid_anioEmpleadoPagoRubro)) {

					if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+empleadopagorubroSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.empleadopagorubroConstantesFunciones.cargarid_mesEmpleadoPagoRubro)
					 || (this.esRecargarFks && this.empleadopagorubroConstantesFunciones.cargarid_mesEmpleadoPagoRubro)) {

					if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+empleadopagorubroSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadopagorubroReturnGeneral=empleadopagorubroLogic.cargarCombosLoteForeignKeyEmpleadoPagoRubro(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalEstructura,finalQueryGlobalRubroEmplea,finalQueryGlobalAnio,finalQueryGlobalMes);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadopagorubroReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadopagorubroReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=empleadopagorubroReturnGeneral.getestructurasForeignKey();
			}

			if(!finalQueryGlobalRubroEmplea.equals("NONE")) {
				this.rubroempleasForeignKey=empleadopagorubroReturnGeneral.getrubroempleasForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=empleadopagorubroReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=empleadopagorubroReturnGeneral.getmessForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoPagoRubro()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEstructura();
			this.addItemDefectoCombosForeignKeyRubroEmplea();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadopagorubroSessionBean==null) {
				this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
			}

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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

	public void addItemDefectoCombosForeignKeyRubroEmplea()throws Exception {
		try {

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionRubroEmplea()) {
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

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.empleadopagorubroSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
	
	public void initActionsCombosTodosForeignKeyEmpleadoPagoRubro()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoPagoRubro(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoPagoRubro()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.empleadopagorubro.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
				this.empleadopagorubro.setfecha_liquidacion(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoPagoRubro();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(empleadopagorubro.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(empleadopagorubro.getid_estructura(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(empleadopagorubro.getid_rubro_emplea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoPagoRubro()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.empleadopagorubroConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.empleadopagorubroConstantesFunciones.getid_estructura(),false,"Formulario");
			this.setActualRubroEmpleaForeignKey(this.empleadopagorubroConstantesFunciones.getid_rubro_emplea(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoPagoRubro()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoPagoRubro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoPagoRubro()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoPagoRubro()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoPagoRubro()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");
			this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoPagoRubro(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameRubroEmpleasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoPagoRubro()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	












	
	

	public EmpleadoPagoRubroBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoPagoRubroBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoPagoRubroBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean(); 
		this.empleadopagorubroConstantesFunciones=new EmpleadoPagoRubroConstantesFunciones(); 
		this.empleadopagorubroBean=new EmpleadoPagoRubro();//(this.empleadopagorubroConstantesFunciones); 		
		this.empleadopagorubroReturnGeneral=new EmpleadoPagoRubroParameterReturnGeneral(); 
		
		this.empleadopagorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadopagorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoPagoRubroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoPagoRubroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoPagoRubroBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoPagoRubro(true);
			
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
			
			this.empleadopagorubroConstantesFunciones=new EmpleadoPagoRubroConstantesFunciones(); 
			this.empleadopagorubroBean=new EmpleadoPagoRubro();//this.empleadopagorubroConstantesFunciones); 			
			this.empleadopagorubroReturnGeneral=new EmpleadoPagoRubroParameterReturnGeneral(); 
		
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Pago Rubro Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.empleadopagorubro=new EmpleadoPagoRubro();
			this.empleadopagorubros = new ArrayList<EmpleadoPagoRubro>();
			this.empleadopagorubrosAux = new ArrayList<EmpleadoPagoRubro>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic=new EmpleadoPagoRubroLogic();
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadopagorubroSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadopagorubroSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoPagoRubro);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoPagoRubro);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoPagoRubro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoPagoRubro);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoPagoRubro!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoPagoRubro);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoPagoRubro);
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro);
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoPagoRubro!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoPagoRubro);
					this.jInternalFrameImportacionEmpleadoPagoRubro.setVisible(false);
					this.jInternalFrameImportacionEmpleadoPagoRubro.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoPagoRubro!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoPagoRubro);
					this.jInternalFrameOrderByEmpleadoPagoRubro.setVisible(false);
					this.jInternalFrameOrderByEmpleadoPagoRubro.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoPagoRubroActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoPagoRubroConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empleadopagorubroReturnGeneral=new EmpleadoPagoRubroParameterReturnGeneral();
			
			this.empleadopagorubroParameterGeneral=new EmpleadoPagoRubroParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadopagorubroLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpleadoPagoRubroJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoPagoRubroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadopagorubroSessionBean.getEsGuardarRelacionado(),this.empleadopagorubroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoPagoRubroConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadopagorubroSessionBean.getEsGuardarRelacionado(),this.empleadopagorubroSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaDuplicarEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaCopiarEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaVerFormEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaOrdenEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaModificarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdMes=true;
			this.isVisibilidadFK_IdRubroEmplea=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoPagoRubro();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoPagoRubro(false);
			
			this.setPermisosUsuarioEmpleadoPagoRubro();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado() 
				|| (this.empleadopagorubroSessionBean.getEsGuardarRelacionado() && this.empleadopagorubroSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoPagoRubroClasesRelacionadas();
			}
			
			if(this.empleadopagorubroSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoPagoRubroClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoPagoRubro();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoPagoRubro();
			}
			
			if(!this.isPermisoBusquedaEmpleadoPagoRubro) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoPagoRubro,this.isPermisoPaginacionMedioEmpleadoPagoRubro,this.isPermisoPaginacionTodoEmpleadoPagoRubro);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoPagoRubroConstantesFunciones.getTiposSeleccionarEmpleadoPagoRubro());
				
				this.tiposColumnasSelect=EmpleadoPagoRubroConstantesFunciones.getTiposSeleccionarEmpleadoPagoRubro(true);
				
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
			//if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoPagoRubro();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioEmpleadoPagoRubro(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioEmpleadoPagoRubro(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoPagoRubro() ;
			
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
			this.estructuraLogic=new EstructuraLogic();
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
				empleadopagorubroImplementable= (EmpleadoPagoRubroImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoPagoRubroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadopagorubroImplementableHome= (EmpleadoPagoRubroImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoPagoRubroConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadopagorubros= new ArrayList<EmpleadoPagoRubro>();
			this.empleadopagorubrosEliminados= new ArrayList<EmpleadoPagoRubro>();
						
			this.isEsNuevoEmpleadoPagoRubro=false;
			this.esParaAccionDesdeFormularioEmpleadoPagoRubro=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			this.rubroempleasForeignKey=new ArrayList<RubroEmplea>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoPagoRubro(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoPagoRubro();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoPagoRubroConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoPagoRubro(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoPagoRubro();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoPagoRubro();
			}
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoPagoRubro.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoPagoRubro.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoPagoRubro.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoPagoRubro(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoPagoRubro: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoPagoRubro() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoPagoRubro")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTabbedPaneRelacionesEmpleadoPagoRubro.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTabbedPaneRelacionesEmpleadoPagoRubro.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoPagoRubro();	
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
	
	public void cargarCombosForeignKeyEmpleadoPagoRubro(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoPagoRubro(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoPagoRubro(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoPagoRubroListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoPagoRubro();
		
		this.cargarCombosFrameForeignKeyEmpleadoPagoRubro();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoPagoRubro();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoPagoRubro();
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
	
	public void jButtonNuevoEmpleadoPagoRubroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadopagorubroSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
			
			if(jTableDatosEmpleadoPagoRubro.getRowCount()>=1) {
				jTableDatosEmpleadoPagoRubro.removeRowSelectionInterval(0, jTableDatosEmpleadoPagoRubro.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoPagoRubro=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoPagoRubro(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoPagoRubro(true);			
			//this.empleadopagorubro=new EmpleadoPagoRubro();
			//this.empleadopagorubro.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoPagoRubro(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoPagoRubro() ;
			
			if(EmpleadoPagoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoPagoRubro(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadopagorubro);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);				
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
			if(this.empleadopagorubroSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoPagoRubro: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoPagoRubroActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoPagoRubro.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoPagoRubro.getSelectedRows().length;			
			}
			
			empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoPagoRubro--;			
				//EmpleadoPagoRubro empleadopagorubroAux= new EmpleadoPagoRubro();			
				//empleadopagorubroAux.setId(this.iIdNuevoEmpleadoPagoRubro);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoPagoRubro empleadopagorubroOrigen=new EmpleadoPagoRubro();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoPagoRubro empleadopagorubroOrigen : empleadopagorubrosSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadopagorubroOrigen =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadopagorubroOrigen =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoPagoRubro();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadopagorubro.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoPagoRubro(empleadopagorubroOrigen,this.empleadopagorubro,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadopagorubroLogic.getEmpleadoPagoRubros().add(this.empleadopagorubroAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadopagorubros.add(this.empleadopagorubroAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
				
				this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(this.getIndiceNuevoEmpleadoPagoRubro(), this.getIndiceNuevoEmpleadoPagoRubro());
				
				int iLastRow =  this.jTableDatosEmpleadoPagoRubro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoPagoRubro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoPagoRubro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();									
		
			EmpleadoPagoRubro empleadopagorubroOrigen=new EmpleadoPagoRubro();
			EmpleadoPagoRubro empleadopagorubroDestino=new EmpleadoPagoRubro();
				
			empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoPagoRubro.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadopagorubrosSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoPagoRubro.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroOrigen =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadopagorubroOrigen =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadopagorubroDestino =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadopagorubroDestino =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadopagorubroOrigen =empleadopagorubrosSeleccionados.get(0);
				empleadopagorubroDestino =empleadopagorubrosSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoPagoRubro(empleadopagorubroOrigen,empleadopagorubroDestino,true,false);
				
				empleadopagorubroDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadopagorubroDestino,empleadopagorubroLogic.getEmpleadoPagoRubros());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadopagorubroDestino,empleadopagorubros);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
				
				//this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(this.getIndiceNuevoEmpleadoPagoRubro(), this.getIndiceNuevoEmpleadoPagoRubro());
				
				int iLastRow =  this.jTableDatosEmpleadoPagoRubro.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoPagoRubro.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoPagoRubro.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoPagoRubro.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoPagoRubro.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoPagoRubro.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoPagoRubro.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoPagoRubro();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoPagoRubro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoPagoRubro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoPagoRubro();
			
			this.abrirFrameOrderByEmpleadoPagoRubro();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoPagoRubro();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoPagoRubro(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoPagoRubro);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoPagoRubro.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoPagoRubro.setSize(this.jInternalFrameDetalleFormEmpleadoPagoRubro.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoPagoRubro.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoPagoRubro.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoPagoRubro.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoPagoRubro.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoPagoRubro.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jContentPaneDetalleEmpleadoPagoRubro.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTabbedPaneRelacionesEmpleadoPagoRubro.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jContentPaneDetalleEmpleadoPagoRubro.getWidth(),EmpleadoPagoRubroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTabbedPaneRelacionesEmpleadoPagoRubro.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jContentPaneDetalleEmpleadoPagoRubro.getWidth(),EmpleadoPagoRubroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTabbedPaneRelacionesEmpleadoPagoRubro.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jContentPaneDetalleEmpleadoPagoRubro.getWidth(),EmpleadoPagoRubroConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoPagoRubro.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoPagoRubro.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoPagoRubro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoPagoRubro==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoPagoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoPagoRubro,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoPagoRubro=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoPagoRubro,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoPagoRubro);
				this.jInternalFrameOrderByEmpleadoPagoRubro.setVisible(false);
				this.jInternalFrameOrderByEmpleadoPagoRubro.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoPagoRubro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoPagoRubro"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoPagoRubro();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoPagoRubro() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoPagoRubro==null) {
				
				this.jInternalFrameImportacionEmpleadoPagoRubro=new ImportacionJInternalFrame(EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoPagoRubro);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoPagoRubro);
				this.jInternalFrameImportacionEmpleadoPagoRubro.setVisible(false);
				this.jInternalFrameImportacionEmpleadoPagoRubro.setSelected(false);


				this.jInternalFrameImportacionEmpleadoPagoRubro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoPagoRubro"));
				this.jInternalFrameImportacionEmpleadoPagoRubro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoPagoRubro"));
				this.jInternalFrameImportacionEmpleadoPagoRubro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoPagoRubro"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoPagoRubro() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro==null) {
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro=new ReporteDinamicoJInternalFrame(EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoPagoRubro);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro);
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoPagoRubro"));
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoPagoRubro"));
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoPagoRubro"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoPagoRubro();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoPagoRubro() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoPagoRubro);
			
	       	this.jInternalFrameDetalleFormEmpleadoPagoRubro.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoPagoRubro.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoPagoRubro.dispose();
			//this.jInternalFrameDetalleFormEmpleadoPagoRubro=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoPagoRubro() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoPagoRubro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoPagoRubro.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoPagoRubro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoPagoRubro() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoPagoRubro.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoPagoRubro.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoPagoRubro() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoPagoRubro.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoPagoRubro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoPagoRubro() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoPagoRubro() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoPagoRubro.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoPagoRubro.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderEmpleadoPagoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoPagoRubro.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderEmpleadoPagoRubro.getTitle() + " -> Estructura");


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
	
	public void jButtonModificarEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoPagoRubro(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoPagoRubro(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoPagoRubro(true);
			//this.isEsNuevoEmpleadoPagoRubro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoPagoRubro(false) ;
			
			if(empleadopagorubroSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoPagoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoPagoRubro(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoPagoRubro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoPagoRubroActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoPagoRubro(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoPagoRubro(true);
			//this.isEsNuevoEmpleadoPagoRubro=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadopagorubro.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoPagoRubro(false) ;
			
			if(EmpleadoPagoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoPagoRubro(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoPagoRubro(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaRubroEmplea(List<RubroEmplea> rubroempleasForeignKey)throws Exception{
		TableColumn tableColumnRubroEmplea=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA));
		TableCellEditor tableCellEditorRubroEmplea =tableColumnRubroEmplea.getCellEditor();

		RubroEmpleaTableCell rubroempleaTableCellFk=(RubroEmpleaTableCell)tableCellEditorRubroEmplea;

		if(rubroempleaTableCellFk!=null) {
			rubroempleaTableCellFk.setrubroempleasForeignKey(rubroempleasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

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
		TableColumn tableColumnAnio=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoPagoRubro(false);
			
			//if(!this.isEsNuevoEmpleadoPagoRubro) {								
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				
			}
			
			if(this.permiteMantenimiento(this.empleadopagorubro)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoPagoRubro=true;
					this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
					this.isEsNuevoEmpleadoPagoRubro=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoPagoRubro=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoPagoRubro=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoPagoRubro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoPagoRubro(false);
				
				this.habilitarDeshabilitarControlesEmpleadoPagoRubro(false);
			
												
				
				if(EmpleadoPagoRubroJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoPagoRubro();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,empleadopagorubroSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoPagoRubro(this.empleadopagorubro,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadopagorubroSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadopagorubro.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				this.empleadopagorubro.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				this.empleadopagorubro.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadopagorubro)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoPagoRubroModel) this.jTableDatosEmpleadoPagoRubro.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoPagoRubro=true;
				this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
				this.isEsNuevoEmpleadoPagoRubro=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoPagoRubro(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoPagoRubro(false);
				
				this.habilitarDeshabilitarControlesEmpleadoPagoRubro(false);
				
				
				
				if(EmpleadoPagoRubroJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoPagoRubro();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoPagoRubro.getRowCount()>=1) {
				jTableDatosEmpleadoPagoRubro.removeRowSelectionInterval(0, jTableDatosEmpleadoPagoRubro.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoPagoRubro(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoPagoRubro(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoPagoRubro(false) ;
			
			this.isEsNuevoEmpleadoPagoRubro=false;
			
			if(EmpleadoPagoRubroJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoPagoRubro();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				
				//SI ES MANUAL
				if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoPagoRubro();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoPagoRubro--;			
			//EmpleadoPagoRubro empleadopagorubroAux= new EmpleadoPagoRubro();			
			//empleadopagorubroAux.setId(this.iIdNuevoEmpleadoPagoRubro);
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoPagoRubro();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
			
			this.empleadopagorubro.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadopagorubroLogic.getEmpleadoPagoRubros().add(this.empleadopagorubroAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadopagorubros.add(this.empleadopagorubroAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
			
			this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(this.getIndiceNuevoEmpleadoPagoRubro(), this.getIndiceNuevoEmpleadoPagoRubro());
			
			int iLastRow =  this.jTableDatosEmpleadoPagoRubro.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoPagoRubro.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoPagoRubro.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoPagoRubro(false);
			
			//SI ES MANUAL
			if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoPagoRubro();
			}
			
			//this.abrirFrameTreeEmpleadoPagoRubro();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado Pago RubroS ?", "MANTENIMIENTO DE Empleado Pago Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoPagoRubro.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoPagoRubro();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadopagorubroReturnGeneral=empleadopagorubroLogic.procesarImportacionEmpleadoPagoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadopagorubroParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoPagoRubroReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoPagoRubro.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoPagoRubro.setFileImportacion(this.jInternalFrameImportacionEmpleadoPagoRubro.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoPagoRubro.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoPagoRubro.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoPagoRubro.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoPagoRubro.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();		

		empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoPagoRubroBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoPagoRubroBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpleadoPagoRubros("Todos",empleadopagorubrosSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Pago Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_RubroEmplea_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_RubroEmplea_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_RubroEmplea_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_RubroEmplea_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION:
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
		
		if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoria="id_rubro_emplea";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO:
					sNombreCampoCategoria="valor_pago";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION:
					sNombreCampoCategoria="fecha_liquidacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA:
					sNombreCampoCategoriaValor="id_rubro_emplea";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO:
					sNombreCampoCategoriaValor="valor_pago";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION:
					sNombreCampoCategoriaValor="fecha_liquidacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Rubro Emplea",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_rubro_emplea");
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_pago");
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION:
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();		
		
		empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadopagorubro";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpleadoPagoRubros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadopagorubro.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadopagorubro.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadopagorubro.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA);
					iRow++;

					for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadopagorubro.getrubroemplea_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadopagorubro.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadopagorubro.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO);
					iRow++;

					for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadopagorubro.getvalor_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadopagorubro.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION);
					iRow++;

					for(EmpleadoPagoRubro empleadopagorubro:empleadopagorubrosSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadopagorubro.getfecha_liquidacion());
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
			//	this.getFilaCabeceraExportarExcelEmpleadoPagoRubro(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubrosSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoPagoRubro(empleadopagorubroAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Pago Rubro",JOptionPane.INFORMATION_MESSAGE);
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
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoPagoRubro(false);
			
			//SI ES MANUAL
			if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoPagoRubro();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoPagoRubro(false);
			
			//SI ES MANUAL
			if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoPagoRubro();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoPagoRubro(false);
			
			//SI ES MANUAL
			if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoPagoRubro();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoPagoRubro() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoPagoRubro.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoPagoRubro.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoPagoRubro.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoPagoRubro.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoPagoRubro.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoPagoRubro.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoPagoRubro.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoPagoRubro(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoPagoRubro(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoPagoRubro(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoPagoRubro(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoPagoRubro(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoPagoRubro(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoPagoRubro(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoPagoRubro(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoPagoRubro() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoPagoRubro();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoPagoRubro(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoPagoRubro();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoPagoRubro() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoPagoRubro(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoPagoRubro(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoPagoRubro.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoPagoRubro.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jCheckBoxPostAccionNuevoEmpleadoPagoRubro.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jCheckBoxPostAccionSinCerrarEmpleadoPagoRubro.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jCheckBoxPostAccionSinMensajeEmpleadoPagoRubro.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoPagoRubro.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoPagoRubro.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jCheckBoxPostAccionNuevoEmpleadoPagoRubro.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jCheckBoxPostAccionSinCerrarEmpleadoPagoRubro.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jCheckBoxPostAccionSinMensajeEmpleadoPagoRubro.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoPagoRubro.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoPagoRubro.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoPagoRubro.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoPagoRubro.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoPagoRubro.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoPagoRubro.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoPagoRubro(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoPagoRubro(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoPagoRubro() throws Exception {
		try	{
			if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoPagoRubro();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoPagoRubro() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoPagoRubro() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoPagoRubro.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoPagoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoPagoRubro.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoPagoRubro.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoPagoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoPagoRubro.addItem(reporte);
			}
			
			
			if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoPagoRubro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoPagoRubro.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoPagoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoPagoRubro.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoPagoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoPagoRubro.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoPagoRubro();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoPagoRubro() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EmpleadoPagoRubroConstantesFunciones.getTiposSeleccionarEmpleadoPagoRubro(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EmpleadoPagoRubroConstantesFunciones.getTiposSeleccionarEmpleadoPagoRubro(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EmpleadoPagoRubroConstantesFunciones.getTiposSeleccionarEmpleadoPagoRubro(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoPagoRubro()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioEmpleadoPagoRubro.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoPagoRubro.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoPagoRubro.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesEmpleadoPagoRubro.getSelectedItem()).getId();}
		if(this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.getSelectedItem()!=null){this.id_rubro_empleaFK_IdRubroEmplea=((RubroEmplea)this.jComboBoxid_rubro_empleaFK_IdRubroEmpleaEmpleadoPagoRubro.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoPagoRubro(Boolean esInicializar) throws Exception {				
		if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoPagoRubro();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoPagoRubro() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoPagoRubro() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoPagoRubroOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubroOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoPagoRubro(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadopagorubroLogic.getEmpleadoPagoRubros().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadopagorubros.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoPagoRubro.setModel(new EmpleadoPagoRubroModel(this.empleadopagorubroLogic.getEmpleadoPagoRubros(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoPagoRubro.setModel(new EmpleadoPagoRubroModel(this.empleadopagorubros,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoPagoRubro!=null && this.jInternalFrameOrderByEmpleadoPagoRubro.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoPagoRubro();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO,empleadopagorubroConstantesFunciones.resaltarSeleccionarEmpleadoPagoRubro,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoPagoRubroConstantesFunciones.SCLASSWEBTITULO,empleadopagorubroConstantesFunciones.resaltarSeleccionarEmpleadoPagoRubro,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_ID));

		if(this.empleadopagorubroConstantesFunciones.mostraridEmpleadoPagoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoPagoRubroConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadopagorubroConstantesFunciones.resaltaridEmpleadoPagoRubro,this.empleadopagorubroConstantesFunciones.activaridEmpleadoPagoRubro,iSizeTabla,this,true,"idEmpleadoPagoRubro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadopagorubroConstantesFunciones.resaltaridEmpleadoPagoRubro,this.empleadopagorubroConstantesFunciones.activaridEmpleadoPagoRubro,this,true,"idEmpleadoPagoRubro","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadopagorubroConstantesFunciones.mostrarid_empresaEmpleadoPagoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_empresaEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_empresaEmpleadoPagoRubro,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_empresaEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_empresaEmpleadoPagoRubro,false,"id_empresaEmpleadoPagoRubro","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadopagorubroConstantesFunciones.mostrarid_empleadoEmpleadoPagoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_empleadoEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_empleadoEmpleadoPagoRubro,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_empleadoEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_empleadoEmpleadoPagoRubro,true,"id_empleadoEmpleadoPagoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.empleadopagorubroConstantesFunciones.mostrarid_estructuraEmpleadoPagoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_estructuraEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_estructuraEmpleadoPagoRubro,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_estructuraEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_estructuraEmpleadoPagoRubro,true,"id_estructuraEmpleadoPagoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA));

		if(this.empleadopagorubroConstantesFunciones.mostrarid_rubro_empleaEmpleadoPagoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_rubro_empleaEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_rubro_empleaEmpleadoPagoRubro,iSizeTabla));
			tableColumn.setCellEditor(new RubroEmpleaTableCell(this.rubroempleasForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_rubro_empleaEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_rubro_empleaEmpleadoPagoRubro,true,"id_rubro_empleaEmpleadoPagoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO));

		if(this.empleadopagorubroConstantesFunciones.mostrarid_anioEmpleadoPagoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_anioEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_anioEmpleadoPagoRubro,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_anioEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_anioEmpleadoPagoRubro,true,"id_anioEmpleadoPagoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES));

		if(this.empleadopagorubroConstantesFunciones.mostrarid_mesEmpleadoPagoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_mesEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_mesEmpleadoPagoRubro,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.empleadopagorubroConstantesFunciones.resaltarid_mesEmpleadoPagoRubro,this,this.empleadopagorubroConstantesFunciones.activarid_mesEmpleadoPagoRubro,true,"id_mesEmpleadoPagoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO));

		if(this.empleadopagorubroConstantesFunciones.mostrarvalor_pagoEmpleadoPagoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadopagorubroConstantesFunciones.resaltarvalor_pagoEmpleadoPagoRubro,this.empleadopagorubroConstantesFunciones.activarvalor_pagoEmpleadoPagoRubro,iSizeTabla,this,true,"valor_pagoEmpleadoPagoRubro","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadopagorubroConstantesFunciones.resaltarvalor_pagoEmpleadoPagoRubro,this.empleadopagorubroConstantesFunciones.activarvalor_pagoEmpleadoPagoRubro,this,true,"valor_pagoEmpleadoPagoRubro","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA));

		if(this.empleadopagorubroConstantesFunciones.mostrarfechaEmpleadoPagoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.empleadopagorubroConstantesFunciones.resaltarfechaEmpleadoPagoRubro,this.empleadopagorubroConstantesFunciones.activarfechaEmpleadoPagoRubro,iSizeTabla,this,true,"fechaEmpleadoPagoRubro","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.empleadopagorubroConstantesFunciones.resaltarfechaEmpleadoPagoRubro,this.empleadopagorubroConstantesFunciones.activarfechaEmpleadoPagoRubro,this,true,"fechaEmpleadoPagoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION));

		if(this.empleadopagorubroConstantesFunciones.mostrarfecha_liquidacionEmpleadoPagoRubro && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.empleadopagorubroConstantesFunciones.resaltarfecha_liquidacionEmpleadoPagoRubro,this.empleadopagorubroConstantesFunciones.activarfecha_liquidacionEmpleadoPagoRubro,iSizeTabla,this,true,"fecha_liquidacionEmpleadoPagoRubro","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.empleadopagorubroConstantesFunciones.resaltarfecha_liquidacionEmpleadoPagoRubro,this.empleadopagorubroConstantesFunciones.activarfecha_liquidacionEmpleadoPagoRubro,this,true,"fecha_liquidacionEmpleadoPagoRubro","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EmpleadoPagoRubroPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadopagorubroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadopagorubroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoPagoRubro.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadopagorubroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadopagorubroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoPagoRubro.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadopagorubroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadopagorubroSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoPagoRubro.addColumn(tableColumn);
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
			
			this.jTableDatosEmpleadoPagoRubro.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoPagoRubro.moveColumn(this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoPagoRubro.moveColumn(this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoPagoRubro.moveColumn(this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoPagoRubro.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoPagoRubro.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoPagoRubro,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoPagoRubro.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoPagoRubro.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoPagoRubro.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empleadopagorubroLogic.getEmpleadoPagoRubros().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadopagorubros.size()-1;
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
		//this.jTableDatosEmpleadoPagoRubro.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoPagoRubro.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoPagoRubro();
			
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
				
				//this.isEsNuevoEmpleadoPagoRubro=false;
					
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
				if(this.empleadopagorubroSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoPagoRubro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoPagoRubro.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadopagorubro.getsType().equals("DUPLICADO")
				   || this.empleadopagorubro.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoPagoRubro=true;
				
				} else {
					this.isEsNuevoEmpleadoPagoRubro=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
					if(this.empleadopagorubro.getId()>=0 && !this.empleadopagorubro.getIsNew()) {						
						this.isEsNuevoEmpleadoPagoRubro=false;
						
					} else {
						this.isEsNuevoEmpleadoPagoRubro=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoPagoRubro(esRelaciones);						
				
				this.seleccionarEmpleadoPagoRubro(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadopagorubro.getId()<0) {
					this.isEsNuevoEmpleadoPagoRubro=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoPagoRubro(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoPagoRubro(evt,rowIndex);
				}	
				
				if(this.empleadopagorubroSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoPagoRubro: " + this.dDif); 
					}
				}								
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoPagoRubro(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadopagorubro)) {
					if(this.empleadopagorubro.getId()>0) {
						this.empleadopagorubro.setIsDeleted(true);
						
						this.empleadopagorubrosEliminados.add(this.empleadopagorubro);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadopagorubroLogic.getEmpleadoPagoRubros().remove(this.empleadopagorubro);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadopagorubros.remove(this.empleadopagorubro);				
					}
					
					
					((EmpleadoPagoRubroModel) this.jTableDatosEmpleadoPagoRubro.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoPagoRubro(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoPagoRubro) {
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoPagoRubro.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoPagoRubro.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoPagoRubro(this.empleadopagorubro);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadopagorubroConstantesFunciones.cargarid_empresaEmpleadoPagoRubro || this.empleadopagorubroConstantesFunciones.event_dependid_empresaEmpleadoPagoRubro) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadopagorubro.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadopagorubro.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadopagorubro.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadopagorubro.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.empleadopagorubroConstantesFunciones.cargarid_empleadoEmpleadoPagoRubro || this.empleadopagorubroConstantesFunciones.event_dependid_empleadoEmpleadoPagoRubro) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadopagorubro.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadopagorubro.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadopagorubro.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadopagorubro.getid_empleado(),false,"Formulario");

					//Estructura
					if(!this.empleadopagorubroConstantesFunciones.cargarid_estructuraEmpleadoPagoRubro || this.empleadopagorubroConstantesFunciones.event_dependid_estructuraEmpleadoPagoRubro) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.empleadopagorubro.getid_estructura());
									//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(empleadopagorubro.getEstructura()!=null) {
							this.estructurasForeignKey.add(empleadopagorubro.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.empleadopagorubro.getid_estructura(),false,"Formulario");

					//RubroEmplea
					if(!this.empleadopagorubroConstantesFunciones.cargarid_rubro_empleaEmpleadoPagoRubro || this.empleadopagorubroConstantesFunciones.event_dependid_rubro_empleaEmpleadoPagoRubro) {
						//this.cargarCombosRubroEmpleasForeignKeyLista(" where id="+this.empleadopagorubro.getid_rubro_emplea());
									//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
						this.rubroempleasForeignKey=new ArrayList<RubroEmplea>();

						if(empleadopagorubro.getRubroEmplea()!=null) {
							this.rubroempleasForeignKey.add(empleadopagorubro.getRubroEmplea());
						}

						this.addItemDefectoCombosForeignKeyRubroEmplea();
						this.cargarCombosFrameRubroEmpleasForeignKey("Todos");
					}
					this.setActualRubroEmpleaForeignKey(this.empleadopagorubro.getid_rubro_emplea(),false,"Formulario");

					//Anio
					if(!this.empleadopagorubroConstantesFunciones.cargarid_anioEmpleadoPagoRubro || this.empleadopagorubroConstantesFunciones.event_dependid_anioEmpleadoPagoRubro) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.empleadopagorubro.getid_anio());
									//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(empleadopagorubro.getAnio()!=null) {
							this.aniosForeignKey.add(empleadopagorubro.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.empleadopagorubro.getid_anio(),false,"Formulario");

					//Mes
					if(!this.empleadopagorubroConstantesFunciones.cargarid_mesEmpleadoPagoRubro || this.empleadopagorubroConstantesFunciones.event_dependid_mesEmpleadoPagoRubro) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.empleadopagorubro.getid_mes());
									//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(empleadopagorubro.getMes()!=null) {
							this.messForeignKey.add(empleadopagorubro.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.empleadopagorubro.getid_mes(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoPagoRubro("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoPagoRubro(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoPagoRubro() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoPagoRubro(empleadopagorubro,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoPagoRubro(empleadopagorubro);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoPagoRubro(empleadopagorubro,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoPagoRubro(empleadopagorubro);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.setText(empleadopagorubro.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTextFieldvalor_pagoEmpleadoPagoRubro.setText(empleadopagorubro.getvalor_pago().toString());
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfechaEmpleadoPagoRubro.setDate(empleadopagorubro.getfecha());
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfecha_liquidacionEmpleadoPagoRubro.setDate(empleadopagorubro.getfecha_liquidacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoPagoRubro empleadopagorubroLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadopagorubroLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoPagoRubro empleadopagorubroLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadopagorubroLocal=this.empleadopagorubro;
			} else {
				empleadopagorubroLocal=this.empleadopagorubroAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadopagorubroLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoPagoRubro(empleadopagorubroLocal,true);
					
					if(empleadopagorubroSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadopagorubroLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadopagorubroLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(empleadopagorubro,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(empleadopagorubro);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(empleadopagorubro,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.getText()==null || this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.getText()=="" || this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.setText("0");
			}

			if(conColumnasBase) {empleadopagorubro.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoPagoRubroConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelIdEmpleadoPagoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadopagorubro.setvalor_pago(Double.parseDouble(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTextFieldvalor_pagoEmpleadoPagoRubro.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelvalor_pagoEmpleadoPagoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadopagorubro.setfecha(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfechaEmpleadoPagoRubro.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelfechaEmpleadoPagoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadopagorubro.setfecha_liquidacion(this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfecha_liquidacionEmpleadoPagoRubro.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelfecha_liquidacionEmpleadoPagoRubro,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubroBean,EmpleadoPagoRubro empleadopagorubro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubroOrigen,EmpleadoPagoRubro empleadopagorubro,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadopagorubroOrigen.getId()!=null && !empleadopagorubroOrigen.getId().equals(0L))) {empleadopagorubro.setId(empleadopagorubroOrigen.getId());}}
			if(conDefault || (!conDefault && empleadopagorubroOrigen.getvalor_pago()!=null && !empleadopagorubroOrigen.getvalor_pago().equals(0.0))) {empleadopagorubro.setvalor_pago(empleadopagorubroOrigen.getvalor_pago());}
			if(conDefault || (!conDefault && empleadopagorubroOrigen.getfecha()!=null && !empleadopagorubroOrigen.getfecha().equals(new Date()))) {empleadopagorubro.setfecha(empleadopagorubroOrigen.getfecha());}
			if(conDefault || (!conDefault && empleadopagorubroOrigen.getfecha_liquidacion()!=null && !empleadopagorubroOrigen.getfecha_liquidacion().equals(new Date()))) {empleadopagorubro.setfecha_liquidacion(empleadopagorubroOrigen.getfecha_liquidacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.setText(empleadopagorubro.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTextFieldvalor_pagoEmpleadoPagoRubro.setText(empleadopagorubro.getvalor_pago().toString());
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfechaEmpleadoPagoRubro.setDate(empleadopagorubro.getfecha());
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfecha_liquidacionEmpleadoPagoRubro.setDate(empleadopagorubro.getfecha_liquidacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoPagoRubro(EmpleadoPagoRubroBean empleadopagorubroBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.setText(empleadopagorubroBean.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTextFieldvalor_pagoEmpleadoPagoRubro.setText(empleadopagorubroBean.getvalor_pago().toString());
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfechaEmpleadoPagoRubro.setDate(empleadopagorubroBean.getfecha());
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfecha_liquidacionEmpleadoPagoRubro.setDate(empleadopagorubroBean.getfecha_liquidacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoPagoRubro(EmpleadoPagoRubroParameterReturnGeneral empleadopagorubroReturnGeneral,EmpleadoPagoRubroBean empleadopagorubroBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoPagoRubro empleadopagorubroLocal=new EmpleadoPagoRubro();
			
			empleadopagorubroLocal=empleadopagorubroReturnGeneral.getEmpleadoPagoRubro();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadopagorubroLocal.getId()!=null && !empleadopagorubroLocal.getId().equals(0L))) {empleadopagorubroBean.setId(empleadopagorubroLocal.getId());}}
			if(conDefault || (!conDefault && empleadopagorubroLocal.getvalor_pago()!=null && !empleadopagorubroLocal.getvalor_pago().equals(0.0))) {empleadopagorubroBean.setvalor_pago(empleadopagorubroLocal.getvalor_pago());}
			if(conDefault || (!conDefault && empleadopagorubroLocal.getfecha()!=null && !empleadopagorubroLocal.getfecha().equals(new Date()))) {empleadopagorubroBean.setfecha(empleadopagorubroLocal.getfecha());}
			if(conDefault || (!conDefault && empleadopagorubroLocal.getfecha_liquidacion()!=null && !empleadopagorubroLocal.getfecha_liquidacion().equals(new Date()))) {empleadopagorubroBean.setfecha_liquidacion(empleadopagorubroLocal.getfecha_liquidacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoPagoRubroGenerico(Long idEmpleadoPagoRubroSeleccionado,JComboBox jComboBoxEmpleadoPagoRubro,List<EmpleadoPagoRubro> empleadopagorubrosLocal)throws Exception {
		try {
			EmpleadoPagoRubro  empleadopagorubroTemp=null;

			for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubrosLocal) {
				if(empleadopagorubroAux.getId()!=null && empleadopagorubroAux.getId().equals(idEmpleadoPagoRubroSeleccionado)) {
					empleadopagorubroTemp=empleadopagorubroAux;
					break;
				}
			}

			jComboBoxEmpleadoPagoRubro.setSelectedItem(empleadopagorubroTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoPagoRubroGenerico(JComboBox jComboBoxEmpleadoPagoRubro,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoPagoRubro.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoPagoRubro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoPagoRubro.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoPagoRubro.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoPagoRubro.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoPagoRubro.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadopagorubro=(EmpleadoPagoRubro) empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadopagorubro =(EmpleadoPagoRubro) empleadopagorubros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadopagorubro.getIsNew() && !empleadopagorubro.getIsChanged() && !empleadopagorubro.getIsDeleted()) {
				sDescripcion=empleadopagorubro.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadopagorubro.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadopagorubro.getIsNew() && !empleadopagorubro.getIsChanged() && !empleadopagorubro.getIsDeleted()) {
				sDescripcion=empleadopagorubro.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadopagorubro.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!empleadopagorubro.getIsNew() && !empleadopagorubro.getIsChanged() && !empleadopagorubro.getIsDeleted()) {
				sDescripcion=empleadopagorubro.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=empleadopagorubro.getestructura_descripcion();
			}
		}

		if(sTipo.equals("RubroEmplea")) {
			//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
			if(!empleadopagorubro.getIsNew() && !empleadopagorubro.getIsChanged() && !empleadopagorubro.getIsDeleted()) {
				sDescripcion=empleadopagorubro.getrubroemplea_descripcion();
			} else {
				//sDescripcion=this.getActualRubroEmpleaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadopagorubro.getrubroemplea_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!empleadopagorubro.getIsNew() && !empleadopagorubro.getIsChanged() && !empleadopagorubro.getIsDeleted()) {
				sDescripcion=empleadopagorubro.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=empleadopagorubro.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!empleadopagorubro.getIsNew() && !empleadopagorubro.getIsChanged() && !empleadopagorubro.getIsDeleted()) {
				sDescripcion=empleadopagorubro.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=empleadopagorubro.getmes_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoPagoRubro empleadopagorubroRow=new EmpleadoPagoRubro();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadopagorubroRow=(EmpleadoPagoRubro) empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadopagorubroRow=(EmpleadoPagoRubro) empleadopagorubros.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoPagoRubro(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoPagoRubro && this.isPermisoNuevoEmpleadoPagoRubro));			
			this.jButtonDuplicarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoPagoRubro && this.isPermisoDuplicarEmpleadoPagoRubro));			
			this.jButtonCopiarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaCopiarEmpleadoPagoRubro && this.isPermisoCopiarEmpleadoPagoRubro));
			this.jButtonVerFormEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaVerFormEmpleadoPagoRubro && this.isPermisoVerFormEmpleadoPagoRubro));
			
			this.jButtonAbrirOrderByEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoPagoRubro && this.isPermisoOrdenEmpleadoPagoRubro));			
			
			this.jButtonNuevoRelacionesEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro && this.isPermisoNuevoEmpleadoPagoRubro));			
			this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoPagoRubro && this.isPermisoNuevoEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro));
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonModificarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaModificarEmpleadoPagoRubro && this.isPermisoActualizarEmpleadoPagoRubro));	
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonActualizarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaActualizarEmpleadoPagoRubro && this.isPermisoActualizarEmpleadoPagoRubro));	
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonEliminarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaEliminarEmpleadoPagoRubro && this.isPermisoEliminarEmpleadoPagoRubro));
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonCancelarEmpleadoPagoRubro.setVisible(this.isVisibilidadCeldaCancelarEmpleadoPagoRubro);							
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaGuardarEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoPagoRubro && this.isPermisoNuevoEmpleadoPagoRubro));						
			this.jButtonDuplicarToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoPagoRubro && this.isPermisoDuplicarEmpleadoPagoRubro));						
			this.jButtonCopiarToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaCopiarEmpleadoPagoRubro && this.isPermisoCopiarEmpleadoPagoRubro));			
			this.jButtonVerFormToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaVerFormEmpleadoPagoRubro && this.isPermisoVerFormEmpleadoPagoRubro));			
			this.jButtonAbrirOrderByToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoPagoRubro && this.isPermisoOrdenEmpleadoPagoRubro));
			this.jButtonNuevoRelacionesToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro && this.isPermisoNuevoEmpleadoPagoRubro));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoPagoRubro && this.isPermisoNuevoEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro));			
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonModificarToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaModificarEmpleadoPagoRubro && this.isPermisoActualizarEmpleadoPagoRubro));	
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonActualizarToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaActualizarEmpleadoPagoRubro  && this.isPermisoActualizarEmpleadoPagoRubro));	
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonEliminarToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaEliminarEmpleadoPagoRubro && this.isPermisoEliminarEmpleadoPagoRubro));
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonCancelarToolBarEmpleadoPagoRubro.setVisible(this.isVisibilidadCeldaCancelarEmpleadoPagoRubro);				
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaGuardarEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoPagoRubro && this.isPermisoNuevoEmpleadoPagoRubro));			
			this.jMenuItemDuplicarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoPagoRubro && this.isPermisoDuplicarEmpleadoPagoRubro));			
			this.jMenuItemCopiarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaCopiarEmpleadoPagoRubro && this.isPermisoCopiarEmpleadoPagoRubro));			
			this.jMenuItemVerFormEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaVerFormEmpleadoPagoRubro && this.isPermisoVerFormEmpleadoPagoRubro));			
			this.jMenuItemAbrirOrderByEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoPagoRubro && this.isPermisoOrdenEmpleadoPagoRubro));			
			//this.jMenuItemMostrarOcultarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoPagoRubro && this.isPermisoOrdenEmpleadoPagoRubro));
			this.jMenuItemDetalleAbrirOrderByEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoPagoRubro && this.isPermisoOrdenEmpleadoPagoRubro));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaOrdenEmpleadoPagoRubro && this.isPermisoOrdenEmpleadoPagoRubro));			
			this.jMenuItemNuevoRelacionesEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro && this.isPermisoNuevoEmpleadoPagoRubro));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaNuevoEmpleadoPagoRubro && this.isPermisoNuevoEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro));									
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemModificarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaModificarEmpleadoPagoRubro && this.isPermisoActualizarEmpleadoPagoRubro));	
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemActualizarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaActualizarEmpleadoPagoRubro && this.isPermisoActualizarEmpleadoPagoRubro));	
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemEliminarEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaEliminarEmpleadoPagoRubro && this.isPermisoEliminarEmpleadoPagoRubro));
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemCancelarEmpleadoPagoRubro.setVisible(this.isVisibilidadCeldaCancelarEmpleadoPagoRubro);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaGuardarEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro));						
			this.jMenuItemGuardarCambiosTablaEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=this.jButtonNuevoEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoPagoRubro=this.jButtonDuplicarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoPagoRubro=this.jButtonCopiarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoPagoRubro=this.jButtonVerFormEmpleadoPagoRubro.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoPagoRubro=this.jButtonAbrirOrderByEmpleadoPagoRubro.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=this.jButtonNuevoRelacionesEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoPagoRubro=this.jButtonModificarEmpleadoPagoRubro.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonActualizarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonEliminarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonCancelarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosEmpleadoPagoRubro.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=this.jButtonNuevoToolBarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=this.jButtonNuevoRelacionesToolBarEmpleadoPagoRubro.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			this.isVisibilidadCeldaModificarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonModificarToolBarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonActualizarToolBarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonEliminarToolBarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonCancelarToolBarEmpleadoPagoRubro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=this.jButtonGuardarCambiosToolBarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=this.jButtonGuardarCambiosTablaToolBarEmpleadoPagoRubro.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=this.jMenuItemNuevoEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=this.jMenuItemNuevoRelacionesEmpleadoPagoRubro.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			this.isVisibilidadCeldaModificarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemModificarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemActualizarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemEliminarEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemCancelarEmpleadoPagoRubro.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=this.jMenuItemGuardarCambiosEmpleadoPagoRubro.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=this.jMenuItemGuardarCambiosTablaEmpleadoPagoRubro.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoPagoRubro(Boolean esInicializar) {
		if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadopagorubroSessionBean.getConGuardarRelaciones()) {
				//if(this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoPagoRubro();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoPagoRubro(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoPagoRubro() {
		this.jButtonNuevoEmpleadoPagoRubro.setVisible(this.isPermisoNuevoEmpleadoPagoRubro);			
		this.jButtonDuplicarEmpleadoPagoRubro.setVisible(this.isPermisoDuplicarEmpleadoPagoRubro);			
		this.jButtonCopiarEmpleadoPagoRubro.setVisible(this.isPermisoCopiarEmpleadoPagoRubro);			
		this.jButtonVerFormEmpleadoPagoRubro.setVisible(this.isPermisoVerFormEmpleadoPagoRubro);			
		
		this.jButtonAbrirOrderByEmpleadoPagoRubro.setVisible(this.isPermisoOrdenEmpleadoPagoRubro);					
		
		this.jButtonNuevoRelacionesEmpleadoPagoRubro.setVisible(this.isPermisoNuevoEmpleadoPagoRubro);			
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonModificarEmpleadoPagoRubro.setVisible(this.isPermisoActualizarEmpleadoPagoRubro);	
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonActualizarEmpleadoPagoRubro.setVisible(this.isPermisoActualizarEmpleadoPagoRubro);	
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonEliminarEmpleadoPagoRubro.setVisible(this.isPermisoEliminarEmpleadoPagoRubro);
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonCancelarEmpleadoPagoRubro.setVisible(this.isVisibilidadCeldaCancelarEmpleadoPagoRubro);						
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosEmpleadoPagoRubro.setVisible(this.isPermisoGuardarCambiosEmpleadoPagoRubro);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.setVisible(this.isPermisoActualizarEmpleadoPagoRubro);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoPagoRubro() {
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonModificarEmpleadoPagoRubro.setVisible(this.isPermisoActualizarEmpleadoPagoRubro);	
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonActualizarEmpleadoPagoRubro.setVisible(this.isPermisoActualizarEmpleadoPagoRubro);	
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonEliminarEmpleadoPagoRubro.setVisible(this.isPermisoEliminarEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonCancelarEmpleadoPagoRubro.setVisible(this.isVisibilidadCeldaCancelarEmpleadoPagoRubro);							
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosEmpleadoPagoRubro.setVisible((this.isVisibilidadCeldaGuardarEmpleadoPagoRubro && this.isPermisoGuardarCambiosEmpleadoPagoRubro));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoPagoRubro() {
		if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoPagoRubro();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoPagoRubro() {
	}
	
	public void jTableDatosEmpleadoPagoRubroListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoPagoRubro(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoPagoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadopagorubro==null) {
						this.empleadopagorubro = new EmpleadoPagoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				}

				if(this.empleadopagorubro.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadopagorubro.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoPagoRubroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoPagoRubro(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoPagoRubro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadopagorubroLogic.getConnexion());

				if(this.empleadopagorubro.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadopagorubro.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoPagoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoPagoRubro.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoPagoRubro.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoPagoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadopagorubro==null) {
						this.empleadopagorubro = new EmpleadoPagoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				}

				if(this.empleadopagorubro.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadopagorubro.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoPagoRubroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoPagoRubro(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoPagoRubro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadopagorubroLogic.getConnexion());

				if(this.empleadopagorubro.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadopagorubro.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoPagoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoPagoRubro.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoPagoRubro.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoPagoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadopagorubro==null) {
						this.empleadopagorubro = new EmpleadoPagoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				}

				if(this.empleadopagorubro.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadopagorubro.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraEmpleadoPagoRubroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebEmpleadoPagoRubro(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoPagoRubro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.empleadopagorubroLogic.getConnexion());

				if(this.empleadopagorubro.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.empleadopagorubro.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoPagoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoPagoRubro.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderEmpleadoPagoRubro.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraEmpleadoPagoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadopagorubro==null) {
						this.empleadopagorubro = new EmpleadoPagoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				}

				if(this.empleadopagorubro.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.empleadopagorubro.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_rubro_empleaEmpleadoPagoRubroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisorubroemplea=true;

			idTienePermisorubroemplea=this.tienePermisosUsuarioEnPaginaWebEmpleadoPagoRubro(RubroEmpleaConstantesFunciones.CLASSNAME);

			if(idTienePermisorubroemplea) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoPagoRubro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);

				this.rubroempleaBeanSwingJInternalFrame=new RubroEmpleaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.rubroempleaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.rubroempleaBeanSwingJInternalFrame.getRubroEmpleaLogic().setConnexion(this.empleadopagorubroLogic.getConnexion());

				if(this.empleadopagorubro.getid_rubro_emplea()!=null) {
					this.rubroempleaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.rubroempleaBeanSwingJInternalFrame.setIdActual(this.empleadopagorubro.getid_rubro_emplea());
					this.rubroempleaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.rubroempleaBeanSwingJInternalFrame.inicializarActualizarBindingTablaRubroEmplea();
				}

				JInternalFrameBase jinternalFrame =this.rubroempleaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoPagoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoPagoRubro.getBorder();
				TitledBorder titledBorderrubroemplea=(TitledBorder)this.rubroempleaBeanSwingJInternalFrame.jScrollPanelDatosRubroEmplea.getBorder();

				titledBorderrubroemplea.setTitle(titledBorderEmpleadoPagoRubro.getTitle() + " -> Rubro Emplea");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_rubro_empleaEmpleadoPagoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadopagorubro==null) {
						this.empleadopagorubro = new EmpleadoPagoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				}

				if(this.empleadopagorubro.getid_rubro_emplea()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_rubro_emplea = "+this.empleadopagorubro.getid_rubro_emplea().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioEmpleadoPagoRubroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebEmpleadoPagoRubro(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoPagoRubro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.empleadopagorubroLogic.getConnexion());

				if(this.empleadopagorubro.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.empleadopagorubro.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoPagoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoPagoRubro.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderEmpleadoPagoRubro.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioEmpleadoPagoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadopagorubro==null) {
						this.empleadopagorubro = new EmpleadoPagoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				}

				if(this.empleadopagorubro.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.empleadopagorubro.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesEmpleadoPagoRubroUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebEmpleadoPagoRubro(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoPagoRubro.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoPagoRubro.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.empleadopagorubroLogic.getConnexion());

				if(this.empleadopagorubro.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.empleadopagorubro.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoPagoRubro=(TitledBorder)this.jScrollPanelDatosEmpleadoPagoRubro.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderEmpleadoPagoRubro.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesEmpleadoPagoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadopagorubro==null) {
						this.empleadopagorubro = new EmpleadoPagoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				}

				if(this.empleadopagorubro.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.empleadopagorubro.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_pagoEmpleadoPagoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadopagorubro==null) {
						this.empleadopagorubro = new EmpleadoPagoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				}

				if(this.empleadopagorubro.getvalor_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_pago = "+this.empleadopagorubro.getvalor_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaEmpleadoPagoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadopagorubro==null) {
						this.empleadopagorubro = new EmpleadoPagoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				}

				if(this.empleadopagorubro.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.empleadopagorubro.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_liquidacionEmpleadoPagoRubroBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.getempleadopagorubro(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadopagorubro==null) {
						this.empleadopagorubro = new EmpleadoPagoRubro();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);
				}

				if(this.empleadopagorubro.getfecha_liquidacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_liquidacion = '"+Funciones2.getStringPostgresDate(this.empleadopagorubro.getfecha_liquidacion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoPagoRubro(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);

			this.getEmpleadoPagoRubrosFK_IdAnio();

			this.inicializarActualizarBindingEmpleadoPagoRubro(false);

			//if(EmpleadoPagoRubroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);

			this.getEmpleadoPagoRubrosFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoPagoRubro(false);

			//if(EmpleadoPagoRubroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);

			this.getEmpleadoPagoRubrosFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoPagoRubro(false);

			//if(EmpleadoPagoRubroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);

			this.getEmpleadoPagoRubrosFK_IdEstructura();

			this.inicializarActualizarBindingEmpleadoPagoRubro(false);

			//if(EmpleadoPagoRubroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);

			this.getEmpleadoPagoRubrosFK_IdMes();

			this.inicializarActualizarBindingEmpleadoPagoRubro(false);

			//if(EmpleadoPagoRubroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdRubroEmpleaEmpleadoPagoRubroActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);

			this.getEmpleadoPagoRubrosFK_IdRubroEmplea();

			this.inicializarActualizarBindingEmpleadoPagoRubro(false);

			//if(EmpleadoPagoRubroBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadopagorubroLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoPagoRubro() {
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.dispose();
			this.jInternalFrameDetalleFormEmpleadoPagoRubro=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoPagoRubro=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoPagoRubro!=null) {
			this.jInternalFrameImportacionEmpleadoPagoRubro.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoPagoRubro.dispose();
			this.jInternalFrameImportacionEmpleadoPagoRubro=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoPagoRubro();
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoPagoRubro")) {
				jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoPagoRubro")) {
				jButtonDuplicarEmpleadoPagoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoPagoRubro")) {
				jButtonCopiarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoPagoRubro")) {
				jButtonVerFormEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoPagoRubro")) {
				jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoPagoRubro")) {
				jButtonDuplicarEmpleadoPagoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoPagoRubro")) {
				jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoPagoRubro")) {
				jButtonDuplicarEmpleadoPagoRubroActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoPagoRubro")) {
				jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoPagoRubro")) {
				jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoPagoRubro")) {
				jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoPagoRubro")) {
				jButtonModificarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoPagoRubro")) {
				jButtonModificarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoPagoRubro")) {
				jButtonModificarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoPagoRubro")) {
				jButtonActualizarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoPagoRubro")) {
				jButtonActualizarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoPagoRubro")) {
				jButtonActualizarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoPagoRubro")) {
				jButtonEliminarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoPagoRubro")) {
				jButtonEliminarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoPagoRubro")) {
				jButtonEliminarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoPagoRubro")) {
				jButtonCancelarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoPagoRubro")) {
				jButtonCancelarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoPagoRubro")) {
				jButtonCancelarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoPagoRubro")) {
				jButtonCerrarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoPagoRubro")) {
				jButtonCerrarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoPagoRubro")) {
				jButtonCerrarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoPagoRubro")) {
				jButtonMostrarOcultarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoPagoRubro")) {
				jButtonCancelarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoPagoRubro")) {
				jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoPagoRubro")) {
				jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoPagoRubro")) {
				jButtonCopiarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoPagoRubro")) {
				jButtonVerFormEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoPagoRubro")) {
				jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoPagoRubro")) {
				jButtonCopiarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoPagoRubro")) {
				jButtonVerFormEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoPagoRubro")) {
				jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoPagoRubro")) {
				jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoPagoRubro")) {
				jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoPagoRubro")) {
				jButtonRecargarInformacionEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoPagoRubro")) {
				jButtonRecargarInformacionEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoPagoRubro")) {
				jButtonRecargarInformacionEmpleadoPagoRubroActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoPagoRubro")) {
				jButtonAnterioresEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoPagoRubro")) {
				jButtonAnterioresEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoPagoRubro")) {
				jButtonAnterioresEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoPagoRubro")) {
				jButtonSiguientesEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoPagoRubro")) {
				jButtonSiguientesEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoPagoRubro")) {
				jButtonSiguientesEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoPagoRubro") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoPagoRubro")) {
				jButtonAbrirOrderByEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoPagoRubro") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoPagoRubro")) {
				jButtonMostrarOcultarEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoPagoRubro")) {
				jButtonNuevoGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoPagoRubro")) {
				jButtonNuevoGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoPagoRubro")) {
				jButtonNuevoGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoPagoRubro")) {
				jButtonCerrarReporteDinamicoEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoPagoRubro")) {
				jButtonGenerarReporteDinamicoEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoPagoRubro")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoPagoRubro")) {
				jButtonCerrarImportacionEmpleadoPagoRubroActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoPagoRubro")) {
				
				jButtonGenerarImportacionEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoPagoRubro")) {
				
				jButtonAbrirImportacionEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoPagoRubro")) {
				jComboBoxTiposAccionesEmpleadoPagoRubroActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoPagoRubro")) {
				jComboBoxTiposRelacionesEmpleadoPagoRubroActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoPagoRubro")) {
				jComboBoxTiposAccionesEmpleadoPagoRubroActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoPagoRubro")) {
				
				jComboBoxTiposSeleccionarEmpleadoPagoRubroActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoPagoRubro")) {
				jTextFieldValorCampoGeneralEmpleadoPagoRubroActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoPagoRubro")) {
				jButtonAbrirOrderByEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoPagoRubro")) {
				jButtonAbrirOrderByEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoPagoRubro")) {
				jButtonCerrarOrderByEmpleadoPagoRubroActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoPagoRubroBusqueda")) {
				this.jButtonidEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoPagoRubroUpdate")) {
				this.jButtonid_empresaEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_empresaEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoPagoRubroUpdate")) {
				this.jButtonid_empleadoEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_empleadoEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoPagoRubroUpdate")) {
				this.jButtonid_estructuraEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_estructuraEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaEmpleadoPagoRubroUpdate")) {
				this.jButtonid_rubro_empleaEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_rubro_empleaEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioEmpleadoPagoRubroUpdate")) {
				this.jButtonid_anioEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_anioEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesEmpleadoPagoRubroUpdate")) {
				this.jButtonid_mesEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_mesEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pagoEmpleadoPagoRubroBusqueda")) {
				this.jButtonvalor_pagoEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaEmpleadoPagoRubroBusqueda")) {
				this.jButtonfechaEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_liquidacionEmpleadoPagoRubroBusqueda")) {
				this.jButtonfecha_liquidacionEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioEmpleadoPagoRubro")) {
				this.jButtonFK_IdAnioEmpleadoPagoRubroActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoPagoRubro")) {
				this.jButtonFK_IdEmpleadoEmpleadoPagoRubroActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraEmpleadoPagoRubro")) {
				this.jButtonFK_IdEstructuraEmpleadoPagoRubroActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesEmpleadoPagoRubro")) {
				this.jButtonFK_IdMesEmpleadoPagoRubroActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdRubroEmpleaEmpleadoPagoRubro")) {
				this.jButtonFK_IdRubroEmpleaEmpleadoPagoRubroActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoPagoRubro();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoPagoRubroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				


				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoPagoRubro empleadopagorubroLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadopagorubroLocal=this.empleadopagorubro;
			} else {
				empleadopagorubroLocal=this.empleadopagorubroAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
							
				
				


				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoPagoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
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
			
			


			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoPagoRubroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
								
						
				


				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
								
				
				


				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoPagoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoPagoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoPagoRubroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
							
				
				


				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoPagoRubroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
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
			
			


			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoPagoRubroActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
								
				
				


				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoPagoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoPagoRubroActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoPagoRubroActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoPagoRubro")) {
					jCheckBoxSeleccionarTodosEmpleadoPagoRubroItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoPagoRubro")) {
					jCheckBoxSeleccionadosEmpleadoPagoRubroItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoPagoRubro")) {
					
				}
				
				


				
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
												
				
				


				
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoPagoRubroActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoPagoRubroActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
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
			
			


			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoPagoRubroActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadopagorubro);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadopagorubro);
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
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
				
				


				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoPagoRubro.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoPagoRubro.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoPagoRubroActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadopagorubroAnterior =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoPagoRubro")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoPagoRubroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoPagoRubro.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadopagorubro =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadopagorubro);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoPagoRubro")) {
				
				}
				
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoPagoRubro")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoPagoRubro.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoPagoRubro")) {
			
			}
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoPagoRubro();
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoPagoRubro")) {
				jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoPagoRubro")) {
				jButtonDuplicarEmpleadoPagoRubroActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoPagoRubro")) {
				jButtonCopiarEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoPagoRubro")) {
				jButtonVerFormEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoPagoRubro")) {
				jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoPagoRubro")) {
				jButtonModificarEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoPagoRubro")) {
				jButtonActualizarEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoPagoRubro")) {
				jButtonEliminarEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoPagoRubro")) {
				jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoPagoRubro")) {
				jButtonCancelarEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoPagoRubro")) {
				jButtonCerrarEmpleadoPagoRubroActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoPagoRubro")) {
				jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoPagoRubro")) {
				jButtonNuevoGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoPagoRubro")) {
				jButtonAbrirOrderByEmpleadoPagoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoPagoRubro")) {
				jButtonRecargarInformacionEmpleadoPagoRubroActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoPagoRubro")) {
				jButtonAnterioresEmpleadoPagoRubroActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoPagoRubro")) {
				jButtonSiguientesEmpleadoPagoRubroActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoPagoRubroBusqueda")) {
				this.jButtonidEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoPagoRubroUpdate")) {
				this.jButtonid_empresaEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_empresaEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoPagoRubroUpdate")) {
				this.jButtonid_empleadoEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_empleadoEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoPagoRubroUpdate")) {
				this.jButtonid_estructuraEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_estructuraEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_rubro_empleaEmpleadoPagoRubroUpdate")) {
				this.jButtonid_rubro_empleaEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_rubro_empleaEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_rubro_empleaEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioEmpleadoPagoRubroUpdate")) {
				this.jButtonid_anioEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_anioEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesEmpleadoPagoRubroUpdate")) {
				this.jButtonid_mesEmpleadoPagoRubroUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesEmpleadoPagoRubroBusqueda")) {
				this.jButtonid_mesEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pagoEmpleadoPagoRubroBusqueda")) {
				this.jButtonvalor_pagoEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaEmpleadoPagoRubroBusqueda")) {
				this.jButtonfechaEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_liquidacionEmpleadoPagoRubroBusqueda")) {
				this.jButtonfecha_liquidacionEmpleadoPagoRubroBusquedaActionPerformed(evt);
			}
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoPagoRubro();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoPagoRubro")) {
				closingInternalFrameEmpleadoPagoRubro();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoPagoRubro")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoPagoRubro = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoPagoRubroBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoPagoRubroBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoPagoRubro.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoPagoRubroActionPerformed(null);
			}
			
			EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadopagorubro,new Object(),this.empleadopagorubroParameterGeneral,this.empleadopagorubroReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoPagoRubro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoPagoRubro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoPagoRubro(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadopagorubro)) {
			if(!esControlTabla) {
				if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);			
				}
				
				if(this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadopagorubroReturnGeneral=empleadopagorubroLogic.procesarEventosEmpleadoPagoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadopagorubroLogic.getEmpleadoPagoRubros(),this.empleadopagorubro,this.empleadopagorubroParameterGeneral,this.isEsNuevoEmpleadoPagoRubro,classes);//this.empleadopagorubroLogic.getEmpleadoPagoRubro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoPagoRubro(this.empleadopagorubroReturnGeneral,this.empleadopagorubroBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoPagoRubro(classes,this.empleadopagorubroReturnGeneral,this.empleadopagorubroBean,false);
					}
						
					if(this.empleadopagorubroReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoPagoRubro(this.empleadopagorubroReturnGeneral.getEmpleadoPagoRubro());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoPagoRubro(this.empleadopagorubroReturnGeneral.getEmpleadoPagoRubro());	
					}
						
					if(this.empleadopagorubroReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoPagoRubro(this.empleadopagorubroReturnGeneral.getEmpleadoPagoRubro(),classes);//this.empleadopagorubroBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoPagoRubro(this.empleadopagorubro,classes);//this.empleadopagorubroBean);									
				}
			
				if(EmpleadoPagoRubroJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoPagoRubro(this.empleadopagorubro,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoPagoRubro(this.empleadopagorubro);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadopagorubroAnterior!=null) {
						this.empleadopagorubro=this.empleadopagorubroAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadopagorubroReturnGeneral=empleadopagorubroLogic.procesarEventosEmpleadoPagoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadopagorubroLogic.getEmpleadoPagoRubros(),this.empleadopagorubro,this.empleadopagorubroParameterGeneral,this.isEsNuevoEmpleadoPagoRubro,classes);//this.empleadopagorubroLogic.getEmpleadoPagoRubro()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadopagorubroSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadopagorubroSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadopagorubroReturnGeneral.getEmpleadoPagoRubro(),empleadopagorubroLogic.getEmpleadoPagoRubros());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadopagorubroReturnGeneral.getEmpleadoPagoRubro(),this.empleadopagorubros);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoPagoRubro.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoPagoRubro.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoPagoRubro();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoPagoRubro() throws Exception {
		
		EmpleadoPagoRubroModel empleadopagorubroModel=(EmpleadoPagoRubroModel)this.jTableDatosEmpleadoPagoRubro.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadopagorubroModel.empleadopagorubros=this.empleadopagorubroLogic.getEmpleadoPagoRubros();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadopagorubroModel.empleadopagorubros=this.empleadopagorubros;
		}
		
		
		((EmpleadoPagoRubroModel) this.jTableDatosEmpleadoPagoRubro.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoPagoRubro() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadopagorubroAnterior(),this.empleadopagorubroLogic.getEmpleadoPagoRubros());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadopagorubroAnterior(),this.empleadopagorubros);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoPagoRubro();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
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
										
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadopagorubro,new Object(),generalEntityParameterGeneral,this.empleadopagorubroReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadopagorubroSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoPagoRubroConstantesFunciones.getClassesRelationshipsOfEmpleadoPagoRubro(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoPagoRubroConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoPagoRubro(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoPagoRubro(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadopagorubro,new Object(),generalEntityParameterGeneral,this.empleadopagorubroReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoPagoRubro(EmpleadoPagoRubroBean empleadopagorubroBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoPagoRubro(ArrayList<Classe> classes,EmpleadoPagoRubroReturnGeneral empleadopagorubroReturnGeneral,EmpleadoPagoRubroBean empleadopagorubroBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadopagorubro)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro = new EmpleadoPagoRubroDetalleFormJInternalFrame(jDesktopPane,this.empleadopagorubroSessionBean.getConGuardarRelaciones(),this.empleadopagorubroSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.empleadopagorubroLogic=this.empleadopagorubroLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoPagoRubro("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoPagoRubro();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoPagoRubro();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoPagoRubro("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoPagoRubro();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoPagoRubro"));
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonModificarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoPagoRubro"));

		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonModificarToolBarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoPagoRubro"));
					
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemModificarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoPagoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonActualizarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoPagoRubro"));
		
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonActualizarToolBarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoPagoRubro"));
						
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemActualizarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoPagoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonEliminarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoPagoRubro"));
		
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonEliminarToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoPagoRubro"));
								
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemEliminarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoPagoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonCancelarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoPagoRubro"));
		
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonCancelarToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoPagoRubro"));
					
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemCancelarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoPagoRubro"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemDetalleCerrarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoPagoRubro"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoPagoRubro"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoPagoRubro"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoPagoRubro"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonidEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empresaEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empresaEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empleadoEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empleadoEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_estructuraEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_estructuraEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_anioEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_anioEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_mesEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_mesEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoPagoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonvalor_pagoEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagoEmpleadoPagoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonfechaEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fechaEmpleadoPagoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionEmpleadoPagoRubroBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTabbedPaneRelacionesEmpleadoPagoRubro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoPagoRubro"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoPagoRubro"));
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoPagoRubro"));
		}
		
		this.jTableDatosEmpleadoPagoRubro.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoPagoRubro"));
		
		this.jTableDatosEmpleadoPagoRubro.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoPagoRubro"));
		
		this.jButtonNuevoEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoPagoRubro"));
		
		this.jButtonDuplicarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoPagoRubro"));
		
		this.jButtonCopiarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoPagoRubro"));
		
		this.jButtonVerFormEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoPagoRubro"));
		
		
		this.jButtonNuevoToolBarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoPagoRubro"));
			
		this.jButtonDuplicarToolBarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoPagoRubro"));
			
		this.jMenuItemNuevoEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoPagoRubro"));
			
		this.jMenuItemDuplicarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoPagoRubro"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoPagoRubro"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoPagoRubro"));
			
		this.jMenuItemNuevoRelacionesEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoPagoRubro"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonModificarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoPagoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonModificarToolBarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoPagoRubro"));
			
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemModificarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoPagoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonActualizarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoPagoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonActualizarToolBarEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoPagoRubro"));
				
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemActualizarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoPagoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonEliminarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoPagoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonEliminarToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoPagoRubro"));
						
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemEliminarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoPagoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonCancelarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoPagoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonCancelarToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoPagoRubro"));
			
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemCancelarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoPagoRubro"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoPagoRubro"));		
		
		
		this.jButtonCerrarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoPagoRubro"));
		
		
		this.jButtonCerrarToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoPagoRubro"));
			
		this.jMenuItemCerrarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoPagoRubro"));
			
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jMenuItemDetalleCerrarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoPagoRubro"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoPagoRubro"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoPagoRubro"));
		}
		
		this.jButtonCopiarToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoPagoRubro"));
			
		this.jButtonVerFormToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoPagoRubro"));
		
		this.jMenuItemGuardarCambiosEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoPagoRubro"));
			
		this.jMenuItemCopiarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoPagoRubro"));		
		
		this.jMenuItemVerFormEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoPagoRubro"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoPagoRubro"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoPagoRubro"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoPagoRubro"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoPagoRubro"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoPagoRubro"));
		
		this.jMenuItemRecargarInformacionEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoPagoRubro"));		
		
		
		
		this.jButtonAnterioresEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoPagoRubro"));
		
		
		this.jButtonAnterioresToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoPagoRubro"));
		
		this.jMenuItemAnterioresEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoPagoRubro"));		
		
		
		this.jButtonSiguientesEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoPagoRubro"));
		
		
		this.jButtonSiguientesToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoPagoRubro"));
			
		this.jMenuItemSiguientesEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoPagoRubro"));
			
		this.jMenuItemAbrirOrderByEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoPagoRubro"));
			
		this.jMenuItemMostrarOcultarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoPagoRubro"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoPagoRubro"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoPagoRubro"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoPagoRubro"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoPagoRubro"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoPagoRubro"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoPagoRubro"));

		this.jCheckBoxSeleccionadosEmpleadoPagoRubro.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoPagoRubro"));
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoPagoRubro"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoPagoRubro"));
			
		this.jComboBoxTiposAccionesEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoPagoRubro"));
					
		this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoPagoRubro"));
			
		this.jTextFieldValorCampoGeneralEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoPagoRubro"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonidEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empresaEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empresaEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empleadoEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empleadoEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_estructuraEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_estructuraEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_anioEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_anioEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_mesEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_mesEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoPagoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonvalor_pagoEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagoEmpleadoPagoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonfechaEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fechaEmpleadoPagoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionEmpleadoPagoRubroBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"FK_IdAnioEmpleadoPagoRubro"));

			this.jButtonFK_IdEmpleadoEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoPagoRubro"));

			this.jButtonFK_IdEstructuraEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraEmpleadoPagoRubro"));

			this.jButtonFK_IdMesEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"FK_IdMesEmpleadoPagoRubro"));

			this.jButtonFK_IdRubroEmpleaEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaEmpleadoPagoRubro"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoPagoRubro!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoPagoRubro"));
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoPagoRubro"));
				this.jInternalFrameReporteDinamicoEmpleadoPagoRubro.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoPagoRubro"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoPagoRubro"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoPagoRubro"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoPagoRubro"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoPagoRubro!=null) {
				this.jInternalFrameImportacionEmpleadoPagoRubro.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoPagoRubro"));
				this.jInternalFrameImportacionEmpleadoPagoRubro.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoPagoRubro"));
				this.jInternalFrameImportacionEmpleadoPagoRubro.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoPagoRubro"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoPagoRubro"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoPagoRubro.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoPagoRubro"));			
			
			if(this.jInternalFrameOrderByEmpleadoPagoRubro!=null) {
				this.jInternalFrameOrderByEmpleadoPagoRubro.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoPagoRubro"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTabbedPaneRelacionesEmpleadoPagoRubro.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoPagoRubro"));
		
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
            		closingInternalFrameEmpleadoPagoRubro();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoPagoRubro = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoPagoRubroBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoPagoRubroBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoPagoRubro.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoPagoRubroActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoPagoRubro.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoPagoRubroListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoPagoRubro.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoPagoRubro.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoPagoRubro";
		inputMap = this.jButtonNuevoEmpleadoPagoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoPagoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoPagoRubro";
		inputMap = this.jButtonNuevoRelacionesEmpleadoPagoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoPagoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoPagoRubroActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoPagoRubro";
		inputMap = this.jButtonModificarEmpleadoPagoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoPagoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoPagoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoPagoRubro";
		inputMap = this.jButtonActualizarEmpleadoPagoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoPagoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoPagoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoPagoRubro";
		inputMap = this.jButtonEliminarEmpleadoPagoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoPagoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoPagoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoPagoRubro";
		inputMap = this.jButtonCancelarEmpleadoPagoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoPagoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoPagoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoPagoRubro";
		inputMap = this.jButtonCerrarEmpleadoPagoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoPagoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoPagoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoPagoRubro";
		inputMap = this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosEmpleadoPagoRubro.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonGuardarCambiosEmpleadoPagoRubro.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoPagoRubro.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoPagoRubroItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoPagoRubro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoPagoRubroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoPagoRubroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoPagoRubro.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoPagoRubroActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonidEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empresaEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empresaEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empleadoEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_empleadoEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_estructuraEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_estructuraEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_rubro_empleaEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_rubro_empleaEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_rubro_empleaEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_rubro_empleaEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_anioEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_anioEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoPagoRubroBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_mesEmpleadoPagoRubroUpdate.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoPagoRubroUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonid_mesEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoPagoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonvalor_pagoEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagoEmpleadoPagoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonfechaEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fechaEmpleadoPagoRubroBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jButtonfecha_liquidacionEmpleadoPagoRubroBusqueda.addActionListener(new ButtonActionListener(this,"fecha_liquidacionEmpleadoPagoRubroBusqueda"));
		
		
		this.jButtonFK_IdAnioEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"FK_IdAnioEmpleadoPagoRubro"));

		this.jButtonFK_IdEmpleadoEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoPagoRubro"));

		this.jButtonFK_IdEstructuraEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraEmpleadoPagoRubro"));

		this.jButtonFK_IdMesEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"FK_IdMesEmpleadoPagoRubro"));

		this.jButtonFK_IdRubroEmpleaEmpleadoPagoRubro.addActionListener(new ButtonActionListener(this,"FK_IdRubroEmpleaEmpleadoPagoRubro"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoPagoRubro.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoPagoRubroActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoPagoRubroActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoPagoRubro.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoPagoRubro(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubroLogic.getEmpleadoPagoRubros()) {
					empleadopagorubroAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubros) {
					empleadopagorubroAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoPagoRubroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubroLogic.getEmpleadoPagoRubros()) {
						empleadopagorubroAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubros) {
						empleadopagorubroAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubroLogic.getEmpleadoPagoRubros()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubros) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoPagoRubro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoPagoRubro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoPagoRubroItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoPagoRubro.getSelectedRows();
			
			EmpleadoPagoRubro empleadopagorubroLocal=new EmpleadoPagoRubro();
			
			//this.seleccionarTodosEmpleadoPagoRubro(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadopagorubroLocal =(EmpleadoPagoRubro) this.empleadopagorubroLogic.getEmpleadoPagoRubros().toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadopagorubroLocal =(EmpleadoPagoRubro) this.empleadopagorubros.toArray()[this.jTableDatosEmpleadoPagoRubro.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadopagorubroLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubroLogic.getEmpleadoPagoRubros()) {
						empleadopagorubroAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubros) {
						empleadopagorubroAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoPagoRubro.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoPagoRubro.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoPagoRubro,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoPagoRubroItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoPagoRubroParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoPagoRubroActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoPagoRubro.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubroLogic.getEmpleadoPagoRubros()) {
				
						if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO)) {
							existe=true;
							empleadopagorubroAux.setvalor_pago(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							empleadopagorubroAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION)) {
							existe=true;
							empleadopagorubroAux.setfecha_liquidacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubros) {
					
						if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO)) {
							existe=true;
							empleadopagorubroAux.setvalor_pago(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							empleadopagorubroAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION)) {
							existe=true;
							empleadopagorubroAux.setfecha_liquidacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoPagoRubroActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoPagoRubro=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoPagoRubro.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoPagoRubro) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoPagoRubro(conSplash);
				
					this.generarReporteEmpleadoPagoRubrosSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoPagoRubrosSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoPagoRubrosSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoPagoRubrosSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoPagoRubro();
				
				this.exportarEmpleadoPagoRubrosSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoPagoRubros();
				//this.importarEmpleadoPagoRubros();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoPagoRubro();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoPagoRubrosSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Pago Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoPagoRubro();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoPagoRubro)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoPagoRubro(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Pago Rubro",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoPagoRubroBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoPagoRubro) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoPagoRubro(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoPagoRubro();
						
						this.generarReporteProcesoAccionEmpleadoPagoRubrosSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado Pago RubroS SELECCIONADOS?", "MANTENIMIENTO DE Empleado Pago Rubro", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoPagoRubro();
				
						this.actualizarParametrosGeneralEmpleadoPagoRubro();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadopagorubroReturnGeneral=empleadopagorubroLogic.procesarAccionEmpleadoPagoRubrosWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadopagorubroLogic.getEmpleadoPagoRubros(),this.empleadopagorubroParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoPagoRubroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoPagoRubro();
					
					EmpleadoPagoRubroBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoPagoRubroReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoPagoRubro.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxTiposAccionesFormularioEmpleadoPagoRubro.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoPagoRubro(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoPagoRubroActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoPagoRubro();
			
			if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();		
			EmpleadoPagoRubro empleadopagorubro=new EmpleadoPagoRubro();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoPagoRubro(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoPagoRubro.getSelectedItem();
			
			
			
			
			empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadopagorubrosSeleccionados.size()==1) {
				for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubrosSeleccionados) {
					empleadopagorubro=empleadopagorubroAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoPagoRubro();
			
      		//this.finishProcessEmpleadoPagoRubro(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoPagoRubroReturnGeneral() throws Exception {
		if(this.empleadopagorubroReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadopagorubroReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadopagorubroReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadopagorubroReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadopagorubroReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadopagorubroReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoPagoRubro(false);
		}
		
		if(this.empleadopagorubroReturnGeneral.getConRetornoLista() || this.empleadopagorubroReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadopagorubroReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadopagorubroLogic.setEmpleadoPagoRubros(this.empleadopagorubroReturnGeneral.getEmpleadoPagoRubros());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadopagorubroReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadopagorubroLogic.setEmpleadoPagoRubro(this.empleadopagorubroReturnGeneral.getEmpleadoPagoRubro());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoPagoRubro(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoPagoRubro() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoPagoRubro> getEmpleadoPagoRubrosSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoPagoRubro) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubroLogic.getEmpleadoPagoRubros()) {
					if(empleadopagorubroAux.getIsSelected()) {
						empleadopagorubrosSeleccionados.add(empleadopagorubroAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoPagoRubro empleadopagorubroAux:this.empleadopagorubros) {
					if(empleadopagorubroAux.getIsSelected()) {
						empleadopagorubrosSeleccionados.add(empleadopagorubroAux);				
					}
				}
			}
			
			if(empleadopagorubrosSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadopagorubrosSeleccionados.addAll(this.empleadopagorubroLogic.getEmpleadoPagoRubros());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadopagorubrosSeleccionados.addAll(this.empleadopagorubros);				
					}
				}
			}
		} else {
			empleadopagorubrosSeleccionados.add(this.empleadopagorubro);
		}
		
		return empleadopagorubrosSeleccionados;
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
	
	public void generarReporteEmpleadoPagoRubrosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoPagoRubrosSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoPagoRubrosSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoPagoRubrosSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoPagoRubrosSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Pago Rubro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoPagoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();		
		
		empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoPagoRubros("Todos",empleadopagorubrosSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoPagoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();		
		
		empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoPagoRubros("Todos",empleadopagorubrosSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoPagoRubrosSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();
		
		empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoPagoRubros("Todos",empleadopagorubrosSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoPagoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoPagoRubro();
		
		
		empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoPagoRubro();
		
		
		//this.generarReporteEmpleadoPagoRubros("Todos",empleadopagorubrosSeleccionados ,empleadopagorubroImplementable,empleadopagorubroImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoPagoRubros() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoPagoRubro();
		
		this.abrirFrameImportacionEmpleadoPagoRubro();		
		
			
		//this.generarReporteEmpleadoPagoRubros("Todos",empleadopagorubrosSeleccionados ,empleadopagorubroImplementable,empleadopagorubroImplementableHome);
	}
	
	public void importarEmpleadoPagoRubros() throws Exception {		
	
	}
	
	public void exportarEmpleadoPagoRubrosSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoPagoRubrosSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoPagoRubrosSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoPagoRubrosSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Pago Rubro",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoPagoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();		
		
		empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadopagorubro."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoPagoRubro(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubrosSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoPagoRubro(empleadopagorubroAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadopagorubroAux.setsDetalleGeneralEntityReporte(empleadopagorubroAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Pago Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoPagoRubro(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadopagorubro.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadopagorubro.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadopagorubro.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadopagorubro.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadopagorubro.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadopagorubro.getrubroemplea_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadopagorubro.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadopagorubro.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadopagorubro.getvalor_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadopagorubro.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadopagorubro.getfecha_liquidacion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoPagoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();		
		
		empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadopagorubro.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoPagoRubros");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoPagoRubro(row);				
				iRow++;
			}				
			
			for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubrosSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoPagoRubro(empleadopagorubroAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Pago Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoPagoRubrosSeleccionados() throws Exception {
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();		
		
		empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadopagorubro.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadopagorubros");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadopagorubro");
			//elementRoot.appendChild(element);
		
			for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubrosSeleccionados) {
				element = document.createElement("empleadopagorubro");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoPagoRubro(empleadopagorubroAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Pago Rubro",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoPagoRubro(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_VALORPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadopagorubro.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadopagorubro.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadopagorubro.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadopagorubro.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadopagorubro.getrubroemplea_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadopagorubro.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadopagorubro.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadopagorubro.getvalor_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadopagorubro.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadopagorubro.getfecha_liquidacion());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoPagoRubro(EmpleadoPagoRubro empleadopagorubro,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoPagoRubroConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadopagorubro.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoPagoRubroConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadopagorubro.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoPagoRubroConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadopagorubro.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoPagoRubroConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadopagorubro.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementestructura_descripcion = document.createElement(EmpleadoPagoRubroConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(empleadopagorubro.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementrubroemplea_descripcion = document.createElement(EmpleadoPagoRubroConstantesFunciones.IDRUBROEMPLEA);
		elementrubroemplea_descripcion.appendChild(document.createTextNode(empleadopagorubro.getrubroemplea_descripcion()));
		element.appendChild(elementrubroemplea_descripcion);

		Element elementanio_descripcion = document.createElement(EmpleadoPagoRubroConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(empleadopagorubro.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(EmpleadoPagoRubroConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(empleadopagorubro.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementvalor_pago = document.createElement(EmpleadoPagoRubroConstantesFunciones.VALORPAGO);
		elementvalor_pago.appendChild(document.createTextNode(empleadopagorubro.getvalor_pago().toString().trim()));
		element.appendChild(elementvalor_pago);

		Element elementfecha = document.createElement(EmpleadoPagoRubroConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(empleadopagorubro.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementfecha_liquidacion = document.createElement(EmpleadoPagoRubroConstantesFunciones.FECHALIQUIDACION);
		elementfecha_liquidacion.appendChild(document.createTextNode(empleadopagorubro.getfecha_liquidacion().toString().trim()));
		element.appendChild(elementfecha_liquidacion);
	}
	
	public void generarReporteGroupGenericoEmpleadoPagoRubrosSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados=new ArrayList<EmpleadoPagoRubro>();
		
		empleadopagorubrosSeleccionados=this.getEmpleadoPagoRubrosSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoPagoRubro(empleadopagorubrosSeleccionados);
		
		this.generarReporteEmpleadoPagoRubros("Todos",empleadopagorubrosSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoPagoRubro(ArrayList<EmpleadoPagoRubro> empleadopagorubrosSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoPagoRubro empleadopagorubroAux:empleadopagorubrosSeleccionados) {
				empleadopagorubroAux.setsDetalleGeneralEntityReporte(empleadopagorubroAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadopagorubroAux.setsDescripcionGeneralEntityReporte1(empleadopagorubroAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadopagorubroAux.setsDescripcionGeneralEntityReporte1(empleadopagorubroAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					empleadopagorubroAux.setsDescripcionGeneralEntityReporte1(empleadopagorubroAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_IDRUBROEMPLEA)) {
					existe=true;
					empleadopagorubroAux.setsDescripcionGeneralEntityReporte1(empleadopagorubroAux.getrubroemplea_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					empleadopagorubroAux.setsDescripcionGeneralEntityReporte1(empleadopagorubroAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					empleadopagorubroAux.setsDescripcionGeneralEntityReporte1(empleadopagorubroAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					empleadopagorubroAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(empleadopagorubroAux.getfecha()));
				}
				 else if(sTipoSeleccionar.equals(EmpleadoPagoRubroConstantesFunciones.LABEL_FECHALIQUIDACION)) {
					existe=true;
					empleadopagorubroAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(empleadopagorubroAux.getfecha_liquidacion()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoPagoRubroConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoPagoRubro(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaModificarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaModificarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaModificarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaModificarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaModificarEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaCancelarEmpleadoPagoRubro=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoPagoRubro=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoPagoRubroJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoPagoRubro(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoPagoRubro=false;
			//this.isVisibilidadCeldaVerFormEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaDuplicarEmpleadoPagoRubro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadopagorubroSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoPagoRubro=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
			if(!empleadopagorubroSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=false;												
			}
			
			this.jButtonCerrarEmpleadoPagoRubro.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoPagoRubro=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadopagorubro)) {
			this.isVisibilidadCeldaActualizarEmpleadoPagoRubro=false;
			this.isVisibilidadCeldaEliminarEmpleadoPagoRubro=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoPagoRubro() {
	}
	
	public void actualizarEstadoPanelsEmpleadoPagoRubro(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoPagoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEmpleadoPagoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoPagoRubro!=null) {
				this.jPanelPaginacionEmpleadoPagoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoPagoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoPagoRubro.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoPagoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEmpleadoPagoRubro.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoPagoRubro!=null) {
				this.jPanelPaginacionEmpleadoPagoRubro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoPagoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoPagoRubro.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoPagoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEmpleadoPagoRubro.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoPagoRubro!=null) {
				this.jPanelPaginacionEmpleadoPagoRubro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoPagoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoPagoRubro.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoPagoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEmpleadoPagoRubro.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoPagoRubro!=null) {
				this.jPanelPaginacionEmpleadoPagoRubro.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoPagoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoPagoRubro.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoPagoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEmpleadoPagoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoPagoRubro!=null) {
				this.jPanelPaginacionEmpleadoPagoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoPagoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoPagoRubro.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoPagoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEmpleadoPagoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoPagoRubro!=null) {
				this.jPanelPaginacionEmpleadoPagoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoPagoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoPagoRubro.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEdicionEmpleadoPagoRubro.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoPagoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoPagoRubro!=null) {
				this.jScrollPanelDatosEmpleadoPagoRubro.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoPagoRubro!=null) {
				this.jPanelPaginacionEmpleadoPagoRubro.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoPagoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoPagoRubro.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoPagoRubro!=null) {
					this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoPagoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoPagoRubro.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadopagorubroSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoPagoRubro!=null) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoPagoRubro!=null) {
				this.jPanelParametrosReportesEmpleadoPagoRubro.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdAnioEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEmpleadoEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEstructuraEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdMes=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdMesEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdAnio=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdAnioEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEmpleadoEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEstructuraEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdMes=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdMesEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdAnio=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdAnioEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEmpleadoEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEstructuraEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdMes=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdMesEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdRubroEmplea=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);}
		}
		
	}

	public void setVisibilidadBusquedasParaRubroEmplea(Boolean isParaRubroEmplea){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaRubroEmpleaNegation=!isParaRubroEmplea;

			this.isVisibilidadFK_IdAnio=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdAnioEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEmpleado=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEmpleadoEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEstructura=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEstructuraEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdMes=isParaRubroEmpleaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdMesEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdRubroEmplea=isParaRubroEmplea;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdAnioEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEmpleado=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEmpleadoEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEstructura=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEstructuraEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdMesEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdRubroEmplea=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdAnioEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEmpleado=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEmpleadoEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdEstructura=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdEstructuraEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdMesEmpleadoPagoRubro);}

			this.isVisibilidadFK_IdRubroEmplea=isParaMesNegation;
			if(!this.isVisibilidadFK_IdRubroEmplea) {this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoPagoRubroSessionBean empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
		
		if(this.empleadopagorubroSessionBean==null) {
			this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
		}
		
		this.empleadopagorubroSessionBean.setsUltimaBusquedaEmpleadoPagoRubro(this.getsAccionBusqueda());
		this.empleadopagorubroSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadopagorubroSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			empleadopagorubroSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadopagorubroSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadopagorubroSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			empleadopagorubroSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			empleadopagorubroSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
			empleadopagorubroSessionBean.setid_rubro_emplea(this.getid_rubro_empleaFK_IdRubroEmplea());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoPagoRubroSessionBean empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
		
		if(this.empleadopagorubroSessionBean==null) {
			this.empleadopagorubroSessionBean=new EmpleadoPagoRubroSessionBean();
		}
		
		if(this.empleadopagorubroSessionBean.getsUltimaBusquedaEmpleadoPagoRubro()!=null&&!this.empleadopagorubroSessionBean.getsUltimaBusquedaEmpleadoPagoRubro().equals("")) {
			this.setsAccionBusqueda(empleadopagorubroSessionBean.getsUltimaBusquedaEmpleadoPagoRubro());
			this.setiNumeroPaginacion(empleadopagorubroSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadopagorubroSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(empleadopagorubroSessionBean.getid_anio());
				empleadopagorubroSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadopagorubroSessionBean.getid_empleado());
				empleadopagorubroSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadopagorubroSessionBean.getid_empresa());
				empleadopagorubroSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(empleadopagorubroSessionBean.getid_estructura());
				empleadopagorubroSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(empleadopagorubroSessionBean.getid_mes());
				empleadopagorubroSessionBean.setid_mes(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdRubroEmplea")) {
				this.setid_rubro_empleaFK_IdRubroEmplea(empleadopagorubroSessionBean.getid_rubro_emplea());
				empleadopagorubroSessionBean.setid_rubro_emplea(-1L);
			}
		}
		
		this.empleadopagorubroSessionBean.setsUltimaBusquedaEmpleadoPagoRubro("");
		this.empleadopagorubroSessionBean.setiNumeroPaginacion(EmpleadoPagoRubroConstantesFunciones.INUMEROPAGINACION);
		this.empleadopagorubroSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoPagoRubro(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoPagoRubro() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoPagoRubro();
		this.updateVisibilidadBusquedasFormularioEmpleadoPagoRubro();
		this.updateHabilitarBusquedasFormularioEmpleadoPagoRubro();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoPagoRubro() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponents().length>0) {
	

		if(this.empleadopagorubroConstantesFunciones.resaltarFK_IdAnioEmpleadoPagoRubro!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdAnioEmpleadoPagoRubro);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
				jPanel.setBorder(this.empleadopagorubroConstantesFunciones.resaltarFK_IdAnioEmpleadoPagoRubro);
			}
		}

		if(this.empleadopagorubroConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoPagoRubro!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoPagoRubro);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
				jPanel.setBorder(this.empleadopagorubroConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoPagoRubro);
			}
		}

		if(this.empleadopagorubroConstantesFunciones.resaltarFK_IdEstructuraEmpleadoPagoRubro!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoPagoRubro);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
				jPanel.setBorder(this.empleadopagorubroConstantesFunciones.resaltarFK_IdEstructuraEmpleadoPagoRubro);
			}
		}

		if(this.empleadopagorubroConstantesFunciones.resaltarFK_IdMesEmpleadoPagoRubro!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdMesEmpleadoPagoRubro);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
				jPanel.setBorder(this.empleadopagorubroConstantesFunciones.resaltarFK_IdMesEmpleadoPagoRubro);
			}
		}

		if(this.empleadopagorubroConstantesFunciones.resaltarFK_IdRubroEmpleaEmpleadoPagoRubro!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
				jPanel.setBorder(this.empleadopagorubroConstantesFunciones.resaltarFK_IdRubroEmpleaEmpleadoPagoRubro);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoPagoRubro() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdAnioEmpleadoPagoRubro);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadopagorubroConstantesFunciones.mostrarFK_IdAnioEmpleadoPagoRubro);
			if(!this.empleadopagorubroConstantesFunciones.mostrarFK_IdAnioEmpleadoPagoRubro && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoPagoRubro);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadopagorubroConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoPagoRubro);
			if(!this.empleadopagorubroConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoPagoRubro && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoPagoRubro);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadopagorubroConstantesFunciones.mostrarFK_IdEstructuraEmpleadoPagoRubro);
			if(!this.empleadopagorubroConstantesFunciones.mostrarFK_IdEstructuraEmpleadoPagoRubro && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdMesEmpleadoPagoRubro);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadopagorubroConstantesFunciones.mostrarFK_IdMesEmpleadoPagoRubro);
			if(!this.empleadopagorubroConstantesFunciones.mostrarFK_IdMesEmpleadoPagoRubro && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadopagorubroConstantesFunciones.mostrarFK_IdRubroEmpleaEmpleadoPagoRubro);
			if(!this.empleadopagorubroConstantesFunciones.mostrarFK_IdRubroEmpleaEmpleadoPagoRubro && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoPagoRubro() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdAnioEmpleadoPagoRubro);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadopagorubroConstantesFunciones.activarFK_IdAnioEmpleadoPagoRubro);
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setEnabledAt(index,this.empleadopagorubroConstantesFunciones.activarFK_IdAnioEmpleadoPagoRubro);
			}

			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoPagoRubro);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadopagorubroConstantesFunciones.activarFK_IdEmpleadoEmpleadoPagoRubro);
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setEnabledAt(index,this.empleadopagorubroConstantesFunciones.activarFK_IdEmpleadoEmpleadoPagoRubro);
			}

			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoPagoRubro);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadopagorubroConstantesFunciones.activarFK_IdEstructuraEmpleadoPagoRubro);
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setEnabledAt(index,this.empleadopagorubroConstantesFunciones.activarFK_IdEstructuraEmpleadoPagoRubro);
			}

			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdMesEmpleadoPagoRubro);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadopagorubroConstantesFunciones.activarFK_IdMesEmpleadoPagoRubro);
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setEnabledAt(index,this.empleadopagorubroConstantesFunciones.activarFK_IdMesEmpleadoPagoRubro);
			}

			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadopagorubroConstantesFunciones.activarFK_IdRubroEmpleaEmpleadoPagoRubro);
				this.jTabbedPaneBusquedasEmpleadoPagoRubro.setEnabledAt(index,this.empleadopagorubroConstantesFunciones.activarFK_IdRubroEmpleaEmpleadoPagoRubro);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoPagoRubro(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdAnioEmpleadoPagoRubro);

			this.jTabbedPaneBusquedasEmpleadoPagoRubro.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);

			this.empleadopagorubroConstantesFunciones.setResaltarFK_IdAnioEmpleadoPagoRubro(resaltar);

			jPanel.setBorder(this.empleadopagorubroConstantesFunciones.resaltarFK_IdAnioEmpleadoPagoRubro);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoPagoRubro);

			this.jTabbedPaneBusquedasEmpleadoPagoRubro.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);

			this.empleadopagorubroConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoPagoRubro(resaltar);

			jPanel.setBorder(this.empleadopagorubroConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoPagoRubro);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoPagoRubro);

			this.jTabbedPaneBusquedasEmpleadoPagoRubro.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);

			this.empleadopagorubroConstantesFunciones.setResaltarFK_IdEstructuraEmpleadoPagoRubro(resaltar);

			jPanel.setBorder(this.empleadopagorubroConstantesFunciones.resaltarFK_IdEstructuraEmpleadoPagoRubro);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdMesEmpleadoPagoRubro);

			this.jTabbedPaneBusquedasEmpleadoPagoRubro.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);

			this.empleadopagorubroConstantesFunciones.setResaltarFK_IdMesEmpleadoPagoRubro(resaltar);

			jPanel.setBorder(this.empleadopagorubroConstantesFunciones.resaltarFK_IdMesEmpleadoPagoRubro);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdRubroEmplea")) {
			index= this.jTabbedPaneBusquedasEmpleadoPagoRubro.indexOfComponent(this.jPanelFK_IdRubroEmpleaEmpleadoPagoRubro);

			this.jTabbedPaneBusquedasEmpleadoPagoRubro.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoPagoRubro.getComponent(index);

			this.empleadopagorubroConstantesFunciones.setResaltarFK_IdRubroEmpleaEmpleadoPagoRubro(resaltar);

			jPanel.setBorder(this.empleadopagorubroConstantesFunciones.resaltarFK_IdRubroEmpleaEmpleadoPagoRubro);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoPagoRubro.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpleadoPagoRubro() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoPagoRubro();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoPagoRubro();
		this.updateHabilitarResaltarControlesFormularioEmpleadoPagoRubro();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoPagoRubro() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadopagorubroConstantesFunciones.resaltaridEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.setBorder(this.empleadopagorubroConstantesFunciones.resaltaridEmpleadoPagoRubro);}
		if(this.empleadopagorubroConstantesFunciones.resaltarid_empresaEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.setBorder(this.empleadopagorubroConstantesFunciones.resaltarid_empresaEmpleadoPagoRubro);}
		if(this.empleadopagorubroConstantesFunciones.resaltarid_empleadoEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.setBorder(this.empleadopagorubroConstantesFunciones.resaltarid_empleadoEmpleadoPagoRubro);}
		if(this.empleadopagorubroConstantesFunciones.resaltarid_estructuraEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.setBorder(this.empleadopagorubroConstantesFunciones.resaltarid_estructuraEmpleadoPagoRubro);}
		if(this.empleadopagorubroConstantesFunciones.resaltarid_rubro_empleaEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.setBorder(this.empleadopagorubroConstantesFunciones.resaltarid_rubro_empleaEmpleadoPagoRubro);}
		if(this.empleadopagorubroConstantesFunciones.resaltarid_anioEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.setBorder(this.empleadopagorubroConstantesFunciones.resaltarid_anioEmpleadoPagoRubro);}
		if(this.empleadopagorubroConstantesFunciones.resaltarid_mesEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.setBorder(this.empleadopagorubroConstantesFunciones.resaltarid_mesEmpleadoPagoRubro);}
		if(this.empleadopagorubroConstantesFunciones.resaltarvalor_pagoEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTextFieldvalor_pagoEmpleadoPagoRubro.setBorder(this.empleadopagorubroConstantesFunciones.resaltarvalor_pagoEmpleadoPagoRubro);}
		if(this.empleadopagorubroConstantesFunciones.resaltarfechaEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfechaEmpleadoPagoRubro.setBorder(this.empleadopagorubroConstantesFunciones.resaltarfechaEmpleadoPagoRubro);}
		if(this.empleadopagorubroConstantesFunciones.resaltarfecha_liquidacionEmpleadoPagoRubro!=null && this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfecha_liquidacionEmpleadoPagoRubro.setBorder(this.empleadopagorubroConstantesFunciones.resaltarfecha_liquidacionEmpleadoPagoRubro);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoPagoRubro() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostraridEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelidEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostraridEmpleadoPagoRubro);
		//this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_empresaEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelid_empresaEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_empresaEmpleadoPagoRubro);
		//this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_empleadoEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelid_empleadoEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_empleadoEmpleadoPagoRubro);
		//this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_estructuraEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelid_estructuraEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_estructuraEmpleadoPagoRubro);
		//this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_rubro_empleaEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelid_rubro_empleaEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_rubro_empleaEmpleadoPagoRubro);
		//this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_anioEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelid_anioEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_anioEmpleadoPagoRubro);
		//this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_mesEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelid_mesEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarid_mesEmpleadoPagoRubro);
		//this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTextFieldvalor_pagoEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarvalor_pagoEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelvalor_pagoEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarvalor_pagoEmpleadoPagoRubro);
		//this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfechaEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarfechaEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelfechaEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarfechaEmpleadoPagoRubro);
		//this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfecha_liquidacionEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarfecha_liquidacionEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jPanelfecha_liquidacionEmpleadoPagoRubro.setVisible(this.empleadopagorubroConstantesFunciones.mostrarfecha_liquidacionEmpleadoPagoRubro);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoPagoRubro() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoPagoRubro!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jLabelidEmpleadoPagoRubro.setEnabled(this.empleadopagorubroConstantesFunciones.activaridEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empresaEmpleadoPagoRubro.setEnabled(this.empleadopagorubroConstantesFunciones.activarid_empresaEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_empleadoEmpleadoPagoRubro.setEnabled(this.empleadopagorubroConstantesFunciones.activarid_empleadoEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_estructuraEmpleadoPagoRubro.setEnabled(this.empleadopagorubroConstantesFunciones.activarid_estructuraEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_rubro_empleaEmpleadoPagoRubro.setEnabled(this.empleadopagorubroConstantesFunciones.activarid_rubro_empleaEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_anioEmpleadoPagoRubro.setEnabled(this.empleadopagorubroConstantesFunciones.activarid_anioEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jComboBoxid_mesEmpleadoPagoRubro.setEnabled(this.empleadopagorubroConstantesFunciones.activarid_mesEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jTextFieldvalor_pagoEmpleadoPagoRubro.setEnabled(this.empleadopagorubroConstantesFunciones.activarvalor_pagoEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfechaEmpleadoPagoRubro.setEnabled(this.empleadopagorubroConstantesFunciones.activarfechaEmpleadoPagoRubro);
		this.jInternalFrameDetalleFormEmpleadoPagoRubro.jDateChooserfecha_liquidacionEmpleadoPagoRubro.setEnabled(this.empleadopagorubroConstantesFunciones.activarfecha_liquidacionEmpleadoPagoRubro);
		}
	}
	
		
}