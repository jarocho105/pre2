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

import com.bydan.erp.nomina.util.EmpleadoEMailConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoEMailParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoEMailParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EmpleadoEMailBean;
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
public class EmpleadoEMailBeanSwingJInternalFrame extends EmpleadoEMailJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoEMailBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoEMail> empleadoemailValidator = new ClassValidator<EmpleadoEMail>(EmpleadoEMail.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoEMail empleadoemail;	
	public EmpleadoEMail empleadoemailAux;
	public EmpleadoEMail empleadoemailAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoEMail empleadoemailTotales;
	public Long idEmpleadoEMailActual;
	public Long iIdNuevoEmpleadoEMail=0L;
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

		
	
	
	
	//BUSQUEDA INTERNA FK
	public Long idEmpleadoActual=0L;

	public Long getidEmpleadoActual() {
		return idEmpleadoActual;
	}

	public void setidEmpleadoActual(Long idEmpleadoActual) {
		this.idEmpleadoActual= idEmpleadoActual;
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
	
	public Boolean isPermisoTodoEmpleadoEMail;
	public Boolean isPermisoNuevoEmpleadoEMail;
	public Boolean isPermisoActualizarEmpleadoEMail;
	public Boolean isPermisoActualizarOriginalEmpleadoEMail;
	public Boolean isPermisoEliminarEmpleadoEMail;
	public Boolean isPermisoGuardarCambiosEmpleadoEMail;
	public Boolean isPermisoConsultaEmpleadoEMail;
	public Boolean isPermisoBusquedaEmpleadoEMail;
	public Boolean isPermisoReporteEmpleadoEMail;
	public Boolean isPermisoPaginacionMedioEmpleadoEMail;
	public Boolean isPermisoPaginacionAltoEmpleadoEMail;
	public Boolean isPermisoPaginacionTodoEmpleadoEMail;
	public Boolean isPermisoCopiarEmpleadoEMail;
	public Boolean isPermisoVerFormEmpleadoEMail;
	public Boolean isPermisoDuplicarEmpleadoEMail;
	public Boolean isPermisoOrdenEmpleadoEMail;
	
	
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
	
	public EmpleadoEMailParameterReturnGeneral empleadoemailReturnGeneral;
	public EmpleadoEMailParameterReturnGeneral empleadoemailParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoEMail=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoEMail=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoEMailSessionBeanAdditional empleadoemailSessionBeanAdditional=null;
	
	public EmpleadoEMailSessionBeanAdditional getEmpleadoEMailSessionBeanAdditional() {
		return this.empleadoemailSessionBeanAdditional;
	}
	
	public void setEmpleadoEMailSessionBeanAdditional(EmpleadoEMailSessionBeanAdditional empleadoemailSessionBeanAdditional) {
		try {
			this.empleadoemailSessionBeanAdditional=empleadoemailSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoEMailBeanSwingJInternalFrameAdditional empleadoemailBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoEMailBeanSwingJInternalFrame
	
	public EmpleadoEMailBeanSwingJInternalFrameAdditional getEmpleadoEMailBeanSwingJInternalFrameAdditional() {
		return this.empleadoemailBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoEMailBeanSwingJInternalFrameAdditional(EmpleadoEMailBeanSwingJInternalFrameAdditional empleadoemailBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadoemailBeanSwingJInternalFrameAdditional=empleadoemailBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoEMailLogic empleadoemailLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoEMail empleadoemailBean;
	public EmpleadoEMailConstantesFunciones empleadoemailConstantesFunciones;
	//public EmpleadoEMailParameterReturnGeneral empleadoemailReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoEMail> empleadoemails;	
	//public List<EmpleadoEMail> empleadoemailsEliminados;
	//public List<EmpleadoEMail> empleadoemailsAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoEMail=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoEMail=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoEMail=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoEMail=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoEMail=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoEMail=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoEMail=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoEMail=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoEMail=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoEMail=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoEMail=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoEmpleadoEMail() {
		return this.iIdNuevoEmpleadoEMail;
	}

	public void setiIdNuevoEmpleadoEMail(Long iIdNuevoEmpleadoEMail) {
		this.iIdNuevoEmpleadoEMail = iIdNuevoEmpleadoEMail;
	}
	
	public Long getidEmpleadoEMailActual() {
		return this.idEmpleadoEMailActual;
	}

	public void setidEmpleadoEMailActual(Long idEmpleadoEMailActual) {
		this.idEmpleadoEMailActual = idEmpleadoEMailActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoEMail getempleadoemail() {
		return this.empleadoemail;
	}

	public void setempleadoemail(EmpleadoEMail empleadoemail) {
		this.empleadoemail = empleadoemail;
	}
	
	public EmpleadoEMail getempleadoemailAux() {
		return this.empleadoemailAux;
	}

	public void setempleadoemailAux(EmpleadoEMail empleadoemailAux) {
		this.empleadoemailAux = empleadoemailAux;
	}				
	
	public EmpleadoEMail getempleadoemailAnterior() {
		return this.empleadoemailAnterior;
	}

	public void setempleadoemailAnterior(EmpleadoEMail empleadoemailAnterior) {
		this.empleadoemailAnterior = empleadoemailAnterior;
	}	
	
	public EmpleadoEMail getempleadoemailTotales() {
		return this.empleadoemailTotales;
	}

	public void setempleadoemailTotales(EmpleadoEMail empleadoemailTotales) {
		this.empleadoemailTotales = empleadoemailTotales;
	}	
	
	public EmpleadoEMail getempleadoemailBean() {
		return this.empleadoemailBean;
	}

	public void setempleadoemailBean(EmpleadoEMail empleadoemailBean) {
		this.empleadoemailBean = empleadoemailBean;
	}	
	
	public EmpleadoEMailParameterReturnGeneral getempleadoemailReturnGeneral() {
		return this.empleadoemailReturnGeneral;
	}

	public void setempleadoemailReturnGeneral(EmpleadoEMailParameterReturnGeneral empleadoemailReturnGeneral) {
		this.empleadoemailReturnGeneral = empleadoemailReturnGeneral;
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
	
	
	public EmpleadoEMailLogic getEmpleadoEMailLogic()	{		
		return empleadoemailLogic;
	}

	public void setEmpleadoEMailLogic(EmpleadoEMailLogic empleadoemailLogic) {
		this.empleadoemailLogic = empleadoemailLogic;
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
	
	public Boolean getIsEsNuevoEmpleadoEMail() {
		return isEsNuevoEmpleadoEMail;
	}

	public void setIsEsNuevoEmpleadoEMail(Boolean isEsNuevoEmpleadoEMail) {
		this.isEsNuevoEmpleadoEMail = isEsNuevoEmpleadoEMail;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoEMail() {
		return esParaAccionDesdeFormularioEmpleadoEMail;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoEMail(Boolean esParaAccionDesdeFormularioEmpleadoEMail) {
		this.esParaAccionDesdeFormularioEmpleadoEMail = esParaAccionDesdeFormularioEmpleadoEMail;
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

			if(this.empleadoemailSessionBean==null) {
				this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
			}

			if(!this.empleadoemailSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empleadoemailSessionBean.getlidEmpresaActual());
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

			if(this.empleadoemailSessionBean==null) {
				this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
			}

			if(!this.empleadoemailSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(empleadoemailSessionBean.getlidEmpleadoActual());
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

					if(this.empleadoemail!=null) {
						this.empleadoemail.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
						this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoEMail.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoEMailGenerico)throws Exception
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
				jComboBoxid_empresaEmpleadoEMailGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoEMailGenerico!=null && jComboBoxid_empresaEmpleadoEMailGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoEMailGenerico.setSelectedIndex(0);
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

					if(this.empleadoemail!=null) {
						this.empleadoemail.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
						this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoEMail.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoEMailGenerico)throws Exception
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
				jComboBoxid_empleadoEmpleadoEMailGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoEMailGenerico!=null && jComboBoxid_empleadoEmpleadoEMailGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoEMailGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoEMail empleadoemail,JComboBox jComboBoxid_empresaEmpleadoEMailGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoEMailGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoEMailGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadoemail.setid_empresa(empresaAux.getId());
				empleadoemail.setempresa_descripcion(EmpleadoEMailConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadoemail.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoEMail empleadoemail,JComboBox jComboBoxid_empleadoEmpleadoEMailGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoEMailGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoEMailGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadoemail.setid_empleado(empleadoAux.getId());
				empleadoemail.setempleado_descripcion(EmpleadoEMailConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadoemail.setEmpleado(empleadoAux);			}
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

					if(!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { 
							this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { 
					}

					if(!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { 
							this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { 
					}

					if(!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.addItem(empleado);
							}
						}

						if(!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
							this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
							this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
							this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
							this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoEMail() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoEMailConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoEMail(this.empleadoemailLogic.getEmpleadoEMails());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoEMailConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoEMail(this.empleadoemails);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadoemailLogic.setEmpleadoEMails(this.empleadoemails);
			empleadoemailLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpleadoEMailParameterReturnGeneral getEmpleadoEMailParameterGeneral() {
		return this.empleadoemailParameterGeneral;
	}
	
	public void setEmpleadoEMailParameterGeneral(EmpleadoEMailParameterReturnGeneral empleadoemailParameterGeneral) {
		this.empleadoemailParameterGeneral = empleadoemailParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpleadoEMail() {
		return isPermisoTodoEmpleadoEMail;
	}

	public void setIsPermisoTodoEmpleadoEMail(Boolean isPermisoTodoEmpleadoEMail) {
		this.isPermisoTodoEmpleadoEMail = isPermisoTodoEmpleadoEMail;
	}

	public Boolean getIsPermisoNuevoEmpleadoEMail() {
		return isPermisoNuevoEmpleadoEMail;
	}

	public void setIsPermisoNuevoEmpleadoEMail(Boolean isPermisoNuevoEmpleadoEMail) {
		this.isPermisoNuevoEmpleadoEMail = isPermisoNuevoEmpleadoEMail;
	}

	public Boolean getIsPermisoActualizarEmpleadoEMail() {
		return isPermisoActualizarEmpleadoEMail;
	}

	public void setIsPermisoActualizarEmpleadoEMail(Boolean isPermisoActualizarEmpleadoEMail) {
		this.isPermisoActualizarEmpleadoEMail = isPermisoActualizarEmpleadoEMail;
	}

	public Boolean getIsPermisoEliminarEmpleadoEMail() {
		return isPermisoEliminarEmpleadoEMail;
	}

	public void setIsPermisoEliminarEmpleadoEMail(Boolean isPermisoEliminarEmpleadoEMail) {
		this.isPermisoEliminarEmpleadoEMail = isPermisoEliminarEmpleadoEMail;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoEMail() {
		return isPermisoGuardarCambiosEmpleadoEMail;
	}

	public void setIsPermisoGuardarCambiosEmpleadoEMail(Boolean isPermisoGuardarCambiosEmpleadoEMail) {
		this.isPermisoGuardarCambiosEmpleadoEMail = isPermisoGuardarCambiosEmpleadoEMail;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoEMail() {
		return isPermisoConsultaEmpleadoEMail;
	}

	public void setIsPermisoConsultaEmpleadoEMail(Boolean isPermisoConsultaEmpleadoEMail) {
		this.isPermisoConsultaEmpleadoEMail = isPermisoConsultaEmpleadoEMail;
	}

	public Boolean getIsPermisoBusquedaEmpleadoEMail() {
		return isPermisoBusquedaEmpleadoEMail;
	}

	public void setIsPermisoBusquedaEmpleadoEMail(Boolean isPermisoBusquedaEmpleadoEMail) {
		this.isPermisoBusquedaEmpleadoEMail = isPermisoBusquedaEmpleadoEMail;
	}

	public Boolean getIsPermisoReporteEmpleadoEMail() {
		return isPermisoReporteEmpleadoEMail;
	}

	public void setIsPermisoReporteEmpleadoEMail(Boolean isPermisoReporteEmpleadoEMail) {
		this.isPermisoReporteEmpleadoEMail = isPermisoReporteEmpleadoEMail;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoEMail() {
		return isPermisoPaginacionMedioEmpleadoEMail;
	}

	public void setIsPermisoPaginacionMedioEmpleadoEMail(Boolean isPermisoPaginacionMedioEmpleadoEMail) {
		this.isPermisoPaginacionMedioEmpleadoEMail = isPermisoPaginacionMedioEmpleadoEMail;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoEMail() {
		return isPermisoPaginacionTodoEmpleadoEMail;
	}

	public void setIsPermisoPaginacionTodoEmpleadoEMail(Boolean isPermisoPaginacionTodoEmpleadoEMail) {
		this.isPermisoPaginacionTodoEmpleadoEMail = isPermisoPaginacionTodoEmpleadoEMail;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoEMail() {
		return isPermisoPaginacionAltoEmpleadoEMail;
	}

	public void setIsPermisoPaginacionAltoEmpleadoEMail(Boolean isPermisoPaginacionAltoEmpleadoEMail) {
		this.isPermisoPaginacionAltoEmpleadoEMail = isPermisoPaginacionAltoEmpleadoEMail;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoEMail() {
		return isPermisoCopiarEmpleadoEMail;
	}

	public void setIsPermisoCopiarEmpleadoEMail(Boolean isPermisoCopiarEmpleadoEMail) {
		this.isPermisoCopiarEmpleadoEMail = isPermisoCopiarEmpleadoEMail;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoEMail() {
		return isPermisoVerFormEmpleadoEMail;
	}

	public void setIsPermisoVerFormEmpleadoEMail(Boolean isPermisoVerFormEmpleadoEMail) {
		this.isPermisoVerFormEmpleadoEMail = isPermisoVerFormEmpleadoEMail;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoEMail() {
		return isPermisoDuplicarEmpleadoEMail;
	}

	public void setIsPermisoDuplicarEmpleadoEMail(Boolean isPermisoDuplicarEmpleadoEMail) {
		this.isPermisoDuplicarEmpleadoEMail = isPermisoDuplicarEmpleadoEMail;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoEMail() {
		return isPermisoOrdenEmpleadoEMail;
	}

	public void setIsPermisoOrdenEmpleadoEMail(Boolean isPermisoOrdenEmpleadoEMail) {
		this.isPermisoOrdenEmpleadoEMail = isPermisoOrdenEmpleadoEMail;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoEMail() {
		return isVisibilidadCeldaNuevoEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoEMail(Boolean isVisibilidadCeldaNuevoEmpleadoEMail) {
		this.isVisibilidadCeldaNuevoEmpleadoEMail = isVisibilidadCeldaNuevoEmpleadoEMail;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoEMail() {
		return isVisibilidadCeldaDuplicarEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoEMail(Boolean isVisibilidadCeldaDuplicarEmpleadoEMail) {
		this.isVisibilidadCeldaDuplicarEmpleadoEMail = isVisibilidadCeldaDuplicarEmpleadoEMail;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoEMail() {
		return isVisibilidadCeldaCopiarEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoEMail(Boolean isVisibilidadCeldaCopiarEmpleadoEMail) {
		this.isVisibilidadCeldaCopiarEmpleadoEMail = isVisibilidadCeldaCopiarEmpleadoEMail;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoEMail() {
		return isVisibilidadCeldaVerFormEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoEMail(Boolean isVisibilidadCeldaVerFormEmpleadoEMail) {
		this.isVisibilidadCeldaVerFormEmpleadoEMail = isVisibilidadCeldaVerFormEmpleadoEMail;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoEMail() {
		return isVisibilidadCeldaOrdenEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoEMail(Boolean isVisibilidadCeldaOrdenEmpleadoEMail) {
		this.isVisibilidadCeldaOrdenEmpleadoEMail = isVisibilidadCeldaOrdenEmpleadoEMail;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoEMail() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoEMail(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoEMail) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail = isVisibilidadCeldaNuevoRelacionesEmpleadoEMail;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoEMail() {
		return isVisibilidadCeldaModificarEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoEMail(Boolean isVisibilidadCeldaModificarEmpleadoEMail) {
		this.isVisibilidadCeldaModificarEmpleadoEMail = isVisibilidadCeldaModificarEmpleadoEMail;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoEMail() {
		return isVisibilidadCeldaActualizarEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoEMail(Boolean isVisibilidadCeldaActualizarEmpleadoEMail) {
		this.isVisibilidadCeldaActualizarEmpleadoEMail = isVisibilidadCeldaActualizarEmpleadoEMail;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoEMail() {
		return isVisibilidadCeldaEliminarEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoEMail(Boolean isVisibilidadCeldaEliminarEmpleadoEMail) {
		this.isVisibilidadCeldaEliminarEmpleadoEMail = isVisibilidadCeldaEliminarEmpleadoEMail;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoEMail() {
		return isVisibilidadCeldaCancelarEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoEMail(Boolean isVisibilidadCeldaCancelarEmpleadoEMail) {
		this.isVisibilidadCeldaCancelarEmpleadoEMail = isVisibilidadCeldaCancelarEmpleadoEMail;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoEMail() {
		return isVisibilidadCeldaGuardarEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoEMail(Boolean isVisibilidadCeldaGuardarEmpleadoEMail) {
		this.isVisibilidadCeldaGuardarEmpleadoEMail = isVisibilidadCeldaGuardarEmpleadoEMail;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoEMail() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoEMail;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoEMail(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoEMail) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail = isVisibilidadCeldaGuardarCambiosEmpleadoEMail;
	}
		
	public EmpleadoEMailSessionBean getempleadoemailSessionBean() {
		return this.empleadoemailSessionBean;
	}
	
	public void setempleadoemailSessionBean(EmpleadoEMailSessionBean empleadoemailSessionBean) {
		this.empleadoemailSessionBean=empleadoemailSessionBean;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(EmpleadoEMail empleadoemail)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadoemail,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadoemail,null);
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
	
	public void bugActualizarReferenciaActual(EmpleadoEMail empleadoemail,EmpleadoEMail empleadoemailAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoEMail(empleadoemail);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadoemailAux.setId(empleadoemail.getId());
		empleadoemailAux.setVersionRow(empleadoemail.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoEMail();
		
			int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadoemailValidator.getInvalidValues(this.empleadoemail);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadoemailLogic.setDatosCliente(datosCliente);
			empleadoemailLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadoemailAux=new  EmpleadoEMail();
				
				empleadoemailAux.setIsNew(true);
				empleadoemailAux.setIsChanged(true);
				
				empleadoemailAux.setEmpleadoEMailOriginal(this.empleadoemail);
				
				empleadoemailAux.setId(this.empleadoemail.getId());	
				empleadoemailAux.setVersionRow(this.empleadoemail.getVersionRow());	
				empleadoemailAux.setid_empresa(this.empleadoemail.getid_empresa());	
				empleadoemailAux.setid_empleado(this.empleadoemail.getid_empleado());	
				empleadoemailAux.sete_mail(this.empleadoemail.gete_mail());	
				empleadoemailAux.setdescripcion(this.empleadoemail.getdescripcion());	
				empleadoemailAux.setesta_activo(this.empleadoemail.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoemailSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoemailSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadoemailAux,empleadoemailLogic.getEmpleadoEMails());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoemailAux,empleadoemails);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadoemailSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoemailSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoemailLogic.saveEmpleadoEMails();//WithConnection
						//empleadoemailLogic.getSetVersionRowEmpleadoEMails();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoemail,empleadoemailAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoEMail();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoemailSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoemailLogic.saveEmpleadoEMailRelaciones(empleadoemailAux);//WithConnection
								//empleadoemailLogic.getSetVersionRowEmpleadoEMails();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoemail,empleadoemailAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoemailSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoemailSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoemailAux,empleadoemailLogic.getEmpleadoEMails());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoemailAux,empleadoemails);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoemail,empleadoemailAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadoemailAux=new  EmpleadoEMail();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadoemailSessionBean.getEsGuardarRelacionado() 
					|| (this.empleadoemailSessionBean.getEsGuardarRelacionado() && this.empleadoemail.getId()>=0)) {
						
					empleadoemailAux.setIsNew(false);
				}
				
				empleadoemailAux.setIsDeleted(false);
			
				empleadoemailAux.setId(this.empleadoemail.getId());	
				empleadoemailAux.setVersionRow(this.empleadoemail.getVersionRow());	
				empleadoemailAux.setid_empresa(this.empleadoemail.getid_empresa());	
				empleadoemailAux.setid_empleado(this.empleadoemail.getid_empleado());	
				empleadoemailAux.sete_mail(this.empleadoemail.gete_mail());	
				empleadoemailAux.setdescripcion(this.empleadoemail.getdescripcion());	
				empleadoemailAux.setesta_activo(this.empleadoemail.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoemailAux,empleadoemailLogic.getEmpleadoEMails());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoemailAux,empleadoemails);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadoemailSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoemailSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoemailLogic.saveEmpleadoEMails();//WithConnection
						//empleadoemailLogic.getSetVersionRowEmpleadoEMails();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoemail,empleadoemailAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoEMail();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoemailSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoemailLogic.saveEmpleadoEMailRelaciones(empleadoemailAux);//WithConnection
								//empleadoemailLogic.getSetVersionRowEmpleadoEMails();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoemail,empleadoemailAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoemailSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoemailSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoemailAux,empleadoemailLogic.getEmpleadoEMails());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoemailAux,empleadoemails);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoemail,empleadoemailAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadoemailAux=new  EmpleadoEMail();
				
				empleadoemailAux.setIsNew(false);
				empleadoemailAux.setIsChanged(false);
				
				empleadoemailAux.setIsDeleted(true);
				
				empleadoemailAux.setId(this.empleadoemail.getId());	
				empleadoemailAux.setVersionRow(this.empleadoemail.getVersionRow());	
				empleadoemailAux.setid_empresa(this.empleadoemail.getid_empresa());	
				empleadoemailAux.setid_empleado(this.empleadoemail.getid_empleado());	
				empleadoemailAux.sete_mail(this.empleadoemail.gete_mail());	
				empleadoemailAux.setdescripcion(this.empleadoemail.getdescripcion());	
				empleadoemailAux.setesta_activo(this.empleadoemail.getesta_activo());	
				
				if(this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadoemailAux.getId()>=0) {	
						this.empleadoemailsEliminados.add(empleadoemailAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadoemailAux,empleadoemailLogic.getEmpleadoEMails());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoemailAux,empleadoemails);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadoemailSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoemailSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoemailLogic.saveEmpleadoEMails();//WithConnection
						//empleadoemailLogic.getSetVersionRowEmpleadoEMails();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoemailSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoemailLogic.saveEmpleadoEMailRelaciones(empleadoemailAux);//WithConnection
								//empleadoemailLogic.getSetVersionRowEmpleadoEMails();//WithConnection
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
							if(this.empleadoemailSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadoemailSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadoemailAux,empleadoemailLogic.getEmpleadoEMails());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadoemailAux,empleadoemails);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.getEmpleadoEMails().addAll(this.empleadoemailsEliminados);
					
					empleadoemailLogic.saveEmpleadoEMails();//WithConnection
					//empleadoemailLogic.getSetVersionRowEmpleadoEMails();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoEMail();
				
				this.empleadoemailsEliminados= new ArrayList<EmpleadoEMail>();		
			}
			
			if(this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Email GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Email",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadoemail=empleadoemailAux;
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
      		//this.finishProcessEmpleadoEMail();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoEMail empleadoemailLocal) throws Exception {
		
		if(this.empleadoemailSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoEMail empleadoemailLocal) throws Exception {	
		if(this.empleadoemailSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadoemailLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadoemailLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoEMailActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadoemailValidator.getInvalidValues(this.empleadoemail);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoEMail empleadoemail,List<EmpleadoEMail> empleadoemails) throws Exception {
		try	{		
			EmpleadoEMailConstantesFunciones.actualizarLista(empleadoemail,empleadoemails,this.empleadoemailSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoEMail empleadoemail,List<EmpleadoEMail> empleadoemails) throws Exception {
		try	{			
			EmpleadoEMailConstantesFunciones.actualizarSelectedLista(empleadoemail,empleadoemails);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoEMail> empleadoemailsLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadoemailsLocal=this.empleadoemailLogic.getEmpleadoEMails();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadoemailsLocal=this.empleadoemails;
			}
			//ARCHITECTURE
		
			for(EmpleadoEMail empleadoemailLocal:empleadoemailsLocal) {
				if(this.permiteMantenimiento(empleadoemailLocal) && empleadoemailLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpleadoEMailConstantesFunciones.getEmpleadoEMailLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoEMailConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEMail.jLabelid_empresaEmpleadoEMail,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEMailConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEMail.jLabelid_empleadoEmpleadoEMail,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEMailConstantesFunciones.EMAIL)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEMail.jLabele_mailEmpleadoEMail,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEMailConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEMail.jLabeldescripcionEmpleadoEMail,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoEMailConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEMail.jLabelesta_activoEmpleadoEMail,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEMail.jLabelid_empresaEmpleadoEMail,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEMail.jLabelid_empleadoEmpleadoEMail,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEMail.jLabele_mailEmpleadoEMail,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEMail.jLabeldescripcionEmpleadoEMail,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoEMail.jLabelesta_activoEmpleadoEMail,"");
		
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
		this.iIdNuevoEmpleadoEMail--;	
		
		
		this.empleadoemailAux=new EmpleadoEMail();
		
		this.empleadoemailAux.setId(this.iIdNuevoEmpleadoEMail);
		this.empleadoemailAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoemailLogic.getEmpleadoEMails().add(this.empleadoemailAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadoemails.add(this.empleadoemailAux);
		}
		//ARCHITECTURE
		
		this.empleadoemail=this.empleadoemailAux;
		
		if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoEMail(this.empleadoemail);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEMail(this.empleadoemail);
		}
				
		//this.setDefaultControlesEmpleadoEMail();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoEMail();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoEMail();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoEMail();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoEMail(this.empleadoemailBean,this.empleadoemail,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoEMailConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadoemailSessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoEMailConstantesFunciones.getClassesRelationshipsOfEmpleadoEMail(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadoemailReturnGeneral=empleadoemailLogic.procesarEventosEmpleadoEMailsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoemailLogic.getEmpleadoEMails(),this.empleadoemail,this.empleadoemailParameterGeneral,this.isEsNuevoEmpleadoEMail,classes);//this.empleadoemailLogic.getEmpleadoEMail()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoEMail(this.empleadoemailReturnGeneral,this.empleadoemailBean,false);
		
		if(this.empleadoemailReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEMail(this.empleadoemailReturnGeneral.getEmpleadoEMail());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoEMail(this.empleadoemailReturnGeneral.getEmpleadoEMail());
		}
		
		if(this.empleadoemailReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoEMail(this.empleadoemailReturnGeneral.getEmpleadoEMail(),classes);//this.empleadoemailBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoEMail();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoEMail();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoEMail(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoEMail(false);
						
			if(empleadoemailSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoEMail();
			}
			
			this.actualizarVisualTableDatosEmpleadoEMail();
			
			this.jTableDatosEmpleadoEMail.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEMail(), this.getIndiceNuevoEmpleadoEMail());
			
			this.seleccionarFilaTablaEmpleadoEMailActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoEMail("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoEMail(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreae_mailEmpleadoEMail.setEnabled(isHabilitar && this.empleadoemailConstantesFunciones.activare_mailEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreadescripcionEmpleadoEMail.setEnabled(isHabilitar && this.empleadoemailConstantesFunciones.activardescripcionEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxesta_activoEmpleadoEMail.setEnabled(isHabilitar && this.empleadoemailConstantesFunciones.activaresta_activoEmpleadoEMail);	
		//
		this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.setEnabled(isHabilitar && this.empleadoemailConstantesFunciones.activarid_empresaEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.setEnabled(isHabilitar && this.empleadoemailConstantesFunciones.activarid_empleadoEmpleadoEMail);
	};
	
	public void setDefaultControlesEmpleadoEMail() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoEMail(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadoemailSessionBean.setConGuardarRelaciones(true);			
			this.empleadoemailSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoEMail.jTabbedPaneRelacionesEmpleadoEMail.setVisible(true);
			
					
		} else {
			//this.empleadoemailSessionBean.setConGuardarRelaciones(false);			
			this.empleadoemailSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoEMail.jTabbedPaneRelacionesEmpleadoEMail.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoEMail() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEMail empleadoemailAux:this.empleadoemailLogic.getEmpleadoEMails()) {
				if(empleadoemailAux.getId().equals(this.iIdNuevoEmpleadoEMail)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEMail empleadoemailAux:this.empleadoemails) {
				if(empleadoemailAux.getId().equals(this.iIdNuevoEmpleadoEMail)) {
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
	
	public int getIndiceActualEmpleadoEMail(EmpleadoEMail empleadoemail,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEMail empleadoemailAux:this.empleadoemailLogic.getEmpleadoEMails()) {
				if(empleadoemailAux.getId().equals(empleadoemail.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEMail empleadoemailAux:this.empleadoemails) {
				if(empleadoemailAux.getId().equals(empleadoemail.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpleadoEMail(EmpleadoEMail empleadoemailOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEMail empleadoemailAux:this.empleadoemailLogic.getEmpleadoEMails()) {
				if(empleadoemailAux.getEmpleadoEMailOriginal().getId().equals(empleadoemailOriginal.getId())) {
					existe=true;
					empleadoemailOriginal.setId(empleadoemailAux.getId());
					empleadoemailOriginal.setVersionRow(empleadoemailAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEMail empleadoemailAux:this.empleadoemails) {
				if(empleadoemailAux.getEmpleadoEMailOriginal().getId().equals(empleadoemailOriginal.getId())) {
					existe=true;
					empleadoemailOriginal.setId(empleadoemailAux.getId());
					empleadoemailOriginal.setVersionRow(empleadoemailAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoEMail(Boolean esParaCancelar) throws Exception {
		empleadoemailsAux=new ArrayList<EmpleadoEMail>();
		empleadoemailAux=new EmpleadoEMail();
		
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoEMail empleadoemailAux:this.empleadoemailLogic.getEmpleadoEMails()) {
					if(empleadoemailAux.getId()<0) {
						empleadoemailsAux.add(empleadoemailAux);
					}		
				}
				this.iIdNuevoEmpleadoEMail=0L;
				this.empleadoemailLogic.getEmpleadoEMails().removeAll(empleadoemailsAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEMail empleadoemailAux:this.empleadoemails) {
					if(empleadoemailAux.getId()<0) {
						empleadoemailsAux.add(empleadoemailAux);
					}		
				}
				this.iIdNuevoEmpleadoEMail=0L;
				this.empleadoemails.removeAll(empleadoemailsAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoEMail 
					&& this.empleadoemailLogic.getEmpleadoEMails().size()>0
					) {
					empleadoemailAux=this.empleadoemailLogic.getEmpleadoEMails().get(this.empleadoemailLogic.getEmpleadoEMails().size() - 1);
				
					if(empleadoemailAux.getId()<0) {
						this.empleadoemailLogic.getEmpleadoEMails().remove(empleadoemailAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoEMail && this.empleadoemails.size()>0) {
					empleadoemailAux=this.empleadoemails.get(this.empleadoemails.size() - 1);
				
					if(empleadoemailAux.getId()<0) {
						this.empleadoemails.remove(empleadoemailAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoEMail(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadoemail.getId()<0) {
				this.empleadoemailLogic.getEmpleadoEMails().remove(this.empleadoemail);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadoemail.getId()<0) {
				this.empleadoemails.remove(this.empleadoemail);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoEMail(List<EmpleadoEMail> empleadoemailsAux) throws Exception {
		EmpleadoEMailConstantesFunciones.setEstadosInicialesEmpleadoEMail(empleadoemailsAux);
	}
	
	public void setEstadosInicialesEmpleadoEMail(EmpleadoEMail empleadoemailAux) throws Exception {
		EmpleadoEMailConstantesFunciones.setEstadosInicialesEmpleadoEMail(empleadoemailAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoEMailActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoEMailActual()) {
				if(!this.isEsNuevoEmpleadoEMail) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoEMail=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoEMailActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Email ?", "MANTENIMIENTO DE Empleado Email", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoEMail empleadoemail) throws Exception {
		EmpleadoEMailConstantesFunciones.seleccionarAsignar(this.empleadoemail,empleadoemail);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoEMail=this.isPermisoActualizarOriginalEmpleadoEMail;
			
			
			this.seleccionarAsignar(empleadoemail);
			
			

			idEmpleadoActual=empleadoemail.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoEMailConstantesFunciones.quitarEspaciosEmpleadoEMail(this.empleadoemail,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoEMail("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadoemailSessionBean.setsFuncionBusquedaRapida(this.empleadoemailSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	
	//BUSQUEDA INTERNA FK
	public void seleccionarEmpleadoActual() throws Exception {
		try	{
			Empleado empleadoAux=new Empleado();

			if(this.idEmpleadoActual != null && this.idEmpleadoActual>0) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoLogic.getEntityWithConnection(this.idEmpleadoActual);
					empleadoAux= empleadoLogic.getEmpleado();
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE

				empleadosForeignKey=new ArrayList<Empleado>();
				empleadosForeignKey.add(empleadoAux);
			}

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEmpleadoEMail) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoEMail(esParaCancelar);				
				this.cancelarNuevoEmpleadoEMail(esParaCancelar);								
			}
			
			this.empleadoemail=new EmpleadoEMail();
			
			this.inicializarEmpleadoEMail();
			
			this.actualizarEstadoCeldasBotonesEmpleadoEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoEMail() throws Exception {
		try {
			EmpleadoEMailConstantesFunciones.inicializarEmpleadoEMail(this.empleadoemail);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadoemailLogic.getEmpleadoEMails().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoEMails(String sAccionBusqueda,List<EmpleadoEMail> empleadoemailsParaReportes) throws Exception {
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
					sPathReporteFinal="EmpleadoEMail"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoEMailMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoEMailMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoEMail"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empleado Emails");		
		parameters.put("busquedapor", EmpleadoEMailConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoEMail=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoEMailConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoEMailConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoEMail=new JRBeanArrayDataSource(EmpleadoEMailJInternalFrame.TraerEmpleadoEMailBeans(empleadoemailsParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoEMail);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoEMailConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoEMailConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoEMailBean.TraerEmpleadoEMailBeans(empleadoemailsParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpleadoEMails(sAccionBusqueda,sTipoArchivoReporte,empleadoemailsParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoEMails(sAccionBusqueda,sTipoArchivoReporte,empleadoemailsParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoEMailActionPerformed(null);
					//this.generarExcelReporteEmpleadoEMails(sAccionBusqueda,sTipoArchivoReporte,empleadoemailsParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoEMails(sAccionBusqueda,sTipoArchivoReporte,empleadoemailsParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoEMails(sAccionBusqueda,sTipoArchivoReporte,empleadoemailsParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoEMails(sAccionBusqueda,sTipoArchivoReporte,empleadoemailsParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoEMails(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoEMail> empleadoemailsParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoemail";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoEMails");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoEMail("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoEMail empleadoemail : empleadoemailsParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoEMailConstantesFunciones.generarExcelReporteDataEmpleadoEMail("NORMAL",row,workbook,empleadoemail,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Email",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoEMail(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoEMailConstantesFunciones.generarExcelReporteHeaderEmpleadoEMail(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoEMails(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoEMail> empleadoemailsParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoemail_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoEMails");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoEMail empleadoemail : empleadoemailsParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoEMailConstantesFunciones.getEmpleadoEMailDescripcion(empleadoemail));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoemail.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoemail.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEMailConstantesFunciones.LABEL_EMAIL))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_EMAIL);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoemail.gete_mail());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoemail.getdescripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(empleadoemail.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Email",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoEMails(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoEMail> empleadoemailsParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoEMail> empleadoemailsRespaldo=null;
		
		classes=EmpleadoEMailConstantesFunciones.getClassesRelationshipsOfEmpleadoEMail(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadoemailLogic.setDatosCliente(this.datosCliente);
		this.empleadoemailLogic.setDatosDeep(this.datosDeep);
		this.empleadoemailLogic.setIsConDeep(true);
		
		empleadoemailsRespaldo=this.empleadoemailLogic.getEmpleadoEMails();
		
		this.empleadoemailLogic.setEmpleadoEMails(empleadoemailsParaReportes);	
		this.empleadoemailLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadoemailsParaReportes=this.empleadoemailLogic.getEmpleadoEMails();
		this.empleadoemailLogic.setEmpleadoEMails(empleadoemailsRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoemail_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoEMails");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoEMail("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoEMail empleadoemail : empleadoemailsParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoEMail("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoEMailConstantesFunciones.generarExcelReporteDataEmpleadoEMail("NORMAL",row,workbook,empleadoemail,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoEMailConstantesFunciones.getEmpleadoEMailDescripcion(empleadoemail));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Email",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoEMail() throws Exception {		
		this.startProcessEmpleadoEMail(true);
	}
	
	public void startProcessEmpleadoEMail(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoEMail ,this.jPanelParametrosReportesEmpleadoEMail, this.jScrollPanelDatosEmpleadoEMail,this.jPanelPaginacionEmpleadoEMail, this.jScrollPanelDatosEdicionEmpleadoEMail, this.jPanelAccionesEmpleadoEMail,this.jPanelAccionesFormularioEmpleadoEMail,this.jmenuBarEmpleadoEMail,this.jmenuBarDetalleEmpleadoEMail,this.jTtoolBarEmpleadoEMail,this.jTtoolBarDetalleEmpleadoEMail);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoEMail=this.jTabbedPaneBusquedasEmpleadoEMail; 
		
		final JPanel jPanelParametrosReportesEmpleadoEMail=this.jPanelParametrosReportesEmpleadoEMail;
		//final JScrollPane jScrollPanelDatosEmpleadoEMail=this.jScrollPanelDatosEmpleadoEMail;
		final JTable jTableDatosEmpleadoEMail=this.jTableDatosEmpleadoEMail;		
		final JPanel jPanelPaginacionEmpleadoEMail=this.jPanelPaginacionEmpleadoEMail;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoEMail=this.jScrollPanelDatosEdicionEmpleadoEMail;
		final JPanel jPanelAccionesEmpleadoEMail=this.jPanelAccionesEmpleadoEMail;
		
		JPanel jPanelCamposAuxiliarEmpleadoEMail=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoEMail=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			jPanelCamposAuxiliarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jPanelCamposEmpleadoEMail;
			jPanelAccionesFormularioAuxiliarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jPanelAccionesFormularioEmpleadoEMail;
		}
		
		final JPanel jPanelCamposEmpleadoEMail=jPanelCamposAuxiliarEmpleadoEMail;
		final JPanel jPanelAccionesFormularioEmpleadoEMail=jPanelAccionesFormularioAuxiliarEmpleadoEMail;
		
		
		final JMenuBar jmenuBarEmpleadoEMail=this.jmenuBarEmpleadoEMail;
		final JToolBar jTtoolBarEmpleadoEMail=this.jTtoolBarEmpleadoEMail;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoEMail=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoEMail=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			jmenuBarDetalleAuxiliarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jmenuBarDetalleEmpleadoEMail;
			jTtoolBarDetalleAuxiliarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jTtoolBarDetalleEmpleadoEMail;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoEMail=jmenuBarDetalleAuxiliarEmpleadoEMail;
		final JToolBar jTtoolBarDetalleEmpleadoEMail=jTtoolBarDetalleAuxiliarEmpleadoEMail;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoEMail;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoEMail;
			processRunnable.jTableDatos=jTableDatosEmpleadoEMail;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoEMail;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoEMail;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoEMail;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoEMail;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoEMail;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoEMail;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoEMail;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoEMail;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoEMail ,jPanelParametrosReportesEmpleadoEMail,jTableDatosEmpleadoEMail, /*jScrollPanelDatosEmpleadoEMail,*/jPanelCamposEmpleadoEMail,jPanelPaginacionEmpleadoEMail, /*jScrollPanelDatosEdicionEmpleadoEMail,*/ jPanelAccionesEmpleadoEMail,jPanelAccionesFormularioEmpleadoEMail,jmenuBarEmpleadoEMail,jmenuBarDetalleEmpleadoEMail,jTtoolBarEmpleadoEMail,jTtoolBarDetalleEmpleadoEMail);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoEMail ,jPanelParametrosReportesEmpleadoEMail, jScrollPanelDatosEmpleadoEMail,jPanelPaginacionEmpleadoEMail, jScrollPanelDatosEdicionEmpleadoEMail, jPanelAccionesEmpleadoEMail,jPanelAccionesFormularioEmpleadoEMail,jmenuBarEmpleadoEMail,jmenuBarDetalleEmpleadoEMail,jTtoolBarEmpleadoEMail,jTtoolBarDetalleEmpleadoEMail);
						
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
	
	public void finishProcessEmpleadoEMail() {// throws Exception 
		this.finishProcessEmpleadoEMail(true);
	}
	
	public void finishProcessEmpleadoEMail(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoEMail ,this.jPanelParametrosReportesEmpleadoEMail, this.jScrollPanelDatosEmpleadoEMail,this.jPanelPaginacionEmpleadoEMail, this.jScrollPanelDatosEdicionEmpleadoEMail, this.jPanelAccionesEmpleadoEMail,this.jPanelAccionesFormularioEmpleadoEMail,this.jmenuBarEmpleadoEMail,this.jmenuBarDetalleEmpleadoEMail,this.jTtoolBarEmpleadoEMail,this.jTtoolBarDetalleEmpleadoEMail);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoEMail=this.jTabbedPaneBusquedasEmpleadoEMail; 
		
		final JPanel jPanelParametrosReportesEmpleadoEMail=this.jPanelParametrosReportesEmpleadoEMail;
		//final JScrollPane jScrollPanelDatosEmpleadoEMail=this.jScrollPanelDatosEmpleadoEMail;
		final JTable jTableDatosEmpleadoEMail=this.jTableDatosEmpleadoEMail;		
		final JPanel jPanelPaginacionEmpleadoEMail=this.jPanelPaginacionEmpleadoEMail;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoEMail=this.jScrollPanelDatosEdicionEmpleadoEMail;
		final JPanel jPanelAccionesEmpleadoEMail=this.jPanelAccionesEmpleadoEMail;
		
		JPanel jPanelCamposAuxiliarEmpleadoEMail=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoEMail=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			jPanelCamposAuxiliarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jPanelCamposEmpleadoEMail;
			jPanelAccionesFormularioAuxiliarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jPanelAccionesFormularioEmpleadoEMail;
		}
		
		final JPanel jPanelCamposEmpleadoEMail=jPanelCamposAuxiliarEmpleadoEMail;
		final JPanel jPanelAccionesFormularioEmpleadoEMail=jPanelAccionesFormularioAuxiliarEmpleadoEMail;
		
		
		final JMenuBar jmenuBarEmpleadoEMail=this.jmenuBarEmpleadoEMail;		
		final JToolBar jTtoolBarEmpleadoEMail=this.jTtoolBarEmpleadoEMail;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoEMail=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoEMail=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			jmenuBarDetalleAuxiliarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jmenuBarDetalleEmpleadoEMail;
			jTtoolBarDetalleAuxiliarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jTtoolBarDetalleEmpleadoEMail;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoEMail=jmenuBarDetalleAuxiliarEmpleadoEMail;
		final JToolBar jTtoolBarDetalleEmpleadoEMail=jTtoolBarDetalleAuxiliarEmpleadoEMail;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoEMail;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoEMail;
			processRunnable.jTableDatos=jTableDatosEmpleadoEMail;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoEMail;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoEMail;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoEMail;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoEMail;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoEMail;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoEMail;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoEMail;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoEMail;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoEMail ,jPanelParametrosReportesEmpleadoEMail, jTableDatosEmpleadoEMail,/*jScrollPanelDatosEmpleadoEMail,*/jPanelCamposEmpleadoEMail,jPanelPaginacionEmpleadoEMail, /*jScrollPanelDatosEdicionEmpleadoEMail,*/ jPanelAccionesEmpleadoEMail,jPanelAccionesFormularioEmpleadoEMail,jmenuBarEmpleadoEMail,jmenuBarDetalleEmpleadoEMail,jTtoolBarEmpleadoEMail,jTtoolBarDetalleEmpleadoEMail));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoEMail(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoEMail(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoEMail(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoEMail(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoEMail,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoEMail,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoEMail(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoEMail,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoEMail,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadoemailConstantesFunciones.getsFinalQueryEmpleadoEMail();
		String  finalQueryPaginacionTodos=this.empleadoemailConstantesFunciones.getsFinalQueryEmpleadoEMail();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoEMailConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoEMail(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoEMailConstantesFunciones.getArrayColumnasGlobalesEmpleadoEMail(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoEMailConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadoemailsEliminados= new ArrayList<EmpleadoEMail>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoEMail();
		
				///*EmpleadoEMailSessionBean*/this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
			
			if(this.empleadoemailSessionBean==null) {
				this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
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
					this.iNumeroPaginacion=EmpleadoEMailConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoEMailConstantesFunciones.getClassesForeignKeysOfEmpleadoEMail(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadoemail."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadoemailsAux= new ArrayList<EmpleadoEMail>();
			
				
			empleadoemailLogic.setDatosCliente(this.datosCliente);
			empleadoemailLogic.setDatosDeep(this.datosDeep);
			empleadoemailLogic.setIsConDeep(true);
			
			
			empleadoemailLogic.getEmpleadoEMailDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadoemailLogic.getTodosEmpleadoEMails(finalQueryGlobal,pagination);
					
					//empleadoemailLogic.getTodosEmpleadoEMailsWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadoemailLogic.getEmpleadoEMails()==null|| empleadoemailLogic.getEmpleadoEMails().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoemailsAux= new ArrayList<EmpleadoEMail>();
							empleadoemailsAux.addAll(empleadoemailLogic.getEmpleadoEMails());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoemailsAux= new ArrayList<EmpleadoEMail>();
							empleadoemailsAux.addAll(empleadoemails);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoemailLogic.getTodosEmpleadoEMails(finalQueryGlobal+"",this.pagination);												
							
							//empleadoemailLogic.getTodosEmpleadoEMailsWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoEMails("Todos",empleadoemailLogic.getEmpleadoEMails() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoemailLogic.setEmpleadoEMails(new ArrayList<EmpleadoEMail>());					
							empleadoemailLogic.getEmpleadoEMails().addAll(empleadoemailsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoemails=new ArrayList<EmpleadoEMail>();
							empleadoemails.addAll(empleadoemailsAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoEMail=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoEMail=this.idActual;
				
				} else if(this.idEmpleadoEMailActual!=null && this.idEmpleadoEMailActual!=0L) {
					idEmpleadoEMail=idEmpleadoEMailActual;
				}
				
					
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndicePorId(idEmpleadoEMail);
				
				this.empleadoemails=new ArrayList<EmpleadoEMail>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadoemailLogic.getEntity(idEmpleadoEMail);
					
					//empleadoemailLogic.getEntityWithConnection(idEmpleadoEMail);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoemailLogic.setEmpleadoEMails(new ArrayList<EmpleadoEMail>());
					empleadoemailLogic.getEmpleadoEMails().add(empleadoemailLogic.getEmpleadoEMail());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoemails=new ArrayList<EmpleadoEMail>();
					this.empleadoemails.add(empleadoemail);
				}
				
				if(empleadoemailLogic.getEmpleadoEMail()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoemailLogic.getEmpleadoEMailsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoemailLogic.getEmpleadoEMails()==null||empleadoemailLogic.getEmpleadoEMails().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoemails==null|| empleadoemails.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoemailsAux=new ArrayList<EmpleadoEMail>();
						empleadoemailsAux.addAll(empleadoemailLogic.getEmpleadoEMails());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoemailsAux=new ArrayList<EmpleadoEMail>();
							empleadoemailsAux.addAll(empleadoemails);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoemailLogic.getEmpleadoEMailsFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoEMails("FK_IdEmpleado",empleadoemailLogic.getEmpleadoEMails());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoEMails("FK_IdEmpleado",empleadoemails);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoemailLogic.setEmpleadoEMails(new ArrayList<EmpleadoEMail>());
						empleadoemailLogic.getEmpleadoEMails().addAll(empleadoemailsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoemails=new ArrayList<EmpleadoEMail>();
							empleadoemails.addAll(empleadoemailsAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoemailLogic.getEmpleadoEMailsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoemailLogic.getEmpleadoEMails()==null||empleadoemailLogic.getEmpleadoEMails().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoemails==null|| empleadoemails.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoemailsAux=new ArrayList<EmpleadoEMail>();
						empleadoemailsAux.addAll(empleadoemailLogic.getEmpleadoEMails());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoemailsAux=new ArrayList<EmpleadoEMail>();
							empleadoemailsAux.addAll(empleadoemails);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoemailLogic.getEmpleadoEMailsFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoEMailConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoEMails("FK_IdEmpresa",empleadoemailLogic.getEmpleadoEMails());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoEMails("FK_IdEmpresa",empleadoemails);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoemailLogic.setEmpleadoEMails(new ArrayList<EmpleadoEMail>());
						empleadoemailLogic.getEmpleadoEMails().addAll(empleadoemailsAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoemails=new ArrayList<EmpleadoEMail>();
							empleadoemails.addAll(empleadoemailsAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoEMail();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoEMail();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoemailLogic.getEmpleadoEMails().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoemails.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoemailLogic.getEmpleadoEMails().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoemails.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoEMail empleadoemail) {
		Boolean permite=true;
		
		if(this.empleadoemail.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoEMailConstantesFunciones.getOrderByListaEmpleadoEMail();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoEMailConstantesFunciones.getOrderByListaEmpleadoEMail();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEMail empleadoemail:empleadoemailLogic.getEmpleadoEMails()) {
				if(empleadoemail.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoemailTotales=empleadoemail;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEMail empleadoemail:this.empleadoemails) {
				if(empleadoemail.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoemailTotales=empleadoemail;
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
			this.empleadoemailAux=new EmpleadoEMail();
			this.empleadoemailAux.setsType(Constantes2.S_TOTALES);
			this.empleadoemailAux.setIsNew(false);
			this.empleadoemailAux.setIsChanged(false);
			this.empleadoemailAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoEMailConstantesFunciones.TotalizarValoresFilaEmpleadoEMail(this.empleadoemailLogic.getEmpleadoEMails(),this.empleadoemailAux);
				
				this.empleadoemailLogic.getEmpleadoEMails().add(this.empleadoemailAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoEMailConstantesFunciones.TotalizarValoresFilaEmpleadoEMail(this.empleadoemails,this.empleadoemailAux);
				
				this.empleadoemails.add(this.empleadoemailAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadoemailTotales=new EmpleadoEMail();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoemailLogic.getEmpleadoEMails().remove(empleadoemailTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoemails.remove(empleadoemailTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadoemailTotales=new EmpleadoEMail();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoEMail empleadoemail:empleadoemailLogic.getEmpleadoEMails()) {
				if(empleadoemail.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoemailTotales=empleadoemail;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoEMailConstantesFunciones.TotalizarValoresFilaEmpleadoEMail(this.empleadoemailLogic.getEmpleadoEMails(),empleadoemailTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoEMail empleadoemail:this.empleadoemails) {
				if(empleadoemail.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoemailTotales=empleadoemail;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoEMailConstantesFunciones.TotalizarValoresFilaEmpleadoEMail(this.empleadoemails,empleadoemailTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoEMailsFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoEMailsFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoEMailsFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoemailLogic.getEmpleadoEMailsFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoEMailsFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoemailLogic.getEmpleadoEMailsFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosEmpleadoEMail() {
		this.isPermisoTodoEmpleadoEMail=false;
		this.isPermisoNuevoEmpleadoEMail=false;
		this.isPermisoActualizarEmpleadoEMail=false;
		this.isPermisoActualizarOriginalEmpleadoEMail=false;
		this.isPermisoEliminarEmpleadoEMail=false;
		this.isPermisoGuardarCambiosEmpleadoEMail=false;
		this.isPermisoConsultaEmpleadoEMail=false;
		this.isPermisoBusquedaEmpleadoEMail=false;
		this.isPermisoReporteEmpleadoEMail=false;		
		this.isPermisoOrdenEmpleadoEMail=false;		
		this.isPermisoPaginacionMedioEmpleadoEMail=false;		
		this.isPermisoPaginacionAltoEmpleadoEMail=false;
		this.isPermisoPaginacionTodoEmpleadoEMail=false;
		this.isPermisoCopiarEmpleadoEMail=false;		
		this.isPermisoVerFormEmpleadoEMail=false;		
		this.isPermisoDuplicarEmpleadoEMail=false;		
		this.isPermisoOrdenEmpleadoEMail=false;		
	}
	
	public void setPermisosUsuarioEmpleadoEMail(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoEMail=isPermiso;
		this.isPermisoNuevoEmpleadoEMail=isPermiso;
		this.isPermisoActualizarEmpleadoEMail=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoEMail=isPermiso;
		this.isPermisoEliminarEmpleadoEMail=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoEMail=isPermiso;
		this.isPermisoConsultaEmpleadoEMail=isPermiso;
		this.isPermisoBusquedaEmpleadoEMail=isPermiso;
		this.isPermisoReporteEmpleadoEMail=isPermiso;
		this.isPermisoOrdenEmpleadoEMail=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoEMail=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoEMail=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoEMail=isPermiso;		
		this.isPermisoCopiarEmpleadoEMail=isPermiso;		
		this.isPermisoVerFormEmpleadoEMail=isPermiso;		
		this.isPermisoDuplicarEmpleadoEMail=isPermiso;
		this.isPermisoOrdenEmpleadoEMail=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoEMail(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoEMail=isPermiso;
		this.isPermisoNuevoEmpleadoEMail=isPermiso;
		this.isPermisoActualizarEmpleadoEMail=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoEMail=isPermiso;
		this.isPermisoEliminarEmpleadoEMail=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoEMail=isPermiso;
		//this.isPermisoConsultaEmpleadoEMail=isPermiso;
		//this.isPermisoBusquedaEmpleadoEMail=isPermiso;
		//this.isPermisoReporteEmpleadoEMail=isPermiso;
		//this.isPermisoOrdenEmpleadoEMail=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoEMail=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoEMail=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoEMail=isPermiso;		
		//this.isPermisoCopiarEmpleadoEMail=isPermiso;		
		//this.isPermisoDuplicarEmpleadoEMail=isPermiso;
		//this.isPermisoOrdenEmpleadoEMail=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoEMailClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoEMailJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoEMail(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoEMailClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoEMailClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoEMailClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoEMailClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoEMail() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoEMailJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoEMailConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoEMail=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoEMail=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoEMail=this.isPermisoActualizarEmpleadoEMail;
			this.isPermisoEliminarEmpleadoEMail=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoEMail=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoEMail=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoEMail=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoEMail=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoEMail=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoEMail=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoEMail=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoEMail=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoEMail=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoEMail=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoEMail=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoEMail=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoEMail=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoEMail.setToolTipText(this.jTableDatosEmpleadoEMail.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoEMail(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoEMail(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoEMailJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpleadoEMailJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpleadoEMail() throws Exception {
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
	public void inicializarCombosForeignKeyEmpleadoEMailListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoEMailListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoEMailJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoEMailListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
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
	
	public void cargarCombosLoteForeignKeyEmpleadoEMailListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoEMailParameterReturnGeneral empleadoemailReturnGeneral=new EmpleadoEMailParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadoemailConstantesFunciones.cargarid_empresaEmpleadoEMail)
					 || (this.esRecargarFks && this.empleadoemailConstantesFunciones.cargarid_empresaEmpleadoEMail)) {

					if(!this.empleadoemailSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadoemailSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadoemailConstantesFunciones.cargarid_empleadoEmpleadoEMail)
					 || (this.esRecargarFks && this.empleadoemailConstantesFunciones.cargarid_empleadoEmpleadoEMail)) {

					if(!this.empleadoemailSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadoemailSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadoemailReturnGeneral=empleadoemailLogic.cargarCombosLoteForeignKeyEmpleadoEMail(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadoemailReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadoemailReturnGeneral.getempleadosForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoEMail()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadoemailSessionBean==null) {
				this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
			}

			if(!this.empleadoemailSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.empleadoemailSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
	
	public void initActionsCombosTodosForeignKeyEmpleadoEMail()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoEMail(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoEMail()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoEMail();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoEMail(EmpleadoEMail empleadoemail)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(empleadoemail.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoEMail(EmpleadoEMail empleadoemail,String sTipoEvento)throws Exception {	
		try {
			
			

				if(empleadoemail.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoEmpleadoEMail")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(empleadoemail.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoEMail()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.empleadoemailConstantesFunciones.getid_empleado(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoEMail()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoEMail()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoEMail()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoEMail()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoEMail()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoEMail(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoEMail()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail!=null && this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail!=null && this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	




	
	

	public EmpleadoEMailBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoEMailBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoEMailBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadoemailSessionBean=new EmpleadoEMailSessionBean(); 
		this.empleadoemailConstantesFunciones=new EmpleadoEMailConstantesFunciones(); 
		this.empleadoemailBean=new EmpleadoEMail();//(this.empleadoemailConstantesFunciones); 		
		this.empleadoemailReturnGeneral=new EmpleadoEMailParameterReturnGeneral(); 
		
		this.empleadoemailSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoemailSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoEMailBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoEMailBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoEMailBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoEMail(true);
			
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
			
			this.empleadoemailConstantesFunciones=new EmpleadoEMailConstantesFunciones(); 
			this.empleadoemailBean=new EmpleadoEMail();//this.empleadoemailConstantesFunciones); 			
			this.empleadoemailReturnGeneral=new EmpleadoEMailParameterReturnGeneral(); 
		
			EmpleadoEMailBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Email Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			
			
			this.empleadoemail=new EmpleadoEMail();
			this.empleadoemails = new ArrayList<EmpleadoEMail>();
			this.empleadoemailsAux = new ArrayList<EmpleadoEMail>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic=new EmpleadoEMailLogic();
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadoemailSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadoemailSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoEMail);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoEMail!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoEMail);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoEMail!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoEMail);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoEMail!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoEMail);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoEMail);
				this.jInternalFrameDetalleFormEmpleadoEMail.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoEMail.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoEMail!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoEMail);
					this.jInternalFrameReporteDinamicoEmpleadoEMail.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoEMail.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoEMail!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoEMail);
					this.jInternalFrameImportacionEmpleadoEMail.setVisible(false);
					this.jInternalFrameImportacionEmpleadoEMail.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoEMail!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoEMail);
					this.jInternalFrameOrderByEmpleadoEMail.setVisible(false);
					this.jInternalFrameOrderByEmpleadoEMail.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoEMailActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoEMailConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empleadoemailReturnGeneral=new EmpleadoEMailParameterReturnGeneral();
			
			this.empleadoemailParameterGeneral=new EmpleadoEMailParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadoemailLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpleadoEMailJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoEMailConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoemailSessionBean.getEsGuardarRelacionado(),this.empleadoemailSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoEMailConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoemailSessionBean.getEsGuardarRelacionado(),this.empleadoemailSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpleadoEMail=false;
			this.isVisibilidadCeldaDuplicarEmpleadoEMail=true;
			this.isVisibilidadCeldaCopiarEmpleadoEMail=true;
			this.isVisibilidadCeldaVerFormEmpleadoEMail=true;
			this.isVisibilidadCeldaOrdenEmpleadoEMail=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=false;
			this.isVisibilidadCeldaModificarEmpleadoEMail=false;
			this.isVisibilidadCeldaActualizarEmpleadoEMail=false;
			this.isVisibilidadCeldaEliminarEmpleadoEMail=false;
			this.isVisibilidadCeldaCancelarEmpleadoEMail=false;
			this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoEMail();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoEMail(false);
			
			this.setPermisosUsuarioEmpleadoEMail();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoemailSessionBean.getEsGuardarRelacionado() 
				|| (this.empleadoemailSessionBean.getEsGuardarRelacionado() && this.empleadoemailSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoEMailClasesRelacionadas();
			}
			
			if(this.empleadoemailSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoEMailClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoEMail();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoEMail();
			}
			
			if(!this.isPermisoBusquedaEmpleadoEMail) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoEMail,this.isPermisoPaginacionMedioEmpleadoEMail,this.isPermisoPaginacionTodoEmpleadoEMail);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoEMailConstantesFunciones.getTiposSeleccionarEmpleadoEMail());
				
				this.tiposColumnasSelect=EmpleadoEMailConstantesFunciones.getTiposSeleccionarEmpleadoEMail(true);
				
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
			//if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoEMail();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEmpleadoEMail(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEmpleadoEMail(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEMail() ;
			
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
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empleadoemailImplementable= (EmpleadoEMailImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoEMailConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadoemailImplementableHome= (EmpleadoEMailImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoEMailConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadoemails= new ArrayList<EmpleadoEMail>();
			this.empleadoemailsEliminados= new ArrayList<EmpleadoEMail>();
						
			this.isEsNuevoEmpleadoEMail=false;
			this.esParaAccionDesdeFormularioEmpleadoEMail=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoEMail(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoEMail();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoEMailBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoEMailConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoEMail("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoEMail(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoEMail();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoEMail();
			}
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoEMail.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoEMail.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoEMail.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoEMail(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoEMail: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoEMail() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoEMail")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoEMail.jTabbedPaneRelacionesEmpleadoEMail.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoEMail.jTabbedPaneRelacionesEmpleadoEMail.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoEMail();	
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
	
	public void cargarCombosForeignKeyEmpleadoEMail(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoEMail(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoEMail(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoEMailListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoEMail();
		
		this.cargarCombosFrameForeignKeyEmpleadoEMail();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoEMail();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoEMail();
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
	
	public void jButtonNuevoEmpleadoEMailActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadoemailSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
			
			if(jTableDatosEmpleadoEMail.getRowCount()>=1) {
				jTableDatosEmpleadoEMail.removeRowSelectionInterval(0, jTableDatosEmpleadoEMail.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoEMail=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoEMail(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoEMail(true);			
			//this.empleadoemail=new EmpleadoEMail();
			//this.empleadoemail.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoEMail(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEMail() ;
			
			if(EmpleadoEMailJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoEMail(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadoemail);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);				
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
			if(this.empleadoemailSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoEMail: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoEMailActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoEMail.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoEMail.getSelectedRows().length;			
			}
			
			empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoEMail--;			
				//EmpleadoEMail empleadoemailAux= new EmpleadoEMail();			
				//empleadoemailAux.setId(this.iIdNuevoEmpleadoEMail);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoEMail empleadoemailOrigen=new EmpleadoEMail();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoEMail empleadoemailOrigen : empleadoemailsSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadoemailOrigen =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoemailOrigen =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoEMail();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadoemail.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoEMail(empleadoemailOrigen,this.empleadoemail,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoemailLogic.getEmpleadoEMails().add(this.empleadoemailAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoemails.add(this.empleadoemailAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoEMail(false);
				
				this.jTableDatosEmpleadoEMail.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEMail(), this.getIndiceNuevoEmpleadoEMail());
				
				int iLastRow =  this.jTableDatosEmpleadoEMail.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoEMail.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoEMail.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoEMail(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();									
		
			EmpleadoEMail empleadoemailOrigen=new EmpleadoEMail();
			EmpleadoEMail empleadoemailDestino=new EmpleadoEMail();
				
			empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoEMail.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadoemailsSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoEMail.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoemailOrigen =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoemailOrigen =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoemailDestino =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoemailDestino =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadoemailOrigen =empleadoemailsSeleccionados.get(0);
				empleadoemailDestino =empleadoemailsSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoEMail(empleadoemailOrigen,empleadoemailDestino,true,false);
				
				empleadoemailDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoemailDestino,empleadoemailLogic.getEmpleadoEMails());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoemailDestino,empleadoemails);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoEMail(false);
				
				//this.jTableDatosEmpleadoEMail.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEMail(), this.getIndiceNuevoEmpleadoEMail());
				
				int iLastRow =  this.jTableDatosEmpleadoEMail.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoEMail.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoEMail.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoEMail(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoEMail.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoEMail.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoEMail.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoEMail.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoEMail.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoEMail();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoEMail();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoEMail();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoEMail();
			
			this.abrirFrameOrderByEmpleadoEMail();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoEMail();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoEMail(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoEMail);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoEMail.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoEMail.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoEMail.setSize(this.jInternalFrameDetalleFormEmpleadoEMail.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoEMail.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoEMail.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoEMail.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoEMail.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoEMail.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoEMail.jContentPaneDetalleEmpleadoEMail.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoEMail.jTabbedPaneRelacionesEmpleadoEMail.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoEMail.jContentPaneDetalleEmpleadoEMail.getWidth(),EmpleadoEMailConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoEMail.jTabbedPaneRelacionesEmpleadoEMail.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoEMail.jContentPaneDetalleEmpleadoEMail.getWidth(),EmpleadoEMailConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoEMail.jTabbedPaneRelacionesEmpleadoEMail.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoEMail.jContentPaneDetalleEmpleadoEMail.getWidth(),EmpleadoEMailConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoEMail.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoEMail.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoEMail() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoEMail==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoEMail=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEMail,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoEMail=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoEMail,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoEMail);
				this.jInternalFrameOrderByEmpleadoEMail.setVisible(false);
				this.jInternalFrameOrderByEmpleadoEMail.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoEMail.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoEMail"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoEMail();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoEMail() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoEMail==null) {
				
				this.jInternalFrameImportacionEmpleadoEMail=new ImportacionJInternalFrame(EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoEMail);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoEMail);
				this.jInternalFrameImportacionEmpleadoEMail.setVisible(false);
				this.jInternalFrameImportacionEmpleadoEMail.setSelected(false);


				this.jInternalFrameImportacionEmpleadoEMail.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoEMail"));
				this.jInternalFrameImportacionEmpleadoEMail.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoEMail"));
				this.jInternalFrameImportacionEmpleadoEMail.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoEMail"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoEMail() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoEMail==null) {
				this.jInternalFrameReporteDinamicoEmpleadoEMail=new ReporteDinamicoJInternalFrame(EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoEMail);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoEMail);
				this.jInternalFrameReporteDinamicoEmpleadoEMail.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoEMail.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoEMail.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoEMail"));
				this.jInternalFrameReporteDinamicoEmpleadoEMail.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoEMail"));
				this.jInternalFrameReporteDinamicoEmpleadoEMail.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoEMail"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoEMail();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoEMail() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoEMail);
			
	       	this.jInternalFrameDetalleFormEmpleadoEMail.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoEMail.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoEMail.dispose();
			//this.jInternalFrameDetalleFormEmpleadoEMail=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoEMail() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoEMail.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoEMail.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoEMail() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoEMail.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoEMail.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoEMail() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoEMail.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoEMail.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoEMail() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoEMail.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoEMail.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoEMail() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoEMail.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoEMail.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoEMail() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoEMail.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoEMail.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoEMail(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoEMail(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoEMail(true);
			//this.isEsNuevoEmpleadoEMail=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoEMail("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoEMail(false) ;
			
			if(empleadoemailSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoEMailJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoEMail(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEMail(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoEMailActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoEMail(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoEMail(true);
			//this.isEsNuevoEmpleadoEMail=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadoemail.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoEMail("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoEMail(false) ;
			
			if(EmpleadoEMailJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoEMail(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEMail(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.empleadoemailConstantesFunciones.cargarid_empleadoEmpleadoEMail) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingEmpleadoEMail(false,false);
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}

				this.setCombosCodigoDesdeBusquedaid_empleado (id);

				this.recargarComboTablaEmpleado(this.empleadosForeignKey);

			}
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMail,EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoEMail.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoEMail(false);
			
			//if(!this.isEsNuevoEmpleadoEMail) {								
				int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
				
			}
			
			if(this.permiteMantenimiento(this.empleadoemail)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoEMail=true;
					this.inicializarActualizarBindingTablaEmpleadoEMail(false);
					this.isEsNuevoEmpleadoEMail=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoEMail=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoEMail=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoEMail(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoEMail(false);
				
				this.habilitarDeshabilitarControlesEmpleadoEMail(false);
			
												
				
				if(EmpleadoEMailJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoEMail();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoEMailActionPerformed(evt,empleadoemailSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoEMail(this.empleadoemail,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoEMail.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadoemailSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadoemail.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				this.empleadoemail.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				this.empleadoemail.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadoemail)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoEMailModel) this.jTableDatosEmpleadoEMail.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoEMail=true;
				this.inicializarActualizarBindingTablaEmpleadoEMail(false);
				this.isEsNuevoEmpleadoEMail=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoEMail(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoEMail(false);
				
				this.habilitarDeshabilitarControlesEmpleadoEMail(false);
				
				
				
				if(EmpleadoEMailJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoEMail();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoEMail.getRowCount()>=1) {
				jTableDatosEmpleadoEMail.removeRowSelectionInterval(0, jTableDatosEmpleadoEMail.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoEMail(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoEMail(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoEMail(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoEMail(false) ;
			
			this.isEsNuevoEmpleadoEMail=false;
			
			if(EmpleadoEMailJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoEMail();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoEMail(false);
				
				//SI ES MANUAL
				if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoEMail();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoEMail--;			
			//EmpleadoEMail empleadoemailAux= new EmpleadoEMail();			
			//empleadoemailAux.setId(this.iIdNuevoEmpleadoEMail);
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoEMail();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
			
			this.empleadoemail.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadoemailLogic.getEmpleadoEMails().add(this.empleadoemailAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadoemails.add(this.empleadoemailAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoEMail(false);
			
			this.jTableDatosEmpleadoEMail.setRowSelectionInterval(this.getIndiceNuevoEmpleadoEMail(), this.getIndiceNuevoEmpleadoEMail());
			
			int iLastRow =  this.jTableDatosEmpleadoEMail.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoEMail.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoEMail.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoEMail(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoEMail(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEMail(false);
			
			//SI ES MANUAL
			if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoEMail();
			}
			
			//this.abrirFrameTreeEmpleadoEMail();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado EmailS ?", "MANTENIMIENTO DE Empleado Email", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoEMail.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoEMail();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadoemailReturnGeneral=empleadoemailLogic.procesarImportacionEmpleadoEMailsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadoemailParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoEMailReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoEMail.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoEMail.setFileImportacion(this.jInternalFrameImportacionEmpleadoEMail.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoEMail.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoEMail.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoEMail.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoEMail.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();		

		empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoEMailBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoEMailBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpleadoEMails("Todos",empleadoemailsSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Email",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEMailConstantesFunciones.LABEL_EMAIL:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ail_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ail_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ail_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ail_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_scripcion_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_scripcion_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_scripcion_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_scripcion_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_taActivo_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_taActivo_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_taActivo_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_taActivo_colx", iAnchoSum.toString());

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
		
		if(this.jInternalFrameReporteDinamicoEmpleadoEMail.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoria="e_mail";
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_EMAIL:
					sNombreCampoCategoriaValor="e_mail";
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_EMAIL:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"E Mail",sNombreCampoCategoria,sNombreCampoCategoriaValor,"e_mail");
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Descripcion",sNombreCampoCategoria,sNombreCampoCategoriaValor,"descripcion");
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Esta Activo",sNombreCampoCategoria,sNombreCampoCategoriaValor,"esta_activo");
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();		
		
		empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoemail";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpleadoEMails");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoEMail empleadoemail:empleadoemailsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoemail.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoEMail empleadoemail:empleadoemailsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoemail.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_EMAIL:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_EMAIL);
					iRow++;

					for(EmpleadoEMail empleadoemail:empleadoemailsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoemail.gete_mail());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(EmpleadoEMail empleadoemail:empleadoemailsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoemail.getdescripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(EmpleadoEMail empleadoemail:empleadoemailsSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoemail.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelEmpleadoEMail(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoEMail empleadoemailAux:empleadoemailsSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoEMail(empleadoemailAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Email",JOptionPane.INFORMATION_MESSAGE);
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
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEMail(false);
			
			//SI ES MANUAL
			if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoEMail();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEMail(false);
			
			//SI ES MANUAL
			if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoEMail();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoEMail(false);
			
			//SI ES MANUAL
			if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoEMail();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoEMail() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoEMail.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoEMail.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoEMail.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoEMail.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoEMail.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoEMail.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoEMail.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoEMail(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoEMail(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoEMail(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoEMail(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoEMail(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoEMail(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEMail(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoEMail(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoEMail() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoEMail();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoEMail(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoEMail();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEMail() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoEMail(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoEMail(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoEMail.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoEMail.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoEMail.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxPostAccionNuevoEmpleadoEMail.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxPostAccionSinCerrarEmpleadoEMail.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxPostAccionSinMensajeEmpleadoEMail.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoEMail.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoEMail.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoEMail.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
				this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxPostAccionNuevoEmpleadoEMail.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxPostAccionSinCerrarEmpleadoEMail.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxPostAccionSinMensajeEmpleadoEMail.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoEMail.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoEMail.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoEMail.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoEMail!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoEMail.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoEMail.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoEMail.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoEMail.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoEMail!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoEMail.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoEMail.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoEMail(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoEMail(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoEMail() throws Exception {
		try	{
			if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoEMail();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoEMail() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoEMail() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoEMail.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoEMail.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoEMail.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoEMail.addItem(reporte);
			}
			
			
			if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoEMail.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoEMail.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoEMail.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoEMail.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoEMail.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoEMail.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoEMail.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoEMail();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoEMail() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoEMail!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoEMail!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoEMail.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoEMail!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoEMail.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoEMail()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoEMail.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoEMail(Boolean esInicializar) throws Exception {				
		if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoEMail();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoEMail() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoEMail(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoEMail() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoEMailPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoEMailPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoEMailOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMailOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoEMailPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoEMailPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoEMail(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadoemailLogic.getEmpleadoEMails().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadoemails.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoEMail.setModel(new EmpleadoEMailModel(this.empleadoemailLogic.getEmpleadoEMails(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoEMail.setModel(new EmpleadoEMailModel(this.empleadoemails,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoEMail!=null && this.jInternalFrameOrderByEmpleadoEMail.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoEMail();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMail,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoEMailPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO,empleadoemailConstantesFunciones.resaltarSeleccionarEmpleadoEMail,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoEMailConstantesFunciones.SCLASSWEBTITULO,empleadoemailConstantesFunciones.resaltarSeleccionarEmpleadoEMail,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMail,EmpleadoEMailConstantesFunciones.LABEL_ID));

		if(this.empleadoemailConstantesFunciones.mostraridEmpleadoEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEMailConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoemailConstantesFunciones.resaltaridEmpleadoEMail,this.empleadoemailConstantesFunciones.activaridEmpleadoEMail,this,true,"idEmpleadoEMail","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoemailConstantesFunciones.resaltaridEmpleadoEMail,this.empleadoemailConstantesFunciones.activaridEmpleadoEMail,this,true,"idEmpleadoEMail","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMail,EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadoemailConstantesFunciones.mostrarid_empresaEmpleadoEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadoemailConstantesFunciones.resaltarid_empresaEmpleadoEMail,this,this.empleadoemailConstantesFunciones.activarid_empresaEmpleadoEMail));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadoemailConstantesFunciones.resaltarid_empresaEmpleadoEMail,this,this.empleadoemailConstantesFunciones.activarid_empresaEmpleadoEMail,false,"id_empresaEmpleadoEMail","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEMailPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMail,EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadoemailConstantesFunciones.mostrarid_empleadoEmpleadoEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoemailConstantesFunciones.resaltarid_empleadoEmpleadoEMail,this,this.empleadoemailConstantesFunciones.activarid_empleadoEmpleadoEMail));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoemailConstantesFunciones.resaltarid_empleadoEmpleadoEMail,this,this.empleadoemailConstantesFunciones.activarid_empleadoEmpleadoEMail,true,"id_empleadoEmpleadoEMail","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoEMailPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMail,EmpleadoEMailConstantesFunciones.LABEL_EMAIL));

		if(this.empleadoemailConstantesFunciones.mostrare_mailEmpleadoEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEMailConstantesFunciones.LABEL_EMAIL,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empleadoemailConstantesFunciones.resaltare_mailEmpleadoEMail,this.empleadoemailConstantesFunciones.activare_mailEmpleadoEMail,this,true,"e_mailEmpleadoEMail","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoemailConstantesFunciones.resaltare_mailEmpleadoEMail,this.empleadoemailConstantesFunciones.activare_mailEmpleadoEMail,this,true,"e_mailEmpleadoEMail","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEMailPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMail,EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION));

		if(this.empleadoemailConstantesFunciones.mostrardescripcionEmpleadoEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empleadoemailConstantesFunciones.resaltardescripcionEmpleadoEMail,this.empleadoemailConstantesFunciones.activardescripcionEmpleadoEMail,this,true,"descripcionEmpleadoEMail","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoemailConstantesFunciones.resaltardescripcionEmpleadoEMail,this.empleadoemailConstantesFunciones.activardescripcionEmpleadoEMail,this,true,"descripcionEmpleadoEMail","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoEMailPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMail,EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.empleadoemailConstantesFunciones.mostraresta_activoEmpleadoEMail && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.empleadoemailConstantesFunciones.resaltaresta_activoEmpleadoEMail,this.empleadoemailConstantesFunciones.activaresta_activoEmpleadoEMail));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.empleadoemailConstantesFunciones.resaltaresta_activoEmpleadoEMail,this.empleadoemailConstantesFunciones.activaresta_activoEmpleadoEMail,this,true,"esta_activoEmpleadoEMail","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoEMailPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoemailSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoemailSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoEMail.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoemailSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoemailSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoEMail.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadoemailSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadoemailSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoEMail.addColumn(tableColumn);
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
			
			this.jTableDatosEmpleadoEMail.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoEMail.moveColumn(this.jTableDatosEmpleadoEMail.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoEMail.moveColumn(this.jTableDatosEmpleadoEMail.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoEMail.moveColumn(this.jTableDatosEmpleadoEMail.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoEMail.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoEMail.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoEMail,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoEMail.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoEMail.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoEMail.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoEMail.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empleadoemailLogic.getEmpleadoEMails().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadoemails.size()-1;
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
		//this.jTableDatosEmpleadoEMail.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoEMail.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoEMail();
			
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
				
				//this.isEsNuevoEmpleadoEMail=false;
					
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
				if(this.empleadoemailSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoEMail==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoEMail.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoEMail.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadoemail.getsType().equals("DUPLICADO")
				   || this.empleadoemail.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoEMail=true;
				
				} else {
					this.isEsNuevoEmpleadoEMail=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
					if(this.empleadoemail.getId()>=0 && !this.empleadoemail.getIsNew()) {						
						this.isEsNuevoEmpleadoEMail=false;
						
					} else {
						this.isEsNuevoEmpleadoEMail=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoEMail(esRelaciones);						
				
				this.seleccionarEmpleadoEMail(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadoemail.getId()<0) {
					this.isEsNuevoEmpleadoEMail=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoEMail(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoEMail(evt,rowIndex);
				}	
				
				if(this.empleadoemailSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoEMail: " + this.dDif); 
					}
				}								
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoEMail(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadoemail)) {
					if(this.empleadoemail.getId()>0) {
						this.empleadoemail.setIsDeleted(true);
						
						this.empleadoemailsEliminados.add(this.empleadoemail);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoemailLogic.getEmpleadoEMails().remove(this.empleadoemail);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoemails.remove(this.empleadoemail);				
					}
					
					
					((EmpleadoEMailModel) this.jTableDatosEmpleadoEMail.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoEMail(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoEMail(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoEMail) {
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoEMail.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoEMail.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoEMail(this.empleadoemail);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadoemailConstantesFunciones.cargarid_empresaEmpleadoEMail || this.empleadoemailConstantesFunciones.event_dependid_empresaEmpleadoEMail) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadoemail.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoEMail(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadoemail.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadoemail.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadoemail.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.empleadoemailConstantesFunciones.cargarid_empleadoEmpleadoEMail || this.empleadoemailConstantesFunciones.event_dependid_empleadoEmpleadoEMail) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadoemail.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoEMail(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadoemail.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadoemail.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadoemail.getid_empleado(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoEMail("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoEMail(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoEMail() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoEMail(EmpleadoEMail empleadoemail) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoEMail(empleadoemail,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoEMail(EmpleadoEMail empleadoemail,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoEMail(empleadoemail);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoEMail(empleadoemail,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEMail(empleadoemail);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoEMail(EmpleadoEMail empleadoemail) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.setText(empleadoemail.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreae_mailEmpleadoEMail.setText(empleadoemail.gete_mail());
			this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreadescripcionEmpleadoEMail.setText(empleadoemail.getdescripcion());
			this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxesta_activoEmpleadoEMail.setSelected(empleadoemail.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoEMail empleadoemailLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadoemailLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoEMail empleadoemailLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadoemailLocal=this.empleadoemail;
			} else {
				empleadoemailLocal=this.empleadoemailAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadoemailLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoEMail(empleadoemailLocal,true);
					
					if(empleadoemailSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadoemailLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadoemailLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoEMail(EmpleadoEMail empleadoemail,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoEMail(empleadoemail,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(empleadoemail);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoEMail(EmpleadoEMail empleadoemail,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoEMail(empleadoemail,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoEMail(EmpleadoEMail empleadoemail,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.getText()==null || this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.getText()=="" || this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.setText("0");
			}

			if(conColumnasBase) {empleadoemail.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEMailConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEMail.jLabelIdEmpleadoEMail,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoemail.sete_mail(this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreae_mailEmpleadoEMail.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEMailConstantesFunciones.LABEL_EMAIL+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEMail.jLabele_mailEmpleadoEMail,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoemail.setdescripcion(this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreadescripcionEmpleadoEMail.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEMail.jLabeldescripcionEmpleadoEMail,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoemail.setesta_activo(this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxesta_activoEmpleadoEMail.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoEMail.jLabelesta_activoEmpleadoEMail,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoEMail(EmpleadoEMail empleadoemailBean,EmpleadoEMail empleadoemail,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && empleadoemailBean.getid_empleado()!=null && !empleadoemailBean.getid_empleado().equals(-1L))) {empleadoemail.setid_empleado(empleadoemailBean.getid_empleado());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoEMail(EmpleadoEMail empleadoemailOrigen,EmpleadoEMail empleadoemail,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoemailOrigen.getId()!=null && !empleadoemailOrigen.getId().equals(0L))) {empleadoemail.setId(empleadoemailOrigen.getId());}}
			if(conDefault || (!conDefault && empleadoemailOrigen.getid_empleado()!=null && !empleadoemailOrigen.getid_empleado().equals(-1L))) {empleadoemail.setid_empleado(empleadoemailOrigen.getid_empleado());}
			if(conDefault || (!conDefault && empleadoemailOrigen.gete_mail()!=null && !empleadoemailOrigen.gete_mail().equals(""))) {empleadoemail.sete_mail(empleadoemailOrigen.gete_mail());}
			if(conDefault || (!conDefault && empleadoemailOrigen.getdescripcion()!=null && !empleadoemailOrigen.getdescripcion().equals(""))) {empleadoemail.setdescripcion(empleadoemailOrigen.getdescripcion());}
			if(conDefault || (!conDefault && empleadoemailOrigen.getesta_activo()!=null && !empleadoemailOrigen.getesta_activo().equals(false))) {empleadoemail.setesta_activo(empleadoemailOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoEMail(EmpleadoEMail empleadoemail) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.setText(empleadoemail.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreae_mailEmpleadoEMail.setText(empleadoemail.gete_mail());
			this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreadescripcionEmpleadoEMail.setText(empleadoemail.getdescripcion());
			this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxesta_activoEmpleadoEMail.setSelected(empleadoemail.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoEMail(EmpleadoEMailBean empleadoemailBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.setText(empleadoemailBean.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreae_mailEmpleadoEMail.setText(empleadoemailBean.gete_mail());
			this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreadescripcionEmpleadoEMail.setText(empleadoemailBean.getdescripcion());
			this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxesta_activoEmpleadoEMail.setSelected(empleadoemailBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoEMail(EmpleadoEMailParameterReturnGeneral empleadoemailReturnGeneral,EmpleadoEMailBean empleadoemailBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoEMail empleadoemailLocal=new EmpleadoEMail();
			
			empleadoemailLocal=empleadoemailReturnGeneral.getEmpleadoEMail();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoemailLocal.getId()!=null && !empleadoemailLocal.getId().equals(0L))) {empleadoemailBean.setId(empleadoemailLocal.getId());}}
			if(conDefault || (!conDefault && empleadoemailLocal.getid_empleado()!=null && !empleadoemailLocal.getid_empleado().equals(-1L))) {empleadoemailBean.setid_empleado(empleadoemailLocal.getid_empleado());}
			if(conDefault || (!conDefault && empleadoemailLocal.gete_mail()!=null && !empleadoemailLocal.gete_mail().equals(""))) {empleadoemailBean.sete_mail(empleadoemailLocal.gete_mail());}
			if(conDefault || (!conDefault && empleadoemailLocal.getdescripcion()!=null && !empleadoemailLocal.getdescripcion().equals(""))) {empleadoemailBean.setdescripcion(empleadoemailLocal.getdescripcion());}
			if(conDefault || (!conDefault && empleadoemailLocal.getesta_activo()!=null && !empleadoemailLocal.getesta_activo().equals(false))) {empleadoemailBean.setesta_activo(empleadoemailLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoEMailGenerico(Long idEmpleadoEMailSeleccionado,JComboBox jComboBoxEmpleadoEMail,List<EmpleadoEMail> empleadoemailsLocal)throws Exception {
		try {
			EmpleadoEMail  empleadoemailTemp=null;

			for(EmpleadoEMail empleadoemailAux:empleadoemailsLocal) {
				if(empleadoemailAux.getId()!=null && empleadoemailAux.getId().equals(idEmpleadoEMailSeleccionado)) {
					empleadoemailTemp=empleadoemailAux;
					break;
				}
			}

			jComboBoxEmpleadoEMail.setSelectedItem(empleadoemailTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoEMailGenerico(JComboBox jComboBoxEmpleadoEMail,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoEMail.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoEMail.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoEMail.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoEMail.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoEMail.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoEMail.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoemail=(EmpleadoEMail) empleadoemailLogic.getEmpleadoEMails().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoemail =(EmpleadoEMail) empleadoemails.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadoemail.getIsNew() && !empleadoemail.getIsChanged() && !empleadoemail.getIsDeleted()) {
				sDescripcion=empleadoemail.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoemail.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadoemail.getIsNew() && !empleadoemail.getIsChanged() && !empleadoemail.getIsDeleted()) {
				sDescripcion=empleadoemail.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoemail.getempleado_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoEMail empleadoemailRow=new EmpleadoEMail();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoemailRow=(EmpleadoEMail) empleadoemailLogic.getEmpleadoEMails().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoemailRow=(EmpleadoEMail) empleadoemails.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoEMail(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoEMail.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEMail && this.isPermisoNuevoEmpleadoEMail));			
			this.jButtonDuplicarEmpleadoEMail.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoEMail && this.isPermisoDuplicarEmpleadoEMail));			
			this.jButtonCopiarEmpleadoEMail.setVisible((this.isVisibilidadCeldaCopiarEmpleadoEMail && this.isPermisoCopiarEmpleadoEMail));
			this.jButtonVerFormEmpleadoEMail.setVisible((this.isVisibilidadCeldaVerFormEmpleadoEMail && this.isPermisoVerFormEmpleadoEMail));
			
			this.jButtonAbrirOrderByEmpleadoEMail.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEMail && this.isPermisoOrdenEmpleadoEMail));			
			
			this.jButtonNuevoRelacionesEmpleadoEMail.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail && this.isPermisoNuevoEmpleadoEMail));			
			this.jButtonNuevoGuardarCambiosEmpleadoEMail.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEMail && this.isPermisoNuevoEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail));
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonModificarEmpleadoEMail.setVisible((this.isVisibilidadCeldaModificarEmpleadoEMail && this.isPermisoActualizarEmpleadoEMail));	
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonActualizarEmpleadoEMail.setVisible((this.isVisibilidadCeldaActualizarEmpleadoEMail && this.isPermisoActualizarEmpleadoEMail));	
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonEliminarEmpleadoEMail.setVisible((this.isVisibilidadCeldaEliminarEmpleadoEMail && this.isPermisoEliminarEmpleadoEMail));
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonCancelarEmpleadoEMail.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEMail);							
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosEmpleadoEMail.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoEMail.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEMail && this.isPermisoNuevoEmpleadoEMail));						
			this.jButtonDuplicarToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoEMail && this.isPermisoDuplicarEmpleadoEMail));						
			this.jButtonCopiarToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaCopiarEmpleadoEMail && this.isPermisoCopiarEmpleadoEMail));			
			this.jButtonVerFormToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaVerFormEmpleadoEMail && this.isPermisoVerFormEmpleadoEMail));			
			this.jButtonAbrirOrderByToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEMail && this.isPermisoOrdenEmpleadoEMail));
			this.jButtonNuevoRelacionesToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail && this.isPermisoNuevoEmpleadoEMail));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEMail && this.isPermisoNuevoEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail));			
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonModificarToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaModificarEmpleadoEMail && this.isPermisoActualizarEmpleadoEMail));	
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonActualizarToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaActualizarEmpleadoEMail  && this.isPermisoActualizarEmpleadoEMail));	
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonEliminarToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaEliminarEmpleadoEMail && this.isPermisoEliminarEmpleadoEMail));
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonCancelarToolBarEmpleadoEMail.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEMail);				
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoEMail.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoEMail.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEMail && this.isPermisoNuevoEmpleadoEMail));			
			this.jMenuItemDuplicarEmpleadoEMail.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoEMail && this.isPermisoDuplicarEmpleadoEMail));			
			this.jMenuItemCopiarEmpleadoEMail.setVisible((this.isVisibilidadCeldaCopiarEmpleadoEMail && this.isPermisoCopiarEmpleadoEMail));			
			this.jMenuItemVerFormEmpleadoEMail.setVisible((this.isVisibilidadCeldaVerFormEmpleadoEMail && this.isPermisoVerFormEmpleadoEMail));			
			this.jMenuItemAbrirOrderByEmpleadoEMail.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEMail && this.isPermisoOrdenEmpleadoEMail));			
			//this.jMenuItemMostrarOcultarEmpleadoEMail.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEMail && this.isPermisoOrdenEmpleadoEMail));
			this.jMenuItemDetalleAbrirOrderByEmpleadoEMail.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEMail && this.isPermisoOrdenEmpleadoEMail));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoEMail.setVisible((this.isVisibilidadCeldaOrdenEmpleadoEMail && this.isPermisoOrdenEmpleadoEMail));			
			this.jMenuItemNuevoRelacionesEmpleadoEMail.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail && this.isPermisoNuevoEmpleadoEMail));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoEMail.setVisible((this.isVisibilidadCeldaNuevoEmpleadoEMail && this.isPermisoNuevoEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail));									
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemModificarEmpleadoEMail.setVisible((this.isVisibilidadCeldaModificarEmpleadoEMail && this.isPermisoActualizarEmpleadoEMail));	
			this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemActualizarEmpleadoEMail.setVisible((this.isVisibilidadCeldaActualizarEmpleadoEMail && this.isPermisoActualizarEmpleadoEMail));	
			this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemEliminarEmpleadoEMail.setVisible((this.isVisibilidadCeldaEliminarEmpleadoEMail && this.isPermisoEliminarEmpleadoEMail));
			this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemCancelarEmpleadoEMail.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEMail);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoEMail.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail));						
			this.jMenuItemGuardarCambiosTablaEmpleadoEMail.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoEMail=this.jButtonNuevoEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoEMail=this.jButtonDuplicarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoEMail=this.jButtonCopiarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoEMail=this.jButtonVerFormEmpleadoEMail.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoEMail=this.jButtonAbrirOrderByEmpleadoEMail.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=this.jButtonNuevoRelacionesEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoEMail=this.jButtonModificarEmpleadoEMail.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jButtonActualizarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jButtonEliminarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jButtonCancelarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosEmpleadoEMail.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=this.jButtonGuardarCambiosTablaEmpleadoEMail.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoEMail=this.jButtonNuevoToolBarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=this.jButtonNuevoRelacionesToolBarEmpleadoEMail.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			this.isVisibilidadCeldaModificarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jButtonModificarToolBarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jButtonActualizarToolBarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jButtonEliminarToolBarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jButtonCancelarToolBarEmpleadoEMail.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoEMail=this.jButtonGuardarCambiosToolBarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=this.jButtonGuardarCambiosTablaToolBarEmpleadoEMail.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoEMail=this.jMenuItemNuevoEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=this.jMenuItemNuevoRelacionesEmpleadoEMail.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			this.isVisibilidadCeldaModificarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemModificarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemActualizarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemEliminarEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoEMail=this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemCancelarEmpleadoEMail.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoEMail=this.jMenuItemGuardarCambiosEmpleadoEMail.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=this.jMenuItemGuardarCambiosTablaEmpleadoEMail.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoEMail(Boolean esInicializar) {
		if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadoemailSessionBean.getConGuardarRelaciones()) {
				//if(this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoEMail();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoEMail(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoEMail() {
		this.jButtonNuevoEmpleadoEMail.setVisible(this.isPermisoNuevoEmpleadoEMail);			
		this.jButtonDuplicarEmpleadoEMail.setVisible(this.isPermisoDuplicarEmpleadoEMail);			
		this.jButtonCopiarEmpleadoEMail.setVisible(this.isPermisoCopiarEmpleadoEMail);			
		this.jButtonVerFormEmpleadoEMail.setVisible(this.isPermisoVerFormEmpleadoEMail);			
		
		this.jButtonAbrirOrderByEmpleadoEMail.setVisible(this.isPermisoOrdenEmpleadoEMail);					
		
		this.jButtonNuevoRelacionesEmpleadoEMail.setVisible(this.isPermisoNuevoEmpleadoEMail);			
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonModificarEmpleadoEMail.setVisible(this.isPermisoActualizarEmpleadoEMail);	
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonActualizarEmpleadoEMail.setVisible(this.isPermisoActualizarEmpleadoEMail);	
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonEliminarEmpleadoEMail.setVisible(this.isPermisoEliminarEmpleadoEMail);
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonCancelarEmpleadoEMail.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEMail);						
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosEmpleadoEMail.setVisible(this.isPermisoGuardarCambiosEmpleadoEMail);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoEMail.setVisible(this.isPermisoActualizarEmpleadoEMail);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoEMail() {
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonModificarEmpleadoEMail.setVisible(this.isPermisoActualizarEmpleadoEMail);	
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonActualizarEmpleadoEMail.setVisible(this.isPermisoActualizarEmpleadoEMail);	
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonEliminarEmpleadoEMail.setVisible(this.isPermisoEliminarEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonCancelarEmpleadoEMail.setVisible(this.isVisibilidadCeldaCancelarEmpleadoEMail);							
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosEmpleadoEMail.setVisible((this.isVisibilidadCeldaGuardarEmpleadoEMail && this.isPermisoGuardarCambiosEmpleadoEMail));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoEMail() {
		if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoEMail();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoEMail() {
	}
	
	public void jTableDatosEmpleadoEMailListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoEMail(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.getempleadoemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoemail==null) {
						this.empleadoemail = new EmpleadoEMail();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
				}

				if(this.empleadoemail.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadoemail.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoEMailUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoEMail(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoEMail.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoEMail.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.getempleadoemail(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadoemailLogic.getConnexion());

				if(this.empleadoemail.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadoemail.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoEMail=(TitledBorder)this.jScrollPanelDatosEmpleadoEMail.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoEMail.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.getempleadoemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoemail==null) {
						this.empleadoemail = new EmpleadoEMail();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
				}

				if(this.empleadoemail.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadoemail.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoEMailActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {
			this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.BUSQUEDA,false,false,false,true);
			this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);
			this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="Empleado";

			if(!this.sFinalQueryGeneral_empleado.equals("")) {
				this.empleadoBeanSwingJInternalFrame.setsFinalQueryGeneral(this.sFinalQueryGeneral_empleado);
				this.empleadoBeanSwingJInternalFrame.sAccionBusqueda="Query";


				this.empleadoBeanSwingJInternalFrame.procesarBusqueda(this.empleadoBeanSwingJInternalFrame.sAccionBusqueda);
				this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingEmpleado(false);
			}

			if(!this.sFinalQueryComboEmpleado.equals("") && false) {
			}


			JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
			jinternalFrame.setAutoscrolls(true);
			//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
			jinternalFrame.setVisible(true); 


			TitledBorder titledBorderEmpleadoEMail=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosEmpleadoEMail.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderEmpleadoEMail=(TitledBorder)this.jScrollPanelDatosEmpleadoEMail.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoEMail.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoEmpleadoEMailUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoEMail(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoEMail.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoEMail.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.getempleadoemail(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadoemailLogic.getConnexion());

				if(this.empleadoemail.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadoemail.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoEMail=(TitledBorder)this.jScrollPanelDatosEmpleadoEMail.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoEMail.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.getempleadoemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoemail==null) {
						this.empleadoemail = new EmpleadoEMail();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
				}

				if(this.empleadoemail.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadoemail.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtone_mailEmpleadoEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.getempleadoemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoemail==null) {
						this.empleadoemail = new EmpleadoEMail();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
				}

				if(this.empleadoemail.gete_mail()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where e_mail like '%"+this.empleadoemail.gete_mail()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionEmpleadoEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.getempleadoemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoemail==null) {
						this.empleadoemail = new EmpleadoEMail();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
				}

				if(this.empleadoemail.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.empleadoemail.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoEmpleadoEMailBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.getempleadoemail(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoemail==null) {
						this.empleadoemail = new EmpleadoEMail();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);
				}

				if(this.empleadoemail.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.empleadoemail.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoEMail(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoEMail(false,false);

			this.getEmpleadoEMailsFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoEMail(false);

			//if(EmpleadoEMailBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoEMail(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoEMailActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoEMail(false,false);

			this.getEmpleadoEMailsFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoEMail(false);

			//if(EmpleadoEMailBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoEMail(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoemailLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoEMail() {
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
			this.jInternalFrameDetalleFormEmpleadoEMail.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoEMail.dispose();
			this.jInternalFrameDetalleFormEmpleadoEMail=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoEMail!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoEMail.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoEMail.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoEMail=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoEMail!=null) {
			this.jInternalFrameImportacionEmpleadoEMail.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoEMail.dispose();
			this.jInternalFrameImportacionEmpleadoEMail=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoEMail();
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoEMail")) {
				jButtonNuevoEmpleadoEMailActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoEMail")) {
				jButtonDuplicarEmpleadoEMailActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoEMail")) {
				jButtonCopiarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoEMail")) {
				jButtonVerFormEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoEMail")) {
				jButtonNuevoEmpleadoEMailActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoEMail")) {
				jButtonDuplicarEmpleadoEMailActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoEMail")) {
				jButtonNuevoEmpleadoEMailActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoEMail")) {
				jButtonDuplicarEmpleadoEMailActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoEMail")) {
				jButtonNuevoEmpleadoEMailActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoEMail")) {
				jButtonNuevoEmpleadoEMailActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoEMail")) {
				jButtonNuevoEmpleadoEMailActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoEMail")) {
				jButtonModificarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoEMail")) {
				jButtonModificarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoEMail")) {
				jButtonModificarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoEMail")) {
				jButtonActualizarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoEMail")) {
				jButtonActualizarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoEMail")) {
				jButtonActualizarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoEMail")) {
				jButtonEliminarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoEMail")) {
				jButtonEliminarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoEMail")) {
				jButtonEliminarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoEMail")) {
				jButtonCancelarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoEMail")) {
				jButtonCancelarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoEMail")) {
				jButtonCancelarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoEMail")) {
				jButtonCerrarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoEMail")) {
				jButtonCerrarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoEMail")) {
				jButtonCerrarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoEMail")) {
				jButtonMostrarOcultarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoEMail")) {
				jButtonCancelarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoEMail")) {
				jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoEMail")) {
				jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoEMail")) {
				jButtonCopiarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoEMail")) {
				jButtonVerFormEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoEMail")) {
				jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoEMail")) {
				jButtonCopiarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoEMail")) {
				jButtonVerFormEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoEMail")) {
				jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoEMail")) {
				jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoEMail")) {
				jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoEMail")) {
				jButtonRecargarInformacionEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoEMail")) {
				jButtonRecargarInformacionEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoEMail")) {
				jButtonRecargarInformacionEmpleadoEMailActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoEMail")) {
				jButtonAnterioresEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoEMail")) {
				jButtonAnterioresEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoEMail")) {
				jButtonAnterioresEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoEMail")) {
				jButtonSiguientesEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoEMail")) {
				jButtonSiguientesEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoEMail")) {
				jButtonSiguientesEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoEMail") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoEMail")) {
				jButtonAbrirOrderByEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoEMail") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoEMail")) {
				jButtonMostrarOcultarEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoEMail")) {
				jButtonNuevoGuardarCambiosEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoEMail")) {
				jButtonNuevoGuardarCambiosEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoEMail")) {
				jButtonNuevoGuardarCambiosEmpleadoEMailActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoEMail")) {
				jButtonCerrarReporteDinamicoEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoEMail")) {
				jButtonGenerarReporteDinamicoEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoEMail")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoEMail")) {
				jButtonCerrarImportacionEmpleadoEMailActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoEMail")) {
				
				jButtonGenerarImportacionEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoEMail")) {
				
				jButtonAbrirImportacionEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoEMail")) {
				jComboBoxTiposAccionesEmpleadoEMailActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoEMail")) {
				jComboBoxTiposRelacionesEmpleadoEMailActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoEMail")) {
				jComboBoxTiposAccionesEmpleadoEMailActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoEMail")) {
				
				jComboBoxTiposSeleccionarEmpleadoEMailActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoEMail")) {
				jTextFieldValorCampoGeneralEmpleadoEMailActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoEMail")) {
				jButtonAbrirOrderByEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoEMail")) {
				jButtonAbrirOrderByEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoEMail")) {
				jButtonCerrarOrderByEmpleadoEMailActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoEMailBusqueda")) {
				this.jButtonidEmpleadoEMailBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEMailUpdate")) {
				this.jButtonid_empresaEmpleadoEMailUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEMailBusqueda")) {
				this.jButtonid_empresaEmpleadoEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEMail")) {
				this.jButtonid_empleadoEmpleadoEMailActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEMailUpdate")) {
				this.jButtonid_empleadoEmpleadoEMailUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEMailBusqueda")) {
				this.jButtonid_empleadoEmpleadoEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mailEmpleadoEMailBusqueda")) {
				this.jButtone_mailEmpleadoEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpleadoEMailBusqueda")) {
				this.jButtondescripcionEmpleadoEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoEmpleadoEMailBusqueda")) {
				this.jButtonesta_activoEmpleadoEMailBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoEmpleadoEMail")) {
				this.jButtonid_empleadoEmpleadoEMailActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoEMail")) {
				this.jButtonFK_IdEmpleadoEmpleadoEMailActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoEMail();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEMailActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				


				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoEMail empleadoemailLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadoemailLocal=this.empleadoemail;
			} else {
				empleadoemailLocal=this.empleadoemailAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
							
				
				


				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEMailActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
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
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
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
			
			


			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEMailActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
								
						
				


				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
								
				
				


				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEMailActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEMailActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEMailActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
							
				
				


				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEMailActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
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
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
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
			
			


			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEMailActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
								
				
				


				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEMailActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEMailActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEMailActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoEMail")) {
					jCheckBoxSeleccionarTodosEmpleadoEMailItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoEMail")) {
					jCheckBoxSeleccionadosEmpleadoEMailItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoEMail")) {
					
				}
				
				


				
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
												
				
				


				
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEMailActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEMailActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
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
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
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
			
			


			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoEMailActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoemail);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoemail);
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
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
				
				


				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoEMail.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoEMail.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoEMailActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoemailAnterior =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoEMail")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoEMailListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoEMail.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadoemail =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadoemail =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadoemail);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoEMail")) {
				
				}
				
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoEMail")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoEMail.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoEMail")) {
			
			}
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoEMail();
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoEMail")) {
				jButtonNuevoEmpleadoEMailActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoEMail")) {
				jButtonDuplicarEmpleadoEMailActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoEMail")) {
				jButtonCopiarEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoEMail")) {
				jButtonVerFormEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoEMail")) {
				jButtonNuevoEmpleadoEMailActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoEMail")) {
				jButtonModificarEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoEMail")) {
				jButtonActualizarEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoEMail")) {
				jButtonEliminarEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoEMail")) {
				jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoEMail")) {
				jButtonCancelarEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoEMail")) {
				jButtonCerrarEmpleadoEMailActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoEMail")) {
				jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoEMail")) {
				jButtonNuevoGuardarCambiosEmpleadoEMailActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoEMail")) {
				jButtonAbrirOrderByEmpleadoEMailActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoEMail")) {
				jButtonRecargarInformacionEmpleadoEMailActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoEMail")) {
				jButtonAnterioresEmpleadoEMailActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoEMail")) {
				jButtonSiguientesEmpleadoEMailActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoEMailBusqueda")) {
				this.jButtonidEmpleadoEMailBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEMailUpdate")) {
				this.jButtonid_empresaEmpleadoEMailUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoEMailBusqueda")) {
				this.jButtonid_empresaEmpleadoEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEMail")) {
				this.jButtonid_empleadoEmpleadoEMailActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEMailUpdate")) {
				this.jButtonid_empleadoEmpleadoEMailUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoEMailBusqueda")) {
				this.jButtonid_empleadoEmpleadoEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("e_mailEmpleadoEMailBusqueda")) {
				this.jButtone_mailEmpleadoEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpleadoEMailBusqueda")) {
				this.jButtondescripcionEmpleadoEMailBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoEmpleadoEMailBusqueda")) {
				this.jButtonesta_activoEmpleadoEMailBusquedaActionPerformed(evt);
			}
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoEMail();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoEMail")) {
				closingInternalFrameEmpleadoEMail();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoEMail")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoEMail = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoEMailBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoEMailBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoEMail.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoEMailActionPerformed(null);
			}
			
			EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoemail,new Object(),this.empleadoemailParameterGeneral,this.empleadoemailReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoEMail(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoEMail(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoEMail(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadoemail)) {
			if(!esControlTabla) {
				if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);			
				}
				
				if(this.empleadoemailSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoEMail(this.empleadoemail,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoemailReturnGeneral=empleadoemailLogic.procesarEventosEmpleadoEMailsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoemailLogic.getEmpleadoEMails(),this.empleadoemail,this.empleadoemailParameterGeneral,this.isEsNuevoEmpleadoEMail,classes);//this.empleadoemailLogic.getEmpleadoEMail()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoEMail(this.empleadoemailReturnGeneral,this.empleadoemailBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadoemailSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoEMail(classes,this.empleadoemailReturnGeneral,this.empleadoemailBean,false);
					}
						
					if(this.empleadoemailReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoEMail(this.empleadoemailReturnGeneral.getEmpleadoEMail());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoEMail(this.empleadoemailReturnGeneral.getEmpleadoEMail());	
					}
						
					if(this.empleadoemailReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoEMail(this.empleadoemailReturnGeneral.getEmpleadoEMail(),classes);//this.empleadoemailBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoEMail(this.empleadoemail,classes);//this.empleadoemailBean);									
				}
			
				if(EmpleadoEMailJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoEMail(this.empleadoemail,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoEMail(this.empleadoemail);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadoemailAnterior!=null) {
						this.empleadoemail=this.empleadoemailAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoemailReturnGeneral=empleadoemailLogic.procesarEventosEmpleadoEMailsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoemailLogic.getEmpleadoEMails(),this.empleadoemail,this.empleadoemailParameterGeneral,this.isEsNuevoEmpleadoEMail,classes);//this.empleadoemailLogic.getEmpleadoEMail()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoemailSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoemailSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadoemailReturnGeneral.getEmpleadoEMail(),empleadoemailLogic.getEmpleadoEMails());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadoemailReturnGeneral.getEmpleadoEMail(),this.empleadoemails);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoEMail.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoEMail.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoEMail();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoEMail() throws Exception {
		
		EmpleadoEMailModel empleadoemailModel=(EmpleadoEMailModel)this.jTableDatosEmpleadoEMail.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoemailModel.empleadoemails=this.empleadoemailLogic.getEmpleadoEMails();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadoemailModel.empleadoemails=this.empleadoemails;
		}
		
		
		((EmpleadoEMailModel) this.jTableDatosEmpleadoEMail.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoEMail() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadoemailAnterior(),this.empleadoemailLogic.getEmpleadoEMails());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadoemailAnterior(),this.empleadoemails);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoEMail();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoEMail(EmpleadoEMail empleadoemail,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
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
										
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoemail,new Object(),generalEntityParameterGeneral,this.empleadoemailReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadoemailSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoEMailConstantesFunciones.getClassesRelationshipsOfEmpleadoEMail(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoEMailConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoEMail(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoEMail(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoEMailBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoemail,new Object(),generalEntityParameterGeneral,this.empleadoemailReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoEMail(EmpleadoEMailBean empleadoemailBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoEMail(ArrayList<Classe> classes,EmpleadoEMailReturnGeneral empleadoemailReturnGeneral,EmpleadoEMailBean empleadoemailBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoEMail(EmpleadoEMail empleadoemail,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadoemail)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoEMail = new EmpleadoEMailDetalleFormJInternalFrame(jDesktopPane,this.empleadoemailSessionBean.getConGuardarRelaciones(),this.empleadoemailSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoEMail.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoEMail.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoEMail.empleadoemailLogic=this.empleadoemailLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoEMail("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoEMail();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoEMail();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoEMail("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoEMail();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoEMail.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoEMail"));
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonModificarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoEMail"));

		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonModificarToolBarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoEMail"));
					
		this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemModificarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoEMail"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonActualizarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoEMail"));
		
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonActualizarToolBarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoEMail"));
						
		this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemActualizarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoEMail"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonEliminarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoEMail"));
		
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonEliminarToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoEMail"));
								
		this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemEliminarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoEMail"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonCancelarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoEMail"));
		
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonCancelarToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoEMail"));
					
		this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemCancelarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoEMail"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemDetalleCerrarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoEMail"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoEMail"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoEMail"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoEMail"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonidEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoEMailBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empresaEmpleadoEMailUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empresaEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEMailBusqueda"));
		//jButtonid_empleadoEmpleadoEMail.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoEMailActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMail.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMail"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMailUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtone_mailEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"e_mailEmpleadoEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtondescripcionEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonesta_activoEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEmpleadoEMailBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoEMail.jTabbedPaneRelacionesEmpleadoEMail.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoEMail"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoEMail"));
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoEMail"));
		}
		
		this.jTableDatosEmpleadoEMail.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoEMail"));
		
		this.jTableDatosEmpleadoEMail.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoEMail"));
		
		this.jButtonNuevoEmpleadoEMail.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoEMail"));
		
		this.jButtonDuplicarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoEMail"));
		
		this.jButtonCopiarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoEMail"));
		
		this.jButtonVerFormEmpleadoEMail.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoEMail"));
		
		
		this.jButtonNuevoToolBarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoEMail"));
			
		this.jButtonDuplicarToolBarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoEMail"));
			
		this.jMenuItemNuevoEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoEMail"));
			
		this.jMenuItemDuplicarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoEMail"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoEMail.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoEMail"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoEMail"));
			
		this.jMenuItemNuevoRelacionesEmpleadoEMail.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoEMail"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonModificarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoEMail"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonModificarToolBarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoEMail"));
			
			this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemModificarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoEMail"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonActualizarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoEMail"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonActualizarToolBarEmpleadoEMail.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoEMail"));
				
			this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemActualizarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoEMail"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonEliminarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoEMail"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonEliminarToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoEMail"));
						
			this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemEliminarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoEMail"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonCancelarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoEMail"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonCancelarToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoEMail"));
			
			this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemCancelarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoEMail"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoEMail"));		
		
		
		this.jButtonCerrarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoEMail"));
		
		
		this.jButtonCerrarToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoEMail"));
			
		this.jMenuItemCerrarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoEMail"));
			
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jMenuItemDetalleCerrarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoEMail"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosEmpleadoEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoEMail"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoEMail"));
		}
		
		this.jButtonCopiarToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoEMail"));
			
		this.jButtonVerFormToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoEMail"));
		
		this.jMenuItemGuardarCambiosEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoEMail"));
			
		this.jMenuItemCopiarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoEMail"));		
		
		this.jMenuItemVerFormEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoEMail"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoEMail"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoEMail"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoEMail.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoEMail"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoEMail.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoEMail"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoEMail"));
		
		this.jMenuItemRecargarInformacionEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoEMail"));		
		
		
		
		this.jButtonAnterioresEmpleadoEMail.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoEMail"));
		
		
		this.jButtonAnterioresToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoEMail"));
		
		this.jMenuItemAnterioresEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoEMail"));		
		
		
		this.jButtonSiguientesEmpleadoEMail.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoEMail"));
		
		
		this.jButtonSiguientesToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoEMail"));
			
		this.jMenuItemSiguientesEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoEMail"));
			
		this.jMenuItemAbrirOrderByEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoEMail"));
			
		this.jMenuItemMostrarOcultarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoEMail"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoEMail"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoEMail"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoEMail.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoEMail"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoEMail"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoEMail.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoEMail"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoEMail.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoEMail"));

		this.jCheckBoxSeleccionadosEmpleadoEMail.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoEMail"));
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoEMail"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoEMail.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoEMail"));
			
		this.jComboBoxTiposAccionesEmpleadoEMail.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoEMail"));
					
		this.jComboBoxTiposSeleccionarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoEMail"));
			
		this.jTextFieldValorCampoGeneralEmpleadoEMail.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoEMail"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonidEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoEMailBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empresaEmpleadoEMailUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empresaEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEMailBusqueda"));
		//jButtonid_empleadoEmpleadoEMail.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoEMailActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMail.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMail"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMailUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtone_mailEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"e_mailEmpleadoEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtondescripcionEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonesta_activoEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEmpleadoEMailBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoEmpleadoEMail.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoEMail"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMail"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoEMail!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoEMail.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoEMail"));
				this.jInternalFrameReporteDinamicoEmpleadoEMail.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoEMail"));
				this.jInternalFrameReporteDinamicoEmpleadoEMail.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoEMail"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoEMail.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoEMail"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoEMail.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoEMail"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoEMail.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoEMail"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoEMail!=null) {
				this.jInternalFrameImportacionEmpleadoEMail.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoEMail"));
				this.jInternalFrameImportacionEmpleadoEMail.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoEMail"));
				this.jInternalFrameImportacionEmpleadoEMail.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoEMail"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoEMail.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoEMail"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoEMail.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoEMail"));			
			
			if(this.jInternalFrameOrderByEmpleadoEMail!=null) {
				this.jInternalFrameOrderByEmpleadoEMail.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoEMail"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoEMail.jTabbedPaneRelacionesEmpleadoEMail.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoEMail"));
		
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
            		closingInternalFrameEmpleadoEMail();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoEMail.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoEMail = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoEMailBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoEMailBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoEMail.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoEMailActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoEMail.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoEMailListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoEMail.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoEMail.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEMailActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEMailActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEMailActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoEMail";
		inputMap = this.jButtonNuevoEmpleadoEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoEMailActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEMailActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEMailActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoEMailActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoEMail";
		inputMap = this.jButtonNuevoRelacionesEmpleadoEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoEMailActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoEMail";
		inputMap = this.jButtonModificarEmpleadoEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoEMail";
		inputMap = this.jButtonActualizarEmpleadoEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoEMail";
		inputMap = this.jButtonEliminarEmpleadoEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoEMail";
		inputMap = this.jButtonCancelarEmpleadoEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoEMail";
		inputMap = this.jButtonCerrarEmpleadoEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoEMail";
		inputMap = this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosEmpleadoEMail.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonGuardarCambiosEmpleadoEMail.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoEMailActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoEMail.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoEMailItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoEMail.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoEMailActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoEMail.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoEMailActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoEMail.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoEMailActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonidEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoEMailBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empresaEmpleadoEMailUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empresaEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoEMailBusqueda"));
		//jButtonid_empleadoEmpleadoEMail.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoEMailActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMail.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMail"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMailUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMailUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtone_mailEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"e_mailEmpleadoEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtondescripcionEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoEMailBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoEMail.jButtonesta_activoEmpleadoEMailBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEmpleadoEMailBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoEmpleadoEMail.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoEMail"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoEMail.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoEMail"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoEMail.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoEMailActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoEMailActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoEMail.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoEMail(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoEMail empleadoemailAux:this.empleadoemailLogic.getEmpleadoEMails()) {
					empleadoemailAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEMail empleadoemailAux:empleadoemails) {
					empleadoemailAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoEMailItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoEMail(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoEMail empleadoemailAux:this.empleadoemailLogic.getEmpleadoEMails()) {
						empleadoemailAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoEMail empleadoemailAux:empleadoemails) {
						empleadoemailAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoEMail empleadoemailAux:this.empleadoemailLogic.getEmpleadoEMails()) {
					
						if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							empleadoemailAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoEMail empleadoemailAux:empleadoemails) {
						
						if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							empleadoemailAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoEMail(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoEMail.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoEMail.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMail,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoEMailItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoEMail(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoEMail.getSelectedRows();
			
			EmpleadoEMail empleadoemailLocal=new EmpleadoEMail();
			
			//this.seleccionarTodosEmpleadoEMail(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoemailLocal =(EmpleadoEMail) this.empleadoemailLogic.getEmpleadoEMails().toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadoemailLocal =(EmpleadoEMail) this.empleadoemails.toArray()[this.jTableDatosEmpleadoEMail.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadoemailLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoEMail empleadoemailAux:this.empleadoemailLogic.getEmpleadoEMails()) {
						empleadoemailAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoEMail empleadoemailAux:empleadoemails) {
						empleadoemailAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoEMail(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoEMail.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoEMail.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoEMail,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoEMailItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoEMailParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoEMailActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoEMail(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoEMail.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoEMail empleadoemailAux:this.empleadoemailLogic.getEmpleadoEMails()) {
				
						if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							empleadoemailAux.sete_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empleadoemailAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEMail empleadoemailAux:empleadoemails) {
					
						if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_EMAIL)) {
							existe=true;
							empleadoemailAux.sete_mail(this.sValorCampoGeneral);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empleadoemailAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoEMail(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoEMailActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoEMail(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoEMail=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoEMail.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoEMail) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoEMail(conSplash);
				
					this.generarReporteEmpleadoEMailsSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoEMailsSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoEMailsSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoEMailsSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoEMail();
				
				this.exportarEmpleadoEMailsSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoEMails();
				//this.importarEmpleadoEMails();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoEMail();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoEMailsSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Email", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoEMail();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoEMail)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoEMail(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Email",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoEMailBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoEMail) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoEMail(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoEMail();
						
						this.generarReporteProcesoAccionEmpleadoEMailsSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoEMailBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado EmailS SELECCIONADOS?", "MANTENIMIENTO DE Empleado Email", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoEMail();
				
						this.actualizarParametrosGeneralEmpleadoEMail();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadoemailReturnGeneral=empleadoemailLogic.procesarAccionEmpleadoEMailsWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadoemailLogic.getEmpleadoEMails(),this.empleadoemailParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoEMailReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoEMail();
					
					EmpleadoEMailBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoEMailReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoEMail.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxTiposAccionesFormularioEmpleadoEMail.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoEMail(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoEMailActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoEMail();
			
			if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();		
			EmpleadoEMail empleadoemail=new EmpleadoEMail();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoEMail(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoEMail.getSelectedItem();
			
			
			
			
			empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadoemailsSeleccionados.size()==1) {
				for(EmpleadoEMail empleadoemailAux:empleadoemailsSeleccionados) {
					empleadoemail=empleadoemailAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoEMail();
			
      		//this.finishProcessEmpleadoEMail(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoEMailReturnGeneral() throws Exception {
		if(this.empleadoemailReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadoemailReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadoemailReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadoemailReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadoemailReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadoemailReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoEMail(false);
		}
		
		if(this.empleadoemailReturnGeneral.getConRetornoLista() || this.empleadoemailReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadoemailReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoemailLogic.setEmpleadoEMails(this.empleadoemailReturnGeneral.getEmpleadoEMails());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadoemailReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoemailLogic.setEmpleadoEMail(this.empleadoemailReturnGeneral.getEmpleadoEMail());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoEMail(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoEMail() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoEMail> getEmpleadoEMailsSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoEMail) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoEMail empleadoemailAux:empleadoemailLogic.getEmpleadoEMails()) {
					if(empleadoemailAux.getIsSelected()) {
						empleadoemailsSeleccionados.add(empleadoemailAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoEMail empleadoemailAux:this.empleadoemails) {
					if(empleadoemailAux.getIsSelected()) {
						empleadoemailsSeleccionados.add(empleadoemailAux);				
					}
				}
			}
			
			if(empleadoemailsSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadoemailsSeleccionados.addAll(this.empleadoemailLogic.getEmpleadoEMails());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadoemailsSeleccionados.addAll(this.empleadoemails);				
					}
				}
			}
		} else {
			empleadoemailsSeleccionados.add(this.empleadoemail);
		}
		
		return empleadoemailsSeleccionados;
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
	
	public void generarReporteEmpleadoEMailsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoEMailsSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoEMailsSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoEMailsSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoEMailsSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Email",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoEMailsSeleccionados() throws Exception {
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();		
		
		empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoEMails("Todos",empleadoemailsSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoEMailsSeleccionados() throws Exception {
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();		
		
		empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoEMails("Todos",empleadoemailsSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoEMailsSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();
		
		empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoEMails("Todos",empleadoemailsSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoEMailsSeleccionados() throws Exception {
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoEMail();
		
		
		empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoEMail();
		
		
		//this.generarReporteEmpleadoEMails("Todos",empleadoemailsSeleccionados ,empleadoemailImplementable,empleadoemailImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoEMails() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoEMail();
		
		this.abrirFrameImportacionEmpleadoEMail();		
		
			
		//this.generarReporteEmpleadoEMails("Todos",empleadoemailsSeleccionados ,empleadoemailImplementable,empleadoemailImplementableHome);
	}
	
	public void importarEmpleadoEMails() throws Exception {		
	
	}
	
	public void exportarEmpleadoEMailsSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoEMailsSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoEMailsSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoEMailsSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Email",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoEMailsSeleccionados() throws Exception {
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();		
		
		empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoemail."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoEMail(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoEMail empleadoemailAux:empleadoemailsSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoEMail(empleadoemailAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadoemailAux.setsDetalleGeneralEntityReporte(empleadoemailAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Email",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoEMail(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoEMailConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEMailConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEMailConstantesFunciones.LABEL_EMAIL;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoEMail(EmpleadoEMail empleadoemail,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadoemail.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoemail.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoemail.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoemail.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoemail.gete_mail();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoemail.getdescripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoemail.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoEMailsSeleccionados() throws Exception {
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();		
		
		empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoemail.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoEMails");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoEMail(row);				
				iRow++;
			}				
			
			for(EmpleadoEMail empleadoemailAux:empleadoemailsSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoEMail(empleadoemailAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Email",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoEMailsSeleccionados() throws Exception {
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();		
		
		empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoemail.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadoemails");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadoemail");
			//elementRoot.appendChild(element);
		
			for(EmpleadoEMail empleadoemailAux:empleadoemailsSeleccionados) {
				element = document.createElement("empleadoemail");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoEMail(empleadoemailAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Email",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoEMail(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_EMAIL);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoEMail(EmpleadoEMail empleadoemail,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoemail.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoemail.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoemail.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoemail.gete_mail());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoemail.getdescripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoemail.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoEMail(EmpleadoEMail empleadoemail,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoEMailConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadoemail.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoEMailConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadoemail.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoEMailConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadoemail.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoEMailConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadoemail.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elemente_mail = document.createElement(EmpleadoEMailConstantesFunciones.EMAIL);
		elemente_mail.appendChild(document.createTextNode(empleadoemail.gete_mail().trim()));
		element.appendChild(elemente_mail);

		Element elementdescripcion = document.createElement(EmpleadoEMailConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(empleadoemail.getdescripcion().trim()));
		element.appendChild(elementdescripcion);

		Element elementesta_activo = document.createElement(EmpleadoEMailConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(empleadoemail.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoEmpleadoEMailsSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoEMail> empleadoemailsSeleccionados=new ArrayList<EmpleadoEMail>();
		
		empleadoemailsSeleccionados=this.getEmpleadoEMailsSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoEMail(empleadoemailsSeleccionados);
		
		this.generarReporteEmpleadoEMails("Todos",empleadoemailsSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoEMail(ArrayList<EmpleadoEMail> empleadoemailsSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoEMail empleadoemailAux:empleadoemailsSeleccionados) {
				empleadoemailAux.setsDetalleGeneralEntityReporte(empleadoemailAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadoemailAux.setsDescripcionGeneralEntityReporte1(empleadoemailAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadoemailAux.setsDescripcionGeneralEntityReporte1(empleadoemailAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_EMAIL)) {
					existe=true;
					empleadoemailAux.setsDescripcionGeneralEntityReporte1(empleadoemailAux.gete_mail());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					empleadoemailAux.setsDescripcionGeneralEntityReporte1(empleadoemailAux.getdescripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoEMailConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					empleadoemailAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(empleadoemailAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoEMailConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoEMail(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoEMail=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoEMail=false;
			this.isVisibilidadCeldaActualizarEmpleadoEMail=false;
			this.isVisibilidadCeldaEliminarEmpleadoEMail=false;
			this.isVisibilidadCeldaCancelarEmpleadoEMail=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoEMail=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=false;
			this.isVisibilidadCeldaModificarEmpleadoEMail=false;
			this.isVisibilidadCeldaActualizarEmpleadoEMail=true;
			this.isVisibilidadCeldaEliminarEmpleadoEMail=false;
			this.isVisibilidadCeldaCancelarEmpleadoEMail=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoEMail=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=false;
			this.isVisibilidadCeldaModificarEmpleadoEMail=false;
			this.isVisibilidadCeldaActualizarEmpleadoEMail=true;
			this.isVisibilidadCeldaEliminarEmpleadoEMail=true;
			this.isVisibilidadCeldaCancelarEmpleadoEMail=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoEMail=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=false;
			this.isVisibilidadCeldaModificarEmpleadoEMail=false;
			this.isVisibilidadCeldaActualizarEmpleadoEMail=true;
			this.isVisibilidadCeldaEliminarEmpleadoEMail=false;
			this.isVisibilidadCeldaCancelarEmpleadoEMail=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoEMail=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=true;
			this.isVisibilidadCeldaModificarEmpleadoEMail=false;
			this.isVisibilidadCeldaActualizarEmpleadoEMail=false;
			this.isVisibilidadCeldaEliminarEmpleadoEMail=false;
			this.isVisibilidadCeldaCancelarEmpleadoEMail=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoEMail=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=false;
			this.isVisibilidadCeldaActualizarEmpleadoEMail=false;
			this.isVisibilidadCeldaEliminarEmpleadoEMail=false;
			this.isVisibilidadCeldaCancelarEmpleadoEMail=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoEMail=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=false;
			this.isVisibilidadCeldaModificarEmpleadoEMail=true;
			this.isVisibilidadCeldaActualizarEmpleadoEMail=false;
			this.isVisibilidadCeldaEliminarEmpleadoEMail=false;
			this.isVisibilidadCeldaCancelarEmpleadoEMail=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoEMail=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoEMailJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoEMail=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoEMail(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoEMail=false;
			//this.isVisibilidadCeldaVerFormEmpleadoEMail=false;
			this.isVisibilidadCeldaDuplicarEmpleadoEMail=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadoemailSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoEMail=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoEMail=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadoemailSessionBean.getEsGuardarRelacionado()) {
			if(!empleadoemailSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=false;												
			}
			
			this.jButtonCerrarEmpleadoEMail.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoEMail=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadoemail)) {
			this.isVisibilidadCeldaActualizarEmpleadoEMail=false;
			this.isVisibilidadCeldaEliminarEmpleadoEMail=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoEMail() {
	}
	
	public void actualizarEstadoPanelsEmpleadoEMail(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoEMail!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEMail.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEMail!=null) {
				this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEMail!=null) {
				this.jScrollPanelDatosEmpleadoEMail.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEMail!=null) {
				this.jPanelPaginacionEmpleadoEMail.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEMail!=null) {
				this.jPanelParametrosReportesEmpleadoEMail.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoEMail!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEMail.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEMail!=null) {
				this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoEMail!=null) {
				this.jScrollPanelDatosEmpleadoEMail.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoEMail!=null) {
				this.jPanelPaginacionEmpleadoEMail.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEMail!=null) {
				this.jPanelParametrosReportesEmpleadoEMail.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoEMail!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEMail.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEMail!=null) {
				this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEMail!=null) {
				this.jScrollPanelDatosEmpleadoEMail.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoEMail!=null) {
				this.jPanelPaginacionEmpleadoEMail.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEMail!=null) {
				this.jPanelParametrosReportesEmpleadoEMail.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoEMail!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEMail.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEMail!=null) {
				this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEMail!=null) {
				this.jScrollPanelDatosEmpleadoEMail.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoEMail!=null) {
				this.jPanelPaginacionEmpleadoEMail.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEMail!=null) {
				this.jPanelParametrosReportesEmpleadoEMail.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoEMail!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEMail.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEMail!=null) {
				this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEMail!=null) {
				this.jScrollPanelDatosEmpleadoEMail.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEMail!=null) {
				this.jPanelPaginacionEmpleadoEMail.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEMail!=null) {
				this.jPanelParametrosReportesEmpleadoEMail.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoEMail!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEMail.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEMail!=null) {
				this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEMail!=null) {
				this.jScrollPanelDatosEmpleadoEMail.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEMail!=null) {
				this.jPanelPaginacionEmpleadoEMail.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEMail!=null) {
				this.jPanelParametrosReportesEmpleadoEMail.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoEMail!=null) {
				this.jScrollPanelDatosEdicionEmpleadoEMail.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEMail!=null) {
				this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoEMail!=null) {
				this.jScrollPanelDatosEmpleadoEMail.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoEMail!=null) {
				this.jPanelPaginacionEmpleadoEMail.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoEMail!=null) {
				this.jPanelParametrosReportesEmpleadoEMail.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoEMail!=null) {
					this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoEMail!=null) {
				this.jPanelParametrosReportesEmpleadoEMail.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadoemailSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoEMail!=null) {
				this.jTabbedPaneBusquedasEmpleadoEMail.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoEMail!=null) {
				this.jPanelParametrosReportesEmpleadoEMail.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoEMail.remove(jPanelFK_IdEmpleadoEmpleadoEMail);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoEMail.remove(jPanelFK_IdEmpleadoEmpleadoEMail);}
		}
		
	}
	
	
	
	

	public String registrarSesionEmpleadoEMailParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(empleadoemailSessionBean==null) {
				empleadoemailSessionBean=new EmpleadoEMailSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(empleadoemailSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.empleadoemailFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(EmpleadoEMailConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleadoEMail(true);
			//empleadoSessionBean.setlidEmpleadoEMailActual(this.idEmpleadoEMailActual);

			empleadoemailSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoEMail(true);
			empleadoemailSessionBean.setlIdEmpleadoEMailActualForeignKey(this.idEmpleadoEMailActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoEMailSessionBean empleadoemailSessionBean=new EmpleadoEMailSessionBean();
		
		if(this.empleadoemailSessionBean==null) {
			this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
		}
		
		this.empleadoemailSessionBean.setsUltimaBusquedaEmpleadoEMail(this.getsAccionBusqueda());
		this.empleadoemailSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadoemailSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadoemailSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadoemailSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoEMailSessionBean empleadoemailSessionBean=new EmpleadoEMailSessionBean();
		
		if(this.empleadoemailSessionBean==null) {
			this.empleadoemailSessionBean=new EmpleadoEMailSessionBean();
		}
		
		if(this.empleadoemailSessionBean.getsUltimaBusquedaEmpleadoEMail()!=null&&!this.empleadoemailSessionBean.getsUltimaBusquedaEmpleadoEMail().equals("")) {
			this.setsAccionBusqueda(empleadoemailSessionBean.getsUltimaBusquedaEmpleadoEMail());
			this.setiNumeroPaginacion(empleadoemailSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadoemailSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadoemailSessionBean.getid_empleado());
				empleadoemailSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadoemailSessionBean.getid_empresa());
				empleadoemailSessionBean.setid_empresa(-1L);
			}
		}
		
		this.empleadoemailSessionBean.setsUltimaBusquedaEmpleadoEMail("");
		this.empleadoemailSessionBean.setiNumeroPaginacion(EmpleadoEMailConstantesFunciones.INUMEROPAGINACION);
		this.empleadoemailSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoEMail(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoEMail() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoEMail();
		this.updateVisibilidadBusquedasFormularioEmpleadoEMail();
		this.updateHabilitarBusquedasFormularioEmpleadoEMail();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoEMail() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoEMail.getComponents().length>0) {
	

		if(this.empleadoemailConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoEMail!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoEMail.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEMail);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEMail.getComponent(index);
				jPanel.setBorder(this.empleadoemailConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoEMail);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoEMail() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoEMail.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoEMail.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEMail);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEMail.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoemailConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoEMail);
			if(!this.empleadoemailConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoEMail && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoEMail.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoEMail() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoEMail.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoEMail.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEMail);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEMail.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoemailConstantesFunciones.activarFK_IdEmpleadoEmpleadoEMail);
				this.jTabbedPaneBusquedasEmpleadoEMail.setEnabledAt(index,this.empleadoemailConstantesFunciones.activarFK_IdEmpleadoEmpleadoEMail);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoEMail(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoEMail.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoEMail);

			this.jTabbedPaneBusquedasEmpleadoEMail.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoEMail.getComponent(index);

			this.empleadoemailConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoEMail(resaltar);

			jPanel.setBorder(this.empleadoemailConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoEMail);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoEMail.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpleadoEMail() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoEMail();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoEMail();
		this.updateHabilitarResaltarControlesFormularioEmpleadoEMail();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoEMail() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadoemailConstantesFunciones.resaltaridEmpleadoEMail!=null && this.jInternalFrameDetalleFormEmpleadoEMail!=null) {this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.setBorder(this.empleadoemailConstantesFunciones.resaltaridEmpleadoEMail);}
		if(this.empleadoemailConstantesFunciones.resaltarid_empresaEmpleadoEMail!=null && this.jInternalFrameDetalleFormEmpleadoEMail!=null) {this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.setBorder(this.empleadoemailConstantesFunciones.resaltarid_empresaEmpleadoEMail);}
		if(this.empleadoemailConstantesFunciones.resaltarid_empleadoEmpleadoEMail!=null && this.jInternalFrameDetalleFormEmpleadoEMail!=null) {this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.setBorder(this.empleadoemailConstantesFunciones.resaltarid_empleadoEmpleadoEMail);}
		if(this.empleadoemailConstantesFunciones.resaltare_mailEmpleadoEMail!=null && this.jInternalFrameDetalleFormEmpleadoEMail!=null) {this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreae_mailEmpleadoEMail.setBorder(this.empleadoemailConstantesFunciones.resaltare_mailEmpleadoEMail);}
		if(this.empleadoemailConstantesFunciones.resaltardescripcionEmpleadoEMail!=null && this.jInternalFrameDetalleFormEmpleadoEMail!=null) {this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreadescripcionEmpleadoEMail.setBorder(this.empleadoemailConstantesFunciones.resaltardescripcionEmpleadoEMail);}
		if(this.empleadoemailConstantesFunciones.resaltaresta_activoEmpleadoEMail!=null && this.jInternalFrameDetalleFormEmpleadoEMail!=null) {this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxesta_activoEmpleadoEMail.setBorderPainted(true);this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxesta_activoEmpleadoEMail.setBorder(this.empleadoemailConstantesFunciones.resaltaresta_activoEmpleadoEMail);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoEMail() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostraridEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jPanelidEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostraridEmpleadoEMail);
		//this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostrarid_empresaEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jPanelid_empresaEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostrarid_empresaEmpleadoEMail);
		//this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostrarid_empleadoEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jPanelid_empleadoEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostrarid_empleadoEmpleadoEMail);
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostrarid_empleadoEmpleadoEMail);
		//this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreae_mailEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostrare_mailEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jPanele_mailEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostrare_mailEmpleadoEMail);
		//this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreadescripcionEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostrardescripcionEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jPaneldescripcionEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostrardescripcionEmpleadoEMail);
		//this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxesta_activoEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostraresta_activoEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jPanelesta_activoEmpleadoEMail.setVisible(this.empleadoemailConstantesFunciones.mostraresta_activoEmpleadoEMail);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoEMail() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoEMail==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoEMail!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoEMail.jLabelidEmpleadoEMail.setEnabled(this.empleadoemailConstantesFunciones.activaridEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empresaEmpleadoEMail.setEnabled(this.empleadoemailConstantesFunciones.activarid_empresaEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jComboBoxid_empleadoEmpleadoEMail.setEnabled(this.empleadoemailConstantesFunciones.activarid_empleadoEmpleadoEMail);
			this.jInternalFrameDetalleFormEmpleadoEMail.jButtonid_empleadoEmpleadoEMail.setEnabled(this.empleadoemailConstantesFunciones.activarid_empleadoEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreae_mailEmpleadoEMail.setEnabled(this.empleadoemailConstantesFunciones.activare_mailEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jTextAreadescripcionEmpleadoEMail.setEnabled(this.empleadoemailConstantesFunciones.activardescripcionEmpleadoEMail);
		this.jInternalFrameDetalleFormEmpleadoEMail.jCheckBoxesta_activoEmpleadoEMail.setEnabled(this.empleadoemailConstantesFunciones.activaresta_activoEmpleadoEMail);
		}
	}
	
		
}