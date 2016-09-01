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

import com.bydan.erp.nomina.util.EmpleadoHerraConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoHerraParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoHerraParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EmpleadoHerraBean;
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
public class EmpleadoHerraBeanSwingJInternalFrame extends EmpleadoHerraJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoHerraBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoHerra> empleadoherraValidator = new ClassValidator<EmpleadoHerra>(EmpleadoHerra.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoHerra empleadoherra;	
	public EmpleadoHerra empleadoherraAux;
	public EmpleadoHerra empleadoherraAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoHerra empleadoherraTotales;
	public Long idEmpleadoHerraActual;
	public Long iIdNuevoEmpleadoHerra=0L;
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

	public String sFinalQueryComboHerramienta="";

	public List<Herramienta> herramientasForeignKey;

	public List<Herramienta> getherramientasForeignKey() {
		return herramientasForeignKey;
	}

	public void setherramientasForeignKey(List<Herramienta> herramientasForeignKey) {
		this.herramientasForeignKey = herramientasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Herramienta herramientaForeignKey;

	public Herramienta getherramientaForeignKey() {
		return herramientaForeignKey;
	}

	public void setherramientaForeignKey(Herramienta herramientaForeignKey) {
		this.herramientaForeignKey = herramientaForeignKey;
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
	
	public Boolean isPermisoTodoEmpleadoHerra;
	public Boolean isPermisoNuevoEmpleadoHerra;
	public Boolean isPermisoActualizarEmpleadoHerra;
	public Boolean isPermisoActualizarOriginalEmpleadoHerra;
	public Boolean isPermisoEliminarEmpleadoHerra;
	public Boolean isPermisoGuardarCambiosEmpleadoHerra;
	public Boolean isPermisoConsultaEmpleadoHerra;
	public Boolean isPermisoBusquedaEmpleadoHerra;
	public Boolean isPermisoReporteEmpleadoHerra;
	public Boolean isPermisoPaginacionMedioEmpleadoHerra;
	public Boolean isPermisoPaginacionAltoEmpleadoHerra;
	public Boolean isPermisoPaginacionTodoEmpleadoHerra;
	public Boolean isPermisoCopiarEmpleadoHerra;
	public Boolean isPermisoVerFormEmpleadoHerra;
	public Boolean isPermisoDuplicarEmpleadoHerra;
	public Boolean isPermisoOrdenEmpleadoHerra;
	
	
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
	
	public EmpleadoHerraParameterReturnGeneral empleadoherraReturnGeneral;
	public EmpleadoHerraParameterReturnGeneral empleadoherraParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoHerra=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoHerra=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoHerraSessionBeanAdditional empleadoherraSessionBeanAdditional=null;
	
	public EmpleadoHerraSessionBeanAdditional getEmpleadoHerraSessionBeanAdditional() {
		return this.empleadoherraSessionBeanAdditional;
	}
	
	public void setEmpleadoHerraSessionBeanAdditional(EmpleadoHerraSessionBeanAdditional empleadoherraSessionBeanAdditional) {
		try {
			this.empleadoherraSessionBeanAdditional=empleadoherraSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoHerraBeanSwingJInternalFrameAdditional empleadoherraBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoHerraBeanSwingJInternalFrame
	
	public EmpleadoHerraBeanSwingJInternalFrameAdditional getEmpleadoHerraBeanSwingJInternalFrameAdditional() {
		return this.empleadoherraBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoHerraBeanSwingJInternalFrameAdditional(EmpleadoHerraBeanSwingJInternalFrameAdditional empleadoherraBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadoherraBeanSwingJInternalFrameAdditional=empleadoherraBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoHerraLogic empleadoherraLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoHerra empleadoherraBean;
	public EmpleadoHerraConstantesFunciones empleadoherraConstantesFunciones;
	//public EmpleadoHerraParameterReturnGeneral empleadoherraReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public HerramientaLogic herramientaLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoHerra> empleadoherras;	
	//public List<EmpleadoHerra> empleadoherrasEliminados;
	//public List<EmpleadoHerra> empleadoherrasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoHerra=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoHerra=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoHerra=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoHerra=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoHerra=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoHerra=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoHerra=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoHerra=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoHerra=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoHerra=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoHerra=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdHerramienta=false;
	
	public Long getiIdNuevoEmpleadoHerra() {
		return this.iIdNuevoEmpleadoHerra;
	}

	public void setiIdNuevoEmpleadoHerra(Long iIdNuevoEmpleadoHerra) {
		this.iIdNuevoEmpleadoHerra = iIdNuevoEmpleadoHerra;
	}
	
	public Long getidEmpleadoHerraActual() {
		return this.idEmpleadoHerraActual;
	}

	public void setidEmpleadoHerraActual(Long idEmpleadoHerraActual) {
		this.idEmpleadoHerraActual = idEmpleadoHerraActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoHerra getempleadoherra() {
		return this.empleadoherra;
	}

	public void setempleadoherra(EmpleadoHerra empleadoherra) {
		this.empleadoherra = empleadoherra;
	}
	
	public EmpleadoHerra getempleadoherraAux() {
		return this.empleadoherraAux;
	}

	public void setempleadoherraAux(EmpleadoHerra empleadoherraAux) {
		this.empleadoherraAux = empleadoherraAux;
	}				
	
	public EmpleadoHerra getempleadoherraAnterior() {
		return this.empleadoherraAnterior;
	}

	public void setempleadoherraAnterior(EmpleadoHerra empleadoherraAnterior) {
		this.empleadoherraAnterior = empleadoherraAnterior;
	}	
	
	public EmpleadoHerra getempleadoherraTotales() {
		return this.empleadoherraTotales;
	}

	public void setempleadoherraTotales(EmpleadoHerra empleadoherraTotales) {
		this.empleadoherraTotales = empleadoherraTotales;
	}	
	
	public EmpleadoHerra getempleadoherraBean() {
		return this.empleadoherraBean;
	}

	public void setempleadoherraBean(EmpleadoHerra empleadoherraBean) {
		this.empleadoherraBean = empleadoherraBean;
	}	
	
	public EmpleadoHerraParameterReturnGeneral getempleadoherraReturnGeneral() {
		return this.empleadoherraReturnGeneral;
	}

	public void setempleadoherraReturnGeneral(EmpleadoHerraParameterReturnGeneral empleadoherraReturnGeneral) {
		this.empleadoherraReturnGeneral = empleadoherraReturnGeneral;
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

	public Long id_herramientaFK_IdHerramienta=-1L;

	public Long getid_herramientaFK_IdHerramienta() {
		return this.id_herramientaFK_IdHerramienta;
	}

	public void setid_herramientaFK_IdHerramienta(Long id_herramientaFK_IdHerramienta) {
		this.id_herramientaFK_IdHerramienta = id_herramientaFK_IdHerramienta;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EmpleadoHerraLogic getEmpleadoHerraLogic()	{		
		return empleadoherraLogic;
	}

	public void setEmpleadoHerraLogic(EmpleadoHerraLogic empleadoherraLogic) {
		this.empleadoherraLogic = empleadoherraLogic;
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
	
	public Boolean getIsEsNuevoEmpleadoHerra() {
		return isEsNuevoEmpleadoHerra;
	}

	public void setIsEsNuevoEmpleadoHerra(Boolean isEsNuevoEmpleadoHerra) {
		this.isEsNuevoEmpleadoHerra = isEsNuevoEmpleadoHerra;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoHerra() {
		return esParaAccionDesdeFormularioEmpleadoHerra;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoHerra(Boolean esParaAccionDesdeFormularioEmpleadoHerra) {
		this.esParaAccionDesdeFormularioEmpleadoHerra = esParaAccionDesdeFormularioEmpleadoHerra;
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

			if(this.empleadoherraSessionBean==null) {
				this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
			}

			if(!this.empleadoherraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empleadoherraSessionBean.getlidEmpresaActual());
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

			if(this.empleadoherraSessionBean==null) {
				this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
			}

			if(!this.empleadoherraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(empleadoherraSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosHerramientasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.herramientasForeignKey=new ArrayList<Herramienta>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			HerramientaLogic herramientaLogic=new HerramientaLogic();

			//herramientaLogic.getHerramientaDataAccess().setIsForForeingKeyData(true);

			if(this.empleadoherraSessionBean==null) {
				this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
			}

			if(!this.empleadoherraSessionBean.getisBusquedaDesdeForeignKeySesionHerramienta()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//herramientaLogic.getHerramientaDataAccess().setIsForForeingKeyData(true);

					herramientaLogic.getTodosHerramientasWithConnection(sFinalQuery,new Pagination());

					this.herramientasForeignKey=herramientaLogic.getHerramientas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaHerramienta(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					herramientaLogic.getEntityWithConnection(empleadoherraSessionBean.getlidHerramientaActual());
					this.herramientasForeignKey.add(herramientaLogic.getHerramienta());
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

					if(this.empleadoherra!=null) {
						this.empleadoherra.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
						this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoHerra.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoHerraGenerico)throws Exception
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
				jComboBoxid_empresaEmpleadoHerraGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoHerraGenerico!=null && jComboBoxid_empresaEmpleadoHerraGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoHerraGenerico.setSelectedIndex(0);
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

					if(this.empleadoherra!=null) {
						this.empleadoherra.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
						this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoHerra.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoHerraGenerico)throws Exception
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
				jComboBoxid_empleadoEmpleadoHerraGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoHerraGenerico!=null && jComboBoxid_empleadoEmpleadoHerraGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoHerraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualHerramientaForeignKey(Long idHerramientaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Herramienta  herramientaTemp=null;

			for(Herramienta herramientaAux:herramientasForeignKey) {
				if(herramientaAux.getId()!=null && herramientaAux.getId().equals(idHerramientaSeleccionado)) {
					herramientaTemp=herramientaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(herramientaTemp!=null) {

					if(this.empleadoherra!=null) {
						this.empleadoherra.setHerramienta(herramientaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
						this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.setSelectedItem(herramientaTemp);
					}
				} else {
					//jComboBoxid_herramientaEmpleadoHerra.setSelectedItem(herramientaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdHerramienta") || sFormularioTipoBusqueda.equals("Todos")){
					if(herramientaTemp!=null && jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra!=null) {
						jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.setSelectedItem(herramientaTemp);
					} else {
						if(jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra!=null) {
							//jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.setSelectedItem(herramientaTemp);
							if(jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.getItemCount()>0) {
								jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.setSelectedIndex(0);
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

	public String getActualHerramientaForeignKeyDescripcion(Long idHerramientaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Herramienta  herramientaTemp=null;

			for(Herramienta herramientaAux:herramientasForeignKey) {
				if(herramientaAux.getId()!=null && herramientaAux.getId().equals(idHerramientaSeleccionado)) {
					herramientaTemp=herramientaAux;
					break;
				}
			}


			sDescripcion=HerramientaConstantesFunciones.getHerramientaDescripcion(herramientaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualHerramientaForeignKeyGenerico(Long idHerramientaSeleccionado,JComboBox jComboBoxid_herramientaEmpleadoHerraGenerico)throws Exception
	{
		try
		{
			Herramienta  herramientaTemp=null;

			for(Herramienta herramientaAux:herramientasForeignKey) {
				if(herramientaAux.getId()!=null && herramientaAux.getId().equals(idHerramientaSeleccionado)) {
					herramientaTemp=herramientaAux;
					break;
				}
			}

			if(herramientaTemp!=null) {
				jComboBoxid_herramientaEmpleadoHerraGenerico.setSelectedItem(herramientaTemp);
			} else {
				if(jComboBoxid_herramientaEmpleadoHerraGenerico!=null && jComboBoxid_herramientaEmpleadoHerraGenerico.getItemCount()>0) {
					jComboBoxid_herramientaEmpleadoHerraGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoHerra empleadoherra,JComboBox jComboBoxid_empresaEmpleadoHerraGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoHerraGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoHerraGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadoherra.setid_empresa(empresaAux.getId());
				empleadoherra.setempresa_descripcion(EmpleadoHerraConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadoherra.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoHerra empleadoherra,JComboBox jComboBoxid_empleadoEmpleadoHerraGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoHerraGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoHerraGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadoherra.setid_empleado(empleadoAux.getId());
				empleadoherra.setempleado_descripcion(EmpleadoHerraConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadoherra.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarHerramientaForeignKey(EmpleadoHerra empleadoherra,JComboBox jComboBoxid_herramientaEmpleadoHerraGenerico)throws Exception
	{
		try
		{
			Herramienta  herramientaAux=new Herramienta();

			if(jComboBoxid_herramientaEmpleadoHerraGenerico==null) {
				herramientaAux=(Herramienta)this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.getSelectedItem();
			} else {
				herramientaAux=(Herramienta)jComboBoxid_herramientaEmpleadoHerraGenerico.getSelectedItem();
			}

			if(herramientaAux!=null && herramientaAux.getId()!=null) {
				empleadoherra.setid_herramienta(herramientaAux.getId());
				empleadoherra.setherramienta_descripcion(EmpleadoHerraConstantesFunciones.getHerramientaDescripcion(herramientaAux));
				empleadoherra.setHerramienta(herramientaAux);			}
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

					if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { 
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { 
					}

					if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { 
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { 
					}

					if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.addItem(empleado);
							}
						}

						if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameHerramientasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingHerramienta=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { 
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.removeAllItems();

							for(Herramienta herramienta:this.herramientasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.addItem(herramienta);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { 
					}

					if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdHerramienta") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.removeAllItems();

							for(Herramienta herramienta:this.herramientasForeignKey) {
								this.jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.addItem(herramienta);
							}
						}

						if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameHerramientaForeignKey(Herramienta herramienta,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.setSelectedItem(herramienta);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.setSelectedItem(herramienta);
						} else {
							this.jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoHerra() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoHerraConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoHerra(this.empleadoherraLogic.getEmpleadoHerras());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoHerraConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoHerra(this.empleadoherras);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Herramienta.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadoherraLogic.setEmpleadoHerras(this.empleadoherras);
			empleadoherraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpleadoHerraParameterReturnGeneral getEmpleadoHerraParameterGeneral() {
		return this.empleadoherraParameterGeneral;
	}
	
	public void setEmpleadoHerraParameterGeneral(EmpleadoHerraParameterReturnGeneral empleadoherraParameterGeneral) {
		this.empleadoherraParameterGeneral = empleadoherraParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpleadoHerra() {
		return isPermisoTodoEmpleadoHerra;
	}

	public void setIsPermisoTodoEmpleadoHerra(Boolean isPermisoTodoEmpleadoHerra) {
		this.isPermisoTodoEmpleadoHerra = isPermisoTodoEmpleadoHerra;
	}

	public Boolean getIsPermisoNuevoEmpleadoHerra() {
		return isPermisoNuevoEmpleadoHerra;
	}

	public void setIsPermisoNuevoEmpleadoHerra(Boolean isPermisoNuevoEmpleadoHerra) {
		this.isPermisoNuevoEmpleadoHerra = isPermisoNuevoEmpleadoHerra;
	}

	public Boolean getIsPermisoActualizarEmpleadoHerra() {
		return isPermisoActualizarEmpleadoHerra;
	}

	public void setIsPermisoActualizarEmpleadoHerra(Boolean isPermisoActualizarEmpleadoHerra) {
		this.isPermisoActualizarEmpleadoHerra = isPermisoActualizarEmpleadoHerra;
	}

	public Boolean getIsPermisoEliminarEmpleadoHerra() {
		return isPermisoEliminarEmpleadoHerra;
	}

	public void setIsPermisoEliminarEmpleadoHerra(Boolean isPermisoEliminarEmpleadoHerra) {
		this.isPermisoEliminarEmpleadoHerra = isPermisoEliminarEmpleadoHerra;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoHerra() {
		return isPermisoGuardarCambiosEmpleadoHerra;
	}

	public void setIsPermisoGuardarCambiosEmpleadoHerra(Boolean isPermisoGuardarCambiosEmpleadoHerra) {
		this.isPermisoGuardarCambiosEmpleadoHerra = isPermisoGuardarCambiosEmpleadoHerra;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoHerra() {
		return isPermisoConsultaEmpleadoHerra;
	}

	public void setIsPermisoConsultaEmpleadoHerra(Boolean isPermisoConsultaEmpleadoHerra) {
		this.isPermisoConsultaEmpleadoHerra = isPermisoConsultaEmpleadoHerra;
	}

	public Boolean getIsPermisoBusquedaEmpleadoHerra() {
		return isPermisoBusquedaEmpleadoHerra;
	}

	public void setIsPermisoBusquedaEmpleadoHerra(Boolean isPermisoBusquedaEmpleadoHerra) {
		this.isPermisoBusquedaEmpleadoHerra = isPermisoBusquedaEmpleadoHerra;
	}

	public Boolean getIsPermisoReporteEmpleadoHerra() {
		return isPermisoReporteEmpleadoHerra;
	}

	public void setIsPermisoReporteEmpleadoHerra(Boolean isPermisoReporteEmpleadoHerra) {
		this.isPermisoReporteEmpleadoHerra = isPermisoReporteEmpleadoHerra;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoHerra() {
		return isPermisoPaginacionMedioEmpleadoHerra;
	}

	public void setIsPermisoPaginacionMedioEmpleadoHerra(Boolean isPermisoPaginacionMedioEmpleadoHerra) {
		this.isPermisoPaginacionMedioEmpleadoHerra = isPermisoPaginacionMedioEmpleadoHerra;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoHerra() {
		return isPermisoPaginacionTodoEmpleadoHerra;
	}

	public void setIsPermisoPaginacionTodoEmpleadoHerra(Boolean isPermisoPaginacionTodoEmpleadoHerra) {
		this.isPermisoPaginacionTodoEmpleadoHerra = isPermisoPaginacionTodoEmpleadoHerra;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoHerra() {
		return isPermisoPaginacionAltoEmpleadoHerra;
	}

	public void setIsPermisoPaginacionAltoEmpleadoHerra(Boolean isPermisoPaginacionAltoEmpleadoHerra) {
		this.isPermisoPaginacionAltoEmpleadoHerra = isPermisoPaginacionAltoEmpleadoHerra;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoHerra() {
		return isPermisoCopiarEmpleadoHerra;
	}

	public void setIsPermisoCopiarEmpleadoHerra(Boolean isPermisoCopiarEmpleadoHerra) {
		this.isPermisoCopiarEmpleadoHerra = isPermisoCopiarEmpleadoHerra;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoHerra() {
		return isPermisoVerFormEmpleadoHerra;
	}

	public void setIsPermisoVerFormEmpleadoHerra(Boolean isPermisoVerFormEmpleadoHerra) {
		this.isPermisoVerFormEmpleadoHerra = isPermisoVerFormEmpleadoHerra;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoHerra() {
		return isPermisoDuplicarEmpleadoHerra;
	}

	public void setIsPermisoDuplicarEmpleadoHerra(Boolean isPermisoDuplicarEmpleadoHerra) {
		this.isPermisoDuplicarEmpleadoHerra = isPermisoDuplicarEmpleadoHerra;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoHerra() {
		return isPermisoOrdenEmpleadoHerra;
	}

	public void setIsPermisoOrdenEmpleadoHerra(Boolean isPermisoOrdenEmpleadoHerra) {
		this.isPermisoOrdenEmpleadoHerra = isPermisoOrdenEmpleadoHerra;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoHerra() {
		return isVisibilidadCeldaNuevoEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoHerra(Boolean isVisibilidadCeldaNuevoEmpleadoHerra) {
		this.isVisibilidadCeldaNuevoEmpleadoHerra = isVisibilidadCeldaNuevoEmpleadoHerra;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoHerra() {
		return isVisibilidadCeldaDuplicarEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoHerra(Boolean isVisibilidadCeldaDuplicarEmpleadoHerra) {
		this.isVisibilidadCeldaDuplicarEmpleadoHerra = isVisibilidadCeldaDuplicarEmpleadoHerra;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoHerra() {
		return isVisibilidadCeldaCopiarEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoHerra(Boolean isVisibilidadCeldaCopiarEmpleadoHerra) {
		this.isVisibilidadCeldaCopiarEmpleadoHerra = isVisibilidadCeldaCopiarEmpleadoHerra;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoHerra() {
		return isVisibilidadCeldaVerFormEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoHerra(Boolean isVisibilidadCeldaVerFormEmpleadoHerra) {
		this.isVisibilidadCeldaVerFormEmpleadoHerra = isVisibilidadCeldaVerFormEmpleadoHerra;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoHerra() {
		return isVisibilidadCeldaOrdenEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoHerra(Boolean isVisibilidadCeldaOrdenEmpleadoHerra) {
		this.isVisibilidadCeldaOrdenEmpleadoHerra = isVisibilidadCeldaOrdenEmpleadoHerra;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoHerra() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoHerra(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoHerra) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra = isVisibilidadCeldaNuevoRelacionesEmpleadoHerra;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoHerra() {
		return isVisibilidadCeldaModificarEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoHerra(Boolean isVisibilidadCeldaModificarEmpleadoHerra) {
		this.isVisibilidadCeldaModificarEmpleadoHerra = isVisibilidadCeldaModificarEmpleadoHerra;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoHerra() {
		return isVisibilidadCeldaActualizarEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoHerra(Boolean isVisibilidadCeldaActualizarEmpleadoHerra) {
		this.isVisibilidadCeldaActualizarEmpleadoHerra = isVisibilidadCeldaActualizarEmpleadoHerra;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoHerra() {
		return isVisibilidadCeldaEliminarEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoHerra(Boolean isVisibilidadCeldaEliminarEmpleadoHerra) {
		this.isVisibilidadCeldaEliminarEmpleadoHerra = isVisibilidadCeldaEliminarEmpleadoHerra;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoHerra() {
		return isVisibilidadCeldaCancelarEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoHerra(Boolean isVisibilidadCeldaCancelarEmpleadoHerra) {
		this.isVisibilidadCeldaCancelarEmpleadoHerra = isVisibilidadCeldaCancelarEmpleadoHerra;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoHerra() {
		return isVisibilidadCeldaGuardarEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoHerra(Boolean isVisibilidadCeldaGuardarEmpleadoHerra) {
		this.isVisibilidadCeldaGuardarEmpleadoHerra = isVisibilidadCeldaGuardarEmpleadoHerra;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoHerra() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoHerra;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoHerra(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoHerra) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra = isVisibilidadCeldaGuardarCambiosEmpleadoHerra;
	}
		
	public EmpleadoHerraSessionBean getempleadoherraSessionBean() {
		return this.empleadoherraSessionBean;
	}
	
	public void setempleadoherraSessionBean(EmpleadoHerraSessionBean empleadoherraSessionBean) {
		this.empleadoherraSessionBean=empleadoherraSessionBean;
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

	public Boolean getisVisibilidadFK_IdHerramienta() {
		return this.isVisibilidadFK_IdHerramienta;
	}

	public void setisVisibilidadFK_IdHerramienta(Boolean isVisibilidadFK_IdHerramienta) {
		this.isVisibilidadFK_IdHerramienta=isVisibilidadFK_IdHerramienta;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(EmpleadoHerra empleadoherra)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadoherra,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadoherra,null);
				this.setActualParaGuardarHerramientaForeignKey(empleadoherra,null);
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
	
	public void bugActualizarReferenciaActual(EmpleadoHerra empleadoherra,EmpleadoHerra empleadoherraAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoHerra(empleadoherra);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadoherraAux.setId(empleadoherra.getId());
		empleadoherraAux.setVersionRow(empleadoherra.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoHerra();
		
			int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadoherraValidator.getInvalidValues(this.empleadoherra);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadoherraLogic.setDatosCliente(datosCliente);
			empleadoherraLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadoherraAux=new  EmpleadoHerra();
				
				empleadoherraAux.setIsNew(true);
				empleadoherraAux.setIsChanged(true);
				
				empleadoherraAux.setEmpleadoHerraOriginal(this.empleadoherra);
				
				empleadoherraAux.setId(this.empleadoherra.getId());	
				empleadoherraAux.setVersionRow(this.empleadoherra.getVersionRow());	
				empleadoherraAux.setid_empresa(this.empleadoherra.getid_empresa());	
				empleadoherraAux.setid_empleado(this.empleadoherra.getid_empleado());	
				empleadoherraAux.setid_herramienta(this.empleadoherra.getid_herramienta());	
				empleadoherraAux.setcantidad(this.empleadoherra.getcantidad());	
				empleadoherraAux.setesta_activo(this.empleadoherra.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoherraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoherraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadoherraAux,empleadoherraLogic.getEmpleadoHerras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoherraAux,empleadoherras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadoherraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoherraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherraLogic.saveEmpleadoHerras();//WithConnection
						//empleadoherraLogic.getSetVersionRowEmpleadoHerras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoherra,empleadoherraAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoHerra();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoherraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoherraLogic.saveEmpleadoHerraRelaciones(empleadoherraAux);//WithConnection
								//empleadoherraLogic.getSetVersionRowEmpleadoHerras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoherra,empleadoherraAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoherraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoherraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoherraAux,empleadoherraLogic.getEmpleadoHerras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoherraAux,empleadoherras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoherra,empleadoherraAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadoherraAux=new  EmpleadoHerra();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadoherraSessionBean.getEsGuardarRelacionado() 
					|| (this.empleadoherraSessionBean.getEsGuardarRelacionado() && this.empleadoherra.getId()>=0)) {
						
					empleadoherraAux.setIsNew(false);
				}
				
				empleadoherraAux.setIsDeleted(false);
			
				empleadoherraAux.setId(this.empleadoherra.getId());	
				empleadoherraAux.setVersionRow(this.empleadoherra.getVersionRow());	
				empleadoherraAux.setid_empresa(this.empleadoherra.getid_empresa());	
				empleadoherraAux.setid_empleado(this.empleadoherra.getid_empleado());	
				empleadoherraAux.setid_herramienta(this.empleadoherra.getid_herramienta());	
				empleadoherraAux.setcantidad(this.empleadoherra.getcantidad());	
				empleadoherraAux.setesta_activo(this.empleadoherra.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoherraAux,empleadoherraLogic.getEmpleadoHerras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoherraAux,empleadoherras);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadoherraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoherraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherraLogic.saveEmpleadoHerras();//WithConnection
						//empleadoherraLogic.getSetVersionRowEmpleadoHerras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoherra,empleadoherraAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoHerra();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoherraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoherraLogic.saveEmpleadoHerraRelaciones(empleadoherraAux);//WithConnection
								//empleadoherraLogic.getSetVersionRowEmpleadoHerras();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoherra,empleadoherraAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoherraSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoherraSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoherraAux,empleadoherraLogic.getEmpleadoHerras());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoherraAux,empleadoherras);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoherra,empleadoherraAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadoherraAux=new  EmpleadoHerra();
				
				empleadoherraAux.setIsNew(false);
				empleadoherraAux.setIsChanged(false);
				
				empleadoherraAux.setIsDeleted(true);
				
				empleadoherraAux.setId(this.empleadoherra.getId());	
				empleadoherraAux.setVersionRow(this.empleadoherra.getVersionRow());	
				empleadoherraAux.setid_empresa(this.empleadoherra.getid_empresa());	
				empleadoherraAux.setid_empleado(this.empleadoherra.getid_empleado());	
				empleadoherraAux.setid_herramienta(this.empleadoherra.getid_herramienta());	
				empleadoherraAux.setcantidad(this.empleadoherra.getcantidad());	
				empleadoherraAux.setesta_activo(this.empleadoherra.getesta_activo());	
				
				if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadoherraAux.getId()>=0) {	
						this.empleadoherrasEliminados.add(empleadoherraAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadoherraAux,empleadoherraLogic.getEmpleadoHerras());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoherraAux,empleadoherras);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadoherraSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoherraSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherraLogic.saveEmpleadoHerras();//WithConnection
						//empleadoherraLogic.getSetVersionRowEmpleadoHerras();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoherraSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoherraLogic.saveEmpleadoHerraRelaciones(empleadoherraAux);//WithConnection
								//empleadoherraLogic.getSetVersionRowEmpleadoHerras();//WithConnection
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
							if(this.empleadoherraSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadoherraSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadoherraAux,empleadoherraLogic.getEmpleadoHerras());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadoherraAux,empleadoherras);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.getEmpleadoHerras().addAll(this.empleadoherrasEliminados);
					
					empleadoherraLogic.saveEmpleadoHerras();//WithConnection
					//empleadoherraLogic.getSetVersionRowEmpleadoHerras();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoHerra();
				
				this.empleadoherrasEliminados= new ArrayList<EmpleadoHerra>();		
			}
			
			if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Herra GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Herra",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadoherra=empleadoherraAux;
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
      		//this.finishProcessEmpleadoHerra();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoHerra empleadoherraLocal) throws Exception {
		
		if(this.empleadoherraSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoHerra empleadoherraLocal) throws Exception {	
		if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadoherraLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadoherraLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(HerramientaDetalleFormJInternalFrame.class)) {
				HerramientaBeanSwingJInternalFrame herramientaBeanSwingJInternalFrameLocal=(HerramientaBeanSwingJInternalFrame) ((HerramientaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				herramientaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoHerramienta(herramientaBeanSwingJInternalFrameLocal.getherramienta(),true);
				herramientaBeanSwingJInternalFrameLocal.actualizarLista(herramientaBeanSwingJInternalFrameLocal.herramienta,this.herramientasForeignKey);

				herramientaBeanSwingJInternalFrameLocal.actualizarRelaciones(herramientaBeanSwingJInternalFrameLocal.herramienta);

				empleadoherraLocal.setHerramienta(herramientaBeanSwingJInternalFrameLocal.herramienta);

				this.addItemDefectoCombosForeignKeyHerramienta();
				this.cargarCombosFrameHerramientasForeignKey("Formulario");
				this.setActualHerramientaForeignKey(herramientaBeanSwingJInternalFrameLocal.herramienta.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoHerraActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadoherraValidator.getInvalidValues(this.empleadoherra);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoHerra empleadoherra,List<EmpleadoHerra> empleadoherras) throws Exception {
		try	{		
			EmpleadoHerraConstantesFunciones.actualizarLista(empleadoherra,empleadoherras,this.empleadoherraSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoHerra empleadoherra,List<EmpleadoHerra> empleadoherras) throws Exception {
		try	{			
			EmpleadoHerraConstantesFunciones.actualizarSelectedLista(empleadoherra,empleadoherras);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoHerra> empleadoherrasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadoherrasLocal=this.empleadoherraLogic.getEmpleadoHerras();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadoherrasLocal=this.empleadoherras;
			}
			//ARCHITECTURE
		
			for(EmpleadoHerra empleadoherraLocal:empleadoherrasLocal) {
				if(this.permiteMantenimiento(empleadoherraLocal) && empleadoherraLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpleadoHerraConstantesFunciones.getEmpleadoHerraLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoHerraConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelid_empresaEmpleadoHerra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoHerraConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelid_empleadoEmpleadoHerra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoHerraConstantesFunciones.IDHERRAMIENTA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelid_herramientaEmpleadoHerra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoHerraConstantesFunciones.CANTIDAD)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelcantidadEmpleadoHerra,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoHerraConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelesta_activoEmpleadoHerra,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelid_empresaEmpleadoHerra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelid_empleadoEmpleadoHerra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelid_herramientaEmpleadoHerra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelcantidadEmpleadoHerra,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelesta_activoEmpleadoHerra,"");
		
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
		this.iIdNuevoEmpleadoHerra--;	
		
		
		this.empleadoherraAux=new EmpleadoHerra();
		
		this.empleadoherraAux.setId(this.iIdNuevoEmpleadoHerra);
		this.empleadoherraAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoherraLogic.getEmpleadoHerras().add(this.empleadoherraAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadoherras.add(this.empleadoherraAux);
		}
		//ARCHITECTURE
		
		this.empleadoherra=this.empleadoherraAux;
		
		if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoHerra(this.empleadoherra);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoHerra(this.empleadoherra);
		}
				
		//this.setDefaultControlesEmpleadoHerra();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoHerra();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoHerra();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoHerra();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoHerra(this.empleadoherraBean,this.empleadoherra,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoHerraConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadoherraSessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoHerraConstantesFunciones.getClassesRelationshipsOfEmpleadoHerra(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadoherraReturnGeneral=empleadoherraLogic.procesarEventosEmpleadoHerrasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoherraLogic.getEmpleadoHerras(),this.empleadoherra,this.empleadoherraParameterGeneral,this.isEsNuevoEmpleadoHerra,classes);//this.empleadoherraLogic.getEmpleadoHerra()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoHerra(this.empleadoherraReturnGeneral,this.empleadoherraBean,false);
		
		if(this.empleadoherraReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoHerra(this.empleadoherraReturnGeneral.getEmpleadoHerra());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoHerra(this.empleadoherraReturnGeneral.getEmpleadoHerra());
		}
		
		if(this.empleadoherraReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoHerra(this.empleadoherraReturnGeneral.getEmpleadoHerra(),classes);//this.empleadoherraBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoHerra();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoHerra();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoHerra(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoHerra(false);
						
			if(empleadoherraSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoHerra();
			}
			
			this.actualizarVisualTableDatosEmpleadoHerra();
			
			this.jTableDatosEmpleadoHerra.setRowSelectionInterval(this.getIndiceNuevoEmpleadoHerra(), this.getIndiceNuevoEmpleadoHerra());
			
			this.seleccionarFilaTablaEmpleadoHerraActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoHerra("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoHerra(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jTextFieldcantidadEmpleadoHerra.setEnabled(isHabilitar && this.empleadoherraConstantesFunciones.activarcantidadEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxesta_activoEmpleadoHerra.setEnabled(isHabilitar && this.empleadoherraConstantesFunciones.activaresta_activoEmpleadoHerra);	
		//
		this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.setEnabled(isHabilitar && this.empleadoherraConstantesFunciones.activarid_empresaEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.setEnabled(isHabilitar && this.empleadoherraConstantesFunciones.activarid_empleadoEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.setEnabled(isHabilitar && this.empleadoherraConstantesFunciones.activarid_herramientaEmpleadoHerra);
	};
	
	public void setDefaultControlesEmpleadoHerra() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoHerra(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadoherraSessionBean.setConGuardarRelaciones(true);			
			this.empleadoherraSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoHerra.jTabbedPaneRelacionesEmpleadoHerra.setVisible(true);
			
					
		} else {
			//this.empleadoherraSessionBean.setConGuardarRelaciones(false);			
			this.empleadoherraSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoHerra.jTabbedPaneRelacionesEmpleadoHerra.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoHerra() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoHerra empleadoherraAux:this.empleadoherraLogic.getEmpleadoHerras()) {
				if(empleadoherraAux.getId().equals(this.iIdNuevoEmpleadoHerra)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoHerra empleadoherraAux:this.empleadoherras) {
				if(empleadoherraAux.getId().equals(this.iIdNuevoEmpleadoHerra)) {
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
	
	public int getIndiceActualEmpleadoHerra(EmpleadoHerra empleadoherra,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoHerra empleadoherraAux:this.empleadoherraLogic.getEmpleadoHerras()) {
				if(empleadoherraAux.getId().equals(empleadoherra.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoHerra empleadoherraAux:this.empleadoherras) {
				if(empleadoherraAux.getId().equals(empleadoherra.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpleadoHerra(EmpleadoHerra empleadoherraOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoHerra empleadoherraAux:this.empleadoherraLogic.getEmpleadoHerras()) {
				if(empleadoherraAux.getEmpleadoHerraOriginal().getId().equals(empleadoherraOriginal.getId())) {
					existe=true;
					empleadoherraOriginal.setId(empleadoherraAux.getId());
					empleadoherraOriginal.setVersionRow(empleadoherraAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoHerra empleadoherraAux:this.empleadoherras) {
				if(empleadoherraAux.getEmpleadoHerraOriginal().getId().equals(empleadoherraOriginal.getId())) {
					existe=true;
					empleadoherraOriginal.setId(empleadoherraAux.getId());
					empleadoherraOriginal.setVersionRow(empleadoherraAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoHerra(Boolean esParaCancelar) throws Exception {
		empleadoherrasAux=new ArrayList<EmpleadoHerra>();
		empleadoherraAux=new EmpleadoHerra();
		
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoHerra empleadoherraAux:this.empleadoherraLogic.getEmpleadoHerras()) {
					if(empleadoherraAux.getId()<0) {
						empleadoherrasAux.add(empleadoherraAux);
					}		
				}
				this.iIdNuevoEmpleadoHerra=0L;
				this.empleadoherraLogic.getEmpleadoHerras().removeAll(empleadoherrasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoHerra empleadoherraAux:this.empleadoherras) {
					if(empleadoherraAux.getId()<0) {
						empleadoherrasAux.add(empleadoherraAux);
					}		
				}
				this.iIdNuevoEmpleadoHerra=0L;
				this.empleadoherras.removeAll(empleadoherrasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoHerra 
					&& this.empleadoherraLogic.getEmpleadoHerras().size()>0
					) {
					empleadoherraAux=this.empleadoherraLogic.getEmpleadoHerras().get(this.empleadoherraLogic.getEmpleadoHerras().size() - 1);
				
					if(empleadoherraAux.getId()<0) {
						this.empleadoherraLogic.getEmpleadoHerras().remove(empleadoherraAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoHerra && this.empleadoherras.size()>0) {
					empleadoherraAux=this.empleadoherras.get(this.empleadoherras.size() - 1);
				
					if(empleadoherraAux.getId()<0) {
						this.empleadoherras.remove(empleadoherraAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoHerra(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadoherra.getId()<0) {
				this.empleadoherraLogic.getEmpleadoHerras().remove(this.empleadoherra);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadoherra.getId()<0) {
				this.empleadoherras.remove(this.empleadoherra);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoHerra(List<EmpleadoHerra> empleadoherrasAux) throws Exception {
		EmpleadoHerraConstantesFunciones.setEstadosInicialesEmpleadoHerra(empleadoherrasAux);
	}
	
	public void setEstadosInicialesEmpleadoHerra(EmpleadoHerra empleadoherraAux) throws Exception {
		EmpleadoHerraConstantesFunciones.setEstadosInicialesEmpleadoHerra(empleadoherraAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoHerraActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoHerra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoHerraActual()) {
				if(!this.isEsNuevoEmpleadoHerra) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoHerra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoHerra=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoHerraActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Herra ?", "MANTENIMIENTO DE Empleado Herra", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoHerra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoHerra empleadoherra) throws Exception {
		EmpleadoHerraConstantesFunciones.seleccionarAsignar(this.empleadoherra,empleadoherra);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoHerra=this.isPermisoActualizarOriginalEmpleadoHerra;
			
			
			this.seleccionarAsignar(empleadoherra);
			
			

			idEmpleadoActual=empleadoherra.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoHerraConstantesFunciones.quitarEspaciosEmpleadoHerra(this.empleadoherra,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoHerra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadoherraSessionBean.setsFuncionBusquedaRapida(this.empleadoherraSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoEmpleadoHerra) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoHerra(esParaCancelar);				
				this.cancelarNuevoEmpleadoHerra(esParaCancelar);								
			}
			
			this.empleadoherra=new EmpleadoHerra();
			
			this.inicializarEmpleadoHerra();
			
			this.actualizarEstadoCeldasBotonesEmpleadoHerra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoHerra() throws Exception {
		try {
			EmpleadoHerraConstantesFunciones.inicializarEmpleadoHerra(this.empleadoherra);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadoherraLogic.getEmpleadoHerras().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoHerras(String sAccionBusqueda,List<EmpleadoHerra> empleadoherrasParaReportes) throws Exception {
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
					sPathReporteFinal="EmpleadoHerra"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoHerraMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoHerraMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoHerra"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empleado Herras");		
		parameters.put("busquedapor", EmpleadoHerraConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoHerra=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoHerraConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoHerraConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoHerra=new JRBeanArrayDataSource(EmpleadoHerraJInternalFrame.TraerEmpleadoHerraBeans(empleadoherrasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoHerra);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoHerraConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoHerraConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoHerraBean.TraerEmpleadoHerraBeans(empleadoherrasParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpleadoHerras(sAccionBusqueda,sTipoArchivoReporte,empleadoherrasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoHerras(sAccionBusqueda,sTipoArchivoReporte,empleadoherrasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoHerraActionPerformed(null);
					//this.generarExcelReporteEmpleadoHerras(sAccionBusqueda,sTipoArchivoReporte,empleadoherrasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoHerras(sAccionBusqueda,sTipoArchivoReporte,empleadoherrasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoHerras(sAccionBusqueda,sTipoArchivoReporte,empleadoherrasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoHerras(sAccionBusqueda,sTipoArchivoReporte,empleadoherrasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoHerras(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoHerra> empleadoherrasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoherra";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoHerras");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoHerra("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoHerra empleadoherra : empleadoherrasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoHerraConstantesFunciones.generarExcelReporteDataEmpleadoHerra("NORMAL",row,workbook,empleadoherra,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Herra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoHerra(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoHerraConstantesFunciones.generarExcelReporteHeaderEmpleadoHerra(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoHerras(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoHerra> empleadoherrasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoherra_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoHerras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoHerra empleadoherra : empleadoherrasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoHerraConstantesFunciones.getEmpleadoHerraDescripcion(empleadoherra));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoherra.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoherra.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoherra.getherramienta_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoherra.getcantidad());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(empleadoherra.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Herra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoHerras(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoHerra> empleadoherrasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoHerra> empleadoherrasRespaldo=null;
		
		classes=EmpleadoHerraConstantesFunciones.getClassesRelationshipsOfEmpleadoHerra(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadoherraLogic.setDatosCliente(this.datosCliente);
		this.empleadoherraLogic.setDatosDeep(this.datosDeep);
		this.empleadoherraLogic.setIsConDeep(true);
		
		empleadoherrasRespaldo=this.empleadoherraLogic.getEmpleadoHerras();
		
		this.empleadoherraLogic.setEmpleadoHerras(empleadoherrasParaReportes);	
		this.empleadoherraLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadoherrasParaReportes=this.empleadoherraLogic.getEmpleadoHerras();
		this.empleadoherraLogic.setEmpleadoHerras(empleadoherrasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoherra_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoHerras");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoHerra("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoHerra empleadoherra : empleadoherrasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoHerra("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoHerraConstantesFunciones.generarExcelReporteDataEmpleadoHerra("NORMAL",row,workbook,empleadoherra,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoHerraConstantesFunciones.getEmpleadoHerraDescripcion(empleadoherra));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Herra",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoHerra() throws Exception {		
		this.startProcessEmpleadoHerra(true);
	}
	
	public void startProcessEmpleadoHerra(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoHerra ,this.jPanelParametrosReportesEmpleadoHerra, this.jScrollPanelDatosEmpleadoHerra,this.jPanelPaginacionEmpleadoHerra, this.jScrollPanelDatosEdicionEmpleadoHerra, this.jPanelAccionesEmpleadoHerra,this.jPanelAccionesFormularioEmpleadoHerra,this.jmenuBarEmpleadoHerra,this.jmenuBarDetalleEmpleadoHerra,this.jTtoolBarEmpleadoHerra,this.jTtoolBarDetalleEmpleadoHerra);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoHerra=this.jTabbedPaneBusquedasEmpleadoHerra; 
		
		final JPanel jPanelParametrosReportesEmpleadoHerra=this.jPanelParametrosReportesEmpleadoHerra;
		//final JScrollPane jScrollPanelDatosEmpleadoHerra=this.jScrollPanelDatosEmpleadoHerra;
		final JTable jTableDatosEmpleadoHerra=this.jTableDatosEmpleadoHerra;		
		final JPanel jPanelPaginacionEmpleadoHerra=this.jPanelPaginacionEmpleadoHerra;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoHerra=this.jScrollPanelDatosEdicionEmpleadoHerra;
		final JPanel jPanelAccionesEmpleadoHerra=this.jPanelAccionesEmpleadoHerra;
		
		JPanel jPanelCamposAuxiliarEmpleadoHerra=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoHerra=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			jPanelCamposAuxiliarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jPanelCamposEmpleadoHerra;
			jPanelAccionesFormularioAuxiliarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jPanelAccionesFormularioEmpleadoHerra;
		}
		
		final JPanel jPanelCamposEmpleadoHerra=jPanelCamposAuxiliarEmpleadoHerra;
		final JPanel jPanelAccionesFormularioEmpleadoHerra=jPanelAccionesFormularioAuxiliarEmpleadoHerra;
		
		
		final JMenuBar jmenuBarEmpleadoHerra=this.jmenuBarEmpleadoHerra;
		final JToolBar jTtoolBarEmpleadoHerra=this.jTtoolBarEmpleadoHerra;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoHerra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoHerra=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			jmenuBarDetalleAuxiliarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jmenuBarDetalleEmpleadoHerra;
			jTtoolBarDetalleAuxiliarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jTtoolBarDetalleEmpleadoHerra;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoHerra=jmenuBarDetalleAuxiliarEmpleadoHerra;
		final JToolBar jTtoolBarDetalleEmpleadoHerra=jTtoolBarDetalleAuxiliarEmpleadoHerra;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoHerra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoHerra;
			processRunnable.jTableDatos=jTableDatosEmpleadoHerra;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoHerra;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoHerra;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoHerra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoHerra;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoHerra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoHerra;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoHerra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoHerra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoHerra ,jPanelParametrosReportesEmpleadoHerra,jTableDatosEmpleadoHerra, /*jScrollPanelDatosEmpleadoHerra,*/jPanelCamposEmpleadoHerra,jPanelPaginacionEmpleadoHerra, /*jScrollPanelDatosEdicionEmpleadoHerra,*/ jPanelAccionesEmpleadoHerra,jPanelAccionesFormularioEmpleadoHerra,jmenuBarEmpleadoHerra,jmenuBarDetalleEmpleadoHerra,jTtoolBarEmpleadoHerra,jTtoolBarDetalleEmpleadoHerra);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoHerra ,jPanelParametrosReportesEmpleadoHerra, jScrollPanelDatosEmpleadoHerra,jPanelPaginacionEmpleadoHerra, jScrollPanelDatosEdicionEmpleadoHerra, jPanelAccionesEmpleadoHerra,jPanelAccionesFormularioEmpleadoHerra,jmenuBarEmpleadoHerra,jmenuBarDetalleEmpleadoHerra,jTtoolBarEmpleadoHerra,jTtoolBarDetalleEmpleadoHerra);
						
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
	
	public void finishProcessEmpleadoHerra() {// throws Exception 
		this.finishProcessEmpleadoHerra(true);
	}
	
	public void finishProcessEmpleadoHerra(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoHerra ,this.jPanelParametrosReportesEmpleadoHerra, this.jScrollPanelDatosEmpleadoHerra,this.jPanelPaginacionEmpleadoHerra, this.jScrollPanelDatosEdicionEmpleadoHerra, this.jPanelAccionesEmpleadoHerra,this.jPanelAccionesFormularioEmpleadoHerra,this.jmenuBarEmpleadoHerra,this.jmenuBarDetalleEmpleadoHerra,this.jTtoolBarEmpleadoHerra,this.jTtoolBarDetalleEmpleadoHerra);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoHerra=this.jTabbedPaneBusquedasEmpleadoHerra; 
		
		final JPanel jPanelParametrosReportesEmpleadoHerra=this.jPanelParametrosReportesEmpleadoHerra;
		//final JScrollPane jScrollPanelDatosEmpleadoHerra=this.jScrollPanelDatosEmpleadoHerra;
		final JTable jTableDatosEmpleadoHerra=this.jTableDatosEmpleadoHerra;		
		final JPanel jPanelPaginacionEmpleadoHerra=this.jPanelPaginacionEmpleadoHerra;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoHerra=this.jScrollPanelDatosEdicionEmpleadoHerra;
		final JPanel jPanelAccionesEmpleadoHerra=this.jPanelAccionesEmpleadoHerra;
		
		JPanel jPanelCamposAuxiliarEmpleadoHerra=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoHerra=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			jPanelCamposAuxiliarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jPanelCamposEmpleadoHerra;
			jPanelAccionesFormularioAuxiliarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jPanelAccionesFormularioEmpleadoHerra;
		}
		
		final JPanel jPanelCamposEmpleadoHerra=jPanelCamposAuxiliarEmpleadoHerra;
		final JPanel jPanelAccionesFormularioEmpleadoHerra=jPanelAccionesFormularioAuxiliarEmpleadoHerra;
		
		
		final JMenuBar jmenuBarEmpleadoHerra=this.jmenuBarEmpleadoHerra;		
		final JToolBar jTtoolBarEmpleadoHerra=this.jTtoolBarEmpleadoHerra;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoHerra=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoHerra=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			jmenuBarDetalleAuxiliarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jmenuBarDetalleEmpleadoHerra;
			jTtoolBarDetalleAuxiliarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jTtoolBarDetalleEmpleadoHerra;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoHerra=jmenuBarDetalleAuxiliarEmpleadoHerra;
		final JToolBar jTtoolBarDetalleEmpleadoHerra=jTtoolBarDetalleAuxiliarEmpleadoHerra;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoHerra;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoHerra;
			processRunnable.jTableDatos=jTableDatosEmpleadoHerra;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoHerra;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoHerra;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoHerra;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoHerra;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoHerra;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoHerra;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoHerra;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoHerra;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoHerra ,jPanelParametrosReportesEmpleadoHerra, jTableDatosEmpleadoHerra,/*jScrollPanelDatosEmpleadoHerra,*/jPanelCamposEmpleadoHerra,jPanelPaginacionEmpleadoHerra, /*jScrollPanelDatosEdicionEmpleadoHerra,*/ jPanelAccionesEmpleadoHerra,jPanelAccionesFormularioEmpleadoHerra,jmenuBarEmpleadoHerra,jmenuBarDetalleEmpleadoHerra,jTtoolBarEmpleadoHerra,jTtoolBarDetalleEmpleadoHerra));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoHerra(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoHerra(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoHerra(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoHerra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoHerra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoHerra,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoHerra(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoHerra,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoHerra,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadoherraConstantesFunciones.getsFinalQueryEmpleadoHerra();
		String  finalQueryPaginacionTodos=this.empleadoherraConstantesFunciones.getsFinalQueryEmpleadoHerra();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoHerraConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoHerra(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoHerraConstantesFunciones.getArrayColumnasGlobalesEmpleadoHerra(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoHerraConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadoherrasEliminados= new ArrayList<EmpleadoHerra>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoHerra();
		
				///*EmpleadoHerraSessionBean*/this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
			
			if(this.empleadoherraSessionBean==null) {
				this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
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
					this.iNumeroPaginacion=EmpleadoHerraConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoHerraConstantesFunciones.getClassesForeignKeysOfEmpleadoHerra(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadoherra."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadoherrasAux= new ArrayList<EmpleadoHerra>();
			
				
			empleadoherraLogic.setDatosCliente(this.datosCliente);
			empleadoherraLogic.setDatosDeep(this.datosDeep);
			empleadoherraLogic.setIsConDeep(true);
			
			
			empleadoherraLogic.getEmpleadoHerraDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadoherraLogic.getTodosEmpleadoHerras(finalQueryGlobal,pagination);
					
					//empleadoherraLogic.getTodosEmpleadoHerrasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadoherraLogic.getEmpleadoHerras()==null|| empleadoherraLogic.getEmpleadoHerras().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoherrasAux= new ArrayList<EmpleadoHerra>();
							empleadoherrasAux.addAll(empleadoherraLogic.getEmpleadoHerras());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoherrasAux= new ArrayList<EmpleadoHerra>();
							empleadoherrasAux.addAll(empleadoherras);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoherraLogic.getTodosEmpleadoHerras(finalQueryGlobal+"",this.pagination);												
							
							//empleadoherraLogic.getTodosEmpleadoHerrasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoHerras("Todos",empleadoherraLogic.getEmpleadoHerras() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoherraLogic.setEmpleadoHerras(new ArrayList<EmpleadoHerra>());					
							empleadoherraLogic.getEmpleadoHerras().addAll(empleadoherrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoherras=new ArrayList<EmpleadoHerra>();
							empleadoherras.addAll(empleadoherrasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoHerra=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoHerra=this.idActual;
				
				} else if(this.idEmpleadoHerraActual!=null && this.idEmpleadoHerraActual!=0L) {
					idEmpleadoHerra=idEmpleadoHerraActual;
				}
				
					
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndicePorId(idEmpleadoHerra);
				
				this.empleadoherras=new ArrayList<EmpleadoHerra>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadoherraLogic.getEntity(idEmpleadoHerra);
					
					//empleadoherraLogic.getEntityWithConnection(idEmpleadoHerra);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoherraLogic.setEmpleadoHerras(new ArrayList<EmpleadoHerra>());
					empleadoherraLogic.getEmpleadoHerras().add(empleadoherraLogic.getEmpleadoHerra());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoherras=new ArrayList<EmpleadoHerra>();
					this.empleadoherras.add(empleadoherra);
				}
				
				if(empleadoherraLogic.getEmpleadoHerra()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoherraLogic.getEmpleadoHerrasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoherraLogic.getEmpleadoHerras()==null||empleadoherraLogic.getEmpleadoHerras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoherras==null|| empleadoherras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherrasAux=new ArrayList<EmpleadoHerra>();
						empleadoherrasAux.addAll(empleadoherraLogic.getEmpleadoHerras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoherrasAux=new ArrayList<EmpleadoHerra>();
							empleadoherrasAux.addAll(empleadoherras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoherraLogic.getEmpleadoHerrasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoHerras("FK_IdEmpleado",empleadoherraLogic.getEmpleadoHerras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoHerras("FK_IdEmpleado",empleadoherras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherraLogic.setEmpleadoHerras(new ArrayList<EmpleadoHerra>());
						empleadoherraLogic.getEmpleadoHerras().addAll(empleadoherrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoherras=new ArrayList<EmpleadoHerra>();
							empleadoherras.addAll(empleadoherrasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoherraLogic.getEmpleadoHerrasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoherraLogic.getEmpleadoHerras()==null||empleadoherraLogic.getEmpleadoHerras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoherras==null|| empleadoherras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherrasAux=new ArrayList<EmpleadoHerra>();
						empleadoherrasAux.addAll(empleadoherraLogic.getEmpleadoHerras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoherrasAux=new ArrayList<EmpleadoHerra>();
							empleadoherrasAux.addAll(empleadoherras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoherraLogic.getEmpleadoHerrasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoHerras("FK_IdEmpresa",empleadoherraLogic.getEmpleadoHerras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoHerras("FK_IdEmpresa",empleadoherras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherraLogic.setEmpleadoHerras(new ArrayList<EmpleadoHerra>());
						empleadoherraLogic.getEmpleadoHerras().addAll(empleadoherrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoherras=new ArrayList<EmpleadoHerra>();
							empleadoherras.addAll(empleadoherrasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdHerramienta")) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdHerramienta(id_herramientaFK_IdHerramienta);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoherraLogic.getEmpleadoHerrasFK_IdHerramienta(finalQueryGlobal,pagination,id_herramientaFK_IdHerramienta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdHerramienta(id_herramientaFK_IdHerramienta);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdHerramienta(id_herramientaFK_IdHerramienta);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoherraLogic.getEmpleadoHerras()==null||empleadoherraLogic.getEmpleadoHerras().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoherras==null|| empleadoherras.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherrasAux=new ArrayList<EmpleadoHerra>();
						empleadoherrasAux.addAll(empleadoherraLogic.getEmpleadoHerras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoherrasAux=new ArrayList<EmpleadoHerra>();
							empleadoherrasAux.addAll(empleadoherras);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoherraLogic.getEmpleadoHerrasFK_IdHerramienta(finalQueryGlobal,pagination,id_herramientaFK_IdHerramienta);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdHerramienta(id_herramientaFK_IdHerramienta);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoHerraConstantesFunciones.getDetalleIndiceFK_IdHerramienta(id_herramientaFK_IdHerramienta);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoHerras("FK_IdHerramienta",empleadoherraLogic.getEmpleadoHerras());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoHerras("FK_IdHerramienta",empleadoherras);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherraLogic.setEmpleadoHerras(new ArrayList<EmpleadoHerra>());
						empleadoherraLogic.getEmpleadoHerras().addAll(empleadoherrasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoherras=new ArrayList<EmpleadoHerra>();
							empleadoherras.addAll(empleadoherrasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoHerra();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoHerra();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoherraLogic.getEmpleadoHerras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoherras.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoherraLogic.getEmpleadoHerras().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoherras.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoHerra empleadoherra) {
		Boolean permite=true;
		
		if(this.empleadoherra.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoHerraConstantesFunciones.getOrderByListaEmpleadoHerra();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoHerraConstantesFunciones.getOrderByListaEmpleadoHerra();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoHerra empleadoherra:empleadoherraLogic.getEmpleadoHerras()) {
				if(empleadoherra.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoherraTotales=empleadoherra;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoHerra empleadoherra:this.empleadoherras) {
				if(empleadoherra.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoherraTotales=empleadoherra;
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
			this.empleadoherraAux=new EmpleadoHerra();
			this.empleadoherraAux.setsType(Constantes2.S_TOTALES);
			this.empleadoherraAux.setIsNew(false);
			this.empleadoherraAux.setIsChanged(false);
			this.empleadoherraAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoHerraConstantesFunciones.TotalizarValoresFilaEmpleadoHerra(this.empleadoherraLogic.getEmpleadoHerras(),this.empleadoherraAux);
				
				this.empleadoherraLogic.getEmpleadoHerras().add(this.empleadoherraAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoHerraConstantesFunciones.TotalizarValoresFilaEmpleadoHerra(this.empleadoherras,this.empleadoherraAux);
				
				this.empleadoherras.add(this.empleadoherraAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadoherraTotales=new EmpleadoHerra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoherraLogic.getEmpleadoHerras().remove(empleadoherraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoherras.remove(empleadoherraTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadoherraTotales=new EmpleadoHerra();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoHerra empleadoherra:empleadoherraLogic.getEmpleadoHerras()) {
				if(empleadoherra.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoherraTotales=empleadoherra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoHerraConstantesFunciones.TotalizarValoresFilaEmpleadoHerra(this.empleadoherraLogic.getEmpleadoHerras(),empleadoherraTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoHerra empleadoherra:this.empleadoherras) {
				if(empleadoherra.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoherraTotales=empleadoherra;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoHerraConstantesFunciones.TotalizarValoresFilaEmpleadoHerra(this.empleadoherras,empleadoherraTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoHerrasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoHerrasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoHerrasFK_IdHerramienta()throws Exception {
		try {
			sAccionBusqueda="FK_IdHerramienta";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoHerrasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoherraLogic.getEmpleadoHerrasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoHerrasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoherraLogic.getEmpleadoHerrasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoHerrasFK_IdHerramienta(String sFinalQuery,Long id_herramienta)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoherraLogic.getEmpleadoHerrasFK_IdHerramienta(sFinalQuery,this.pagination,id_herramienta);
				
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
	
	public void inicializarPermisosEmpleadoHerra() {
		this.isPermisoTodoEmpleadoHerra=false;
		this.isPermisoNuevoEmpleadoHerra=false;
		this.isPermisoActualizarEmpleadoHerra=false;
		this.isPermisoActualizarOriginalEmpleadoHerra=false;
		this.isPermisoEliminarEmpleadoHerra=false;
		this.isPermisoGuardarCambiosEmpleadoHerra=false;
		this.isPermisoConsultaEmpleadoHerra=false;
		this.isPermisoBusquedaEmpleadoHerra=false;
		this.isPermisoReporteEmpleadoHerra=false;		
		this.isPermisoOrdenEmpleadoHerra=false;		
		this.isPermisoPaginacionMedioEmpleadoHerra=false;		
		this.isPermisoPaginacionAltoEmpleadoHerra=false;
		this.isPermisoPaginacionTodoEmpleadoHerra=false;
		this.isPermisoCopiarEmpleadoHerra=false;		
		this.isPermisoVerFormEmpleadoHerra=false;		
		this.isPermisoDuplicarEmpleadoHerra=false;		
		this.isPermisoOrdenEmpleadoHerra=false;		
	}
	
	public void setPermisosUsuarioEmpleadoHerra(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoHerra=isPermiso;
		this.isPermisoNuevoEmpleadoHerra=isPermiso;
		this.isPermisoActualizarEmpleadoHerra=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoHerra=isPermiso;
		this.isPermisoEliminarEmpleadoHerra=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoHerra=isPermiso;
		this.isPermisoConsultaEmpleadoHerra=isPermiso;
		this.isPermisoBusquedaEmpleadoHerra=isPermiso;
		this.isPermisoReporteEmpleadoHerra=isPermiso;
		this.isPermisoOrdenEmpleadoHerra=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoHerra=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoHerra=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoHerra=isPermiso;		
		this.isPermisoCopiarEmpleadoHerra=isPermiso;		
		this.isPermisoVerFormEmpleadoHerra=isPermiso;		
		this.isPermisoDuplicarEmpleadoHerra=isPermiso;
		this.isPermisoOrdenEmpleadoHerra=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoHerra(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoHerra=isPermiso;
		this.isPermisoNuevoEmpleadoHerra=isPermiso;
		this.isPermisoActualizarEmpleadoHerra=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoHerra=isPermiso;
		this.isPermisoEliminarEmpleadoHerra=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoHerra=isPermiso;
		//this.isPermisoConsultaEmpleadoHerra=isPermiso;
		//this.isPermisoBusquedaEmpleadoHerra=isPermiso;
		//this.isPermisoReporteEmpleadoHerra=isPermiso;
		//this.isPermisoOrdenEmpleadoHerra=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoHerra=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoHerra=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoHerra=isPermiso;		
		//this.isPermisoCopiarEmpleadoHerra=isPermiso;		
		//this.isPermisoDuplicarEmpleadoHerra=isPermiso;
		//this.isPermisoOrdenEmpleadoHerra=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoHerraClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoHerraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoHerra(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoHerraClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoHerraClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoHerraClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoHerraClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoHerra() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoHerraJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoHerraConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoHerra=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoHerra=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoHerra=this.isPermisoActualizarEmpleadoHerra;
			this.isPermisoEliminarEmpleadoHerra=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoHerra=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoHerra=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoHerra=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoHerra=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoHerra=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoHerra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoHerra=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoHerra=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoHerra=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoHerra=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoHerra=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoHerra=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoHerra=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoHerra.setToolTipText(this.jTableDatosEmpleadoHerra.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoHerra(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoHerra(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoHerraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpleadoHerraJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpleadoHerra() throws Exception {
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
	public void inicializarCombosForeignKeyEmpleadoHerraListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.herramientasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoHerraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoHerraJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoHerraListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyHerramientaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyHerramientaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.herramientasForeignKey==null||this.herramientasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=HerramientaConstantesFunciones.getArrayColumnasGlobalesHerramienta(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,HerramientaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=HerramientaConstantesFunciones.SFINALQUERY;

				this.cargarCombosHerramientasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEmpleadoHerraListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoHerraParameterReturnGeneral empleadoherraReturnGeneral=new EmpleadoHerraParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadoherraConstantesFunciones.cargarid_empresaEmpleadoHerra)
					 || (this.esRecargarFks && this.empleadoherraConstantesFunciones.cargarid_empresaEmpleadoHerra)) {

					if(!this.empleadoherraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadoherraSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadoherraConstantesFunciones.cargarid_empleadoEmpleadoHerra)
					 || (this.esRecargarFks && this.empleadoherraConstantesFunciones.cargarid_empleadoEmpleadoHerra)) {

					if(!this.empleadoherraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadoherraSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalHerramienta="";

				if(((this.herramientasForeignKey==null||this.herramientasForeignKey.size()<=0) && this.empleadoherraConstantesFunciones.cargarid_herramientaEmpleadoHerra)
					 || (this.esRecargarFks && this.empleadoherraConstantesFunciones.cargarid_herramientaEmpleadoHerra)) {

					if(!this.empleadoherraSessionBean.getisBusquedaDesdeForeignKeySesionHerramienta()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=HerramientaConstantesFunciones.getArrayColumnasGlobalesHerramienta(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalHerramienta=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,HerramientaConstantesFunciones.TABLENAME);

						finalQueryGlobalHerramienta=Funciones.GetFinalQueryAppend(finalQueryGlobalHerramienta, "");
						finalQueryGlobalHerramienta+=HerramientaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosHerramientasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalHerramienta=" WHERE " + ConstantesSql.ID + "="+empleadoherraSessionBean.getlidHerramientaActual();
					}
				} else {
					finalQueryGlobalHerramienta="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadoherraReturnGeneral=empleadoherraLogic.cargarCombosLoteForeignKeyEmpleadoHerra(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalHerramienta);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadoherraReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadoherraReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalHerramienta.equals("NONE")) {
				this.herramientasForeignKey=empleadoherraReturnGeneral.getherramientasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoHerra()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyHerramienta();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadoherraSessionBean==null) {
				this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
			}

			if(!this.empleadoherraSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.empleadoherraSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyHerramienta()throws Exception {
		try {

			if(!this.empleadoherraSessionBean.getisBusquedaDesdeForeignKeySesionHerramienta()) {
				Herramienta herramienta=new Herramienta();
				HerramientaConstantesFunciones.setHerramientaDescripcion(herramienta,Constantes.SMENSAJE_ESCOJA_OPCION);
				herramienta.setId(null);

				if(!HerramientaConstantesFunciones.ExisteEnLista(this.herramientasForeignKey,herramienta,true)) {

					this.herramientasForeignKey.add(0,herramienta);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoHerra()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoHerra(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoHerra()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoHerra();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoHerra(EmpleadoHerra empleadoherra)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(empleadoherra.getid_empleado(),false,"Formulario");
			this.setActualHerramientaForeignKey(empleadoherra.getid_herramienta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoHerra(EmpleadoHerra empleadoherra,String sTipoEvento)throws Exception {	
		try {
			
			

				if(empleadoherra.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoEmpleadoHerra")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(empleadoherra.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoHerra()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.empleadoherraConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualHerramientaForeignKey(this.empleadoherraConstantesFunciones.getid_herramienta(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoHerra()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoHerra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoHerra()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoHerra()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoHerra()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameHerramientasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoHerra(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameHerramientasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoHerra()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra!=null && this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra!=null && this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra!=null && this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public EmpleadoHerraBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoHerraBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoHerraBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadoherraSessionBean=new EmpleadoHerraSessionBean(); 
		this.empleadoherraConstantesFunciones=new EmpleadoHerraConstantesFunciones(); 
		this.empleadoherraBean=new EmpleadoHerra();//(this.empleadoherraConstantesFunciones); 		
		this.empleadoherraReturnGeneral=new EmpleadoHerraParameterReturnGeneral(); 
		
		this.empleadoherraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoherraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoHerraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoHerraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoHerraBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoHerra(true);
			
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
			
			this.empleadoherraConstantesFunciones=new EmpleadoHerraConstantesFunciones(); 
			this.empleadoherraBean=new EmpleadoHerra();//this.empleadoherraConstantesFunciones); 			
			this.empleadoherraReturnGeneral=new EmpleadoHerraParameterReturnGeneral(); 
		
			EmpleadoHerraBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Herra Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.empleadoherra=new EmpleadoHerra();
			this.empleadoherras = new ArrayList<EmpleadoHerra>();
			this.empleadoherrasAux = new ArrayList<EmpleadoHerra>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic=new EmpleadoHerraLogic();
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadoherraSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadoherraSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoHerra);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoHerra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoHerra);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoHerra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoHerra);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoHerra!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoHerra);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoHerra);
				this.jInternalFrameDetalleFormEmpleadoHerra.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoHerra.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoHerra!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoHerra);
					this.jInternalFrameReporteDinamicoEmpleadoHerra.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoHerra.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoHerra!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoHerra);
					this.jInternalFrameImportacionEmpleadoHerra.setVisible(false);
					this.jInternalFrameImportacionEmpleadoHerra.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoHerra!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoHerra);
					this.jInternalFrameOrderByEmpleadoHerra.setVisible(false);
					this.jInternalFrameOrderByEmpleadoHerra.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoHerraActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoHerraConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empleadoherraReturnGeneral=new EmpleadoHerraParameterReturnGeneral();
			
			this.empleadoherraParameterGeneral=new EmpleadoHerraParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadoherraLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpleadoHerraJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoHerraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoherraSessionBean.getEsGuardarRelacionado(),this.empleadoherraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoHerraConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoherraSessionBean.getEsGuardarRelacionado(),this.empleadoherraSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpleadoHerra=false;
			this.isVisibilidadCeldaDuplicarEmpleadoHerra=true;
			this.isVisibilidadCeldaCopiarEmpleadoHerra=true;
			this.isVisibilidadCeldaVerFormEmpleadoHerra=true;
			this.isVisibilidadCeldaOrdenEmpleadoHerra=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=false;
			this.isVisibilidadCeldaModificarEmpleadoHerra=false;
			this.isVisibilidadCeldaActualizarEmpleadoHerra=false;
			this.isVisibilidadCeldaEliminarEmpleadoHerra=false;
			this.isVisibilidadCeldaCancelarEmpleadoHerra=false;
			this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdHerramienta=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoHerra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoHerra();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoHerra(false);
			
			this.setPermisosUsuarioEmpleadoHerra();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoherraSessionBean.getEsGuardarRelacionado() 
				|| (this.empleadoherraSessionBean.getEsGuardarRelacionado() && this.empleadoherraSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoHerraClasesRelacionadas();
			}
			
			if(this.empleadoherraSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoHerraClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoHerra();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoHerra();
			}
			
			if(!this.isPermisoBusquedaEmpleadoHerra) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoHerra,this.isPermisoPaginacionMedioEmpleadoHerra,this.isPermisoPaginacionTodoEmpleadoHerra);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoHerraConstantesFunciones.getTiposSeleccionarEmpleadoHerra());
				
				this.tiposColumnasSelect=EmpleadoHerraConstantesFunciones.getTiposSeleccionarEmpleadoHerra(true);
				
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
			//if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoHerra();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEmpleadoHerra(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEmpleadoHerra(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoHerra() ;
			
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
			this.herramientaLogic=new HerramientaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empleadoherraImplementable= (EmpleadoHerraImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoHerraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadoherraImplementableHome= (EmpleadoHerraImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoHerraConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadoherras= new ArrayList<EmpleadoHerra>();
			this.empleadoherrasEliminados= new ArrayList<EmpleadoHerra>();
						
			this.isEsNuevoEmpleadoHerra=false;
			this.esParaAccionDesdeFormularioEmpleadoHerra=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.herramientasForeignKey=new ArrayList<Herramienta>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoHerra(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoHerra();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoHerraBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoHerraConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoHerra("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoHerra(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoHerra();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoHerra();
			}
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoHerra.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoHerra.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoHerra.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoHerra(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoHerra: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoHerra() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoHerra")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoHerra.jTabbedPaneRelacionesEmpleadoHerra.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoHerra.jTabbedPaneRelacionesEmpleadoHerra.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoHerra();	
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
	
	public void cargarCombosForeignKeyEmpleadoHerra(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoHerra(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoHerra(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoHerraListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoHerra();
		
		this.cargarCombosFrameForeignKeyEmpleadoHerra();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoHerra();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoHerra();
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

	public void cargarCombosForeignKeyHerramienta(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyHerramientaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyHerramienta();
				this.cargarCombosFrameHerramientasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaHerramienta(this.herramientasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEmpleadoHerraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadoherraSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
			
			if(jTableDatosEmpleadoHerra.getRowCount()>=1) {
				jTableDatosEmpleadoHerra.removeRowSelectionInterval(0, jTableDatosEmpleadoHerra.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoHerra=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoHerra(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoHerra(true);			
			//this.empleadoherra=new EmpleadoHerra();
			//this.empleadoherra.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoHerra(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoHerra() ;
			
			if(EmpleadoHerraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoHerra(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadoherra);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);				
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
			if(this.empleadoherraSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoHerra: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoHerraActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoHerra.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoHerra.getSelectedRows().length;			
			}
			
			empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoHerra--;			
				//EmpleadoHerra empleadoherraAux= new EmpleadoHerra();			
				//empleadoherraAux.setId(this.iIdNuevoEmpleadoHerra);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoHerra empleadoherraOrigen=new EmpleadoHerra();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoHerra empleadoherraOrigen : empleadoherrasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadoherraOrigen =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoherraOrigen =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoHerra();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadoherra.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoHerra(empleadoherraOrigen,this.empleadoherra,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoherraLogic.getEmpleadoHerras().add(this.empleadoherraAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoherras.add(this.empleadoherraAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoHerra(false);
				
				this.jTableDatosEmpleadoHerra.setRowSelectionInterval(this.getIndiceNuevoEmpleadoHerra(), this.getIndiceNuevoEmpleadoHerra());
				
				int iLastRow =  this.jTableDatosEmpleadoHerra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoHerra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoHerra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoHerra(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();									
		
			EmpleadoHerra empleadoherraOrigen=new EmpleadoHerra();
			EmpleadoHerra empleadoherraDestino=new EmpleadoHerra();
				
			empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoHerra.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadoherrasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoHerra.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherraOrigen =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoherraOrigen =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoherraDestino =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoherraDestino =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadoherraOrigen =empleadoherrasSeleccionados.get(0);
				empleadoherraDestino =empleadoherrasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoHerra(empleadoherraOrigen,empleadoherraDestino,true,false);
				
				empleadoherraDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoherraDestino,empleadoherraLogic.getEmpleadoHerras());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoherraDestino,empleadoherras);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoHerra(false);
				
				//this.jTableDatosEmpleadoHerra.setRowSelectionInterval(this.getIndiceNuevoEmpleadoHerra(), this.getIndiceNuevoEmpleadoHerra());
				
				int iLastRow =  this.jTableDatosEmpleadoHerra.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoHerra.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoHerra.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoHerra(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoHerra.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoHerra.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoHerra.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoHerra.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoHerra.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoHerra();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoHerra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoHerra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoHerra();
			
			this.abrirFrameOrderByEmpleadoHerra();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoHerra();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoHerra(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoHerra);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoHerra.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoHerra.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoHerra.setSize(this.jInternalFrameDetalleFormEmpleadoHerra.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoHerra.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoHerra.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoHerra.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoHerra.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoHerra.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoHerra.jContentPaneDetalleEmpleadoHerra.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoHerra.jTabbedPaneRelacionesEmpleadoHerra.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoHerra.jContentPaneDetalleEmpleadoHerra.getWidth(),EmpleadoHerraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoHerra.jTabbedPaneRelacionesEmpleadoHerra.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoHerra.jContentPaneDetalleEmpleadoHerra.getWidth(),EmpleadoHerraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoHerra.jTabbedPaneRelacionesEmpleadoHerra.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoHerra.jContentPaneDetalleEmpleadoHerra.getWidth(),EmpleadoHerraConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoHerra.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoHerra.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoHerra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoHerra==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoHerra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoHerra,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoHerra=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoHerra,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoHerra);
				this.jInternalFrameOrderByEmpleadoHerra.setVisible(false);
				this.jInternalFrameOrderByEmpleadoHerra.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoHerra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoHerra"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoHerra();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoHerra() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoHerra==null) {
				
				this.jInternalFrameImportacionEmpleadoHerra=new ImportacionJInternalFrame(EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoHerra);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoHerra);
				this.jInternalFrameImportacionEmpleadoHerra.setVisible(false);
				this.jInternalFrameImportacionEmpleadoHerra.setSelected(false);


				this.jInternalFrameImportacionEmpleadoHerra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoHerra"));
				this.jInternalFrameImportacionEmpleadoHerra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoHerra"));
				this.jInternalFrameImportacionEmpleadoHerra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoHerra"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoHerra() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoHerra==null) {
				this.jInternalFrameReporteDinamicoEmpleadoHerra=new ReporteDinamicoJInternalFrame(EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoHerra);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoHerra);
				this.jInternalFrameReporteDinamicoEmpleadoHerra.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoHerra.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoHerra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoHerra"));
				this.jInternalFrameReporteDinamicoEmpleadoHerra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoHerra"));
				this.jInternalFrameReporteDinamicoEmpleadoHerra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoHerra"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoHerra();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoHerra() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoHerra);
			
	       	this.jInternalFrameDetalleFormEmpleadoHerra.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoHerra.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoHerra.dispose();
			//this.jInternalFrameDetalleFormEmpleadoHerra=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoHerra() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoHerra.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoHerra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoHerra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoHerra.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoHerra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoHerra() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoHerra.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoHerra.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoHerra() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoHerra.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoHerra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoHerra() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoHerra.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoHerra.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoHerra() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoHerra.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoHerra.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoHerra(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoHerra(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoHerra(true);
			//this.isEsNuevoEmpleadoHerra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoHerra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoHerra(false) ;
			
			if(empleadoherraSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoHerraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoHerra(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoHerra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoHerraActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoHerra(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoHerra(true);
			//this.isEsNuevoEmpleadoHerra=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadoherra.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoHerra("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoHerra(false) ;
			
			if(EmpleadoHerraJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoHerra(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoHerra(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.empleadoherraConstantesFunciones.cargarid_empleadoEmpleadoHerra) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingEmpleadoHerra(false,false);
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
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoHerra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaHerramienta(List<Herramienta> herramientasForeignKey)throws Exception{
		TableColumn tableColumnHerramienta=this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA));
		TableCellEditor tableCellEditorHerramienta =tableColumnHerramienta.getCellEditor();

		HerramientaTableCell herramientaTableCellFk=(HerramientaTableCell)tableCellEditorHerramienta;

		if(herramientaTableCellFk!=null) {
			herramientaTableCellFk.setherramientasForeignKey(herramientasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoHerra.getSelectedRow();

		//if(intSelectedRow<=0) {
			//herramientaTableCellFk.setRowActual(intSelectedRow);
			//herramientaTableCellFk.setherramientasForeignKeyActual(herramientasForeignKey);
		//}


		if(herramientaTableCellFk!=null) {
			herramientaTableCellFk.RecargarHerramientasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoHerra(false);
			
			//if(!this.isEsNuevoEmpleadoHerra) {								
				int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
				
			}
			
			if(this.permiteMantenimiento(this.empleadoherra)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoHerra=true;
					this.inicializarActualizarBindingTablaEmpleadoHerra(false);
					this.isEsNuevoEmpleadoHerra=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoHerra=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoHerra=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoHerra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoHerra(false);
				
				this.habilitarDeshabilitarControlesEmpleadoHerra(false);
			
												
				
				if(EmpleadoHerraJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoHerra();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoHerraActionPerformed(evt,empleadoherraSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoHerra(this.empleadoherra,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoHerra.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadoherraSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadoherra.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				this.empleadoherra.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				this.empleadoherra.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadoherra)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoHerraModel) this.jTableDatosEmpleadoHerra.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoHerra=true;
				this.inicializarActualizarBindingTablaEmpleadoHerra(false);
				this.isEsNuevoEmpleadoHerra=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoHerra(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoHerra(false);
				
				this.habilitarDeshabilitarControlesEmpleadoHerra(false);
				
				
				
				if(EmpleadoHerraJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoHerra();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoHerra.getRowCount()>=1) {
				jTableDatosEmpleadoHerra.removeRowSelectionInterval(0, jTableDatosEmpleadoHerra.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoHerra(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoHerra(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoHerra(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoHerra(false) ;
			
			this.isEsNuevoEmpleadoHerra=false;
			
			if(EmpleadoHerraJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoHerra();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoHerra(false);
				
				//SI ES MANUAL
				if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoHerra();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoHerra--;			
			//EmpleadoHerra empleadoherraAux= new EmpleadoHerra();			
			//empleadoherraAux.setId(this.iIdNuevoEmpleadoHerra);
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoHerra();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
			
			this.empleadoherra.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadoherraLogic.getEmpleadoHerras().add(this.empleadoherraAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadoherras.add(this.empleadoherraAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoHerra(false);
			
			this.jTableDatosEmpleadoHerra.setRowSelectionInterval(this.getIndiceNuevoEmpleadoHerra(), this.getIndiceNuevoEmpleadoHerra());
			
			int iLastRow =  this.jTableDatosEmpleadoHerra.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoHerra.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoHerra.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoHerra(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoHerra(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoHerra(false);
			
			//SI ES MANUAL
			if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoHerra();
			}
			
			//this.abrirFrameTreeEmpleadoHerra();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado HerraS ?", "MANTENIMIENTO DE Empleado Herra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoHerra.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoHerra();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadoherraReturnGeneral=empleadoherraLogic.procesarImportacionEmpleadoHerrasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadoherraParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoHerraReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoHerra.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoHerra.setFileImportacion(this.jInternalFrameImportacionEmpleadoHerra.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoHerra.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoHerra.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoHerra.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoHerra.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();		

		empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoHerraBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoHerraBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpleadoHerras("Todos",empleadoherrasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Herra",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Herramienta_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Herramienta_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Herramienta_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Herramienta_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ntidad_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ntidad_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ntidad_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ntidad_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoEmpleadoHerra.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA:
					sNombreCampoCategoria="id_herramienta";
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoria="cantidad";
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA:
					sNombreCampoCategoriaValor="id_herramienta";
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD:
					sNombreCampoCategoriaValor="cantidad";
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Herramienta",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_herramienta");
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Cantidad",sNombreCampoCategoria,sNombreCampoCategoriaValor,"cantidad");
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();		
		
		empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoherra";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpleadoHerras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoHerra empleadoherra:empleadoherrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoherra.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoHerra empleadoherra:empleadoherrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoherra.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA);
					iRow++;

					for(EmpleadoHerra empleadoherra:empleadoherrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoherra.getherramienta_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD);
					iRow++;

					for(EmpleadoHerra empleadoherra:empleadoherrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoherra.getcantidad());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(EmpleadoHerra empleadoherra:empleadoherrasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoherra.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelEmpleadoHerra(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoHerra empleadoherraAux:empleadoherrasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoHerra(empleadoherraAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Herra",JOptionPane.INFORMATION_MESSAGE);
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
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoHerra(false);
			
			//SI ES MANUAL
			if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoHerra();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoHerra(false);
			
			//SI ES MANUAL
			if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoHerra();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoHerra(false);
			
			//SI ES MANUAL
			if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoHerra();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoHerra() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoHerra.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoHerra.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoHerra.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoHerra.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoHerra.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoHerra.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoHerra.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoHerra(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoHerra(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoHerra(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoHerra(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoHerra(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoHerra(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoHerra(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoHerra(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoHerra() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoHerra();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoHerra(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoHerra();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoHerra() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoHerra(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoHerra(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoHerra.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoHerra.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoHerra.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxPostAccionNuevoEmpleadoHerra.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxPostAccionSinCerrarEmpleadoHerra.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxPostAccionSinMensajeEmpleadoHerra.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoHerra.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoHerra.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoHerra.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
				this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxPostAccionNuevoEmpleadoHerra.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxPostAccionSinCerrarEmpleadoHerra.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxPostAccionSinMensajeEmpleadoHerra.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoHerra.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoHerra.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoHerra.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoHerra!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoHerra.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoHerra.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoHerra.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoHerra.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoHerra!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoHerra.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoHerra.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoHerra(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoHerra(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoHerra() throws Exception {
		try	{
			if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoHerra();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoHerra() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoHerra() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoHerra.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoHerra.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoHerra.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoHerra.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoHerra.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoHerra.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoHerra.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoHerra.addItem(reporte);
			}
			
			
			if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoHerra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoHerra.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoHerra.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoHerra.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoHerra.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoHerra.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoHerra.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoHerra.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoHerra.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoHerra();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoHerra() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoHerra!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoHerra!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoHerra.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoHerra!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoHerra.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoHerra()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoHerra.getSelectedItem()).getId();}
		if(this.jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.getSelectedItem()!=null){this.id_herramientaFK_IdHerramienta=((Herramienta)this.jComboBoxid_herramientaFK_IdHerramientaEmpleadoHerra.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoHerra(Boolean esInicializar) throws Exception {				
		if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoHerra();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoHerra() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoHerra(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoHerra() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoHerraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoHerraPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoHerraOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerraOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoHerraPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoHerraPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoHerra(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadoherraLogic.getEmpleadoHerras().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadoherras.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoHerra.setModel(new EmpleadoHerraModel(this.empleadoherraLogic.getEmpleadoHerras(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoHerra.setModel(new EmpleadoHerraModel(this.empleadoherras,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoHerra!=null && this.jInternalFrameOrderByEmpleadoHerra.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoHerra();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoHerraPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO,empleadoherraConstantesFunciones.resaltarSeleccionarEmpleadoHerra,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoHerraConstantesFunciones.SCLASSWEBTITULO,empleadoherraConstantesFunciones.resaltarSeleccionarEmpleadoHerra,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,EmpleadoHerraConstantesFunciones.LABEL_ID));

		if(this.empleadoherraConstantesFunciones.mostraridEmpleadoHerra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoHerraConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoherraConstantesFunciones.resaltaridEmpleadoHerra,this.empleadoherraConstantesFunciones.activaridEmpleadoHerra,this,true,"idEmpleadoHerra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoherraConstantesFunciones.resaltaridEmpleadoHerra,this.empleadoherraConstantesFunciones.activaridEmpleadoHerra,this,true,"idEmpleadoHerra","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadoherraConstantesFunciones.mostrarid_empresaEmpleadoHerra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadoherraConstantesFunciones.resaltarid_empresaEmpleadoHerra,this,this.empleadoherraConstantesFunciones.activarid_empresaEmpleadoHerra));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadoherraConstantesFunciones.resaltarid_empresaEmpleadoHerra,this,this.empleadoherraConstantesFunciones.activarid_empresaEmpleadoHerra,false,"id_empresaEmpleadoHerra","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoHerraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadoherraConstantesFunciones.mostrarid_empleadoEmpleadoHerra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoherraConstantesFunciones.resaltarid_empleadoEmpleadoHerra,this,this.empleadoherraConstantesFunciones.activarid_empleadoEmpleadoHerra));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoherraConstantesFunciones.resaltarid_empleadoEmpleadoHerra,this,this.empleadoherraConstantesFunciones.activarid_empleadoEmpleadoHerra,true,"id_empleadoEmpleadoHerra","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoHerraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA));

		if(this.empleadoherraConstantesFunciones.mostrarid_herramientaEmpleadoHerra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new HerramientaTableCell(this.herramientasForeignKey,this.empleadoherraConstantesFunciones.resaltarid_herramientaEmpleadoHerra,this,this.empleadoherraConstantesFunciones.activarid_herramientaEmpleadoHerra));
			tableColumn.setCellEditor(new HerramientaTableCell(this.herramientasForeignKey,this.empleadoherraConstantesFunciones.resaltarid_herramientaEmpleadoHerra,this,this.empleadoherraConstantesFunciones.activarid_herramientaEmpleadoHerra,true,"id_herramientaEmpleadoHerra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoHerraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD));

		if(this.empleadoherraConstantesFunciones.mostrarcantidadEmpleadoHerra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoherraConstantesFunciones.resaltarcantidadEmpleadoHerra,this.empleadoherraConstantesFunciones.activarcantidadEmpleadoHerra,this,true,"cantidadEmpleadoHerra","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoherraConstantesFunciones.resaltarcantidadEmpleadoHerra,this.empleadoherraConstantesFunciones.activarcantidadEmpleadoHerra,this,true,"cantidadEmpleadoHerra","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoHerraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.empleadoherraConstantesFunciones.mostraresta_activoEmpleadoHerra && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.empleadoherraConstantesFunciones.resaltaresta_activoEmpleadoHerra,this.empleadoherraConstantesFunciones.activaresta_activoEmpleadoHerra));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.empleadoherraConstantesFunciones.resaltaresta_activoEmpleadoHerra,this.empleadoherraConstantesFunciones.activaresta_activoEmpleadoHerra,this,true,"esta_activoEmpleadoHerra","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoHerraPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoherraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoherraSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoHerra.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoherraSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoherraSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoHerra.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadoherraSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadoherraSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoHerra.addColumn(tableColumn);
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
			
			this.jTableDatosEmpleadoHerra.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoHerra.moveColumn(this.jTableDatosEmpleadoHerra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoHerra.moveColumn(this.jTableDatosEmpleadoHerra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoHerra.moveColumn(this.jTableDatosEmpleadoHerra.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoHerra.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoHerra.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoHerra,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoHerra.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoHerra.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoHerra.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoHerra.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empleadoherraLogic.getEmpleadoHerras().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadoherras.size()-1;
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
		//this.jTableDatosEmpleadoHerra.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoHerra.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoHerra();
			
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
				
				//this.isEsNuevoEmpleadoHerra=false;
					
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
				if(this.empleadoherraSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoHerra==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoHerra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoHerra.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadoherra.getsType().equals("DUPLICADO")
				   || this.empleadoherra.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoHerra=true;
				
				} else {
					this.isEsNuevoEmpleadoHerra=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
					if(this.empleadoherra.getId()>=0 && !this.empleadoherra.getIsNew()) {						
						this.isEsNuevoEmpleadoHerra=false;
						
					} else {
						this.isEsNuevoEmpleadoHerra=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoHerra(esRelaciones);						
				
				this.seleccionarEmpleadoHerra(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadoherra.getId()<0) {
					this.isEsNuevoEmpleadoHerra=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoHerra(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoHerra(evt,rowIndex);
				}	
				
				if(this.empleadoherraSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoHerra: " + this.dDif); 
					}
				}								
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoHerra(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadoherra)) {
					if(this.empleadoherra.getId()>0) {
						this.empleadoherra.setIsDeleted(true);
						
						this.empleadoherrasEliminados.add(this.empleadoherra);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoherraLogic.getEmpleadoHerras().remove(this.empleadoherra);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoherras.remove(this.empleadoherra);				
					}
					
					
					((EmpleadoHerraModel) this.jTableDatosEmpleadoHerra.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoHerra(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoHerra(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoHerra) {
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoHerra.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoHerra.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoHerra(this.empleadoherra);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadoherraConstantesFunciones.cargarid_empresaEmpleadoHerra || this.empleadoherraConstantesFunciones.event_dependid_empresaEmpleadoHerra) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadoherra.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoHerra(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadoherra.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadoherra.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadoherra.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.empleadoherraConstantesFunciones.cargarid_empleadoEmpleadoHerra || this.empleadoherraConstantesFunciones.event_dependid_empleadoEmpleadoHerra) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadoherra.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoHerra(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadoherra.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadoherra.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadoherra.getid_empleado(),false,"Formulario");

					//Herramienta
					if(!this.empleadoherraConstantesFunciones.cargarid_herramientaEmpleadoHerra || this.empleadoherraConstantesFunciones.event_dependid_herramientaEmpleadoHerra) {
						//this.cargarCombosHerramientasForeignKeyLista(" where id="+this.empleadoherra.getid_herramienta());
									//this.inicializarActualizarBindingEmpleadoHerra(false,false);
						this.herramientasForeignKey=new ArrayList<Herramienta>();

						if(empleadoherra.getHerramienta()!=null) {
							this.herramientasForeignKey.add(empleadoherra.getHerramienta());
						}

						this.addItemDefectoCombosForeignKeyHerramienta();
						this.cargarCombosFrameHerramientasForeignKey("Todos");
					}
					this.setActualHerramientaForeignKey(this.empleadoherra.getid_herramienta(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoHerra("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoHerra(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoHerra() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoHerra(EmpleadoHerra empleadoherra) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoHerra(empleadoherra,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoHerra(EmpleadoHerra empleadoherra,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoHerra(empleadoherra);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoHerra(empleadoherra,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoHerra(empleadoherra);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoHerra(EmpleadoHerra empleadoherra) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.setText(empleadoherra.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoHerra.jTextFieldcantidadEmpleadoHerra.setText(empleadoherra.getcantidad().toString());
			this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxesta_activoEmpleadoHerra.setSelected(empleadoherra.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoHerra empleadoherraLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadoherraLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoHerra empleadoherraLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadoherraLocal=this.empleadoherra;
			} else {
				empleadoherraLocal=this.empleadoherraAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadoherraLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoHerra(empleadoherraLocal,true);
					
					if(empleadoherraSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadoherraLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadoherraLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoHerra(EmpleadoHerra empleadoherra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoHerra(empleadoherra,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(empleadoherra);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoHerra(EmpleadoHerra empleadoherra,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoHerra(empleadoherra,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoHerra(EmpleadoHerra empleadoherra,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.getText()==null || this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.getText()=="" || this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.setText("0");
			}

			if(conColumnasBase) {empleadoherra.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoHerraConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelIdEmpleadoHerra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoherra.setcantidad(Integer.parseInt(this.jInternalFrameDetalleFormEmpleadoHerra.jTextFieldcantidadEmpleadoHerra.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelcantidadEmpleadoHerra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoherra.setesta_activo(this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxesta_activoEmpleadoHerra.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoHerra.jLabelesta_activoEmpleadoHerra,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoHerra(EmpleadoHerra empleadoherraBean,EmpleadoHerra empleadoherra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && empleadoherraBean.getid_empleado()!=null && !empleadoherraBean.getid_empleado().equals(-1L))) {empleadoherra.setid_empleado(empleadoherraBean.getid_empleado());}
			if(conDefault || (!conDefault && empleadoherraBean.getid_herramienta()!=null && !empleadoherraBean.getid_herramienta().equals(-1L))) {empleadoherra.setid_herramienta(empleadoherraBean.getid_herramienta());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoHerra(EmpleadoHerra empleadoherraOrigen,EmpleadoHerra empleadoherra,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoherraOrigen.getId()!=null && !empleadoherraOrigen.getId().equals(0L))) {empleadoherra.setId(empleadoherraOrigen.getId());}}
			if(conDefault || (!conDefault && empleadoherraOrigen.getid_empleado()!=null && !empleadoherraOrigen.getid_empleado().equals(-1L))) {empleadoherra.setid_empleado(empleadoherraOrigen.getid_empleado());}
			if(conDefault || (!conDefault && empleadoherraOrigen.getid_herramienta()!=null && !empleadoherraOrigen.getid_herramienta().equals(-1L))) {empleadoherra.setid_herramienta(empleadoherraOrigen.getid_herramienta());}
			if(conDefault || (!conDefault && empleadoherraOrigen.getcantidad()!=null && !empleadoherraOrigen.getcantidad().equals(0))) {empleadoherra.setcantidad(empleadoherraOrigen.getcantidad());}
			if(conDefault || (!conDefault && empleadoherraOrigen.getesta_activo()!=null && !empleadoherraOrigen.getesta_activo().equals(false))) {empleadoherra.setesta_activo(empleadoherraOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoHerra(EmpleadoHerra empleadoherra) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.setText(empleadoherra.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoHerra.jTextFieldcantidadEmpleadoHerra.setText(empleadoherra.getcantidad().toString());
			this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxesta_activoEmpleadoHerra.setSelected(empleadoherra.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoHerra(EmpleadoHerraBean empleadoherraBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.setText(empleadoherraBean.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoHerra.jTextFieldcantidadEmpleadoHerra.setText(empleadoherraBean.getcantidad().toString());
			this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxesta_activoEmpleadoHerra.setSelected(empleadoherraBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoHerra(EmpleadoHerraParameterReturnGeneral empleadoherraReturnGeneral,EmpleadoHerraBean empleadoherraBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoHerra empleadoherraLocal=new EmpleadoHerra();
			
			empleadoherraLocal=empleadoherraReturnGeneral.getEmpleadoHerra();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoherraLocal.getId()!=null && !empleadoherraLocal.getId().equals(0L))) {empleadoherraBean.setId(empleadoherraLocal.getId());}}
			if(conDefault || (!conDefault && empleadoherraLocal.getid_empleado()!=null && !empleadoherraLocal.getid_empleado().equals(-1L))) {empleadoherraBean.setid_empleado(empleadoherraLocal.getid_empleado());}
			if(conDefault || (!conDefault && empleadoherraLocal.getid_herramienta()!=null && !empleadoherraLocal.getid_herramienta().equals(-1L))) {empleadoherraBean.setid_herramienta(empleadoherraLocal.getid_herramienta());}
			if(conDefault || (!conDefault && empleadoherraLocal.getcantidad()!=null && !empleadoherraLocal.getcantidad().equals(0))) {empleadoherraBean.setcantidad(empleadoherraLocal.getcantidad());}
			if(conDefault || (!conDefault && empleadoherraLocal.getesta_activo()!=null && !empleadoherraLocal.getesta_activo().equals(false))) {empleadoherraBean.setesta_activo(empleadoherraLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoHerraGenerico(Long idEmpleadoHerraSeleccionado,JComboBox jComboBoxEmpleadoHerra,List<EmpleadoHerra> empleadoherrasLocal)throws Exception {
		try {
			EmpleadoHerra  empleadoherraTemp=null;

			for(EmpleadoHerra empleadoherraAux:empleadoherrasLocal) {
				if(empleadoherraAux.getId()!=null && empleadoherraAux.getId().equals(idEmpleadoHerraSeleccionado)) {
					empleadoherraTemp=empleadoherraAux;
					break;
				}
			}

			jComboBoxEmpleadoHerra.setSelectedItem(empleadoherraTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoHerraGenerico(JComboBox jComboBoxEmpleadoHerra,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoHerra.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoHerra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoHerra.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoHerra.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoHerra.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoHerra.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoherra=(EmpleadoHerra) empleadoherraLogic.getEmpleadoHerras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoherra =(EmpleadoHerra) empleadoherras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadoherra.getIsNew() && !empleadoherra.getIsChanged() && !empleadoherra.getIsDeleted()) {
				sDescripcion=empleadoherra.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoherra.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadoherra.getIsNew() && !empleadoherra.getIsChanged() && !empleadoherra.getIsDeleted()) {
				sDescripcion=empleadoherra.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoherra.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Herramienta")) {
			//sDescripcion=this.getActualHerramientaForeignKeyDescripcion((Long)value);
			if(!empleadoherra.getIsNew() && !empleadoherra.getIsChanged() && !empleadoherra.getIsDeleted()) {
				sDescripcion=empleadoherra.getherramienta_descripcion();
			} else {
				//sDescripcion=this.getActualHerramientaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoherra.getherramienta_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoHerra empleadoherraRow=new EmpleadoHerra();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoherraRow=(EmpleadoHerra) empleadoherraLogic.getEmpleadoHerras().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoherraRow=(EmpleadoHerra) empleadoherras.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoHerra(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoHerra.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHerra && this.isPermisoNuevoEmpleadoHerra));			
			this.jButtonDuplicarEmpleadoHerra.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoHerra && this.isPermisoDuplicarEmpleadoHerra));			
			this.jButtonCopiarEmpleadoHerra.setVisible((this.isVisibilidadCeldaCopiarEmpleadoHerra && this.isPermisoCopiarEmpleadoHerra));
			this.jButtonVerFormEmpleadoHerra.setVisible((this.isVisibilidadCeldaVerFormEmpleadoHerra && this.isPermisoVerFormEmpleadoHerra));
			
			this.jButtonAbrirOrderByEmpleadoHerra.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHerra && this.isPermisoOrdenEmpleadoHerra));			
			
			this.jButtonNuevoRelacionesEmpleadoHerra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra && this.isPermisoNuevoEmpleadoHerra));			
			this.jButtonNuevoGuardarCambiosEmpleadoHerra.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHerra && this.isPermisoNuevoEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra));
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonModificarEmpleadoHerra.setVisible((this.isVisibilidadCeldaModificarEmpleadoHerra && this.isPermisoActualizarEmpleadoHerra));	
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonActualizarEmpleadoHerra.setVisible((this.isVisibilidadCeldaActualizarEmpleadoHerra && this.isPermisoActualizarEmpleadoHerra));	
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonEliminarEmpleadoHerra.setVisible((this.isVisibilidadCeldaEliminarEmpleadoHerra && this.isPermisoEliminarEmpleadoHerra));
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonCancelarEmpleadoHerra.setVisible(this.isVisibilidadCeldaCancelarEmpleadoHerra);							
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosEmpleadoHerra.setVisible((this.isVisibilidadCeldaGuardarEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoHerra.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHerra && this.isPermisoNuevoEmpleadoHerra));						
			this.jButtonDuplicarToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoHerra && this.isPermisoDuplicarEmpleadoHerra));						
			this.jButtonCopiarToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaCopiarEmpleadoHerra && this.isPermisoCopiarEmpleadoHerra));			
			this.jButtonVerFormToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaVerFormEmpleadoHerra && this.isPermisoVerFormEmpleadoHerra));			
			this.jButtonAbrirOrderByToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHerra && this.isPermisoOrdenEmpleadoHerra));
			this.jButtonNuevoRelacionesToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra && this.isPermisoNuevoEmpleadoHerra));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHerra && this.isPermisoNuevoEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra));			
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonModificarToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaModificarEmpleadoHerra && this.isPermisoActualizarEmpleadoHerra));	
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonActualizarToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaActualizarEmpleadoHerra  && this.isPermisoActualizarEmpleadoHerra));	
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonEliminarToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaEliminarEmpleadoHerra && this.isPermisoEliminarEmpleadoHerra));
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonCancelarToolBarEmpleadoHerra.setVisible(this.isVisibilidadCeldaCancelarEmpleadoHerra);				
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaGuardarEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoHerra.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoHerra.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHerra && this.isPermisoNuevoEmpleadoHerra));			
			this.jMenuItemDuplicarEmpleadoHerra.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoHerra && this.isPermisoDuplicarEmpleadoHerra));			
			this.jMenuItemCopiarEmpleadoHerra.setVisible((this.isVisibilidadCeldaCopiarEmpleadoHerra && this.isPermisoCopiarEmpleadoHerra));			
			this.jMenuItemVerFormEmpleadoHerra.setVisible((this.isVisibilidadCeldaVerFormEmpleadoHerra && this.isPermisoVerFormEmpleadoHerra));			
			this.jMenuItemAbrirOrderByEmpleadoHerra.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHerra && this.isPermisoOrdenEmpleadoHerra));			
			//this.jMenuItemMostrarOcultarEmpleadoHerra.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHerra && this.isPermisoOrdenEmpleadoHerra));
			this.jMenuItemDetalleAbrirOrderByEmpleadoHerra.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHerra && this.isPermisoOrdenEmpleadoHerra));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoHerra.setVisible((this.isVisibilidadCeldaOrdenEmpleadoHerra && this.isPermisoOrdenEmpleadoHerra));			
			this.jMenuItemNuevoRelacionesEmpleadoHerra.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra && this.isPermisoNuevoEmpleadoHerra));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoHerra.setVisible((this.isVisibilidadCeldaNuevoEmpleadoHerra && this.isPermisoNuevoEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra));									
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemModificarEmpleadoHerra.setVisible((this.isVisibilidadCeldaModificarEmpleadoHerra && this.isPermisoActualizarEmpleadoHerra));	
			this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemActualizarEmpleadoHerra.setVisible((this.isVisibilidadCeldaActualizarEmpleadoHerra && this.isPermisoActualizarEmpleadoHerra));	
			this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemEliminarEmpleadoHerra.setVisible((this.isVisibilidadCeldaEliminarEmpleadoHerra && this.isPermisoEliminarEmpleadoHerra));
			this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemCancelarEmpleadoHerra.setVisible(this.isVisibilidadCeldaCancelarEmpleadoHerra);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoHerra.setVisible((this.isVisibilidadCeldaGuardarEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra));						
			this.jMenuItemGuardarCambiosTablaEmpleadoHerra.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoHerra=this.jButtonNuevoEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoHerra=this.jButtonDuplicarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoHerra=this.jButtonCopiarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoHerra=this.jButtonVerFormEmpleadoHerra.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoHerra=this.jButtonAbrirOrderByEmpleadoHerra.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=this.jButtonNuevoRelacionesEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoHerra=this.jButtonModificarEmpleadoHerra.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jButtonActualizarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jButtonEliminarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jButtonCancelarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosEmpleadoHerra.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=this.jButtonGuardarCambiosTablaEmpleadoHerra.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoHerra=this.jButtonNuevoToolBarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=this.jButtonNuevoRelacionesToolBarEmpleadoHerra.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			this.isVisibilidadCeldaModificarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jButtonModificarToolBarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jButtonActualizarToolBarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jButtonEliminarToolBarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jButtonCancelarToolBarEmpleadoHerra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoHerra=this.jButtonGuardarCambiosToolBarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=this.jButtonGuardarCambiosTablaToolBarEmpleadoHerra.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoHerra=this.jMenuItemNuevoEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=this.jMenuItemNuevoRelacionesEmpleadoHerra.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			this.isVisibilidadCeldaModificarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemModificarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemActualizarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemEliminarEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoHerra=this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemCancelarEmpleadoHerra.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoHerra=this.jMenuItemGuardarCambiosEmpleadoHerra.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=this.jMenuItemGuardarCambiosTablaEmpleadoHerra.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoHerra(Boolean esInicializar) {
		if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadoherraSessionBean.getConGuardarRelaciones()) {
				//if(this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoHerra();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoHerra(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoHerra() {
		this.jButtonNuevoEmpleadoHerra.setVisible(this.isPermisoNuevoEmpleadoHerra);			
		this.jButtonDuplicarEmpleadoHerra.setVisible(this.isPermisoDuplicarEmpleadoHerra);			
		this.jButtonCopiarEmpleadoHerra.setVisible(this.isPermisoCopiarEmpleadoHerra);			
		this.jButtonVerFormEmpleadoHerra.setVisible(this.isPermisoVerFormEmpleadoHerra);			
		
		this.jButtonAbrirOrderByEmpleadoHerra.setVisible(this.isPermisoOrdenEmpleadoHerra);					
		
		this.jButtonNuevoRelacionesEmpleadoHerra.setVisible(this.isPermisoNuevoEmpleadoHerra);			
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonModificarEmpleadoHerra.setVisible(this.isPermisoActualizarEmpleadoHerra);	
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonActualizarEmpleadoHerra.setVisible(this.isPermisoActualizarEmpleadoHerra);	
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonEliminarEmpleadoHerra.setVisible(this.isPermisoEliminarEmpleadoHerra);
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonCancelarEmpleadoHerra.setVisible(this.isVisibilidadCeldaCancelarEmpleadoHerra);						
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosEmpleadoHerra.setVisible(this.isPermisoGuardarCambiosEmpleadoHerra);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoHerra.setVisible(this.isPermisoActualizarEmpleadoHerra);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoHerra() {
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonModificarEmpleadoHerra.setVisible(this.isPermisoActualizarEmpleadoHerra);	
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonActualizarEmpleadoHerra.setVisible(this.isPermisoActualizarEmpleadoHerra);	
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonEliminarEmpleadoHerra.setVisible(this.isPermisoEliminarEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonCancelarEmpleadoHerra.setVisible(this.isVisibilidadCeldaCancelarEmpleadoHerra);							
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosEmpleadoHerra.setVisible((this.isVisibilidadCeldaGuardarEmpleadoHerra && this.isPermisoGuardarCambiosEmpleadoHerra));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoHerra() {
		if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoHerra();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoHerra() {
	}
	
	public void jTableDatosEmpleadoHerraListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoHerra(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoHerraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.getempleadoherra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoherra==null) {
						this.empleadoherra = new EmpleadoHerra();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
				}

				if(this.empleadoherra.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadoherra.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoHerra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoHerraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoHerra(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoHerra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoHerra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.getempleadoherra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadoherraLogic.getConnexion());

				if(this.empleadoherra.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadoherra.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoHerra=(TitledBorder)this.jScrollPanelDatosEmpleadoHerra.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoHerra.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoHerraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.getempleadoherra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoherra==null) {
						this.empleadoherra = new EmpleadoHerra();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
				}

				if(this.empleadoherra.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadoherra.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoHerra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoHerraActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderEmpleadoHerra=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosEmpleadoHerra.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderEmpleadoHerra=(TitledBorder)this.jScrollPanelDatosEmpleadoHerra.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoHerra.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoEmpleadoHerraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoHerra(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoHerra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoHerra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.getempleadoherra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadoherraLogic.getConnexion());

				if(this.empleadoherra.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadoherra.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoHerra=(TitledBorder)this.jScrollPanelDatosEmpleadoHerra.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoHerra.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoHerraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.getempleadoherra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoherra==null) {
						this.empleadoherra = new EmpleadoHerra();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
				}

				if(this.empleadoherra.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadoherra.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoHerra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_herramientaEmpleadoHerraUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoherramienta=true;

			idTienePermisoherramienta=this.tienePermisosUsuarioEnPaginaWebEmpleadoHerra(HerramientaConstantesFunciones.CLASSNAME);

			if(idTienePermisoherramienta) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoHerra.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoHerra.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.getempleadoherra(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);

				this.herramientaBeanSwingJInternalFrame=new HerramientaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.herramientaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.herramientaBeanSwingJInternalFrame.getHerramientaLogic().setConnexion(this.empleadoherraLogic.getConnexion());

				if(this.empleadoherra.getid_herramienta()!=null) {
					this.herramientaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.herramientaBeanSwingJInternalFrame.setIdActual(this.empleadoherra.getid_herramienta());
					this.herramientaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.herramientaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.herramientaBeanSwingJInternalFrame.inicializarActualizarBindingTablaHerramienta();
				}

				JInternalFrameBase jinternalFrame =this.herramientaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoHerra=(TitledBorder)this.jScrollPanelDatosEmpleadoHerra.getBorder();
				TitledBorder titledBorderherramienta=(TitledBorder)this.herramientaBeanSwingJInternalFrame.jScrollPanelDatosHerramienta.getBorder();

				titledBorderherramienta.setTitle(titledBorderEmpleadoHerra.getTitle() + " -> Herramienta");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_herramientaEmpleadoHerraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.getempleadoherra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoherra==null) {
						this.empleadoherra = new EmpleadoHerra();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
				}

				if(this.empleadoherra.getid_herramienta()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_herramienta = "+this.empleadoherra.getid_herramienta().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoHerra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtoncantidadEmpleadoHerraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.getempleadoherra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoherra==null) {
						this.empleadoherra = new EmpleadoHerra();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
				}

				if(this.empleadoherra.getcantidad()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where cantidad = "+this.empleadoherra.getcantidad().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoHerra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoEmpleadoHerraBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.getempleadoherra(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoherra==null) {
						this.empleadoherra = new EmpleadoHerra();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);
				}

				if(this.empleadoherra.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.empleadoherra.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoHerra(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoHerra(false,false);

			this.getEmpleadoHerrasFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoHerra(false);

			//if(EmpleadoHerraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoHerra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoHerra(false,false);

			this.getEmpleadoHerrasFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoHerra(false);

			//if(EmpleadoHerraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoHerra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdHerramientaEmpleadoHerraActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoHerra(false,false);

			this.getEmpleadoHerrasFK_IdHerramienta();

			this.inicializarActualizarBindingEmpleadoHerra(false);

			//if(EmpleadoHerraBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoHerra(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoherraLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoHerra() {
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
			this.jInternalFrameDetalleFormEmpleadoHerra.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoHerra.dispose();
			this.jInternalFrameDetalleFormEmpleadoHerra=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoHerra!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoHerra.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoHerra.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoHerra=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoHerra!=null) {
			this.jInternalFrameImportacionEmpleadoHerra.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoHerra.dispose();
			this.jInternalFrameImportacionEmpleadoHerra=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoHerra();
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoHerra")) {
				jButtonNuevoEmpleadoHerraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoHerra")) {
				jButtonDuplicarEmpleadoHerraActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoHerra")) {
				jButtonCopiarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoHerra")) {
				jButtonVerFormEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoHerra")) {
				jButtonNuevoEmpleadoHerraActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoHerra")) {
				jButtonDuplicarEmpleadoHerraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoHerra")) {
				jButtonNuevoEmpleadoHerraActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoHerra")) {
				jButtonDuplicarEmpleadoHerraActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoHerra")) {
				jButtonNuevoEmpleadoHerraActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoHerra")) {
				jButtonNuevoEmpleadoHerraActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoHerra")) {
				jButtonNuevoEmpleadoHerraActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoHerra")) {
				jButtonModificarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoHerra")) {
				jButtonModificarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoHerra")) {
				jButtonModificarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoHerra")) {
				jButtonActualizarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoHerra")) {
				jButtonActualizarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoHerra")) {
				jButtonActualizarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoHerra")) {
				jButtonEliminarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoHerra")) {
				jButtonEliminarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoHerra")) {
				jButtonEliminarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoHerra")) {
				jButtonCancelarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoHerra")) {
				jButtonCancelarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoHerra")) {
				jButtonCancelarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoHerra")) {
				jButtonCerrarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoHerra")) {
				jButtonCerrarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoHerra")) {
				jButtonCerrarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoHerra")) {
				jButtonMostrarOcultarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoHerra")) {
				jButtonCancelarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoHerra")) {
				jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoHerra")) {
				jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoHerra")) {
				jButtonCopiarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoHerra")) {
				jButtonVerFormEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoHerra")) {
				jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoHerra")) {
				jButtonCopiarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoHerra")) {
				jButtonVerFormEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoHerra")) {
				jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoHerra")) {
				jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoHerra")) {
				jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoHerra")) {
				jButtonRecargarInformacionEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoHerra")) {
				jButtonRecargarInformacionEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoHerra")) {
				jButtonRecargarInformacionEmpleadoHerraActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoHerra")) {
				jButtonAnterioresEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoHerra")) {
				jButtonAnterioresEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoHerra")) {
				jButtonAnterioresEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoHerra")) {
				jButtonSiguientesEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoHerra")) {
				jButtonSiguientesEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoHerra")) {
				jButtonSiguientesEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoHerra") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoHerra")) {
				jButtonAbrirOrderByEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoHerra") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoHerra")) {
				jButtonMostrarOcultarEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoHerra")) {
				jButtonNuevoGuardarCambiosEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoHerra")) {
				jButtonNuevoGuardarCambiosEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoHerra")) {
				jButtonNuevoGuardarCambiosEmpleadoHerraActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoHerra")) {
				jButtonCerrarReporteDinamicoEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoHerra")) {
				jButtonGenerarReporteDinamicoEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoHerra")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoHerra")) {
				jButtonCerrarImportacionEmpleadoHerraActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoHerra")) {
				
				jButtonGenerarImportacionEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoHerra")) {
				
				jButtonAbrirImportacionEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoHerra")) {
				jComboBoxTiposAccionesEmpleadoHerraActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoHerra")) {
				jComboBoxTiposRelacionesEmpleadoHerraActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoHerra")) {
				jComboBoxTiposAccionesEmpleadoHerraActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoHerra")) {
				
				jComboBoxTiposSeleccionarEmpleadoHerraActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoHerra")) {
				jTextFieldValorCampoGeneralEmpleadoHerraActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoHerra")) {
				jButtonAbrirOrderByEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoHerra")) {
				jButtonAbrirOrderByEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoHerra")) {
				jButtonCerrarOrderByEmpleadoHerraActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoHerraBusqueda")) {
				this.jButtonidEmpleadoHerraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoHerraUpdate")) {
				this.jButtonid_empresaEmpleadoHerraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoHerraBusqueda")) {
				this.jButtonid_empresaEmpleadoHerraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHerra")) {
				this.jButtonid_empleadoEmpleadoHerraActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHerraUpdate")) {
				this.jButtonid_empleadoEmpleadoHerraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHerraBusqueda")) {
				this.jButtonid_empleadoEmpleadoHerraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_herramientaEmpleadoHerraUpdate")) {
				this.jButtonid_herramientaEmpleadoHerraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_herramientaEmpleadoHerraBusqueda")) {
				this.jButtonid_herramientaEmpleadoHerraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadEmpleadoHerraBusqueda")) {
				this.jButtoncantidadEmpleadoHerraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoEmpleadoHerraBusqueda")) {
				this.jButtonesta_activoEmpleadoHerraBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoEmpleadoHerra")) {
				this.jButtonid_empleadoEmpleadoHerraActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoHerra")) {
				this.jButtonFK_IdEmpleadoEmpleadoHerraActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdHerramientaEmpleadoHerra")) {
				this.jButtonFK_IdHerramientaEmpleadoHerraActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoHerra();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHerraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				


				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoHerra empleadoherraLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadoherraLocal=this.empleadoherra;
			} else {
				empleadoherraLocal=this.empleadoherraAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
							
				
				


				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHerraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
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
			
			


			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHerraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
								
						
				


				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
								
				
				


				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHerraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHerraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHerraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
							
				
				


				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHerraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
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
			
			


			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHerraActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
								
				
				


				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHerraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHerraActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHerraActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoHerra")) {
					jCheckBoxSeleccionarTodosEmpleadoHerraItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoHerra")) {
					jCheckBoxSeleccionadosEmpleadoHerraItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoHerra")) {
					
				}
				
				


				
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
												
				
				


				
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHerraActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHerraActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
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
			
			


			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoHerraActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoherra);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoherra);
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
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
				
				


				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoHerra.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoHerra.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoHerraActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoherraAnterior =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoHerra")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoHerraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoHerra.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadoherra =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadoherra =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadoherra);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoHerra")) {
				
				}
				
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoHerra")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoHerra.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoHerra")) {
			
			}
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoHerra();
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoHerra")) {
				jButtonNuevoEmpleadoHerraActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoHerra")) {
				jButtonDuplicarEmpleadoHerraActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoHerra")) {
				jButtonCopiarEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoHerra")) {
				jButtonVerFormEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoHerra")) {
				jButtonNuevoEmpleadoHerraActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoHerra")) {
				jButtonModificarEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoHerra")) {
				jButtonActualizarEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoHerra")) {
				jButtonEliminarEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoHerra")) {
				jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoHerra")) {
				jButtonCancelarEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoHerra")) {
				jButtonCerrarEmpleadoHerraActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoHerra")) {
				jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoHerra")) {
				jButtonNuevoGuardarCambiosEmpleadoHerraActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoHerra")) {
				jButtonAbrirOrderByEmpleadoHerraActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoHerra")) {
				jButtonRecargarInformacionEmpleadoHerraActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoHerra")) {
				jButtonAnterioresEmpleadoHerraActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoHerra")) {
				jButtonSiguientesEmpleadoHerraActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoHerraBusqueda")) {
				this.jButtonidEmpleadoHerraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoHerraUpdate")) {
				this.jButtonid_empresaEmpleadoHerraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoHerraBusqueda")) {
				this.jButtonid_empresaEmpleadoHerraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHerra")) {
				this.jButtonid_empleadoEmpleadoHerraActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHerraUpdate")) {
				this.jButtonid_empleadoEmpleadoHerraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoHerraBusqueda")) {
				this.jButtonid_empleadoEmpleadoHerraBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_herramientaEmpleadoHerraUpdate")) {
				this.jButtonid_herramientaEmpleadoHerraUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_herramientaEmpleadoHerraBusqueda")) {
				this.jButtonid_herramientaEmpleadoHerraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("cantidadEmpleadoHerraBusqueda")) {
				this.jButtoncantidadEmpleadoHerraBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoEmpleadoHerraBusqueda")) {
				this.jButtonesta_activoEmpleadoHerraBusquedaActionPerformed(evt);
			}
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoHerra();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoHerra")) {
				closingInternalFrameEmpleadoHerra();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoHerra")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoHerra = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoHerraBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoHerraBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoHerra.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoHerraActionPerformed(null);
			}
			
			EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoherra,new Object(),this.empleadoherraParameterGeneral,this.empleadoherraReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoHerra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoHerra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoHerra(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadoherra)) {
			if(!esControlTabla) {
				if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);			
				}
				
				if(this.empleadoherraSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoHerra(this.empleadoherra,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoherraReturnGeneral=empleadoherraLogic.procesarEventosEmpleadoHerrasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoherraLogic.getEmpleadoHerras(),this.empleadoherra,this.empleadoherraParameterGeneral,this.isEsNuevoEmpleadoHerra,classes);//this.empleadoherraLogic.getEmpleadoHerra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoHerra(this.empleadoherraReturnGeneral,this.empleadoherraBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadoherraSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoHerra(classes,this.empleadoherraReturnGeneral,this.empleadoherraBean,false);
					}
						
					if(this.empleadoherraReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoHerra(this.empleadoherraReturnGeneral.getEmpleadoHerra());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoHerra(this.empleadoherraReturnGeneral.getEmpleadoHerra());	
					}
						
					if(this.empleadoherraReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoHerra(this.empleadoherraReturnGeneral.getEmpleadoHerra(),classes);//this.empleadoherraBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoHerra(this.empleadoherra,classes);//this.empleadoherraBean);									
				}
			
				if(EmpleadoHerraJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoHerra(this.empleadoherra,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoHerra(this.empleadoherra);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadoherraAnterior!=null) {
						this.empleadoherra=this.empleadoherraAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoherraReturnGeneral=empleadoherraLogic.procesarEventosEmpleadoHerrasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoherraLogic.getEmpleadoHerras(),this.empleadoherra,this.empleadoherraParameterGeneral,this.isEsNuevoEmpleadoHerra,classes);//this.empleadoherraLogic.getEmpleadoHerra()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoherraSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoherraSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadoherraReturnGeneral.getEmpleadoHerra(),empleadoherraLogic.getEmpleadoHerras());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadoherraReturnGeneral.getEmpleadoHerra(),this.empleadoherras);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoHerra.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoHerra.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoHerra();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoHerra() throws Exception {
		
		EmpleadoHerraModel empleadoherraModel=(EmpleadoHerraModel)this.jTableDatosEmpleadoHerra.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoherraModel.empleadoherras=this.empleadoherraLogic.getEmpleadoHerras();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadoherraModel.empleadoherras=this.empleadoherras;
		}
		
		
		((EmpleadoHerraModel) this.jTableDatosEmpleadoHerra.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoHerra() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadoherraAnterior(),this.empleadoherraLogic.getEmpleadoHerras());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadoherraAnterior(),this.empleadoherras);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoHerra();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoHerra(EmpleadoHerra empleadoherra,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
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
										
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoherra,new Object(),generalEntityParameterGeneral,this.empleadoherraReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadoherraSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoHerraConstantesFunciones.getClassesRelationshipsOfEmpleadoHerra(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoHerraConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoHerra(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoHerra(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoHerraBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoherra,new Object(),generalEntityParameterGeneral,this.empleadoherraReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoHerra(EmpleadoHerraBean empleadoherraBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoHerra(ArrayList<Classe> classes,EmpleadoHerraReturnGeneral empleadoherraReturnGeneral,EmpleadoHerraBean empleadoherraBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoHerra(EmpleadoHerra empleadoherra,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadoherra)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoHerra = new EmpleadoHerraDetalleFormJInternalFrame(jDesktopPane,this.empleadoherraSessionBean.getConGuardarRelaciones(),this.empleadoherraSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoHerra.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoHerra.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoHerra.empleadoherraLogic=this.empleadoherraLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoHerra("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoHerra();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoHerra();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoHerra("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoHerra();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoHerra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoHerra"));
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonModificarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoHerra"));

		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonModificarToolBarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoHerra"));
					
		this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemModificarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoHerra"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonActualizarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoHerra"));
		
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonActualizarToolBarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoHerra"));
						
		this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemActualizarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoHerra"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonEliminarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoHerra"));
		
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonEliminarToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoHerra"));
								
		this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemEliminarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoHerra"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonCancelarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoHerra"));
		
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonCancelarToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoHerra"));
					
		this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemCancelarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoHerra"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemDetalleCerrarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoHerra"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoHerra"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoHerra"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoHerra"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonidEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoHerraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empresaEmpleadoHerraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHerraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empresaEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHerraBusqueda"));
		//jButtonid_empleadoEmpleadoHerra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoHerraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerra.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerra"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_herramientaEmpleadoHerraUpdate.addActionListener(new ButtonActionListener(this,"id_herramientaEmpleadoHerraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_herramientaEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"id_herramientaEmpleadoHerraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtoncantidadEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"cantidadEmpleadoHerraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonesta_activoEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEmpleadoHerraBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoHerra.jTabbedPaneRelacionesEmpleadoHerra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoHerra"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoHerra"));
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoHerra"));
		}
		
		this.jTableDatosEmpleadoHerra.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoHerra"));
		
		this.jTableDatosEmpleadoHerra.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoHerra"));
		
		this.jButtonNuevoEmpleadoHerra.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoHerra"));
		
		this.jButtonDuplicarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoHerra"));
		
		this.jButtonCopiarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoHerra"));
		
		this.jButtonVerFormEmpleadoHerra.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoHerra"));
		
		
		this.jButtonNuevoToolBarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoHerra"));
			
		this.jButtonDuplicarToolBarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoHerra"));
			
		this.jMenuItemNuevoEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoHerra"));
			
		this.jMenuItemDuplicarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoHerra"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoHerra.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoHerra"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoHerra"));
			
		this.jMenuItemNuevoRelacionesEmpleadoHerra.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoHerra"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonModificarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoHerra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonModificarToolBarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoHerra"));
			
			this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemModificarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoHerra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonActualizarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoHerra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonActualizarToolBarEmpleadoHerra.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoHerra"));
				
			this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemActualizarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoHerra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonEliminarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoHerra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonEliminarToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoHerra"));
						
			this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemEliminarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoHerra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonCancelarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoHerra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonCancelarToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoHerra"));
			
			this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemCancelarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoHerra"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoHerra"));		
		
		
		this.jButtonCerrarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoHerra"));
		
		
		this.jButtonCerrarToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoHerra"));
			
		this.jMenuItemCerrarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoHerra"));
			
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jMenuItemDetalleCerrarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoHerra"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosEmpleadoHerra.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoHerra"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoHerra"));
		}
		
		this.jButtonCopiarToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoHerra"));
			
		this.jButtonVerFormToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoHerra"));
		
		this.jMenuItemGuardarCambiosEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoHerra"));
			
		this.jMenuItemCopiarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoHerra"));		
		
		this.jMenuItemVerFormEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoHerra"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoHerra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoHerra"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoHerra"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoHerra.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoHerra"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoHerra.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoHerra"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoHerra"));
		
		this.jMenuItemRecargarInformacionEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoHerra"));		
		
		
		
		this.jButtonAnterioresEmpleadoHerra.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoHerra"));
		
		
		this.jButtonAnterioresToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoHerra"));
		
		this.jMenuItemAnterioresEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoHerra"));		
		
		
		this.jButtonSiguientesEmpleadoHerra.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoHerra"));
		
		
		this.jButtonSiguientesToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoHerra"));
			
		this.jMenuItemSiguientesEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoHerra"));
			
		this.jMenuItemAbrirOrderByEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoHerra"));
			
		this.jMenuItemMostrarOcultarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoHerra"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoHerra"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoHerra"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoHerra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoHerra"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoHerra"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoHerra.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoHerra"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoHerra.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoHerra"));

		this.jCheckBoxSeleccionadosEmpleadoHerra.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoHerra"));
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoHerra"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoHerra.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoHerra"));
			
		this.jComboBoxTiposAccionesEmpleadoHerra.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoHerra"));
					
		this.jComboBoxTiposSeleccionarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoHerra"));
			
		this.jTextFieldValorCampoGeneralEmpleadoHerra.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoHerra"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonidEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoHerraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empresaEmpleadoHerraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHerraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empresaEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHerraBusqueda"));
		//jButtonid_empleadoEmpleadoHerra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoHerraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerra.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerra"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_herramientaEmpleadoHerraUpdate.addActionListener(new ButtonActionListener(this,"id_herramientaEmpleadoHerraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_herramientaEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"id_herramientaEmpleadoHerraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtoncantidadEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"cantidadEmpleadoHerraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonesta_activoEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEmpleadoHerraBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoEmpleadoHerra.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoHerra"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerra"));

			this.jButtonFK_IdHerramientaEmpleadoHerra.addActionListener(new ButtonActionListener(this,"FK_IdHerramientaEmpleadoHerra"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoHerra!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoHerra.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoHerra"));
				this.jInternalFrameReporteDinamicoEmpleadoHerra.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoHerra"));
				this.jInternalFrameReporteDinamicoEmpleadoHerra.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoHerra"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoHerra.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoHerra"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoHerra.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoHerra"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoHerra.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoHerra"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoHerra!=null) {
				this.jInternalFrameImportacionEmpleadoHerra.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoHerra"));
				this.jInternalFrameImportacionEmpleadoHerra.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoHerra"));
				this.jInternalFrameImportacionEmpleadoHerra.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoHerra"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoHerra.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoHerra"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoHerra.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoHerra"));			
			
			if(this.jInternalFrameOrderByEmpleadoHerra!=null) {
				this.jInternalFrameOrderByEmpleadoHerra.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoHerra"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoHerra.jTabbedPaneRelacionesEmpleadoHerra.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoHerra"));
		
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
            		closingInternalFrameEmpleadoHerra();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoHerra.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoHerra = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoHerraBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoHerraBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoHerra.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoHerraActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoHerra.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoHerraListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoHerra.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoHerra.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHerraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHerraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHerraActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoHerra";
		inputMap = this.jButtonNuevoEmpleadoHerra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoHerra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoHerraActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHerraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHerraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoHerraActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoHerra";
		inputMap = this.jButtonNuevoRelacionesEmpleadoHerra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoHerra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoHerraActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoHerra";
		inputMap = this.jButtonModificarEmpleadoHerra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoHerra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoHerraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoHerra";
		inputMap = this.jButtonActualizarEmpleadoHerra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoHerra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoHerraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoHerra";
		inputMap = this.jButtonEliminarEmpleadoHerra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoHerra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoHerraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoHerra";
		inputMap = this.jButtonCancelarEmpleadoHerra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoHerra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoHerraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoHerra";
		inputMap = this.jButtonCerrarEmpleadoHerra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoHerra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoHerraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoHerra";
		inputMap = this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosEmpleadoHerra.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonGuardarCambiosEmpleadoHerra.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoHerraActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoHerra.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoHerraItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoHerra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoHerraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoHerra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoHerraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoHerra.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoHerraActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonidEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoHerraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empresaEmpleadoHerraUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHerraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empresaEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoHerraBusqueda"));
		//jButtonid_empleadoEmpleadoHerra.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoHerraActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerra.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerra"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerraUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerraBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_herramientaEmpleadoHerraUpdate.addActionListener(new ButtonActionListener(this,"id_herramientaEmpleadoHerraUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_herramientaEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"id_herramientaEmpleadoHerraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtoncantidadEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"cantidadEmpleadoHerraBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoHerra.jButtonesta_activoEmpleadoHerraBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEmpleadoHerraBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoEmpleadoHerra.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoHerra"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoHerra.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoHerra"));

		this.jButtonFK_IdHerramientaEmpleadoHerra.addActionListener(new ButtonActionListener(this,"FK_IdHerramientaEmpleadoHerra"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoHerra.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoHerraActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoHerraActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoHerra.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoHerra(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoHerra empleadoherraAux:this.empleadoherraLogic.getEmpleadoHerras()) {
					empleadoherraAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoHerra empleadoherraAux:empleadoherras) {
					empleadoherraAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoHerraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoHerra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoHerra empleadoherraAux:this.empleadoherraLogic.getEmpleadoHerras()) {
						empleadoherraAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoHerra empleadoherraAux:empleadoherras) {
						empleadoherraAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoHerra empleadoherraAux:this.empleadoherraLogic.getEmpleadoHerras()) {
					
						if(sTipoSeleccionar.equals(EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							empleadoherraAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoHerra empleadoherraAux:empleadoherras) {
						
						if(sTipoSeleccionar.equals(EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							empleadoherraAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoHerra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoHerra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoHerra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoHerraItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoHerra(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoHerra.getSelectedRows();
			
			EmpleadoHerra empleadoherraLocal=new EmpleadoHerra();
			
			//this.seleccionarTodosEmpleadoHerra(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoherraLocal =(EmpleadoHerra) this.empleadoherraLogic.getEmpleadoHerras().toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadoherraLocal =(EmpleadoHerra) this.empleadoherras.toArray()[this.jTableDatosEmpleadoHerra.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadoherraLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoHerra empleadoherraAux:this.empleadoherraLogic.getEmpleadoHerras()) {
						empleadoherraAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoHerra empleadoherraAux:empleadoherras) {
						empleadoherraAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoHerra(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoHerra.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoHerra.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoHerra,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoHerraItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoHerraParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoHerraActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoHerra(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoHerra.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoHerra empleadoherraAux:this.empleadoherraLogic.getEmpleadoHerras()) {
				
						if(sTipoSeleccionar.equals(EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							empleadoherraAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoHerra empleadoherraAux:empleadoherras) {
					
						if(sTipoSeleccionar.equals(EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD)) {
							existe=true;
							empleadoherraAux.setcantidad(Integer.parseInt(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoHerra(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoHerraActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoHerra(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoHerra=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoHerra.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoHerra) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoHerra(conSplash);
				
					this.generarReporteEmpleadoHerrasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoHerrasSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoHerrasSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoHerrasSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoHerra();
				
				this.exportarEmpleadoHerrasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoHerras();
				//this.importarEmpleadoHerras();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoHerra();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoHerrasSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Herra", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoHerra();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoHerra)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoHerra(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Herra",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoHerraBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoHerra) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoHerra(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoHerra();
						
						this.generarReporteProcesoAccionEmpleadoHerrasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoHerraBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado HerraS SELECCIONADOS?", "MANTENIMIENTO DE Empleado Herra", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoHerra();
				
						this.actualizarParametrosGeneralEmpleadoHerra();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadoherraReturnGeneral=empleadoherraLogic.procesarAccionEmpleadoHerrasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadoherraLogic.getEmpleadoHerras(),this.empleadoherraParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoHerraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoHerra();
					
					EmpleadoHerraBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoHerraReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoHerra.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxTiposAccionesFormularioEmpleadoHerra.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoHerra(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoHerraActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoHerra();
			
			if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();		
			EmpleadoHerra empleadoherra=new EmpleadoHerra();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoHerra(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoHerra.getSelectedItem();
			
			
			
			
			empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadoherrasSeleccionados.size()==1) {
				for(EmpleadoHerra empleadoherraAux:empleadoherrasSeleccionados) {
					empleadoherra=empleadoherraAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoHerra();
			
      		//this.finishProcessEmpleadoHerra(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoHerraReturnGeneral() throws Exception {
		if(this.empleadoherraReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadoherraReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadoherraReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadoherraReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadoherraReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadoherraReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoHerra(false);
		}
		
		if(this.empleadoherraReturnGeneral.getConRetornoLista() || this.empleadoherraReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadoherraReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoherraLogic.setEmpleadoHerras(this.empleadoherraReturnGeneral.getEmpleadoHerras());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadoherraReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoherraLogic.setEmpleadoHerra(this.empleadoherraReturnGeneral.getEmpleadoHerra());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoHerra(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoHerra() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoHerra> getEmpleadoHerrasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoHerra) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoHerra empleadoherraAux:empleadoherraLogic.getEmpleadoHerras()) {
					if(empleadoherraAux.getIsSelected()) {
						empleadoherrasSeleccionados.add(empleadoherraAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoHerra empleadoherraAux:this.empleadoherras) {
					if(empleadoherraAux.getIsSelected()) {
						empleadoherrasSeleccionados.add(empleadoherraAux);				
					}
				}
			}
			
			if(empleadoherrasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadoherrasSeleccionados.addAll(this.empleadoherraLogic.getEmpleadoHerras());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadoherrasSeleccionados.addAll(this.empleadoherras);				
					}
				}
			}
		} else {
			empleadoherrasSeleccionados.add(this.empleadoherra);
		}
		
		return empleadoherrasSeleccionados;
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
	
	public void generarReporteEmpleadoHerrasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoHerrasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoHerrasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoHerrasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoHerrasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Herra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoHerrasSeleccionados() throws Exception {
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();		
		
		empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoHerras("Todos",empleadoherrasSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoHerrasSeleccionados() throws Exception {
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();		
		
		empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoHerras("Todos",empleadoherrasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoHerrasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();
		
		empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoHerras("Todos",empleadoherrasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoHerrasSeleccionados() throws Exception {
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoHerra();
		
		
		empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoHerra();
		
		
		//this.generarReporteEmpleadoHerras("Todos",empleadoherrasSeleccionados ,empleadoherraImplementable,empleadoherraImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoHerras() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoHerra();
		
		this.abrirFrameImportacionEmpleadoHerra();		
		
			
		//this.generarReporteEmpleadoHerras("Todos",empleadoherrasSeleccionados ,empleadoherraImplementable,empleadoherraImplementableHome);
	}
	
	public void importarEmpleadoHerras() throws Exception {		
	
	}
	
	public void exportarEmpleadoHerrasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoHerrasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoHerrasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoHerrasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Herra",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoHerrasSeleccionados() throws Exception {
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();		
		
		empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoherra."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoHerra(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoHerra empleadoherraAux:empleadoherrasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoHerra(empleadoherraAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadoherraAux.setsDetalleGeneralEntityReporte(empleadoherraAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Herra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoHerra(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoHerraConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoHerraConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoHerra(EmpleadoHerra empleadoherra,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadoherra.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoherra.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoherra.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoherra.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoherra.getherramienta_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoherra.getcantidad().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoherra.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoHerrasSeleccionados() throws Exception {
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();		
		
		empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoherra.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoHerras");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoHerra(row);				
				iRow++;
			}				
			
			for(EmpleadoHerra empleadoherraAux:empleadoherrasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoHerra(empleadoherraAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Herra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoHerrasSeleccionados() throws Exception {
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();		
		
		empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoherra.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadoherras");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadoherra");
			//elementRoot.appendChild(element);
		
			for(EmpleadoHerra empleadoherraAux:empleadoherrasSeleccionados) {
				element = document.createElement("empleadoherra");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoHerra(empleadoherraAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Herra",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoHerra(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoHerra(EmpleadoHerra empleadoherra,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoherra.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoherra.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoherra.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoherra.getherramienta_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoherra.getcantidad());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoherra.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoHerra(EmpleadoHerra empleadoherra,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoHerraConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadoherra.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoHerraConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadoherra.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoHerraConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadoherra.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoHerraConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadoherra.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementherramienta_descripcion = document.createElement(EmpleadoHerraConstantesFunciones.IDHERRAMIENTA);
		elementherramienta_descripcion.appendChild(document.createTextNode(empleadoherra.getherramienta_descripcion()));
		element.appendChild(elementherramienta_descripcion);

		Element elementcantidad = document.createElement(EmpleadoHerraConstantesFunciones.CANTIDAD);
		elementcantidad.appendChild(document.createTextNode(empleadoherra.getcantidad().toString().trim()));
		element.appendChild(elementcantidad);

		Element elementesta_activo = document.createElement(EmpleadoHerraConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(empleadoherra.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoEmpleadoHerrasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoHerra> empleadoherrasSeleccionados=new ArrayList<EmpleadoHerra>();
		
		empleadoherrasSeleccionados=this.getEmpleadoHerrasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoHerra(empleadoherrasSeleccionados);
		
		this.generarReporteEmpleadoHerras("Todos",empleadoherrasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoHerra(ArrayList<EmpleadoHerra> empleadoherrasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoHerra empleadoherraAux:empleadoherrasSeleccionados) {
				empleadoherraAux.setsDetalleGeneralEntityReporte(empleadoherraAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoHerraConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadoherraAux.setsDescripcionGeneralEntityReporte1(empleadoherraAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoHerraConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadoherraAux.setsDescripcionGeneralEntityReporte1(empleadoherraAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoHerraConstantesFunciones.LABEL_IDHERRAMIENTA)) {
					existe=true;
					empleadoherraAux.setsDescripcionGeneralEntityReporte1(empleadoherraAux.getherramienta_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoHerraConstantesFunciones.LABEL_CANTIDAD)) {
					existe=true;
					empleadoherraAux.setsDescripcionGeneralEntityReporte1(empleadoherraAux.getcantidad().toString());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoHerraConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					empleadoherraAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(empleadoherraAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoHerraConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoHerra(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoHerra=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoHerra=false;
			this.isVisibilidadCeldaActualizarEmpleadoHerra=false;
			this.isVisibilidadCeldaEliminarEmpleadoHerra=false;
			this.isVisibilidadCeldaCancelarEmpleadoHerra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoHerra=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=false;
			this.isVisibilidadCeldaModificarEmpleadoHerra=false;
			this.isVisibilidadCeldaActualizarEmpleadoHerra=true;
			this.isVisibilidadCeldaEliminarEmpleadoHerra=false;
			this.isVisibilidadCeldaCancelarEmpleadoHerra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoHerra=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=false;
			this.isVisibilidadCeldaModificarEmpleadoHerra=false;
			this.isVisibilidadCeldaActualizarEmpleadoHerra=true;
			this.isVisibilidadCeldaEliminarEmpleadoHerra=true;
			this.isVisibilidadCeldaCancelarEmpleadoHerra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoHerra=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=false;
			this.isVisibilidadCeldaModificarEmpleadoHerra=false;
			this.isVisibilidadCeldaActualizarEmpleadoHerra=true;
			this.isVisibilidadCeldaEliminarEmpleadoHerra=false;
			this.isVisibilidadCeldaCancelarEmpleadoHerra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoHerra=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=true;
			this.isVisibilidadCeldaModificarEmpleadoHerra=false;
			this.isVisibilidadCeldaActualizarEmpleadoHerra=false;
			this.isVisibilidadCeldaEliminarEmpleadoHerra=false;
			this.isVisibilidadCeldaCancelarEmpleadoHerra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoHerra=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=false;
			this.isVisibilidadCeldaActualizarEmpleadoHerra=false;
			this.isVisibilidadCeldaEliminarEmpleadoHerra=false;
			this.isVisibilidadCeldaCancelarEmpleadoHerra=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoHerra=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=false;
			this.isVisibilidadCeldaModificarEmpleadoHerra=true;
			this.isVisibilidadCeldaActualizarEmpleadoHerra=false;
			this.isVisibilidadCeldaEliminarEmpleadoHerra=false;
			this.isVisibilidadCeldaCancelarEmpleadoHerra=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoHerra=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoHerraJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoHerra=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoHerra(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoHerra=false;
			//this.isVisibilidadCeldaVerFormEmpleadoHerra=false;
			this.isVisibilidadCeldaDuplicarEmpleadoHerra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadoherraSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoHerra=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoHerra=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadoherraSessionBean.getEsGuardarRelacionado()) {
			if(!empleadoherraSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=false;												
			}
			
			this.jButtonCerrarEmpleadoHerra.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoHerra=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadoherra)) {
			this.isVisibilidadCeldaActualizarEmpleadoHerra=false;
			this.isVisibilidadCeldaEliminarEmpleadoHerra=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoHerra() {
	}
	
	public void actualizarEstadoPanelsEmpleadoHerra(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoHerra!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHerra.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHerra!=null) {
				this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHerra!=null) {
				this.jScrollPanelDatosEmpleadoHerra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoHerra!=null) {
				this.jPanelPaginacionEmpleadoHerra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHerra!=null) {
				this.jPanelParametrosReportesEmpleadoHerra.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoHerra!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHerra.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHerra!=null) {
				this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoHerra!=null) {
				this.jScrollPanelDatosEmpleadoHerra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoHerra!=null) {
				this.jPanelPaginacionEmpleadoHerra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHerra!=null) {
				this.jPanelParametrosReportesEmpleadoHerra.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoHerra!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHerra.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHerra!=null) {
				this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHerra!=null) {
				this.jScrollPanelDatosEmpleadoHerra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoHerra!=null) {
				this.jPanelPaginacionEmpleadoHerra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHerra!=null) {
				this.jPanelParametrosReportesEmpleadoHerra.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoHerra!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHerra.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHerra!=null) {
				this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHerra!=null) {
				this.jScrollPanelDatosEmpleadoHerra.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoHerra!=null) {
				this.jPanelPaginacionEmpleadoHerra.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHerra!=null) {
				this.jPanelParametrosReportesEmpleadoHerra.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoHerra!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHerra.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHerra!=null) {
				this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHerra!=null) {
				this.jScrollPanelDatosEmpleadoHerra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoHerra!=null) {
				this.jPanelPaginacionEmpleadoHerra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHerra!=null) {
				this.jPanelParametrosReportesEmpleadoHerra.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoHerra!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHerra.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHerra!=null) {
				this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHerra!=null) {
				this.jScrollPanelDatosEmpleadoHerra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoHerra!=null) {
				this.jPanelPaginacionEmpleadoHerra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHerra!=null) {
				this.jPanelParametrosReportesEmpleadoHerra.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoHerra!=null) {
				this.jScrollPanelDatosEdicionEmpleadoHerra.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHerra!=null) {
				this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoHerra!=null) {
				this.jScrollPanelDatosEmpleadoHerra.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoHerra!=null) {
				this.jPanelPaginacionEmpleadoHerra.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoHerra!=null) {
				this.jPanelParametrosReportesEmpleadoHerra.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoHerra!=null) {
					this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoHerra!=null) {
				this.jPanelParametrosReportesEmpleadoHerra.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadoherraSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoHerra!=null) {
				this.jTabbedPaneBusquedasEmpleadoHerra.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoHerra!=null) {
				this.jPanelParametrosReportesEmpleadoHerra.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoHerra.remove(jPanelFK_IdEmpleadoEmpleadoHerra);}

			this.isVisibilidadFK_IdHerramienta=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdHerramienta) {this.jTabbedPaneBusquedasEmpleadoHerra.remove(jPanelFK_IdHerramientaEmpleadoHerra);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoHerra.remove(jPanelFK_IdEmpleadoEmpleadoHerra);}

			this.isVisibilidadFK_IdHerramienta=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdHerramienta) {this.jTabbedPaneBusquedasEmpleadoHerra.remove(jPanelFK_IdHerramientaEmpleadoHerra);}
		}
		
	}

	public void setVisibilidadBusquedasParaHerramienta(Boolean isParaHerramienta){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaHerramientaNegation=!isParaHerramienta;

			this.isVisibilidadFK_IdEmpleado=isParaHerramientaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoHerra.remove(jPanelFK_IdEmpleadoEmpleadoHerra);}

			this.isVisibilidadFK_IdHerramienta=isParaHerramienta;
			if(!this.isVisibilidadFK_IdHerramienta) {this.jTabbedPaneBusquedasEmpleadoHerra.remove(jPanelFK_IdHerramientaEmpleadoHerra);}
		}
		
	}
	
	
	
	

	public String registrarSesionEmpleadoHerraParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(empleadoherraSessionBean==null) {
				empleadoherraSessionBean=new EmpleadoHerraSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(empleadoherraSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.empleadoherraFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(EmpleadoHerraConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleadoHerra(true);
			//empleadoSessionBean.setlidEmpleadoHerraActual(this.idEmpleadoHerraActual);

			empleadoherraSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoHerra(true);
			empleadoherraSessionBean.setlIdEmpleadoHerraActualForeignKey(this.idEmpleadoHerraActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoHerraSessionBean empleadoherraSessionBean=new EmpleadoHerraSessionBean();
		
		if(this.empleadoherraSessionBean==null) {
			this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
		}
		
		this.empleadoherraSessionBean.setsUltimaBusquedaEmpleadoHerra(this.getsAccionBusqueda());
		this.empleadoherraSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadoherraSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadoherraSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadoherraSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdHerramienta")) {
			empleadoherraSessionBean.setid_herramienta(this.getid_herramientaFK_IdHerramienta());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoHerraSessionBean empleadoherraSessionBean=new EmpleadoHerraSessionBean();
		
		if(this.empleadoherraSessionBean==null) {
			this.empleadoherraSessionBean=new EmpleadoHerraSessionBean();
		}
		
		if(this.empleadoherraSessionBean.getsUltimaBusquedaEmpleadoHerra()!=null&&!this.empleadoherraSessionBean.getsUltimaBusquedaEmpleadoHerra().equals("")) {
			this.setsAccionBusqueda(empleadoherraSessionBean.getsUltimaBusquedaEmpleadoHerra());
			this.setiNumeroPaginacion(empleadoherraSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadoherraSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadoherraSessionBean.getid_empleado());
				empleadoherraSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadoherraSessionBean.getid_empresa());
				empleadoherraSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdHerramienta")) {
				this.setid_herramientaFK_IdHerramienta(empleadoherraSessionBean.getid_herramienta());
				empleadoherraSessionBean.setid_herramienta(-1L);
			}
		}
		
		this.empleadoherraSessionBean.setsUltimaBusquedaEmpleadoHerra("");
		this.empleadoherraSessionBean.setiNumeroPaginacion(EmpleadoHerraConstantesFunciones.INUMEROPAGINACION);
		this.empleadoherraSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoHerra(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoHerra() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoHerra();
		this.updateVisibilidadBusquedasFormularioEmpleadoHerra();
		this.updateHabilitarBusquedasFormularioEmpleadoHerra();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoHerra() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoHerra.getComponents().length>0) {
	

		if(this.empleadoherraConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoHerra!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoHerra.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoHerra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHerra.getComponent(index);
				jPanel.setBorder(this.empleadoherraConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoHerra);
			}
		}

		if(this.empleadoherraConstantesFunciones.resaltarFK_IdHerramientaEmpleadoHerra!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoHerra.indexOfComponent(this.jPanelFK_IdHerramientaEmpleadoHerra);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHerra.getComponent(index);
				jPanel.setBorder(this.empleadoherraConstantesFunciones.resaltarFK_IdHerramientaEmpleadoHerra);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoHerra() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoHerra.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoHerra.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoHerra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHerra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoherraConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoHerra);
			if(!this.empleadoherraConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoHerra && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoHerra.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoHerra.indexOfComponent(this.jPanelFK_IdHerramientaEmpleadoHerra);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHerra.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoherraConstantesFunciones.mostrarFK_IdHerramientaEmpleadoHerra);
			if(!this.empleadoherraConstantesFunciones.mostrarFK_IdHerramientaEmpleadoHerra && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoHerra.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoHerra() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoHerra.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoHerra.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoHerra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHerra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoherraConstantesFunciones.activarFK_IdEmpleadoEmpleadoHerra);
				this.jTabbedPaneBusquedasEmpleadoHerra.setEnabledAt(index,this.empleadoherraConstantesFunciones.activarFK_IdEmpleadoEmpleadoHerra);
			}

			index= this.jTabbedPaneBusquedasEmpleadoHerra.indexOfComponent(this.jPanelFK_IdHerramientaEmpleadoHerra);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHerra.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoherraConstantesFunciones.activarFK_IdHerramientaEmpleadoHerra);
				this.jTabbedPaneBusquedasEmpleadoHerra.setEnabledAt(index,this.empleadoherraConstantesFunciones.activarFK_IdHerramientaEmpleadoHerra);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoHerra(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoHerra.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoHerra);

			this.jTabbedPaneBusquedasEmpleadoHerra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHerra.getComponent(index);

			this.empleadoherraConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoHerra(resaltar);

			jPanel.setBorder(this.empleadoherraConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoHerra);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdHerramienta")) {
			index= this.jTabbedPaneBusquedasEmpleadoHerra.indexOfComponent(this.jPanelFK_IdHerramientaEmpleadoHerra);

			this.jTabbedPaneBusquedasEmpleadoHerra.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoHerra.getComponent(index);

			this.empleadoherraConstantesFunciones.setResaltarFK_IdHerramientaEmpleadoHerra(resaltar);

			jPanel.setBorder(this.empleadoherraConstantesFunciones.resaltarFK_IdHerramientaEmpleadoHerra);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoHerra.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpleadoHerra() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoHerra();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoHerra();
		this.updateHabilitarResaltarControlesFormularioEmpleadoHerra();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoHerra() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadoherraConstantesFunciones.resaltaridEmpleadoHerra!=null && this.jInternalFrameDetalleFormEmpleadoHerra!=null) {this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.setBorder(this.empleadoherraConstantesFunciones.resaltaridEmpleadoHerra);}
		if(this.empleadoherraConstantesFunciones.resaltarid_empresaEmpleadoHerra!=null && this.jInternalFrameDetalleFormEmpleadoHerra!=null) {this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.setBorder(this.empleadoherraConstantesFunciones.resaltarid_empresaEmpleadoHerra);}
		if(this.empleadoherraConstantesFunciones.resaltarid_empleadoEmpleadoHerra!=null && this.jInternalFrameDetalleFormEmpleadoHerra!=null) {this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.setBorder(this.empleadoherraConstantesFunciones.resaltarid_empleadoEmpleadoHerra);}
		if(this.empleadoherraConstantesFunciones.resaltarid_herramientaEmpleadoHerra!=null && this.jInternalFrameDetalleFormEmpleadoHerra!=null) {this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.setBorder(this.empleadoherraConstantesFunciones.resaltarid_herramientaEmpleadoHerra);}
		if(this.empleadoherraConstantesFunciones.resaltarcantidadEmpleadoHerra!=null && this.jInternalFrameDetalleFormEmpleadoHerra!=null) {this.jInternalFrameDetalleFormEmpleadoHerra.jTextFieldcantidadEmpleadoHerra.setBorder(this.empleadoherraConstantesFunciones.resaltarcantidadEmpleadoHerra);}
		if(this.empleadoherraConstantesFunciones.resaltaresta_activoEmpleadoHerra!=null && this.jInternalFrameDetalleFormEmpleadoHerra!=null) {this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxesta_activoEmpleadoHerra.setBorderPainted(true);this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxesta_activoEmpleadoHerra.setBorder(this.empleadoherraConstantesFunciones.resaltaresta_activoEmpleadoHerra);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoHerra() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostraridEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jPanelidEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostraridEmpleadoHerra);
		//this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostrarid_empresaEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jPanelid_empresaEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostrarid_empresaEmpleadoHerra);
		//this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostrarid_empleadoEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jPanelid_empleadoEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostrarid_empleadoEmpleadoHerra);
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostrarid_empleadoEmpleadoHerra);
		//this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostrarid_herramientaEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jPanelid_herramientaEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostrarid_herramientaEmpleadoHerra);
		//this.jInternalFrameDetalleFormEmpleadoHerra.jTextFieldcantidadEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostrarcantidadEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jPanelcantidadEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostrarcantidadEmpleadoHerra);
		//this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxesta_activoEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostraresta_activoEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jPanelesta_activoEmpleadoHerra.setVisible(this.empleadoherraConstantesFunciones.mostraresta_activoEmpleadoHerra);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoHerra() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoHerra==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoHerra!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoHerra.jLabelidEmpleadoHerra.setEnabled(this.empleadoherraConstantesFunciones.activaridEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empresaEmpleadoHerra.setEnabled(this.empleadoherraConstantesFunciones.activarid_empresaEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_empleadoEmpleadoHerra.setEnabled(this.empleadoherraConstantesFunciones.activarid_empleadoEmpleadoHerra);
			this.jInternalFrameDetalleFormEmpleadoHerra.jButtonid_empleadoEmpleadoHerra.setEnabled(this.empleadoherraConstantesFunciones.activarid_empleadoEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jComboBoxid_herramientaEmpleadoHerra.setEnabled(this.empleadoherraConstantesFunciones.activarid_herramientaEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jTextFieldcantidadEmpleadoHerra.setEnabled(this.empleadoherraConstantesFunciones.activarcantidadEmpleadoHerra);
		this.jInternalFrameDetalleFormEmpleadoHerra.jCheckBoxesta_activoEmpleadoHerra.setEnabled(this.empleadoherraConstantesFunciones.activaresta_activoEmpleadoHerra);
		}
	}
	
		
}