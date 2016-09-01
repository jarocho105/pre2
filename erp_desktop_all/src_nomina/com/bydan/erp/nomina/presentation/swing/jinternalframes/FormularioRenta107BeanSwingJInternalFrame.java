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

import com.bydan.erp.nomina.util.FormularioRenta107ConstantesFunciones;
import com.bydan.erp.nomina.util.FormularioRenta107ParameterReturnGeneral;
//import com.bydan.erp.nomina.util.FormularioRenta107ParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.FormularioRenta107Bean;
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
import com.bydan.erp.contabilidad.business.logic.*;

//EJB

//PARAMETROS


//EJB PARAMETROS

import com.bydan.framework.erp.business.logic.*;
import com.bydan.framework.erp.util.*;

import com.bydan.erp.nomina.business.entity.*;
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
import com.bydan.erp.contabilidad.business.entity.*;
import com.bydan.erp.seguridad.util.*;
import com.bydan.erp.contabilidad.util.*;
import com.bydan.erp.seguridad.presentation.web.jsf.sessionbean.*;
import com.bydan.erp.contabilidad.presentation.web.jsf.sessionbean.*;


@SuppressWarnings("unused")
public class FormularioRenta107BeanSwingJInternalFrame extends FormularioRenta107JInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(FormularioRenta107BeanSwingJInternalFrame.class);  
	
	public static ClassValidator<FormularioRenta107> formulariorenta107Validator = new ClassValidator<FormularioRenta107>(FormularioRenta107.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public FormularioRenta107 formulariorenta107;	
	public FormularioRenta107 formulariorenta107Aux;
	public FormularioRenta107 formulariorenta107Anterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public FormularioRenta107 formulariorenta107Totales;
	public Long idFormularioRenta107Actual;
	public Long iIdNuevoFormularioRenta107=0L;
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

		
	
	
	
	
	

	public Boolean isTienePermisosDetalleFormularioRenta107=false;

	public Boolean getIsTienePermisosDetalleFormularioRenta107() {
		return isTienePermisosDetalleFormularioRenta107;
	}

	public void setIsTienePermisosDetalleFormularioRenta107(Boolean isTienePermisosDetalleFormularioRenta107) {
		this.isTienePermisosDetalleFormularioRenta107= isTienePermisosDetalleFormularioRenta107;
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
	
	public Boolean isPermisoTodoFormularioRenta107;
	public Boolean isPermisoNuevoFormularioRenta107;
	public Boolean isPermisoActualizarFormularioRenta107;
	public Boolean isPermisoActualizarOriginalFormularioRenta107;
	public Boolean isPermisoEliminarFormularioRenta107;
	public Boolean isPermisoGuardarCambiosFormularioRenta107;
	public Boolean isPermisoConsultaFormularioRenta107;
	public Boolean isPermisoBusquedaFormularioRenta107;
	public Boolean isPermisoReporteFormularioRenta107;
	public Boolean isPermisoPaginacionMedioFormularioRenta107;
	public Boolean isPermisoPaginacionAltoFormularioRenta107;
	public Boolean isPermisoPaginacionTodoFormularioRenta107;
	public Boolean isPermisoCopiarFormularioRenta107;
	public Boolean isPermisoVerFormFormularioRenta107;
	public Boolean isPermisoDuplicarFormularioRenta107;
	public Boolean isPermisoOrdenFormularioRenta107;
	
	
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
	
	public FormularioRenta107ParameterReturnGeneral formulariorenta107ReturnGeneral;
	public FormularioRenta107ParameterReturnGeneral formulariorenta107ParameterGeneral;
	
	

	public DetalleFormularioRenta107Logic detalleformulariorenta107Logic=null;

	public DetalleFormularioRenta107Logic getDetalleFormularioRenta107Logic() {
		return detalleformulariorenta107Logic;
	}

	public void setDetalleFormularioRenta107Logic(DetalleFormularioRenta107Logic detalleformulariorenta107Logic) {
		this.detalleformulariorenta107Logic = detalleformulariorenta107Logic;
	}
 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoFormularioRenta107=false;
	public Boolean esParaAccionDesdeFormularioFormularioRenta107=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected FormularioRenta107SessionBeanAdditional formulariorenta107SessionBeanAdditional=null;
	
	public FormularioRenta107SessionBeanAdditional getFormularioRenta107SessionBeanAdditional() {
		return this.formulariorenta107SessionBeanAdditional;
	}
	
	public void setFormularioRenta107SessionBeanAdditional(FormularioRenta107SessionBeanAdditional formulariorenta107SessionBeanAdditional) {
		try {
			this.formulariorenta107SessionBeanAdditional=formulariorenta107SessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected FormularioRenta107BeanSwingJInternalFrameAdditional formulariorenta107BeanSwingJInternalFrameAdditional=null;
	//public class FormularioRenta107BeanSwingJInternalFrame
	
	public FormularioRenta107BeanSwingJInternalFrameAdditional getFormularioRenta107BeanSwingJInternalFrameAdditional() {
		return this.formulariorenta107BeanSwingJInternalFrameAdditional;
	}
	
	public void setFormularioRenta107BeanSwingJInternalFrameAdditional(FormularioRenta107BeanSwingJInternalFrameAdditional formulariorenta107BeanSwingJInternalFrameAdditional) {
		try {
			this.formulariorenta107BeanSwingJInternalFrameAdditional=formulariorenta107BeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public FormularioRenta107Logic formulariorenta107Logic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public FormularioRenta107 formulariorenta107Bean;
	public FormularioRenta107ConstantesFunciones formulariorenta107ConstantesFunciones;
	//public FormularioRenta107ParameterReturnGeneral formulariorenta107ReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public EjercicioLogic ejercicioLogic;
	
	//PARAMETROS
	
	
	//public List<FormularioRenta107> formulariorenta107s;	
	//public List<FormularioRenta107> formulariorenta107sEliminados;
	//public List<FormularioRenta107> formulariorenta107sAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoFormularioRenta107=false;
	public Boolean isVisibilidadCeldaDuplicarFormularioRenta107=true;
	public Boolean isVisibilidadCeldaCopiarFormularioRenta107=true;
	public Boolean isVisibilidadCeldaVerFormFormularioRenta107=true;
	public Boolean isVisibilidadCeldaOrdenFormularioRenta107=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesFormularioRenta107=false;
	public Boolean isVisibilidadCeldaModificarFormularioRenta107=false;
	public Boolean isVisibilidadCeldaActualizarFormularioRenta107=false;
	public Boolean isVisibilidadCeldaEliminarFormularioRenta107=false;
	public Boolean isVisibilidadCeldaCancelarFormularioRenta107=false;
	public Boolean isVisibilidadCeldaGuardarFormularioRenta107=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosFormularioRenta107=false;	
	
	
	public Boolean isVisibilidadFK_IdEjercicio=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoFormularioRenta107() {
		return this.iIdNuevoFormularioRenta107;
	}

	public void setiIdNuevoFormularioRenta107(Long iIdNuevoFormularioRenta107) {
		this.iIdNuevoFormularioRenta107 = iIdNuevoFormularioRenta107;
	}
	
	public Long getidFormularioRenta107Actual() {
		return this.idFormularioRenta107Actual;
	}

	public void setidFormularioRenta107Actual(Long idFormularioRenta107Actual) {
		this.idFormularioRenta107Actual = idFormularioRenta107Actual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public FormularioRenta107 getformulariorenta107() {
		return this.formulariorenta107;
	}

	public void setformulariorenta107(FormularioRenta107 formulariorenta107) {
		this.formulariorenta107 = formulariorenta107;
	}
	
	public FormularioRenta107 getformulariorenta107Aux() {
		return this.formulariorenta107Aux;
	}

	public void setformulariorenta107Aux(FormularioRenta107 formulariorenta107Aux) {
		this.formulariorenta107Aux = formulariorenta107Aux;
	}				
	
	public FormularioRenta107 getformulariorenta107Anterior() {
		return this.formulariorenta107Anterior;
	}

	public void setformulariorenta107Anterior(FormularioRenta107 formulariorenta107Anterior) {
		this.formulariorenta107Anterior = formulariorenta107Anterior;
	}	
	
	public FormularioRenta107 getformulariorenta107Totales() {
		return this.formulariorenta107Totales;
	}

	public void setformulariorenta107Totales(FormularioRenta107 formulariorenta107Totales) {
		this.formulariorenta107Totales = formulariorenta107Totales;
	}	
	
	public FormularioRenta107 getformulariorenta107Bean() {
		return this.formulariorenta107Bean;
	}

	public void setformulariorenta107Bean(FormularioRenta107 formulariorenta107Bean) {
		this.formulariorenta107Bean = formulariorenta107Bean;
	}	
	
	public FormularioRenta107ParameterReturnGeneral getformulariorenta107ReturnGeneral() {
		return this.formulariorenta107ReturnGeneral;
	}

	public void setformulariorenta107ReturnGeneral(FormularioRenta107ParameterReturnGeneral formulariorenta107ReturnGeneral) {
		this.formulariorenta107ReturnGeneral = formulariorenta107ReturnGeneral;
	}	
	
	
	public Long id_ejercicioFK_IdEjercicio=-1L;

	public Long getid_ejercicioFK_IdEjercicio() {
		return this.id_ejercicioFK_IdEjercicio;
	}

	public void setid_ejercicioFK_IdEjercicio(Long id_ejercicioFK_IdEjercicio) {
		this.id_ejercicioFK_IdEjercicio = id_ejercicioFK_IdEjercicio;
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

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public FormularioRenta107Logic getFormularioRenta107Logic()	{		
		return formulariorenta107Logic;
	}

	public void setFormularioRenta107Logic(FormularioRenta107Logic formulariorenta107Logic) {
		this.formulariorenta107Logic = formulariorenta107Logic;
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
	
	public Boolean getIsEsNuevoFormularioRenta107() {
		return isEsNuevoFormularioRenta107;
	}

	public void setIsEsNuevoFormularioRenta107(Boolean isEsNuevoFormularioRenta107) {
		this.isEsNuevoFormularioRenta107 = isEsNuevoFormularioRenta107;
	}

	public Boolean getEsParaAccionDesdeFormularioFormularioRenta107() {
		return esParaAccionDesdeFormularioFormularioRenta107;
	}
	
	public void setEsParaAccionDesdeFormularioFormularioRenta107(Boolean esParaAccionDesdeFormularioFormularioRenta107) {
		this.esParaAccionDesdeFormularioFormularioRenta107 = esParaAccionDesdeFormularioFormularioRenta107;
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

			if(this.formulariorenta107SessionBean==null) {
				this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
			}

			if(!this.formulariorenta107SessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(formulariorenta107SessionBean.getlidEmpresaActual());
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

			if(this.formulariorenta107SessionBean==null) {
				this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
			}

			if(!this.formulariorenta107SessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(formulariorenta107SessionBean.getlidEmpleadoActual());
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

			if(this.formulariorenta107SessionBean==null) {
				this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
			}

			if(!this.formulariorenta107SessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
					ejercicioLogic.getEntityWithConnection(formulariorenta107SessionBean.getlidEjercicioActual());
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

					if(this.formulariorenta107!=null) {
						this.formulariorenta107.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
						this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaFormularioRenta107.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaFormularioRenta107Generico)throws Exception
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
				jComboBoxid_empresaFormularioRenta107Generico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaFormularioRenta107Generico!=null && jComboBoxid_empresaFormularioRenta107Generico.getItemCount()>0) {
					jComboBoxid_empresaFormularioRenta107Generico.setSelectedIndex(0);
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

					if(this.formulariorenta107!=null) {
						this.formulariorenta107.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
						this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoFormularioRenta107.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoFormularioRenta107Generico)throws Exception
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
				jComboBoxid_empleadoFormularioRenta107Generico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoFormularioRenta107Generico!=null && jComboBoxid_empleadoFormularioRenta107Generico.getItemCount()>0) {
					jComboBoxid_empleadoFormularioRenta107Generico.setSelectedIndex(0);
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

					if(this.formulariorenta107!=null) {
						this.formulariorenta107.setEjercicio(ejercicioTemp);
					}

					if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
						this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.setSelectedItem(ejercicioTemp);
					}
				} else {
					//jComboBoxid_ejercicioFormularioRenta107.setSelectedItem(ejercicioTemp);
					if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
						if(this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.getItemCount()>0) {
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.setSelectedIndex(0);
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
	public void setActualEjercicioForeignKeyGenerico(Long idEjercicioSeleccionado,JComboBox jComboBoxid_ejercicioFormularioRenta107Generico)throws Exception
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
				jComboBoxid_ejercicioFormularioRenta107Generico.setSelectedItem(ejercicioTemp);
			} else {
				if(jComboBoxid_ejercicioFormularioRenta107Generico!=null && jComboBoxid_ejercicioFormularioRenta107Generico.getItemCount()>0) {
					jComboBoxid_ejercicioFormularioRenta107Generico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(FormularioRenta107 formulariorenta107,JComboBox jComboBoxid_empresaFormularioRenta107Generico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaFormularioRenta107Generico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaFormularioRenta107Generico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				formulariorenta107.setid_empresa(empresaAux.getId());
				formulariorenta107.setempresa_descripcion(FormularioRenta107ConstantesFunciones.getEmpresaDescripcion(empresaAux));
				formulariorenta107.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(FormularioRenta107 formulariorenta107,JComboBox jComboBoxid_empleadoFormularioRenta107Generico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoFormularioRenta107Generico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoFormularioRenta107Generico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				formulariorenta107.setid_empleado(empleadoAux.getId());
				formulariorenta107.setempleado_descripcion(FormularioRenta107ConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				formulariorenta107.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEjercicioForeignKey(FormularioRenta107 formulariorenta107,JComboBox jComboBoxid_ejercicioFormularioRenta107Generico)throws Exception
	{
		try
		{
			Ejercicio  ejercicioAux=new Ejercicio();

			if(jComboBoxid_ejercicioFormularioRenta107Generico==null) {
				ejercicioAux=(Ejercicio)this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.getSelectedItem();
			} else {
				ejercicioAux=(Ejercicio)jComboBoxid_ejercicioFormularioRenta107Generico.getSelectedItem();
			}

			if(ejercicioAux!=null && ejercicioAux.getId()!=null) {
				formulariorenta107.setid_ejercicio(ejercicioAux.getId());
				formulariorenta107.setejercicio_descripcion(FormularioRenta107ConstantesFunciones.getEjercicioDescripcion(ejercicioAux));
				formulariorenta107.setEjercicio(ejercicioAux);			}
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

					if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { 
					}

					if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { 
					}

					if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.addItem(empleado);
							}
						}

						if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
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

					if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { 
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.removeAllItems();

							for(Ejercicio ejercicio:this.ejerciciosForeignKey) {
								this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.addItem(ejercicio);
							}
						}
					}

					if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { 
					}

					if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.setSelectedItem(ejercicio);
						}
					} else {
						if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.setSelectedIndex(iIndexSelected);
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

	


	
	public void refrescarForeignKeysDescripcionesFormularioRenta107() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			FormularioRenta107ConstantesFunciones.refrescarForeignKeysDescripcionesFormularioRenta107(this.formulariorenta107Logic.getFormularioRenta107s());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			FormularioRenta107ConstantesFunciones.refrescarForeignKeysDescripcionesFormularioRenta107(this.formulariorenta107s);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Ejercicio.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//formulariorenta107Logic.setFormularioRenta107s(this.formulariorenta107s);
			formulariorenta107Logic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public FormularioRenta107ParameterReturnGeneral getFormularioRenta107ParameterGeneral() {
		return this.formulariorenta107ParameterGeneral;
	}
	
	public void setFormularioRenta107ParameterGeneral(FormularioRenta107ParameterReturnGeneral formulariorenta107ParameterGeneral) {
		this.formulariorenta107ParameterGeneral = formulariorenta107ParameterGeneral;
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
	
	public Boolean getIsPermisoTodoFormularioRenta107() {
		return isPermisoTodoFormularioRenta107;
	}

	public void setIsPermisoTodoFormularioRenta107(Boolean isPermisoTodoFormularioRenta107) {
		this.isPermisoTodoFormularioRenta107 = isPermisoTodoFormularioRenta107;
	}

	public Boolean getIsPermisoNuevoFormularioRenta107() {
		return isPermisoNuevoFormularioRenta107;
	}

	public void setIsPermisoNuevoFormularioRenta107(Boolean isPermisoNuevoFormularioRenta107) {
		this.isPermisoNuevoFormularioRenta107 = isPermisoNuevoFormularioRenta107;
	}

	public Boolean getIsPermisoActualizarFormularioRenta107() {
		return isPermisoActualizarFormularioRenta107;
	}

	public void setIsPermisoActualizarFormularioRenta107(Boolean isPermisoActualizarFormularioRenta107) {
		this.isPermisoActualizarFormularioRenta107 = isPermisoActualizarFormularioRenta107;
	}

	public Boolean getIsPermisoEliminarFormularioRenta107() {
		return isPermisoEliminarFormularioRenta107;
	}

	public void setIsPermisoEliminarFormularioRenta107(Boolean isPermisoEliminarFormularioRenta107) {
		this.isPermisoEliminarFormularioRenta107 = isPermisoEliminarFormularioRenta107;
	}

	public Boolean getIsPermisoGuardarCambiosFormularioRenta107() {
		return isPermisoGuardarCambiosFormularioRenta107;
	}

	public void setIsPermisoGuardarCambiosFormularioRenta107(Boolean isPermisoGuardarCambiosFormularioRenta107) {
		this.isPermisoGuardarCambiosFormularioRenta107 = isPermisoGuardarCambiosFormularioRenta107;
	}
	
	public Boolean getIsPermisoConsultaFormularioRenta107() {
		return isPermisoConsultaFormularioRenta107;
	}

	public void setIsPermisoConsultaFormularioRenta107(Boolean isPermisoConsultaFormularioRenta107) {
		this.isPermisoConsultaFormularioRenta107 = isPermisoConsultaFormularioRenta107;
	}

	public Boolean getIsPermisoBusquedaFormularioRenta107() {
		return isPermisoBusquedaFormularioRenta107;
	}

	public void setIsPermisoBusquedaFormularioRenta107(Boolean isPermisoBusquedaFormularioRenta107) {
		this.isPermisoBusquedaFormularioRenta107 = isPermisoBusquedaFormularioRenta107;
	}

	public Boolean getIsPermisoReporteFormularioRenta107() {
		return isPermisoReporteFormularioRenta107;
	}

	public void setIsPermisoReporteFormularioRenta107(Boolean isPermisoReporteFormularioRenta107) {
		this.isPermisoReporteFormularioRenta107 = isPermisoReporteFormularioRenta107;
	}
	
	public Boolean getIsPermisoPaginacionMedioFormularioRenta107() {
		return isPermisoPaginacionMedioFormularioRenta107;
	}

	public void setIsPermisoPaginacionMedioFormularioRenta107(Boolean isPermisoPaginacionMedioFormularioRenta107) {
		this.isPermisoPaginacionMedioFormularioRenta107 = isPermisoPaginacionMedioFormularioRenta107;
	}
	
	public Boolean getIsPermisoPaginacionTodoFormularioRenta107() {
		return isPermisoPaginacionTodoFormularioRenta107;
	}

	public void setIsPermisoPaginacionTodoFormularioRenta107(Boolean isPermisoPaginacionTodoFormularioRenta107) {
		this.isPermisoPaginacionTodoFormularioRenta107 = isPermisoPaginacionTodoFormularioRenta107;
	}
	
	public Boolean getIsPermisoPaginacionAltoFormularioRenta107() {
		return isPermisoPaginacionAltoFormularioRenta107;
	}

	public void setIsPermisoPaginacionAltoFormularioRenta107(Boolean isPermisoPaginacionAltoFormularioRenta107) {
		this.isPermisoPaginacionAltoFormularioRenta107 = isPermisoPaginacionAltoFormularioRenta107;
	}
	
	public Boolean getIsPermisoCopiarFormularioRenta107() {
		return isPermisoCopiarFormularioRenta107;
	}

	public void setIsPermisoCopiarFormularioRenta107(Boolean isPermisoCopiarFormularioRenta107) {
		this.isPermisoCopiarFormularioRenta107 = isPermisoCopiarFormularioRenta107;
	}
	
	public Boolean getIsPermisoVerFormFormularioRenta107() {
		return isPermisoVerFormFormularioRenta107;
	}

	public void setIsPermisoVerFormFormularioRenta107(Boolean isPermisoVerFormFormularioRenta107) {
		this.isPermisoVerFormFormularioRenta107 = isPermisoVerFormFormularioRenta107;
	}
	
	public Boolean getIsPermisoDuplicarFormularioRenta107() {
		return isPermisoDuplicarFormularioRenta107;
	}

	public void setIsPermisoDuplicarFormularioRenta107(Boolean isPermisoDuplicarFormularioRenta107) {
		this.isPermisoDuplicarFormularioRenta107 = isPermisoDuplicarFormularioRenta107;
	}
	
	public Boolean getIsPermisoOrdenFormularioRenta107() {
		return isPermisoOrdenFormularioRenta107;
	}

	public void setIsPermisoOrdenFormularioRenta107(Boolean isPermisoOrdenFormularioRenta107) {
		this.isPermisoOrdenFormularioRenta107 = isPermisoOrdenFormularioRenta107;
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
	
	public Boolean getIsVisibilidadCeldaNuevoFormularioRenta107() {
		return isVisibilidadCeldaNuevoFormularioRenta107;
	}

	public void setIsVisibilidadCeldaNuevoFormularioRenta107(Boolean isVisibilidadCeldaNuevoFormularioRenta107) {
		this.isVisibilidadCeldaNuevoFormularioRenta107 = isVisibilidadCeldaNuevoFormularioRenta107;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarFormularioRenta107() {
		return isVisibilidadCeldaDuplicarFormularioRenta107;
	}

	public void setIsVisibilidadCeldaDuplicarFormularioRenta107(Boolean isVisibilidadCeldaDuplicarFormularioRenta107) {
		this.isVisibilidadCeldaDuplicarFormularioRenta107 = isVisibilidadCeldaDuplicarFormularioRenta107;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarFormularioRenta107() {
		return isVisibilidadCeldaCopiarFormularioRenta107;
	}

	public void setIsVisibilidadCeldaCopiarFormularioRenta107(Boolean isVisibilidadCeldaCopiarFormularioRenta107) {
		this.isVisibilidadCeldaCopiarFormularioRenta107 = isVisibilidadCeldaCopiarFormularioRenta107;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormFormularioRenta107() {
		return isVisibilidadCeldaVerFormFormularioRenta107;
	}

	public void setIsVisibilidadCeldaVerFormFormularioRenta107(Boolean isVisibilidadCeldaVerFormFormularioRenta107) {
		this.isVisibilidadCeldaVerFormFormularioRenta107 = isVisibilidadCeldaVerFormFormularioRenta107;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenFormularioRenta107() {
		return isVisibilidadCeldaOrdenFormularioRenta107;
	}

	public void setIsVisibilidadCeldaOrdenFormularioRenta107(Boolean isVisibilidadCeldaOrdenFormularioRenta107) {
		this.isVisibilidadCeldaOrdenFormularioRenta107 = isVisibilidadCeldaOrdenFormularioRenta107;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesFormularioRenta107() {
		return isVisibilidadCeldaNuevoRelacionesFormularioRenta107;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesFormularioRenta107(Boolean isVisibilidadCeldaNuevoRelacionesFormularioRenta107) {
		this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107 = isVisibilidadCeldaNuevoRelacionesFormularioRenta107;
	}
	
	public Boolean getIsVisibilidadCeldaModificarFormularioRenta107() {
		return isVisibilidadCeldaModificarFormularioRenta107;
	}

	public void setIsVisibilidadCeldaModificarFormularioRenta107(Boolean isVisibilidadCeldaModificarFormularioRenta107) {
		this.isVisibilidadCeldaModificarFormularioRenta107 = isVisibilidadCeldaModificarFormularioRenta107;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarFormularioRenta107() {
		return isVisibilidadCeldaActualizarFormularioRenta107;
	}

	public void setIsVisibilidadCeldaActualizarFormularioRenta107(Boolean isVisibilidadCeldaActualizarFormularioRenta107) {
		this.isVisibilidadCeldaActualizarFormularioRenta107 = isVisibilidadCeldaActualizarFormularioRenta107;
	}

	public Boolean getIsVisibilidadCeldaEliminarFormularioRenta107() {
		return isVisibilidadCeldaEliminarFormularioRenta107;
	}

	public void setIsVisibilidadCeldaEliminarFormularioRenta107(Boolean isVisibilidadCeldaEliminarFormularioRenta107) {
		this.isVisibilidadCeldaEliminarFormularioRenta107 = isVisibilidadCeldaEliminarFormularioRenta107;
	}

	public Boolean getIsVisibilidadCeldaCancelarFormularioRenta107() {
		return isVisibilidadCeldaCancelarFormularioRenta107;
	}

	public void setIsVisibilidadCeldaCancelarFormularioRenta107(Boolean isVisibilidadCeldaCancelarFormularioRenta107) {
		this.isVisibilidadCeldaCancelarFormularioRenta107 = isVisibilidadCeldaCancelarFormularioRenta107;
	}

	public Boolean getIsVisibilidadCeldaGuardarFormularioRenta107() {
		return isVisibilidadCeldaGuardarFormularioRenta107;
	}

	public void setIsVisibilidadCeldaGuardarFormularioRenta107(Boolean isVisibilidadCeldaGuardarFormularioRenta107) {
		this.isVisibilidadCeldaGuardarFormularioRenta107 = isVisibilidadCeldaGuardarFormularioRenta107;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosFormularioRenta107() {
		return isVisibilidadCeldaGuardarCambiosFormularioRenta107;
	}

	public void setIsVisibilidadCeldaGuardarCambiosFormularioRenta107(Boolean isVisibilidadCeldaGuardarCambiosFormularioRenta107) {
		this.isVisibilidadCeldaGuardarCambiosFormularioRenta107 = isVisibilidadCeldaGuardarCambiosFormularioRenta107;
	}
		
	public FormularioRenta107SessionBean getformulariorenta107SessionBean() {
		return this.formulariorenta107SessionBean;
	}
	
	public void setformulariorenta107SessionBean(FormularioRenta107SessionBean formulariorenta107SessionBean) {
		this.formulariorenta107SessionBean=formulariorenta107SessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdEjercicio() {
		return this.isVisibilidadFK_IdEjercicio;
	}

	public void setisVisibilidadFK_IdEjercicio(Boolean isVisibilidadFK_IdEjercicio) {
		this.isVisibilidadFK_IdEjercicio=isVisibilidadFK_IdEjercicio;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(FormularioRenta107 formulariorenta107)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(formulariorenta107,null);
				this.setActualParaGuardarEmpleadoForeignKey(formulariorenta107,null);
				this.setActualParaGuardarEjercicioForeignKey(formulariorenta107,null);
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
	
	public void bugActualizarReferenciaActual(FormularioRenta107 formulariorenta107,FormularioRenta107 formulariorenta107Aux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalFormularioRenta107(formulariorenta107);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		formulariorenta107Aux.setId(formulariorenta107.getId());
		formulariorenta107Aux.setVersionRow(formulariorenta107.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessFormularioRenta107();
		
			int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = formulariorenta107Validator.getInvalidValues(this.formulariorenta107);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			formulariorenta107Logic.setDatosCliente(datosCliente);
			formulariorenta107Logic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				formulariorenta107Aux=new  FormularioRenta107();
				
				formulariorenta107Aux.setIsNew(true);
				formulariorenta107Aux.setIsChanged(true);
				
				formulariorenta107Aux.setFormularioRenta107Original(this.formulariorenta107);
				
				formulariorenta107Aux.setId(this.formulariorenta107.getId());	
				formulariorenta107Aux.setVersionRow(this.formulariorenta107.getVersionRow());	
				formulariorenta107Aux.setid_empresa(this.formulariorenta107.getid_empresa());	
				formulariorenta107Aux.setid_empleado(this.formulariorenta107.getid_empleado());	
				formulariorenta107Aux.setid_ejercicio(this.formulariorenta107.getid_ejercicio());	
				formulariorenta107Aux.setnumero_pre_impreso(this.formulariorenta107.getnumero_pre_impreso());	
				formulariorenta107Aux.setfecha_entrega(this.formulariorenta107.getfecha_entrega());	
				formulariorenta107Aux.setfecha_generacion(this.formulariorenta107.getfecha_generacion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formulariorenta107SessionBean.getEsGuardarRelacionado())	{
						actualizarLista(formulariorenta107Aux,formulariorenta107Logic.getFormularioRenta107s());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulariorenta107Aux,formulariorenta107s);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formulariorenta107SessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107Logic.saveFormularioRenta107s();//WithConnection
						//formulariorenta107Logic.getSetVersionRowFormularioRenta107s();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formulariorenta107,formulariorenta107Aux);
					
					this.refrescarForeignKeysDescripcionesFormularioRenta107();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s().addAll(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107sEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107s.addAll(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107sEliminados);
						}
						//ARCHITECTURE	
						
						if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formulariorenta107Logic.saveFormularioRenta107Relaciones(formulariorenta107Aux,this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s());//WithConnection
								//formulariorenta107Logic.getSetVersionRowFormularioRenta107s();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formulariorenta107,formulariorenta107Aux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.setDetalleFormularioRenta107s(new ArrayList<DetalleFormularioRenta107>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107s= new ArrayList<DetalleFormularioRenta107>();
							}
							//ARCHITECTURE	
						} else {
							
							

							if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.quitarFilaTotales();}
							formulariorenta107Aux.setDetalleFormularioRenta107s(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones() 
									|| this.formulariorenta107SessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formulariorenta107Aux,formulariorenta107Logic.getFormularioRenta107s());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formulariorenta107Aux,formulariorenta107s);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formulariorenta107,formulariorenta107Aux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				formulariorenta107Aux=new  FormularioRenta107();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado() 
					|| (this.formulariorenta107SessionBean.getEsGuardarRelacionado() && this.formulariorenta107.getId()>=0)) {
						
					formulariorenta107Aux.setIsNew(false);
				}
				
				formulariorenta107Aux.setIsDeleted(false);
			
				formulariorenta107Aux.setId(this.formulariorenta107.getId());	
				formulariorenta107Aux.setVersionRow(this.formulariorenta107.getVersionRow());	
				formulariorenta107Aux.setid_empresa(this.formulariorenta107.getid_empresa());	
				formulariorenta107Aux.setid_empleado(this.formulariorenta107.getid_empleado());	
				formulariorenta107Aux.setid_ejercicio(this.formulariorenta107.getid_ejercicio());	
				formulariorenta107Aux.setnumero_pre_impreso(this.formulariorenta107.getnumero_pre_impreso());	
				formulariorenta107Aux.setfecha_entrega(this.formulariorenta107.getfecha_entrega());	
				formulariorenta107Aux.setfecha_generacion(this.formulariorenta107.getfecha_generacion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formulariorenta107Aux,formulariorenta107Logic.getFormularioRenta107s());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulariorenta107Aux,formulariorenta107s);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formulariorenta107SessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107Logic.saveFormularioRenta107s();//WithConnection
						//formulariorenta107Logic.getSetVersionRowFormularioRenta107s();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.formulariorenta107,formulariorenta107Aux);
					
					this.refrescarForeignKeysDescripcionesFormularioRenta107();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s().addAll(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107sEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107s.addAll(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107sEliminados);
						}
						//ARCHITECTURE
						
						if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formulariorenta107Logic.saveFormularioRenta107Relaciones(formulariorenta107Aux,this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s());//WithConnection
								//formulariorenta107Logic.getSetVersionRowFormularioRenta107s();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.formulariorenta107,formulariorenta107Aux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.setDetalleFormularioRenta107s(new ArrayList<DetalleFormularioRenta107>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107s= new ArrayList<DetalleFormularioRenta107>();
							}
							//ARCHITECTURE
						} else {
							
							

							if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.quitarFilaTotales();}
							formulariorenta107Aux.setDetalleFormularioRenta107s(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s());
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones() 
									|| this.formulariorenta107SessionBean.getEsGuardarRelacionado())	{
									actualizarLista(formulariorenta107Aux,formulariorenta107Logic.getFormularioRenta107s());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(formulariorenta107Aux,formulariorenta107s);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.formulariorenta107,formulariorenta107Aux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				formulariorenta107Aux=new  FormularioRenta107();
				
				formulariorenta107Aux.setIsNew(false);
				formulariorenta107Aux.setIsChanged(false);
				
				formulariorenta107Aux.setIsDeleted(true);
				
				formulariorenta107Aux.setId(this.formulariorenta107.getId());	
				formulariorenta107Aux.setVersionRow(this.formulariorenta107.getVersionRow());	
				formulariorenta107Aux.setid_empresa(this.formulariorenta107.getid_empresa());	
				formulariorenta107Aux.setid_empleado(this.formulariorenta107.getid_empleado());	
				formulariorenta107Aux.setid_ejercicio(this.formulariorenta107.getid_ejercicio());	
				formulariorenta107Aux.setnumero_pre_impreso(this.formulariorenta107.getnumero_pre_impreso());	
				formulariorenta107Aux.setfecha_entrega(this.formulariorenta107.getfecha_entrega());	
				formulariorenta107Aux.setfecha_generacion(this.formulariorenta107.getfecha_generacion());	
				
				if(this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.formulariorenta107Aux.getId()>=0) {	
						this.formulariorenta107sEliminados.add(formulariorenta107Aux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(formulariorenta107Aux,formulariorenta107Logic.getFormularioRenta107s());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulariorenta107Aux,formulariorenta107s);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones() 
						&& !this.formulariorenta107SessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107Logic.saveFormularioRenta107s();//WithConnection
						//formulariorenta107Logic.getSetVersionRowFormularioRenta107s();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s().addAll(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107sEliminados);
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107s.addAll(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107sEliminados);
						}
						//ARCHITECTURE
						
						
						if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
								if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.quitarFilaTotales();*/}
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
								if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.conTotales) {/*this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.quitarFilaTotales();*/}	
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								formulariorenta107Logic.saveFormularioRenta107Relaciones(formulariorenta107Aux,this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s());//WithConnection
								//formulariorenta107Logic.getSetVersionRowFormularioRenta107s();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.setDetalleFormularioRenta107s(new ArrayList<DetalleFormularioRenta107>());
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107s= new ArrayList<DetalleFormularioRenta107>();
							}
							//ARCHITECTURE
						}
					}  else {
							
						

							if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.conTotales) {this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.quitarFilaTotales();}
							formulariorenta107Aux.setDetalleFormularioRenta107s(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s());
								
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							if(this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones() 
								|| this.formulariorenta107SessionBean.getEsGuardarRelacionado())	{
								actualizarLista(formulariorenta107Aux,formulariorenta107Logic.getFormularioRenta107s());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(formulariorenta107Aux,formulariorenta107s);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.getFormularioRenta107s().addAll(this.formulariorenta107sEliminados);
					
					formulariorenta107Logic.saveFormularioRenta107s();//WithConnection
					//formulariorenta107Logic.getSetVersionRowFormularioRenta107s();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesFormularioRenta107();
				
				this.formulariorenta107sEliminados= new ArrayList<FormularioRenta107>();		
			}
			
			if(this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Formulario Renta107 GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Formulario Renta107",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.formulariorenta107=formulariorenta107Aux;
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
      		//this.finishProcessFormularioRenta107();
      	}
		
	}	
	
	public void actualizarRelaciones(FormularioRenta107 formulariorenta107Local) throws Exception {
		
		if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
				formulariorenta107Local.setDetalleFormularioRenta107s(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s());
			
			} else {
			
				formulariorenta107Local.setDetalleFormularioRenta107s(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107s);	
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(FormularioRenta107 formulariorenta107Local) throws Exception {	
		if(this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				formulariorenta107Local.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				formulariorenta107Local.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EjercicioDetalleFormJInternalFrame.class)) {
				EjercicioBeanSwingJInternalFrame ejercicioBeanSwingJInternalFrameLocal=(EjercicioBeanSwingJInternalFrame) ((EjercicioDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				ejercicioBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEjercicio(ejercicioBeanSwingJInternalFrameLocal.getejercicio(),true);
				ejercicioBeanSwingJInternalFrameLocal.actualizarLista(ejercicioBeanSwingJInternalFrameLocal.ejercicio,this.ejerciciosForeignKey);

				ejercicioBeanSwingJInternalFrameLocal.actualizarRelaciones(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				formulariorenta107Local.setEjercicio(ejercicioBeanSwingJInternalFrameLocal.ejercicio);

				this.addItemDefectoCombosForeignKeyEjercicio();
				this.cargarCombosFrameEjerciciosForeignKey("Formulario");
				this.setActualEjercicioForeignKey(ejercicioBeanSwingJInternalFrameLocal.ejercicio.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarFormularioRenta107Actual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = formulariorenta107Validator.getInvalidValues(this.formulariorenta107);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(FormularioRenta107 formulariorenta107,List<FormularioRenta107> formulariorenta107s) throws Exception {
		try	{		
			FormularioRenta107ConstantesFunciones.actualizarLista(formulariorenta107,formulariorenta107s,this.formulariorenta107SessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(FormularioRenta107 formulariorenta107,List<FormularioRenta107> formulariorenta107s) throws Exception {
		try	{			
			FormularioRenta107ConstantesFunciones.actualizarSelectedLista(formulariorenta107,formulariorenta107s);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<FormularioRenta107> formulariorenta107sLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				formulariorenta107sLocal=this.formulariorenta107Logic.getFormularioRenta107s();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				formulariorenta107sLocal=this.formulariorenta107s;
			}
			//ARCHITECTURE
		
			for(FormularioRenta107 formulariorenta107Local:formulariorenta107sLocal) {
				if(this.permiteMantenimiento(formulariorenta107Local) && formulariorenta107Local.getIsSelected()) {
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
			sMensaje+="\r\n"+FormularioRenta107ConstantesFunciones.getFormularioRenta107LabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(FormularioRenta107ConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta107.jLabelid_empresaFormularioRenta107,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRenta107ConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta107.jLabelid_empleadoFormularioRenta107,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRenta107ConstantesFunciones.IDEJERCICIO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta107.jLabelid_ejercicioFormularioRenta107,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRenta107ConstantesFunciones.NUMEROPREIMPRESO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta107.jLabelnumero_pre_impresoFormularioRenta107,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRenta107ConstantesFunciones.FECHAENTREGA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta107.jLabelfecha_entregaFormularioRenta107,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(FormularioRenta107ConstantesFunciones.FECHAGENERACION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta107.jLabelfecha_generacionFormularioRenta107,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta107.jLabelid_empresaFormularioRenta107,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta107.jLabelid_empleadoFormularioRenta107,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta107.jLabelid_ejercicioFormularioRenta107,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta107.jLabelnumero_pre_impresoFormularioRenta107,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta107.jLabelfecha_entregaFormularioRenta107,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormFormularioRenta107.jLabelfecha_generacionFormularioRenta107,"");
		
		}
	}
	
	
	
	public void actualizarObjetoPadreFk(String sTipo)  throws Exception {
		if(sTipo.equals("XXXAuxiliar")) {
		
		}
		
		 else  if(sTipo.equals("DetalleFormularioRenta107")) {
			if(this.formulariorenta107==null) {
				this.formulariorenta107= new FormularioRenta107();
			}

			if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) { //&& this.isEsNuevoFormularioRenta107
				this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true);//false
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);

				this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.getdetalleformulariorenta107().setFormularioRenta107(this.formulariorenta107);
			}

			return;
		}
	}
	
	public void nuevoPreparar() throws Exception {
		this.nuevoPreparar(false);
	}
	
	public void nuevoPreparar(Boolean esNuevoGuardarCambios) throws Exception {
		this.iIdNuevoFormularioRenta107--;	
		
		
		this.formulariorenta107Aux=new FormularioRenta107();
		
		this.formulariorenta107Aux.setId(this.iIdNuevoFormularioRenta107);
		this.formulariorenta107Aux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.formulariorenta107Logic.getFormularioRenta107s().add(this.formulariorenta107Aux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.formulariorenta107s.add(this.formulariorenta107Aux);
		}
		//ARCHITECTURE
		
		this.formulariorenta107=this.formulariorenta107Aux;
		
		if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioFormularioRenta107(this.formulariorenta107);
			this.setVariablesObjetoActualToFormularioForeignKeyFormularioRenta107(this.formulariorenta107);
		}
				
		//this.setDefaultControlesFormularioRenta107();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyFormularioRenta107();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyFormularioRenta107();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormularioRenta107();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormularioRenta107(this.formulariorenta107Bean,this.formulariorenta107,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(FormularioRenta107ConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
			classes=FormularioRenta107ConstantesFunciones.getClassesRelationshipsOfFormularioRenta107(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.formulariorenta107ReturnGeneral=formulariorenta107Logic.procesarEventosFormularioRenta107sWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formulariorenta107Logic.getFormularioRenta107s(),this.formulariorenta107,this.formulariorenta107ParameterGeneral,this.isEsNuevoFormularioRenta107,classes);//this.formulariorenta107Logic.getFormularioRenta107()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanFormularioRenta107(this.formulariorenta107ReturnGeneral,this.formulariorenta107Bean,false);
		
		if(this.formulariorenta107ReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyFormularioRenta107(this.formulariorenta107ReturnGeneral.getFormularioRenta107());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioFormularioRenta107(this.formulariorenta107ReturnGeneral.getFormularioRenta107());
		}
		
		if(this.formulariorenta107ReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioFormularioRenta107(this.formulariorenta107ReturnGeneral.getFormularioRenta107(),classes);//this.formulariorenta107Bean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyFormularioRenta107();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyFormularioRenta107();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.RecargarFormFormularioRenta107(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingFormularioRenta107(false);
						
			if(formulariorenta107SessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
				

				if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() && DetalleFormularioRenta107JInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleFormularioRenta107ActionPerformed(null,-1,false,true,null);
				}				
			}
				
			//SI ES MANUAL
			if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormularioRenta107();
			}
			
			this.actualizarVisualTableDatosFormularioRenta107();
			
			this.jTableDatosFormularioRenta107.setRowSelectionInterval(this.getIndiceNuevoFormularioRenta107(), this.getIndiceNuevoFormularioRenta107());
			
			this.seleccionarFilaTablaFormularioRenta107Actual();
						
			this.actualizarEstadoCeldasBotonesFormularioRenta107("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesFormularioRenta107(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormFormularioRenta107.jTextFieldnumero_pre_impresoFormularioRenta107.setEnabled(isHabilitar && this.formulariorenta107ConstantesFunciones.activarnumero_pre_impresoFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_entregaFormularioRenta107.setEnabled(isHabilitar && this.formulariorenta107ConstantesFunciones.activarfecha_entregaFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_generacionFormularioRenta107.setEnabled(isHabilitar && this.formulariorenta107ConstantesFunciones.activarfecha_generacionFormularioRenta107);	
		//
		this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.setEnabled(isHabilitar && this.formulariorenta107ConstantesFunciones.activarid_empresaFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.setEnabled(isHabilitar && this.formulariorenta107ConstantesFunciones.activarid_empleadoFormularioRenta107);//
		this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.setEnabled(isHabilitar && this.formulariorenta107ConstantesFunciones.activarid_ejercicioFormularioRenta107);
	};
	
	public void setDefaultControlesFormularioRenta107() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoFormularioRenta107(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.formulariorenta107SessionBean.setConGuardarRelaciones(true);			
			this.formulariorenta107SessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormFormularioRenta107.jTabbedPaneRelacionesFormularioRenta107.setVisible(true);
			
			

			if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107SessionBean.setEsGuardarRelacionado(true);
				//this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.getContentPane().setVisible(true);
			}		
		} else {
			//this.formulariorenta107SessionBean.setConGuardarRelaciones(false);			
			this.formulariorenta107SessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormFormularioRenta107.jTabbedPaneRelacionesFormularioRenta107.setVisible(false);
			
			

			if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null) {
				this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107SessionBean.setEsGuardarRelacionado(false);
				//this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.getContentPane().setVisible(false);
			}
		}
	};
	
	public int getIndiceNuevoFormularioRenta107() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107Logic.getFormularioRenta107s()) {
				if(formulariorenta107Aux.getId().equals(this.iIdNuevoFormularioRenta107)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107s) {
				if(formulariorenta107Aux.getId().equals(this.iIdNuevoFormularioRenta107)) {
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
	
	public int getIndiceActualFormularioRenta107(FormularioRenta107 formulariorenta107,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107Logic.getFormularioRenta107s()) {
				if(formulariorenta107Aux.getId().equals(formulariorenta107.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107s) {
				if(formulariorenta107Aux.getId().equals(formulariorenta107.getId())) {
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
	
	public void setCamposBaseDesdeOriginalFormularioRenta107(FormularioRenta107 formulariorenta107Original) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107Logic.getFormularioRenta107s()) {
				if(formulariorenta107Aux.getFormularioRenta107Original().getId().equals(formulariorenta107Original.getId())) {
					existe=true;
					formulariorenta107Original.setId(formulariorenta107Aux.getId());
					formulariorenta107Original.setVersionRow(formulariorenta107Aux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107s) {
				if(formulariorenta107Aux.getFormularioRenta107Original().getId().equals(formulariorenta107Original.getId())) {
					existe=true;
					formulariorenta107Original.setId(formulariorenta107Aux.getId());
					formulariorenta107Original.setVersionRow(formulariorenta107Aux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosFormularioRenta107(Boolean esParaCancelar) throws Exception {
		formulariorenta107sAux=new ArrayList<FormularioRenta107>();
		formulariorenta107Aux=new FormularioRenta107();
		
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107Logic.getFormularioRenta107s()) {
					if(formulariorenta107Aux.getId()<0) {
						formulariorenta107sAux.add(formulariorenta107Aux);
					}		
				}
				this.iIdNuevoFormularioRenta107=0L;
				this.formulariorenta107Logic.getFormularioRenta107s().removeAll(formulariorenta107sAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107s) {
					if(formulariorenta107Aux.getId()<0) {
						formulariorenta107sAux.add(formulariorenta107Aux);
					}		
				}
				this.iIdNuevoFormularioRenta107=0L;
				this.formulariorenta107s.removeAll(formulariorenta107sAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoFormularioRenta107 
					&& this.formulariorenta107Logic.getFormularioRenta107s().size()>0
					) {
					formulariorenta107Aux=this.formulariorenta107Logic.getFormularioRenta107s().get(this.formulariorenta107Logic.getFormularioRenta107s().size() - 1);
				
					if(formulariorenta107Aux.getId()<0) {
						this.formulariorenta107Logic.getFormularioRenta107s().remove(formulariorenta107Aux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoFormularioRenta107 && this.formulariorenta107s.size()>0) {
					formulariorenta107Aux=this.formulariorenta107s.get(this.formulariorenta107s.size() - 1);
				
					if(formulariorenta107Aux.getId()<0) {
						this.formulariorenta107s.remove(formulariorenta107Aux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoFormularioRenta107(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(formulariorenta107.getId()<0) {
				this.formulariorenta107Logic.getFormularioRenta107s().remove(this.formulariorenta107);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(formulariorenta107.getId()<0) {
				this.formulariorenta107s.remove(this.formulariorenta107);
			}
		}			
	}
	
	public void setEstadosInicialesFormularioRenta107(List<FormularioRenta107> formulariorenta107sAux) throws Exception {
		FormularioRenta107ConstantesFunciones.setEstadosInicialesFormularioRenta107(formulariorenta107sAux);
	}
	
	public void setEstadosInicialesFormularioRenta107(FormularioRenta107 formulariorenta107Aux) throws Exception {
		FormularioRenta107ConstantesFunciones.setEstadosInicialesFormularioRenta107(formulariorenta107Aux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarFormularioRenta107Actual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesFormularioRenta107("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarFormularioRenta107Actual()) {
				if(!this.isEsNuevoFormularioRenta107) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesFormularioRenta107("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoFormularioRenta107=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarFormularioRenta107Actual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Formulario Renta107 ?", "MANTENIMIENTO DE Formulario Renta107", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesFormularioRenta107("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(FormularioRenta107 formulariorenta107) throws Exception {
		FormularioRenta107ConstantesFunciones.seleccionarAsignar(this.formulariorenta107,formulariorenta107);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarFormularioRenta107=this.isPermisoActualizarOriginalFormularioRenta107;
			
			
			this.seleccionarAsignar(formulariorenta107);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			FormularioRenta107ConstantesFunciones.quitarEspaciosFormularioRenta107(this.formulariorenta107,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesFormularioRenta107("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.formulariorenta107SessionBean.setsFuncionBusquedaRapida(this.formulariorenta107SessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoFormularioRenta107) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosFormularioRenta107(esParaCancelar);				
				this.cancelarNuevoFormularioRenta107(esParaCancelar);								
			}
			
			this.formulariorenta107=new FormularioRenta107();
			
			this.inicializarFormularioRenta107();
			
			this.actualizarEstadoCeldasBotonesFormularioRenta107("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarFormularioRenta107() throws Exception {
		try {
			FormularioRenta107ConstantesFunciones.inicializarFormularioRenta107(this.formulariorenta107);
			
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
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.formulariorenta107Logic.getFormularioRenta107s().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteFormularioRenta107s(String sAccionBusqueda,List<FormularioRenta107> formulariorenta107sParaReportes) throws Exception {
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
					sPathReporteFinal="FormularioRenta107"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="FormularioRenta107MasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("FormularioRenta107MasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="FormularioRenta107"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Formulario Renta107es");		
		parameters.put("busquedapor", FormularioRenta107ConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			parameters.put("SUBREPORT_DIR", sPathReportes);
		}
		
		parameters.put("con_grafico", this.conGraficoReporte);
		
		JasperReport jasperReport = (JasperReport)JRLoader.loadObject(reportFile);
				
		this.cargarDatosCliente();
		
		ArrayList<Classe> classes=new ArrayList<Classe>();		
		
		if(this.sTipoReporte.equals("RELACIONES")) {//isEsReporteRelaciones
			
			classes.add(new Classe(DetalleFormularioRenta107.class));
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {		
				try	{
					
					FormularioRenta107Logic formulariorenta107LogicAuxiliar=new FormularioRenta107Logic();
					formulariorenta107LogicAuxiliar.setDatosCliente(formulariorenta107Logic.getDatosCliente());				
					formulariorenta107LogicAuxiliar.setFormularioRenta107s(formulariorenta107sParaReportes);
					
					formulariorenta107LogicAuxiliar.cargarRelacionesLoteForeignKeyFormularioRenta107WithConnection(); //deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes, "");
					
					formulariorenta107sParaReportes=formulariorenta107LogicAuxiliar.getFormularioRenta107s();
					
					//formulariorenta107Logic.getNewConnexionToDeep();
					
					//for (FormularioRenta107 formulariorenta107:formulariorenta107sParaReportes) {
					//	formulariorenta107Logic.deepLoad(formulariorenta107, false, DeepLoadType.INCLUDE, classes);
					//}						
					//formulariorenta107Logic.commitNewConnexionToDeep();
					
						
				} catch(Exception e) {
					throw e;
					
				} finally {
					//formulariorenta107Logic.closeNewConnexionToDeep();
				}
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			//ARCHITECTURE		
			
		
			
			

			InputStream reportFileDetalleFormularioRenta107 = AuxiliarReportes.class.getResourceAsStream("DetalleFormularioRenta107DetalleRelacionesDesign.jasper");
			parameters.put("subreport_detalleformulariorenta107", reportFileDetalleFormularioRenta107);
		} else {
			//FK DEBERIA TRAERSE DE ANTEMANO
			
		}
								
		
		//CLASSES PARA REPORTES OBJETOS RELACIONADOS
		if(!this.sTipoReporte.equals("RELACIONES")) {//!isEsReporteRelaciones
			classes=new ArrayList<Classe>();
		}
		
		JRBeanArrayDataSource jrbeanArrayDataSourceFormularioRenta107=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			FormularioRenta107ConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			FormularioRenta107ConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceFormularioRenta107=new JRBeanArrayDataSource(FormularioRenta107JInternalFrame.TraerFormularioRenta107Beans(formulariorenta107sParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceFormularioRenta107);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+FormularioRenta107ConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+FormularioRenta107ConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(FormularioRenta107Bean.TraerFormularioRenta107Beans(formulariorenta107sParaReportes).toArray()));
							
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
				this.generarExcelReporteFormularioRenta107s(sAccionBusqueda,sTipoArchivoReporte,formulariorenta107sParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalFormularioRenta107s(sAccionBusqueda,sTipoArchivoReporte,formulariorenta107sParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoFormularioRenta107ActionPerformed(null);
					//this.generarExcelReporteFormularioRenta107s(sAccionBusqueda,sTipoArchivoReporte,formulariorenta107sParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalFormularioRenta107s(sAccionBusqueda,sTipoArchivoReporte,formulariorenta107sParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesFormularioRenta107s(sAccionBusqueda,sTipoArchivoReporte,formulariorenta107sParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesFormularioRenta107s(sAccionBusqueda,sTipoArchivoReporte,formulariorenta107sParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteFormularioRenta107s(String sAccionBusqueda,String sTipoArchivoReporte,List<FormularioRenta107> formulariorenta107sParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta107";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormularioRenta107s");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormularioRenta107("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(FormularioRenta107 formulariorenta107 : formulariorenta107sParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			FormularioRenta107ConstantesFunciones.generarExcelReporteDataFormularioRenta107("NORMAL",row,workbook,formulariorenta107,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta107",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderFormularioRenta107(String sTipo,Row row,Workbook workbook) {
		
		FormularioRenta107ConstantesFunciones.generarExcelReporteHeaderFormularioRenta107(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalFormularioRenta107s(String sAccionBusqueda,String sTipoArchivoReporte,List<FormularioRenta107> formulariorenta107sParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta107_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormularioRenta107s");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(FormularioRenta107 formulariorenta107 : formulariorenta107sParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(FormularioRenta107ConstantesFunciones.getFormularioRenta107Descripcion(formulariorenta107));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta107.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta107.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta107.getejercicio_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta107.getnumero_pre_impreso());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta107.getfecha_entrega());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(formulariorenta107.getfecha_generacion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta107",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesFormularioRenta107s(String sAccionBusqueda,String sTipoArchivoReporte,List<FormularioRenta107> formulariorenta107sParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<FormularioRenta107> formulariorenta107sRespaldo=null;
		
		classes=FormularioRenta107ConstantesFunciones.getClassesRelationshipsOfFormularioRenta107(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.formulariorenta107Logic.setDatosCliente(this.datosCliente);
		this.formulariorenta107Logic.setDatosDeep(this.datosDeep);
		this.formulariorenta107Logic.setIsConDeep(true);
		
		formulariorenta107sRespaldo=this.formulariorenta107Logic.getFormularioRenta107s();
		
		this.formulariorenta107Logic.setFormularioRenta107s(formulariorenta107sParaReportes);	
		this.formulariorenta107Logic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		formulariorenta107sParaReportes=this.formulariorenta107Logic.getFormularioRenta107s();
		this.formulariorenta107Logic.setFormularioRenta107s(formulariorenta107sRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta107_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("FormularioRenta107s");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderFormularioRenta107("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(FormularioRenta107 formulariorenta107 : formulariorenta107sParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderFormularioRenta107("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			FormularioRenta107ConstantesFunciones.generarExcelReporteDataFormularioRenta107("NORMAL",row,workbook,formulariorenta107,cellStyleDataAux);
		
			
			


				//DetalleFormularioRenta107
			if(!paraDinamico || (paraDinamico && this.existeRelacionReporteDinamico(DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO))) {

				if(formulariorenta107.getDetalleFormularioRenta107s()!=null && formulariorenta107.getDetalleFormularioRenta107s().size()>0) {
					row = sheet.createRow(iRow++);

					iCell=1;iRowLast=iRow-1; cell = row.createCell(iCell++);cell.setCellStyle(cellStyleDataTitulo);sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,1,5));
					cell.setCellValue(DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);

					row = sheet.createRow(iRow++);
					DetalleFormularioRenta107ConstantesFunciones.generarExcelReporteHeaderDetalleFormularioRenta107("RELACIONADO",row,workbook);
				}

				if(formulariorenta107.getDetalleFormularioRenta107s()!=null) {
					i2=0;
					for(DetalleFormularioRenta107 detalleformulariorenta107 : formulariorenta107.getDetalleFormularioRenta107s()) {
						row = sheet.createRow(iRow++);

						cellStyleDataAuxHijo=null;
						if(i2%2==0) {
							cellStyleDataAuxHijo=cellStyleData;
						}

						DetalleFormularioRenta107ConstantesFunciones.generarExcelReporteDataDetalleFormularioRenta107("RELACIONADO",row,workbook,detalleformulariorenta107,cellStyleDataAuxHijo);
						i2++;
					}
				}
			}
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(FormularioRenta107ConstantesFunciones.getFormularioRenta107Descripcion(formulariorenta107));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta107",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoFormularioRenta107.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessFormularioRenta107() throws Exception {		
		this.startProcessFormularioRenta107(true);
	}
	
	public void startProcessFormularioRenta107(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasFormularioRenta107 ,this.jPanelParametrosReportesFormularioRenta107, this.jScrollPanelDatosFormularioRenta107,this.jPanelPaginacionFormularioRenta107, this.jScrollPanelDatosEdicionFormularioRenta107, this.jPanelAccionesFormularioRenta107,this.jPanelAccionesFormularioFormularioRenta107,this.jmenuBarFormularioRenta107,this.jmenuBarDetalleFormularioRenta107,this.jTtoolBarFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107);		
		
		final JTabbedPane jTabbedPaneBusquedasFormularioRenta107=this.jTabbedPaneBusquedasFormularioRenta107; 
		
		final JPanel jPanelParametrosReportesFormularioRenta107=this.jPanelParametrosReportesFormularioRenta107;
		//final JScrollPane jScrollPanelDatosFormularioRenta107=this.jScrollPanelDatosFormularioRenta107;
		final JTable jTableDatosFormularioRenta107=this.jTableDatosFormularioRenta107;		
		final JPanel jPanelPaginacionFormularioRenta107=this.jPanelPaginacionFormularioRenta107;
		//final JScrollPane jScrollPanelDatosEdicionFormularioRenta107=this.jScrollPanelDatosEdicionFormularioRenta107;
		final JPanel jPanelAccionesFormularioRenta107=this.jPanelAccionesFormularioRenta107;
		
		JPanel jPanelCamposAuxiliarFormularioRenta107=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarFormularioRenta107=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			jPanelCamposAuxiliarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jPanelCamposFormularioRenta107;
			jPanelAccionesFormularioAuxiliarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jPanelAccionesFormularioFormularioRenta107;
		}
		
		final JPanel jPanelCamposFormularioRenta107=jPanelCamposAuxiliarFormularioRenta107;
		final JPanel jPanelAccionesFormularioFormularioRenta107=jPanelAccionesFormularioAuxiliarFormularioRenta107;
		
		
		final JMenuBar jmenuBarFormularioRenta107=this.jmenuBarFormularioRenta107;
		final JToolBar jTtoolBarFormularioRenta107=this.jTtoolBarFormularioRenta107;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarFormularioRenta107=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormularioRenta107=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			jmenuBarDetalleAuxiliarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jmenuBarDetalleFormularioRenta107;
			jTtoolBarDetalleAuxiliarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jTtoolBarDetalleFormularioRenta107;
		}
		
		final JMenuBar jmenuBarDetalleFormularioRenta107=jmenuBarDetalleAuxiliarFormularioRenta107;
		final JToolBar jTtoolBarDetalleFormularioRenta107=jTtoolBarDetalleAuxiliarFormularioRenta107;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormularioRenta107;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormularioRenta107;
			processRunnable.jTableDatos=jTableDatosFormularioRenta107;
			processRunnable.jPanelCampos=jPanelCamposFormularioRenta107;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormularioRenta107;
			processRunnable.jPanelAcciones=jPanelAccionesFormularioRenta107;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormularioRenta107;
			
			
			processRunnable.jmenuBar=jmenuBarFormularioRenta107;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormularioRenta107;
			processRunnable.jTtoolBar=jTtoolBarFormularioRenta107;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormularioRenta107;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormularioRenta107 ,jPanelParametrosReportesFormularioRenta107,jTableDatosFormularioRenta107, /*jScrollPanelDatosFormularioRenta107,*/jPanelCamposFormularioRenta107,jPanelPaginacionFormularioRenta107, /*jScrollPanelDatosEdicionFormularioRenta107,*/ jPanelAccionesFormularioRenta107,jPanelAccionesFormularioFormularioRenta107,jmenuBarFormularioRenta107,jmenuBarDetalleFormularioRenta107,jTtoolBarFormularioRenta107,jTtoolBarDetalleFormularioRenta107);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasFormularioRenta107 ,jPanelParametrosReportesFormularioRenta107, jScrollPanelDatosFormularioRenta107,jPanelPaginacionFormularioRenta107, jScrollPanelDatosEdicionFormularioRenta107, jPanelAccionesFormularioRenta107,jPanelAccionesFormularioFormularioRenta107,jmenuBarFormularioRenta107,jmenuBarDetalleFormularioRenta107,jTtoolBarFormularioRenta107,jTtoolBarDetalleFormularioRenta107);
						
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
	
	public void finishProcessFormularioRenta107() {// throws Exception 
		this.finishProcessFormularioRenta107(true);
	}
	
	public void finishProcessFormularioRenta107(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasFormularioRenta107 ,this.jPanelParametrosReportesFormularioRenta107, this.jScrollPanelDatosFormularioRenta107,this.jPanelPaginacionFormularioRenta107, this.jScrollPanelDatosEdicionFormularioRenta107, this.jPanelAccionesFormularioRenta107,this.jPanelAccionesFormularioFormularioRenta107,this.jmenuBarFormularioRenta107,this.jmenuBarDetalleFormularioRenta107,this.jTtoolBarFormularioRenta107,this.jTtoolBarDetalleFormularioRenta107);		
		
		final JTabbedPane jTabbedPaneBusquedasFormularioRenta107=this.jTabbedPaneBusquedasFormularioRenta107; 
		
		final JPanel jPanelParametrosReportesFormularioRenta107=this.jPanelParametrosReportesFormularioRenta107;
		//final JScrollPane jScrollPanelDatosFormularioRenta107=this.jScrollPanelDatosFormularioRenta107;
		final JTable jTableDatosFormularioRenta107=this.jTableDatosFormularioRenta107;		
		final JPanel jPanelPaginacionFormularioRenta107=this.jPanelPaginacionFormularioRenta107;
		//final JScrollPane jScrollPanelDatosEdicionFormularioRenta107=this.jScrollPanelDatosEdicionFormularioRenta107;
		final JPanel jPanelAccionesFormularioRenta107=this.jPanelAccionesFormularioRenta107;
		
		JPanel jPanelCamposAuxiliarFormularioRenta107=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarFormularioRenta107=new JPanel();
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			jPanelCamposAuxiliarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jPanelCamposFormularioRenta107;
			jPanelAccionesFormularioAuxiliarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jPanelAccionesFormularioFormularioRenta107;
		}
		
		final JPanel jPanelCamposFormularioRenta107=jPanelCamposAuxiliarFormularioRenta107;
		final JPanel jPanelAccionesFormularioFormularioRenta107=jPanelAccionesFormularioAuxiliarFormularioRenta107;
		
		
		final JMenuBar jmenuBarFormularioRenta107=this.jmenuBarFormularioRenta107;		
		final JToolBar jTtoolBarFormularioRenta107=this.jTtoolBarFormularioRenta107;
				
		JMenuBar jmenuBarDetalleAuxiliarFormularioRenta107=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarFormularioRenta107=new JToolBar();
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			jmenuBarDetalleAuxiliarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jmenuBarDetalleFormularioRenta107;
			jTtoolBarDetalleAuxiliarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jTtoolBarDetalleFormularioRenta107;		
		}
		
		final JMenuBar jmenuBarDetalleFormularioRenta107=jmenuBarDetalleAuxiliarFormularioRenta107;
		final JToolBar jTtoolBarDetalleFormularioRenta107=jTtoolBarDetalleAuxiliarFormularioRenta107;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasFormularioRenta107;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesFormularioRenta107;
			processRunnable.jTableDatos=jTableDatosFormularioRenta107;
			processRunnable.jPanelCampos=jPanelCamposFormularioRenta107;
			processRunnable.jPanelPaginacion=jPanelPaginacionFormularioRenta107;
			processRunnable.jPanelAcciones=jPanelAccionesFormularioRenta107;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioFormularioRenta107;
			
			
			processRunnable.jmenuBar=jmenuBarFormularioRenta107;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleFormularioRenta107;
			processRunnable.jTtoolBar=jTtoolBarFormularioRenta107;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleFormularioRenta107;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasFormularioRenta107 ,jPanelParametrosReportesFormularioRenta107, jTableDatosFormularioRenta107,/*jScrollPanelDatosFormularioRenta107,*/jPanelCamposFormularioRenta107,jPanelPaginacionFormularioRenta107, /*jScrollPanelDatosEdicionFormularioRenta107,*/ jPanelAccionesFormularioRenta107,jPanelAccionesFormularioFormularioRenta107,jmenuBarFormularioRenta107,jmenuBarDetalleFormularioRenta107,jTtoolBarFormularioRenta107,jTtoolBarDetalleFormularioRenta107));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesFormularioRenta107(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarFormularioRenta107(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuFormularioRenta107(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarFormularioRenta107(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarFormularioRenta107,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleFormularioRenta107,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuFormularioRenta107(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarFormularioRenta107,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleFormularioRenta107,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.formulariorenta107ConstantesFunciones.getsFinalQueryFormularioRenta107();
		String  finalQueryPaginacionTodos=this.formulariorenta107ConstantesFunciones.getsFinalQueryFormularioRenta107();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=FormularioRenta107ConstantesFunciones.getArrayColumnasGlobalesNoFormularioRenta107(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=FormularioRenta107ConstantesFunciones.getArrayColumnasGlobalesFormularioRenta107(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,FormularioRenta107ConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.formulariorenta107sEliminados= new ArrayList<FormularioRenta107>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessFormularioRenta107();
		
				///*FormularioRenta107SessionBean*/this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
			
			if(this.formulariorenta107SessionBean==null) {
				this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
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
					this.iNumeroPaginacion=FormularioRenta107ConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=FormularioRenta107ConstantesFunciones.getClassesForeignKeysOfFormularioRenta107(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/formulariorenta107."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			formulariorenta107sAux= new ArrayList<FormularioRenta107>();
			
				
			formulariorenta107Logic.setDatosCliente(this.datosCliente);
			formulariorenta107Logic.setDatosDeep(this.datosDeep);
			formulariorenta107Logic.setIsConDeep(true);
			
			
			formulariorenta107Logic.getFormularioRenta107DataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					formulariorenta107Logic.getTodosFormularioRenta107s(finalQueryGlobal,pagination);
					
					//formulariorenta107Logic.getTodosFormularioRenta107sWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(formulariorenta107Logic.getFormularioRenta107s()==null|| formulariorenta107Logic.getFormularioRenta107s().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formulariorenta107sAux= new ArrayList<FormularioRenta107>();
							formulariorenta107sAux.addAll(formulariorenta107Logic.getFormularioRenta107s());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorenta107sAux= new ArrayList<FormularioRenta107>();
							formulariorenta107sAux.addAll(formulariorenta107s);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formulariorenta107Logic.getTodosFormularioRenta107s(finalQueryGlobal+"",this.pagination);												
							
							//formulariorenta107Logic.getTodosFormularioRenta107sWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteFormularioRenta107s("Todos",formulariorenta107Logic.getFormularioRenta107s() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							formulariorenta107Logic.setFormularioRenta107s(new ArrayList<FormularioRenta107>());					
							formulariorenta107Logic.getFormularioRenta107s().addAll(formulariorenta107sAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorenta107s=new ArrayList<FormularioRenta107>();
							formulariorenta107s.addAll(formulariorenta107sAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idFormularioRenta107=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idFormularioRenta107=this.idActual;
				
				} else if(this.idFormularioRenta107Actual!=null && this.idFormularioRenta107Actual!=0L) {
					idFormularioRenta107=idFormularioRenta107Actual;
				}
				
					
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndicePorId(idFormularioRenta107);
				
				this.formulariorenta107s=new ArrayList<FormularioRenta107>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					formulariorenta107Logic.getEntity(idFormularioRenta107);
					
					//formulariorenta107Logic.getEntityWithConnection(idFormularioRenta107);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorenta107Logic.setFormularioRenta107s(new ArrayList<FormularioRenta107>());
					formulariorenta107Logic.getFormularioRenta107s().add(formulariorenta107Logic.getFormularioRenta107());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta107s=new ArrayList<FormularioRenta107>();
					this.formulariorenta107s.add(formulariorenta107);
				}
				
				if(formulariorenta107Logic.getFormularioRenta107()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEjercicio")) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorenta107Logic.getFormularioRenta107sFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorenta107Logic.getFormularioRenta107s()==null||formulariorenta107Logic.getFormularioRenta107s().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorenta107s==null|| formulariorenta107s.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107sAux=new ArrayList<FormularioRenta107>();
						formulariorenta107sAux.addAll(formulariorenta107Logic.getFormularioRenta107s());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorenta107sAux=new ArrayList<FormularioRenta107>();
							formulariorenta107sAux.addAll(formulariorenta107s);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorenta107Logic.getFormularioRenta107sFK_IdEjercicio(finalQueryGlobal,pagination,id_ejercicioFK_IdEjercicio);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEjercicio(id_ejercicioFK_IdEjercicio);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRenta107s("FK_IdEjercicio",formulariorenta107Logic.getFormularioRenta107s());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRenta107s("FK_IdEjercicio",formulariorenta107s);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107Logic.setFormularioRenta107s(new ArrayList<FormularioRenta107>());
						formulariorenta107Logic.getFormularioRenta107s().addAll(formulariorenta107sAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorenta107s=new ArrayList<FormularioRenta107>();
							formulariorenta107s.addAll(formulariorenta107sAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorenta107Logic.getFormularioRenta107sFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorenta107Logic.getFormularioRenta107s()==null||formulariorenta107Logic.getFormularioRenta107s().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorenta107s==null|| formulariorenta107s.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107sAux=new ArrayList<FormularioRenta107>();
						formulariorenta107sAux.addAll(formulariorenta107Logic.getFormularioRenta107s());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorenta107sAux=new ArrayList<FormularioRenta107>();
							formulariorenta107sAux.addAll(formulariorenta107s);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorenta107Logic.getFormularioRenta107sFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRenta107s("FK_IdEmpleado",formulariorenta107Logic.getFormularioRenta107s());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRenta107s("FK_IdEmpleado",formulariorenta107s);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107Logic.setFormularioRenta107s(new ArrayList<FormularioRenta107>());
						formulariorenta107Logic.getFormularioRenta107s().addAll(formulariorenta107sAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorenta107s=new ArrayList<FormularioRenta107>();
							formulariorenta107s.addAll(formulariorenta107sAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					formulariorenta107Logic.getFormularioRenta107sFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=formulariorenta107Logic.getFormularioRenta107s()==null||formulariorenta107Logic.getFormularioRenta107s().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=formulariorenta107s==null|| formulariorenta107s.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107sAux=new ArrayList<FormularioRenta107>();
						formulariorenta107sAux.addAll(formulariorenta107Logic.getFormularioRenta107s());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorenta107sAux=new ArrayList<FormularioRenta107>();
							formulariorenta107sAux.addAll(formulariorenta107s);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							formulariorenta107Logic.getFormularioRenta107sFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=FormularioRenta107ConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteFormularioRenta107s("FK_IdEmpresa",formulariorenta107Logic.getFormularioRenta107s());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteFormularioRenta107s("FK_IdEmpresa",formulariorenta107s);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107Logic.setFormularioRenta107s(new ArrayList<FormularioRenta107>());
						formulariorenta107Logic.getFormularioRenta107s().addAll(formulariorenta107sAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorenta107s=new ArrayList<FormularioRenta107>();
							formulariorenta107s.addAll(formulariorenta107sAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesFormularioRenta107();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessFormularioRenta107();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formulariorenta107Logic.getFormularioRenta107s().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formulariorenta107s.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=formulariorenta107Logic.getFormularioRenta107s().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=formulariorenta107s.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(FormularioRenta107 formulariorenta107) {
		Boolean permite=true;
		
		if(this.formulariorenta107.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=FormularioRenta107ConstantesFunciones.getOrderByListaFormularioRenta107();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=FormularioRenta107ConstantesFunciones.getOrderByListaFormularioRenta107();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioRenta107 formulariorenta107:formulariorenta107Logic.getFormularioRenta107s()) {
				if(formulariorenta107.getsType().equals(Constantes2.S_TOTALES)) {
					formulariorenta107Totales=formulariorenta107;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioRenta107 formulariorenta107:this.formulariorenta107s) {
				if(formulariorenta107.getsType().equals(Constantes2.S_TOTALES)) {
					formulariorenta107Totales=formulariorenta107;
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
			this.formulariorenta107Aux=new FormularioRenta107();
			this.formulariorenta107Aux.setsType(Constantes2.S_TOTALES);
			this.formulariorenta107Aux.setIsNew(false);
			this.formulariorenta107Aux.setIsChanged(false);
			this.formulariorenta107Aux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				FormularioRenta107ConstantesFunciones.TotalizarValoresFilaFormularioRenta107(this.formulariorenta107Logic.getFormularioRenta107s(),this.formulariorenta107Aux);
				
				this.formulariorenta107Logic.getFormularioRenta107s().add(this.formulariorenta107Aux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				FormularioRenta107ConstantesFunciones.TotalizarValoresFilaFormularioRenta107(this.formulariorenta107s,this.formulariorenta107Aux);
				
				this.formulariorenta107s.add(this.formulariorenta107Aux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		formulariorenta107Totales=new FormularioRenta107();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formulariorenta107Logic.getFormularioRenta107s().remove(formulariorenta107Totales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.formulariorenta107s.remove(formulariorenta107Totales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		formulariorenta107Totales=new FormularioRenta107();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(FormularioRenta107 formulariorenta107:formulariorenta107Logic.getFormularioRenta107s()) {
				if(formulariorenta107.getsType().equals(Constantes2.S_TOTALES)) {
					formulariorenta107Totales=formulariorenta107;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormularioRenta107ConstantesFunciones.TotalizarValoresFilaFormularioRenta107(this.formulariorenta107Logic.getFormularioRenta107s(),formulariorenta107Totales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(FormularioRenta107 formulariorenta107:this.formulariorenta107s) {
				if(formulariorenta107.getsType().equals(Constantes2.S_TOTALES)) {
					formulariorenta107Totales=formulariorenta107;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				FormularioRenta107ConstantesFunciones.TotalizarValoresFilaFormularioRenta107(this.formulariorenta107s,formulariorenta107Totales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getFormularioRenta107sFK_IdEjercicio()throws Exception {
		try {
			sAccionBusqueda="FK_IdEjercicio";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioRenta107sFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getFormularioRenta107sFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getFormularioRenta107sFK_IdEjercicio(String sFinalQuery,Long id_ejercicio)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorenta107Logic.getFormularioRenta107sFK_IdEjercicio(sFinalQuery,this.pagination,id_ejercicio);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioRenta107sFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorenta107Logic.getFormularioRenta107sFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getFormularioRenta107sFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorenta107Logic.getFormularioRenta107sFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosFormularioRenta107() {
		this.isPermisoTodoFormularioRenta107=false;
		this.isPermisoNuevoFormularioRenta107=false;
		this.isPermisoActualizarFormularioRenta107=false;
		this.isPermisoActualizarOriginalFormularioRenta107=false;
		this.isPermisoEliminarFormularioRenta107=false;
		this.isPermisoGuardarCambiosFormularioRenta107=false;
		this.isPermisoConsultaFormularioRenta107=false;
		this.isPermisoBusquedaFormularioRenta107=false;
		this.isPermisoReporteFormularioRenta107=false;		
		this.isPermisoOrdenFormularioRenta107=false;		
		this.isPermisoPaginacionMedioFormularioRenta107=false;		
		this.isPermisoPaginacionAltoFormularioRenta107=false;
		this.isPermisoPaginacionTodoFormularioRenta107=false;
		this.isPermisoCopiarFormularioRenta107=false;		
		this.isPermisoVerFormFormularioRenta107=false;		
		this.isPermisoDuplicarFormularioRenta107=false;		
		this.isPermisoOrdenFormularioRenta107=false;		
	}
	
	public void setPermisosUsuarioFormularioRenta107(Boolean isPermiso) {
		this.isPermisoTodoFormularioRenta107=isPermiso;
		this.isPermisoNuevoFormularioRenta107=isPermiso;
		this.isPermisoActualizarFormularioRenta107=isPermiso;
		this.isPermisoActualizarOriginalFormularioRenta107=isPermiso;
		this.isPermisoEliminarFormularioRenta107=isPermiso;
		this.isPermisoGuardarCambiosFormularioRenta107=isPermiso;
		this.isPermisoConsultaFormularioRenta107=isPermiso;
		this.isPermisoBusquedaFormularioRenta107=isPermiso;
		this.isPermisoReporteFormularioRenta107=isPermiso;
		this.isPermisoOrdenFormularioRenta107=isPermiso;		
		this.isPermisoPaginacionMedioFormularioRenta107=isPermiso;		
		this.isPermisoPaginacionAltoFormularioRenta107=isPermiso;		
		this.isPermisoPaginacionTodoFormularioRenta107=isPermiso;		
		this.isPermisoCopiarFormularioRenta107=isPermiso;		
		this.isPermisoVerFormFormularioRenta107=isPermiso;		
		this.isPermisoDuplicarFormularioRenta107=isPermiso;
		this.isPermisoOrdenFormularioRenta107=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioFormularioRenta107(Boolean isPermiso) {
		//this.isPermisoTodoFormularioRenta107=isPermiso;
		this.isPermisoNuevoFormularioRenta107=isPermiso;
		this.isPermisoActualizarFormularioRenta107=isPermiso;
		this.isPermisoActualizarOriginalFormularioRenta107=isPermiso;
		this.isPermisoEliminarFormularioRenta107=isPermiso;
		this.isPermisoGuardarCambiosFormularioRenta107=isPermiso;
		//this.isPermisoConsultaFormularioRenta107=isPermiso;
		//this.isPermisoBusquedaFormularioRenta107=isPermiso;
		//this.isPermisoReporteFormularioRenta107=isPermiso;
		//this.isPermisoOrdenFormularioRenta107=isPermiso;		
		//this.isPermisoPaginacionMedioFormularioRenta107=isPermiso;		
		//this.isPermisoPaginacionAltoFormularioRenta107=isPermiso;		
		//this.isPermisoPaginacionTodoFormularioRenta107=isPermiso;		
		//this.isPermisoCopiarFormularioRenta107=isPermiso;		
		//this.isPermisoDuplicarFormularioRenta107=isPermiso;
		//this.isPermisoOrdenFormularioRenta107=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioFormularioRenta107ClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		arrPaginas.add(DetalleFormularioRenta107ConstantesFunciones.SNOMBREOPCION);
		
		if(FormularioRenta107JInternalFrame.CON_LLAMADA_SIMPLE) {
			this.opcionsRelacionadas.addAll(this.sistemaReturnGeneral.getOpcionsRelacionadas());
			
		} else {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				opcionsFinal=sistemaLogicAdditional.tienePermisosOpcionesEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, arrPaginas);
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
			
			this.opcionsRelacionadas.addAll(opcionsFinal);
		}
		
		

		this.isTienePermisosDetalleFormularioRenta107=false;
		this.isTienePermisosDetalleFormularioRenta107=this.verificarGetPermisosUsuarioOpcionFormularioRenta107ClaseRelacionada(this.opcionsRelacionadas,DetalleFormularioRenta107ConstantesFunciones.SNOMBREOPCION);
		
	}
	
	public Boolean tienePermisosUsuarioEnPaginaWebFormularioRenta107(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioFormularioRenta107ClasesRelacionadas(Boolean conPermiso) throws Exception {
		
		this.isTienePermisosDetalleFormularioRenta107=conPermiso;
	}
	
	public Boolean verificarGetPermisosUsuarioFormularioRenta107ClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionFormularioRenta107ClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioFormularioRenta107ClasesRelacionadas() throws Exception {
		

		if(!this.isTienePermisosDetalleFormularioRenta107 && this.jInternalFrameDetalleFormFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormularioRenta107.jTabbedPaneRelacionesFormularioRenta107.remove(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.getContentPane());
		}
	}
	
	public void setPermisosUsuarioFormularioRenta107() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(FormularioRenta107JInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, FormularioRenta107ConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoFormularioRenta107=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarFormularioRenta107=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalFormularioRenta107=this.isPermisoActualizarFormularioRenta107;
			this.isPermisoEliminarFormularioRenta107=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosFormularioRenta107=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaFormularioRenta107=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaFormularioRenta107=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoFormularioRenta107=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteFormularioRenta107=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormularioRenta107=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioFormularioRenta107=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoFormularioRenta107=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoFormularioRenta107=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarFormularioRenta107=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormFormularioRenta107=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarFormularioRenta107=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenFormularioRenta107=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosFormularioRenta107.setToolTipText(this.jTableDatosFormularioRenta107.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioFormularioRenta107(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioFormularioRenta107(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(FormularioRenta107JInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(FormularioRenta107JInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioFormularioRenta107() throws Exception {
		Reporte reporte=null;
		
		

		if(this.isTienePermisosDetalleFormularioRenta107 && this.formulariorenta107ConstantesFunciones.mostrarDetalleFormularioRenta107FormularioRenta107 && !FormularioRenta107ConstantesFunciones.ISGUARDARREL) {

			reporte=new Reporte();
			reporte.setsCodigo("Detalle Formulario Renta107");
			reporte.setsDescripcion("Detalle Formulario Renta107");
			this.tiposRelaciones.add(reporte);
		}
		
		
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
	public void inicializarCombosForeignKeyFormularioRenta107Listas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.ejerciciosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyFormularioRenta107Listas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(FormularioRenta107JInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyFormularioRenta107Listas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEjercicioListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyFormularioRenta107Listas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			FormularioRenta107ParameterReturnGeneral formulariorenta107ReturnGeneral=new FormularioRenta107ParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.formulariorenta107ConstantesFunciones.cargarid_empresaFormularioRenta107)
					 || (this.esRecargarFks && this.formulariorenta107ConstantesFunciones.cargarid_empresaFormularioRenta107)) {

					if(!this.formulariorenta107SessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+formulariorenta107SessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.formulariorenta107ConstantesFunciones.cargarid_empleadoFormularioRenta107)
					 || (this.esRecargarFks && this.formulariorenta107ConstantesFunciones.cargarid_empleadoFormularioRenta107)) {

					if(!this.formulariorenta107SessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+formulariorenta107SessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalEjercicio="";

				if(((this.ejerciciosForeignKey==null||this.ejerciciosForeignKey.size()<=0) && this.formulariorenta107ConstantesFunciones.cargarid_ejercicioFormularioRenta107)
					 || (this.esRecargarFks && this.formulariorenta107ConstantesFunciones.cargarid_ejercicioFormularioRenta107)) {

					if(!this.formulariorenta107SessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EjercicioConstantesFunciones.getArrayColumnasGlobalesEjercicio(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEjercicio=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EjercicioConstantesFunciones.TABLENAME);

						finalQueryGlobalEjercicio=Funciones.GetFinalQueryAppend(finalQueryGlobalEjercicio, "");
						finalQueryGlobalEjercicio+=EjercicioConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEjerciciosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEjercicio=" WHERE " + ConstantesSql.ID + "="+formulariorenta107SessionBean.getlidEjercicioActual();
					}
				} else {
					finalQueryGlobalEjercicio="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				formulariorenta107ReturnGeneral=formulariorenta107Logic.cargarCombosLoteForeignKeyFormularioRenta107(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalEjercicio);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=formulariorenta107ReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=formulariorenta107ReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalEjercicio.equals("NONE")) {
				this.ejerciciosForeignKey=formulariorenta107ReturnGeneral.getejerciciosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyFormularioRenta107()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyEjercicio();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.formulariorenta107SessionBean==null) {
				this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
			}

			if(!this.formulariorenta107SessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.formulariorenta107SessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyEjercicio()throws Exception {
		try {

			if(!this.formulariorenta107SessionBean.getisBusquedaDesdeForeignKeySesionEjercicio()) {
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
	
	public void initActionsCombosTodosForeignKeyFormularioRenta107()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyFormularioRenta107(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyFormularioRenta107()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
				this.setActualEjercicioForeignKey(this.parametroGeneralUsuario.getid_ejercicio(),false,"Formulario");
			
			
				this.formulariorenta107.setfecha_entrega(this.parametroGeneralUsuario.getfecha_sistema());
				this.formulariorenta107.setfecha_generacion(this.parametroGeneralUsuario.getfecha_sistema());
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyFormularioRenta107();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyFormularioRenta107(FormularioRenta107 formulariorenta107)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(formulariorenta107.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyFormularioRenta107(FormularioRenta107 formulariorenta107,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyFormularioRenta107()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.formulariorenta107ConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyFormularioRenta107()throws Exception {	
		try {
			

				if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
					Ejercicio ejercicioActual=(Ejercicio)this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.getSelectedItem();
				}
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyFormularioRenta107()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyFormularioRenta107()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroFormularioRenta107()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyFormularioRenta107()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameEjerciciosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyFormularioRenta107(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEjerciciosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyFormularioRenta107()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.getItemCount()>0) {
				this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public FormularioRenta107BeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public FormularioRenta107BeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public FormularioRenta107BeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.formulariorenta107SessionBean=new FormularioRenta107SessionBean(); 
		this.formulariorenta107ConstantesFunciones=new FormularioRenta107ConstantesFunciones(); 
		this.formulariorenta107Bean=new FormularioRenta107();//(this.formulariorenta107ConstantesFunciones); 		
		this.formulariorenta107ReturnGeneral=new FormularioRenta107ParameterReturnGeneral(); 
		
		this.formulariorenta107SessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.formulariorenta107SessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public FormularioRenta107BeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public FormularioRenta107BeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public FormularioRenta107BeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessFormularioRenta107(true);
			
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
			
			this.formulariorenta107ConstantesFunciones=new FormularioRenta107ConstantesFunciones(); 
			this.formulariorenta107Bean=new FormularioRenta107();//this.formulariorenta107ConstantesFunciones); 			
			this.formulariorenta107ReturnGeneral=new FormularioRenta107ParameterReturnGeneral(); 
		
			FormularioRenta107BeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Formulario Renta107 Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.formulariorenta107=new FormularioRenta107();
			this.formulariorenta107s = new ArrayList<FormularioRenta107>();
			this.formulariorenta107sAux = new ArrayList<FormularioRenta107>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic=new FormularioRenta107Logic();
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}
			
			//this.formulariorenta107SessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.formulariorenta107SessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormFormularioRenta107);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoFormularioRenta107!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormularioRenta107);	
					}
					
					if(this.jInternalFrameImportacionFormularioRenta107!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormularioRenta107);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByFormularioRenta107!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByFormularioRenta107);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormFormularioRenta107);
				this.jInternalFrameDetalleFormFormularioRenta107.setVisible(false);
				this.jInternalFrameDetalleFormFormularioRenta107.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoFormularioRenta107!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormularioRenta107);
					this.jInternalFrameReporteDinamicoFormularioRenta107.setVisible(false);
					this.jInternalFrameReporteDinamicoFormularioRenta107.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionFormularioRenta107!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionFormularioRenta107);
					this.jInternalFrameImportacionFormularioRenta107.setVisible(false);
					this.jInternalFrameImportacionFormularioRenta107.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByFormularioRenta107!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByFormularioRenta107);
					this.jInternalFrameOrderByFormularioRenta107.setVisible(false);
					this.jInternalFrameOrderByFormularioRenta107.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idFormularioRenta107Actual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=FormularioRenta107ConstantesFunciones.INUMEROPAGINACION;
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
			
			this.formulariorenta107ReturnGeneral=new FormularioRenta107ParameterReturnGeneral();
			
			this.formulariorenta107ParameterGeneral=new FormularioRenta107ParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.formulariorenta107Logic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
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
			
			if(FormularioRenta107JInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
				arrPaginas.add(DetalleFormularioRenta107ConstantesFunciones.SNOMBREOPCION);
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormularioRenta107ConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formulariorenta107SessionBean.getEsGuardarRelacionado(),this.formulariorenta107SessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,FormularioRenta107ConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.formulariorenta107SessionBean.getEsGuardarRelacionado(),this.formulariorenta107SessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoFormularioRenta107=false;
			this.isVisibilidadCeldaDuplicarFormularioRenta107=true;
			this.isVisibilidadCeldaCopiarFormularioRenta107=true;
			this.isVisibilidadCeldaVerFormFormularioRenta107=true;
			this.isVisibilidadCeldaOrdenFormularioRenta107=true;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=false;
			this.isVisibilidadCeldaModificarFormularioRenta107=false;
			this.isVisibilidadCeldaActualizarFormularioRenta107=false;
			this.isVisibilidadCeldaEliminarFormularioRenta107=false;
			this.isVisibilidadCeldaCancelarFormularioRenta107=false;
			this.isVisibilidadCeldaGuardarFormularioRenta107=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=false;
			
			
			this.isVisibilidadFK_IdEjercicio=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesFormularioRenta107("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosFormularioRenta107();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioFormularioRenta107(false);
			
			this.setPermisosUsuarioFormularioRenta107();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado() 
				|| (this.formulariorenta107SessionBean.getEsGuardarRelacionado() && this.formulariorenta107SessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioFormularioRenta107ClasesRelacionadas();
			}
			
			if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioFormularioRenta107ClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosFormularioRenta107();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualFormularioRenta107();
			}
			
			if(!this.isPermisoBusquedaFormularioRenta107) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasFormularioRenta107.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				this.tiposReportes.add(new Reporte("RELACIONES","RELACIONES"));
				this.tiposReportesDinamico.add(new Reporte("RELACIONES","RELACIONES"));
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioFormularioRenta107,this.isPermisoPaginacionMedioFormularioRenta107,this.isPermisoPaginacionTodoFormularioRenta107);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(FormularioRenta107ConstantesFunciones.getTiposSeleccionarFormularioRenta107());
				
				this.tiposColumnasSelect=FormularioRenta107ConstantesFunciones.getTiposSeleccionarFormularioRenta107(true);
				
				this.tiposRelacionesSelect=new ArrayList<Reporte>();								
				
				this.cargarTiposRelacionesSelectFormularioRenta107();				
				//this.tiposRelacionesSelect=FormularioRenta107ConstantesFunciones.getTiposRelacionesFormularioRenta107(true);
				
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
			//if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioFormularioRenta107();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioFormularioRenta107(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioFormularioRenta107(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesFormularioRenta107() ;
			
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
			
			
			this.detalleformulariorenta107Logic=new DetalleFormularioRenta107Logic(); 
			jasperPrint = null;												
			
			//FK
			
			this.empresaLogic=new EmpresaLogic();
			this.empleadoLogic=new EmpleadoLogic();
			this.ejercicioLogic=new EjercicioLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				formulariorenta107Implementable= (FormularioRenta107Implementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormularioRenta107ConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				formulariorenta107ImplementableHome= (FormularioRenta107ImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+FormularioRenta107ConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.formulariorenta107s= new ArrayList<FormularioRenta107>();
			this.formulariorenta107sEliminados= new ArrayList<FormularioRenta107>();
						
			this.isEsNuevoFormularioRenta107=false;
			this.esParaAccionDesdeFormularioFormularioRenta107=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.ejerciciosForeignKey=new ArrayList<Ejercicio>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyFormularioRenta107(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroFormularioRenta107();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			FormularioRenta107BeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=FormularioRenta107ConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesFormularioRenta107("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingFormularioRenta107(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioFormularioRenta107();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioFormularioRenta107();
			}
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasFormularioRenta107.getTabCount(); i++) {
					this.jTabbedPaneBusquedasFormularioRenta107.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasFormularioRenta107.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessFormularioRenta107(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga FormularioRenta107: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectFormularioRenta107() {
		Reporte reporte=new Reporte();
		
	

		reporte=new Reporte();
		reporte.setsCodigo(DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		reporte.setsDescripcion(DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
		this.tiposRelacionesSelect.add(reporte);
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesFormularioRenta107")) {
				iIndex=this.jInternalFrameDetalleFormFormularioRenta107.jTabbedPaneRelacionesFormularioRenta107.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormFormularioRenta107.jTabbedPaneRelacionesFormularioRenta107.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();	
				
				

				if(sTitle.equals("Detalle Formulario Renta107es")) {
					if(!DetalleFormularioRenta107JInternalFrame.ESTA_CARGADO_PORPARTE) {
						procesaCargarParteTab=true;
						this.startProcessFormularioRenta107();

						this.cargarParteTabPanelRelacionadaDetalleFormularioRenta107(iIndex,intSelectedRow);
					}
					
				}
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessFormularioRenta107();	
			}
		}
    }
	
	

	public void cargarParteTabPanelRelacionadaDetalleFormularioRenta107(int iIndex,int intSelectedRow) throws Exception {
		this.jInternalFrameDetalleFormFormularioRenta107.cargarSessionConBeanSwingJInternalFrameDetalleFormularioRenta107(false,true,iIndex);
		this.jButtonDetalleFormularioRenta107ActionPerformed(null,intSelectedRow,false,true,null);
		this.redimensionarTablaPanelRelacionadaDetalleFormularioRenta107();

		//this.jTabbedPaneRelacionesFormularioRenta107.updateUI();
		//this.jTabbedPaneRelacionesFormularioRenta107.removeTabAt(iIndex);
		//this.jTabbedPaneRelacionesFormularioRenta107.setSelectedIndex(iIndex);


	}
	
	public void jButtonRelacionActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
				 if(sTipo.equals("DetalleFormularioRenta107")) {
				int row=this.jTableDatosFormularioRenta107.getSelectedRow();
				jButtonDetalleFormularioRenta107ActionPerformed(evt,row,true,false,null);
				}
  		} catch(Exception e) {
  			e.printStackTrace();
  		}
    }
	
	public void cargarMenuRelaciones() {	
		JMenuItem jmenuItem= new JMenuItem("General");
		String sLabelMenu="";
		
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			for(Reporte reporte:this.tiposRelaciones) {
			

				if(reporte.getsCodigo().equals("Detalle Formulario Renta107")) {

					if(this.isTienePermisosDetalleFormularioRenta107 && this.formulariorenta107ConstantesFunciones.mostrarDetalleFormularioRenta107FormularioRenta107 && !FormularioRenta107ConstantesFunciones.ISGUARDARREL) {
						if(Constantes.ISDEVELOPING) {
							sLabelMenu="Detalle Formulario Renta107es"+"("+DetalleFormularioRenta107ConstantesFunciones.CLASSNAME+")";
						}

						jmenuItem = new JMenuItem(sLabelMenu);
						//jmenuItem.setMnemonic(KeyEvent.VK_S);
						//jmenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
						jmenuItem.setActionCommand("Detalle Formulario Renta107es");

						if(formulariorenta107ConstantesFunciones.resaltarDetalleFormularioRenta107FormularioRenta107!=null) {
							jmenuItem.setBorderPainted(true);
							jmenuItem.setBorder(formulariorenta107ConstantesFunciones.resaltarDetalleFormularioRenta107FormularioRenta107);
						}

						jmenuItem.setEnabled(this.formulariorenta107ConstantesFunciones.activarDetalleFormularioRenta107FormularioRenta107);

						jmenuItem.addActionListener (new MenuItemRelacionActionListener(this,"DetalleFormularioRenta107"));

						

						this.jInternalFrameDetalleFormFormularioRenta107.jmenuDetalleFormularioRenta107.add(jmenuItem);

						
					}

					continue;
				}
			}
		}
	}		
	
	public void cargarCombosForeignKeyFormularioRenta107(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyFormularioRenta107(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyFormularioRenta107(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyFormularioRenta107Listas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyFormularioRenta107();
		
		this.cargarCombosFrameForeignKeyFormularioRenta107();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyFormularioRenta107();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyFormularioRenta107();
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
	
	public void jButtonNuevoFormularioRenta107ActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
			
			if(jTableDatosFormularioRenta107.getRowCount()>=1) {
				jTableDatosFormularioRenta107.removeRowSelectionInterval(0, jTableDatosFormularioRenta107.getRowCount()-1);						
			}
			
			this.isEsNuevoFormularioRenta107=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoFormularioRenta107(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesFormularioRenta107(true);			
			//this.formulariorenta107=new FormularioRenta107();
			//this.formulariorenta107.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormularioRenta107(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioRenta107() ;
			
			if(FormularioRenta107JInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormularioRenta107(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.formulariorenta107);	
			this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);				
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
			if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar FormularioRenta107: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarFormularioRenta107ActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosFormularioRenta107.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosFormularioRenta107.getSelectedRows().length;			
			}
			
			formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoFormularioRenta107--;			
				//FormularioRenta107 formulariorenta107Aux= new FormularioRenta107();			
				//formulariorenta107Aux.setId(this.iIdNuevoFormularioRenta107);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//FormularioRenta107 formulariorenta107Origen=new FormularioRenta107();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(FormularioRenta107 formulariorenta107Origen : formulariorenta107sSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							formulariorenta107Origen =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							formulariorenta107Origen =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaFormularioRenta107();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.formulariorenta107.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosFormularioRenta107(formulariorenta107Origen,this.formulariorenta107,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formulariorenta107Logic.getFormularioRenta107s().add(this.formulariorenta107Aux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formulariorenta107s.add(this.formulariorenta107Aux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaFormularioRenta107(false);
				
				this.jTableDatosFormularioRenta107.setRowSelectionInterval(this.getIndiceNuevoFormularioRenta107(), this.getIndiceNuevoFormularioRenta107());
				
				int iLastRow =  this.jTableDatosFormularioRenta107.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormularioRenta107.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormularioRenta107.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormularioRenta107(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();									
		
			FormularioRenta107 formulariorenta107Origen=new FormularioRenta107();
			FormularioRenta107 formulariorenta107Destino=new FormularioRenta107();
				
			formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosFormularioRenta107.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || formulariorenta107sSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosFormularioRenta107.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107Origen =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formulariorenta107Origen =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						formulariorenta107Destino =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						formulariorenta107Destino =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				formulariorenta107Origen =formulariorenta107sSeleccionados.get(0);
				formulariorenta107Destino =formulariorenta107sSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosFormularioRenta107(formulariorenta107Origen,formulariorenta107Destino,true,false);
				
				formulariorenta107Destino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(formulariorenta107Destino,formulariorenta107Logic.getFormularioRenta107s());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(formulariorenta107Destino,formulariorenta107s);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaFormularioRenta107(false);
				
				//this.jTableDatosFormularioRenta107.setRowSelectionInterval(this.getIndiceNuevoFormularioRenta107(), this.getIndiceNuevoFormularioRenta107());
				
				int iLastRow =  this.jTableDatosFormularioRenta107.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosFormularioRenta107.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosFormularioRenta107.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaFormularioRenta107(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormFormularioRenta107.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesFormularioRenta107.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasFormularioRenta107.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesFormularioRenta107.setVisible(!isVisible);
			this.jPanelPaginacionFormularioRenta107.setVisible(!isVisible);
			this.jPanelAccionesFormularioRenta107.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameFormularioRenta107();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoFormularioRenta107();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionFormularioRenta107();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByFormularioRenta107();
			
			this.abrirFrameOrderByFormularioRenta107();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByFormularioRenta107();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleFormularioRenta107(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormularioRenta107);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormFormularioRenta107.isMaximum()) {
					this.jInternalFrameDetalleFormFormularioRenta107.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormFormularioRenta107.setSize(this.jInternalFrameDetalleFormFormularioRenta107.iWidthFormulario,this.jInternalFrameDetalleFormFormularioRenta107.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormFormularioRenta107.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormFormularioRenta107.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormFormularioRenta107.isMaximum()) {
						this.jInternalFrameDetalleFormFormularioRenta107.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormFormularioRenta107.jContentPaneDetalleFormularioRenta107.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormFormularioRenta107.jTabbedPaneRelacionesFormularioRenta107.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormFormularioRenta107.jContentPaneDetalleFormularioRenta107.getWidth(),FormularioRenta107ConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormularioRenta107.jTabbedPaneRelacionesFormularioRenta107.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormFormularioRenta107.jContentPaneDetalleFormularioRenta107.getWidth(),FormularioRenta107ConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormFormularioRenta107.jTabbedPaneRelacionesFormularioRenta107.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormFormularioRenta107.jContentPaneDetalleFormularioRenta107.getWidth(),FormularioRenta107ConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					

					if(DetalleFormularioRenta107JInternalFrame.ESTA_CARGADO_PORPARTE) {
						this.redimensionarTablaPanelRelacionadaDetalleFormularioRenta107();
					}
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormFormularioRenta107.setVisible(true);
	        this.jInternalFrameDetalleFormFormularioRenta107.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByFormularioRenta107() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByFormularioRenta107==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByFormularioRenta107=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioRenta107,false,this);
				} else {
					this.jInternalFrameOrderByFormularioRenta107=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByFormularioRenta107,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByFormularioRenta107);
				this.jInternalFrameOrderByFormularioRenta107.setVisible(false);
				this.jInternalFrameOrderByFormularioRenta107.setSelected(false);
				
				this.jInternalFrameOrderByFormularioRenta107.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormularioRenta107"));
				
				this.inicializarActualizarBindingTablaOrderByFormularioRenta107();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionFormularioRenta107() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionFormularioRenta107==null) {
				
				this.jInternalFrameImportacionFormularioRenta107=new ImportacionJInternalFrame(FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionFormularioRenta107);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionFormularioRenta107);
				this.jInternalFrameImportacionFormularioRenta107.setVisible(false);
				this.jInternalFrameImportacionFormularioRenta107.setSelected(false);


				this.jInternalFrameImportacionFormularioRenta107.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormularioRenta107"));
				this.jInternalFrameImportacionFormularioRenta107.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormularioRenta107"));
				this.jInternalFrameImportacionFormularioRenta107.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormularioRenta107"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoFormularioRenta107() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoFormularioRenta107==null) {
				this.jInternalFrameReporteDinamicoFormularioRenta107=new ReporteDinamicoJInternalFrame(FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoFormularioRenta107);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoFormularioRenta107);
				this.jInternalFrameReporteDinamicoFormularioRenta107.setVisible(false);
				this.jInternalFrameReporteDinamicoFormularioRenta107.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoFormularioRenta107.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormularioRenta107"));
				this.jInternalFrameReporteDinamicoFormularioRenta107.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormularioRenta107"));
				this.jInternalFrameReporteDinamicoFormularioRenta107.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormularioRenta107"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormularioRenta107();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		

	public void redimensionarTablaPanelRelacionadaDetalleFormularioRenta107() {
		Dimension dimension=new Dimension();

		dimension=this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.jScrollPanelDatosDetalleFormularioRenta107.getPreferredSize();
		dimension.setSize(this.jInternalFrameDetalleFormFormularioRenta107.jContentPaneDetalleFormularioRenta107.getWidth(),dimension.getHeight());

		this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.jScrollPanelDatosDetalleFormularioRenta107.setMinimumSize(dimension);
		this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.jScrollPanelDatosDetalleFormularioRenta107.setMaximumSize(dimension);
		this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.jScrollPanelDatosDetalleFormularioRenta107.setPreferredSize(dimension);


	}
					
	public void cerrarFrameDetalleFormularioRenta107() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormFormularioRenta107);
			
	       	this.jInternalFrameDetalleFormFormularioRenta107.setVisible(false);
	        this.jInternalFrameDetalleFormFormularioRenta107.setSelected(false);
			
			//this.jInternalFrameDetalleFormFormularioRenta107.dispose();
			//this.jInternalFrameDetalleFormFormularioRenta107=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoFormularioRenta107() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoFormularioRenta107.setVisible(true);
	        this.jInternalFrameReporteDinamicoFormularioRenta107.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionFormularioRenta107() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionFormularioRenta107.setVisible(true);
	        this.jInternalFrameImportacionFormularioRenta107.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByFormularioRenta107() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByFormularioRenta107.setVisible(true);
	        this.jInternalFrameOrderByFormularioRenta107.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByFormularioRenta107() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByFormularioRenta107.setVisible(false);
	        this.jInternalFrameOrderByFormularioRenta107.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoFormularioRenta107() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoFormularioRenta107.setVisible(false);
	        this.jInternalFrameReporteDinamicoFormularioRenta107.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionFormularioRenta107() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionFormularioRenta107.setVisible(false);
	        this.jInternalFrameImportacionFormularioRenta107.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarFormularioRenta107(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarFormularioRenta107(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesFormularioRenta107(true);
			//this.isEsNuevoFormularioRenta107=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesFormularioRenta107("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormularioRenta107(false) ;
			
			if(formulariorenta107SessionBean.getConGuardarRelaciones()) {
			

				if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null && this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107SessionBean.getEsGuardarRelacionado() && DetalleFormularioRenta107JInternalFrame.ESTA_CARGADO_PORPARTE) {
					this.jButtonDetalleFormularioRenta107ActionPerformed(null,intSelectedRow,false,true,null);
				}
			}
			
			if(FormularioRenta107JInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormularioRenta107(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioRenta107(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaFormularioRenta107Actual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarFormularioRenta107(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesFormularioRenta107(true);
			//this.isEsNuevoFormularioRenta107=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.formulariorenta107.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesFormularioRenta107("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesFormularioRenta107(false) ;
			
			if(FormularioRenta107JInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleFormularioRenta107(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioRenta107(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosFormularioRenta107.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosFormularioRenta107.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
		
	
	
	public void jButtonActualizarFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesFormularioRenta107(false);
			
			//if(!this.isEsNuevoFormularioRenta107) {								
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
				
			}
			
			if(this.permiteMantenimiento(this.formulariorenta107)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoFormularioRenta107=true;
					this.inicializarActualizarBindingTablaFormularioRenta107(false);
					this.isEsNuevoFormularioRenta107=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoFormularioRenta107=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoFormularioRenta107=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormularioRenta107(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormularioRenta107(false);
				
				this.habilitarDeshabilitarControlesFormularioRenta107(false);
			
												
				
				if(FormularioRenta107JInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleFormularioRenta107();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoFormularioRenta107ActionPerformed(evt,formulariorenta107SessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualFormularioRenta107(this.formulariorenta107,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosFormularioRenta107.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,formulariorenta107SessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.formulariorenta107.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				this.formulariorenta107.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				this.formulariorenta107.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.formulariorenta107)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((FormularioRenta107Model) this.jTableDatosFormularioRenta107.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoFormularioRenta107=true;
				this.inicializarActualizarBindingTablaFormularioRenta107(false);
				this.isEsNuevoFormularioRenta107=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesFormularioRenta107(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormularioRenta107(false);
				
				this.habilitarDeshabilitarControlesFormularioRenta107(false);
				
				
				
				if(FormularioRenta107JInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleFormularioRenta107();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosFormularioRenta107.getRowCount()>=1) {
				jTableDatosFormularioRenta107.removeRowSelectionInterval(0, jTableDatosFormularioRenta107.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesFormularioRenta107(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaFormularioRenta107(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesFormularioRenta107(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualFormularioRenta107(false) ;
			
			this.isEsNuevoFormularioRenta107=false;
			
			if(FormularioRenta107JInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleFormularioRenta107();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingFormularioRenta107(false);
				
				//SI ES MANUAL
				if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualFormularioRenta107();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoFormularioRenta107--;			
			//FormularioRenta107 formulariorenta107Aux= new FormularioRenta107();			
			//formulariorenta107Aux.setId(this.iIdNuevoFormularioRenta107);
			
			if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaFormularioRenta107();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
			
			this.formulariorenta107.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.formulariorenta107Logic.getFormularioRenta107s().add(this.formulariorenta107Aux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.formulariorenta107s.add(this.formulariorenta107Aux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaFormularioRenta107(false);
			
			this.jTableDatosFormularioRenta107.setRowSelectionInterval(this.getIndiceNuevoFormularioRenta107(), this.getIndiceNuevoFormularioRenta107());
			
			int iLastRow =  this.jTableDatosFormularioRenta107.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosFormularioRenta107.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosFormularioRenta107.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaFormularioRenta107(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingFormularioRenta107(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioRenta107(false);
			
			//SI ES MANUAL
			if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormularioRenta107();
			}
			
			//this.abrirFrameTreeFormularioRenta107();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Formulario Renta107ES ?", "MANTENIMIENTO DE Formulario Renta107", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionFormularioRenta107.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralFormularioRenta107();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.formulariorenta107ReturnGeneral=formulariorenta107Logic.procesarImportacionFormularioRenta107sWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.formulariorenta107ParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarFormularioRenta107ReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionFormularioRenta107.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionFormularioRenta107.setFileImportacion(this.jInternalFrameImportacionFormularioRenta107.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionFormularioRenta107.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionFormularioRenta107.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionFormularioRenta107.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionFormularioRenta107.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();		

		formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("FormularioRenta107BaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"FormularioRenta107BaseDesign.jrxml";
			
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
			
			this.generarReporteFormularioRenta107s("Todos",formulariorenta107sSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta107",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Ejercicio_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Ejercicio_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Ejercicio_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Ejercicio_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_meroPreImpreso_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_meroPreImpreso_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_meroPreImpreso_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_meroPreImpreso_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaEntrega_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaEntrega_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaEntrega_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaEntrega_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_chaGeneracion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_chaGeneracion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_chaGeneracion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_chaGeneracion_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoFormularioRenta107.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoria="id_ejercicio";
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoria="numero_pre_impreso";
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoria="fecha_entrega";
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION:
					sNombreCampoCategoria="fecha_generacion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO:
					sNombreCampoCategoriaValor="id_ejercicio";
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					sNombreCampoCategoriaValor="numero_pre_impreso";
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA:
					sNombreCampoCategoriaValor="fecha_entrega";
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION:
					sNombreCampoCategoriaValor="fecha_generacion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Ejercicio",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_ejercicio");
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Numero Pre Impreso",sNombreCampoCategoria,sNombreCampoCategoriaValor,"numero_pre_impreso");
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Entrega",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_entrega");
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Fecha Generacion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"fecha_generacion");
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
	
	public void jButtonGenerarExcelReporteDinamicoFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();		
		
		formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta107";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("FormularioRenta107s");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(FormularioRenta107 formulariorenta107:formulariorenta107sSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta107.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(FormularioRenta107 formulariorenta107:formulariorenta107sSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta107.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO);
					iRow++;

					for(FormularioRenta107 formulariorenta107:formulariorenta107sSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta107.getejercicio_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO);
					iRow++;

					for(FormularioRenta107 formulariorenta107:formulariorenta107sSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta107.getnumero_pre_impreso());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA);
					iRow++;

					for(FormularioRenta107 formulariorenta107:formulariorenta107sSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta107.getfecha_entrega());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION);
					iRow++;

					for(FormularioRenta107 formulariorenta107:formulariorenta107sSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(formulariorenta107.getfecha_generacion());
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
			//	this.getFilaCabeceraExportarExcelFormularioRenta107(row);				
			//	iRow++;
			//}				
			
			//for(FormularioRenta107 formulariorenta107Aux:formulariorenta107sSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelFormularioRenta107(formulariorenta107Aux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta107",JOptionPane.INFORMATION_MESSAGE);
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
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioRenta107(false);
			
			//SI ES MANUAL
			if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualFormularioRenta107();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioRenta107(false);
			
			//SI ES MANUAL
			if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormularioRenta107();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingFormularioRenta107(false);
			
			//SI ES MANUAL
			if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualFormularioRenta107();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaFormularioRenta107() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosFormularioRenta107.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosFormularioRenta107.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosFormularioRenta107.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosFormularioRenta107.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosFormularioRenta107.setMinimumSize(dimensionMinimum);
		this.jTableDatosFormularioRenta107.setMaximumSize(dimensionMaximum);
		this.jTableDatosFormularioRenta107.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingFormularioRenta107(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingFormularioRenta107(esInicializar,true);
	}
	
	public void inicializarActualizarBindingFormularioRenta107(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaFormularioRenta107(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesFormularioRenta107(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasFormularioRenta107(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormularioRenta107(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesFormularioRenta107(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualFormularioRenta107() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaFormularioRenta107();
		
		this.inicializarActualizarBindingBotonesManualFormularioRenta107(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualFormularioRenta107();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesFormularioRenta107() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualFormularioRenta107(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualFormularioRenta107(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosFormularioRenta107.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosFormularioRenta107.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteFormularioRenta107.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormFormularioRenta107.jCheckBoxPostAccionNuevoFormularioRenta107.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormFormularioRenta107.jCheckBoxPostAccionSinCerrarFormularioRenta107.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormFormularioRenta107.jCheckBoxPostAccionSinMensajeFormularioRenta107.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosFormularioRenta107.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosFormularioRenta107.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteFormularioRenta107.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
				this.jInternalFrameDetalleFormFormularioRenta107.jCheckBoxPostAccionNuevoFormularioRenta107.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormFormularioRenta107.jCheckBoxPostAccionSinCerrarFormularioRenta107.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormFormularioRenta107.jCheckBoxPostAccionSinMensajeFormularioRenta107.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionFormularioRenta107.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionFormularioRenta107.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesFormularioRenta107.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoFormularioRenta107!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesFormularioRenta107.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesFormularioRenta107.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarFormularioRenta107.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesFormularioRenta107.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoFormularioRenta107!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesFormularioRenta107.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralFormularioRenta107.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesFormularioRenta107(Boolean esInicializar) throws Exception {
		try	{	
			if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualFormularioRenta107(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesFormularioRenta107() throws Exception {
		try	{
			if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormularioRenta107();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormularioRenta107() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormularioRenta107() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesFormularioRenta107.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesFormularioRenta107.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesFormularioRenta107.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesFormularioRenta107.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesFormularioRenta107.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesFormularioRenta107.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionFormularioRenta107.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionFormularioRenta107.addItem(reporte);
			}
			
			
			if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionFormularioRenta107.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionFormularioRenta107.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesFormularioRenta107.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesFormularioRenta107.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesFormularioRenta107.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesFormularioRenta107.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarFormularioRenta107.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarFormularioRenta107.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarFormularioRenta107.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormularioRenta107();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualFormularioRenta107() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormularioRenta107!=null) {
				this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoFormularioRenta107!=null) {
				this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoFormularioRenta107.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoFormularioRenta107!=null) {
				
				if(this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormularioRenta107.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoFormularioRenta107.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoFormularioRenta107.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoFormularioRenta107.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualFormularioRenta107()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoFormularioRenta107.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasFormularioRenta107(Boolean esInicializar) throws Exception {				
		if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualFormularioRenta107();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaFormularioRenta107() throws Exception {
		this.inicializarActualizarBindingTablaFormularioRenta107(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByFormularioRenta107() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosFormularioRenta107OrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107OrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaFormularioRenta107(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=formulariorenta107Logic.getFormularioRenta107s().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=formulariorenta107s.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosFormularioRenta107.setModel(new FormularioRenta107Model(this.formulariorenta107Logic.getFormularioRenta107s(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosFormularioRenta107.setModel(new FormularioRenta107Model(this.formulariorenta107s,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByFormularioRenta107!=null && this.jInternalFrameOrderByFormularioRenta107.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByFormularioRenta107();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosFormularioRenta107.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO,formulariorenta107ConstantesFunciones.resaltarSeleccionarFormularioRenta107,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+FormularioRenta107ConstantesFunciones.SCLASSWEBTITULO,formulariorenta107ConstantesFunciones.resaltarSeleccionarFormularioRenta107,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosFormularioRenta107.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,FormularioRenta107ConstantesFunciones.LABEL_ID));

		if(this.formulariorenta107ConstantesFunciones.mostraridFormularioRenta107 && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRenta107ConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.formulariorenta107ConstantesFunciones.resaltaridFormularioRenta107,this.formulariorenta107ConstantesFunciones.activaridFormularioRenta107,this,true,"idFormularioRenta107","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulariorenta107ConstantesFunciones.resaltaridFormularioRenta107,this.formulariorenta107ConstantesFunciones.activaridFormularioRenta107,this,true,"idFormularioRenta107","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta107.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA));

		if(this.formulariorenta107ConstantesFunciones.mostrarid_empresaFormularioRenta107 && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.formulariorenta107ConstantesFunciones.resaltarid_empresaFormularioRenta107,this,this.formulariorenta107ConstantesFunciones.activarid_empresaFormularioRenta107));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.formulariorenta107ConstantesFunciones.resaltarid_empresaFormularioRenta107,this,this.formulariorenta107ConstantesFunciones.activarid_empresaFormularioRenta107,false,"id_empresaFormularioRenta107","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta107.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.formulariorenta107ConstantesFunciones.mostrarid_empleadoFormularioRenta107 && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.formulariorenta107ConstantesFunciones.resaltarid_empleadoFormularioRenta107,this,this.formulariorenta107ConstantesFunciones.activarid_empleadoFormularioRenta107));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.formulariorenta107ConstantesFunciones.resaltarid_empleadoFormularioRenta107,this,this.formulariorenta107ConstantesFunciones.activarid_empleadoFormularioRenta107,true,"id_empleadoFormularioRenta107","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta107.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO));

		if(this.formulariorenta107ConstantesFunciones.mostrarid_ejercicioFormularioRenta107 && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EjercicioTableCell(this.ejerciciosForeignKey,this.formulariorenta107ConstantesFunciones.resaltarid_ejercicioFormularioRenta107,this,this.formulariorenta107ConstantesFunciones.activarid_ejercicioFormularioRenta107));
			tableColumn.setCellEditor(new EjercicioTableCell(this.ejerciciosForeignKey,this.formulariorenta107ConstantesFunciones.resaltarid_ejercicioFormularioRenta107,this,this.formulariorenta107ConstantesFunciones.activarid_ejercicioFormularioRenta107,false,"id_ejercicioFormularioRenta107","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta107.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO));

		if(this.formulariorenta107ConstantesFunciones.mostrarnumero_pre_impresoFormularioRenta107 && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.formulariorenta107ConstantesFunciones.resaltarnumero_pre_impresoFormularioRenta107,this.formulariorenta107ConstantesFunciones.activarnumero_pre_impresoFormularioRenta107,this,true,"numero_pre_impresoFormularioRenta107","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.formulariorenta107ConstantesFunciones.resaltarnumero_pre_impresoFormularioRenta107,this.formulariorenta107ConstantesFunciones.activarnumero_pre_impresoFormularioRenta107,this,true,"numero_pre_impresoFormularioRenta107","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta107.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA));

		if(this.formulariorenta107ConstantesFunciones.mostrarfecha_entregaFormularioRenta107 && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.formulariorenta107ConstantesFunciones.resaltarfecha_entregaFormularioRenta107,this.formulariorenta107ConstantesFunciones.activarfecha_entregaFormularioRenta107,this,true,"fecha_entregaFormularioRenta107","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.formulariorenta107ConstantesFunciones.resaltarfecha_entregaFormularioRenta107,this.formulariorenta107ConstantesFunciones.activarfecha_entregaFormularioRenta107,this,true,"fecha_entregaFormularioRenta107","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosFormularioRenta107.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION));

		if(this.formulariorenta107ConstantesFunciones.mostrarfecha_generacionFormularioRenta107 && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new DateRenderer(this.formulariorenta107ConstantesFunciones.resaltarfecha_generacionFormularioRenta107,this.formulariorenta107ConstantesFunciones.activarfecha_generacionFormularioRenta107,this,true,"fecha_generacionFormularioRenta107","BASICO"));
			tableColumn.setCellEditor(new DateEditorRenderer(this.formulariorenta107ConstantesFunciones.resaltarfecha_generacionFormularioRenta107,this.formulariorenta107ConstantesFunciones.activarfecha_generacionFormularioRenta107,this,true,"fecha_generacionFormularioRenta107","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,30);
			//tableColumn.addPropertyChangeListener(new FormularioRenta107PropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()
			&& !this.esParaBusquedaForeignKey) {
			

			if(this.isTienePermisosDetalleFormularioRenta107 && this.formulariorenta107ConstantesFunciones.mostrarDetalleFormularioRenta107FormularioRenta107 && !FormularioRenta107ConstantesFunciones.ISGUARDARREL) {
				tableColumn= new TableColumn();
				tableColumn.setIdentifier("Detalle Formulario Renta107es");
				tableColumn.setHeaderValue("Detalle Formulario Renta107es");
				tableColumn.setCellRenderer(new DetalleFormularioRenta107TableCell(formulariorenta107ConstantesFunciones.resaltarDetalleFormularioRenta107FormularioRenta107,this,this.formulariorenta107ConstantesFunciones.activarDetalleFormularioRenta107FormularioRenta107));
				tableColumn.setCellEditor(new DetalleFormularioRenta107TableCell(formulariorenta107ConstantesFunciones.resaltarDetalleFormularioRenta107FormularioRenta107,this,this.formulariorenta107ConstantesFunciones.activarDetalleFormularioRenta107FormularioRenta107));

				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_CONTROL + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);

				this.jTableDatosFormularioRenta107.addColumn(tableColumn);
			}
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formulariorenta107SessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formulariorenta107SessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormularioRenta107.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.formulariorenta107SessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.formulariorenta107SessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosFormularioRenta107.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.formulariorenta107SessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.formulariorenta107SessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosFormularioRenta107.addColumn(tableColumn);
				}
			}			
						
			if(this.conMaximoRelaciones && this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
				if(this.conFuncionalidadRelaciones) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier("Editar Rel");
					tableColumn.setHeaderValue("Editar Rel");
					tableColumn.setCellRenderer(new IdTableCell(this,true,false));
					tableColumn.setCellEditor(new IdTableCell(this,true,false));
		
					tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
					tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
					
					this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
					this.jTableDatosFormularioRenta107.addColumn(tableColumn);
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
			
			this.jTableDatosFormularioRenta107.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.formulariorenta107SessionBean.getConGuardarRelaciones()) {			
				//PERMITE EDITAR RELACIONES
				iUltimaColumna++;//2
			}
		}
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosFormularioRenta107.moveColumn(this.jTableDatosFormularioRenta107.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosFormularioRenta107.moveColumn(this.jTableDatosFormularioRenta107.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		if(this.conFuncionalidadRelaciones) {
			if(this.conMaximoRelaciones && this.formulariorenta107SessionBean.getConGuardarRelaciones()) {	
				if(iUltimaColumna>1) {
					iUltimaColumna--;
				}
				
				//iNuevaPosicionColumna++;
				
				//REUBICA EDITAR RELACIONES
				jTableDatosFormularioRenta107.moveColumn(this.jTableDatosFormularioRenta107.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1
			}
		}
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosFormularioRenta107.moveColumn(this.jTableDatosFormularioRenta107.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosFormularioRenta107.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosFormularioRenta107.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosFormularioRenta107,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosFormularioRenta107.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosFormularioRenta107.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosFormularioRenta107.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosFormularioRenta107.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosFormularioRenta107.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=formulariorenta107Logic.getFormularioRenta107s().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=formulariorenta107s.size()-1;
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
		//this.jTableDatosFormularioRenta107.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosFormularioRenta107.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosFormularioRenta107();
			
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
				
				//this.isEsNuevoFormularioRenta107=false;
					
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
				if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormFormularioRenta107==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormularioRenta107.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormularioRenta107.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.formulariorenta107.getsType().equals("DUPLICADO")
				   || this.formulariorenta107.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoFormularioRenta107=true;
				
				} else {
					this.isEsNuevoFormularioRenta107=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
					if(this.formulariorenta107.getId()>=0 && !this.formulariorenta107.getIsNew()) {						
						this.isEsNuevoFormularioRenta107=false;
						
					} else {
						this.isEsNuevoFormularioRenta107=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoFormularioRenta107(esRelaciones);						
				
				this.seleccionarFormularioRenta107(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.formulariorenta107.getId()<0) {
					this.isEsNuevoFormularioRenta107=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarFormularioRenta107(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarFormularioRenta107(evt,rowIndex);
				}	
				
				if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion FormularioRenta107: " + this.dDif); 
					}
				}								
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarFormularioRenta107(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.formulariorenta107)) {
					if(this.formulariorenta107.getId()>0) {
						this.formulariorenta107.setIsDeleted(true);
						
						this.formulariorenta107sEliminados.add(this.formulariorenta107);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.formulariorenta107Logic.getFormularioRenta107s().remove(this.formulariorenta107);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.formulariorenta107s.remove(this.formulariorenta107);				
					}
					
					
					((FormularioRenta107Model) this.jTableDatosFormularioRenta107.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaFormularioRenta107(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarFormularioRenta107(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoFormularioRenta107) {
			
			if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosFormularioRenta107.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosFormularioRenta107.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioFormularioRenta107(this.formulariorenta107);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.formulariorenta107ConstantesFunciones.cargarid_empresaFormularioRenta107 || this.formulariorenta107ConstantesFunciones.event_dependid_empresaFormularioRenta107) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.formulariorenta107.getid_empresa());
									//this.inicializarActualizarBindingFormularioRenta107(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(formulariorenta107.getEmpresa()!=null) {
							this.empresasForeignKey.add(formulariorenta107.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.formulariorenta107.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.formulariorenta107ConstantesFunciones.cargarid_empleadoFormularioRenta107 || this.formulariorenta107ConstantesFunciones.event_dependid_empleadoFormularioRenta107) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.formulariorenta107.getid_empleado());
									//this.inicializarActualizarBindingFormularioRenta107(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(formulariorenta107.getEmpleado()!=null) {
							this.empleadosForeignKey.add(formulariorenta107.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.formulariorenta107.getid_empleado(),false,"Formulario");

					//Ejercicio
					if(!this.formulariorenta107ConstantesFunciones.cargarid_ejercicioFormularioRenta107 || this.formulariorenta107ConstantesFunciones.event_dependid_ejercicioFormularioRenta107) {
						//this.cargarCombosEjerciciosForeignKeyLista(" where id="+this.formulariorenta107.getid_ejercicio());
									//this.inicializarActualizarBindingFormularioRenta107(false,false);
						this.ejerciciosForeignKey=new ArrayList<Ejercicio>();

						if(formulariorenta107.getEjercicio()!=null) {
							this.ejerciciosForeignKey.add(formulariorenta107.getEjercicio());
						}

						this.addItemDefectoCombosForeignKeyEjercicio();
						this.cargarCombosFrameEjerciciosForeignKey("Todos");
					}
					this.setActualEjercicioForeignKey(this.formulariorenta107.getid_ejercicio(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesFormularioRenta107("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesFormularioRenta107(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualFormularioRenta107() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormularioRenta107(FormularioRenta107 formulariorenta107) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoFormularioRenta107(formulariorenta107,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoFormularioRenta107(FormularioRenta107 formulariorenta107,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioFormularioRenta107(formulariorenta107);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyFormularioRenta107(formulariorenta107,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyFormularioRenta107(formulariorenta107);
	}
	
	public void setVariablesObjetoActualToFormularioFormularioRenta107(FormularioRenta107 formulariorenta107) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.setText(formulariorenta107.getId().toString());
			this.jInternalFrameDetalleFormFormularioRenta107.jTextFieldnumero_pre_impresoFormularioRenta107.setText(formulariorenta107.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_entregaFormularioRenta107.setDate(formulariorenta107.getfecha_entrega());
			this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_generacionFormularioRenta107.setDate(formulariorenta107.getfecha_generacion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,FormularioRenta107 formulariorenta107Local) throws Exception {
		this.actualizarInformacion(sTipo,false,formulariorenta107Local);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,FormularioRenta107 formulariorenta107Local) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				formulariorenta107Local=this.formulariorenta107;
			} else {
				formulariorenta107Local=this.formulariorenta107Anterior;
			}
		}
		
		if(this.permiteMantenimiento(formulariorenta107Local)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoFormularioRenta107(formulariorenta107Local,true);
					
					if(formulariorenta107SessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(formulariorenta107Local);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(formulariorenta107Local);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoFormularioRenta107(FormularioRenta107 formulariorenta107,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormularioRenta107(formulariorenta107,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(formulariorenta107);
	}
	
	public void setVariablesFormularioToObjetoActualFormularioRenta107(FormularioRenta107 formulariorenta107,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualFormularioRenta107(formulariorenta107,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualFormularioRenta107(FormularioRenta107 formulariorenta107,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.getText()==null || this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.getText()=="" || this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.getText()=="Id") {
				this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.setText("0");
			}

			if(conColumnasBase) {formulariorenta107.setId(Long.parseLong(this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormularioRenta107ConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta107.jLabelIdFormularioRenta107,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formulariorenta107.setnumero_pre_impreso(this.jInternalFrameDetalleFormFormularioRenta107.jTextFieldnumero_pre_impresoFormularioRenta107.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta107.jLabelnumero_pre_impresoFormularioRenta107,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formulariorenta107.setfecha_entrega(this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_entregaFormularioRenta107.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta107.jLabelfecha_entregaFormularioRenta107,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			formulariorenta107.setfecha_generacion(this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_generacionFormularioRenta107.getDate());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormFormularioRenta107.jLabelfecha_generacionFormularioRenta107,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualFormularioRenta107(FormularioRenta107 formulariorenta107Bean,FormularioRenta107 formulariorenta107,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && formulariorenta107Bean.getid_empleado()!=null && !formulariorenta107Bean.getid_empleado().equals(-1L))) {formulariorenta107.setid_empleado(formulariorenta107Bean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosFormularioRenta107(FormularioRenta107 formulariorenta107Origen,FormularioRenta107 formulariorenta107,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formulariorenta107Origen.getId()!=null && !formulariorenta107Origen.getId().equals(0L))) {formulariorenta107.setId(formulariorenta107Origen.getId());}}
			if(conDefault || (!conDefault && formulariorenta107Origen.getid_empleado()!=null && !formulariorenta107Origen.getid_empleado().equals(-1L))) {formulariorenta107.setid_empleado(formulariorenta107Origen.getid_empleado());}
			if(conDefault || (!conDefault && formulariorenta107Origen.getnumero_pre_impreso()!=null && !formulariorenta107Origen.getnumero_pre_impreso().equals(""))) {formulariorenta107.setnumero_pre_impreso(formulariorenta107Origen.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && formulariorenta107Origen.getfecha_entrega()!=null && !formulariorenta107Origen.getfecha_entrega().equals(new Date()))) {formulariorenta107.setfecha_entrega(formulariorenta107Origen.getfecha_entrega());}
			if(conDefault || (!conDefault && formulariorenta107Origen.getfecha_generacion()!=null && !formulariorenta107Origen.getfecha_generacion().equals(new Date()))) {formulariorenta107.setfecha_generacion(formulariorenta107Origen.getfecha_generacion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormularioRenta107(FormularioRenta107 formulariorenta107) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.setText(formulariorenta107.getId().toString());
			this.jInternalFrameDetalleFormFormularioRenta107.jTextFieldnumero_pre_impresoFormularioRenta107.setText(formulariorenta107.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_entregaFormularioRenta107.setDate(formulariorenta107.getfecha_entrega());
			this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_generacionFormularioRenta107.setDate(formulariorenta107.getfecha_generacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioFormularioRenta107(FormularioRenta107Bean formulariorenta107Bean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.setText(formulariorenta107Bean.getId().toString());
			this.jInternalFrameDetalleFormFormularioRenta107.jTextFieldnumero_pre_impresoFormularioRenta107.setText(formulariorenta107Bean.getnumero_pre_impreso());
			this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_entregaFormularioRenta107.setDate(formulariorenta107Bean.getfecha_entrega());
			this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_generacionFormularioRenta107.setDate(formulariorenta107Bean.getfecha_generacion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanFormularioRenta107(FormularioRenta107ParameterReturnGeneral formulariorenta107ReturnGeneral,FormularioRenta107Bean formulariorenta107Bean,Boolean conDefault) throws Exception { 
		try {
			FormularioRenta107 formulariorenta107Local=new FormularioRenta107();
			
			formulariorenta107Local=formulariorenta107ReturnGeneral.getFormularioRenta107();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && formulariorenta107Local.getId()!=null && !formulariorenta107Local.getId().equals(0L))) {formulariorenta107Bean.setId(formulariorenta107Local.getId());}}
			if(conDefault || (!conDefault && formulariorenta107Local.getid_empleado()!=null && !formulariorenta107Local.getid_empleado().equals(-1L))) {formulariorenta107Bean.setid_empleado(formulariorenta107Local.getid_empleado());}
			if(conDefault || (!conDefault && formulariorenta107Local.getnumero_pre_impreso()!=null && !formulariorenta107Local.getnumero_pre_impreso().equals(""))) {formulariorenta107Bean.setnumero_pre_impreso(formulariorenta107Local.getnumero_pre_impreso());}
			if(conDefault || (!conDefault && formulariorenta107Local.getfecha_entrega()!=null && !formulariorenta107Local.getfecha_entrega().equals(new Date()))) {formulariorenta107Bean.setfecha_entrega(formulariorenta107Local.getfecha_entrega());}
			if(conDefault || (!conDefault && formulariorenta107Local.getfecha_generacion()!=null && !formulariorenta107Local.getfecha_generacion().equals(new Date()))) {formulariorenta107Bean.setfecha_generacion(formulariorenta107Local.getfecha_generacion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxFormularioRenta107Generico(Long idFormularioRenta107Seleccionado,JComboBox jComboBoxFormularioRenta107,List<FormularioRenta107> formulariorenta107sLocal)throws Exception {
		try {
			FormularioRenta107  formulariorenta107Temp=null;

			for(FormularioRenta107 formulariorenta107Aux:formulariorenta107sLocal) {
				if(formulariorenta107Aux.getId()!=null && formulariorenta107Aux.getId().equals(idFormularioRenta107Seleccionado)) {
					formulariorenta107Temp=formulariorenta107Aux;
					break;
				}
			}

			jComboBoxFormularioRenta107.setSelectedItem(formulariorenta107Temp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxFormularioRenta107Generico(JComboBox jComboBoxFormularioRenta107,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormularioRenta107.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxFormularioRenta107.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxFormularioRenta107.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxFormularioRenta107.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxFormularioRenta107.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxFormularioRenta107.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			
		if(sTipo.equals("DetalleFormularioRenta107")) {
			jButtonDetalleFormularioRenta107ActionPerformed(evt,rowIndex,true,false,null);
		}
		} catch (Exception e) {
			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formulariorenta107=(FormularioRenta107) formulariorenta107Logic.getFormularioRenta107s().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formulariorenta107 =(FormularioRenta107) formulariorenta107s.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!formulariorenta107.getIsNew() && !formulariorenta107.getIsChanged() && !formulariorenta107.getIsDeleted()) {
				sDescripcion=formulariorenta107.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta107.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!formulariorenta107.getIsNew() && !formulariorenta107.getIsChanged() && !formulariorenta107.getIsDeleted()) {
				sDescripcion=formulariorenta107.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta107.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Ejercicio")) {
			//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
			if(!formulariorenta107.getIsNew() && !formulariorenta107.getIsChanged() && !formulariorenta107.getIsDeleted()) {
				sDescripcion=formulariorenta107.getejercicio_descripcion();
			} else {
				//sDescripcion=this.getActualEjercicioForeignKeyDescripcion((Long)value);
				sDescripcion=formulariorenta107.getejercicio_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		FormularioRenta107 formulariorenta107Row=new FormularioRenta107();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formulariorenta107Row=(FormularioRenta107) formulariorenta107Logic.getFormularioRenta107s().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			formulariorenta107Row=(FormularioRenta107) formulariorenta107s.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	public void jButtonDetalleFormularioRenta107ActionPerformed(ActionEvent evt,int rowIndex,Boolean conInicializar,Boolean esRelacionado,FormularioRenta107 formulariorenta107) throws Exception {
			try {

				if(this.jInternalFrameDetalleFormFormularioRenta107==null) {
					this.inicializarFormDetalle();
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.getNewConnexionToDeep("");
				}

				int intSelectedRow =rowIndex;

				if(intSelectedRow!=-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta107 = (FormularioRenta107)this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE) {
						this.formulariorenta107 = (FormularioRenta107)this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				} else {
					if(formulariorenta107!=null) {
						this.formulariorenta107 = formulariorenta107;
					} else {
						this.formulariorenta107 = new FormularioRenta107();
					}
				}

				if(this.isTienePermisosDetalleFormularioRenta107 && this.permiteMantenimiento(this.formulariorenta107)) {
					DetalleFormularioRenta107BeanSwingJInternalFrame detalleformulariorenta107BeanSwingJInternalFrame=null;

					if(conInicializar) {
						this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFramePopup=new DetalleFormularioRenta107BeanSwingJInternalFrame(false,false,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.SECUNDARIO,false,false,true,false);
						this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFramePopup.setJInternalFrameParent(this);

						detalleformulariorenta107BeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFramePopup;
					} else {
						detalleformulariorenta107BeanSwingJInternalFrame=this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame;
					}

					List<FormularioRenta107> formulariorenta107s=new ArrayList<FormularioRenta107>();
					formulariorenta107s.add(this.formulariorenta107);
					if(!esRelacionado) {
						//detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107SessionBean.setConGuardarRelaciones(false);
						//detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107SessionBean.setEsGuardarRelacionado(false);
					}

					//DESHABILITA TEMPORALMENTE EVENTOS CHANGE DE TEXTOS,COMBOS,ETC
					detalleformulariorenta107BeanSwingJInternalFrame.estaModoSeleccionar=true;
					this.jInternalFrameDetalleFormFormularioRenta107.cargarDetalleFormularioRenta107BeanSwingJInternalFrame(formulariorenta107s,this.formulariorenta107,detalleformulariorenta107BeanSwingJInternalFrame,/*conInicializar,*/detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107SessionBean.getConGuardarRelaciones(),detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107SessionBean.getEsGuardarRelacionado());
					detalleformulariorenta107BeanSwingJInternalFrame.estaModoSeleccionar=false;


					if(!esRelacionado) {
						detalleformulariorenta107BeanSwingJInternalFrame.actualizarEstadoPanelsDetalleFormularioRenta107("no_relacionado");

						detalleformulariorenta107BeanSwingJInternalFrame.redimensionarTablaDatosConTamanio(DetalleFormularioRenta107ConstantesFunciones.ITAMANIOFILATABLA + (DetalleFormularioRenta107ConstantesFunciones.ITAMANIOFILATABLA/2));

						detalleformulariorenta107BeanSwingJInternalFrame.setLocation(xOffset*(openFrameCount + Constantes.INUM_MAX_VENTANAS_REL_X), yOffset*(openFrameCount+Constantes.INUM_MAX_VENTANAS_REL_Y));

						TitledBorder titledBorderFormularioRenta107=(TitledBorder)this.jScrollPanelDatosFormularioRenta107.getBorder();
						TitledBorder titledBorderDetalleFormularioRenta107=(TitledBorder)detalleformulariorenta107BeanSwingJInternalFrame.jScrollPanelDatosDetalleFormularioRenta107.getBorder();

						titledBorderDetalleFormularioRenta107.setTitle(titledBorderFormularioRenta107.getTitle() + " -> Detalle Formulario Renta107");

						if(!Constantes.CON_VARIAS_VENTANAS) {
							MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,detalleformulariorenta107BeanSwingJInternalFrame);
						}

						detalleformulariorenta107BeanSwingJInternalFrame.setVisible(true);

						this.jDesktopPane.add(detalleformulariorenta107BeanSwingJInternalFrame);

						detalleformulariorenta107BeanSwingJInternalFrame.setSelected(true);
					}

				} else {
					if(!this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
						JOptionPane.showMessageDialog(this,"NO TIENE PERMISOS PARA USAR LA FUNCIONALIDAD DE Detalle Formulario Renta107",Constantes.SERROR,JOptionPane.ERROR_MESSAGE);
					}
				}
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.commitNewConnexionToDeep();
				}

			}

			catch(Exception e) {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.rollbackNewConnexionToDeep();
				}


				FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
			} finally { 
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualFormularioRenta107(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoFormularioRenta107.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta107 && this.isPermisoNuevoFormularioRenta107));			
			this.jButtonDuplicarFormularioRenta107.setVisible((this.isVisibilidadCeldaDuplicarFormularioRenta107 && this.isPermisoDuplicarFormularioRenta107));			
			this.jButtonCopiarFormularioRenta107.setVisible((this.isVisibilidadCeldaCopiarFormularioRenta107 && this.isPermisoCopiarFormularioRenta107));
			this.jButtonVerFormFormularioRenta107.setVisible((this.isVisibilidadCeldaVerFormFormularioRenta107 && this.isPermisoVerFormFormularioRenta107));
			
			this.jButtonAbrirOrderByFormularioRenta107.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta107 && this.isPermisoOrdenFormularioRenta107));			
			
			this.jButtonNuevoRelacionesFormularioRenta107.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107 && this.isPermisoNuevoFormularioRenta107));			
			this.jButtonNuevoGuardarCambiosFormularioRenta107.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta107 && this.isPermisoNuevoFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107));
			
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonModificarFormularioRenta107.setVisible((this.isVisibilidadCeldaModificarFormularioRenta107 && this.isPermisoActualizarFormularioRenta107));	
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonActualizarFormularioRenta107.setVisible((this.isVisibilidadCeldaActualizarFormularioRenta107 && this.isPermisoActualizarFormularioRenta107));	
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonEliminarFormularioRenta107.setVisible((this.isVisibilidadCeldaEliminarFormularioRenta107 && this.isPermisoEliminarFormularioRenta107));
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonCancelarFormularioRenta107.setVisible(this.isVisibilidadCeldaCancelarFormularioRenta107);							
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosFormularioRenta107.setVisible((this.isVisibilidadCeldaGuardarFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107));			
			
			}
						
			this.jButtonGuardarCambiosTablaFormularioRenta107.setVisible((this.isVisibilidadCeldaGuardarCambiosFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta107 && this.isPermisoNuevoFormularioRenta107));						
			this.jButtonDuplicarToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaDuplicarFormularioRenta107 && this.isPermisoDuplicarFormularioRenta107));						
			this.jButtonCopiarToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaCopiarFormularioRenta107 && this.isPermisoCopiarFormularioRenta107));			
			this.jButtonVerFormToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaVerFormFormularioRenta107 && this.isPermisoVerFormFormularioRenta107));			
			this.jButtonAbrirOrderByToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta107 && this.isPermisoOrdenFormularioRenta107));
			this.jButtonNuevoRelacionesToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107 && this.isPermisoNuevoFormularioRenta107));			
			this.jButtonNuevoGuardarCambiosToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta107 && this.isPermisoNuevoFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107));			
			
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonModificarToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaModificarFormularioRenta107 && this.isPermisoActualizarFormularioRenta107));	
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonActualizarToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaActualizarFormularioRenta107  && this.isPermisoActualizarFormularioRenta107));	
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonEliminarToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaEliminarFormularioRenta107 && this.isPermisoEliminarFormularioRenta107));
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonCancelarToolBarFormularioRenta107.setVisible(this.isVisibilidadCeldaCancelarFormularioRenta107);				
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaGuardarFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarFormularioRenta107.setVisible((this.isVisibilidadCeldaGuardarCambiosFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoFormularioRenta107.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta107 && this.isPermisoNuevoFormularioRenta107));			
			this.jMenuItemDuplicarFormularioRenta107.setVisible((this.isVisibilidadCeldaDuplicarFormularioRenta107 && this.isPermisoDuplicarFormularioRenta107));			
			this.jMenuItemCopiarFormularioRenta107.setVisible((this.isVisibilidadCeldaCopiarFormularioRenta107 && this.isPermisoCopiarFormularioRenta107));			
			this.jMenuItemVerFormFormularioRenta107.setVisible((this.isVisibilidadCeldaVerFormFormularioRenta107 && this.isPermisoVerFormFormularioRenta107));			
			this.jMenuItemAbrirOrderByFormularioRenta107.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta107 && this.isPermisoOrdenFormularioRenta107));			
			//this.jMenuItemMostrarOcultarFormularioRenta107.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta107 && this.isPermisoOrdenFormularioRenta107));
			this.jMenuItemDetalleAbrirOrderByFormularioRenta107.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta107 && this.isPermisoOrdenFormularioRenta107));			
			//this.jMenuItemDetalleMostrarOcultarFormularioRenta107.setVisible((this.isVisibilidadCeldaOrdenFormularioRenta107 && this.isPermisoOrdenFormularioRenta107));			
			this.jMenuItemNuevoRelacionesFormularioRenta107.setVisible((this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107 && this.isPermisoNuevoFormularioRenta107));			
			this.jMenuItemNuevoGuardarCambiosFormularioRenta107.setVisible((this.isVisibilidadCeldaNuevoFormularioRenta107 && this.isPermisoNuevoFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107));									
			
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemModificarFormularioRenta107.setVisible((this.isVisibilidadCeldaModificarFormularioRenta107 && this.isPermisoActualizarFormularioRenta107));	
			this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemActualizarFormularioRenta107.setVisible((this.isVisibilidadCeldaActualizarFormularioRenta107 && this.isPermisoActualizarFormularioRenta107));	
			this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemEliminarFormularioRenta107.setVisible((this.isVisibilidadCeldaEliminarFormularioRenta107 && this.isPermisoEliminarFormularioRenta107));
			this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemCancelarFormularioRenta107.setVisible(this.isVisibilidadCeldaCancelarFormularioRenta107);				
			}
			
			this.jMenuItemGuardarCambiosFormularioRenta107.setVisible((this.isVisibilidadCeldaGuardarFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107));						
			this.jMenuItemGuardarCambiosTablaFormularioRenta107.setVisible((this.isVisibilidadCeldaGuardarCambiosFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoFormularioRenta107=this.jButtonNuevoFormularioRenta107.isVisible();
			this.isVisibilidadCeldaDuplicarFormularioRenta107=this.jButtonDuplicarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaCopiarFormularioRenta107=this.jButtonCopiarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaVerFormFormularioRenta107=this.jButtonVerFormFormularioRenta107.isVisible();
			
			this.isVisibilidadCeldaOrdenFormularioRenta107=this.jButtonAbrirOrderByFormularioRenta107.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=this.jButtonNuevoRelacionesFormularioRenta107.isVisible();
			this.isVisibilidadCeldaModificarFormularioRenta107=this.jButtonModificarFormularioRenta107.isVisible();
			
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			this.isVisibilidadCeldaActualizarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jButtonActualizarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaEliminarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jButtonEliminarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaCancelarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jButtonCancelarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaGuardarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosFormularioRenta107.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=this.jButtonGuardarCambiosTablaFormularioRenta107.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoFormularioRenta107=this.jButtonNuevoToolBarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=this.jButtonNuevoRelacionesToolBarFormularioRenta107.isVisible();
			
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			this.isVisibilidadCeldaModificarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jButtonModificarToolBarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaActualizarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jButtonActualizarToolBarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaEliminarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jButtonEliminarToolBarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaCancelarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jButtonCancelarToolBarFormularioRenta107.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormularioRenta107=this.jButtonGuardarCambiosToolBarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=this.jButtonGuardarCambiosTablaToolBarFormularioRenta107.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoFormularioRenta107=this.jMenuItemNuevoFormularioRenta107.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=this.jMenuItemNuevoRelacionesFormularioRenta107.isVisible();
			
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			this.isVisibilidadCeldaModificarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemModificarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaActualizarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemActualizarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaEliminarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemEliminarFormularioRenta107.isVisible();
			this.isVisibilidadCeldaCancelarFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemCancelarFormularioRenta107.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarFormularioRenta107=this.jMenuItemGuardarCambiosFormularioRenta107.isVisible();
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=this.jMenuItemGuardarCambiosTablaFormularioRenta107.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesFormularioRenta107(Boolean esInicializar) {
		if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {			
			if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
				//if(this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesFormularioRenta107();
			}
			
			this.inicializarActualizarBindingBotonesManualFormularioRenta107(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualFormularioRenta107() {
		this.jButtonNuevoFormularioRenta107.setVisible(this.isPermisoNuevoFormularioRenta107);			
		this.jButtonDuplicarFormularioRenta107.setVisible(this.isPermisoDuplicarFormularioRenta107);			
		this.jButtonCopiarFormularioRenta107.setVisible(this.isPermisoCopiarFormularioRenta107);			
		this.jButtonVerFormFormularioRenta107.setVisible(this.isPermisoVerFormFormularioRenta107);			
		
		this.jButtonAbrirOrderByFormularioRenta107.setVisible(this.isPermisoOrdenFormularioRenta107);					
		
		this.jButtonNuevoRelacionesFormularioRenta107.setVisible(this.isPermisoNuevoFormularioRenta107);			
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonModificarFormularioRenta107.setVisible(this.isPermisoActualizarFormularioRenta107);	
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonActualizarFormularioRenta107.setVisible(this.isPermisoActualizarFormularioRenta107);	
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonEliminarFormularioRenta107.setVisible(this.isPermisoEliminarFormularioRenta107);
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonCancelarFormularioRenta107.setVisible(this.isVisibilidadCeldaCancelarFormularioRenta107);						
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosFormularioRenta107.setVisible(this.isPermisoGuardarCambiosFormularioRenta107);							
		}
		
		this.jButtonGuardarCambiosTablaFormularioRenta107.setVisible(this.isPermisoActualizarFormularioRenta107);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleFormularioRenta107() {
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonModificarFormularioRenta107.setVisible(this.isPermisoActualizarFormularioRenta107);	
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonActualizarFormularioRenta107.setVisible(this.isPermisoActualizarFormularioRenta107);	
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonEliminarFormularioRenta107.setVisible(this.isPermisoEliminarFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonCancelarFormularioRenta107.setVisible(this.isVisibilidadCeldaCancelarFormularioRenta107);							
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosFormularioRenta107.setVisible((this.isVisibilidadCeldaGuardarFormularioRenta107 && this.isPermisoGuardarCambiosFormularioRenta107));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosFormularioRenta107() {
		if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualFormularioRenta107();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesFormularioRenta107() {
	}
	
	public void jTableDatosFormularioRenta107ListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarFormularioRenta107(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidFormularioRenta107BusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.getformulariorenta107(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta107==null) {
						this.formulariorenta107 = new FormularioRenta107();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
				}

				if(this.formulariorenta107.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.formulariorenta107.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta107(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaFormularioRenta107UpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebFormularioRenta107(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta107.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta107.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta107(this.getformulariorenta107(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.formulariorenta107Logic.getConnexion());

				if(this.formulariorenta107.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.formulariorenta107.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta107=(TitledBorder)this.jScrollPanelDatosFormularioRenta107.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderFormularioRenta107.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaFormularioRenta107BusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.getformulariorenta107(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta107==null) {
						this.formulariorenta107 = new FormularioRenta107();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
				}

				if(this.formulariorenta107.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.formulariorenta107.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta107(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoFormularioRenta107UpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebFormularioRenta107(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta107.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta107.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta107(this.getformulariorenta107(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.formulariorenta107Logic.getConnexion());

				if(this.formulariorenta107.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.formulariorenta107.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta107=(TitledBorder)this.jScrollPanelDatosFormularioRenta107.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderFormularioRenta107.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoFormularioRenta107BusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.getformulariorenta107(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta107==null) {
						this.formulariorenta107 = new FormularioRenta107();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
				}

				if(this.formulariorenta107.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.formulariorenta107.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta107(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_ejercicioFormularioRenta107UpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoejercicio=true;

			idTienePermisoejercicio=this.tienePermisosUsuarioEnPaginaWebFormularioRenta107(EjercicioConstantesFunciones.CLASSNAME);

			if(idTienePermisoejercicio) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosFormularioRenta107.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosFormularioRenta107.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualFormularioRenta107(this.getformulariorenta107(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);

				this.ejercicioBeanSwingJInternalFrame=new EjercicioBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.ejercicioBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.ejercicioBeanSwingJInternalFrame.getEjercicioLogic().setConnexion(this.formulariorenta107Logic.getConnexion());

				if(this.formulariorenta107.getid_ejercicio()!=null) {
					this.ejercicioBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.ejercicioBeanSwingJInternalFrame.setIdActual(this.formulariorenta107.getid_ejercicio());
					this.ejercicioBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.ejercicioBeanSwingJInternalFrame.inicializarActualizarBindingTablaEjercicio();
				}

				JInternalFrameBase jinternalFrame =this.ejercicioBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderFormularioRenta107=(TitledBorder)this.jScrollPanelDatosFormularioRenta107.getBorder();
				TitledBorder titledBorderejercicio=(TitledBorder)this.ejercicioBeanSwingJInternalFrame.jScrollPanelDatosEjercicio.getBorder();

				titledBorderejercicio.setTitle(titledBorderFormularioRenta107.getTitle() + " -> Ejercicio");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_ejercicioFormularioRenta107BusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.getformulariorenta107(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta107==null) {
						this.formulariorenta107 = new FormularioRenta107();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
				}

				if(this.formulariorenta107.getid_ejercicio()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_ejercicio = "+this.formulariorenta107.getid_ejercicio().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta107(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonnumero_pre_impresoFormularioRenta107BusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.getformulariorenta107(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta107==null) {
						this.formulariorenta107 = new FormularioRenta107();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
				}

				if(this.formulariorenta107.getnumero_pre_impreso()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where numero_pre_impreso like '%"+this.formulariorenta107.getnumero_pre_impreso()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta107(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_entregaFormularioRenta107BusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.getformulariorenta107(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta107==null) {
						this.formulariorenta107 = new FormularioRenta107();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
				}

				if(this.formulariorenta107.getfecha_entrega()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_entrega = '"+Funciones2.getStringPostgresDate(this.formulariorenta107.getfecha_entrega())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta107(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonfecha_generacionFormularioRenta107BusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.getformulariorenta107(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.formulariorenta107==null) {
						this.formulariorenta107 = new FormularioRenta107();
					}

					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);
				}

				if(this.formulariorenta107.getfecha_generacion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where fecha_generacion = '"+Funciones2.getStringPostgresDate(this.formulariorenta107.getfecha_generacion())+"' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingFormularioRenta107(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Logic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEjercicioFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta107(false,false);

			this.getFormularioRenta107sFK_IdEjercicio();

			this.inicializarActualizarBindingFormularioRenta107(false);

			//if(FormularioRenta107BeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta107(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta107(false,false);

			this.getFormularioRenta107sFK_IdEmpleado();

			this.inicializarActualizarBindingFormularioRenta107(false);

			//if(FormularioRenta107BeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta107(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaFormularioRenta107ActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingFormularioRenta107(false,false);

			this.getFormularioRenta107sFK_IdEmpresa();

			this.inicializarActualizarBindingFormularioRenta107(false);

			//if(FormularioRenta107BeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingFormularioRenta107(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.formulariorenta107Logic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameFormularioRenta107() {
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
		

		if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame!=null) {
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.setVisible(false);
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.dispose();
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame=null;
		}

		if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFramePopup!=null) {
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFramePopup.setVisible(false);
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFramePopup.dispose();
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFramePopup=null;
		}	
		
		
		}
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
			this.jInternalFrameDetalleFormFormularioRenta107.setVisible(false);	    			
			this.jInternalFrameDetalleFormFormularioRenta107.dispose();
			this.jInternalFrameDetalleFormFormularioRenta107=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoFormularioRenta107!=null) {
			this.jInternalFrameReporteDinamicoFormularioRenta107.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoFormularioRenta107.dispose();
			this.jInternalFrameReporteDinamicoFormularioRenta107=null;
		}
		
		if(this.jInternalFrameImportacionFormularioRenta107!=null) {
			this.jInternalFrameImportacionFormularioRenta107.setVisible(false);	    			
			this.jInternalFrameImportacionFormularioRenta107.dispose();
			this.jInternalFrameImportacionFormularioRenta107=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessFormularioRenta107();
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
			
			if(sTipo.equals("NuevoFormularioRenta107")) {
				jButtonNuevoFormularioRenta107ActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarFormularioRenta107")) {
				jButtonDuplicarFormularioRenta107ActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarFormularioRenta107")) {
				jButtonCopiarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("VerFormFormularioRenta107")) {
				jButtonVerFormFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarFormularioRenta107")) {
				jButtonNuevoFormularioRenta107ActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarFormularioRenta107")) {
				jButtonDuplicarFormularioRenta107ActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoFormularioRenta107")) {
				jButtonNuevoFormularioRenta107ActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarFormularioRenta107")) {
				jButtonDuplicarFormularioRenta107ActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesFormularioRenta107")) {
				jButtonNuevoFormularioRenta107ActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarFormularioRenta107")) {
				jButtonNuevoFormularioRenta107ActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesFormularioRenta107")) {
				jButtonNuevoFormularioRenta107ActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarFormularioRenta107")) {
				jButtonModificarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarFormularioRenta107")) {
				jButtonModificarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarFormularioRenta107")) {
				jButtonModificarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("ActualizarFormularioRenta107")) {
				jButtonActualizarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarFormularioRenta107")) {
				jButtonActualizarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarFormularioRenta107")) {
				jButtonActualizarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("EliminarFormularioRenta107")) {
				jButtonEliminarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarFormularioRenta107")) {
				jButtonEliminarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarFormularioRenta107")) {
				jButtonEliminarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("CancelarFormularioRenta107")) {
				jButtonCancelarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarFormularioRenta107")) {
				jButtonCancelarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarFormularioRenta107")) {
				jButtonCancelarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("CerrarFormularioRenta107")) {
				jButtonCerrarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarFormularioRenta107")) {
				jButtonCerrarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarFormularioRenta107")) {
				jButtonCerrarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarFormularioRenta107")) {
				jButtonMostrarOcultarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarFormularioRenta107")) {
				jButtonCancelarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosFormularioRenta107")) {
				jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarFormularioRenta107")) {
				jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarFormularioRenta107")) {
				jButtonCopiarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarFormularioRenta107")) {
				jButtonVerFormFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosFormularioRenta107")) {
				jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarFormularioRenta107")) {
				jButtonCopiarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormFormularioRenta107")) {
				jButtonVerFormFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaFormularioRenta107")) {
				jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarFormularioRenta107")) {
				jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaFormularioRenta107")) {
				jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionFormularioRenta107")) {
				jButtonRecargarInformacionFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarFormularioRenta107")) {
				jButtonRecargarInformacionFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionFormularioRenta107")) {
				jButtonRecargarInformacionFormularioRenta107ActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresFormularioRenta107")) {
				jButtonAnterioresFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarFormularioRenta107")) {
				jButtonAnterioresFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreFormularioRenta107")) {
				jButtonAnterioresFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("SiguientesFormularioRenta107")) {
				jButtonSiguientesFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarFormularioRenta107")) {
				jButtonSiguientesFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesFormularioRenta107")) {
				jButtonSiguientesFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByFormularioRenta107") || sTipo.equals("MenuItemDetalleAbrirOrderByFormularioRenta107")) {
				jButtonAbrirOrderByFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarFormularioRenta107") || sTipo.equals("MenuItemDetalleMostrarOcultarFormularioRenta107")) {
				jButtonMostrarOcultarFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosFormularioRenta107")) {
				jButtonNuevoGuardarCambiosFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarFormularioRenta107")) {
				jButtonNuevoGuardarCambiosFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosFormularioRenta107")) {
				jButtonNuevoGuardarCambiosFormularioRenta107ActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoFormularioRenta107")) {
				jButtonCerrarReporteDinamicoFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoFormularioRenta107")) {
				jButtonGenerarReporteDinamicoFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoFormularioRenta107")) {
				
				jButtonGenerarExcelReporteDinamicoFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionFormularioRenta107")) {
				jButtonCerrarImportacionFormularioRenta107ActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionFormularioRenta107")) {
				
				jButtonGenerarImportacionFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionFormularioRenta107")) {
				
				jButtonAbrirImportacionFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesFormularioRenta107")) {
				jComboBoxTiposAccionesFormularioRenta107ActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesFormularioRenta107")) {
				jComboBoxTiposRelacionesFormularioRenta107ActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioFormularioRenta107")) {
				jComboBoxTiposAccionesFormularioRenta107ActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarFormularioRenta107")) {
				
				jComboBoxTiposSeleccionarFormularioRenta107ActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralFormularioRenta107")) {
				jTextFieldValorCampoGeneralFormularioRenta107ActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByFormularioRenta107")) {
				jButtonAbrirOrderByFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarFormularioRenta107")) {
				jButtonAbrirOrderByFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByFormularioRenta107")) {
				jButtonCerrarOrderByFormularioRenta107ActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormularioRenta107Busqueda")) {
				this.jButtonidFormularioRenta107BusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormularioRenta107Update")) {
				this.jButtonid_empresaFormularioRenta107UpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormularioRenta107Busqueda")) {
				this.jButtonid_empresaFormularioRenta107BusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoFormularioRenta107Update")) {
				this.jButtonid_empleadoFormularioRenta107UpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoFormularioRenta107Busqueda")) {
				this.jButtonid_empleadoFormularioRenta107BusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioFormularioRenta107Update")) {
				this.jButtonid_ejercicioFormularioRenta107UpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioFormularioRenta107Busqueda")) {
				this.jButtonid_ejercicioFormularioRenta107BusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoFormularioRenta107Busqueda")) {
				this.jButtonnumero_pre_impresoFormularioRenta107BusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaFormularioRenta107Busqueda")) {
				this.jButtonfecha_entregaFormularioRenta107BusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_generacionFormularioRenta107Busqueda")) {
				this.jButtonfecha_generacionFormularioRenta107BusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdEmpleadoFormularioRenta107")) {
				this.jButtonFK_IdEmpleadoFormularioRenta107ActionPerformed(evt);
			}
			
			;
			
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessFormularioRenta107();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRenta107Actual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				


				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			FormularioRenta107 formulariorenta107Local=null;
			
			if(!this.getEsControlTabla()) {
				formulariorenta107Local=this.formulariorenta107;
			} else {
				formulariorenta107Local=this.formulariorenta107Anterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
							
				
				


				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRenta107Actual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
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
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
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
			
			


			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRenta107Actual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
								
						
				


				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
								
				
				


				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRenta107Actual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRenta107Actual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRenta107Actual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
							
				
				


				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRenta107Actual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
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
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
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
			
			


			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRenta107Actual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
								
				
				


				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRenta107Actual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRenta107Actual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
			
			this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRenta107Actual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosFormularioRenta107")) {
					jCheckBoxSeleccionarTodosFormularioRenta107ItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosFormularioRenta107")) {
					jCheckBoxSeleccionadosFormularioRenta107ItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarFormularioRenta107")) {
					
				}
				
				


				
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
												
				
				


				
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRenta107Actual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRenta107Actual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
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
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
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
			
			


			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaFormularioRenta107Actual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.formulariorenta107);
				
				this.actualizarInformacion("INFO_PADRE",false,this.formulariorenta107);
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
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
				
				


				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(FormularioRenta107.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",FormularioRenta107.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaFormularioRenta107Actual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.formulariorenta107Anterior =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarFormularioRenta107")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosFormularioRenta107ListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosFormularioRenta107.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.formulariorenta107 =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.formulariorenta107);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarFormularioRenta107")) {
				
				}
				
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarFormularioRenta107")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosFormularioRenta107.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarFormularioRenta107")) {
			
			}
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessFormularioRenta107();
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
			if(sTipo.equals("NuevoFormularioRenta107")) {
				jButtonNuevoFormularioRenta107ActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarFormularioRenta107")) {
				jButtonDuplicarFormularioRenta107ActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarFormularioRenta107")) {
				jButtonCopiarFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormFormularioRenta107")) {
				jButtonVerFormFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesFormularioRenta107")) {
				jButtonNuevoFormularioRenta107ActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarFormularioRenta107")) {
				jButtonModificarFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarFormularioRenta107")) {
				jButtonActualizarFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarFormularioRenta107")) {
				jButtonEliminarFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaFormularioRenta107")) {
				jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarFormularioRenta107")) {
				jButtonCancelarFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarFormularioRenta107")) {
				jButtonCerrarFormularioRenta107ActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosFormularioRenta107")) {
				jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosFormularioRenta107")) {
				jButtonNuevoGuardarCambiosFormularioRenta107ActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByFormularioRenta107")) {
				jButtonAbrirOrderByFormularioRenta107ActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionFormularioRenta107")) {
				jButtonRecargarInformacionFormularioRenta107ActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresFormularioRenta107")) {
				jButtonAnterioresFormularioRenta107ActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesFormularioRenta107")) {
				jButtonSiguientesFormularioRenta107ActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idFormularioRenta107Busqueda")) {
				this.jButtonidFormularioRenta107BusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaFormularioRenta107Update")) {
				this.jButtonid_empresaFormularioRenta107UpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaFormularioRenta107Busqueda")) {
				this.jButtonid_empresaFormularioRenta107BusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoFormularioRenta107Update")) {
				this.jButtonid_empleadoFormularioRenta107UpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoFormularioRenta107Busqueda")) {
				this.jButtonid_empleadoFormularioRenta107BusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_ejercicioFormularioRenta107Update")) {
				this.jButtonid_ejercicioFormularioRenta107UpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_ejercicioFormularioRenta107Busqueda")) {
				this.jButtonid_ejercicioFormularioRenta107BusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("numero_pre_impresoFormularioRenta107Busqueda")) {
				this.jButtonnumero_pre_impresoFormularioRenta107BusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_entregaFormularioRenta107Busqueda")) {
				this.jButtonfecha_entregaFormularioRenta107BusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("fecha_generacionFormularioRenta107Busqueda")) {
				this.jButtonfecha_generacionFormularioRenta107BusquedaActionPerformed(evt);
			}
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessFormularioRenta107();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameFormularioRenta107")) {
				closingInternalFrameFormularioRenta107();
				
			} else if(sTipo.equals("jButtonCancelarFormularioRenta107")) {
				JInternalFrameBase jInternalFrameDetalleFormFormularioRenta107 = (JInternalFrameBase)evt.getSource();
	            	
	            FormularioRenta107BeanSwingJInternalFrame jInternalFrameParent=(FormularioRenta107BeanSwingJInternalFrame)jInternalFrameDetalleFormFormularioRenta107.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarFormularioRenta107ActionPerformed(null);
			}
			
			FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.formulariorenta107,new Object(),this.formulariorenta107ParameterGeneral,this.formulariorenta107ReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormFormularioRenta107(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormFormularioRenta107(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormFormularioRenta107(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.formulariorenta107)) {
			if(!esControlTabla) {
				if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);			
				}
				
				if(this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualFormularioRenta107(this.formulariorenta107,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formulariorenta107ReturnGeneral=formulariorenta107Logic.procesarEventosFormularioRenta107sWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formulariorenta107Logic.getFormularioRenta107s(),this.formulariorenta107,this.formulariorenta107ParameterGeneral,this.isEsNuevoFormularioRenta107,classes);//this.formulariorenta107Logic.getFormularioRenta107()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanFormularioRenta107(this.formulariorenta107ReturnGeneral,this.formulariorenta107Bean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanFormularioRenta107(classes,this.formulariorenta107ReturnGeneral,this.formulariorenta107Bean,false);
					}
						
					if(this.formulariorenta107ReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyFormularioRenta107(this.formulariorenta107ReturnGeneral.getFormularioRenta107());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioFormularioRenta107(this.formulariorenta107ReturnGeneral.getFormularioRenta107());	
					}
						
					if(this.formulariorenta107ReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioFormularioRenta107(this.formulariorenta107ReturnGeneral.getFormularioRenta107(),classes);//this.formulariorenta107Bean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioFormularioRenta107(this.formulariorenta107,classes);//this.formulariorenta107Bean);									
				}
			
				if(FormularioRenta107JInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualFormularioRenta107(this.formulariorenta107,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysFormularioRenta107(this.formulariorenta107);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.formulariorenta107Anterior!=null) {
						this.formulariorenta107=this.formulariorenta107Anterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.formulariorenta107ReturnGeneral=formulariorenta107Logic.procesarEventosFormularioRenta107sWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formulariorenta107Logic.getFormularioRenta107s(),this.formulariorenta107,this.formulariorenta107ParameterGeneral,this.isEsNuevoFormularioRenta107,classes);//this.formulariorenta107Logic.getFormularioRenta107()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.formulariorenta107SessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.formulariorenta107SessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.formulariorenta107ReturnGeneral.getFormularioRenta107(),formulariorenta107Logic.getFormularioRenta107s());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.formulariorenta107ReturnGeneral.getFormularioRenta107(),this.formulariorenta107s);
				}
				//ARCHITECTURE
				
				//this.jTableDatosFormularioRenta107.repaint();
				
				//((AbstractTableModel) this.jTableDatosFormularioRenta107.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosFormularioRenta107();
			}
		}
	}
	
	public void actualizarVisualTableDatosFormularioRenta107() throws Exception {
		
		FormularioRenta107Model formulariorenta107Model=(FormularioRenta107Model)this.jTableDatosFormularioRenta107.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			formulariorenta107Model.formulariorenta107s=this.formulariorenta107Logic.getFormularioRenta107s();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			formulariorenta107Model.formulariorenta107s=this.formulariorenta107s;
		}
		
		
		((FormularioRenta107Model) this.jTableDatosFormularioRenta107.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaFormularioRenta107() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getformulariorenta107Anterior(),this.formulariorenta107Logic.getFormularioRenta107s());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getformulariorenta107Anterior(),this.formulariorenta107s);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosFormularioRenta107();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioFormularioRenta107(FormularioRenta107 formulariorenta107,ArrayList<Classe> classes) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleFormularioRenta107.class)) {
					this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.setDetalleFormularioRenta107s(formulariorenta107.getDetalleFormularioRenta107s());
					this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleFormularioRenta107(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
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
										
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formulariorenta107,new Object(),generalEntityParameterGeneral,this.formulariorenta107ReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.formulariorenta107SessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=FormularioRenta107ConstantesFunciones.getClassesRelationshipsOfFormularioRenta107(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=FormularioRenta107ConstantesFunciones.getClassesRelationshipsFromStringsOfFormularioRenta107(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormFormularioRenta107(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				FormularioRenta107BeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.formulariorenta107,new Object(),generalEntityParameterGeneral,this.formulariorenta107ReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioFormularioRenta107(FormularioRenta107Bean formulariorenta107Bean) throws Exception { 
		try {
			
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleFormularioRenta107.class)) {
					this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.setDetalleFormularioRenta107s(formulariorenta107.getDetalleFormularioRenta107s());
					this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.inicializarActualizarBindingTablaDetalleFormularioRenta107(false);
					break;
				}
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanFormularioRenta107(ArrayList<Classe> classes,FormularioRenta107ReturnGeneral formulariorenta107ReturnGeneral,FormularioRenta107Bean formulariorenta107Bean,Boolean conDefault) throws Exception {
		
			this.formulariorenta107Bean.setDetalleFormularioRenta107s(formulariorenta107ReturnGeneral.getFormularioRenta107().getDetalleFormularioRenta107s());
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualFormularioRenta107(FormularioRenta107 formulariorenta107,ArrayList<Classe> classes) throws Exception {
		
			for(Classe clas:classes) {
				if(clas.clas.equals(DetalleFormularioRenta107.class)) {
					formulariorenta107.setDetalleFormularioRenta107s(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107BeanSwingJInternalFrame.detalleformulariorenta107Logic.getDetalleFormularioRenta107s());
					break;
				}
			}
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.formulariorenta107)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormFormularioRenta107 = new FormularioRenta107DetalleFormJInternalFrame(jDesktopPane,this.formulariorenta107SessionBean.getConGuardarRelaciones(),this.formulariorenta107SessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.setVisible(false);
		this.jInternalFrameDetalleFormFormularioRenta107.setSelected(false);						
		
		this.jInternalFrameDetalleFormFormularioRenta107.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormFormularioRenta107.formulariorenta107Logic=this.formulariorenta107Logic;
		
		this.cargarCombosFrameForeignKeyFormularioRenta107("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleFormularioRenta107();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleFormularioRenta107();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyFormularioRenta107("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyFormularioRenta107();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormFormularioRenta107.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormularioRenta107"));
		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonModificarFormularioRenta107.addActionListener(new ButtonActionListener(this,"ModificarFormularioRenta107"));

		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonModificarToolBarFormularioRenta107.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormularioRenta107"));
					
		this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemModificarFormularioRenta107.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormularioRenta107"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonActualizarFormularioRenta107.addActionListener (new ButtonActionListener(this,"ActualizarFormularioRenta107"));
		
		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonActualizarToolBarFormularioRenta107.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormularioRenta107"));
						
		this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemActualizarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormularioRenta107"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonEliminarFormularioRenta107.addActionListener (new ButtonActionListener(this,"EliminarFormularioRenta107"));
		
		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonEliminarToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormularioRenta107"));
								
		this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemEliminarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormularioRenta107"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonCancelarFormularioRenta107.addActionListener (new ButtonActionListener(this,"CancelarFormularioRenta107"));
		
		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonCancelarToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormularioRenta107"));
					
		this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemCancelarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormularioRenta107"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemDetalleCerrarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormularioRenta107"));		
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormularioRenta107"));
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormularioRenta107"));
		
		
		
		this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormularioRenta107"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonidFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"idFormularioRenta107Busqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empresaFormularioRenta107Update.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRenta107Update"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empresaFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRenta107Busqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empleadoFormularioRenta107Update.addActionListener(new ButtonActionListener(this,"id_empleadoFormularioRenta107Update"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empleadoFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"id_empleadoFormularioRenta107Busqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_ejercicioFormularioRenta107Update.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRenta107Update"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_ejercicioFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRenta107Busqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonnumero_pre_impresoFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFormularioRenta107Busqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonfecha_entregaFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaFormularioRenta107Busqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonfecha_generacionFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"fecha_generacionFormularioRenta107Busqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormFormularioRenta107.jTabbedPaneRelacionesFormularioRenta107.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormularioRenta107"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameFormularioRenta107"));
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarFormularioRenta107"));
		}
		
		this.jTableDatosFormularioRenta107.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarFormularioRenta107"));
		
		this.jTableDatosFormularioRenta107.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarFormularioRenta107"));
		
		this.jButtonNuevoFormularioRenta107.addActionListener(new ButtonActionListener(this,"NuevoFormularioRenta107"));
		
		this.jButtonDuplicarFormularioRenta107.addActionListener(new ButtonActionListener(this,"DuplicarFormularioRenta107"));
		
		this.jButtonCopiarFormularioRenta107.addActionListener(new ButtonActionListener(this,"CopiarFormularioRenta107"));
		
		this.jButtonVerFormFormularioRenta107.addActionListener(new ButtonActionListener(this,"VerFormFormularioRenta107"));
		
		
		this.jButtonNuevoToolBarFormularioRenta107.addActionListener(new ButtonActionListener(this,"NuevoToolBarFormularioRenta107"));
			
		this.jButtonDuplicarToolBarFormularioRenta107.addActionListener(new ButtonActionListener(this,"DuplicarToolBarFormularioRenta107"));
			
		this.jMenuItemNuevoFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemNuevoFormularioRenta107"));
			
		this.jMenuItemDuplicarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarFormularioRenta107"));		
		
		
		this.jButtonNuevoRelacionesFormularioRenta107.addActionListener (new ButtonActionListener(this,"NuevoRelacionesFormularioRenta107"));
		
		
		this.jButtonNuevoRelacionesToolBarFormularioRenta107.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarFormularioRenta107"));
			
		this.jMenuItemNuevoRelacionesFormularioRenta107.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesFormularioRenta107"));		
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonModificarFormularioRenta107.addActionListener(new ButtonActionListener(this,"ModificarFormularioRenta107"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonModificarToolBarFormularioRenta107.addActionListener(new ButtonActionListener(this,"ModificarToolBarFormularioRenta107"));
			
			this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemModificarFormularioRenta107.addActionListener(new ButtonActionListener(this,"MenuItemModificarFormularioRenta107"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonActualizarFormularioRenta107.addActionListener (new ButtonActionListener(this,"ActualizarFormularioRenta107"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonActualizarToolBarFormularioRenta107.addActionListener(new ButtonActionListener(this,"ActualizarToolBarFormularioRenta107"));
				
			this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemActualizarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemActualizarFormularioRenta107"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonEliminarFormularioRenta107.addActionListener (new ButtonActionListener(this,"EliminarFormularioRenta107"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonEliminarToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"EliminarToolBarFormularioRenta107"));
						
			this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemEliminarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemEliminarFormularioRenta107"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonCancelarFormularioRenta107.addActionListener (new ButtonActionListener(this,"CancelarFormularioRenta107"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonCancelarToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"CancelarToolBarFormularioRenta107"));
			
			this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemCancelarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemCancelarFormularioRenta107"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarFormularioRenta107"));		
		
		
		this.jButtonCerrarFormularioRenta107.addActionListener (new ButtonActionListener(this,"CerrarFormularioRenta107"));
		
		
		this.jButtonCerrarToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"CerrarToolBarFormularioRenta107"));
			
		this.jMenuItemCerrarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemCerrarFormularioRenta107"));
			
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jMenuItemDetalleCerrarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarFormularioRenta107"));		
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosFormularioRenta107.addActionListener (new ButtonActionListener(this,"GuardarCambiosFormularioRenta107"));
		}
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarFormularioRenta107"));
		}
		
		this.jButtonCopiarToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"CopiarToolBarFormularioRenta107"));
			
		this.jButtonVerFormToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"VerFormToolBarFormularioRenta107"));
		
		this.jMenuItemGuardarCambiosFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosFormularioRenta107"));
			
		this.jMenuItemCopiarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemCopiarFormularioRenta107"));		
		
		this.jMenuItemVerFormFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemVerFormFormularioRenta107"));		
		
		
		this.jButtonGuardarCambiosTablaFormularioRenta107.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormularioRenta107"));
		
		
		this.jButtonGuardarCambiosTablaToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarFormularioRenta107"));
			
		this.jMenuItemGuardarCambiosTablaFormularioRenta107.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaFormularioRenta107"));		
		
		
		
		this.jButtonRecargarInformacionFormularioRenta107.addActionListener (new ButtonActionListener(this,"RecargarInformacionFormularioRenta107"));
					
		this.jButtonRecargarInformacionToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarFormularioRenta107"));
		
		this.jMenuItemRecargarInformacionFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionFormularioRenta107"));		
		
		
		
		this.jButtonAnterioresFormularioRenta107.addActionListener (new ButtonActionListener(this,"AnterioresFormularioRenta107"));
		
		
		this.jButtonAnterioresToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"AnterioresToolBarFormularioRenta107"));
		
		this.jMenuItemAnterioresFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresFormularioRenta107"));		
		
		
		this.jButtonSiguientesFormularioRenta107.addActionListener (new ButtonActionListener(this,"SiguientesFormularioRenta107"));
		
		
		this.jButtonSiguientesToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"SiguientesToolBarFormularioRenta107"));
			
		this.jMenuItemSiguientesFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesFormularioRenta107"));
			
		this.jMenuItemAbrirOrderByFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByFormularioRenta107"));
			
		this.jMenuItemMostrarOcultarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarFormularioRenta107"));
			
		this.jMenuItemDetalleAbrirOrderByFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByFormularioRenta107"));
			
		this.jMenuItemDetalleMostarOcultarFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarFormularioRenta107"));		
		
		
		this.jButtonNuevoGuardarCambiosFormularioRenta107.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosFormularioRenta107"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarFormularioRenta107"));
			
		this.jMenuItemNuevoGuardarCambiosFormularioRenta107.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosFormularioRenta107"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosFormularioRenta107.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosFormularioRenta107"));

		this.jCheckBoxSeleccionadosFormularioRenta107.addItemListener(new CheckBoxItemListener(this,"SeleccionadosFormularioRenta107"));
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioFormularioRenta107"));
		}
		
		
		this.jComboBoxTiposRelacionesFormularioRenta107.addActionListener (new ButtonActionListener(this,"TiposRelacionesFormularioRenta107"));
			
		this.jComboBoxTiposAccionesFormularioRenta107.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioRenta107"));
					
		this.jComboBoxTiposSeleccionarFormularioRenta107.addActionListener (new ButtonActionListener(this,"TiposSeleccionarFormularioRenta107"));
			
		this.jTextFieldValorCampoGeneralFormularioRenta107.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralFormularioRenta107"));		
		
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonidFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"idFormularioRenta107Busqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empresaFormularioRenta107Update.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRenta107Update"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empresaFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRenta107Busqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empleadoFormularioRenta107Update.addActionListener(new ButtonActionListener(this,"id_empleadoFormularioRenta107Update"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empleadoFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"id_empleadoFormularioRenta107Busqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_ejercicioFormularioRenta107Update.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRenta107Update"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_ejercicioFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRenta107Busqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonnumero_pre_impresoFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFormularioRenta107Busqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonfecha_entregaFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaFormularioRenta107Busqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonfecha_generacionFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"fecha_generacionFormularioRenta107Busqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoFormularioRenta107.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoFormularioRenta107"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoFormularioRenta107!=null) {
				this.jInternalFrameReporteDinamicoFormularioRenta107.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormularioRenta107"));
				this.jInternalFrameReporteDinamicoFormularioRenta107.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormularioRenta107"));
				this.jInternalFrameReporteDinamicoFormularioRenta107.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormularioRenta107"));
			}
			
			//this.jButtonCerrarReporteDinamicoFormularioRenta107.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoFormularioRenta107"));				
			//this.jButtonGenerarReporteDinamicoFormularioRenta107.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoFormularioRenta107"));
			//this.jButtonGenerarExcelReporteDinamicoFormularioRenta107.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoFormularioRenta107"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionFormularioRenta107!=null) {
				this.jInternalFrameImportacionFormularioRenta107.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionFormularioRenta107"));
				this.jInternalFrameImportacionFormularioRenta107.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionFormularioRenta107"));
				this.jInternalFrameImportacionFormularioRenta107.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionFormularioRenta107"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByFormularioRenta107.addActionListener (new ButtonActionListener(this,"AbrirOrderByFormularioRenta107"));
			
			this.jButtonAbrirOrderByToolBarFormularioRenta107.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarFormularioRenta107"));			
			
			if(this.jInternalFrameOrderByFormularioRenta107!=null) {
				this.jInternalFrameOrderByFormularioRenta107.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByFormularioRenta107"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormFormularioRenta107.jTabbedPaneRelacionesFormularioRenta107.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesFormularioRenta107"));
		
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
            		closingInternalFrameFormularioRenta107();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormFormularioRenta107.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormFormularioRenta107 = (JInternalFrameBase)event.getSource();
	            	
	            FormularioRenta107BeanSwingJInternalFrame jInternalFrameParent=(FormularioRenta107BeanSwingJInternalFrame)jInternalFrameDetalleFormFormularioRenta107.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarFormularioRenta107ActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosFormularioRenta107.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosFormularioRenta107ListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosFormularioRenta107.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosFormularioRenta107.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRenta107ActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRenta107ActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRenta107ActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoFormularioRenta107";
		inputMap = this.jButtonNuevoFormularioRenta107.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoFormularioRenta107.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormularioRenta107ActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRenta107ActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRenta107ActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoFormularioRenta107ActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesFormularioRenta107";
		inputMap = this.jButtonNuevoRelacionesFormularioRenta107.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesFormularioRenta107.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoFormularioRenta107ActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarFormularioRenta107";
		inputMap = this.jButtonModificarFormularioRenta107.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarFormularioRenta107.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarFormularioRenta107ActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarFormularioRenta107";
		inputMap = this.jButtonActualizarFormularioRenta107.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarFormularioRenta107.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarFormularioRenta107ActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarFormularioRenta107";
		inputMap = this.jButtonEliminarFormularioRenta107.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarFormularioRenta107.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarFormularioRenta107ActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarFormularioRenta107";
		inputMap = this.jButtonCancelarFormularioRenta107.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarFormularioRenta107.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarFormularioRenta107ActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarFormularioRenta107";
		inputMap = this.jButtonCerrarFormularioRenta107.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarFormularioRenta107.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarFormularioRenta107ActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosFormularioRenta107";
		inputMap = this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosFormularioRenta107.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonGuardarCambiosFormularioRenta107.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosFormularioRenta107ActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosFormularioRenta107.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosFormularioRenta107ItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesFormularioRenta107.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesFormularioRenta107ActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarFormularioRenta107.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarFormularioRenta107ActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralFormularioRenta107.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralFormularioRenta107ActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonidFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"idFormularioRenta107Busqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empresaFormularioRenta107Update.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRenta107Update"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empresaFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"id_empresaFormularioRenta107Busqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empleadoFormularioRenta107Update.addActionListener(new ButtonActionListener(this,"id_empleadoFormularioRenta107Update"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_empleadoFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"id_empleadoFormularioRenta107Busqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_ejercicioFormularioRenta107Update.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRenta107Update"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonid_ejercicioFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"id_ejercicioFormularioRenta107Busqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonnumero_pre_impresoFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"numero_pre_impresoFormularioRenta107Busqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonfecha_entregaFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"fecha_entregaFormularioRenta107Busqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormFormularioRenta107.jButtonfecha_generacionFormularioRenta107Busqueda.addActionListener(new ButtonActionListener(this,"fecha_generacionFormularioRenta107Busqueda"));
		
		
		this.jButtonFK_IdEmpleadoFormularioRenta107.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoFormularioRenta107"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionFormularioRenta107.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionFormularioRenta107ActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarFormularioRenta107ActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarFormularioRenta107.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosFormularioRenta107(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107Logic.getFormularioRenta107s()) {
					formulariorenta107Aux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioRenta107 formulariorenta107Aux:formulariorenta107s) {
					formulariorenta107Aux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosFormularioRenta107ItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormularioRenta107(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107Logic.getFormularioRenta107s()) {
						formulariorenta107Aux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormularioRenta107 formulariorenta107Aux:formulariorenta107s) {
						formulariorenta107Aux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107Logic.getFormularioRenta107s()) {
					
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormularioRenta107 formulariorenta107Aux:formulariorenta107s) {
						
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaFormularioRenta107(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormularioRenta107.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormularioRenta107.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosFormularioRenta107ItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingFormularioRenta107(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosFormularioRenta107.getSelectedRows();
			
			FormularioRenta107 formulariorenta107Local=new FormularioRenta107();
			
			//this.seleccionarTodosFormularioRenta107(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					formulariorenta107Local =(FormularioRenta107) this.formulariorenta107Logic.getFormularioRenta107s().toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					formulariorenta107Local =(FormularioRenta107) this.formulariorenta107s.toArray()[this.jTableDatosFormularioRenta107.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				formulariorenta107Local.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107Logic.getFormularioRenta107s()) {
						formulariorenta107Aux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(FormularioRenta107 formulariorenta107Aux:formulariorenta107s) {
						formulariorenta107Aux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaFormularioRenta107(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosFormularioRenta107.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosFormularioRenta107.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosFormularioRenta107,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualFormularioRenta107ItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarFormularioRenta107ParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralFormularioRenta107ActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingFormularioRenta107(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralFormularioRenta107.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107Logic.getFormularioRenta107s()) {
				
						if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							formulariorenta107Aux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							formulariorenta107Aux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION)) {
							existe=true;
							formulariorenta107Aux.setfecha_generacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioRenta107 formulariorenta107Aux:formulariorenta107s) {
					
						if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
							existe=true;
							formulariorenta107Aux.setnumero_pre_impreso(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA)) {
							existe=true;
							formulariorenta107Aux.setfecha_entrega(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION)) {
							existe=true;
							formulariorenta107Aux.setfecha_generacion(Funciones.ConvertToDate(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaFormularioRenta107(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesFormularioRenta107ActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingFormularioRenta107(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioFormularioRenta107=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesFormularioRenta107.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteFormularioRenta107) {				
					conSplash=true;//false;										
					
					//this.startProcessFormularioRenta107(conSplash);
				
					this.generarReporteFormularioRenta107sSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoFormularioRenta107sSeleccionados();
				//this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormularioRenta107sSeleccionados(false);
				//this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoFormularioRenta107sSeleccionados(true);
				//this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormularioRenta107();
				
				this.exportarFormularioRenta107sSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionFormularioRenta107s();
				//this.importarFormularioRenta107s();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessFormularioRenta107();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelFormularioRenta107sSeleccionados();
				//this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Formulario Renta107", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessFormularioRenta107();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoFormularioRenta107)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyFormularioRenta107(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Formulario Renta107",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.setSelectedIndex(0);					
				}	
			} 			
			else if(FormularioRenta107BeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteFormularioRenta107) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessFormularioRenta107(conSplash);
					
						//this.actualizarParametrosGeneralFormularioRenta107();
						
						this.generarReporteProcesoAccionFormularioRenta107sSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(FormularioRenta107BeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Formulario Renta107ES SELECCIONADOS?", "MANTENIMIENTO DE Formulario Renta107", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessFormularioRenta107();
				
						this.actualizarParametrosGeneralFormularioRenta107();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.formulariorenta107ReturnGeneral=formulariorenta107Logic.procesarAccionFormularioRenta107sWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.formulariorenta107Logic.getFormularioRenta107s(),this.formulariorenta107ParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarFormularioRenta107ReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralFormularioRenta107();
					
					FormularioRenta107BeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarFormularioRenta107ReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesFormularioRenta107.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxTiposAccionesFormularioFormularioRenta107.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessFormularioRenta107(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesFormularioRenta107ActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessFormularioRenta107();
			
			if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();		
			FormularioRenta107 formulariorenta107=new FormularioRenta107();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingFormularioRenta107(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesFormularioRenta107.getSelectedItem();
			
			
			
			
			formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
			//this.sTipoAccion;
			
			if(formulariorenta107sSeleccionados.size()==1) {
				for(FormularioRenta107 formulariorenta107Aux:formulariorenta107sSeleccionados) {
					formulariorenta107=formulariorenta107Aux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
				else if(this.sTipoRelacion.equals("Detalle Formulario Renta107")) {
					jButtonDetalleFormularioRenta107ActionPerformed(null,rowIndex,true,false,formulariorenta107);
				}
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessFormularioRenta107();
			
      		//this.finishProcessFormularioRenta107(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarFormularioRenta107ReturnGeneral() throws Exception {
		if(this.formulariorenta107ReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.formulariorenta107ReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.formulariorenta107ReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.formulariorenta107ReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.formulariorenta107ReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.formulariorenta107ReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingFormularioRenta107(false);
		}
		
		if(this.formulariorenta107ReturnGeneral.getConRetornoLista() || this.formulariorenta107ReturnGeneral.getConRetornoObjeto()) {
			if(this.formulariorenta107ReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formulariorenta107Logic.setFormularioRenta107s(this.formulariorenta107ReturnGeneral.getFormularioRenta107s());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.formulariorenta107ReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.formulariorenta107Logic.setFormularioRenta107(this.formulariorenta107ReturnGeneral.getFormularioRenta107());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingFormularioRenta107(false);
		}
	}
	
	public void actualizarParametrosGeneralFormularioRenta107() throws Exception {
		
		
	}
	
	public ArrayList<FormularioRenta107> getFormularioRenta107sSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioFormularioRenta107) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(FormularioRenta107 formulariorenta107Aux:formulariorenta107Logic.getFormularioRenta107s()) {
					if(formulariorenta107Aux.getIsSelected()) {
						formulariorenta107sSeleccionados.add(formulariorenta107Aux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(FormularioRenta107 formulariorenta107Aux:this.formulariorenta107s) {
					if(formulariorenta107Aux.getIsSelected()) {
						formulariorenta107sSeleccionados.add(formulariorenta107Aux);				
					}
				}
			}
			
			if(formulariorenta107sSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						formulariorenta107sSeleccionados.addAll(this.formulariorenta107Logic.getFormularioRenta107s());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						formulariorenta107sSeleccionados.addAll(this.formulariorenta107s);				
					}
				}
			}
		} else {
			formulariorenta107sSeleccionados.add(this.formulariorenta107);
		}
		
		return formulariorenta107sSeleccionados;
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
	
	public void generarReporteFormularioRenta107sSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalFormularioRenta107sSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoFormularioRenta107sSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormularioRenta107sSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoFormularioRenta107sSeleccionados(true);
		}
		else if(this.sTipoReporte.equals("RELACIONES")) {
			//SI SE GENERA REPORTE RELACIONES
			existe=true;
			this.generarReporteRelacionesFormularioRenta107sSeleccionados();
		}					
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Formulario Renta107",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesFormularioRenta107sSeleccionados() throws Exception {
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();		
		
		formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteFormularioRenta107s("Todos",formulariorenta107sSeleccionados);
		
	}	
	
	public void generarReporteNormalFormularioRenta107sSeleccionados() throws Exception {
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();		
		
		formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteFormularioRenta107s("Todos",formulariorenta107sSeleccionados);
	}		
	
	public void generarReporteProcesoAccionFormularioRenta107sSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();
		
		formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteFormularioRenta107s("Todos",formulariorenta107sSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoFormularioRenta107sSeleccionados() throws Exception {
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();		
		
		
		this.abrirInicializarFrameReporteDinamicoFormularioRenta107();
		
		
		formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoFormularioRenta107();
		
		
		//this.generarReporteFormularioRenta107s("Todos",formulariorenta107sSeleccionados ,formulariorenta107Implementable,formulariorenta107ImplementableHome);
	}
	
	public void mostrarImportacionFormularioRenta107s() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionFormularioRenta107();
		
		this.abrirFrameImportacionFormularioRenta107();		
		
			
		//this.generarReporteFormularioRenta107s("Todos",formulariorenta107sSeleccionados ,formulariorenta107Implementable,formulariorenta107ImplementableHome);
	}
	
	public void importarFormularioRenta107s() throws Exception {		
	
	}
	
	public void exportarFormularioRenta107sSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelFormularioRenta107sSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoFormularioRenta107sSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlFormularioRenta107sSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Formulario Renta107",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoFormularioRenta107sSeleccionados() throws Exception {
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();		
		
		formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta107."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarFormularioRenta107(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(FormularioRenta107 formulariorenta107Aux:formulariorenta107sSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarFormularioRenta107(formulariorenta107Aux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//formulariorenta107Aux.setsDetalleGeneralEntityReporte(formulariorenta107Aux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta107",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarFormularioRenta107(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=FormularioRenta107ConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRenta107ConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarFormularioRenta107(FormularioRenta107 formulariorenta107,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=formulariorenta107.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta107.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta107.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta107.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta107.getejercicio_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta107.getnumero_pre_impreso();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta107.getfecha_entrega().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=formulariorenta107.getfecha_generacion().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelFormularioRenta107sSeleccionados() throws Exception {
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();		
		
		formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta107.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("FormularioRenta107s");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelFormularioRenta107(row);				
				iRow++;
			}				
			
			for(FormularioRenta107 formulariorenta107Aux:formulariorenta107sSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelFormularioRenta107(formulariorenta107Aux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta107",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlFormularioRenta107sSeleccionados() throws Exception {
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();		
		
		formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"formulariorenta107.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("formulariorenta107s");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("formulariorenta107");
			//elementRoot.appendChild(element);
		
			for(FormularioRenta107 formulariorenta107Aux:formulariorenta107sSeleccionados) {
				element = document.createElement("formulariorenta107");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlFormularioRenta107(formulariorenta107Aux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Formulario Renta107",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelFormularioRenta107(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA);
		cell = row.createCell(iColumn++);cell.setCellValue(FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelFormularioRenta107(FormularioRenta107 formulariorenta107,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta107.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta107.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta107.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta107.getejercicio_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta107.getnumero_pre_impreso());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta107.getfecha_entrega());
		cell = row.createCell(iColumn++);cell.setCellValue(formulariorenta107.getfecha_generacion());				
	}
	
	public void setFilaDatosExportarXmlFormularioRenta107(FormularioRenta107 formulariorenta107,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(FormularioRenta107ConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(formulariorenta107.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(FormularioRenta107ConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(formulariorenta107.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(FormularioRenta107ConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(formulariorenta107.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(FormularioRenta107ConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(formulariorenta107.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementejercicio_descripcion = document.createElement(FormularioRenta107ConstantesFunciones.IDEJERCICIO);
		elementejercicio_descripcion.appendChild(document.createTextNode(formulariorenta107.getejercicio_descripcion()));
		element.appendChild(elementejercicio_descripcion);

		Element elementnumero_pre_impreso = document.createElement(FormularioRenta107ConstantesFunciones.NUMEROPREIMPRESO);
		elementnumero_pre_impreso.appendChild(document.createTextNode(formulariorenta107.getnumero_pre_impreso().trim()));
		element.appendChild(elementnumero_pre_impreso);

		Element elementfecha_entrega = document.createElement(FormularioRenta107ConstantesFunciones.FECHAENTREGA);
		elementfecha_entrega.appendChild(document.createTextNode(formulariorenta107.getfecha_entrega().toString().trim()));
		element.appendChild(elementfecha_entrega);

		Element elementfecha_generacion = document.createElement(FormularioRenta107ConstantesFunciones.FECHAGENERACION);
		elementfecha_generacion.appendChild(document.createTextNode(formulariorenta107.getfecha_generacion().toString().trim()));
		element.appendChild(elementfecha_generacion);
	}
	
	public void generarReporteGroupGenericoFormularioRenta107sSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<FormularioRenta107> formulariorenta107sSeleccionados=new ArrayList<FormularioRenta107>();
		
		formulariorenta107sSeleccionados=this.getFormularioRenta107sSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoFormularioRenta107(formulariorenta107sSeleccionados);
		
		this.generarReporteFormularioRenta107s("Todos",formulariorenta107sSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoFormularioRenta107(ArrayList<FormularioRenta107> formulariorenta107sSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(FormularioRenta107 formulariorenta107Aux:formulariorenta107sSeleccionados) {
				formulariorenta107Aux.setsDetalleGeneralEntityReporte(formulariorenta107Aux.toString());
			
				if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					formulariorenta107Aux.setsDescripcionGeneralEntityReporte1(formulariorenta107Aux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					formulariorenta107Aux.setsDescripcionGeneralEntityReporte1(formulariorenta107Aux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_IDEJERCICIO)) {
					existe=true;
					formulariorenta107Aux.setsDescripcionGeneralEntityReporte1(formulariorenta107Aux.getejercicio_descripcion());
				}
				 else if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_NUMEROPREIMPRESO)) {
					existe=true;
					formulariorenta107Aux.setsDescripcionGeneralEntityReporte1(formulariorenta107Aux.getnumero_pre_impreso());
				}
				 else if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_FECHAENTREGA)) {
					existe=true;
					formulariorenta107Aux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(formulariorenta107Aux.getfecha_entrega()));
				}
				 else if(sTipoSeleccionar.equals(FormularioRenta107ConstantesFunciones.LABEL_FECHAGENERACION)) {
					existe=true;
					formulariorenta107Aux.setsDescripcionGeneralEntityReporte1(Funciones2.getStringPostgresDate(formulariorenta107Aux.getfecha_generacion()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,FormularioRenta107ConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesFormularioRenta107(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoFormularioRenta107=true;
				this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=true;
				this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=true;
			}
			
			this.isVisibilidadCeldaModificarFormularioRenta107=false;
			this.isVisibilidadCeldaActualizarFormularioRenta107=false;
			this.isVisibilidadCeldaEliminarFormularioRenta107=false;
			this.isVisibilidadCeldaCancelarFormularioRenta107=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta107=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta107=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoFormularioRenta107=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=false;
			this.isVisibilidadCeldaModificarFormularioRenta107=false;
			this.isVisibilidadCeldaActualizarFormularioRenta107=true;
			this.isVisibilidadCeldaEliminarFormularioRenta107=false;
			this.isVisibilidadCeldaCancelarFormularioRenta107=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta107=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta107=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoFormularioRenta107=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=false;
			this.isVisibilidadCeldaModificarFormularioRenta107=false;
			this.isVisibilidadCeldaActualizarFormularioRenta107=true;
			this.isVisibilidadCeldaEliminarFormularioRenta107=true;
			this.isVisibilidadCeldaCancelarFormularioRenta107=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta107=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta107=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoFormularioRenta107=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=false;
			this.isVisibilidadCeldaModificarFormularioRenta107=false;
			this.isVisibilidadCeldaActualizarFormularioRenta107=true;
			this.isVisibilidadCeldaEliminarFormularioRenta107=false;
			this.isVisibilidadCeldaCancelarFormularioRenta107=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta107=false;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta107=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoFormularioRenta107=true;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=true;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=true;
			this.isVisibilidadCeldaModificarFormularioRenta107=false;
			this.isVisibilidadCeldaActualizarFormularioRenta107=false;
			this.isVisibilidadCeldaEliminarFormularioRenta107=false;
			this.isVisibilidadCeldaCancelarFormularioRenta107=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta107=true;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta107=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoFormularioRenta107=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=false;
			this.isVisibilidadCeldaActualizarFormularioRenta107=false;
			this.isVisibilidadCeldaEliminarFormularioRenta107=false;
			this.isVisibilidadCeldaCancelarFormularioRenta107=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta107=false;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta107=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoFormularioRenta107=false;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=false;
			this.isVisibilidadCeldaModificarFormularioRenta107=true;
			this.isVisibilidadCeldaActualizarFormularioRenta107=false;
			this.isVisibilidadCeldaEliminarFormularioRenta107=false;
			this.isVisibilidadCeldaCancelarFormularioRenta107=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarFormularioRenta107=false;
				} else {
					this.isVisibilidadCeldaGuardarFormularioRenta107=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(FormularioRenta107JInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoFormularioRenta107=true;
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=true;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=true;
		} else {
			this.actualizarEstadoPanelsFormularioRenta107(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarFormularioRenta107=false;
			//this.isVisibilidadCeldaVerFormFormularioRenta107=false;
			this.isVisibilidadCeldaDuplicarFormularioRenta107=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!formulariorenta107SessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=false;
		} else {
			this.isVisibilidadCeldaNuevoFormularioRenta107=false;
			this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			if(!formulariorenta107SessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=false;												
			}
			
			this.jButtonCerrarFormularioRenta107.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesFormularioRenta107=false;
		}
		
		if(!this.permiteMantenimiento(this.formulariorenta107)) {
			this.isVisibilidadCeldaActualizarFormularioRenta107=false;
			this.isVisibilidadCeldaEliminarFormularioRenta107=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesFormularioRenta107() {
		this.isVisibilidadCeldaNuevoFormularioRenta107=false;
		this.isVisibilidadCeldaGuardarCambiosFormularioRenta107=false;
	}
	
	public void actualizarEstadoPanelsFormularioRenta107(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionFormularioRenta107!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta107.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta107!=null) {
				this.jTabbedPaneBusquedasFormularioRenta107.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta107!=null) {
				this.jScrollPanelDatosFormularioRenta107.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioRenta107!=null) {
				this.jPanelPaginacionFormularioRenta107.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta107!=null) {
				this.jPanelParametrosReportesFormularioRenta107.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionFormularioRenta107!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta107.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta107!=null) {
				this.jTabbedPaneBusquedasFormularioRenta107.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosFormularioRenta107!=null) {
				this.jScrollPanelDatosFormularioRenta107.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormularioRenta107!=null) {
				this.jPanelPaginacionFormularioRenta107.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta107!=null) {
				this.jPanelParametrosReportesFormularioRenta107.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionFormularioRenta107!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta107.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta107!=null) {
				this.jTabbedPaneBusquedasFormularioRenta107.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta107!=null) {
				this.jScrollPanelDatosFormularioRenta107.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormularioRenta107!=null) {
				this.jPanelPaginacionFormularioRenta107.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta107!=null) {
				this.jPanelParametrosReportesFormularioRenta107.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionFormularioRenta107!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta107.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta107!=null) {
				this.jTabbedPaneBusquedasFormularioRenta107.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta107!=null) {
				this.jScrollPanelDatosFormularioRenta107.setVisible(false);
			}
			
			if(this.jPanelPaginacionFormularioRenta107!=null) {
				this.jPanelPaginacionFormularioRenta107.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta107!=null) {
				this.jPanelParametrosReportesFormularioRenta107.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionFormularioRenta107!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta107.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta107!=null) {
				this.jTabbedPaneBusquedasFormularioRenta107.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta107!=null) {
				this.jScrollPanelDatosFormularioRenta107.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioRenta107!=null) {
				this.jPanelPaginacionFormularioRenta107.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta107!=null) {
				this.jPanelParametrosReportesFormularioRenta107.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionFormularioRenta107!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta107.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta107!=null) {
				this.jTabbedPaneBusquedasFormularioRenta107.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta107!=null) {
				this.jScrollPanelDatosFormularioRenta107.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioRenta107!=null) {
				this.jPanelPaginacionFormularioRenta107.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta107!=null) {
				this.jPanelParametrosReportesFormularioRenta107.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionFormularioRenta107!=null) {
				this.jScrollPanelDatosEdicionFormularioRenta107.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta107!=null) {
				this.jTabbedPaneBusquedasFormularioRenta107.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosFormularioRenta107!=null) {
				this.jScrollPanelDatosFormularioRenta107.setVisible(true);
			}
			
			if(this.jPanelPaginacionFormularioRenta107!=null) {
				this.jPanelPaginacionFormularioRenta107.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesFormularioRenta107!=null) {
				this.jPanelParametrosReportesFormularioRenta107.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasFormularioRenta107!=null) {
					this.jTabbedPaneBusquedasFormularioRenta107.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesFormularioRenta107!=null) {
				this.jPanelParametrosReportesFormularioRenta107.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.formulariorenta107SessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasFormularioRenta107!=null) {
				this.jTabbedPaneBusquedasFormularioRenta107.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesFormularioRenta107!=null) {
				this.jPanelParametrosReportesFormularioRenta107.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasFormularioRenta107.remove(jPanelFK_IdEmpleadoFormularioRenta107);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasFormularioRenta107.remove(jPanelFK_IdEmpleadoFormularioRenta107);}
		}
		
	}

	public void setVisibilidadBusquedasParaEjercicio(Boolean isParaEjercicio){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEjercicioNegation=!isParaEjercicio;

			this.isVisibilidadFK_IdEmpleado=isParaEjercicioNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasFormularioRenta107.remove(jPanelFK_IdEmpleadoFormularioRenta107);}
		}
		
	}
	
	

	public String registrarSesionFormularioRenta107ParaDetalleFormularioRenta107es() throws Exception {
		Boolean isPaginaPopupDetalleFormularioRenta107=false;

		try {

			if(this.formulariorenta107SessionBean==null) {
				this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
			}

			if(this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107SessionBean==null) {
				this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107SessionBean=new DetalleFormularioRenta107SessionBean();
			}

			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107SessionBean.setsPathNavegacionActual(formulariorenta107SessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+DetalleFormularioRenta107ConstantesFunciones.SCLASSWEBTITULO);
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107SessionBean.setisPermiteRecargarInformacion(false);
			isPaginaPopupDetalleFormularioRenta107=this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107SessionBean.getisPaginaPopup();
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107SessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107(true);
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107SessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeDetalleFormularioRenta107(FormularioRenta107ConstantesFunciones.SNOMBREOPCION);
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107SessionBean.setisBusquedaDesdeForeignKeySesionFormularioRenta107(true);
			this.jInternalFrameDetalleFormFormularioRenta107.detalleformulariorenta107SessionBean.setlidFormularioRenta107Actual(this.idFormularioRenta107Actual);

			formulariorenta107SessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyFormularioRenta107(true);
			formulariorenta107SessionBean.setlIdFormularioRenta107ActualForeignKey(this.idFormularioRenta107Actual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}

		return "";
	}
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//FormularioRenta107SessionBean formulariorenta107SessionBean=new FormularioRenta107SessionBean();
		
		if(this.formulariorenta107SessionBean==null) {
			this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
		}
		
		this.formulariorenta107SessionBean.setsUltimaBusquedaFormularioRenta107(this.getsAccionBusqueda());
		this.formulariorenta107SessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.formulariorenta107SessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
			formulariorenta107SessionBean.setid_ejercicio(this.getid_ejercicioFK_IdEjercicio());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			formulariorenta107SessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			formulariorenta107SessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//FormularioRenta107SessionBean formulariorenta107SessionBean=new FormularioRenta107SessionBean();
		
		if(this.formulariorenta107SessionBean==null) {
			this.formulariorenta107SessionBean=new FormularioRenta107SessionBean();
		}
		
		if(this.formulariorenta107SessionBean.getsUltimaBusquedaFormularioRenta107()!=null&&!this.formulariorenta107SessionBean.getsUltimaBusquedaFormularioRenta107().equals("")) {
			this.setsAccionBusqueda(formulariorenta107SessionBean.getsUltimaBusquedaFormularioRenta107());
			this.setiNumeroPaginacion(formulariorenta107SessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(formulariorenta107SessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEjercicio")) {
				this.setid_ejercicioFK_IdEjercicio(formulariorenta107SessionBean.getid_ejercicio());
				formulariorenta107SessionBean.setid_ejercicio(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(formulariorenta107SessionBean.getid_empleado());
				formulariorenta107SessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(formulariorenta107SessionBean.getid_empresa());
				formulariorenta107SessionBean.setid_empresa(-1L);
			}
		}
		
		this.formulariorenta107SessionBean.setsUltimaBusquedaFormularioRenta107("");
		this.formulariorenta107SessionBean.setiNumeroPaginacion(FormularioRenta107ConstantesFunciones.INUMEROPAGINACION);
		this.formulariorenta107SessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaFormularioRenta107(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioFormularioRenta107() {
		this.updateBorderResaltarBusquedasFormularioFormularioRenta107();
		this.updateVisibilidadBusquedasFormularioFormularioRenta107();
		this.updateHabilitarBusquedasFormularioFormularioRenta107();
	}
	
	public void updateBorderResaltarBusquedasFormularioFormularioRenta107() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasFormularioRenta107.getComponents().length>0) {
	

		if(this.formulariorenta107ConstantesFunciones.resaltarFK_IdEmpleadoFormularioRenta107!=null) {
			index= this.jTabbedPaneBusquedasFormularioRenta107.indexOfComponent(this.jPanelFK_IdEmpleadoFormularioRenta107);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta107.getComponent(index);
				jPanel.setBorder(this.formulariorenta107ConstantesFunciones.resaltarFK_IdEmpleadoFormularioRenta107);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioFormularioRenta107() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasFormularioRenta107.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormularioRenta107.indexOfComponent(this.jPanelFK_IdEmpleadoFormularioRenta107);
			jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta107.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.formulariorenta107ConstantesFunciones.mostrarFK_IdEmpleadoFormularioRenta107);
			if(!this.formulariorenta107ConstantesFunciones.mostrarFK_IdEmpleadoFormularioRenta107 && index>-1) {
				this.jTabbedPaneBusquedasFormularioRenta107.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioFormularioRenta107() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasFormularioRenta107.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasFormularioRenta107.indexOfComponent(this.jPanelFK_IdEmpleadoFormularioRenta107);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta107.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.formulariorenta107ConstantesFunciones.activarFK_IdEmpleadoFormularioRenta107);
				this.jTabbedPaneBusquedasFormularioRenta107.setEnabledAt(index,this.formulariorenta107ConstantesFunciones.activarFK_IdEmpleadoFormularioRenta107);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaFormularioRenta107(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasFormularioRenta107.indexOfComponent(this.jPanelFK_IdEmpleadoFormularioRenta107);

			this.jTabbedPaneBusquedasFormularioRenta107.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasFormularioRenta107.getComponent(index);

			this.formulariorenta107ConstantesFunciones.setResaltarFK_IdEmpleadoFormularioRenta107(resaltar);

			jPanel.setBorder(this.formulariorenta107ConstantesFunciones.resaltarFK_IdEmpleadoFormularioRenta107);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarFormularioRenta107.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioFormularioRenta107() throws Exception {

		if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioFormularioRenta107();
		this.updateVisibilidadResaltarControlesFormularioFormularioRenta107();
		this.updateHabilitarResaltarControlesFormularioFormularioRenta107();
		
	}
	
	public void updateBorderResaltarControlesFormularioFormularioRenta107() throws Exception {
		if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.formulariorenta107ConstantesFunciones.resaltaridFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107!=null) {this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.setBorder(this.formulariorenta107ConstantesFunciones.resaltaridFormularioRenta107);}
		if(this.formulariorenta107ConstantesFunciones.resaltarid_empresaFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107!=null) {this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.setBorder(this.formulariorenta107ConstantesFunciones.resaltarid_empresaFormularioRenta107);}
		if(this.formulariorenta107ConstantesFunciones.resaltarid_empleadoFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107!=null) {this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.setBorder(this.formulariorenta107ConstantesFunciones.resaltarid_empleadoFormularioRenta107);}
		if(this.formulariorenta107ConstantesFunciones.resaltarid_ejercicioFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107!=null) {this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.setBorder(this.formulariorenta107ConstantesFunciones.resaltarid_ejercicioFormularioRenta107);}
		if(this.formulariorenta107ConstantesFunciones.resaltarnumero_pre_impresoFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107!=null) {this.jInternalFrameDetalleFormFormularioRenta107.jTextFieldnumero_pre_impresoFormularioRenta107.setBorder(this.formulariorenta107ConstantesFunciones.resaltarnumero_pre_impresoFormularioRenta107);}
		if(this.formulariorenta107ConstantesFunciones.resaltarfecha_entregaFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107!=null) {this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_entregaFormularioRenta107.setBorder(this.formulariorenta107ConstantesFunciones.resaltarfecha_entregaFormularioRenta107);}
		if(this.formulariorenta107ConstantesFunciones.resaltarfecha_generacionFormularioRenta107!=null && this.jInternalFrameDetalleFormFormularioRenta107!=null) {this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_generacionFormularioRenta107.setBorder(this.formulariorenta107ConstantesFunciones.resaltarfecha_generacionFormularioRenta107);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioFormularioRenta107() throws Exception {		
		if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
	
		//this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostraridFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jPanelidFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostraridFormularioRenta107);
		//this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarid_empresaFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jPanelid_empresaFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarid_empresaFormularioRenta107);
		//this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarid_empleadoFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jPanelid_empleadoFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarid_empleadoFormularioRenta107);
		//this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarid_ejercicioFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jPanelid_ejercicioFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarid_ejercicioFormularioRenta107);
		//this.jInternalFrameDetalleFormFormularioRenta107.jTextFieldnumero_pre_impresoFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarnumero_pre_impresoFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jPanelnumero_pre_impresoFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarnumero_pre_impresoFormularioRenta107);
		//this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_entregaFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarfecha_entregaFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jPanelfecha_entregaFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarfecha_entregaFormularioRenta107);
		//this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_generacionFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarfecha_generacionFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jPanelfecha_generacionFormularioRenta107.setVisible(this.formulariorenta107ConstantesFunciones.mostrarfecha_generacionFormularioRenta107);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioFormularioRenta107() throws Exception {
		if(this.jInternalFrameDetalleFormFormularioRenta107==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormFormularioRenta107!=null) {
	
		this.jInternalFrameDetalleFormFormularioRenta107.jLabelidFormularioRenta107.setEnabled(this.formulariorenta107ConstantesFunciones.activaridFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empresaFormularioRenta107.setEnabled(this.formulariorenta107ConstantesFunciones.activarid_empresaFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_empleadoFormularioRenta107.setEnabled(this.formulariorenta107ConstantesFunciones.activarid_empleadoFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jComboBoxid_ejercicioFormularioRenta107.setEnabled(this.formulariorenta107ConstantesFunciones.activarid_ejercicioFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jTextFieldnumero_pre_impresoFormularioRenta107.setEnabled(this.formulariorenta107ConstantesFunciones.activarnumero_pre_impresoFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_entregaFormularioRenta107.setEnabled(this.formulariorenta107ConstantesFunciones.activarfecha_entregaFormularioRenta107);
		this.jInternalFrameDetalleFormFormularioRenta107.jDateChooserfecha_generacionFormularioRenta107.setEnabled(this.formulariorenta107ConstantesFunciones.activarfecha_generacionFormularioRenta107);
		}
	}
	
		
}