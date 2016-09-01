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

import com.bydan.erp.nomina.util.EmpleadoImpuestoRentaConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoImpuestoRentaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoImpuestoRentaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EmpleadoImpuestoRentaBean;
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
public class EmpleadoImpuestoRentaBeanSwingJInternalFrame extends EmpleadoImpuestoRentaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoImpuestoRentaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoImpuestoRenta> empleadoimpuestorentaValidator = new ClassValidator<EmpleadoImpuestoRenta>(EmpleadoImpuestoRenta.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoImpuestoRenta empleadoimpuestorenta;	
	public EmpleadoImpuestoRenta empleadoimpuestorentaAux;
	public EmpleadoImpuestoRenta empleadoimpuestorentaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoImpuestoRenta empleadoimpuestorentaTotales;
	public Long idEmpleadoImpuestoRentaActual;
	public Long iIdNuevoEmpleadoImpuestoRenta=0L;
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
	
	public Boolean isPermisoTodoEmpleadoImpuestoRenta;
	public Boolean isPermisoNuevoEmpleadoImpuestoRenta;
	public Boolean isPermisoActualizarEmpleadoImpuestoRenta;
	public Boolean isPermisoActualizarOriginalEmpleadoImpuestoRenta;
	public Boolean isPermisoEliminarEmpleadoImpuestoRenta;
	public Boolean isPermisoGuardarCambiosEmpleadoImpuestoRenta;
	public Boolean isPermisoConsultaEmpleadoImpuestoRenta;
	public Boolean isPermisoBusquedaEmpleadoImpuestoRenta;
	public Boolean isPermisoReporteEmpleadoImpuestoRenta;
	public Boolean isPermisoPaginacionMedioEmpleadoImpuestoRenta;
	public Boolean isPermisoPaginacionAltoEmpleadoImpuestoRenta;
	public Boolean isPermisoPaginacionTodoEmpleadoImpuestoRenta;
	public Boolean isPermisoCopiarEmpleadoImpuestoRenta;
	public Boolean isPermisoVerFormEmpleadoImpuestoRenta;
	public Boolean isPermisoDuplicarEmpleadoImpuestoRenta;
	public Boolean isPermisoOrdenEmpleadoImpuestoRenta;
	
	
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
	
	public EmpleadoImpuestoRentaParameterReturnGeneral empleadoimpuestorentaReturnGeneral;
	public EmpleadoImpuestoRentaParameterReturnGeneral empleadoimpuestorentaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoImpuestoRenta=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoImpuestoRenta=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoImpuestoRentaSessionBeanAdditional empleadoimpuestorentaSessionBeanAdditional=null;
	
	public EmpleadoImpuestoRentaSessionBeanAdditional getEmpleadoImpuestoRentaSessionBeanAdditional() {
		return this.empleadoimpuestorentaSessionBeanAdditional;
	}
	
	public void setEmpleadoImpuestoRentaSessionBeanAdditional(EmpleadoImpuestoRentaSessionBeanAdditional empleadoimpuestorentaSessionBeanAdditional) {
		try {
			this.empleadoimpuestorentaSessionBeanAdditional=empleadoimpuestorentaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional empleadoimpuestorentaBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoImpuestoRentaBeanSwingJInternalFrame
	
	public EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional getEmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional() {
		return this.empleadoimpuestorentaBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional(EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional empleadoimpuestorentaBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadoimpuestorentaBeanSwingJInternalFrameAdditional=empleadoimpuestorentaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoImpuestoRentaLogic empleadoimpuestorentaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoImpuestoRenta empleadoimpuestorentaBean;
	public EmpleadoImpuestoRentaConstantesFunciones empleadoimpuestorentaConstantesFunciones;
	//public EmpleadoImpuestoRentaParameterReturnGeneral empleadoimpuestorentaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public AnioLogic anioLogic;
	public MesLogic mesLogic;
	public EstructuraLogic estructuraLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoImpuestoRenta> empleadoimpuestorentas;	
	//public List<EmpleadoImpuestoRenta> empleadoimpuestorentasEliminados;
	//public List<EmpleadoImpuestoRenta> empleadoimpuestorentasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoImpuestoRenta=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoImpuestoRenta=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoImpuestoRenta=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=false;	
	
	
	public Boolean isVisibilidadFK_IdAnio=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdEstructura=false;
	public Boolean isVisibilidadFK_IdMes=false;
	
	public Long getiIdNuevoEmpleadoImpuestoRenta() {
		return this.iIdNuevoEmpleadoImpuestoRenta;
	}

	public void setiIdNuevoEmpleadoImpuestoRenta(Long iIdNuevoEmpleadoImpuestoRenta) {
		this.iIdNuevoEmpleadoImpuestoRenta = iIdNuevoEmpleadoImpuestoRenta;
	}
	
	public Long getidEmpleadoImpuestoRentaActual() {
		return this.idEmpleadoImpuestoRentaActual;
	}

	public void setidEmpleadoImpuestoRentaActual(Long idEmpleadoImpuestoRentaActual) {
		this.idEmpleadoImpuestoRentaActual = idEmpleadoImpuestoRentaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoImpuestoRenta getempleadoimpuestorenta() {
		return this.empleadoimpuestorenta;
	}

	public void setempleadoimpuestorenta(EmpleadoImpuestoRenta empleadoimpuestorenta) {
		this.empleadoimpuestorenta = empleadoimpuestorenta;
	}
	
	public EmpleadoImpuestoRenta getempleadoimpuestorentaAux() {
		return this.empleadoimpuestorentaAux;
	}

	public void setempleadoimpuestorentaAux(EmpleadoImpuestoRenta empleadoimpuestorentaAux) {
		this.empleadoimpuestorentaAux = empleadoimpuestorentaAux;
	}				
	
	public EmpleadoImpuestoRenta getempleadoimpuestorentaAnterior() {
		return this.empleadoimpuestorentaAnterior;
	}

	public void setempleadoimpuestorentaAnterior(EmpleadoImpuestoRenta empleadoimpuestorentaAnterior) {
		this.empleadoimpuestorentaAnterior = empleadoimpuestorentaAnterior;
	}	
	
	public EmpleadoImpuestoRenta getempleadoimpuestorentaTotales() {
		return this.empleadoimpuestorentaTotales;
	}

	public void setempleadoimpuestorentaTotales(EmpleadoImpuestoRenta empleadoimpuestorentaTotales) {
		this.empleadoimpuestorentaTotales = empleadoimpuestorentaTotales;
	}	
	
	public EmpleadoImpuestoRenta getempleadoimpuestorentaBean() {
		return this.empleadoimpuestorentaBean;
	}

	public void setempleadoimpuestorentaBean(EmpleadoImpuestoRenta empleadoimpuestorentaBean) {
		this.empleadoimpuestorentaBean = empleadoimpuestorentaBean;
	}	
	
	public EmpleadoImpuestoRentaParameterReturnGeneral getempleadoimpuestorentaReturnGeneral() {
		return this.empleadoimpuestorentaReturnGeneral;
	}

	public void setempleadoimpuestorentaReturnGeneral(EmpleadoImpuestoRentaParameterReturnGeneral empleadoimpuestorentaReturnGeneral) {
		this.empleadoimpuestorentaReturnGeneral = empleadoimpuestorentaReturnGeneral;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EmpleadoImpuestoRentaLogic getEmpleadoImpuestoRentaLogic()	{		
		return empleadoimpuestorentaLogic;
	}

	public void setEmpleadoImpuestoRentaLogic(EmpleadoImpuestoRentaLogic empleadoimpuestorentaLogic) {
		this.empleadoimpuestorentaLogic = empleadoimpuestorentaLogic;
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
	
	public Boolean getIsEsNuevoEmpleadoImpuestoRenta() {
		return isEsNuevoEmpleadoImpuestoRenta;
	}

	public void setIsEsNuevoEmpleadoImpuestoRenta(Boolean isEsNuevoEmpleadoImpuestoRenta) {
		this.isEsNuevoEmpleadoImpuestoRenta = isEsNuevoEmpleadoImpuestoRenta;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoImpuestoRenta() {
		return esParaAccionDesdeFormularioEmpleadoImpuestoRenta;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoImpuestoRenta(Boolean esParaAccionDesdeFormularioEmpleadoImpuestoRenta) {
		this.esParaAccionDesdeFormularioEmpleadoImpuestoRenta = esParaAccionDesdeFormularioEmpleadoImpuestoRenta;
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

			if(this.empleadoimpuestorentaSessionBean==null) {
				this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
			}

			if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empleadoimpuestorentaSessionBean.getlidEmpresaActual());
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

			if(this.empleadoimpuestorentaSessionBean==null) {
				this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
			}

			if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(empleadoimpuestorentaSessionBean.getlidEmpleadoActual());
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

			if(this.empleadoimpuestorentaSessionBean==null) {
				this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
			}

			if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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
					anioLogic.getEntityWithConnection(empleadoimpuestorentaSessionBean.getlidAnioActual());
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

			if(this.empleadoimpuestorentaSessionBean==null) {
				this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
			}

			if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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
					mesLogic.getEntityWithConnection(empleadoimpuestorentaSessionBean.getlidMesActual());
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

			if(this.empleadoimpuestorentaSessionBean==null) {
				this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
			}

			if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
					estructuraLogic.getEntityWithConnection(empleadoimpuestorentaSessionBean.getlidEstructuraActual());
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

					if(this.empleadoimpuestorenta!=null) {
						this.empleadoimpuestorenta.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
						this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoImpuestoRenta.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoImpuestoRentaGenerico)throws Exception
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
				jComboBoxid_empresaEmpleadoImpuestoRentaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoImpuestoRentaGenerico!=null && jComboBoxid_empresaEmpleadoImpuestoRentaGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoImpuestoRentaGenerico.setSelectedIndex(0);
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

					if(this.empleadoimpuestorenta!=null) {
						this.empleadoimpuestorenta.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
						this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoImpuestoRenta.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoImpuestoRentaGenerico)throws Exception
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
				jComboBoxid_empleadoEmpleadoImpuestoRentaGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoImpuestoRentaGenerico!=null && jComboBoxid_empleadoEmpleadoImpuestoRentaGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoImpuestoRentaGenerico.setSelectedIndex(0);
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

					if(this.empleadoimpuestorenta!=null) {
						this.empleadoimpuestorenta.setAnio(anioTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
						this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.setSelectedItem(anioTemp);
					}
				} else {
					//jComboBoxid_anioEmpleadoImpuestoRenta.setSelectedItem(anioTemp);
					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){
					if(anioTemp!=null && jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta!=null) {
						jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.setSelectedItem(anioTemp);
					} else {
						if(jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta!=null) {
							//jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.setSelectedItem(anioTemp);
							if(jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.getItemCount()>0) {
								jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.setSelectedIndex(0);
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
	public void setActualAnioForeignKeyGenerico(Long idAnioSeleccionado,JComboBox jComboBoxid_anioEmpleadoImpuestoRentaGenerico)throws Exception
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
				jComboBoxid_anioEmpleadoImpuestoRentaGenerico.setSelectedItem(anioTemp);
			} else {
				if(jComboBoxid_anioEmpleadoImpuestoRentaGenerico!=null && jComboBoxid_anioEmpleadoImpuestoRentaGenerico.getItemCount()>0) {
					jComboBoxid_anioEmpleadoImpuestoRentaGenerico.setSelectedIndex(0);
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

					if(this.empleadoimpuestorenta!=null) {
						this.empleadoimpuestorenta.setMes(mesTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
						this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.setSelectedItem(mesTemp);
					}
				} else {
					//jComboBoxid_mesEmpleadoImpuestoRenta.setSelectedItem(mesTemp);
					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){
					if(mesTemp!=null && jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta!=null) {
						jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.setSelectedItem(mesTemp);
					} else {
						if(jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta!=null) {
							//jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.setSelectedItem(mesTemp);
							if(jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.getItemCount()>0) {
								jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.setSelectedIndex(0);
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
	public void setActualMesForeignKeyGenerico(Long idMesSeleccionado,JComboBox jComboBoxid_mesEmpleadoImpuestoRentaGenerico)throws Exception
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
				jComboBoxid_mesEmpleadoImpuestoRentaGenerico.setSelectedItem(mesTemp);
			} else {
				if(jComboBoxid_mesEmpleadoImpuestoRentaGenerico!=null && jComboBoxid_mesEmpleadoImpuestoRentaGenerico.getItemCount()>0) {
					jComboBoxid_mesEmpleadoImpuestoRentaGenerico.setSelectedIndex(0);
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

					if(this.empleadoimpuestorenta!=null) {
						this.empleadoimpuestorenta.setEstructura(estructuraTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
						this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.setSelectedItem(estructuraTemp);
					}
				} else {
					//jComboBoxid_estructuraEmpleadoImpuestoRenta.setSelectedItem(estructuraTemp);
					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){
					if(estructuraTemp!=null && jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta!=null) {
						jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setSelectedItem(estructuraTemp);
					} else {
						if(jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta!=null) {
							//jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setSelectedItem(estructuraTemp);
							if(jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.getItemCount()>0) {
								jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setSelectedIndex(0);
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
	public void setActualEstructuraForeignKeyGenerico(Long idEstructuraSeleccionado,JComboBox jComboBoxid_estructuraEmpleadoImpuestoRentaGenerico)throws Exception
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
				jComboBoxid_estructuraEmpleadoImpuestoRentaGenerico.setSelectedItem(estructuraTemp);
			} else {
				if(jComboBoxid_estructuraEmpleadoImpuestoRentaGenerico!=null && jComboBoxid_estructuraEmpleadoImpuestoRentaGenerico.getItemCount()>0) {
					jComboBoxid_estructuraEmpleadoImpuestoRentaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoImpuestoRenta empleadoimpuestorenta,JComboBox jComboBoxid_empresaEmpleadoImpuestoRentaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoImpuestoRentaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoImpuestoRentaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadoimpuestorenta.setid_empresa(empresaAux.getId());
				empleadoimpuestorenta.setempresa_descripcion(EmpleadoImpuestoRentaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadoimpuestorenta.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoImpuestoRenta empleadoimpuestorenta,JComboBox jComboBoxid_empleadoEmpleadoImpuestoRentaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoImpuestoRentaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoImpuestoRentaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadoimpuestorenta.setid_empleado(empleadoAux.getId());
				empleadoimpuestorenta.setempleado_descripcion(EmpleadoImpuestoRentaConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadoimpuestorenta.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarAnioForeignKey(EmpleadoImpuestoRenta empleadoimpuestorenta,JComboBox jComboBoxid_anioEmpleadoImpuestoRentaGenerico)throws Exception
	{
		try
		{
			Anio  anioAux=new Anio();

			if(jComboBoxid_anioEmpleadoImpuestoRentaGenerico==null) {
				anioAux=(Anio)this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.getSelectedItem();
			} else {
				anioAux=(Anio)jComboBoxid_anioEmpleadoImpuestoRentaGenerico.getSelectedItem();
			}

			if(anioAux!=null) {
				empleadoimpuestorenta.setid_anio(anioAux.getId());
				empleadoimpuestorenta.setanio_descripcion(EmpleadoImpuestoRentaConstantesFunciones.getAnioDescripcion(anioAux));
				empleadoimpuestorenta.setAnio(anioAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarMesForeignKey(EmpleadoImpuestoRenta empleadoimpuestorenta,JComboBox jComboBoxid_mesEmpleadoImpuestoRentaGenerico)throws Exception
	{
		try
		{
			Mes  mesAux=new Mes();

			if(jComboBoxid_mesEmpleadoImpuestoRentaGenerico==null) {
				mesAux=(Mes)this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.getSelectedItem();
			} else {
				mesAux=(Mes)jComboBoxid_mesEmpleadoImpuestoRentaGenerico.getSelectedItem();
			}

			if(mesAux!=null) {
				empleadoimpuestorenta.setid_mes(mesAux.getId());
				empleadoimpuestorenta.setmes_descripcion(EmpleadoImpuestoRentaConstantesFunciones.getMesDescripcion(mesAux));
				empleadoimpuestorenta.setMes(mesAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEstructuraForeignKey(EmpleadoImpuestoRenta empleadoimpuestorenta,JComboBox jComboBoxid_estructuraEmpleadoImpuestoRentaGenerico)throws Exception
	{
		try
		{
			Estructura  estructuraAux=new Estructura();

			if(jComboBoxid_estructuraEmpleadoImpuestoRentaGenerico==null) {
				estructuraAux=(Estructura)this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.getSelectedItem();
			} else {
				estructuraAux=(Estructura)jComboBoxid_estructuraEmpleadoImpuestoRentaGenerico.getSelectedItem();
			}

			if(estructuraAux!=null && estructuraAux.getId()!=null) {
				empleadoimpuestorenta.setid_estructura(estructuraAux.getId());
				empleadoimpuestorenta.setestructura_descripcion(EmpleadoImpuestoRentaConstantesFunciones.getEstructuraDescripcion(estructuraAux));
				empleadoimpuestorenta.setEstructura(estructuraAux);			}
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

					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { 
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { 
					}

					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { 
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { 
					}

					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.addItem(empleado);
							}
						}

						if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { 
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.addItem(anio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { 
					}

					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdAnio") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.removeAllItems();

							for(Anio anio:this.aniosForeignKey) {
								this.jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.addItem(anio);
							}
						}

						if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { 
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.addItem(mes);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { 
					}

					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdMes") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.removeAllItems();

							for(Mes mes:this.messForeignKey) {
								this.jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.addItem(mes);
							}
						}

						if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { 
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.addItem(estructura);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { 
					}

					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEstructura") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.removeAllItems();

							for(Estructura estructura:this.estructurasForeignKey) {
								this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.addItem(estructura);
							}
						}

						if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.setSelectedItem(anio);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.setSelectedItem(anio);
						} else {
							this.jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.setSelectedItem(mes);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.setSelectedItem(mes);
						} else {
							this.jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.setSelectedItem(estructura);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setSelectedItem(estructura);
						} else {
							this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoImpuestoRenta() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoImpuestoRentaConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoImpuestoRenta(this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoImpuestoRentaConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoImpuestoRenta(this.empleadoimpuestorentas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Anio.class));
		classes.add(new Classe(Mes.class));
		classes.add(new Classe(Estructura.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(this.empleadoimpuestorentas);
			empleadoimpuestorentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpleadoImpuestoRentaParameterReturnGeneral getEmpleadoImpuestoRentaParameterGeneral() {
		return this.empleadoimpuestorentaParameterGeneral;
	}
	
	public void setEmpleadoImpuestoRentaParameterGeneral(EmpleadoImpuestoRentaParameterReturnGeneral empleadoimpuestorentaParameterGeneral) {
		this.empleadoimpuestorentaParameterGeneral = empleadoimpuestorentaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpleadoImpuestoRenta() {
		return isPermisoTodoEmpleadoImpuestoRenta;
	}

	public void setIsPermisoTodoEmpleadoImpuestoRenta(Boolean isPermisoTodoEmpleadoImpuestoRenta) {
		this.isPermisoTodoEmpleadoImpuestoRenta = isPermisoTodoEmpleadoImpuestoRenta;
	}

	public Boolean getIsPermisoNuevoEmpleadoImpuestoRenta() {
		return isPermisoNuevoEmpleadoImpuestoRenta;
	}

	public void setIsPermisoNuevoEmpleadoImpuestoRenta(Boolean isPermisoNuevoEmpleadoImpuestoRenta) {
		this.isPermisoNuevoEmpleadoImpuestoRenta = isPermisoNuevoEmpleadoImpuestoRenta;
	}

	public Boolean getIsPermisoActualizarEmpleadoImpuestoRenta() {
		return isPermisoActualizarEmpleadoImpuestoRenta;
	}

	public void setIsPermisoActualizarEmpleadoImpuestoRenta(Boolean isPermisoActualizarEmpleadoImpuestoRenta) {
		this.isPermisoActualizarEmpleadoImpuestoRenta = isPermisoActualizarEmpleadoImpuestoRenta;
	}

	public Boolean getIsPermisoEliminarEmpleadoImpuestoRenta() {
		return isPermisoEliminarEmpleadoImpuestoRenta;
	}

	public void setIsPermisoEliminarEmpleadoImpuestoRenta(Boolean isPermisoEliminarEmpleadoImpuestoRenta) {
		this.isPermisoEliminarEmpleadoImpuestoRenta = isPermisoEliminarEmpleadoImpuestoRenta;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoImpuestoRenta() {
		return isPermisoGuardarCambiosEmpleadoImpuestoRenta;
	}

	public void setIsPermisoGuardarCambiosEmpleadoImpuestoRenta(Boolean isPermisoGuardarCambiosEmpleadoImpuestoRenta) {
		this.isPermisoGuardarCambiosEmpleadoImpuestoRenta = isPermisoGuardarCambiosEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoImpuestoRenta() {
		return isPermisoConsultaEmpleadoImpuestoRenta;
	}

	public void setIsPermisoConsultaEmpleadoImpuestoRenta(Boolean isPermisoConsultaEmpleadoImpuestoRenta) {
		this.isPermisoConsultaEmpleadoImpuestoRenta = isPermisoConsultaEmpleadoImpuestoRenta;
	}

	public Boolean getIsPermisoBusquedaEmpleadoImpuestoRenta() {
		return isPermisoBusquedaEmpleadoImpuestoRenta;
	}

	public void setIsPermisoBusquedaEmpleadoImpuestoRenta(Boolean isPermisoBusquedaEmpleadoImpuestoRenta) {
		this.isPermisoBusquedaEmpleadoImpuestoRenta = isPermisoBusquedaEmpleadoImpuestoRenta;
	}

	public Boolean getIsPermisoReporteEmpleadoImpuestoRenta() {
		return isPermisoReporteEmpleadoImpuestoRenta;
	}

	public void setIsPermisoReporteEmpleadoImpuestoRenta(Boolean isPermisoReporteEmpleadoImpuestoRenta) {
		this.isPermisoReporteEmpleadoImpuestoRenta = isPermisoReporteEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoImpuestoRenta() {
		return isPermisoPaginacionMedioEmpleadoImpuestoRenta;
	}

	public void setIsPermisoPaginacionMedioEmpleadoImpuestoRenta(Boolean isPermisoPaginacionMedioEmpleadoImpuestoRenta) {
		this.isPermisoPaginacionMedioEmpleadoImpuestoRenta = isPermisoPaginacionMedioEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoImpuestoRenta() {
		return isPermisoPaginacionTodoEmpleadoImpuestoRenta;
	}

	public void setIsPermisoPaginacionTodoEmpleadoImpuestoRenta(Boolean isPermisoPaginacionTodoEmpleadoImpuestoRenta) {
		this.isPermisoPaginacionTodoEmpleadoImpuestoRenta = isPermisoPaginacionTodoEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoImpuestoRenta() {
		return isPermisoPaginacionAltoEmpleadoImpuestoRenta;
	}

	public void setIsPermisoPaginacionAltoEmpleadoImpuestoRenta(Boolean isPermisoPaginacionAltoEmpleadoImpuestoRenta) {
		this.isPermisoPaginacionAltoEmpleadoImpuestoRenta = isPermisoPaginacionAltoEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoImpuestoRenta() {
		return isPermisoCopiarEmpleadoImpuestoRenta;
	}

	public void setIsPermisoCopiarEmpleadoImpuestoRenta(Boolean isPermisoCopiarEmpleadoImpuestoRenta) {
		this.isPermisoCopiarEmpleadoImpuestoRenta = isPermisoCopiarEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoImpuestoRenta() {
		return isPermisoVerFormEmpleadoImpuestoRenta;
	}

	public void setIsPermisoVerFormEmpleadoImpuestoRenta(Boolean isPermisoVerFormEmpleadoImpuestoRenta) {
		this.isPermisoVerFormEmpleadoImpuestoRenta = isPermisoVerFormEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoImpuestoRenta() {
		return isPermisoDuplicarEmpleadoImpuestoRenta;
	}

	public void setIsPermisoDuplicarEmpleadoImpuestoRenta(Boolean isPermisoDuplicarEmpleadoImpuestoRenta) {
		this.isPermisoDuplicarEmpleadoImpuestoRenta = isPermisoDuplicarEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoImpuestoRenta() {
		return isPermisoOrdenEmpleadoImpuestoRenta;
	}

	public void setIsPermisoOrdenEmpleadoImpuestoRenta(Boolean isPermisoOrdenEmpleadoImpuestoRenta) {
		this.isPermisoOrdenEmpleadoImpuestoRenta = isPermisoOrdenEmpleadoImpuestoRenta;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaNuevoEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaNuevoEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta = isVisibilidadCeldaNuevoEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta = isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaCopiarEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaCopiarEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaCopiarEmpleadoImpuestoRenta = isVisibilidadCeldaCopiarEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaVerFormEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaVerFormEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaVerFormEmpleadoImpuestoRenta = isVisibilidadCeldaVerFormEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaOrdenEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaOrdenEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaOrdenEmpleadoImpuestoRenta = isVisibilidadCeldaOrdenEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta = isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaModificarEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaModificarEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta = isVisibilidadCeldaModificarEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaActualizarEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaActualizarEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta = isVisibilidadCeldaActualizarEmpleadoImpuestoRenta;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaEliminarEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaEliminarEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta = isVisibilidadCeldaEliminarEmpleadoImpuestoRenta;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaCancelarEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaCancelarEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta = isVisibilidadCeldaCancelarEmpleadoImpuestoRenta;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaGuardarEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaGuardarEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta = isVisibilidadCeldaGuardarEmpleadoImpuestoRenta;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta = isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta;
	}
		
	public EmpleadoImpuestoRentaSessionBean getempleadoimpuestorentaSessionBean() {
		return this.empleadoimpuestorentaSessionBean;
	}
	
	public void setempleadoimpuestorentaSessionBean(EmpleadoImpuestoRentaSessionBean empleadoimpuestorentaSessionBean) {
		this.empleadoimpuestorentaSessionBean=empleadoimpuestorentaSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadoimpuestorenta,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadoimpuestorenta,null);
				this.setActualParaGuardarAnioForeignKey(empleadoimpuestorenta,null);
				this.setActualParaGuardarMesForeignKey(empleadoimpuestorenta,null);
				this.setActualParaGuardarEstructuraForeignKey(empleadoimpuestorenta,null);
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
	
	public void bugActualizarReferenciaActual(EmpleadoImpuestoRenta empleadoimpuestorenta,EmpleadoImpuestoRenta empleadoimpuestorentaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoImpuestoRenta(empleadoimpuestorenta);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadoimpuestorentaAux.setId(empleadoimpuestorenta.getId());
		empleadoimpuestorentaAux.setVersionRow(empleadoimpuestorenta.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoImpuestoRenta();
		
			int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadoimpuestorentaValidator.getInvalidValues(this.empleadoimpuestorenta);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadoimpuestorentaLogic.setDatosCliente(datosCliente);
			empleadoimpuestorentaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadoimpuestorentaAux=new  EmpleadoImpuestoRenta();
				
				empleadoimpuestorentaAux.setIsNew(true);
				empleadoimpuestorentaAux.setIsChanged(true);
				
				empleadoimpuestorentaAux.setEmpleadoImpuestoRentaOriginal(this.empleadoimpuestorenta);
				
				empleadoimpuestorentaAux.setId(this.empleadoimpuestorenta.getId());	
				empleadoimpuestorentaAux.setVersionRow(this.empleadoimpuestorenta.getVersionRow());	
				empleadoimpuestorentaAux.setid_empresa(this.empleadoimpuestorenta.getid_empresa());	
				empleadoimpuestorentaAux.setid_empleado(this.empleadoimpuestorenta.getid_empleado());	
				empleadoimpuestorentaAux.setid_anio(this.empleadoimpuestorenta.getid_anio());	
				empleadoimpuestorentaAux.setid_mes(this.empleadoimpuestorenta.getid_mes());	
				empleadoimpuestorentaAux.setid_estructura(this.empleadoimpuestorenta.getid_estructura());	
				empleadoimpuestorentaAux.setfecha(this.empleadoimpuestorenta.getfecha());	
				empleadoimpuestorentaAux.setvalor_pago(this.empleadoimpuestorenta.getvalor_pago());	
				empleadoimpuestorentaAux.setingreso_liquido(this.empleadoimpuestorenta.getingreso_liquido());	
				empleadoimpuestorentaAux.setaporte_iess(this.empleadoimpuestorenta.getaporte_iess());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentaLogic.saveEmpleadoImpuestoRentas();//WithConnection
						//empleadoimpuestorentaLogic.getSetVersionRowEmpleadoImpuestoRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoimpuestorenta,empleadoimpuestorentaAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoImpuestoRenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoimpuestorentaLogic.saveEmpleadoImpuestoRentaRelaciones(empleadoimpuestorentaAux);//WithConnection
								//empleadoimpuestorentaLogic.getSetVersionRowEmpleadoImpuestoRentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoimpuestorenta,empleadoimpuestorentaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoimpuestorenta,empleadoimpuestorentaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadoimpuestorentaAux=new  EmpleadoImpuestoRenta();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() 
					|| (this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() && this.empleadoimpuestorenta.getId()>=0)) {
						
					empleadoimpuestorentaAux.setIsNew(false);
				}
				
				empleadoimpuestorentaAux.setIsDeleted(false);
			
				empleadoimpuestorentaAux.setId(this.empleadoimpuestorenta.getId());	
				empleadoimpuestorentaAux.setVersionRow(this.empleadoimpuestorenta.getVersionRow());	
				empleadoimpuestorentaAux.setid_empresa(this.empleadoimpuestorenta.getid_empresa());	
				empleadoimpuestorentaAux.setid_empleado(this.empleadoimpuestorenta.getid_empleado());	
				empleadoimpuestorentaAux.setid_anio(this.empleadoimpuestorenta.getid_anio());	
				empleadoimpuestorentaAux.setid_mes(this.empleadoimpuestorenta.getid_mes());	
				empleadoimpuestorentaAux.setid_estructura(this.empleadoimpuestorenta.getid_estructura());	
				empleadoimpuestorentaAux.setfecha(this.empleadoimpuestorenta.getfecha());	
				empleadoimpuestorentaAux.setvalor_pago(this.empleadoimpuestorenta.getvalor_pago());	
				empleadoimpuestorentaAux.setingreso_liquido(this.empleadoimpuestorenta.getingreso_liquido());	
				empleadoimpuestorentaAux.setaporte_iess(this.empleadoimpuestorenta.getaporte_iess());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentaLogic.saveEmpleadoImpuestoRentas();//WithConnection
						//empleadoimpuestorentaLogic.getSetVersionRowEmpleadoImpuestoRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoimpuestorenta,empleadoimpuestorentaAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoImpuestoRenta();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoimpuestorentaLogic.saveEmpleadoImpuestoRentaRelaciones(empleadoimpuestorentaAux);//WithConnection
								//empleadoimpuestorentaLogic.getSetVersionRowEmpleadoImpuestoRentas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoimpuestorenta,empleadoimpuestorentaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoimpuestorenta,empleadoimpuestorentaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadoimpuestorentaAux=new  EmpleadoImpuestoRenta();
				
				empleadoimpuestorentaAux.setIsNew(false);
				empleadoimpuestorentaAux.setIsChanged(false);
				
				empleadoimpuestorentaAux.setIsDeleted(true);
				
				empleadoimpuestorentaAux.setId(this.empleadoimpuestorenta.getId());	
				empleadoimpuestorentaAux.setVersionRow(this.empleadoimpuestorenta.getVersionRow());	
				empleadoimpuestorentaAux.setid_empresa(this.empleadoimpuestorenta.getid_empresa());	
				empleadoimpuestorentaAux.setid_empleado(this.empleadoimpuestorenta.getid_empleado());	
				empleadoimpuestorentaAux.setid_anio(this.empleadoimpuestorenta.getid_anio());	
				empleadoimpuestorentaAux.setid_mes(this.empleadoimpuestorenta.getid_mes());	
				empleadoimpuestorentaAux.setid_estructura(this.empleadoimpuestorenta.getid_estructura());	
				empleadoimpuestorentaAux.setfecha(this.empleadoimpuestorenta.getfecha());	
				empleadoimpuestorentaAux.setvalor_pago(this.empleadoimpuestorenta.getvalor_pago());	
				empleadoimpuestorentaAux.setingreso_liquido(this.empleadoimpuestorenta.getingreso_liquido());	
				empleadoimpuestorentaAux.setaporte_iess(this.empleadoimpuestorenta.getaporte_iess());	
				
				if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadoimpuestorentaAux.getId()>=0) {	
						this.empleadoimpuestorentasEliminados.add(empleadoimpuestorentaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentaLogic.saveEmpleadoImpuestoRentas();//WithConnection
						//empleadoimpuestorentaLogic.getSetVersionRowEmpleadoImpuestoRentas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoimpuestorentaLogic.saveEmpleadoImpuestoRentaRelaciones(empleadoimpuestorentaAux);//WithConnection
								//empleadoimpuestorentaLogic.getSetVersionRowEmpleadoImpuestoRentas();//WithConnection
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
							if(this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadoimpuestorentaAux,empleadoimpuestorentas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().addAll(this.empleadoimpuestorentasEliminados);
					
					empleadoimpuestorentaLogic.saveEmpleadoImpuestoRentas();//WithConnection
					//empleadoimpuestorentaLogic.getSetVersionRowEmpleadoImpuestoRentas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoImpuestoRenta();
				
				this.empleadoimpuestorentasEliminados= new ArrayList<EmpleadoImpuestoRenta>();		
			}
			
			if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Impuesto Renta GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadoimpuestorenta=empleadoimpuestorentaAux;
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
      		//this.finishProcessEmpleadoImpuestoRenta();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoImpuestoRenta empleadoimpuestorentaLocal) throws Exception {
		
		if(this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoImpuestoRenta empleadoimpuestorentaLocal) throws Exception {	
		if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadoimpuestorentaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadoimpuestorentaLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(AnioDetalleFormJInternalFrame.class)) {
				AnioBeanSwingJInternalFrame anioBeanSwingJInternalFrameLocal=(AnioBeanSwingJInternalFrame) ((AnioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				anioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoAnio(anioBeanSwingJInternalFrameLocal.getanio(),true);
				anioBeanSwingJInternalFrameLocal.actualizarLista(anioBeanSwingJInternalFrameLocal.anio,this.aniosForeignKey);

				anioBeanSwingJInternalFrameLocal.actualizarRelaciones(anioBeanSwingJInternalFrameLocal.anio);

				empleadoimpuestorentaLocal.setAnio(anioBeanSwingJInternalFrameLocal.anio);

				this.addItemDefectoCombosForeignKeyAnio();
				this.cargarCombosFrameAniosForeignKey("Formulario");
				this.setActualAnioForeignKey(anioBeanSwingJInternalFrameLocal.anio.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(MesDetalleFormJInternalFrame.class)) {
				MesBeanSwingJInternalFrame mesBeanSwingJInternalFrameLocal=(MesBeanSwingJInternalFrame) ((MesDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				mesBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoMes(mesBeanSwingJInternalFrameLocal.getmes(),true);
				mesBeanSwingJInternalFrameLocal.actualizarLista(mesBeanSwingJInternalFrameLocal.mes,this.messForeignKey);

				mesBeanSwingJInternalFrameLocal.actualizarRelaciones(mesBeanSwingJInternalFrameLocal.mes);

				empleadoimpuestorentaLocal.setMes(mesBeanSwingJInternalFrameLocal.mes);

				this.addItemDefectoCombosForeignKeyMes();
				this.cargarCombosFrameMessForeignKey("Formulario");
				this.setActualMesForeignKey(mesBeanSwingJInternalFrameLocal.mes.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EstructuraDetalleFormJInternalFrame.class)) {
				EstructuraBeanSwingJInternalFrame estructuraBeanSwingJInternalFrameLocal=(EstructuraBeanSwingJInternalFrame) ((EstructuraDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				estructuraBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEstructura(estructuraBeanSwingJInternalFrameLocal.getestructura(),true);
				estructuraBeanSwingJInternalFrameLocal.actualizarLista(estructuraBeanSwingJInternalFrameLocal.estructura,this.estructurasForeignKey);

				estructuraBeanSwingJInternalFrameLocal.actualizarRelaciones(estructuraBeanSwingJInternalFrameLocal.estructura);

				empleadoimpuestorentaLocal.setEstructura(estructuraBeanSwingJInternalFrameLocal.estructura);

				this.addItemDefectoCombosForeignKeyEstructura();
				this.cargarCombosFrameEstructurasForeignKey("Formulario");
				this.setActualEstructuraForeignKey(estructuraBeanSwingJInternalFrameLocal.estructura.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoImpuestoRentaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadoimpuestorentaValidator.getInvalidValues(this.empleadoimpuestorenta);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoImpuestoRenta empleadoimpuestorenta,List<EmpleadoImpuestoRenta> empleadoimpuestorentas) throws Exception {
		try	{		
			EmpleadoImpuestoRentaConstantesFunciones.actualizarLista(empleadoimpuestorenta,empleadoimpuestorentas,this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoImpuestoRenta empleadoimpuestorenta,List<EmpleadoImpuestoRenta> empleadoimpuestorentas) throws Exception {
		try	{			
			EmpleadoImpuestoRentaConstantesFunciones.actualizarSelectedLista(empleadoimpuestorenta,empleadoimpuestorentas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoImpuestoRenta> empleadoimpuestorentasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadoimpuestorentasLocal=this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadoimpuestorentasLocal=this.empleadoimpuestorentas;
			}
			//ARCHITECTURE
		
			for(EmpleadoImpuestoRenta empleadoimpuestorentaLocal:empleadoimpuestorentasLocal) {
				if(this.permiteMantenimiento(empleadoimpuestorentaLocal) && empleadoimpuestorentaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpleadoImpuestoRentaConstantesFunciones.getEmpleadoImpuestoRentaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoImpuestoRentaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelid_empresaEmpleadoImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoImpuestoRentaConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelid_empleadoEmpleadoImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoImpuestoRentaConstantesFunciones.IDANIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelid_anioEmpleadoImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoImpuestoRentaConstantesFunciones.IDMES)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelid_mesEmpleadoImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoImpuestoRentaConstantesFunciones.IDESTRUCTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelid_estructuraEmpleadoImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoImpuestoRentaConstantesFunciones.FECHA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelfechaEmpleadoImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoImpuestoRentaConstantesFunciones.VALORPAGO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelvalor_pagoEmpleadoImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoImpuestoRentaConstantesFunciones.INGRESOLIQUIDO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelingreso_liquidoEmpleadoImpuestoRenta,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoImpuestoRentaConstantesFunciones.APORTEIESS)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelaporte_iessEmpleadoImpuestoRenta,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelid_empresaEmpleadoImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelid_empleadoEmpleadoImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelid_anioEmpleadoImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelid_mesEmpleadoImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelid_estructuraEmpleadoImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelfechaEmpleadoImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelvalor_pagoEmpleadoImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelingreso_liquidoEmpleadoImpuestoRenta,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelaporte_iessEmpleadoImpuestoRenta,"");
		
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
		this.iIdNuevoEmpleadoImpuestoRenta--;	
		
		
		this.empleadoimpuestorentaAux=new EmpleadoImpuestoRenta();
		
		this.empleadoimpuestorentaAux.setId(this.iIdNuevoEmpleadoImpuestoRenta);
		this.empleadoimpuestorentaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().add(this.empleadoimpuestorentaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadoimpuestorentas.add(this.empleadoimpuestorentaAux);
		}
		//ARCHITECTURE
		
		this.empleadoimpuestorenta=this.empleadoimpuestorentaAux;
		
		if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
		}
				
		//this.setDefaultControlesEmpleadoImpuestoRenta();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoImpuestoRenta();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoImpuestoRenta();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoImpuestoRenta();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorentaBean,this.empleadoimpuestorenta,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoImpuestoRentaConstantesFunciones.getClassesRelationshipsOfEmpleadoImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadoimpuestorentaReturnGeneral=empleadoimpuestorentaLogic.procesarEventosEmpleadoImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas(),this.empleadoimpuestorenta,this.empleadoimpuestorentaParameterGeneral,this.isEsNuevoEmpleadoImpuestoRenta,classes);//this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRenta()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoImpuestoRenta(this.empleadoimpuestorentaReturnGeneral,this.empleadoimpuestorentaBean,false);
		
		if(this.empleadoimpuestorentaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoImpuestoRenta(this.empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRenta());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoImpuestoRenta(this.empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRenta());
		}
		
		if(this.empleadoimpuestorentaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoImpuestoRenta(this.empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRenta(),classes);//this.empleadoimpuestorentaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoImpuestoRenta();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoImpuestoRenta();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoImpuestoRenta(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
						
			if(empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoImpuestoRenta();
			}
			
			this.actualizarVisualTableDatosEmpleadoImpuestoRenta();
			
			this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoEmpleadoImpuestoRenta(), this.getIndiceNuevoEmpleadoImpuestoRenta());
			
			this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoImpuestoRenta(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jDateChooserfechaEmpleadoImpuestoRenta.setEnabled(isHabilitar && this.empleadoimpuestorentaConstantesFunciones.activarfechaEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldvalor_pagoEmpleadoImpuestoRenta.setEnabled(isHabilitar && this.empleadoimpuestorentaConstantesFunciones.activarvalor_pagoEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setEnabled(isHabilitar && this.empleadoimpuestorentaConstantesFunciones.activaringreso_liquidoEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldaporte_iessEmpleadoImpuestoRenta.setEnabled(isHabilitar && this.empleadoimpuestorentaConstantesFunciones.activaraporte_iessEmpleadoImpuestoRenta);	
		//
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.setEnabled(isHabilitar && this.empleadoimpuestorentaConstantesFunciones.activarid_empresaEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.setEnabled(isHabilitar && this.empleadoimpuestorentaConstantesFunciones.activarid_empleadoEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.setEnabled(isHabilitar && this.empleadoimpuestorentaConstantesFunciones.activarid_anioEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.setEnabled(isHabilitar && this.empleadoimpuestorentaConstantesFunciones.activarid_mesEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.setEnabled(isHabilitar && this.empleadoimpuestorentaConstantesFunciones.activarid_estructuraEmpleadoImpuestoRenta);
	};
	
	public void setDefaultControlesEmpleadoImpuestoRenta() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoImpuestoRenta(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadoimpuestorentaSessionBean.setConGuardarRelaciones(true);			
			this.empleadoimpuestorentaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTabbedPaneRelacionesEmpleadoImpuestoRenta.setVisible(true);
			
					
		} else {
			//this.empleadoimpuestorentaSessionBean.setConGuardarRelaciones(false);			
			this.empleadoimpuestorentaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTabbedPaneRelacionesEmpleadoImpuestoRenta.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoImpuestoRenta() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
				if(empleadoimpuestorentaAux.getId().equals(this.iIdNuevoEmpleadoImpuestoRenta)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentas) {
				if(empleadoimpuestorentaAux.getId().equals(this.iIdNuevoEmpleadoImpuestoRenta)) {
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
	
	public int getIndiceActualEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
				if(empleadoimpuestorentaAux.getId().equals(empleadoimpuestorenta.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentas) {
				if(empleadoimpuestorentaAux.getId().equals(empleadoimpuestorenta.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorentaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
				if(empleadoimpuestorentaAux.getEmpleadoImpuestoRentaOriginal().getId().equals(empleadoimpuestorentaOriginal.getId())) {
					existe=true;
					empleadoimpuestorentaOriginal.setId(empleadoimpuestorentaAux.getId());
					empleadoimpuestorentaOriginal.setVersionRow(empleadoimpuestorentaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentas) {
				if(empleadoimpuestorentaAux.getEmpleadoImpuestoRentaOriginal().getId().equals(empleadoimpuestorentaOriginal.getId())) {
					existe=true;
					empleadoimpuestorentaOriginal.setId(empleadoimpuestorentaAux.getId());
					empleadoimpuestorentaOriginal.setVersionRow(empleadoimpuestorentaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoImpuestoRenta(Boolean esParaCancelar) throws Exception {
		empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
		empleadoimpuestorentaAux=new EmpleadoImpuestoRenta();
		
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
					if(empleadoimpuestorentaAux.getId()<0) {
						empleadoimpuestorentasAux.add(empleadoimpuestorentaAux);
					}		
				}
				this.iIdNuevoEmpleadoImpuestoRenta=0L;
				this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().removeAll(empleadoimpuestorentasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentas) {
					if(empleadoimpuestorentaAux.getId()<0) {
						empleadoimpuestorentasAux.add(empleadoimpuestorentaAux);
					}		
				}
				this.iIdNuevoEmpleadoImpuestoRenta=0L;
				this.empleadoimpuestorentas.removeAll(empleadoimpuestorentasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoImpuestoRenta 
					&& this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size()>0
					) {
					empleadoimpuestorentaAux=this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().get(this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size() - 1);
				
					if(empleadoimpuestorentaAux.getId()<0) {
						this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().remove(empleadoimpuestorentaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoImpuestoRenta && this.empleadoimpuestorentas.size()>0) {
					empleadoimpuestorentaAux=this.empleadoimpuestorentas.get(this.empleadoimpuestorentas.size() - 1);
				
					if(empleadoimpuestorentaAux.getId()<0) {
						this.empleadoimpuestorentas.remove(empleadoimpuestorentaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoImpuestoRenta(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadoimpuestorenta.getId()<0) {
				this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().remove(this.empleadoimpuestorenta);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadoimpuestorenta.getId()<0) {
				this.empleadoimpuestorentas.remove(this.empleadoimpuestorenta);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoImpuestoRenta(List<EmpleadoImpuestoRenta> empleadoimpuestorentasAux) throws Exception {
		EmpleadoImpuestoRentaConstantesFunciones.setEstadosInicialesEmpleadoImpuestoRenta(empleadoimpuestorentasAux);
	}
	
	public void setEstadosInicialesEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorentaAux) throws Exception {
		EmpleadoImpuestoRentaConstantesFunciones.setEstadosInicialesEmpleadoImpuestoRenta(empleadoimpuestorentaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoImpuestoRentaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoImpuestoRentaActual()) {
				if(!this.isEsNuevoEmpleadoImpuestoRenta) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoImpuestoRenta=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoImpuestoRentaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Impuesto Renta ?", "MANTENIMIENTO DE Empleado Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoImpuestoRenta empleadoimpuestorenta) throws Exception {
		EmpleadoImpuestoRentaConstantesFunciones.seleccionarAsignar(this.empleadoimpuestorenta,empleadoimpuestorenta);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoImpuestoRenta=this.isPermisoActualizarOriginalEmpleadoImpuestoRenta;
			
			
			this.seleccionarAsignar(empleadoimpuestorenta);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoImpuestoRentaConstantesFunciones.quitarEspaciosEmpleadoImpuestoRenta(this.empleadoimpuestorenta,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadoimpuestorentaSessionBean.setsFuncionBusquedaRapida(this.empleadoimpuestorentaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEmpleadoImpuestoRenta) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoImpuestoRenta(esParaCancelar);				
				this.cancelarNuevoEmpleadoImpuestoRenta(esParaCancelar);								
			}
			
			this.empleadoimpuestorenta=new EmpleadoImpuestoRenta();
			
			this.inicializarEmpleadoImpuestoRenta();
			
			this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoImpuestoRenta() throws Exception {
		try {
			EmpleadoImpuestoRentaConstantesFunciones.inicializarEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoImpuestoRentas(String sAccionBusqueda,List<EmpleadoImpuestoRenta> empleadoimpuestorentasParaReportes) throws Exception {
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
					sPathReporteFinal="EmpleadoImpuestoRenta"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoImpuestoRentaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoImpuestoRentaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoImpuestoRenta"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empleado Impuesto Rentas");		
		parameters.put("busquedapor", EmpleadoImpuestoRentaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoImpuestoRenta=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoImpuestoRentaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoImpuestoRentaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoImpuestoRenta=new JRBeanArrayDataSource(EmpleadoImpuestoRentaJInternalFrame.TraerEmpleadoImpuestoRentaBeans(empleadoimpuestorentasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoImpuestoRenta);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoImpuestoRentaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoImpuestoRentaBean.TraerEmpleadoImpuestoRentaBeans(empleadoimpuestorentasParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpleadoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,empleadoimpuestorentasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,empleadoimpuestorentasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRentaActionPerformed(null);
					//this.generarExcelReporteEmpleadoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,empleadoimpuestorentasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,empleadoimpuestorentasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,empleadoimpuestorentasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoImpuestoRentas(sAccionBusqueda,sTipoArchivoReporte,empleadoimpuestorentasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoImpuestoRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoImpuestoRenta> empleadoimpuestorentasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoimpuestorenta";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoImpuestoRentas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoImpuestoRenta("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoImpuestoRenta empleadoimpuestorenta : empleadoimpuestorentasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoImpuestoRentaConstantesFunciones.generarExcelReporteDataEmpleadoImpuestoRenta("NORMAL",row,workbook,empleadoimpuestorenta,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoImpuestoRenta(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoImpuestoRentaConstantesFunciones.generarExcelReporteHeaderEmpleadoImpuestoRenta(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoImpuestoRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoImpuestoRenta> empleadoimpuestorentasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoimpuestorenta_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoImpuestoRentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoImpuestoRenta empleadoimpuestorenta : empleadoimpuestorentasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.getEmpleadoImpuestoRentaDescripcion(empleadoimpuestorenta));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoimpuestorenta.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoimpuestorenta.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoimpuestorenta.getanio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoimpuestorenta.getmes_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoimpuestorenta.getestructura_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoimpuestorenta.getfecha());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoimpuestorenta.getvalor_pago());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoimpuestorenta.getingreso_liquido());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoimpuestorenta.getaporte_iess());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoImpuestoRentas(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoImpuestoRenta> empleadoimpuestorentasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoImpuestoRenta> empleadoimpuestorentasRespaldo=null;
		
		classes=EmpleadoImpuestoRentaConstantesFunciones.getClassesRelationshipsOfEmpleadoImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadoimpuestorentaLogic.setDatosCliente(this.datosCliente);
		this.empleadoimpuestorentaLogic.setDatosDeep(this.datosDeep);
		this.empleadoimpuestorentaLogic.setIsConDeep(true);
		
		empleadoimpuestorentasRespaldo=this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas();
		
		this.empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(empleadoimpuestorentasParaReportes);	
		this.empleadoimpuestorentaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadoimpuestorentasParaReportes=this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas();
		this.empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(empleadoimpuestorentasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoimpuestorenta_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoImpuestoRentas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoImpuestoRenta("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoImpuestoRenta empleadoimpuestorenta : empleadoimpuestorentasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoImpuestoRenta("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoImpuestoRentaConstantesFunciones.generarExcelReporteDataEmpleadoImpuestoRenta("NORMAL",row,workbook,empleadoimpuestorenta,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.getEmpleadoImpuestoRentaDescripcion(empleadoimpuestorenta));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoImpuestoRenta() throws Exception {		
		this.startProcessEmpleadoImpuestoRenta(true);
	}
	
	public void startProcessEmpleadoImpuestoRenta(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoImpuestoRenta ,this.jPanelParametrosReportesEmpleadoImpuestoRenta, this.jScrollPanelDatosEmpleadoImpuestoRenta,this.jPanelPaginacionEmpleadoImpuestoRenta, this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta, this.jPanelAccionesEmpleadoImpuestoRenta,this.jPanelAccionesFormularioEmpleadoImpuestoRenta,this.jmenuBarEmpleadoImpuestoRenta,this.jmenuBarDetalleEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,this.jTtoolBarDetalleEmpleadoImpuestoRenta);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoImpuestoRenta=this.jTabbedPaneBusquedasEmpleadoImpuestoRenta; 
		
		final JPanel jPanelParametrosReportesEmpleadoImpuestoRenta=this.jPanelParametrosReportesEmpleadoImpuestoRenta;
		//final JScrollPane jScrollPanelDatosEmpleadoImpuestoRenta=this.jScrollPanelDatosEmpleadoImpuestoRenta;
		final JTable jTableDatosEmpleadoImpuestoRenta=this.jTableDatosEmpleadoImpuestoRenta;		
		final JPanel jPanelPaginacionEmpleadoImpuestoRenta=this.jPanelPaginacionEmpleadoImpuestoRenta;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoImpuestoRenta=this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta;
		final JPanel jPanelAccionesEmpleadoImpuestoRenta=this.jPanelAccionesEmpleadoImpuestoRenta;
		
		JPanel jPanelCamposAuxiliarEmpleadoImpuestoRenta=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoImpuestoRenta=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			jPanelCamposAuxiliarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelCamposEmpleadoImpuestoRenta;
			jPanelAccionesFormularioAuxiliarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelAccionesFormularioEmpleadoImpuestoRenta;
		}
		
		final JPanel jPanelCamposEmpleadoImpuestoRenta=jPanelCamposAuxiliarEmpleadoImpuestoRenta;
		final JPanel jPanelAccionesFormularioEmpleadoImpuestoRenta=jPanelAccionesFormularioAuxiliarEmpleadoImpuestoRenta;
		
		
		final JMenuBar jmenuBarEmpleadoImpuestoRenta=this.jmenuBarEmpleadoImpuestoRenta;
		final JToolBar jTtoolBarEmpleadoImpuestoRenta=this.jTtoolBarEmpleadoImpuestoRenta;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoImpuestoRenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoImpuestoRenta=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			jmenuBarDetalleAuxiliarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jmenuBarDetalleEmpleadoImpuestoRenta;
			jTtoolBarDetalleAuxiliarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTtoolBarDetalleEmpleadoImpuestoRenta;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoImpuestoRenta=jmenuBarDetalleAuxiliarEmpleadoImpuestoRenta;
		final JToolBar jTtoolBarDetalleEmpleadoImpuestoRenta=jTtoolBarDetalleAuxiliarEmpleadoImpuestoRenta;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoImpuestoRenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoImpuestoRenta;
			processRunnable.jTableDatos=jTableDatosEmpleadoImpuestoRenta;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoImpuestoRenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoImpuestoRenta;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoImpuestoRenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoImpuestoRenta;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoImpuestoRenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoImpuestoRenta;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoImpuestoRenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoImpuestoRenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoImpuestoRenta ,jPanelParametrosReportesEmpleadoImpuestoRenta,jTableDatosEmpleadoImpuestoRenta, /*jScrollPanelDatosEmpleadoImpuestoRenta,*/jPanelCamposEmpleadoImpuestoRenta,jPanelPaginacionEmpleadoImpuestoRenta, /*jScrollPanelDatosEdicionEmpleadoImpuestoRenta,*/ jPanelAccionesEmpleadoImpuestoRenta,jPanelAccionesFormularioEmpleadoImpuestoRenta,jmenuBarEmpleadoImpuestoRenta,jmenuBarDetalleEmpleadoImpuestoRenta,jTtoolBarEmpleadoImpuestoRenta,jTtoolBarDetalleEmpleadoImpuestoRenta);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoImpuestoRenta ,jPanelParametrosReportesEmpleadoImpuestoRenta, jScrollPanelDatosEmpleadoImpuestoRenta,jPanelPaginacionEmpleadoImpuestoRenta, jScrollPanelDatosEdicionEmpleadoImpuestoRenta, jPanelAccionesEmpleadoImpuestoRenta,jPanelAccionesFormularioEmpleadoImpuestoRenta,jmenuBarEmpleadoImpuestoRenta,jmenuBarDetalleEmpleadoImpuestoRenta,jTtoolBarEmpleadoImpuestoRenta,jTtoolBarDetalleEmpleadoImpuestoRenta);
						
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
	
	public void finishProcessEmpleadoImpuestoRenta() {// throws Exception 
		this.finishProcessEmpleadoImpuestoRenta(true);
	}
	
	public void finishProcessEmpleadoImpuestoRenta(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoImpuestoRenta ,this.jPanelParametrosReportesEmpleadoImpuestoRenta, this.jScrollPanelDatosEmpleadoImpuestoRenta,this.jPanelPaginacionEmpleadoImpuestoRenta, this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta, this.jPanelAccionesEmpleadoImpuestoRenta,this.jPanelAccionesFormularioEmpleadoImpuestoRenta,this.jmenuBarEmpleadoImpuestoRenta,this.jmenuBarDetalleEmpleadoImpuestoRenta,this.jTtoolBarEmpleadoImpuestoRenta,this.jTtoolBarDetalleEmpleadoImpuestoRenta);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoImpuestoRenta=this.jTabbedPaneBusquedasEmpleadoImpuestoRenta; 
		
		final JPanel jPanelParametrosReportesEmpleadoImpuestoRenta=this.jPanelParametrosReportesEmpleadoImpuestoRenta;
		//final JScrollPane jScrollPanelDatosEmpleadoImpuestoRenta=this.jScrollPanelDatosEmpleadoImpuestoRenta;
		final JTable jTableDatosEmpleadoImpuestoRenta=this.jTableDatosEmpleadoImpuestoRenta;		
		final JPanel jPanelPaginacionEmpleadoImpuestoRenta=this.jPanelPaginacionEmpleadoImpuestoRenta;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoImpuestoRenta=this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta;
		final JPanel jPanelAccionesEmpleadoImpuestoRenta=this.jPanelAccionesEmpleadoImpuestoRenta;
		
		JPanel jPanelCamposAuxiliarEmpleadoImpuestoRenta=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoImpuestoRenta=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			jPanelCamposAuxiliarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelCamposEmpleadoImpuestoRenta;
			jPanelAccionesFormularioAuxiliarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelAccionesFormularioEmpleadoImpuestoRenta;
		}
		
		final JPanel jPanelCamposEmpleadoImpuestoRenta=jPanelCamposAuxiliarEmpleadoImpuestoRenta;
		final JPanel jPanelAccionesFormularioEmpleadoImpuestoRenta=jPanelAccionesFormularioAuxiliarEmpleadoImpuestoRenta;
		
		
		final JMenuBar jmenuBarEmpleadoImpuestoRenta=this.jmenuBarEmpleadoImpuestoRenta;		
		final JToolBar jTtoolBarEmpleadoImpuestoRenta=this.jTtoolBarEmpleadoImpuestoRenta;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoImpuestoRenta=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoImpuestoRenta=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			jmenuBarDetalleAuxiliarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jmenuBarDetalleEmpleadoImpuestoRenta;
			jTtoolBarDetalleAuxiliarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTtoolBarDetalleEmpleadoImpuestoRenta;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoImpuestoRenta=jmenuBarDetalleAuxiliarEmpleadoImpuestoRenta;
		final JToolBar jTtoolBarDetalleEmpleadoImpuestoRenta=jTtoolBarDetalleAuxiliarEmpleadoImpuestoRenta;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoImpuestoRenta;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoImpuestoRenta;
			processRunnable.jTableDatos=jTableDatosEmpleadoImpuestoRenta;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoImpuestoRenta;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoImpuestoRenta;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoImpuestoRenta;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoImpuestoRenta;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoImpuestoRenta;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoImpuestoRenta;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoImpuestoRenta;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoImpuestoRenta;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoImpuestoRenta ,jPanelParametrosReportesEmpleadoImpuestoRenta, jTableDatosEmpleadoImpuestoRenta,/*jScrollPanelDatosEmpleadoImpuestoRenta,*/jPanelCamposEmpleadoImpuestoRenta,jPanelPaginacionEmpleadoImpuestoRenta, /*jScrollPanelDatosEdicionEmpleadoImpuestoRenta,*/ jPanelAccionesEmpleadoImpuestoRenta,jPanelAccionesFormularioEmpleadoImpuestoRenta,jmenuBarEmpleadoImpuestoRenta,jmenuBarDetalleEmpleadoImpuestoRenta,jTtoolBarEmpleadoImpuestoRenta,jTtoolBarDetalleEmpleadoImpuestoRenta));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoImpuestoRenta(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoImpuestoRenta(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoImpuestoRenta(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoImpuestoRenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoImpuestoRenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoImpuestoRenta,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoImpuestoRenta(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoImpuestoRenta,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoImpuestoRenta,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadoimpuestorentaConstantesFunciones.getsFinalQueryEmpleadoImpuestoRenta();
		String  finalQueryPaginacionTodos=this.empleadoimpuestorentaConstantesFunciones.getsFinalQueryEmpleadoImpuestoRenta();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoImpuestoRentaConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoImpuestoRenta(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoImpuestoRentaConstantesFunciones.getArrayColumnasGlobalesEmpleadoImpuestoRenta(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoImpuestoRentaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadoimpuestorentasEliminados= new ArrayList<EmpleadoImpuestoRenta>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoImpuestoRenta();
		
				///*EmpleadoImpuestoRentaSessionBean*/this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
			
			if(this.empleadoimpuestorentaSessionBean==null) {
				this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
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
					this.iNumeroPaginacion=EmpleadoImpuestoRentaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoImpuestoRentaConstantesFunciones.getClassesForeignKeysOfEmpleadoImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadoimpuestorenta."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadoimpuestorentasAux= new ArrayList<EmpleadoImpuestoRenta>();
			
				
			empleadoimpuestorentaLogic.setDatosCliente(this.datosCliente);
			empleadoimpuestorentaLogic.setDatosDeep(this.datosDeep);
			empleadoimpuestorentaLogic.setIsConDeep(true);
			
			
			empleadoimpuestorentaLogic.getEmpleadoImpuestoRentaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadoimpuestorentaLogic.getTodosEmpleadoImpuestoRentas(finalQueryGlobal,pagination);
					
					//empleadoimpuestorentaLogic.getTodosEmpleadoImpuestoRentasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()==null|| empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoimpuestorentasAux= new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentasAux.addAll(empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentasAux= new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentasAux.addAll(empleadoimpuestorentas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoimpuestorentaLogic.getTodosEmpleadoImpuestoRentas(finalQueryGlobal+"",this.pagination);												
							
							//empleadoimpuestorentaLogic.getTodosEmpleadoImpuestoRentasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoImpuestoRentas("Todos",empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(new ArrayList<EmpleadoImpuestoRenta>());					
							empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().addAll(empleadoimpuestorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentas=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentas.addAll(empleadoimpuestorentasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoImpuestoRenta=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoImpuestoRenta=this.idActual;
				
				} else if(this.idEmpleadoImpuestoRentaActual!=null && this.idEmpleadoImpuestoRentaActual!=0L) {
					idEmpleadoImpuestoRenta=idEmpleadoImpuestoRentaActual;
				}
				
					
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndicePorId(idEmpleadoImpuestoRenta);
				
				this.empleadoimpuestorentas=new ArrayList<EmpleadoImpuestoRenta>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadoimpuestorentaLogic.getEntity(idEmpleadoImpuestoRenta);
					
					//empleadoimpuestorentaLogic.getEntityWithConnection(idEmpleadoImpuestoRenta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(new ArrayList<EmpleadoImpuestoRenta>());
					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().add(empleadoimpuestorentaLogic.getEmpleadoImpuestoRenta());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoimpuestorentas=new ArrayList<EmpleadoImpuestoRenta>();
					this.empleadoimpuestorentas.add(empleadoimpuestorenta);
				}
				
				if(empleadoimpuestorentaLogic.getEmpleadoImpuestoRenta()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdAnio")) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()==null||empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoimpuestorentas==null|| empleadoimpuestorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
						empleadoimpuestorentasAux.addAll(empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentasAux.addAll(empleadoimpuestorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdAnio(finalQueryGlobal,pagination,id_anioFK_IdAnio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdAnio(id_anioFK_IdAnio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoImpuestoRentas("FK_IdAnio",empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoImpuestoRentas("FK_IdAnio",empleadoimpuestorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(new ArrayList<EmpleadoImpuestoRenta>());
						empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().addAll(empleadoimpuestorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentas=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentas.addAll(empleadoimpuestorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()==null||empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoimpuestorentas==null|| empleadoimpuestorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
						empleadoimpuestorentasAux.addAll(empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentasAux.addAll(empleadoimpuestorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoImpuestoRentas("FK_IdEmpleado",empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoImpuestoRentas("FK_IdEmpleado",empleadoimpuestorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(new ArrayList<EmpleadoImpuestoRenta>());
						empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().addAll(empleadoimpuestorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentas=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentas.addAll(empleadoimpuestorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()==null||empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoimpuestorentas==null|| empleadoimpuestorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
						empleadoimpuestorentasAux.addAll(empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentasAux.addAll(empleadoimpuestorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoImpuestoRentas("FK_IdEmpresa",empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoImpuestoRentas("FK_IdEmpresa",empleadoimpuestorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(new ArrayList<EmpleadoImpuestoRenta>());
						empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().addAll(empleadoimpuestorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentas=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentas.addAll(empleadoimpuestorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEstructura")) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()==null||empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoimpuestorentas==null|| empleadoimpuestorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
						empleadoimpuestorentasAux.addAll(empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentasAux.addAll(empleadoimpuestorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdEstructura(finalQueryGlobal,pagination,id_estructuraFK_IdEstructura);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdEstructura(id_estructuraFK_IdEstructura);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoImpuestoRentas("FK_IdEstructura",empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoImpuestoRentas("FK_IdEstructura",empleadoimpuestorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(new ArrayList<EmpleadoImpuestoRenta>());
						empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().addAll(empleadoimpuestorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentas=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentas.addAll(empleadoimpuestorentasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdMes")) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()==null||empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoimpuestorentas==null|| empleadoimpuestorentas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
						empleadoimpuestorentasAux.addAll(empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentasAux=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentasAux.addAll(empleadoimpuestorentas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdMes(finalQueryGlobal,pagination,id_mesFK_IdMes);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoImpuestoRentaConstantesFunciones.getDetalleIndiceFK_IdMes(id_mesFK_IdMes);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoImpuestoRentas("FK_IdMes",empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoImpuestoRentas("FK_IdMes",empleadoimpuestorentas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(new ArrayList<EmpleadoImpuestoRenta>());
						empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().addAll(empleadoimpuestorentasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentas=new ArrayList<EmpleadoImpuestoRenta>();
							empleadoimpuestorentas.addAll(empleadoimpuestorentasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoImpuestoRenta();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoImpuestoRenta();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoimpuestorentas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoimpuestorentas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoImpuestoRenta empleadoimpuestorenta) {
		Boolean permite=true;
		
		if(this.empleadoimpuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoImpuestoRentaConstantesFunciones.getOrderByListaEmpleadoImpuestoRenta();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoImpuestoRentaConstantesFunciones.getOrderByListaEmpleadoImpuestoRenta();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
				if(empleadoimpuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoimpuestorentaTotales=empleadoimpuestorenta;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoImpuestoRenta empleadoimpuestorenta:this.empleadoimpuestorentas) {
				if(empleadoimpuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoimpuestorentaTotales=empleadoimpuestorenta;
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
			this.empleadoimpuestorentaAux=new EmpleadoImpuestoRenta();
			this.empleadoimpuestorentaAux.setsType(Constantes2.S_TOTALES);
			this.empleadoimpuestorentaAux.setIsNew(false);
			this.empleadoimpuestorentaAux.setIsChanged(false);
			this.empleadoimpuestorentaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoImpuestoRentaConstantesFunciones.TotalizarValoresFilaEmpleadoImpuestoRenta(this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas(),this.empleadoimpuestorentaAux);
				
				this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().add(this.empleadoimpuestorentaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoImpuestoRentaConstantesFunciones.TotalizarValoresFilaEmpleadoImpuestoRenta(this.empleadoimpuestorentas,this.empleadoimpuestorentaAux);
				
				this.empleadoimpuestorentas.add(this.empleadoimpuestorentaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadoimpuestorentaTotales=new EmpleadoImpuestoRenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().remove(empleadoimpuestorentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoimpuestorentas.remove(empleadoimpuestorentaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadoimpuestorentaTotales=new EmpleadoImpuestoRenta();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
				if(empleadoimpuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoimpuestorentaTotales=empleadoimpuestorenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoImpuestoRentaConstantesFunciones.TotalizarValoresFilaEmpleadoImpuestoRenta(this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas(),empleadoimpuestorentaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoImpuestoRenta empleadoimpuestorenta:this.empleadoimpuestorentas) {
				if(empleadoimpuestorenta.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoimpuestorentaTotales=empleadoimpuestorenta;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoImpuestoRentaConstantesFunciones.TotalizarValoresFilaEmpleadoImpuestoRenta(this.empleadoimpuestorentas,empleadoimpuestorentaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoImpuestoRentasFK_IdAnio()throws Exception {
		try {
			sAccionBusqueda="FK_IdAnio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoImpuestoRentasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoImpuestoRentasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoImpuestoRentasFK_IdEstructura()throws Exception {
		try {
			sAccionBusqueda="FK_IdEstructura";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoImpuestoRentasFK_IdMes()throws Exception {
		try {
			sAccionBusqueda="FK_IdMes";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoImpuestoRentasFK_IdAnio(String sFinalQuery,Long id_anio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdAnio(sFinalQuery,this.pagination,id_anio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoImpuestoRentasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoImpuestoRentasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoImpuestoRentasFK_IdEstructura(String sFinalQuery,Long id_estructura)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdEstructura(sFinalQuery,this.pagination,id_estructura);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoImpuestoRentasFK_IdMes(String sFinalQuery,Long id_mes)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoimpuestorentaLogic.getEmpleadoImpuestoRentasFK_IdMes(sFinalQuery,this.pagination,id_mes);
				
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
	
	public void inicializarPermisosEmpleadoImpuestoRenta() {
		this.isPermisoTodoEmpleadoImpuestoRenta=false;
		this.isPermisoNuevoEmpleadoImpuestoRenta=false;
		this.isPermisoActualizarEmpleadoImpuestoRenta=false;
		this.isPermisoActualizarOriginalEmpleadoImpuestoRenta=false;
		this.isPermisoEliminarEmpleadoImpuestoRenta=false;
		this.isPermisoGuardarCambiosEmpleadoImpuestoRenta=false;
		this.isPermisoConsultaEmpleadoImpuestoRenta=false;
		this.isPermisoBusquedaEmpleadoImpuestoRenta=false;
		this.isPermisoReporteEmpleadoImpuestoRenta=false;		
		this.isPermisoOrdenEmpleadoImpuestoRenta=false;		
		this.isPermisoPaginacionMedioEmpleadoImpuestoRenta=false;		
		this.isPermisoPaginacionAltoEmpleadoImpuestoRenta=false;
		this.isPermisoPaginacionTodoEmpleadoImpuestoRenta=false;
		this.isPermisoCopiarEmpleadoImpuestoRenta=false;		
		this.isPermisoVerFormEmpleadoImpuestoRenta=false;		
		this.isPermisoDuplicarEmpleadoImpuestoRenta=false;		
		this.isPermisoOrdenEmpleadoImpuestoRenta=false;		
	}
	
	public void setPermisosUsuarioEmpleadoImpuestoRenta(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoNuevoEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoActualizarEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoEliminarEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoConsultaEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoBusquedaEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoReporteEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoOrdenEmpleadoImpuestoRenta=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoImpuestoRenta=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoImpuestoRenta=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoImpuestoRenta=isPermiso;		
		this.isPermisoCopiarEmpleadoImpuestoRenta=isPermiso;		
		this.isPermisoVerFormEmpleadoImpuestoRenta=isPermiso;		
		this.isPermisoDuplicarEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoOrdenEmpleadoImpuestoRenta=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoImpuestoRenta(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoNuevoEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoActualizarEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoEliminarEmpleadoImpuestoRenta=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoImpuestoRenta=isPermiso;
		//this.isPermisoConsultaEmpleadoImpuestoRenta=isPermiso;
		//this.isPermisoBusquedaEmpleadoImpuestoRenta=isPermiso;
		//this.isPermisoReporteEmpleadoImpuestoRenta=isPermiso;
		//this.isPermisoOrdenEmpleadoImpuestoRenta=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoImpuestoRenta=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoImpuestoRenta=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoImpuestoRenta=isPermiso;		
		//this.isPermisoCopiarEmpleadoImpuestoRenta=isPermiso;		
		//this.isPermisoDuplicarEmpleadoImpuestoRenta=isPermiso;
		//this.isPermisoOrdenEmpleadoImpuestoRenta=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoImpuestoRentaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoImpuestoRenta(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoImpuestoRentaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoImpuestoRentaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoImpuestoRentaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoImpuestoRentaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoImpuestoRenta() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoImpuestoRentaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoImpuestoRenta=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoImpuestoRenta=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoImpuestoRenta=this.isPermisoActualizarEmpleadoImpuestoRenta;
			this.isPermisoEliminarEmpleadoImpuestoRenta=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoImpuestoRenta=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoImpuestoRenta=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoImpuestoRenta=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoImpuestoRenta=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoImpuestoRenta=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoImpuestoRenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoImpuestoRenta=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoImpuestoRenta=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoImpuestoRenta=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoImpuestoRenta=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoImpuestoRenta=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoImpuestoRenta=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoImpuestoRenta=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoImpuestoRenta.setToolTipText(this.jTableDatosEmpleadoImpuestoRenta.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoImpuestoRenta(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoImpuestoRenta(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpleadoImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpleadoImpuestoRenta() throws Exception {
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
	public void inicializarCombosForeignKeyEmpleadoImpuestoRentaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.aniosForeignKey=new ArrayList();
				this.messForeignKey=new ArrayList();
				this.estructurasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoImpuestoRentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoImpuestoRentaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoImpuestoRentaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyAnioListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyMesListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEstructuraListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyEmpleadoImpuestoRentaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoImpuestoRentaParameterReturnGeneral empleadoimpuestorentaReturnGeneral=new EmpleadoImpuestoRentaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadoimpuestorentaConstantesFunciones.cargarid_empresaEmpleadoImpuestoRenta)
					 || (this.esRecargarFks && this.empleadoimpuestorentaConstantesFunciones.cargarid_empresaEmpleadoImpuestoRenta)) {

					if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadoimpuestorentaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadoimpuestorentaConstantesFunciones.cargarid_empleadoEmpleadoImpuestoRenta)
					 || (this.esRecargarFks && this.empleadoimpuestorentaConstantesFunciones.cargarid_empleadoEmpleadoImpuestoRenta)) {

					if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadoimpuestorentaSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalAnio="";

				if(((this.aniosForeignKey==null||this.aniosForeignKey.size()<=0) && this.empleadoimpuestorentaConstantesFunciones.cargarid_anioEmpleadoImpuestoRenta)
					 || (this.esRecargarFks && this.empleadoimpuestorentaConstantesFunciones.cargarid_anioEmpleadoImpuestoRenta)) {

					if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=AnioConstantesFunciones.getArrayColumnasGlobalesAnio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalAnio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,AnioConstantesFunciones.TABLENAME);

						finalQueryGlobalAnio=Funciones.GetFinalQueryAppend(finalQueryGlobalAnio, "");
						finalQueryGlobalAnio+=AnioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosAniosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalAnio=" WHERE " + ConstantesSql.ID + "="+empleadoimpuestorentaSessionBean.getlidAnioActual();
					}
				} else {
					finalQueryGlobalAnio="NONE";
				}


				String finalQueryGlobalMes="";

				if(((this.messForeignKey==null||this.messForeignKey.size()<=0) && this.empleadoimpuestorentaConstantesFunciones.cargarid_mesEmpleadoImpuestoRenta)
					 || (this.esRecargarFks && this.empleadoimpuestorentaConstantesFunciones.cargarid_mesEmpleadoImpuestoRenta)) {

					if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=MesConstantesFunciones.getArrayColumnasGlobalesMes(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalMes=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,MesConstantesFunciones.TABLENAME);

						finalQueryGlobalMes=Funciones.GetFinalQueryAppend(finalQueryGlobalMes, "");
						finalQueryGlobalMes+=MesConstantesFunciones.SFINALQUERY;

						//this.cargarCombosMessForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalMes=" WHERE " + ConstantesSql.ID + "="+empleadoimpuestorentaSessionBean.getlidMesActual();
					}
				} else {
					finalQueryGlobalMes="NONE";
				}


				String finalQueryGlobalEstructura="";

				if(((this.estructurasForeignKey==null||this.estructurasForeignKey.size()<=0) && this.empleadoimpuestorentaConstantesFunciones.cargarid_estructuraEmpleadoImpuestoRenta)
					 || (this.esRecargarFks && this.empleadoimpuestorentaConstantesFunciones.cargarid_estructuraEmpleadoImpuestoRenta)) {

					if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EstructuraConstantesFunciones.getArrayColumnasGlobalesEstructura(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEstructura=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EstructuraConstantesFunciones.TABLENAME);

						finalQueryGlobalEstructura=Funciones.GetFinalQueryAppend(finalQueryGlobalEstructura, "");
						finalQueryGlobalEstructura+=EstructuraConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEstructurasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEstructura=" WHERE " + ConstantesSql.ID + "="+empleadoimpuestorentaSessionBean.getlidEstructuraActual();
					}
				} else {
					finalQueryGlobalEstructura="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadoimpuestorentaReturnGeneral=empleadoimpuestorentaLogic.cargarCombosLoteForeignKeyEmpleadoImpuestoRenta(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalAnio,finalQueryGlobalMes,finalQueryGlobalEstructura);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadoimpuestorentaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadoimpuestorentaReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalAnio.equals("NONE")) {
				this.aniosForeignKey=empleadoimpuestorentaReturnGeneral.getaniosForeignKey();
			}

			if(!finalQueryGlobalMes.equals("NONE")) {
				this.messForeignKey=empleadoimpuestorentaReturnGeneral.getmessForeignKey();
			}

			if(!finalQueryGlobalEstructura.equals("NONE")) {
				this.estructurasForeignKey=empleadoimpuestorentaReturnGeneral.getestructurasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoImpuestoRenta()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyAnio();
			this.addItemDefectoCombosForeignKeyMes();
			this.addItemDefectoCombosForeignKeyEstructura();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadoimpuestorentaSessionBean==null) {
				this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
			}

			if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyAnio()throws Exception {
		try {

			if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionAnio()) {
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

			if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionMes()) {
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

	public void addItemDefectoCombosForeignKeyEstructura()throws Exception {
		try {

			if(!this.empleadoimpuestorentaSessionBean.getisBusquedaDesdeForeignKeySesionEstructura()) {
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
	
	public void initActionsCombosTodosForeignKeyEmpleadoImpuestoRenta()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoImpuestoRenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoImpuestoRenta()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
				this.empleadoimpuestorenta.setfecha(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoImpuestoRenta();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(empleadoimpuestorenta.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(empleadoimpuestorenta.getid_estructura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoImpuestoRenta()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.empleadoimpuestorentaConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualEstructuraForeignKey(this.empleadoimpuestorentaConstantesFunciones.getid_estructura(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoImpuestoRenta()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoImpuestoRenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoImpuestoRenta()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoImpuestoRenta()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoImpuestoRenta()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameAniosForeignKey("Todos");
			this.cargarCombosFrameMessForeignKey("Todos");
			this.cargarCombosFrameEstructurasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoImpuestoRenta(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameAniosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameMessForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEstructurasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoImpuestoRenta()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	










	
	

	public EmpleadoImpuestoRentaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoImpuestoRentaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoImpuestoRentaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean(); 
		this.empleadoimpuestorentaConstantesFunciones=new EmpleadoImpuestoRentaConstantesFunciones(); 
		this.empleadoimpuestorentaBean=new EmpleadoImpuestoRenta();//(this.empleadoimpuestorentaConstantesFunciones); 		
		this.empleadoimpuestorentaReturnGeneral=new EmpleadoImpuestoRentaParameterReturnGeneral(); 
		
		this.empleadoimpuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoimpuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoImpuestoRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoImpuestoRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoImpuestoRentaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoImpuestoRenta(true);
			
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
			
			this.empleadoimpuestorentaConstantesFunciones=new EmpleadoImpuestoRentaConstantesFunciones(); 
			this.empleadoimpuestorentaBean=new EmpleadoImpuestoRenta();//this.empleadoimpuestorentaConstantesFunciones); 			
			this.empleadoimpuestorentaReturnGeneral=new EmpleadoImpuestoRentaParameterReturnGeneral(); 
		
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Impuesto Renta Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.empleadoimpuestorenta=new EmpleadoImpuestoRenta();
			this.empleadoimpuestorentas = new ArrayList<EmpleadoImpuestoRenta>();
			this.empleadoimpuestorentasAux = new ArrayList<EmpleadoImpuestoRenta>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic=new EmpleadoImpuestoRentaLogic();
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadoimpuestorentaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadoimpuestorentaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoImpuestoRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoImpuestoRenta);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoImpuestoRenta!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoImpuestoRenta);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta);
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta);
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoImpuestoRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoImpuestoRenta);
					this.jInternalFrameImportacionEmpleadoImpuestoRenta.setVisible(false);
					this.jInternalFrameImportacionEmpleadoImpuestoRenta.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoImpuestoRenta!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoImpuestoRenta);
					this.jInternalFrameOrderByEmpleadoImpuestoRenta.setVisible(false);
					this.jInternalFrameOrderByEmpleadoImpuestoRenta.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoImpuestoRentaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoImpuestoRentaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empleadoimpuestorentaReturnGeneral=new EmpleadoImpuestoRentaParameterReturnGeneral();
			
			this.empleadoimpuestorentaParameterGeneral=new EmpleadoImpuestoRentaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadoimpuestorentaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpleadoImpuestoRentaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoImpuestoRentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado(),this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoImpuestoRentaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado(),this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaCopiarEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaVerFormEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaOrdenEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=false;
			
			
			this.isVisibilidadFK_IdAnio=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdEstructura=true;
			this.isVisibilidadFK_IdMes=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoImpuestoRenta();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoImpuestoRenta(false);
			
			this.setPermisosUsuarioEmpleadoImpuestoRenta();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() 
				|| (this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado() && this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoImpuestoRentaClasesRelacionadas();
			}
			
			if(this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoImpuestoRentaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoImpuestoRenta();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoImpuestoRenta();
			}
			
			if(!this.isPermisoBusquedaEmpleadoImpuestoRenta) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoImpuestoRenta,this.isPermisoPaginacionMedioEmpleadoImpuestoRenta,this.isPermisoPaginacionTodoEmpleadoImpuestoRenta);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoImpuestoRentaConstantesFunciones.getTiposSeleccionarEmpleadoImpuestoRenta());
				
				this.tiposColumnasSelect=EmpleadoImpuestoRentaConstantesFunciones.getTiposSeleccionarEmpleadoImpuestoRenta(true);
				
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
			//if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoImpuestoRenta();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioEmpleadoImpuestoRenta(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioEmpleadoImpuestoRenta(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoImpuestoRenta() ;
			
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
			this.anioLogic=new AnioLogic();
			this.mesLogic=new MesLogic();
			this.estructuraLogic=new EstructuraLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empleadoimpuestorentaImplementable= (EmpleadoImpuestoRentaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoImpuestoRentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadoimpuestorentaImplementableHome= (EmpleadoImpuestoRentaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoImpuestoRentaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadoimpuestorentas= new ArrayList<EmpleadoImpuestoRenta>();
			this.empleadoimpuestorentasEliminados= new ArrayList<EmpleadoImpuestoRenta>();
						
			this.isEsNuevoEmpleadoImpuestoRenta=false;
			this.esParaAccionDesdeFormularioEmpleadoImpuestoRenta=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.aniosForeignKey=new ArrayList<Anio>() ;
			this.messForeignKey=new ArrayList<Mes>() ;
			this.estructurasForeignKey=new ArrayList<Estructura>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoImpuestoRenta(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoImpuestoRenta();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoImpuestoRentaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoImpuestoRenta();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoImpuestoRenta();
			}
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoImpuestoRenta(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoImpuestoRenta: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoImpuestoRenta() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoImpuestoRenta")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTabbedPaneRelacionesEmpleadoImpuestoRenta.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTabbedPaneRelacionesEmpleadoImpuestoRenta.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoImpuestoRenta();	
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
	
	public void cargarCombosForeignKeyEmpleadoImpuestoRenta(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoImpuestoRenta(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoImpuestoRenta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoImpuestoRentaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoImpuestoRenta();
		
		this.cargarCombosFrameForeignKeyEmpleadoImpuestoRenta();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoImpuestoRenta();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoImpuestoRenta();
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
	
	public void jButtonNuevoEmpleadoImpuestoRentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
			
			if(jTableDatosEmpleadoImpuestoRenta.getRowCount()>=1) {
				jTableDatosEmpleadoImpuestoRenta.removeRowSelectionInterval(0, jTableDatosEmpleadoImpuestoRenta.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoImpuestoRenta=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoImpuestoRenta(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoImpuestoRenta(true);			
			//this.empleadoimpuestorenta=new EmpleadoImpuestoRenta();
			//this.empleadoimpuestorenta.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoImpuestoRenta(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoImpuestoRenta() ;
			
			if(EmpleadoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoImpuestoRenta(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadoimpuestorenta);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);				
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
			if(this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoImpuestoRenta: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoImpuestoRentaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoImpuestoRenta.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoImpuestoRenta.getSelectedRows().length;			
			}
			
			empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoImpuestoRenta--;			
				//EmpleadoImpuestoRenta empleadoimpuestorentaAux= new EmpleadoImpuestoRenta();			
				//empleadoimpuestorentaAux.setId(this.iIdNuevoEmpleadoImpuestoRenta);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoImpuestoRenta empleadoimpuestorentaOrigen=new EmpleadoImpuestoRenta();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoImpuestoRenta empleadoimpuestorentaOrigen : empleadoimpuestorentasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadoimpuestorentaOrigen =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoimpuestorentaOrigen =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoImpuestoRenta();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadoimpuestorenta.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoImpuestoRenta(empleadoimpuestorentaOrigen,this.empleadoimpuestorenta,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().add(this.empleadoimpuestorentaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorentas.add(this.empleadoimpuestorentaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
				
				this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoEmpleadoImpuestoRenta(), this.getIndiceNuevoEmpleadoImpuestoRenta());
				
				int iLastRow =  this.jTableDatosEmpleadoImpuestoRenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoImpuestoRenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoImpuestoRenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();									
		
			EmpleadoImpuestoRenta empleadoimpuestorentaOrigen=new EmpleadoImpuestoRenta();
			EmpleadoImpuestoRenta empleadoimpuestorentaDestino=new EmpleadoImpuestoRenta();
				
			empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoImpuestoRenta.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadoimpuestorentasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoImpuestoRenta.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentaOrigen =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoimpuestorentaOrigen =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoimpuestorentaDestino =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoimpuestorentaDestino =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadoimpuestorentaOrigen =empleadoimpuestorentasSeleccionados.get(0);
				empleadoimpuestorentaDestino =empleadoimpuestorentasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoImpuestoRenta(empleadoimpuestorentaOrigen,empleadoimpuestorentaDestino,true,false);
				
				empleadoimpuestorentaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoimpuestorentaDestino,empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoimpuestorentaDestino,empleadoimpuestorentas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
				
				//this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoEmpleadoImpuestoRenta(), this.getIndiceNuevoEmpleadoImpuestoRenta());
				
				int iLastRow =  this.jTableDatosEmpleadoImpuestoRenta.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoImpuestoRenta.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoImpuestoRenta.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoImpuestoRenta.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoImpuestoRenta.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoImpuestoRenta.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoImpuestoRenta.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoImpuestoRenta();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoImpuestoRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoImpuestoRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoImpuestoRenta();
			
			this.abrirFrameOrderByEmpleadoImpuestoRenta();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoImpuestoRenta();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoImpuestoRenta(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoImpuestoRenta);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setSize(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jContentPaneDetalleEmpleadoImpuestoRenta.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTabbedPaneRelacionesEmpleadoImpuestoRenta.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jContentPaneDetalleEmpleadoImpuestoRenta.getWidth(),EmpleadoImpuestoRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTabbedPaneRelacionesEmpleadoImpuestoRenta.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jContentPaneDetalleEmpleadoImpuestoRenta.getWidth(),EmpleadoImpuestoRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTabbedPaneRelacionesEmpleadoImpuestoRenta.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jContentPaneDetalleEmpleadoImpuestoRenta.getWidth(),EmpleadoImpuestoRentaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoImpuestoRenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoImpuestoRenta==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoImpuestoRenta,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoImpuestoRenta=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoImpuestoRenta,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoImpuestoRenta);
				this.jInternalFrameOrderByEmpleadoImpuestoRenta.setVisible(false);
				this.jInternalFrameOrderByEmpleadoImpuestoRenta.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoImpuestoRenta"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoImpuestoRenta();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoImpuestoRenta() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoImpuestoRenta==null) {
				
				this.jInternalFrameImportacionEmpleadoImpuestoRenta=new ImportacionJInternalFrame(EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoImpuestoRenta);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoImpuestoRenta);
				this.jInternalFrameImportacionEmpleadoImpuestoRenta.setVisible(false);
				this.jInternalFrameImportacionEmpleadoImpuestoRenta.setSelected(false);


				this.jInternalFrameImportacionEmpleadoImpuestoRenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoImpuestoRenta"));
				this.jInternalFrameImportacionEmpleadoImpuestoRenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoImpuestoRenta"));
				this.jInternalFrameImportacionEmpleadoImpuestoRenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoImpuestoRenta"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoImpuestoRenta() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta==null) {
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta=new ReporteDinamicoJInternalFrame(EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta);
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoImpuestoRenta"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoImpuestoRenta();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoImpuestoRenta() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoImpuestoRenta);
			
	       	this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.dispose();
			//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoImpuestoRenta() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoImpuestoRenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoImpuestoRenta.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoImpuestoRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoImpuestoRenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoImpuestoRenta.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoImpuestoRenta() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoImpuestoRenta.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoImpuestoRenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoImpuestoRenta() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoImpuestoRenta() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoImpuestoRenta.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoImpuestoRenta.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
						TitledBorder titledBorderEmpleadoImpuestoRenta=(TitledBorder)this.jScrollPanelDatosEmpleadoImpuestoRenta.getBorder();
						TitledBorder titledBorderEstructura=(TitledBorder)estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

						titledBorderEstructura.setTitle(titledBorderEmpleadoImpuestoRenta.getTitle() + " -> Estructura");


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
	
	public void jButtonModificarEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoImpuestoRenta(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoImpuestoRenta(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoImpuestoRenta(true);
			//this.isEsNuevoEmpleadoImpuestoRenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoImpuestoRenta(false) ;
			
			if(empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoImpuestoRenta(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoImpuestoRenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoImpuestoRentaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoImpuestoRenta(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoImpuestoRenta(true);
			//this.isEsNuevoEmpleadoImpuestoRenta=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadoimpuestorenta.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoImpuestoRenta(false) ;
			
			if(EmpleadoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoImpuestoRenta(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoImpuestoRenta(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaAnio(List<Anio> aniosForeignKey)throws Exception{
		TableColumn tableColumnAnio=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO));
		TableCellEditor tableCellEditorAnio =tableColumnAnio.getCellEditor();

		AnioTableCell anioTableCellFk=(AnioTableCell)tableCellEditorAnio;

		if(anioTableCellFk!=null) {
			anioTableCellFk.setaniosForeignKey(aniosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

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
		TableColumn tableColumnMes=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES));
		TableCellEditor tableCellEditorMes =tableColumnMes.getCellEditor();

		MesTableCell mesTableCellFk=(MesTableCell)tableCellEditorMes;

		if(mesTableCellFk!=null) {
			mesTableCellFk.setmessForeignKey(messForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//mesTableCellFk.setRowActual(intSelectedRow);
			//mesTableCellFk.setmessForeignKeyActual(messForeignKey);
		//}


		if(mesTableCellFk!=null) {
			mesTableCellFk.RecargarMessForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaEstructura(List<Estructura> estructurasForeignKey)throws Exception{
		TableColumn tableColumnEstructura=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA));
		TableCellEditor tableCellEditorEstructura =tableColumnEstructura.getCellEditor();

		EstructuraTableCell estructuraTableCellFk=(EstructuraTableCell)tableCellEditorEstructura;

		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.setestructurasForeignKey(estructurasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

		//if(intSelectedRow<=0) {
			//estructuraTableCellFk.setRowActual(intSelectedRow);
			//estructuraTableCellFk.setestructurasForeignKeyActual(estructurasForeignKey);
		//}


		if(estructuraTableCellFk!=null) {
			estructuraTableCellFk.RecargarEstructurasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoImpuestoRenta(false);
			
			//if(!this.isEsNuevoEmpleadoImpuestoRenta) {								
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				
			}
			
			if(this.permiteMantenimiento(this.empleadoimpuestorenta)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoImpuestoRenta=true;
					this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
					this.isEsNuevoEmpleadoImpuestoRenta=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoImpuestoRenta=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoImpuestoRenta=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoImpuestoRenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoImpuestoRenta(false);
				
				this.habilitarDeshabilitarControlesEmpleadoImpuestoRenta(false);
			
												
				
				if(EmpleadoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoImpuestoRenta();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,empleadoimpuestorentaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadoimpuestorentaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadoimpuestorenta.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				this.empleadoimpuestorenta.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				this.empleadoimpuestorenta.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadoimpuestorenta)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoImpuestoRentaModel) this.jTableDatosEmpleadoImpuestoRenta.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoImpuestoRenta=true;
				this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
				this.isEsNuevoEmpleadoImpuestoRenta=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoImpuestoRenta(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoImpuestoRenta(false);
				
				this.habilitarDeshabilitarControlesEmpleadoImpuestoRenta(false);
				
				
				
				if(EmpleadoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoImpuestoRenta();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoImpuestoRenta.getRowCount()>=1) {
				jTableDatosEmpleadoImpuestoRenta.removeRowSelectionInterval(0, jTableDatosEmpleadoImpuestoRenta.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoImpuestoRenta(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoImpuestoRenta(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoImpuestoRenta(false) ;
			
			this.isEsNuevoEmpleadoImpuestoRenta=false;
			
			if(EmpleadoImpuestoRentaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoImpuestoRenta();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				
				//SI ES MANUAL
				if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoImpuestoRenta();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoImpuestoRenta--;			
			//EmpleadoImpuestoRenta empleadoimpuestorentaAux= new EmpleadoImpuestoRenta();			
			//empleadoimpuestorentaAux.setId(this.iIdNuevoEmpleadoImpuestoRenta);
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoImpuestoRenta();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
			
			this.empleadoimpuestorenta.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().add(this.empleadoimpuestorentaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadoimpuestorentas.add(this.empleadoimpuestorentaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
			
			this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionInterval(this.getIndiceNuevoEmpleadoImpuestoRenta(), this.getIndiceNuevoEmpleadoImpuestoRenta());
			
			int iLastRow =  this.jTableDatosEmpleadoImpuestoRenta.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoImpuestoRenta.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoImpuestoRenta.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
			
			//SI ES MANUAL
			if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoImpuestoRenta();
			}
			
			//this.abrirFrameTreeEmpleadoImpuestoRenta();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado Impuesto RentaS ?", "MANTENIMIENTO DE Empleado Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoImpuestoRenta.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoImpuestoRenta();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadoimpuestorentaReturnGeneral=empleadoimpuestorentaLogic.procesarImportacionEmpleadoImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadoimpuestorentaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoImpuestoRentaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoImpuestoRenta.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoImpuestoRenta.setFileImportacion(this.jInternalFrameImportacionEmpleadoImpuestoRenta.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoImpuestoRenta.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoImpuestoRenta.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoImpuestoRenta.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoImpuestoRenta.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();		

		empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoImpuestoRentaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoImpuestoRentaBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpleadoImpuestoRentas("Todos",empleadoimpuestorentasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Anio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Anio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Anio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Anio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Mes_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Mes_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Mes_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Mes_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Estructura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Estructura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Estructura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Estructura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_cha_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_cha_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_cha_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_cha_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lorPago_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lorPago_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lorPago_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lorPago_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_gresoLiquido_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_gresoLiquido_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_gresoLiquido_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_gresoLiquido_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_orteIess_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_orteIess_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_orteIess_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_orteIess_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoria="id_anio";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoria="id_mes";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoria="id_estructura";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoria="fecha";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO:
					sNombreCampoCategoria="valor_pago";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO:
					sNombreCampoCategoria="ingreso_liquido";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS:
					sNombreCampoCategoria="aporte_iess";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO:
					sNombreCampoCategoriaValor="id_anio";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES:
					sNombreCampoCategoriaValor="id_mes";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA:
					sNombreCampoCategoriaValor="id_estructura";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA:
					sNombreCampoCategoriaValor="fecha";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO:
					sNombreCampoCategoriaValor="valor_pago";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO:
					sNombreCampoCategoriaValor="ingreso_liquido";
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS:
					sNombreCampoCategoriaValor="aporte_iess";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Anio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_anio");
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Mes",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_mes");
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Estructura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_estructura");
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha");
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor Pago",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor_pago");
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ingreso Liquo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"ingreso_liquido");
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Aporte Iess",sNombreCampoCategoria,sNombreCampoCategoriaValor,"aporte_iess");
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();		
		
		empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoimpuestorenta";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpleadoImpuestoRentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoimpuestorenta.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoimpuestorenta.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO);
					iRow++;

					for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoimpuestorenta.getanio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES);
					iRow++;

					for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoimpuestorenta.getmes_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA);
					iRow++;

					for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoimpuestorenta.getestructura_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA);
					iRow++;

					for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoimpuestorenta.getfecha());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO);
					iRow++;

					for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoimpuestorenta.getvalor_pago());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO);
					iRow++;

					for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoimpuestorenta.getingreso_liquido());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS);
					iRow++;

					for(EmpleadoImpuestoRenta empleadoimpuestorenta:empleadoimpuestorentasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoimpuestorenta.getaporte_iess());
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
			//	this.getFilaCabeceraExportarExcelEmpleadoImpuestoRenta(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoImpuestoRenta(empleadoimpuestorentaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
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
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
			
			//SI ES MANUAL
			if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoImpuestoRenta();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
			
			//SI ES MANUAL
			if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoImpuestoRenta();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
			
			//SI ES MANUAL
			if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoImpuestoRenta();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoImpuestoRenta() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoImpuestoRenta.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoImpuestoRenta.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoImpuestoRenta.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoImpuestoRenta.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoImpuestoRenta.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoImpuestoRenta.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoImpuestoRenta.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoImpuestoRenta(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoImpuestoRenta(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoImpuestoRenta(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoImpuestoRenta(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoImpuestoRenta(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoImpuestoRenta(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoImpuestoRenta(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoImpuestoRenta() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoImpuestoRenta(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoImpuestoRenta();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoImpuestoRenta() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoImpuestoRenta(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoImpuestoRenta(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jCheckBoxPostAccionNuevoEmpleadoImpuestoRenta.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jCheckBoxPostAccionSinCerrarEmpleadoImpuestoRenta.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jCheckBoxPostAccionSinMensajeEmpleadoImpuestoRenta.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoImpuestoRenta.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jCheckBoxPostAccionNuevoEmpleadoImpuestoRenta.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jCheckBoxPostAccionSinCerrarEmpleadoImpuestoRenta.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jCheckBoxPostAccionSinMensajeEmpleadoImpuestoRenta.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoImpuestoRenta.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoImpuestoRenta(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoImpuestoRenta(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoImpuestoRenta() throws Exception {
		try	{
			if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoImpuestoRenta();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoImpuestoRenta() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoImpuestoRenta() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoImpuestoRenta.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoImpuestoRenta.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoImpuestoRenta.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.addItem(reporte);
			}
			
			
			if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoImpuestoRenta.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoImpuestoRenta();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoImpuestoRenta() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EmpleadoImpuestoRentaConstantesFunciones.getTiposSeleccionarEmpleadoImpuestoRenta(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EmpleadoImpuestoRentaConstantesFunciones.getTiposSeleccionarEmpleadoImpuestoRenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EmpleadoImpuestoRentaConstantesFunciones.getTiposSeleccionarEmpleadoImpuestoRenta(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoImpuestoRenta()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.getSelectedItem()!=null){this.id_anioFK_IdAnio=((Anio)this.jComboBoxid_anioFK_IdAnioEmpleadoImpuestoRenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoImpuestoRenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.getSelectedItem()!=null){this.id_estructuraFK_IdEstructura=((Estructura)this.jComboBoxid_estructuraFK_IdEstructuraEmpleadoImpuestoRenta.getSelectedItem()).getId();}
		if(this.jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.getSelectedItem()!=null){this.id_mesFK_IdMes=((Mes)this.jComboBoxid_mesFK_IdMesEmpleadoImpuestoRenta.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoImpuestoRenta(Boolean esInicializar) throws Exception {				
		if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoImpuestoRenta();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoImpuestoRenta() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoImpuestoRenta() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoImpuestoRentaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRentaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoImpuestoRenta(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadoimpuestorentas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoImpuestoRenta.setModel(new EmpleadoImpuestoRentaModel(this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoImpuestoRenta.setModel(new EmpleadoImpuestoRentaModel(this.empleadoimpuestorentas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoImpuestoRenta!=null && this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoImpuestoRenta();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,empleadoimpuestorentaConstantesFunciones.resaltarSeleccionarEmpleadoImpuestoRenta,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoImpuestoRentaConstantesFunciones.SCLASSWEBTITULO,empleadoimpuestorentaConstantesFunciones.resaltarSeleccionarEmpleadoImpuestoRenta,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_ID));

		if(this.empleadoimpuestorentaConstantesFunciones.mostraridEmpleadoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoImpuestoRentaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoimpuestorentaConstantesFunciones.resaltaridEmpleadoImpuestoRenta,this.empleadoimpuestorentaConstantesFunciones.activaridEmpleadoImpuestoRenta,iSizeTabla,this,true,"idEmpleadoImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoimpuestorentaConstantesFunciones.resaltaridEmpleadoImpuestoRenta,this.empleadoimpuestorentaConstantesFunciones.activaridEmpleadoImpuestoRenta,this,true,"idEmpleadoImpuestoRenta","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadoimpuestorentaConstantesFunciones.mostrarid_empresaEmpleadoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadoimpuestorentaConstantesFunciones.resaltarid_empresaEmpleadoImpuestoRenta,this,this.empleadoimpuestorentaConstantesFunciones.activarid_empresaEmpleadoImpuestoRenta,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadoimpuestorentaConstantesFunciones.resaltarid_empresaEmpleadoImpuestoRenta,this,this.empleadoimpuestorentaConstantesFunciones.activarid_empresaEmpleadoImpuestoRenta,false,"id_empresaEmpleadoImpuestoRenta","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadoimpuestorentaConstantesFunciones.mostrarid_empleadoEmpleadoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoimpuestorentaConstantesFunciones.resaltarid_empleadoEmpleadoImpuestoRenta,this,this.empleadoimpuestorentaConstantesFunciones.activarid_empleadoEmpleadoImpuestoRenta,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoimpuestorentaConstantesFunciones.resaltarid_empleadoEmpleadoImpuestoRenta,this,this.empleadoimpuestorentaConstantesFunciones.activarid_empleadoEmpleadoImpuestoRenta,true,"id_empleadoEmpleadoImpuestoRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO));

		if(this.empleadoimpuestorentaConstantesFunciones.mostrarid_anioEmpleadoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new AnioTableCell(this.aniosForeignKey,this.empleadoimpuestorentaConstantesFunciones.resaltarid_anioEmpleadoImpuestoRenta,this,this.empleadoimpuestorentaConstantesFunciones.activarid_anioEmpleadoImpuestoRenta,iSizeTabla));
			tableColumn.setCellEditor(new AnioTableCell(this.aniosForeignKey,this.empleadoimpuestorentaConstantesFunciones.resaltarid_anioEmpleadoImpuestoRenta,this,this.empleadoimpuestorentaConstantesFunciones.activarid_anioEmpleadoImpuestoRenta,true,"id_anioEmpleadoImpuestoRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES));

		if(this.empleadoimpuestorentaConstantesFunciones.mostrarid_mesEmpleadoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new MesTableCell(this.messForeignKey,this.empleadoimpuestorentaConstantesFunciones.resaltarid_mesEmpleadoImpuestoRenta,this,this.empleadoimpuestorentaConstantesFunciones.activarid_mesEmpleadoImpuestoRenta,iSizeTabla));
			tableColumn.setCellEditor(new MesTableCell(this.messForeignKey,this.empleadoimpuestorentaConstantesFunciones.resaltarid_mesEmpleadoImpuestoRenta,this,this.empleadoimpuestorentaConstantesFunciones.activarid_mesEmpleadoImpuestoRenta,true,"id_mesEmpleadoImpuestoRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA));

		if(this.empleadoimpuestorentaConstantesFunciones.mostrarid_estructuraEmpleadoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EstructuraTableCell(this.estructurasForeignKey,this.empleadoimpuestorentaConstantesFunciones.resaltarid_estructuraEmpleadoImpuestoRenta,this,this.empleadoimpuestorentaConstantesFunciones.activarid_estructuraEmpleadoImpuestoRenta,iSizeTabla));
			tableColumn.setCellEditor(new EstructuraTableCell(this.estructurasForeignKey,this.empleadoimpuestorentaConstantesFunciones.resaltarid_estructuraEmpleadoImpuestoRenta,this,this.empleadoimpuestorentaConstantesFunciones.activarid_estructuraEmpleadoImpuestoRenta,true,"id_estructuraEmpleadoImpuestoRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA));

		if(this.empleadoimpuestorentaConstantesFunciones.mostrarfechaEmpleadoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.empleadoimpuestorentaConstantesFunciones.resaltarfechaEmpleadoImpuestoRenta,this.empleadoimpuestorentaConstantesFunciones.activarfechaEmpleadoImpuestoRenta,iSizeTabla,this,true,"fechaEmpleadoImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.empleadoimpuestorentaConstantesFunciones.resaltarfechaEmpleadoImpuestoRenta,this.empleadoimpuestorentaConstantesFunciones.activarfechaEmpleadoImpuestoRenta,this,true,"fechaEmpleadoImpuestoRenta","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO));

		if(this.empleadoimpuestorentaConstantesFunciones.mostrarvalor_pagoEmpleadoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoimpuestorentaConstantesFunciones.resaltarvalor_pagoEmpleadoImpuestoRenta,this.empleadoimpuestorentaConstantesFunciones.activarvalor_pagoEmpleadoImpuestoRenta,iSizeTabla,this,true,"valor_pagoEmpleadoImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoimpuestorentaConstantesFunciones.resaltarvalor_pagoEmpleadoImpuestoRenta,this.empleadoimpuestorentaConstantesFunciones.activarvalor_pagoEmpleadoImpuestoRenta,this,true,"valor_pagoEmpleadoImpuestoRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO));

		if(this.empleadoimpuestorentaConstantesFunciones.mostraringreso_liquidoEmpleadoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoimpuestorentaConstantesFunciones.resaltaringreso_liquidoEmpleadoImpuestoRenta,this.empleadoimpuestorentaConstantesFunciones.activaringreso_liquidoEmpleadoImpuestoRenta,iSizeTabla,this,true,"ingreso_liquidoEmpleadoImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoimpuestorentaConstantesFunciones.resaltaringreso_liquidoEmpleadoImpuestoRenta,this.empleadoimpuestorentaConstantesFunciones.activaringreso_liquidoEmpleadoImpuestoRenta,this,true,"ingreso_liquidoEmpleadoImpuestoRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS));

		if(this.empleadoimpuestorentaConstantesFunciones.mostraraporte_iessEmpleadoImpuestoRenta && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoimpuestorentaConstantesFunciones.resaltaraporte_iessEmpleadoImpuestoRenta,this.empleadoimpuestorentaConstantesFunciones.activaraporte_iessEmpleadoImpuestoRenta,iSizeTabla,this,true,"aporte_iessEmpleadoImpuestoRenta","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoimpuestorentaConstantesFunciones.resaltaraporte_iessEmpleadoImpuestoRenta,this.empleadoimpuestorentaConstantesFunciones.activaraporte_iessEmpleadoImpuestoRenta,this,true,"aporte_iessEmpleadoImpuestoRenta","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoImpuestoRentaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoImpuestoRenta.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoImpuestoRenta.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoImpuestoRenta.addColumn(tableColumn);
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
			
			this.jTableDatosEmpleadoImpuestoRenta.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoImpuestoRenta.moveColumn(this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoImpuestoRenta.moveColumn(this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoImpuestoRenta.moveColumn(this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoImpuestoRenta.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoImpuestoRenta.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoImpuestoRenta,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoImpuestoRenta.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoImpuestoRenta.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoImpuestoRenta.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadoimpuestorentas.size()-1;
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
		//this.jTableDatosEmpleadoImpuestoRenta.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoImpuestoRenta.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoImpuestoRenta();
			
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
				
				//this.isEsNuevoEmpleadoImpuestoRenta=false;
					
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
				if(this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoImpuestoRenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadoimpuestorenta.getsType().equals("DUPLICADO")
				   || this.empleadoimpuestorenta.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoImpuestoRenta=true;
				
				} else {
					this.isEsNuevoEmpleadoImpuestoRenta=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					if(this.empleadoimpuestorenta.getId()>=0 && !this.empleadoimpuestorenta.getIsNew()) {						
						this.isEsNuevoEmpleadoImpuestoRenta=false;
						
					} else {
						this.isEsNuevoEmpleadoImpuestoRenta=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoImpuestoRenta(esRelaciones);						
				
				this.seleccionarEmpleadoImpuestoRenta(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadoimpuestorenta.getId()<0) {
					this.isEsNuevoEmpleadoImpuestoRenta=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoImpuestoRenta(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoImpuestoRenta(evt,rowIndex);
				}	
				
				if(this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoImpuestoRenta: " + this.dDif); 
					}
				}								
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoImpuestoRenta(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadoimpuestorenta)) {
					if(this.empleadoimpuestorenta.getId()>0) {
						this.empleadoimpuestorenta.setIsDeleted(true);
						
						this.empleadoimpuestorentasEliminados.add(this.empleadoimpuestorenta);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().remove(this.empleadoimpuestorenta);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorentas.remove(this.empleadoimpuestorenta);				
					}
					
					
					((EmpleadoImpuestoRentaModel) this.jTableDatosEmpleadoImpuestoRenta.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoImpuestoRenta(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoImpuestoRenta) {
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoImpuestoRenta.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadoimpuestorentaConstantesFunciones.cargarid_empresaEmpleadoImpuestoRenta || this.empleadoimpuestorentaConstantesFunciones.event_dependid_empresaEmpleadoImpuestoRenta) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadoimpuestorenta.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadoimpuestorenta.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadoimpuestorenta.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadoimpuestorenta.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.empleadoimpuestorentaConstantesFunciones.cargarid_empleadoEmpleadoImpuestoRenta || this.empleadoimpuestorentaConstantesFunciones.event_dependid_empleadoEmpleadoImpuestoRenta) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadoimpuestorenta.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadoimpuestorenta.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadoimpuestorenta.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadoimpuestorenta.getid_empleado(),false,"Formulario");

					//Anio
					if(!this.empleadoimpuestorentaConstantesFunciones.cargarid_anioEmpleadoImpuestoRenta || this.empleadoimpuestorentaConstantesFunciones.event_dependid_anioEmpleadoImpuestoRenta) {
						//this.cargarCombosAniosForeignKeyLista(" where id="+this.empleadoimpuestorenta.getid_anio());
									//this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
						this.aniosForeignKey=new ArrayList<Anio>();

						if(empleadoimpuestorenta.getAnio()!=null) {
							this.aniosForeignKey.add(empleadoimpuestorenta.getAnio());
						}

						this.addItemDefectoCombosForeignKeyAnio();
						this.cargarCombosFrameAniosForeignKey("Todos");
					}
					this.setActualAnioForeignKey(this.empleadoimpuestorenta.getid_anio(),false,"Formulario");

					//Mes
					if(!this.empleadoimpuestorentaConstantesFunciones.cargarid_mesEmpleadoImpuestoRenta || this.empleadoimpuestorentaConstantesFunciones.event_dependid_mesEmpleadoImpuestoRenta) {
						//this.cargarCombosMessForeignKeyLista(" where id="+this.empleadoimpuestorenta.getid_mes());
									//this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
						this.messForeignKey=new ArrayList<Mes>();

						if(empleadoimpuestorenta.getMes()!=null) {
							this.messForeignKey.add(empleadoimpuestorenta.getMes());
						}

						this.addItemDefectoCombosForeignKeyMes();
						this.cargarCombosFrameMessForeignKey("Todos");
					}
					this.setActualMesForeignKey(this.empleadoimpuestorenta.getid_mes(),false,"Formulario");

					//Estructura
					if(!this.empleadoimpuestorentaConstantesFunciones.cargarid_estructuraEmpleadoImpuestoRenta || this.empleadoimpuestorentaConstantesFunciones.event_dependid_estructuraEmpleadoImpuestoRenta) {
						//this.cargarCombosEstructurasForeignKeyLista(" where id="+this.empleadoimpuestorenta.getid_estructura());
									//this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
						this.estructurasForeignKey=new ArrayList<Estructura>();

						if(empleadoimpuestorenta.getEstructura()!=null) {
							this.estructurasForeignKey.add(empleadoimpuestorenta.getEstructura());
						}

						this.addItemDefectoCombosForeignKeyEstructura();
						this.cargarCombosFrameEstructurasForeignKey("Todos");
					}
					this.setActualEstructuraForeignKey(this.empleadoimpuestorenta.getid_estructura(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoImpuestoRenta(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoImpuestoRenta() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoImpuestoRenta(empleadoimpuestorenta,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoImpuestoRenta(empleadoimpuestorenta);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoImpuestoRenta(empleadoimpuestorenta,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoImpuestoRenta(empleadoimpuestorenta);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.setText(empleadoimpuestorenta.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jDateChooserfechaEmpleadoImpuestoRenta.setDate(empleadoimpuestorenta.getfecha());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldvalor_pagoEmpleadoImpuestoRenta.setText(empleadoimpuestorenta.getvalor_pago().toString());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setText(empleadoimpuestorenta.getingreso_liquido().toString());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldaporte_iessEmpleadoImpuestoRenta.setText(empleadoimpuestorenta.getaporte_iess().toString());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoImpuestoRenta empleadoimpuestorentaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadoimpuestorentaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoImpuestoRenta empleadoimpuestorentaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadoimpuestorentaLocal=this.empleadoimpuestorenta;
			} else {
				empleadoimpuestorentaLocal=this.empleadoimpuestorentaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadoimpuestorentaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoImpuestoRenta(empleadoimpuestorentaLocal,true);
					
					if(empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadoimpuestorentaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadoimpuestorentaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(empleadoimpuestorenta,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(empleadoimpuestorenta);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(empleadoimpuestorenta,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.getText()==null || this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.getText()=="" || this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.setText("0");
			}

			if(conColumnasBase) {empleadoimpuestorenta.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoImpuestoRentaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelIdEmpleadoImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoimpuestorenta.setfecha(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jDateChooserfechaEmpleadoImpuestoRenta.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelfechaEmpleadoImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoimpuestorenta.setvalor_pago(Double.parseDouble(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldvalor_pagoEmpleadoImpuestoRenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelvalor_pagoEmpleadoImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoimpuestorenta.setingreso_liquido(Double.parseDouble(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldingreso_liquidoEmpleadoImpuestoRenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelingreso_liquidoEmpleadoImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoimpuestorenta.setaporte_iess(Double.parseDouble(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldaporte_iessEmpleadoImpuestoRenta.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelaporte_iessEmpleadoImpuestoRenta,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorentaBean,EmpleadoImpuestoRenta empleadoimpuestorenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorentaOrigen,EmpleadoImpuestoRenta empleadoimpuestorenta,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoimpuestorentaOrigen.getId()!=null && !empleadoimpuestorentaOrigen.getId().equals(0L))) {empleadoimpuestorenta.setId(empleadoimpuestorentaOrigen.getId());}}
			if(conDefault || (!conDefault && empleadoimpuestorentaOrigen.getfecha()!=null && !empleadoimpuestorentaOrigen.getfecha().equals(new Date()))) {empleadoimpuestorenta.setfecha(empleadoimpuestorentaOrigen.getfecha());}
			if(conDefault || (!conDefault && empleadoimpuestorentaOrigen.getvalor_pago()!=null && !empleadoimpuestorentaOrigen.getvalor_pago().equals(0.0))) {empleadoimpuestorenta.setvalor_pago(empleadoimpuestorentaOrigen.getvalor_pago());}
			if(conDefault || (!conDefault && empleadoimpuestorentaOrigen.getingreso_liquido()!=null && !empleadoimpuestorentaOrigen.getingreso_liquido().equals(0.0))) {empleadoimpuestorenta.setingreso_liquido(empleadoimpuestorentaOrigen.getingreso_liquido());}
			if(conDefault || (!conDefault && empleadoimpuestorentaOrigen.getaporte_iess()!=null && !empleadoimpuestorentaOrigen.getaporte_iess().equals(0.0))) {empleadoimpuestorenta.setaporte_iess(empleadoimpuestorentaOrigen.getaporte_iess());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.setText(empleadoimpuestorenta.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jDateChooserfechaEmpleadoImpuestoRenta.setDate(empleadoimpuestorenta.getfecha());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldvalor_pagoEmpleadoImpuestoRenta.setText(empleadoimpuestorenta.getvalor_pago().toString());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setText(empleadoimpuestorenta.getingreso_liquido().toString());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldaporte_iessEmpleadoImpuestoRenta.setText(empleadoimpuestorenta.getaporte_iess().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoImpuestoRenta(EmpleadoImpuestoRentaBean empleadoimpuestorentaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.setText(empleadoimpuestorentaBean.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jDateChooserfechaEmpleadoImpuestoRenta.setDate(empleadoimpuestorentaBean.getfecha());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldvalor_pagoEmpleadoImpuestoRenta.setText(empleadoimpuestorentaBean.getvalor_pago().toString());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setText(empleadoimpuestorentaBean.getingreso_liquido().toString());
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldaporte_iessEmpleadoImpuestoRenta.setText(empleadoimpuestorentaBean.getaporte_iess().toString());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoImpuestoRenta(EmpleadoImpuestoRentaParameterReturnGeneral empleadoimpuestorentaReturnGeneral,EmpleadoImpuestoRentaBean empleadoimpuestorentaBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoImpuestoRenta empleadoimpuestorentaLocal=new EmpleadoImpuestoRenta();
			
			empleadoimpuestorentaLocal=empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRenta();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoimpuestorentaLocal.getId()!=null && !empleadoimpuestorentaLocal.getId().equals(0L))) {empleadoimpuestorentaBean.setId(empleadoimpuestorentaLocal.getId());}}
			if(conDefault || (!conDefault && empleadoimpuestorentaLocal.getfecha()!=null && !empleadoimpuestorentaLocal.getfecha().equals(new Date()))) {empleadoimpuestorentaBean.setfecha(empleadoimpuestorentaLocal.getfecha());}
			if(conDefault || (!conDefault && empleadoimpuestorentaLocal.getvalor_pago()!=null && !empleadoimpuestorentaLocal.getvalor_pago().equals(0.0))) {empleadoimpuestorentaBean.setvalor_pago(empleadoimpuestorentaLocal.getvalor_pago());}
			if(conDefault || (!conDefault && empleadoimpuestorentaLocal.getingreso_liquido()!=null && !empleadoimpuestorentaLocal.getingreso_liquido().equals(0.0))) {empleadoimpuestorentaBean.setingreso_liquido(empleadoimpuestorentaLocal.getingreso_liquido());}
			if(conDefault || (!conDefault && empleadoimpuestorentaLocal.getaporte_iess()!=null && !empleadoimpuestorentaLocal.getaporte_iess().equals(0.0))) {empleadoimpuestorentaBean.setaporte_iess(empleadoimpuestorentaLocal.getaporte_iess());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoImpuestoRentaGenerico(Long idEmpleadoImpuestoRentaSeleccionado,JComboBox jComboBoxEmpleadoImpuestoRenta,List<EmpleadoImpuestoRenta> empleadoimpuestorentasLocal)throws Exception {
		try {
			EmpleadoImpuestoRenta  empleadoimpuestorentaTemp=null;

			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentasLocal) {
				if(empleadoimpuestorentaAux.getId()!=null && empleadoimpuestorentaAux.getId().equals(idEmpleadoImpuestoRentaSeleccionado)) {
					empleadoimpuestorentaTemp=empleadoimpuestorentaAux;
					break;
				}
			}

			jComboBoxEmpleadoImpuestoRenta.setSelectedItem(empleadoimpuestorentaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoImpuestoRentaGenerico(JComboBox jComboBoxEmpleadoImpuestoRenta,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoImpuestoRenta.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoImpuestoRenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoImpuestoRenta.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoImpuestoRenta.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoImpuestoRenta.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoImpuestoRenta.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoimpuestorenta=(EmpleadoImpuestoRenta) empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoimpuestorenta =(EmpleadoImpuestoRenta) empleadoimpuestorentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadoimpuestorenta.getIsNew() && !empleadoimpuestorenta.getIsChanged() && !empleadoimpuestorenta.getIsDeleted()) {
				sDescripcion=empleadoimpuestorenta.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoimpuestorenta.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadoimpuestorenta.getIsNew() && !empleadoimpuestorenta.getIsChanged() && !empleadoimpuestorenta.getIsDeleted()) {
				sDescripcion=empleadoimpuestorenta.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoimpuestorenta.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Anio")) {
			//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
			if(!empleadoimpuestorenta.getIsNew() && !empleadoimpuestorenta.getIsChanged() && !empleadoimpuestorenta.getIsDeleted()) {
				sDescripcion=empleadoimpuestorenta.getanio_descripcion();
			} else {
				//sDescripcion=this.getActualAnioForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoimpuestorenta.getanio_descripcion();
			}
		}

		if(sTipo.equals("Mes")) {
			//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
			if(!empleadoimpuestorenta.getIsNew() && !empleadoimpuestorenta.getIsChanged() && !empleadoimpuestorenta.getIsDeleted()) {
				sDescripcion=empleadoimpuestorenta.getmes_descripcion();
			} else {
				//sDescripcion=this.getActualMesForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoimpuestorenta.getmes_descripcion();
			}
		}

		if(sTipo.equals("Estructura")) {
			//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
			if(!empleadoimpuestorenta.getIsNew() && !empleadoimpuestorenta.getIsChanged() && !empleadoimpuestorenta.getIsDeleted()) {
				sDescripcion=empleadoimpuestorenta.getestructura_descripcion();
			} else {
				//sDescripcion=this.getActualEstructuraForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoimpuestorenta.getestructura_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoImpuestoRenta empleadoimpuestorentaRow=new EmpleadoImpuestoRenta();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoimpuestorentaRow=(EmpleadoImpuestoRenta) empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoimpuestorentaRow=(EmpleadoImpuestoRenta) empleadoimpuestorentas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoImpuestoRenta(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta && this.isPermisoNuevoEmpleadoImpuestoRenta));			
			this.jButtonDuplicarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta && this.isPermisoDuplicarEmpleadoImpuestoRenta));			
			this.jButtonCopiarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaCopiarEmpleadoImpuestoRenta && this.isPermisoCopiarEmpleadoImpuestoRenta));
			this.jButtonVerFormEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaVerFormEmpleadoImpuestoRenta && this.isPermisoVerFormEmpleadoImpuestoRenta));
			
			this.jButtonAbrirOrderByEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenEmpleadoImpuestoRenta && this.isPermisoOrdenEmpleadoImpuestoRenta));			
			
			this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta && this.isPermisoNuevoEmpleadoImpuestoRenta));			
			this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta && this.isPermisoNuevoEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta));
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonModificarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta && this.isPermisoActualizarEmpleadoImpuestoRenta));	
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonActualizarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta && this.isPermisoActualizarEmpleadoImpuestoRenta));	
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonEliminarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta && this.isPermisoEliminarEmpleadoImpuestoRenta));
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonCancelarEmpleadoImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta);							
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta && this.isPermisoNuevoEmpleadoImpuestoRenta));						
			this.jButtonDuplicarToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta && this.isPermisoDuplicarEmpleadoImpuestoRenta));						
			this.jButtonCopiarToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaCopiarEmpleadoImpuestoRenta && this.isPermisoCopiarEmpleadoImpuestoRenta));			
			this.jButtonVerFormToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaVerFormEmpleadoImpuestoRenta && this.isPermisoVerFormEmpleadoImpuestoRenta));			
			this.jButtonAbrirOrderByToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenEmpleadoImpuestoRenta && this.isPermisoOrdenEmpleadoImpuestoRenta));
			this.jButtonNuevoRelacionesToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta && this.isPermisoNuevoEmpleadoImpuestoRenta));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta && this.isPermisoNuevoEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta));			
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonModificarToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta && this.isPermisoActualizarEmpleadoImpuestoRenta));	
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonActualizarToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta  && this.isPermisoActualizarEmpleadoImpuestoRenta));	
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonEliminarToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta && this.isPermisoEliminarEmpleadoImpuestoRenta));
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonCancelarToolBarEmpleadoImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta);				
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta && this.isPermisoNuevoEmpleadoImpuestoRenta));			
			this.jMenuItemDuplicarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta && this.isPermisoDuplicarEmpleadoImpuestoRenta));			
			this.jMenuItemCopiarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaCopiarEmpleadoImpuestoRenta && this.isPermisoCopiarEmpleadoImpuestoRenta));			
			this.jMenuItemVerFormEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaVerFormEmpleadoImpuestoRenta && this.isPermisoVerFormEmpleadoImpuestoRenta));			
			this.jMenuItemAbrirOrderByEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenEmpleadoImpuestoRenta && this.isPermisoOrdenEmpleadoImpuestoRenta));			
			//this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenEmpleadoImpuestoRenta && this.isPermisoOrdenEmpleadoImpuestoRenta));
			this.jMenuItemDetalleAbrirOrderByEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenEmpleadoImpuestoRenta && this.isPermisoOrdenEmpleadoImpuestoRenta));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaOrdenEmpleadoImpuestoRenta && this.isPermisoOrdenEmpleadoImpuestoRenta));			
			this.jMenuItemNuevoRelacionesEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta && this.isPermisoNuevoEmpleadoImpuestoRenta));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta && this.isPermisoNuevoEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta));									
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemModificarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta && this.isPermisoActualizarEmpleadoImpuestoRenta));	
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemActualizarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta && this.isPermisoActualizarEmpleadoImpuestoRenta));	
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemEliminarEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta && this.isPermisoEliminarEmpleadoImpuestoRenta));
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemCancelarEmpleadoImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta));						
			this.jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=this.jButtonNuevoEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta=this.jButtonDuplicarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoImpuestoRenta=this.jButtonCopiarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoImpuestoRenta=this.jButtonVerFormEmpleadoImpuestoRenta.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoImpuestoRenta=this.jButtonAbrirOrderByEmpleadoImpuestoRenta.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta=this.jButtonModificarEmpleadoImpuestoRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonActualizarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonEliminarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonCancelarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosEmpleadoImpuestoRenta.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=this.jButtonNuevoToolBarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=this.jButtonNuevoRelacionesToolBarEmpleadoImpuestoRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonModificarToolBarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonActualizarToolBarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonEliminarToolBarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonCancelarToolBarEmpleadoImpuestoRenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=this.jButtonGuardarCambiosToolBarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=this.jButtonGuardarCambiosTablaToolBarEmpleadoImpuestoRenta.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=this.jMenuItemNuevoEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=this.jMenuItemNuevoRelacionesEmpleadoImpuestoRenta.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemModificarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemActualizarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemEliminarEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemCancelarEmpleadoImpuestoRenta.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=this.jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoImpuestoRenta(Boolean esInicializar) {
		if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
				//if(this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoImpuestoRenta();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoImpuestoRenta(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoImpuestoRenta() {
		this.jButtonNuevoEmpleadoImpuestoRenta.setVisible(this.isPermisoNuevoEmpleadoImpuestoRenta);			
		this.jButtonDuplicarEmpleadoImpuestoRenta.setVisible(this.isPermisoDuplicarEmpleadoImpuestoRenta);			
		this.jButtonCopiarEmpleadoImpuestoRenta.setVisible(this.isPermisoCopiarEmpleadoImpuestoRenta);			
		this.jButtonVerFormEmpleadoImpuestoRenta.setVisible(this.isPermisoVerFormEmpleadoImpuestoRenta);			
		
		this.jButtonAbrirOrderByEmpleadoImpuestoRenta.setVisible(this.isPermisoOrdenEmpleadoImpuestoRenta);					
		
		this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.setVisible(this.isPermisoNuevoEmpleadoImpuestoRenta);			
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonModificarEmpleadoImpuestoRenta.setVisible(this.isPermisoActualizarEmpleadoImpuestoRenta);	
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonActualizarEmpleadoImpuestoRenta.setVisible(this.isPermisoActualizarEmpleadoImpuestoRenta);	
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonEliminarEmpleadoImpuestoRenta.setVisible(this.isPermisoEliminarEmpleadoImpuestoRenta);
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonCancelarEmpleadoImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta);						
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosEmpleadoImpuestoRenta.setVisible(this.isPermisoGuardarCambiosEmpleadoImpuestoRenta);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.setVisible(this.isPermisoActualizarEmpleadoImpuestoRenta);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoImpuestoRenta() {
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonModificarEmpleadoImpuestoRenta.setVisible(this.isPermisoActualizarEmpleadoImpuestoRenta);	
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonActualizarEmpleadoImpuestoRenta.setVisible(this.isPermisoActualizarEmpleadoImpuestoRenta);	
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonEliminarEmpleadoImpuestoRenta.setVisible(this.isPermisoEliminarEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonCancelarEmpleadoImpuestoRenta.setVisible(this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta);							
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosEmpleadoImpuestoRenta.setVisible((this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta && this.isPermisoGuardarCambiosEmpleadoImpuestoRenta));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoImpuestoRenta() {
		if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoImpuestoRenta();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoImpuestoRenta() {
	}
	
	public void jTableDatosEmpleadoImpuestoRentaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoImpuestoRenta(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoimpuestorenta==null) {
						this.empleadoimpuestorenta = new EmpleadoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}

				if(this.empleadoimpuestorenta.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadoimpuestorenta.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoImpuestoRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoImpuestoRenta(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoImpuestoRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadoimpuestorentaLogic.getConnexion());

				if(this.empleadoimpuestorenta.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadoimpuestorenta.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoImpuestoRenta=(TitledBorder)this.jScrollPanelDatosEmpleadoImpuestoRenta.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoImpuestoRenta.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoimpuestorenta==null) {
						this.empleadoimpuestorenta = new EmpleadoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}

				if(this.empleadoimpuestorenta.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadoimpuestorenta.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoImpuestoRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoImpuestoRenta(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoImpuestoRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadoimpuestorentaLogic.getConnexion());

				if(this.empleadoimpuestorenta.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadoimpuestorenta.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoImpuestoRenta=(TitledBorder)this.jScrollPanelDatosEmpleadoImpuestoRenta.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoImpuestoRenta.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoimpuestorenta==null) {
						this.empleadoimpuestorenta = new EmpleadoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}

				if(this.empleadoimpuestorenta.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadoimpuestorenta.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_anioEmpleadoImpuestoRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoanio=true;

			idTienePermisoanio=this.tienePermisosUsuarioEnPaginaWebEmpleadoImpuestoRenta(AnioConstantesFunciones.CLASSNAME);

			if(idTienePermisoanio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoImpuestoRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);

				this.anioBeanSwingJInternalFrame=new AnioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.anioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.anioBeanSwingJInternalFrame.getAnioLogic().setConnexion(this.empleadoimpuestorentaLogic.getConnexion());

				if(this.empleadoimpuestorenta.getid_anio()!=null) {
					this.anioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.anioBeanSwingJInternalFrame.setIdActual(this.empleadoimpuestorenta.getid_anio());
					this.anioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.anioBeanSwingJInternalFrame.inicializarActualizarBindingTablaAnio();
				}

				JInternalFrameBase jinternalFrame =this.anioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoImpuestoRenta=(TitledBorder)this.jScrollPanelDatosEmpleadoImpuestoRenta.getBorder();
				TitledBorder titledBorderanio=(TitledBorder)this.anioBeanSwingJInternalFrame.jScrollPanelDatosAnio.getBorder();

				titledBorderanio.setTitle(titledBorderEmpleadoImpuestoRenta.getTitle() + " -> Anio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_anioEmpleadoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoimpuestorenta==null) {
						this.empleadoimpuestorenta = new EmpleadoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}

				if(this.empleadoimpuestorenta.getid_anio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_anio = "+this.empleadoimpuestorenta.getid_anio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_mesEmpleadoImpuestoRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisomes=true;

			idTienePermisomes=this.tienePermisosUsuarioEnPaginaWebEmpleadoImpuestoRenta(MesConstantesFunciones.CLASSNAME);

			if(idTienePermisomes) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoImpuestoRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);

				this.mesBeanSwingJInternalFrame=new MesBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.mesBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.mesBeanSwingJInternalFrame.getMesLogic().setConnexion(this.empleadoimpuestorentaLogic.getConnexion());

				if(this.empleadoimpuestorenta.getid_mes()!=null) {
					this.mesBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.mesBeanSwingJInternalFrame.setIdActual(this.empleadoimpuestorenta.getid_mes());
					this.mesBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.mesBeanSwingJInternalFrame.inicializarActualizarBindingTablaMes();
				}

				JInternalFrameBase jinternalFrame =this.mesBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoImpuestoRenta=(TitledBorder)this.jScrollPanelDatosEmpleadoImpuestoRenta.getBorder();
				TitledBorder titledBordermes=(TitledBorder)this.mesBeanSwingJInternalFrame.jScrollPanelDatosMes.getBorder();

				titledBordermes.setTitle(titledBorderEmpleadoImpuestoRenta.getTitle() + " -> Mes");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_mesEmpleadoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoimpuestorenta==null) {
						this.empleadoimpuestorenta = new EmpleadoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}

				if(this.empleadoimpuestorenta.getid_mes()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_mes = "+this.empleadoimpuestorenta.getid_mes().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_estructuraEmpleadoImpuestoRentaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoestructura=true;

			idTienePermisoestructura=this.tienePermisosUsuarioEnPaginaWebEmpleadoImpuestoRenta(EstructuraConstantesFunciones.CLASSNAME);

			if(idTienePermisoestructura) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoImpuestoRenta.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoImpuestoRenta.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);

				this.estructuraBeanSwingJInternalFrame=new EstructuraBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.estructuraBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.estructuraBeanSwingJInternalFrame.getEstructuraLogic().setConnexion(this.empleadoimpuestorentaLogic.getConnexion());

				if(this.empleadoimpuestorenta.getid_estructura()!=null) {
					this.estructuraBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.estructuraBeanSwingJInternalFrame.setIdActual(this.empleadoimpuestorenta.getid_estructura());
					this.estructuraBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.estructuraBeanSwingJInternalFrame.inicializarActualizarBindingTablaEstructura();
				}

				JInternalFrameBase jinternalFrame =this.estructuraBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoImpuestoRenta=(TitledBorder)this.jScrollPanelDatosEmpleadoImpuestoRenta.getBorder();
				TitledBorder titledBorderestructura=(TitledBorder)this.estructuraBeanSwingJInternalFrame.jScrollPanelDatosEstructura.getBorder();

				titledBorderestructura.setTitle(titledBorderEmpleadoImpuestoRenta.getTitle() + " -> Estructura");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_estructuraEmpleadoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoimpuestorenta==null) {
						this.empleadoimpuestorenta = new EmpleadoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}

				if(this.empleadoimpuestorenta.getid_estructura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_estructura = "+this.empleadoimpuestorenta.getid_estructura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfechaEmpleadoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoimpuestorenta==null) {
						this.empleadoimpuestorenta = new EmpleadoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}

				if(this.empleadoimpuestorenta.getfecha()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha = '"+Funciones2.getStringPostgresDate(this.empleadoimpuestorenta.getfecha())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalor_pagoEmpleadoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoimpuestorenta==null) {
						this.empleadoimpuestorenta = new EmpleadoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}

				if(this.empleadoimpuestorenta.getvalor_pago()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor_pago = "+this.empleadoimpuestorenta.getvalor_pago().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoningreso_liquidoEmpleadoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoimpuestorenta==null) {
						this.empleadoimpuestorenta = new EmpleadoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}

				if(this.empleadoimpuestorenta.getingreso_liquido()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where ingreso_liquido = "+this.empleadoimpuestorenta.getingreso_liquido().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonaporte_iessEmpleadoImpuestoRentaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.getempleadoimpuestorenta(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoimpuestorenta==null) {
						this.empleadoimpuestorenta = new EmpleadoImpuestoRenta();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);
				}

				if(this.empleadoimpuestorenta.getaporte_iess()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where aporte_iess = "+this.empleadoimpuestorenta.getaporte_iess().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdAnioEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);

			this.getEmpleadoImpuestoRentasFK_IdAnio();

			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);

			//if(EmpleadoImpuestoRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);

			this.getEmpleadoImpuestoRentasFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);

			//if(EmpleadoImpuestoRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);

			this.getEmpleadoImpuestoRentasFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);

			//if(EmpleadoImpuestoRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEstructuraEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);

			this.getEmpleadoImpuestoRentasFK_IdEstructura();

			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);

			//if(EmpleadoImpuestoRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdMesEmpleadoImpuestoRentaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);

			this.getEmpleadoImpuestoRentasFK_IdMes();

			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);

			//if(EmpleadoImpuestoRentaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoimpuestorentaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoImpuestoRenta() {
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.dispose();
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoImpuestoRenta!=null) {
			this.jInternalFrameImportacionEmpleadoImpuestoRenta.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoImpuestoRenta.dispose();
			this.jInternalFrameImportacionEmpleadoImpuestoRenta=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoImpuestoRenta();
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoImpuestoRenta")) {
				jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoImpuestoRenta")) {
				jButtonDuplicarEmpleadoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoImpuestoRenta")) {
				jButtonCopiarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoImpuestoRenta")) {
				jButtonVerFormEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoImpuestoRenta")) {
				jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoImpuestoRenta")) {
				jButtonDuplicarEmpleadoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoImpuestoRenta")) {
				jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoImpuestoRenta")) {
				jButtonDuplicarEmpleadoImpuestoRentaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoImpuestoRenta")) {
				jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoImpuestoRenta")) {
				jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoImpuestoRenta")) {
				jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoImpuestoRenta")) {
				jButtonModificarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoImpuestoRenta")) {
				jButtonModificarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoImpuestoRenta")) {
				jButtonModificarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoImpuestoRenta")) {
				jButtonActualizarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoImpuestoRenta")) {
				jButtonActualizarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoImpuestoRenta")) {
				jButtonActualizarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoImpuestoRenta")) {
				jButtonEliminarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoImpuestoRenta")) {
				jButtonEliminarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoImpuestoRenta")) {
				jButtonEliminarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoImpuestoRenta")) {
				jButtonCancelarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoImpuestoRenta")) {
				jButtonCancelarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoImpuestoRenta")) {
				jButtonCancelarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoImpuestoRenta")) {
				jButtonCerrarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoImpuestoRenta")) {
				jButtonCerrarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoImpuestoRenta")) {
				jButtonCerrarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoImpuestoRenta")) {
				jButtonMostrarOcultarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoImpuestoRenta")) {
				jButtonCancelarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoImpuestoRenta")) {
				jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoImpuestoRenta")) {
				jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoImpuestoRenta")) {
				jButtonCopiarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoImpuestoRenta")) {
				jButtonVerFormEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoImpuestoRenta")) {
				jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoImpuestoRenta")) {
				jButtonCopiarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoImpuestoRenta")) {
				jButtonVerFormEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoImpuestoRenta")) {
				jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoImpuestoRenta")) {
				jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoImpuestoRenta")) {
				jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoImpuestoRenta")) {
				jButtonRecargarInformacionEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoImpuestoRenta")) {
				jButtonRecargarInformacionEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoImpuestoRenta")) {
				jButtonRecargarInformacionEmpleadoImpuestoRentaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoImpuestoRenta")) {
				jButtonAnterioresEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoImpuestoRenta")) {
				jButtonAnterioresEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoImpuestoRenta")) {
				jButtonAnterioresEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoImpuestoRenta")) {
				jButtonSiguientesEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoImpuestoRenta")) {
				jButtonSiguientesEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoImpuestoRenta")) {
				jButtonSiguientesEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoImpuestoRenta") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoImpuestoRenta")) {
				jButtonAbrirOrderByEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoImpuestoRenta") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoImpuestoRenta")) {
				jButtonMostrarOcultarEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoImpuestoRenta")) {
				jButtonNuevoGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoImpuestoRenta")) {
				jButtonNuevoGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta")) {
				jButtonNuevoGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoImpuestoRenta")) {
				jButtonCerrarReporteDinamicoEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoImpuestoRenta")) {
				jButtonGenerarReporteDinamicoEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoImpuestoRenta")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoImpuestoRenta")) {
				jButtonCerrarImportacionEmpleadoImpuestoRentaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoImpuestoRenta")) {
				
				jButtonGenerarImportacionEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoImpuestoRenta")) {
				
				jButtonAbrirImportacionEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoImpuestoRenta")) {
				jComboBoxTiposAccionesEmpleadoImpuestoRentaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoImpuestoRenta")) {
				jComboBoxTiposRelacionesEmpleadoImpuestoRentaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoImpuestoRenta")) {
				jComboBoxTiposAccionesEmpleadoImpuestoRentaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoImpuestoRenta")) {
				
				jComboBoxTiposSeleccionarEmpleadoImpuestoRentaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoImpuestoRenta")) {
				jTextFieldValorCampoGeneralEmpleadoImpuestoRentaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoImpuestoRenta")) {
				jButtonAbrirOrderByEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoImpuestoRenta")) {
				jButtonAbrirOrderByEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoImpuestoRenta")) {
				jButtonCerrarOrderByEmpleadoImpuestoRentaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonidEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoImpuestoRentaUpdate")) {
				this.jButtonid_empresaEmpleadoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonid_empresaEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoImpuestoRentaUpdate")) {
				this.jButtonid_empleadoEmpleadoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonid_empleadoEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioEmpleadoImpuestoRentaUpdate")) {
				this.jButtonid_anioEmpleadoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonid_anioEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesEmpleadoImpuestoRentaUpdate")) {
				this.jButtonid_mesEmpleadoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonid_mesEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoImpuestoRentaUpdate")) {
				this.jButtonid_estructuraEmpleadoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonid_estructuraEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonfechaEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pagoEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonvalor_pagoEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso_liquidoEmpleadoImpuestoRentaBusqueda")) {
				this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("aporte_iessEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonaporte_iessEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdAnioEmpleadoImpuestoRenta")) {
				this.jButtonFK_IdAnioEmpleadoImpuestoRentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoImpuestoRenta")) {
				this.jButtonFK_IdEmpleadoEmpleadoImpuestoRentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEstructuraEmpleadoImpuestoRenta")) {
				this.jButtonFK_IdEstructuraEmpleadoImpuestoRentaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdMesEmpleadoImpuestoRenta")) {
				this.jButtonFK_IdMesEmpleadoImpuestoRentaActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoImpuestoRenta();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				


				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoImpuestoRenta empleadoimpuestorentaLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadoimpuestorentaLocal=this.empleadoimpuestorenta;
			} else {
				empleadoimpuestorentaLocal=this.empleadoimpuestorentaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
							
				
				


				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
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
			
			


			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
								
						
				


				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
								
				
				


				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
							
				
				


				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
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
			
			


			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
								
				
				


				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoImpuestoRenta")) {
					jCheckBoxSeleccionarTodosEmpleadoImpuestoRentaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoImpuestoRenta")) {
					jCheckBoxSeleccionadosEmpleadoImpuestoRentaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoImpuestoRenta")) {
					
				}
				
				


				
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
												
				
				


				
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
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
			
			


			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoimpuestorenta);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoimpuestorenta);
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
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
				
				


				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoImpuestoRenta.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoImpuestoRenta.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoImpuestoRentaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoimpuestorentaAnterior =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoImpuestoRenta")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoImpuestoRentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoImpuestoRenta.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadoimpuestorenta =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadoimpuestorenta);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoImpuestoRenta")) {
				
				}
				
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoImpuestoRenta")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoImpuestoRenta.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoImpuestoRenta")) {
			
			}
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoImpuestoRenta();
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoImpuestoRenta")) {
				jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoImpuestoRenta")) {
				jButtonDuplicarEmpleadoImpuestoRentaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoImpuestoRenta")) {
				jButtonCopiarEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoImpuestoRenta")) {
				jButtonVerFormEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoImpuestoRenta")) {
				jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoImpuestoRenta")) {
				jButtonModificarEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoImpuestoRenta")) {
				jButtonActualizarEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoImpuestoRenta")) {
				jButtonEliminarEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoImpuestoRenta")) {
				jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoImpuestoRenta")) {
				jButtonCancelarEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoImpuestoRenta")) {
				jButtonCerrarEmpleadoImpuestoRentaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoImpuestoRenta")) {
				jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoImpuestoRenta")) {
				jButtonNuevoGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoImpuestoRenta")) {
				jButtonAbrirOrderByEmpleadoImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoImpuestoRenta")) {
				jButtonRecargarInformacionEmpleadoImpuestoRentaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoImpuestoRenta")) {
				jButtonAnterioresEmpleadoImpuestoRentaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoImpuestoRenta")) {
				jButtonSiguientesEmpleadoImpuestoRentaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonidEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoImpuestoRentaUpdate")) {
				this.jButtonid_empresaEmpleadoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonid_empresaEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoImpuestoRentaUpdate")) {
				this.jButtonid_empleadoEmpleadoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonid_empleadoEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_anioEmpleadoImpuestoRentaUpdate")) {
				this.jButtonid_anioEmpleadoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_anioEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonid_anioEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_mesEmpleadoImpuestoRentaUpdate")) {
				this.jButtonid_mesEmpleadoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_mesEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonid_mesEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoImpuestoRentaUpdate")) {
				this.jButtonid_estructuraEmpleadoImpuestoRentaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_estructuraEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonid_estructuraEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fechaEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonfechaEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valor_pagoEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonvalor_pagoEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("ingreso_liquidoEmpleadoImpuestoRentaBusqueda")) {
				this.jButtoningreso_liquidoEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("aporte_iessEmpleadoImpuestoRentaBusqueda")) {
				this.jButtonaporte_iessEmpleadoImpuestoRentaBusquedaActionPerformed(evt);
			}
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoImpuestoRenta();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoImpuestoRenta")) {
				closingInternalFrameEmpleadoImpuestoRenta();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoImpuestoRenta")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoImpuestoRenta = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoImpuestoRentaBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoImpuestoRentaBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoImpuestoRenta.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoImpuestoRentaActionPerformed(null);
			}
			
			EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoimpuestorenta,new Object(),this.empleadoimpuestorentaParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoImpuestoRenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoImpuestoRenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoImpuestoRenta(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadoimpuestorenta)) {
			if(!esControlTabla) {
				if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);			
				}
				
				if(this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoimpuestorentaReturnGeneral=empleadoimpuestorentaLogic.procesarEventosEmpleadoImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas(),this.empleadoimpuestorenta,this.empleadoimpuestorentaParameterGeneral,this.isEsNuevoEmpleadoImpuestoRenta,classes);//this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoImpuestoRenta(this.empleadoimpuestorentaReturnGeneral,this.empleadoimpuestorentaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoImpuestoRenta(classes,this.empleadoimpuestorentaReturnGeneral,this.empleadoimpuestorentaBean,false);
					}
						
					if(this.empleadoimpuestorentaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoImpuestoRenta(this.empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRenta());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoImpuestoRenta(this.empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRenta());	
					}
						
					if(this.empleadoimpuestorentaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoImpuestoRenta(this.empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRenta(),classes);//this.empleadoimpuestorentaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoImpuestoRenta(this.empleadoimpuestorenta,classes);//this.empleadoimpuestorentaBean);									
				}
			
				if(EmpleadoImpuestoRentaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoImpuestoRenta(this.empleadoimpuestorenta,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoImpuestoRenta(this.empleadoimpuestorenta);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadoimpuestorentaAnterior!=null) {
						this.empleadoimpuestorenta=this.empleadoimpuestorentaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoimpuestorentaReturnGeneral=empleadoimpuestorentaLogic.procesarEventosEmpleadoImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas(),this.empleadoimpuestorenta,this.empleadoimpuestorentaParameterGeneral,this.isEsNuevoEmpleadoImpuestoRenta,classes);//this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRenta()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoimpuestorentaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRenta(),empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRenta(),this.empleadoimpuestorentas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoImpuestoRenta.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoImpuestoRenta.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoImpuestoRenta();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoImpuestoRenta() throws Exception {
		
		EmpleadoImpuestoRentaModel empleadoimpuestorentaModel=(EmpleadoImpuestoRentaModel)this.jTableDatosEmpleadoImpuestoRenta.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoimpuestorentaModel.empleadoimpuestorentas=this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadoimpuestorentaModel.empleadoimpuestorentas=this.empleadoimpuestorentas;
		}
		
		
		((EmpleadoImpuestoRentaModel) this.jTableDatosEmpleadoImpuestoRenta.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoImpuestoRenta() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadoimpuestorentaAnterior(),this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadoimpuestorentaAnterior(),this.empleadoimpuestorentas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoImpuestoRenta();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
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
										
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoimpuestorenta,new Object(),generalEntityParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoImpuestoRentaConstantesFunciones.getClassesRelationshipsOfEmpleadoImpuestoRenta(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoImpuestoRentaConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoImpuestoRenta(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoImpuestoRenta(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoimpuestorenta,new Object(),generalEntityParameterGeneral,this.empleadoimpuestorentaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoImpuestoRenta(EmpleadoImpuestoRentaBean empleadoimpuestorentaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoImpuestoRenta(ArrayList<Classe> classes,EmpleadoImpuestoRentaReturnGeneral empleadoimpuestorentaReturnGeneral,EmpleadoImpuestoRentaBean empleadoimpuestorentaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadoimpuestorenta)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta = new EmpleadoImpuestoRentaDetalleFormJInternalFrame(jDesktopPane,this.empleadoimpuestorentaSessionBean.getConGuardarRelaciones(),this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.empleadoimpuestorentaLogic=this.empleadoimpuestorentaLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoImpuestoRenta("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoImpuestoRenta();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoImpuestoRenta();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoImpuestoRenta("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoImpuestoRenta();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoImpuestoRenta"));
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonModificarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoImpuestoRenta"));

		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonModificarToolBarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoImpuestoRenta"));
					
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemModificarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonActualizarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoImpuestoRenta"));
		
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonActualizarToolBarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoImpuestoRenta"));
						
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemActualizarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonEliminarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoImpuestoRenta"));
		
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonEliminarToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoImpuestoRenta"));
								
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemEliminarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonCancelarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoImpuestoRenta"));
		
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonCancelarToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoImpuestoRenta"));
					
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemCancelarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoImpuestoRenta"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemDetalleCerrarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoImpuestoRenta"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoImpuestoRenta"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoImpuestoRenta"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoImpuestoRenta"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonidEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empresaEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empresaEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empleadoEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_anioEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_anioEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_mesEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_mesEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_estructuraEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonfechaEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"fechaEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagoEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"ingreso_liquidoEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"aporte_iessEmpleadoImpuestoRentaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTabbedPaneRelacionesEmpleadoImpuestoRenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoImpuestoRenta"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoImpuestoRenta"));
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoImpuestoRenta"));
		}
		
		this.jTableDatosEmpleadoImpuestoRenta.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoImpuestoRenta"));
		
		this.jTableDatosEmpleadoImpuestoRenta.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoImpuestoRenta"));
		
		this.jButtonNuevoEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoImpuestoRenta"));
		
		this.jButtonDuplicarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoImpuestoRenta"));
		
		this.jButtonCopiarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoImpuestoRenta"));
		
		this.jButtonVerFormEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoImpuestoRenta"));
		
		
		this.jButtonNuevoToolBarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoImpuestoRenta"));
			
		this.jButtonDuplicarToolBarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoImpuestoRenta"));
			
		this.jMenuItemNuevoEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoImpuestoRenta"));
			
		this.jMenuItemDuplicarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoImpuestoRenta"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoImpuestoRenta"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoImpuestoRenta"));
			
		this.jMenuItemNuevoRelacionesEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoImpuestoRenta"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonModificarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonModificarToolBarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoImpuestoRenta"));
			
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemModificarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonActualizarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonActualizarToolBarEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoImpuestoRenta"));
				
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemActualizarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonEliminarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonEliminarToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoImpuestoRenta"));
						
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemEliminarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonCancelarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonCancelarToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoImpuestoRenta"));
			
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemCancelarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoImpuestoRenta"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoImpuestoRenta"));		
		
		
		this.jButtonCerrarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoImpuestoRenta"));
		
		
		this.jButtonCerrarToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoImpuestoRenta"));
			
		this.jMenuItemCerrarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoImpuestoRenta"));
			
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jMenuItemDetalleCerrarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoImpuestoRenta"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoImpuestoRenta"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoImpuestoRenta"));
		}
		
		this.jButtonCopiarToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoImpuestoRenta"));
			
		this.jButtonVerFormToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoImpuestoRenta"));
		
		this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoImpuestoRenta"));
			
		this.jMenuItemCopiarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoImpuestoRenta"));		
		
		this.jMenuItemVerFormEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoImpuestoRenta"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoImpuestoRenta"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoImpuestoRenta"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoImpuestoRenta"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoImpuestoRenta"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoImpuestoRenta"));
		
		this.jMenuItemRecargarInformacionEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoImpuestoRenta"));		
		
		
		
		this.jButtonAnterioresEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoImpuestoRenta"));
		
		
		this.jButtonAnterioresToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoImpuestoRenta"));
		
		this.jMenuItemAnterioresEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoImpuestoRenta"));		
		
		
		this.jButtonSiguientesEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoImpuestoRenta"));
		
		
		this.jButtonSiguientesToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoImpuestoRenta"));
			
		this.jMenuItemSiguientesEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoImpuestoRenta"));
			
		this.jMenuItemAbrirOrderByEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoImpuestoRenta"));
			
		this.jMenuItemMostrarOcultarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoImpuestoRenta"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoImpuestoRenta"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoImpuestoRenta"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoImpuestoRenta"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoImpuestoRenta"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoImpuestoRenta"));

		this.jCheckBoxSeleccionadosEmpleadoImpuestoRenta.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoImpuestoRenta"));
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoImpuestoRenta"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoImpuestoRenta"));
			
		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoImpuestoRenta"));
					
		this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoImpuestoRenta"));
			
		this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoImpuestoRenta"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonidEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empresaEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empresaEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empleadoEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_anioEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_anioEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_mesEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_mesEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_estructuraEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonfechaEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"fechaEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagoEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"ingreso_liquidoEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"aporte_iessEmpleadoImpuestoRentaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdAnioEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"FK_IdAnioEmpleadoImpuestoRenta"));

			this.jButtonFK_IdEmpleadoEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoImpuestoRenta"));

			this.jButtonFK_IdEstructuraEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraEmpleadoImpuestoRenta"));

			this.jButtonFK_IdMesEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"FK_IdMesEmpleadoImpuestoRenta"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoImpuestoRenta"));
				this.jInternalFrameReporteDinamicoEmpleadoImpuestoRenta.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoImpuestoRenta"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoImpuestoRenta"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoImpuestoRenta"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoImpuestoRenta"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoImpuestoRenta!=null) {
				this.jInternalFrameImportacionEmpleadoImpuestoRenta.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoImpuestoRenta"));
				this.jInternalFrameImportacionEmpleadoImpuestoRenta.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoImpuestoRenta"));
				this.jInternalFrameImportacionEmpleadoImpuestoRenta.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoImpuestoRenta"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoImpuestoRenta"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoImpuestoRenta.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoImpuestoRenta"));			
			
			if(this.jInternalFrameOrderByEmpleadoImpuestoRenta!=null) {
				this.jInternalFrameOrderByEmpleadoImpuestoRenta.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoImpuestoRenta"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTabbedPaneRelacionesEmpleadoImpuestoRenta.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoImpuestoRenta"));
		
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
            		closingInternalFrameEmpleadoImpuestoRenta();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoImpuestoRenta = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoImpuestoRentaBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoImpuestoRentaBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoImpuestoRenta.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoImpuestoRentaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoImpuestoRenta.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoImpuestoRentaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoImpuestoRenta.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoImpuestoRenta.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoImpuestoRenta";
		inputMap = this.jButtonNuevoEmpleadoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoImpuestoRenta";
		inputMap = this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoImpuestoRentaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoImpuestoRenta";
		inputMap = this.jButtonModificarEmpleadoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoImpuestoRenta";
		inputMap = this.jButtonActualizarEmpleadoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoImpuestoRenta";
		inputMap = this.jButtonEliminarEmpleadoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoImpuestoRenta";
		inputMap = this.jButtonCancelarEmpleadoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoImpuestoRenta";
		inputMap = this.jButtonCerrarEmpleadoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoImpuestoRenta";
		inputMap = this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosEmpleadoImpuestoRenta.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonGuardarCambiosEmpleadoImpuestoRenta.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoImpuestoRenta.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoImpuestoRentaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoImpuestoRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoImpuestoRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoImpuestoRentaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonidEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empresaEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empresaEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empleadoEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_empleadoEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_anioEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_anioEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_anioEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_mesEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_mesEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_mesEmpleadoImpuestoRentaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_estructuraEmpleadoImpuestoRentaUpdate.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoImpuestoRentaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonid_estructuraEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"id_estructuraEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonfechaEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"fechaEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonvalor_pagoEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"valor_pagoEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtoningreso_liquidoEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"ingreso_liquidoEmpleadoImpuestoRentaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jButtonaporte_iessEmpleadoImpuestoRentaBusqueda.addActionListener(new ButtonActionListener(this,"aporte_iessEmpleadoImpuestoRentaBusqueda"));
		
		
		this.jButtonFK_IdAnioEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"FK_IdAnioEmpleadoImpuestoRenta"));

		this.jButtonFK_IdEmpleadoEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoImpuestoRenta"));

		this.jButtonFK_IdEstructuraEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"FK_IdEstructuraEmpleadoImpuestoRenta"));

		this.jButtonFK_IdMesEmpleadoImpuestoRenta.addActionListener(new ButtonActionListener(this,"FK_IdMesEmpleadoImpuestoRenta"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoImpuestoRenta.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoImpuestoRentaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoImpuestoRentaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoImpuestoRenta.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoImpuestoRenta(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
					empleadoimpuestorentaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentas) {
					empleadoimpuestorentaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoImpuestoRentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
						empleadoimpuestorentaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentas) {
						empleadoimpuestorentaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentas) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoImpuestoRenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoImpuestoRenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoImpuestoRentaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoImpuestoRenta.getSelectedRows();
			
			EmpleadoImpuestoRenta empleadoimpuestorentaLocal=new EmpleadoImpuestoRenta();
			
			//this.seleccionarTodosEmpleadoImpuestoRenta(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoimpuestorentaLocal =(EmpleadoImpuestoRenta) this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas().toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadoimpuestorentaLocal =(EmpleadoImpuestoRenta) this.empleadoimpuestorentas.toArray()[this.jTableDatosEmpleadoImpuestoRenta.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadoimpuestorentaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
						empleadoimpuestorentaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentas) {
						empleadoimpuestorentaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoImpuestoRenta.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoImpuestoRenta.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoImpuestoRenta,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoImpuestoRentaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoImpuestoRentaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoImpuestoRentaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoImpuestoRenta.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
				
						if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							empleadoimpuestorentaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO)) {
							existe=true;
							empleadoimpuestorentaAux.setvalor_pago(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO)) {
							existe=true;
							empleadoimpuestorentaAux.setingreso_liquido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS)) {
							existe=true;
							empleadoimpuestorentaAux.setaporte_iess(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentas) {
					
						if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA)) {
							existe=true;
							empleadoimpuestorentaAux.setfecha(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO)) {
							existe=true;
							empleadoimpuestorentaAux.setvalor_pago(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO)) {
							existe=true;
							empleadoimpuestorentaAux.setingreso_liquido(Double.parseDouble(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS)) {
							existe=true;
							empleadoimpuestorentaAux.setaporte_iess(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoImpuestoRentaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoImpuestoRenta=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoImpuestoRenta) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoImpuestoRenta(conSplash);
				
					this.generarReporteEmpleadoImpuestoRentasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoImpuestoRentasSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoImpuestoRentasSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoImpuestoRentasSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoImpuestoRenta();
				
				this.exportarEmpleadoImpuestoRentasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoImpuestoRentas();
				//this.importarEmpleadoImpuestoRentas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoImpuestoRenta();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoImpuestoRentasSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoImpuestoRenta();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoImpuestoRenta)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoImpuestoRenta(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoImpuestoRentaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoImpuestoRenta) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoImpuestoRenta(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoImpuestoRenta();
						
						this.generarReporteProcesoAccionEmpleadoImpuestoRentasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado Impuesto RentaS SELECCIONADOS?", "MANTENIMIENTO DE Empleado Impuesto Renta", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoImpuestoRenta();
				
						this.actualizarParametrosGeneralEmpleadoImpuestoRenta();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadoimpuestorentaReturnGeneral=empleadoimpuestorentaLogic.procesarAccionEmpleadoImpuestoRentasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas(),this.empleadoimpuestorentaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoImpuestoRentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoImpuestoRenta();
					
					EmpleadoImpuestoRentaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoImpuestoRentaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoImpuestoRenta.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxTiposAccionesFormularioEmpleadoImpuestoRenta.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoImpuestoRenta(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoImpuestoRentaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoImpuestoRenta();
			
			if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();		
			EmpleadoImpuestoRenta empleadoimpuestorenta=new EmpleadoImpuestoRenta();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoImpuestoRenta.getSelectedItem();
			
			
			
			
			empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadoimpuestorentasSeleccionados.size()==1) {
				for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentasSeleccionados) {
					empleadoimpuestorenta=empleadoimpuestorentaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoImpuestoRenta();
			
      		//this.finishProcessEmpleadoImpuestoRenta(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoImpuestoRentaReturnGeneral() throws Exception {
		if(this.empleadoimpuestorentaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadoimpuestorentaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadoimpuestorentaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadoimpuestorentaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadoimpuestorentaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadoimpuestorentaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
		}
		
		if(this.empleadoimpuestorentaReturnGeneral.getConRetornoLista() || this.empleadoimpuestorentaReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadoimpuestorentaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoimpuestorentaLogic.setEmpleadoImpuestoRentas(this.empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRentas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadoimpuestorentaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoimpuestorentaLogic.setEmpleadoImpuestoRenta(this.empleadoimpuestorentaReturnGeneral.getEmpleadoImpuestoRenta());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoImpuestoRenta(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoImpuestoRenta() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoImpuestoRenta> getEmpleadoImpuestoRentasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoImpuestoRenta) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas()) {
					if(empleadoimpuestorentaAux.getIsSelected()) {
						empleadoimpuestorentasSeleccionados.add(empleadoimpuestorentaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:this.empleadoimpuestorentas) {
					if(empleadoimpuestorentaAux.getIsSelected()) {
						empleadoimpuestorentasSeleccionados.add(empleadoimpuestorentaAux);				
					}
				}
			}
			
			if(empleadoimpuestorentasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadoimpuestorentasSeleccionados.addAll(this.empleadoimpuestorentaLogic.getEmpleadoImpuestoRentas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadoimpuestorentasSeleccionados.addAll(this.empleadoimpuestorentas);				
					}
				}
			}
		} else {
			empleadoimpuestorentasSeleccionados.add(this.empleadoimpuestorenta);
		}
		
		return empleadoimpuestorentasSeleccionados;
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
	
	public void generarReporteEmpleadoImpuestoRentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoImpuestoRentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoImpuestoRentasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoImpuestoRentasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoImpuestoRentasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Impuesto Renta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();		
		
		empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoImpuestoRentas("Todos",empleadoimpuestorentasSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();		
		
		empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoImpuestoRentas("Todos",empleadoimpuestorentasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoImpuestoRentasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();
		
		empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoImpuestoRentas("Todos",empleadoimpuestorentasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoImpuestoRenta();
		
		
		empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoImpuestoRenta();
		
		
		//this.generarReporteEmpleadoImpuestoRentas("Todos",empleadoimpuestorentasSeleccionados ,empleadoimpuestorentaImplementable,empleadoimpuestorentaImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoImpuestoRentas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoImpuestoRenta();
		
		this.abrirFrameImportacionEmpleadoImpuestoRenta();		
		
			
		//this.generarReporteEmpleadoImpuestoRentas("Todos",empleadoimpuestorentasSeleccionados ,empleadoimpuestorentaImplementable,empleadoimpuestorentaImplementableHome);
	}
	
	public void importarEmpleadoImpuestoRentas() throws Exception {		
	
	}
	
	public void exportarEmpleadoImpuestoRentasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoImpuestoRentasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoImpuestoRentasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoImpuestoRentasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Impuesto Renta",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();		
		
		empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoimpuestorenta."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoImpuestoRenta(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoImpuestoRenta(empleadoimpuestorentaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadoimpuestorentaAux.setsDetalleGeneralEntityReporte(empleadoimpuestorentaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoImpuestoRenta(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadoimpuestorenta.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoimpuestorenta.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoimpuestorenta.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoimpuestorenta.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoimpuestorenta.getanio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoimpuestorenta.getmes_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoimpuestorenta.getestructura_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoimpuestorenta.getfecha().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoimpuestorenta.getvalor_pago().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoimpuestorenta.getingreso_liquido().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoimpuestorenta.getaporte_iess().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();		
		
		empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoimpuestorenta.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoImpuestoRentas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoImpuestoRenta(row);				
				iRow++;
			}				
			
			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoImpuestoRenta(empleadoimpuestorentaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoImpuestoRentasSeleccionados() throws Exception {
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();		
		
		empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoimpuestorenta.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadoimpuestorentas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadoimpuestorenta");
			//elementRoot.appendChild(element);
		
			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentasSeleccionados) {
				element = document.createElement("empleadoimpuestorenta");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoImpuestoRenta(empleadoimpuestorentaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Impuesto Renta",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoImpuestoRenta(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_VALORPAGO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_INGRESOLIQUIDO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoImpuestoRentaConstantesFunciones.LABEL_APORTEIESS);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoimpuestorenta.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoimpuestorenta.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoimpuestorenta.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoimpuestorenta.getanio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoimpuestorenta.getmes_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoimpuestorenta.getestructura_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoimpuestorenta.getfecha());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoimpuestorenta.getvalor_pago());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoimpuestorenta.getingreso_liquido());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoimpuestorenta.getaporte_iess());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoImpuestoRenta(EmpleadoImpuestoRenta empleadoimpuestorenta,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadoimpuestorenta.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadoimpuestorenta.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadoimpuestorenta.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadoimpuestorenta.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementanio_descripcion = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.IDANIO);
		elementanio_descripcion.appendChild(document.createTextNode(empleadoimpuestorenta.getanio_descripcion()));
		element.appendChild(elementanio_descripcion);

		Element elementmes_descripcion = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.IDMES);
		elementmes_descripcion.appendChild(document.createTextNode(empleadoimpuestorenta.getmes_descripcion()));
		element.appendChild(elementmes_descripcion);

		Element elementestructura_descripcion = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.IDESTRUCTURA);
		elementestructura_descripcion.appendChild(document.createTextNode(empleadoimpuestorenta.getestructura_descripcion()));
		element.appendChild(elementestructura_descripcion);

		Element elementfecha = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.FECHA);
		elementfecha.appendChild(document.createTextNode(empleadoimpuestorenta.getfecha().toString().trim()));
		element.appendChild(elementfecha);

		Element elementvalor_pago = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.VALORPAGO);
		elementvalor_pago.appendChild(document.createTextNode(empleadoimpuestorenta.getvalor_pago().toString().trim()));
		element.appendChild(elementvalor_pago);

		Element elementingreso_liquido = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.INGRESOLIQUIDO);
		elementingreso_liquido.appendChild(document.createTextNode(empleadoimpuestorenta.getingreso_liquido().toString().trim()));
		element.appendChild(elementingreso_liquido);

		Element elementaporte_iess = document.createElement(EmpleadoImpuestoRentaConstantesFunciones.APORTEIESS);
		elementaporte_iess.appendChild(document.createTextNode(empleadoimpuestorenta.getaporte_iess().toString().trim()));
		element.appendChild(elementaporte_iess);
	}
	
	public void generarReporteGroupGenericoEmpleadoImpuestoRentasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados=new ArrayList<EmpleadoImpuestoRenta>();
		
		empleadoimpuestorentasSeleccionados=this.getEmpleadoImpuestoRentasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoImpuestoRenta(empleadoimpuestorentasSeleccionados);
		
		this.generarReporteEmpleadoImpuestoRentas("Todos",empleadoimpuestorentasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoImpuestoRenta(ArrayList<EmpleadoImpuestoRenta> empleadoimpuestorentasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoImpuestoRenta empleadoimpuestorentaAux:empleadoimpuestorentasSeleccionados) {
				empleadoimpuestorentaAux.setsDetalleGeneralEntityReporte(empleadoimpuestorentaAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadoimpuestorentaAux.setsDescripcionGeneralEntityReporte1(empleadoimpuestorentaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadoimpuestorentaAux.setsDescripcionGeneralEntityReporte1(empleadoimpuestorentaAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDANIO)) {
					existe=true;
					empleadoimpuestorentaAux.setsDescripcionGeneralEntityReporte1(empleadoimpuestorentaAux.getanio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDMES)) {
					existe=true;
					empleadoimpuestorentaAux.setsDescripcionGeneralEntityReporte1(empleadoimpuestorentaAux.getmes_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_IDESTRUCTURA)) {
					existe=true;
					empleadoimpuestorentaAux.setsDescripcionGeneralEntityReporte1(empleadoimpuestorentaAux.getestructura_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoImpuestoRentaConstantesFunciones.LABEL_FECHA)) {
					existe=true;
					empleadoimpuestorentaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(empleadoimpuestorentaAux.getfecha()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoImpuestoRentaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoImpuestoRenta(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaModificarEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaCancelarEmpleadoImpuestoRenta=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoImpuestoRenta=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoImpuestoRentaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoImpuestoRenta(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoImpuestoRenta=false;
			//this.isVisibilidadCeldaVerFormEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaDuplicarEmpleadoImpuestoRenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoImpuestoRenta=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			if(!empleadoimpuestorentaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=false;												
			}
			
			this.jButtonCerrarEmpleadoImpuestoRenta.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoImpuestoRenta=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadoimpuestorenta)) {
			this.isVisibilidadCeldaActualizarEmpleadoImpuestoRenta=false;
			this.isVisibilidadCeldaEliminarEmpleadoImpuestoRenta=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoImpuestoRenta() {
	}
	
	public void actualizarEstadoPanelsEmpleadoImpuestoRenta(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEmpleadoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoImpuestoRenta!=null) {
				this.jPanelPaginacionEmpleadoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoImpuestoRenta!=null) {
				this.jPanelParametrosReportesEmpleadoImpuestoRenta.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEmpleadoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoImpuestoRenta!=null) {
				this.jPanelPaginacionEmpleadoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoImpuestoRenta!=null) {
				this.jPanelParametrosReportesEmpleadoImpuestoRenta.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEmpleadoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoImpuestoRenta!=null) {
				this.jPanelPaginacionEmpleadoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoImpuestoRenta!=null) {
				this.jPanelParametrosReportesEmpleadoImpuestoRenta.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEmpleadoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoImpuestoRenta!=null) {
				this.jPanelPaginacionEmpleadoImpuestoRenta.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoImpuestoRenta!=null) {
				this.jPanelParametrosReportesEmpleadoImpuestoRenta.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEmpleadoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoImpuestoRenta!=null) {
				this.jPanelPaginacionEmpleadoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoImpuestoRenta!=null) {
				this.jPanelParametrosReportesEmpleadoImpuestoRenta.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEmpleadoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoImpuestoRenta!=null) {
				this.jPanelPaginacionEmpleadoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoImpuestoRenta!=null) {
				this.jPanelParametrosReportesEmpleadoImpuestoRenta.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEdicionEmpleadoImpuestoRenta.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoImpuestoRenta!=null) {
				this.jScrollPanelDatosEmpleadoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoImpuestoRenta!=null) {
				this.jPanelPaginacionEmpleadoImpuestoRenta.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoImpuestoRenta!=null) {
				this.jPanelParametrosReportesEmpleadoImpuestoRenta.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta!=null) {
					this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoImpuestoRenta!=null) {
				this.jPanelParametrosReportesEmpleadoImpuestoRenta.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadoimpuestorentaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta!=null) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoImpuestoRenta!=null) {
				this.jPanelParametrosReportesEmpleadoImpuestoRenta.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdAnio=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdAnioEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdEmpleadoEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdEstructura=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdEstructuraEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdMes=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdMesEmpleadoImpuestoRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdAnio=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdAnioEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdEmpleadoEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdEstructura=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdEstructuraEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdMes=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdMesEmpleadoImpuestoRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaAnio(Boolean isParaAnio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaAnioNegation=!isParaAnio;

			this.isVisibilidadFK_IdAnio=isParaAnio;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdAnioEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdEmpleado=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdEmpleadoEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdEstructura=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdEstructuraEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdMes=isParaAnioNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdMesEmpleadoImpuestoRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaMes(Boolean isParaMes){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaMesNegation=!isParaMes;

			this.isVisibilidadFK_IdAnio=isParaMesNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdAnioEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdEmpleado=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdEmpleadoEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdEstructura=isParaMesNegation;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdEstructuraEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdMes=isParaMes;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdMesEmpleadoImpuestoRenta);}
		}
		
	}

	public void setVisibilidadBusquedasParaEstructura(Boolean isParaEstructura){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEstructuraNegation=!isParaEstructura;

			this.isVisibilidadFK_IdAnio=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdAnio) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdAnioEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdEmpleado=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdEmpleadoEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdEstructura=isParaEstructura;
			if(!this.isVisibilidadFK_IdEstructura) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdEstructuraEmpleadoImpuestoRenta);}

			this.isVisibilidadFK_IdMes=isParaEstructuraNegation;
			if(!this.isVisibilidadFK_IdMes) {this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(jPanelFK_IdMesEmpleadoImpuestoRenta);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoImpuestoRentaSessionBean empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
		
		if(this.empleadoimpuestorentaSessionBean==null) {
			this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
		}
		
		this.empleadoimpuestorentaSessionBean.setsUltimaBusquedaEmpleadoImpuestoRenta(this.getsAccionBusqueda());
		this.empleadoimpuestorentaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadoimpuestorentaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
			empleadoimpuestorentaSessionBean.setid_anio(this.getid_anioFK_IdAnio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadoimpuestorentaSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadoimpuestorentaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
			empleadoimpuestorentaSessionBean.setid_estructura(this.getid_estructuraFK_IdEstructura());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
			empleadoimpuestorentaSessionBean.setid_mes(this.getid_mesFK_IdMes());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoImpuestoRentaSessionBean empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
		
		if(this.empleadoimpuestorentaSessionBean==null) {
			this.empleadoimpuestorentaSessionBean=new EmpleadoImpuestoRentaSessionBean();
		}
		
		if(this.empleadoimpuestorentaSessionBean.getsUltimaBusquedaEmpleadoImpuestoRenta()!=null&&!this.empleadoimpuestorentaSessionBean.getsUltimaBusquedaEmpleadoImpuestoRenta().equals("")) {
			this.setsAccionBusqueda(empleadoimpuestorentaSessionBean.getsUltimaBusquedaEmpleadoImpuestoRenta());
			this.setiNumeroPaginacion(empleadoimpuestorentaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadoimpuestorentaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdAnio")) {
				this.setid_anioFK_IdAnio(empleadoimpuestorentaSessionBean.getid_anio());
				empleadoimpuestorentaSessionBean.setid_anio(null);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadoimpuestorentaSessionBean.getid_empleado());
				empleadoimpuestorentaSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadoimpuestorentaSessionBean.getid_empresa());
				empleadoimpuestorentaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEstructura")) {
				this.setid_estructuraFK_IdEstructura(empleadoimpuestorentaSessionBean.getid_estructura());
				empleadoimpuestorentaSessionBean.setid_estructura(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdMes")) {
				this.setid_mesFK_IdMes(empleadoimpuestorentaSessionBean.getid_mes());
				empleadoimpuestorentaSessionBean.setid_mes(null);
			}
		}
		
		this.empleadoimpuestorentaSessionBean.setsUltimaBusquedaEmpleadoImpuestoRenta("");
		this.empleadoimpuestorentaSessionBean.setiNumeroPaginacion(EmpleadoImpuestoRentaConstantesFunciones.INUMEROPAGINACION);
		this.empleadoimpuestorentaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoImpuestoRenta(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoImpuestoRenta() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoImpuestoRenta();
		this.updateVisibilidadBusquedasFormularioEmpleadoImpuestoRenta();
		this.updateHabilitarBusquedasFormularioEmpleadoImpuestoRenta();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoImpuestoRenta() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponents().length>0) {
	

		if(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdAnioEmpleadoImpuestoRenta!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdAnioEmpleadoImpuestoRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
				jPanel.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdAnioEmpleadoImpuestoRenta);
			}
		}

		if(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoImpuestoRenta!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoImpuestoRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
				jPanel.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoImpuestoRenta);
			}
		}

		if(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdEstructuraEmpleadoImpuestoRenta!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoImpuestoRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
				jPanel.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdEstructuraEmpleadoImpuestoRenta);
			}
		}

		if(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdMesEmpleadoImpuestoRenta!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdMesEmpleadoImpuestoRenta);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
				jPanel.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdMesEmpleadoImpuestoRenta);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoImpuestoRenta() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdAnioEmpleadoImpuestoRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarFK_IdAnioEmpleadoImpuestoRenta);
			if(!this.empleadoimpuestorentaConstantesFunciones.mostrarFK_IdAnioEmpleadoImpuestoRenta && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoImpuestoRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoImpuestoRenta);
			if(!this.empleadoimpuestorentaConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoImpuestoRenta && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoImpuestoRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarFK_IdEstructuraEmpleadoImpuestoRenta);
			if(!this.empleadoimpuestorentaConstantesFunciones.mostrarFK_IdEstructuraEmpleadoImpuestoRenta && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdMesEmpleadoImpuestoRenta);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarFK_IdMesEmpleadoImpuestoRenta);
			if(!this.empleadoimpuestorentaConstantesFunciones.mostrarFK_IdMesEmpleadoImpuestoRenta && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoImpuestoRenta() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdAnioEmpleadoImpuestoRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarFK_IdAnioEmpleadoImpuestoRenta);
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setEnabledAt(index,this.empleadoimpuestorentaConstantesFunciones.activarFK_IdAnioEmpleadoImpuestoRenta);
			}

			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoImpuestoRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarFK_IdEmpleadoEmpleadoImpuestoRenta);
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setEnabledAt(index,this.empleadoimpuestorentaConstantesFunciones.activarFK_IdEmpleadoEmpleadoImpuestoRenta);
			}

			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoImpuestoRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarFK_IdEstructuraEmpleadoImpuestoRenta);
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setEnabledAt(index,this.empleadoimpuestorentaConstantesFunciones.activarFK_IdEstructuraEmpleadoImpuestoRenta);
			}

			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdMesEmpleadoImpuestoRenta);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarFK_IdMesEmpleadoImpuestoRenta);
				this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setEnabledAt(index,this.empleadoimpuestorentaConstantesFunciones.activarFK_IdMesEmpleadoImpuestoRenta);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoImpuestoRenta(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdAnio")) {
			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdAnioEmpleadoImpuestoRenta);

			this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);

			this.empleadoimpuestorentaConstantesFunciones.setResaltarFK_IdAnioEmpleadoImpuestoRenta(resaltar);

			jPanel.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdAnioEmpleadoImpuestoRenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoImpuestoRenta);

			this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);

			this.empleadoimpuestorentaConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoImpuestoRenta(resaltar);

			jPanel.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoImpuestoRenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEstructura")) {
			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdEstructuraEmpleadoImpuestoRenta);

			this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);

			this.empleadoimpuestorentaConstantesFunciones.setResaltarFK_IdEstructuraEmpleadoImpuestoRenta(resaltar);

			jPanel.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdEstructuraEmpleadoImpuestoRenta);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdMes")) {
			index= this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.indexOfComponent(this.jPanelFK_IdMesEmpleadoImpuestoRenta);

			this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoImpuestoRenta.getComponent(index);

			this.empleadoimpuestorentaConstantesFunciones.setResaltarFK_IdMesEmpleadoImpuestoRenta(resaltar);

			jPanel.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarFK_IdMesEmpleadoImpuestoRenta);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoImpuestoRenta.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpleadoImpuestoRenta() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoImpuestoRenta();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoImpuestoRenta();
		this.updateHabilitarResaltarControlesFormularioEmpleadoImpuestoRenta();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoImpuestoRenta() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadoimpuestorentaConstantesFunciones.resaltaridEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltaridEmpleadoImpuestoRenta);}
		if(this.empleadoimpuestorentaConstantesFunciones.resaltarid_empresaEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarid_empresaEmpleadoImpuestoRenta);}
		if(this.empleadoimpuestorentaConstantesFunciones.resaltarid_empleadoEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarid_empleadoEmpleadoImpuestoRenta);}
		if(this.empleadoimpuestorentaConstantesFunciones.resaltarid_anioEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarid_anioEmpleadoImpuestoRenta);}
		if(this.empleadoimpuestorentaConstantesFunciones.resaltarid_mesEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarid_mesEmpleadoImpuestoRenta);}
		if(this.empleadoimpuestorentaConstantesFunciones.resaltarid_estructuraEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarid_estructuraEmpleadoImpuestoRenta);}
		if(this.empleadoimpuestorentaConstantesFunciones.resaltarfechaEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jDateChooserfechaEmpleadoImpuestoRenta.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarfechaEmpleadoImpuestoRenta);}
		if(this.empleadoimpuestorentaConstantesFunciones.resaltarvalor_pagoEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldvalor_pagoEmpleadoImpuestoRenta.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltarvalor_pagoEmpleadoImpuestoRenta);}
		if(this.empleadoimpuestorentaConstantesFunciones.resaltaringreso_liquidoEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltaringreso_liquidoEmpleadoImpuestoRenta);}
		if(this.empleadoimpuestorentaConstantesFunciones.resaltaraporte_iessEmpleadoImpuestoRenta!=null && this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldaporte_iessEmpleadoImpuestoRenta.setBorder(this.empleadoimpuestorentaConstantesFunciones.resaltaraporte_iessEmpleadoImpuestoRenta);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoImpuestoRenta() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostraridEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelidEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostraridEmpleadoImpuestoRenta);
		//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarid_empresaEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelid_empresaEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarid_empresaEmpleadoImpuestoRenta);
		//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarid_empleadoEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelid_empleadoEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarid_empleadoEmpleadoImpuestoRenta);
		//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarid_anioEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelid_anioEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarid_anioEmpleadoImpuestoRenta);
		//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarid_mesEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelid_mesEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarid_mesEmpleadoImpuestoRenta);
		//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarid_estructuraEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelid_estructuraEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarid_estructuraEmpleadoImpuestoRenta);
		//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jDateChooserfechaEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarfechaEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelfechaEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarfechaEmpleadoImpuestoRenta);
		//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldvalor_pagoEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarvalor_pagoEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelvalor_pagoEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostrarvalor_pagoEmpleadoImpuestoRenta);
		//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostraringreso_liquidoEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelingreso_liquidoEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostraringreso_liquidoEmpleadoImpuestoRenta);
		//this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldaporte_iessEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostraraporte_iessEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jPanelaporte_iessEmpleadoImpuestoRenta.setVisible(this.empleadoimpuestorentaConstantesFunciones.mostraraporte_iessEmpleadoImpuestoRenta);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoImpuestoRenta() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoImpuestoRenta!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jLabelidEmpleadoImpuestoRenta.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activaridEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empresaEmpleadoImpuestoRenta.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarid_empresaEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_empleadoEmpleadoImpuestoRenta.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarid_empleadoEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_anioEmpleadoImpuestoRenta.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarid_anioEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_mesEmpleadoImpuestoRenta.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarid_mesEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jComboBoxid_estructuraEmpleadoImpuestoRenta.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarid_estructuraEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jDateChooserfechaEmpleadoImpuestoRenta.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarfechaEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldvalor_pagoEmpleadoImpuestoRenta.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activarvalor_pagoEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldingreso_liquidoEmpleadoImpuestoRenta.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activaringreso_liquidoEmpleadoImpuestoRenta);
		this.jInternalFrameDetalleFormEmpleadoImpuestoRenta.jTextFieldaporte_iessEmpleadoImpuestoRenta.setEnabled(this.empleadoimpuestorentaConstantesFunciones.activaraporte_iessEmpleadoImpuestoRenta);
		}
	}
	
		
}