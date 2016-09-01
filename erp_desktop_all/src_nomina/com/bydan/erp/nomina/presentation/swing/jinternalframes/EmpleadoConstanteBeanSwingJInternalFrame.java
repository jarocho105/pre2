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

import com.bydan.erp.nomina.util.EmpleadoConstanteConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoConstanteParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoConstanteParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EmpleadoConstanteBean;
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
public class EmpleadoConstanteBeanSwingJInternalFrame extends EmpleadoConstanteJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoConstanteBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoConstante> empleadoconstanteValidator = new ClassValidator<EmpleadoConstante>(EmpleadoConstante.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoConstante empleadoconstante;	
	public EmpleadoConstante empleadoconstanteAux;
	public EmpleadoConstante empleadoconstanteAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoConstante empleadoconstanteTotales;
	public Long idEmpleadoConstanteActual;
	public Long iIdNuevoEmpleadoConstante=0L;
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

	public String sFinalQueryComboConstanteNomi="";

	public List<ConstanteNomi> constantenomisForeignKey;

	public List<ConstanteNomi> getconstantenomisForeignKey() {
		return constantenomisForeignKey;
	}

	public void setconstantenomisForeignKey(List<ConstanteNomi> constantenomisForeignKey) {
		this.constantenomisForeignKey = constantenomisForeignKey;
	}

	//OBJETO FK ACTUAL
	public ConstanteNomi constantenomiForeignKey;

	public ConstanteNomi getconstantenomiForeignKey() {
		return constantenomiForeignKey;
	}

	public void setconstantenomiForeignKey(ConstanteNomi constantenomiForeignKey) {
		this.constantenomiForeignKey = constantenomiForeignKey;
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
	
	public Boolean isPermisoTodoEmpleadoConstante;
	public Boolean isPermisoNuevoEmpleadoConstante;
	public Boolean isPermisoActualizarEmpleadoConstante;
	public Boolean isPermisoActualizarOriginalEmpleadoConstante;
	public Boolean isPermisoEliminarEmpleadoConstante;
	public Boolean isPermisoGuardarCambiosEmpleadoConstante;
	public Boolean isPermisoConsultaEmpleadoConstante;
	public Boolean isPermisoBusquedaEmpleadoConstante;
	public Boolean isPermisoReporteEmpleadoConstante;
	public Boolean isPermisoPaginacionMedioEmpleadoConstante;
	public Boolean isPermisoPaginacionAltoEmpleadoConstante;
	public Boolean isPermisoPaginacionTodoEmpleadoConstante;
	public Boolean isPermisoCopiarEmpleadoConstante;
	public Boolean isPermisoVerFormEmpleadoConstante;
	public Boolean isPermisoDuplicarEmpleadoConstante;
	public Boolean isPermisoOrdenEmpleadoConstante;
	
	
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
	
	public EmpleadoConstanteParameterReturnGeneral empleadoconstanteReturnGeneral;
	public EmpleadoConstanteParameterReturnGeneral empleadoconstanteParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoConstante=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoConstante=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoConstanteSessionBeanAdditional empleadoconstanteSessionBeanAdditional=null;
	
	public EmpleadoConstanteSessionBeanAdditional getEmpleadoConstanteSessionBeanAdditional() {
		return this.empleadoconstanteSessionBeanAdditional;
	}
	
	public void setEmpleadoConstanteSessionBeanAdditional(EmpleadoConstanteSessionBeanAdditional empleadoconstanteSessionBeanAdditional) {
		try {
			this.empleadoconstanteSessionBeanAdditional=empleadoconstanteSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoConstanteBeanSwingJInternalFrameAdditional empleadoconstanteBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoConstanteBeanSwingJInternalFrame
	
	public EmpleadoConstanteBeanSwingJInternalFrameAdditional getEmpleadoConstanteBeanSwingJInternalFrameAdditional() {
		return this.empleadoconstanteBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoConstanteBeanSwingJInternalFrameAdditional(EmpleadoConstanteBeanSwingJInternalFrameAdditional empleadoconstanteBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadoconstanteBeanSwingJInternalFrameAdditional=empleadoconstanteBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoConstanteLogic empleadoconstanteLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoConstante empleadoconstanteBean;
	public EmpleadoConstanteConstantesFunciones empleadoconstanteConstantesFunciones;
	//public EmpleadoConstanteParameterReturnGeneral empleadoconstanteReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public ConstanteNomiLogic constantenomiLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoConstante> empleadoconstantes;	
	//public List<EmpleadoConstante> empleadoconstantesEliminados;
	//public List<EmpleadoConstante> empleadoconstantesAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoConstante=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoConstante=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoConstante=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoConstante=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoConstante=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoConstante=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoConstante=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoConstante=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoConstante=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoConstante=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoConstante=false;	
	
	
	public Boolean isVisibilidadFK_IdConstanteNomi=false;
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	
	public Long getiIdNuevoEmpleadoConstante() {
		return this.iIdNuevoEmpleadoConstante;
	}

	public void setiIdNuevoEmpleadoConstante(Long iIdNuevoEmpleadoConstante) {
		this.iIdNuevoEmpleadoConstante = iIdNuevoEmpleadoConstante;
	}
	
	public Long getidEmpleadoConstanteActual() {
		return this.idEmpleadoConstanteActual;
	}

	public void setidEmpleadoConstanteActual(Long idEmpleadoConstanteActual) {
		this.idEmpleadoConstanteActual = idEmpleadoConstanteActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoConstante getempleadoconstante() {
		return this.empleadoconstante;
	}

	public void setempleadoconstante(EmpleadoConstante empleadoconstante) {
		this.empleadoconstante = empleadoconstante;
	}
	
	public EmpleadoConstante getempleadoconstanteAux() {
		return this.empleadoconstanteAux;
	}

	public void setempleadoconstanteAux(EmpleadoConstante empleadoconstanteAux) {
		this.empleadoconstanteAux = empleadoconstanteAux;
	}				
	
	public EmpleadoConstante getempleadoconstanteAnterior() {
		return this.empleadoconstanteAnterior;
	}

	public void setempleadoconstanteAnterior(EmpleadoConstante empleadoconstanteAnterior) {
		this.empleadoconstanteAnterior = empleadoconstanteAnterior;
	}	
	
	public EmpleadoConstante getempleadoconstanteTotales() {
		return this.empleadoconstanteTotales;
	}

	public void setempleadoconstanteTotales(EmpleadoConstante empleadoconstanteTotales) {
		this.empleadoconstanteTotales = empleadoconstanteTotales;
	}	
	
	public EmpleadoConstante getempleadoconstanteBean() {
		return this.empleadoconstanteBean;
	}

	public void setempleadoconstanteBean(EmpleadoConstante empleadoconstanteBean) {
		this.empleadoconstanteBean = empleadoconstanteBean;
	}	
	
	public EmpleadoConstanteParameterReturnGeneral getempleadoconstanteReturnGeneral() {
		return this.empleadoconstanteReturnGeneral;
	}

	public void setempleadoconstanteReturnGeneral(EmpleadoConstanteParameterReturnGeneral empleadoconstanteReturnGeneral) {
		this.empleadoconstanteReturnGeneral = empleadoconstanteReturnGeneral;
	}	
	
	
	public Long id_constante_nomiFK_IdConstanteNomi=-1L;

	public Long getid_constante_nomiFK_IdConstanteNomi() {
		return this.id_constante_nomiFK_IdConstanteNomi;
	}

	public void setid_constante_nomiFK_IdConstanteNomi(Long id_constante_nomiFK_IdConstanteNomi) {
		this.id_constante_nomiFK_IdConstanteNomi = id_constante_nomiFK_IdConstanteNomi;
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
	
	
	public EmpleadoConstanteLogic getEmpleadoConstanteLogic()	{		
		return empleadoconstanteLogic;
	}

	public void setEmpleadoConstanteLogic(EmpleadoConstanteLogic empleadoconstanteLogic) {
		this.empleadoconstanteLogic = empleadoconstanteLogic;
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
	
	public Boolean getIsEsNuevoEmpleadoConstante() {
		return isEsNuevoEmpleadoConstante;
	}

	public void setIsEsNuevoEmpleadoConstante(Boolean isEsNuevoEmpleadoConstante) {
		this.isEsNuevoEmpleadoConstante = isEsNuevoEmpleadoConstante;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoConstante() {
		return esParaAccionDesdeFormularioEmpleadoConstante;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoConstante(Boolean esParaAccionDesdeFormularioEmpleadoConstante) {
		this.esParaAccionDesdeFormularioEmpleadoConstante = esParaAccionDesdeFormularioEmpleadoConstante;
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

			if(this.empleadoconstanteSessionBean==null) {
				this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
			}

			if(!this.empleadoconstanteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empleadoconstanteSessionBean.getlidEmpresaActual());
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

			if(this.empleadoconstanteSessionBean==null) {
				this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
			}

			if(!this.empleadoconstanteSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(empleadoconstanteSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosConstanteNomisForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.constantenomisForeignKey=new ArrayList<ConstanteNomi>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			ConstanteNomiLogic constantenomiLogic=new ConstanteNomiLogic();

			//constantenomiLogic.getConstanteNomiDataAccess().setIsForForeingKeyData(true);

			if(this.empleadoconstanteSessionBean==null) {
				this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
			}

			if(!this.empleadoconstanteSessionBean.getisBusquedaDesdeForeignKeySesionConstanteNomi()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//constantenomiLogic.getConstanteNomiDataAccess().setIsForForeingKeyData(true);

					constantenomiLogic.getTodosConstanteNomisWithConnection(sFinalQuery,new Pagination());

					this.constantenomisForeignKey=constantenomiLogic.getConstanteNomis();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaConstanteNomi(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					constantenomiLogic.getEntityWithConnection(empleadoconstanteSessionBean.getlidConstanteNomiActual());
					this.constantenomisForeignKey.add(constantenomiLogic.getConstanteNomi());
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

					if(this.empleadoconstante!=null) {
						this.empleadoconstante.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
						this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoConstante.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoConstanteGenerico)throws Exception
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
				jComboBoxid_empresaEmpleadoConstanteGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoConstanteGenerico!=null && jComboBoxid_empresaEmpleadoConstanteGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoConstanteGenerico.setSelectedIndex(0);
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

					if(this.empleadoconstante!=null) {
						this.empleadoconstante.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
						this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoConstante.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoConstanteGenerico)throws Exception
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
				jComboBoxid_empleadoEmpleadoConstanteGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoConstanteGenerico!=null && jComboBoxid_empleadoEmpleadoConstanteGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoConstanteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualConstanteNomiForeignKey(Long idConstanteNomiSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			ConstanteNomi  constantenomiTemp=null;

			for(ConstanteNomi constantenomiAux:constantenomisForeignKey) {
				if(constantenomiAux.getId()!=null && constantenomiAux.getId().equals(idConstanteNomiSeleccionado)) {
					constantenomiTemp=constantenomiAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(constantenomiTemp!=null) {

					if(this.empleadoconstante!=null) {
						this.empleadoconstante.setConstanteNomi(constantenomiTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
						this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.setSelectedItem(constantenomiTemp);
					}
				} else {
					//jComboBoxid_constante_nomiEmpleadoConstante.setSelectedItem(constantenomiTemp);
					if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdConstanteNomi") || sFormularioTipoBusqueda.equals("Todos")){
					if(constantenomiTemp!=null && jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante!=null) {
						jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setSelectedItem(constantenomiTemp);
					} else {
						if(jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante!=null) {
							//jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setSelectedItem(constantenomiTemp);
							if(jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.getItemCount()>0) {
								jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setSelectedIndex(0);
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

	public String getActualConstanteNomiForeignKeyDescripcion(Long idConstanteNomiSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			ConstanteNomi  constantenomiTemp=null;

			for(ConstanteNomi constantenomiAux:constantenomisForeignKey) {
				if(constantenomiAux.getId()!=null && constantenomiAux.getId().equals(idConstanteNomiSeleccionado)) {
					constantenomiTemp=constantenomiAux;
					break;
				}
			}


			sDescripcion=ConstanteNomiConstantesFunciones.getConstanteNomiDescripcion(constantenomiTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualConstanteNomiForeignKeyGenerico(Long idConstanteNomiSeleccionado,JComboBox jComboBoxid_constante_nomiEmpleadoConstanteGenerico)throws Exception
	{
		try
		{
			ConstanteNomi  constantenomiTemp=null;

			for(ConstanteNomi constantenomiAux:constantenomisForeignKey) {
				if(constantenomiAux.getId()!=null && constantenomiAux.getId().equals(idConstanteNomiSeleccionado)) {
					constantenomiTemp=constantenomiAux;
					break;
				}
			}

			if(constantenomiTemp!=null) {
				jComboBoxid_constante_nomiEmpleadoConstanteGenerico.setSelectedItem(constantenomiTemp);
			} else {
				if(jComboBoxid_constante_nomiEmpleadoConstanteGenerico!=null && jComboBoxid_constante_nomiEmpleadoConstanteGenerico.getItemCount()>0) {
					jComboBoxid_constante_nomiEmpleadoConstanteGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoConstante empleadoconstante,JComboBox jComboBoxid_empresaEmpleadoConstanteGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoConstanteGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoConstanteGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadoconstante.setid_empresa(empresaAux.getId());
				empleadoconstante.setempresa_descripcion(EmpleadoConstanteConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadoconstante.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoConstante empleadoconstante,JComboBox jComboBoxid_empleadoEmpleadoConstanteGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoConstanteGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoConstanteGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadoconstante.setid_empleado(empleadoAux.getId());
				empleadoconstante.setempleado_descripcion(EmpleadoConstanteConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadoconstante.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarConstanteNomiForeignKey(EmpleadoConstante empleadoconstante,JComboBox jComboBoxid_constante_nomiEmpleadoConstanteGenerico)throws Exception
	{
		try
		{
			ConstanteNomi  constantenomiAux=new ConstanteNomi();

			if(jComboBoxid_constante_nomiEmpleadoConstanteGenerico==null) {
				constantenomiAux=(ConstanteNomi)this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.getSelectedItem();
			} else {
				constantenomiAux=(ConstanteNomi)jComboBoxid_constante_nomiEmpleadoConstanteGenerico.getSelectedItem();
			}

			if(constantenomiAux!=null && constantenomiAux.getId()!=null) {
				empleadoconstante.setid_constante_nomi(constantenomiAux.getId());
				empleadoconstante.setconstantenomi_descripcion(EmpleadoConstanteConstantesFunciones.getConstanteNomiDescripcion(constantenomiAux));
				empleadoconstante.setConstanteNomi(constantenomiAux);			}
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

					if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { 
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { 
					}

					if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { 
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { 
					}

					if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.addItem(empleado);
							}
						}

						if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameConstanteNomisForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingConstanteNomi=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { 
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.removeAllItems();

							for(ConstanteNomi constantenomi:this.constantenomisForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.addItem(constantenomi);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { 
					}

					if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdConstanteNomi") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.removeAllItems();

							for(ConstanteNomi constantenomi:this.constantenomisForeignKey) {
								this.jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.addItem(constantenomi);
							}
						}

						if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameConstanteNomiForeignKey(ConstanteNomi constantenomi,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.setSelectedItem(constantenomi);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setSelectedItem(constantenomi);
						} else {
							this.jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoConstante() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoConstanteConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoConstante(this.empleadoconstanteLogic.getEmpleadoConstantes());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoConstanteConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoConstante(this.empleadoconstantes);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(ConstanteNomi.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadoconstanteLogic.setEmpleadoConstantes(this.empleadoconstantes);
			empleadoconstanteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpleadoConstanteParameterReturnGeneral getEmpleadoConstanteParameterGeneral() {
		return this.empleadoconstanteParameterGeneral;
	}
	
	public void setEmpleadoConstanteParameterGeneral(EmpleadoConstanteParameterReturnGeneral empleadoconstanteParameterGeneral) {
		this.empleadoconstanteParameterGeneral = empleadoconstanteParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpleadoConstante() {
		return isPermisoTodoEmpleadoConstante;
	}

	public void setIsPermisoTodoEmpleadoConstante(Boolean isPermisoTodoEmpleadoConstante) {
		this.isPermisoTodoEmpleadoConstante = isPermisoTodoEmpleadoConstante;
	}

	public Boolean getIsPermisoNuevoEmpleadoConstante() {
		return isPermisoNuevoEmpleadoConstante;
	}

	public void setIsPermisoNuevoEmpleadoConstante(Boolean isPermisoNuevoEmpleadoConstante) {
		this.isPermisoNuevoEmpleadoConstante = isPermisoNuevoEmpleadoConstante;
	}

	public Boolean getIsPermisoActualizarEmpleadoConstante() {
		return isPermisoActualizarEmpleadoConstante;
	}

	public void setIsPermisoActualizarEmpleadoConstante(Boolean isPermisoActualizarEmpleadoConstante) {
		this.isPermisoActualizarEmpleadoConstante = isPermisoActualizarEmpleadoConstante;
	}

	public Boolean getIsPermisoEliminarEmpleadoConstante() {
		return isPermisoEliminarEmpleadoConstante;
	}

	public void setIsPermisoEliminarEmpleadoConstante(Boolean isPermisoEliminarEmpleadoConstante) {
		this.isPermisoEliminarEmpleadoConstante = isPermisoEliminarEmpleadoConstante;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoConstante() {
		return isPermisoGuardarCambiosEmpleadoConstante;
	}

	public void setIsPermisoGuardarCambiosEmpleadoConstante(Boolean isPermisoGuardarCambiosEmpleadoConstante) {
		this.isPermisoGuardarCambiosEmpleadoConstante = isPermisoGuardarCambiosEmpleadoConstante;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoConstante() {
		return isPermisoConsultaEmpleadoConstante;
	}

	public void setIsPermisoConsultaEmpleadoConstante(Boolean isPermisoConsultaEmpleadoConstante) {
		this.isPermisoConsultaEmpleadoConstante = isPermisoConsultaEmpleadoConstante;
	}

	public Boolean getIsPermisoBusquedaEmpleadoConstante() {
		return isPermisoBusquedaEmpleadoConstante;
	}

	public void setIsPermisoBusquedaEmpleadoConstante(Boolean isPermisoBusquedaEmpleadoConstante) {
		this.isPermisoBusquedaEmpleadoConstante = isPermisoBusquedaEmpleadoConstante;
	}

	public Boolean getIsPermisoReporteEmpleadoConstante() {
		return isPermisoReporteEmpleadoConstante;
	}

	public void setIsPermisoReporteEmpleadoConstante(Boolean isPermisoReporteEmpleadoConstante) {
		this.isPermisoReporteEmpleadoConstante = isPermisoReporteEmpleadoConstante;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoConstante() {
		return isPermisoPaginacionMedioEmpleadoConstante;
	}

	public void setIsPermisoPaginacionMedioEmpleadoConstante(Boolean isPermisoPaginacionMedioEmpleadoConstante) {
		this.isPermisoPaginacionMedioEmpleadoConstante = isPermisoPaginacionMedioEmpleadoConstante;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoConstante() {
		return isPermisoPaginacionTodoEmpleadoConstante;
	}

	public void setIsPermisoPaginacionTodoEmpleadoConstante(Boolean isPermisoPaginacionTodoEmpleadoConstante) {
		this.isPermisoPaginacionTodoEmpleadoConstante = isPermisoPaginacionTodoEmpleadoConstante;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoConstante() {
		return isPermisoPaginacionAltoEmpleadoConstante;
	}

	public void setIsPermisoPaginacionAltoEmpleadoConstante(Boolean isPermisoPaginacionAltoEmpleadoConstante) {
		this.isPermisoPaginacionAltoEmpleadoConstante = isPermisoPaginacionAltoEmpleadoConstante;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoConstante() {
		return isPermisoCopiarEmpleadoConstante;
	}

	public void setIsPermisoCopiarEmpleadoConstante(Boolean isPermisoCopiarEmpleadoConstante) {
		this.isPermisoCopiarEmpleadoConstante = isPermisoCopiarEmpleadoConstante;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoConstante() {
		return isPermisoVerFormEmpleadoConstante;
	}

	public void setIsPermisoVerFormEmpleadoConstante(Boolean isPermisoVerFormEmpleadoConstante) {
		this.isPermisoVerFormEmpleadoConstante = isPermisoVerFormEmpleadoConstante;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoConstante() {
		return isPermisoDuplicarEmpleadoConstante;
	}

	public void setIsPermisoDuplicarEmpleadoConstante(Boolean isPermisoDuplicarEmpleadoConstante) {
		this.isPermisoDuplicarEmpleadoConstante = isPermisoDuplicarEmpleadoConstante;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoConstante() {
		return isPermisoOrdenEmpleadoConstante;
	}

	public void setIsPermisoOrdenEmpleadoConstante(Boolean isPermisoOrdenEmpleadoConstante) {
		this.isPermisoOrdenEmpleadoConstante = isPermisoOrdenEmpleadoConstante;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoConstante() {
		return isVisibilidadCeldaNuevoEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoConstante(Boolean isVisibilidadCeldaNuevoEmpleadoConstante) {
		this.isVisibilidadCeldaNuevoEmpleadoConstante = isVisibilidadCeldaNuevoEmpleadoConstante;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoConstante() {
		return isVisibilidadCeldaDuplicarEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoConstante(Boolean isVisibilidadCeldaDuplicarEmpleadoConstante) {
		this.isVisibilidadCeldaDuplicarEmpleadoConstante = isVisibilidadCeldaDuplicarEmpleadoConstante;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoConstante() {
		return isVisibilidadCeldaCopiarEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoConstante(Boolean isVisibilidadCeldaCopiarEmpleadoConstante) {
		this.isVisibilidadCeldaCopiarEmpleadoConstante = isVisibilidadCeldaCopiarEmpleadoConstante;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoConstante() {
		return isVisibilidadCeldaVerFormEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoConstante(Boolean isVisibilidadCeldaVerFormEmpleadoConstante) {
		this.isVisibilidadCeldaVerFormEmpleadoConstante = isVisibilidadCeldaVerFormEmpleadoConstante;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoConstante() {
		return isVisibilidadCeldaOrdenEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoConstante(Boolean isVisibilidadCeldaOrdenEmpleadoConstante) {
		this.isVisibilidadCeldaOrdenEmpleadoConstante = isVisibilidadCeldaOrdenEmpleadoConstante;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoConstante() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoConstante(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoConstante) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante = isVisibilidadCeldaNuevoRelacionesEmpleadoConstante;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoConstante() {
		return isVisibilidadCeldaModificarEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoConstante(Boolean isVisibilidadCeldaModificarEmpleadoConstante) {
		this.isVisibilidadCeldaModificarEmpleadoConstante = isVisibilidadCeldaModificarEmpleadoConstante;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoConstante() {
		return isVisibilidadCeldaActualizarEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoConstante(Boolean isVisibilidadCeldaActualizarEmpleadoConstante) {
		this.isVisibilidadCeldaActualizarEmpleadoConstante = isVisibilidadCeldaActualizarEmpleadoConstante;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoConstante() {
		return isVisibilidadCeldaEliminarEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoConstante(Boolean isVisibilidadCeldaEliminarEmpleadoConstante) {
		this.isVisibilidadCeldaEliminarEmpleadoConstante = isVisibilidadCeldaEliminarEmpleadoConstante;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoConstante() {
		return isVisibilidadCeldaCancelarEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoConstante(Boolean isVisibilidadCeldaCancelarEmpleadoConstante) {
		this.isVisibilidadCeldaCancelarEmpleadoConstante = isVisibilidadCeldaCancelarEmpleadoConstante;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoConstante() {
		return isVisibilidadCeldaGuardarEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoConstante(Boolean isVisibilidadCeldaGuardarEmpleadoConstante) {
		this.isVisibilidadCeldaGuardarEmpleadoConstante = isVisibilidadCeldaGuardarEmpleadoConstante;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoConstante() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoConstante;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoConstante(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoConstante) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante = isVisibilidadCeldaGuardarCambiosEmpleadoConstante;
	}
		
	public EmpleadoConstanteSessionBean getempleadoconstanteSessionBean() {
		return this.empleadoconstanteSessionBean;
	}
	
	public void setempleadoconstanteSessionBean(EmpleadoConstanteSessionBean empleadoconstanteSessionBean) {
		this.empleadoconstanteSessionBean=empleadoconstanteSessionBean;
	}
	
	
	public Boolean getisVisibilidadFK_IdConstanteNomi() {
		return this.isVisibilidadFK_IdConstanteNomi;
	}

	public void setisVisibilidadFK_IdConstanteNomi(Boolean isVisibilidadFK_IdConstanteNomi) {
		this.isVisibilidadFK_IdConstanteNomi=isVisibilidadFK_IdConstanteNomi;
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

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(EmpleadoConstante empleadoconstante)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadoconstante,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadoconstante,null);
				this.setActualParaGuardarConstanteNomiForeignKey(empleadoconstante,null);
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
	
	public void bugActualizarReferenciaActual(EmpleadoConstante empleadoconstante,EmpleadoConstante empleadoconstanteAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoConstante(empleadoconstante);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadoconstanteAux.setId(empleadoconstante.getId());
		empleadoconstanteAux.setVersionRow(empleadoconstante.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoConstante();
		
			int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadoconstanteValidator.getInvalidValues(this.empleadoconstante);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadoconstanteLogic.setDatosCliente(datosCliente);
			empleadoconstanteLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadoconstanteAux=new  EmpleadoConstante();
				
				empleadoconstanteAux.setIsNew(true);
				empleadoconstanteAux.setIsChanged(true);
				
				empleadoconstanteAux.setEmpleadoConstanteOriginal(this.empleadoconstante);
				
				empleadoconstanteAux.setId(this.empleadoconstante.getId());	
				empleadoconstanteAux.setVersionRow(this.empleadoconstante.getVersionRow());	
				empleadoconstanteAux.setid_empresa(this.empleadoconstante.getid_empresa());	
				empleadoconstanteAux.setid_empleado(this.empleadoconstante.getid_empleado());	
				empleadoconstanteAux.setid_constante_nomi(this.empleadoconstante.getid_constante_nomi());	
				empleadoconstanteAux.setvalor(this.empleadoconstante.getvalor());	
				empleadoconstanteAux.setesta_activo(this.empleadoconstante.getesta_activo());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoconstanteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadoconstanteAux,empleadoconstanteLogic.getEmpleadoConstantes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoconstanteAux,empleadoconstantes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoconstanteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstanteLogic.saveEmpleadoConstantes();//WithConnection
						//empleadoconstanteLogic.getSetVersionRowEmpleadoConstantes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoconstante,empleadoconstanteAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoConstante();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoconstanteLogic.saveEmpleadoConstanteRelaciones(empleadoconstanteAux);//WithConnection
								//empleadoconstanteLogic.getSetVersionRowEmpleadoConstantes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoconstante,empleadoconstanteAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoconstanteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoconstanteAux,empleadoconstanteLogic.getEmpleadoConstantes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoconstanteAux,empleadoconstantes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoconstante,empleadoconstanteAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadoconstanteAux=new  EmpleadoConstante();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado() 
					|| (this.empleadoconstanteSessionBean.getEsGuardarRelacionado() && this.empleadoconstante.getId()>=0)) {
						
					empleadoconstanteAux.setIsNew(false);
				}
				
				empleadoconstanteAux.setIsDeleted(false);
			
				empleadoconstanteAux.setId(this.empleadoconstante.getId());	
				empleadoconstanteAux.setVersionRow(this.empleadoconstante.getVersionRow());	
				empleadoconstanteAux.setid_empresa(this.empleadoconstante.getid_empresa());	
				empleadoconstanteAux.setid_empleado(this.empleadoconstante.getid_empleado());	
				empleadoconstanteAux.setid_constante_nomi(this.empleadoconstante.getid_constante_nomi());	
				empleadoconstanteAux.setvalor(this.empleadoconstante.getvalor());	
				empleadoconstanteAux.setesta_activo(this.empleadoconstante.getesta_activo());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoconstanteAux,empleadoconstanteLogic.getEmpleadoConstantes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoconstanteAux,empleadoconstantes);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoconstanteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstanteLogic.saveEmpleadoConstantes();//WithConnection
						//empleadoconstanteLogic.getSetVersionRowEmpleadoConstantes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoconstante,empleadoconstanteAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoConstante();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoconstanteLogic.saveEmpleadoConstanteRelaciones(empleadoconstanteAux);//WithConnection
								//empleadoconstanteLogic.getSetVersionRowEmpleadoConstantes();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoconstante,empleadoconstanteAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoconstanteSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoconstanteAux,empleadoconstanteLogic.getEmpleadoConstantes());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoconstanteAux,empleadoconstantes);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoconstante,empleadoconstanteAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadoconstanteAux=new  EmpleadoConstante();
				
				empleadoconstanteAux.setIsNew(false);
				empleadoconstanteAux.setIsChanged(false);
				
				empleadoconstanteAux.setIsDeleted(true);
				
				empleadoconstanteAux.setId(this.empleadoconstante.getId());	
				empleadoconstanteAux.setVersionRow(this.empleadoconstante.getVersionRow());	
				empleadoconstanteAux.setid_empresa(this.empleadoconstante.getid_empresa());	
				empleadoconstanteAux.setid_empleado(this.empleadoconstante.getid_empleado());	
				empleadoconstanteAux.setid_constante_nomi(this.empleadoconstante.getid_constante_nomi());	
				empleadoconstanteAux.setvalor(this.empleadoconstante.getvalor());	
				empleadoconstanteAux.setesta_activo(this.empleadoconstante.getesta_activo());	
				
				if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadoconstanteAux.getId()>=0) {	
						this.empleadoconstantesEliminados.add(empleadoconstanteAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadoconstanteAux,empleadoconstanteLogic.getEmpleadoConstantes());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoconstanteAux,empleadoconstantes);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoconstanteSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstanteLogic.saveEmpleadoConstantes();//WithConnection
						//empleadoconstanteLogic.getSetVersionRowEmpleadoConstantes();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoconstanteLogic.saveEmpleadoConstanteRelaciones(empleadoconstanteAux);//WithConnection
								//empleadoconstanteLogic.getSetVersionRowEmpleadoConstantes();//WithConnection
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
							if(this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadoconstanteSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadoconstanteAux,empleadoconstanteLogic.getEmpleadoConstantes());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadoconstanteAux,empleadoconstantes);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.getEmpleadoConstantes().addAll(this.empleadoconstantesEliminados);
					
					empleadoconstanteLogic.saveEmpleadoConstantes();//WithConnection
					//empleadoconstanteLogic.getSetVersionRowEmpleadoConstantes();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoConstante();
				
				this.empleadoconstantesEliminados= new ArrayList<EmpleadoConstante>();		
			}
			
			if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Constante GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Constante",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadoconstante=empleadoconstanteAux;
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
      		//this.finishProcessEmpleadoConstante();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoConstante empleadoconstanteLocal) throws Exception {
		
		if(this.empleadoconstanteSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoConstante empleadoconstanteLocal) throws Exception {	
		if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadoconstanteLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadoconstanteLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(ConstanteNomiDetalleFormJInternalFrame.class)) {
				ConstanteNomiBeanSwingJInternalFrame constantenomiBeanSwingJInternalFrameLocal=(ConstanteNomiBeanSwingJInternalFrame) ((ConstanteNomiDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				constantenomiBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoConstanteNomi(constantenomiBeanSwingJInternalFrameLocal.getconstantenomi(),true);
				constantenomiBeanSwingJInternalFrameLocal.actualizarLista(constantenomiBeanSwingJInternalFrameLocal.constantenomi,this.constantenomisForeignKey);

				constantenomiBeanSwingJInternalFrameLocal.actualizarRelaciones(constantenomiBeanSwingJInternalFrameLocal.constantenomi);

				empleadoconstanteLocal.setConstanteNomi(constantenomiBeanSwingJInternalFrameLocal.constantenomi);

				this.addItemDefectoCombosForeignKeyConstanteNomi();
				this.cargarCombosFrameConstanteNomisForeignKey("Formulario");
				this.setActualConstanteNomiForeignKey(constantenomiBeanSwingJInternalFrameLocal.constantenomi.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoConstanteActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadoconstanteValidator.getInvalidValues(this.empleadoconstante);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoConstante empleadoconstante,List<EmpleadoConstante> empleadoconstantes) throws Exception {
		try	{		
			EmpleadoConstanteConstantesFunciones.actualizarLista(empleadoconstante,empleadoconstantes,this.empleadoconstanteSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoConstante empleadoconstante,List<EmpleadoConstante> empleadoconstantes) throws Exception {
		try	{			
			EmpleadoConstanteConstantesFunciones.actualizarSelectedLista(empleadoconstante,empleadoconstantes);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoConstante> empleadoconstantesLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadoconstantesLocal=this.empleadoconstanteLogic.getEmpleadoConstantes();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadoconstantesLocal=this.empleadoconstantes;
			}
			//ARCHITECTURE
		
			for(EmpleadoConstante empleadoconstanteLocal:empleadoconstantesLocal) {
				if(this.permiteMantenimiento(empleadoconstanteLocal) && empleadoconstanteLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpleadoConstanteConstantesFunciones.getEmpleadoConstanteLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoConstanteConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelid_empresaEmpleadoConstante,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoConstanteConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelid_empleadoEmpleadoConstante,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoConstanteConstantesFunciones.IDCONSTANTENOMI)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelid_constante_nomiEmpleadoConstante,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoConstanteConstantesFunciones.VALOR)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelvalorEmpleadoConstante,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoConstanteConstantesFunciones.ESTAACTIVO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelesta_activoEmpleadoConstante,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelid_empresaEmpleadoConstante,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelid_empleadoEmpleadoConstante,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelid_constante_nomiEmpleadoConstante,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelvalorEmpleadoConstante,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelesta_activoEmpleadoConstante,"");
		
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
		this.iIdNuevoEmpleadoConstante--;	
		
		
		this.empleadoconstanteAux=new EmpleadoConstante();
		
		this.empleadoconstanteAux.setId(this.iIdNuevoEmpleadoConstante);
		this.empleadoconstanteAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoconstanteLogic.getEmpleadoConstantes().add(this.empleadoconstanteAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadoconstantes.add(this.empleadoconstanteAux);
		}
		//ARCHITECTURE
		
		this.empleadoconstante=this.empleadoconstanteAux;
		
		if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoConstante(this.empleadoconstante);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoConstante(this.empleadoconstante);
		}
				
		//this.setDefaultControlesEmpleadoConstante();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoConstante();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoConstante();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoConstante();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoConstante(this.empleadoconstanteBean,this.empleadoconstante,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadoconstanteSessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoConstanteConstantesFunciones.getClassesRelationshipsOfEmpleadoConstante(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadoconstanteReturnGeneral=empleadoconstanteLogic.procesarEventosEmpleadoConstantesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoconstanteLogic.getEmpleadoConstantes(),this.empleadoconstante,this.empleadoconstanteParameterGeneral,this.isEsNuevoEmpleadoConstante,classes);//this.empleadoconstanteLogic.getEmpleadoConstante()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoConstante(this.empleadoconstanteReturnGeneral,this.empleadoconstanteBean,false);
		
		if(this.empleadoconstanteReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoConstante(this.empleadoconstanteReturnGeneral.getEmpleadoConstante());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoConstante(this.empleadoconstanteReturnGeneral.getEmpleadoConstante());
		}
		
		if(this.empleadoconstanteReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoConstante(this.empleadoconstanteReturnGeneral.getEmpleadoConstante(),classes);//this.empleadoconstanteBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoConstante();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoConstante();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoConstante(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoConstante(false);
						
			if(empleadoconstanteSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoConstante();
			}
			
			this.actualizarVisualTableDatosEmpleadoConstante();
			
			this.jTableDatosEmpleadoConstante.setRowSelectionInterval(this.getIndiceNuevoEmpleadoConstante(), this.getIndiceNuevoEmpleadoConstante());
			
			this.seleccionarFilaTablaEmpleadoConstanteActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoConstante("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoConstante(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jTextFieldvalorEmpleadoConstante.setEnabled(isHabilitar && this.empleadoconstanteConstantesFunciones.activarvalorEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxesta_activoEmpleadoConstante.setEnabled(isHabilitar && this.empleadoconstanteConstantesFunciones.activaresta_activoEmpleadoConstante);	
		//
		this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.setEnabled(isHabilitar && this.empleadoconstanteConstantesFunciones.activarid_empresaEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.setEnabled(isHabilitar && this.empleadoconstanteConstantesFunciones.activarid_empleadoEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.setEnabled(isHabilitar && this.empleadoconstanteConstantesFunciones.activarid_constante_nomiEmpleadoConstante);
	};
	
	public void setDefaultControlesEmpleadoConstante() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoConstante(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadoconstanteSessionBean.setConGuardarRelaciones(true);			
			this.empleadoconstanteSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoConstante.jTabbedPaneRelacionesEmpleadoConstante.setVisible(true);
			
					
		} else {
			//this.empleadoconstanteSessionBean.setConGuardarRelaciones(false);			
			this.empleadoconstanteSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoConstante.jTabbedPaneRelacionesEmpleadoConstante.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoConstante() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstanteLogic.getEmpleadoConstantes()) {
				if(empleadoconstanteAux.getId().equals(this.iIdNuevoEmpleadoConstante)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstantes) {
				if(empleadoconstanteAux.getId().equals(this.iIdNuevoEmpleadoConstante)) {
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
	
	public int getIndiceActualEmpleadoConstante(EmpleadoConstante empleadoconstante,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstanteLogic.getEmpleadoConstantes()) {
				if(empleadoconstanteAux.getId().equals(empleadoconstante.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstantes) {
				if(empleadoconstanteAux.getId().equals(empleadoconstante.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpleadoConstante(EmpleadoConstante empleadoconstanteOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstanteLogic.getEmpleadoConstantes()) {
				if(empleadoconstanteAux.getEmpleadoConstanteOriginal().getId().equals(empleadoconstanteOriginal.getId())) {
					existe=true;
					empleadoconstanteOriginal.setId(empleadoconstanteAux.getId());
					empleadoconstanteOriginal.setVersionRow(empleadoconstanteAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstantes) {
				if(empleadoconstanteAux.getEmpleadoConstanteOriginal().getId().equals(empleadoconstanteOriginal.getId())) {
					existe=true;
					empleadoconstanteOriginal.setId(empleadoconstanteAux.getId());
					empleadoconstanteOriginal.setVersionRow(empleadoconstanteAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoConstante(Boolean esParaCancelar) throws Exception {
		empleadoconstantesAux=new ArrayList<EmpleadoConstante>();
		empleadoconstanteAux=new EmpleadoConstante();
		
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstanteLogic.getEmpleadoConstantes()) {
					if(empleadoconstanteAux.getId()<0) {
						empleadoconstantesAux.add(empleadoconstanteAux);
					}		
				}
				this.iIdNuevoEmpleadoConstante=0L;
				this.empleadoconstanteLogic.getEmpleadoConstantes().removeAll(empleadoconstantesAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstantes) {
					if(empleadoconstanteAux.getId()<0) {
						empleadoconstantesAux.add(empleadoconstanteAux);
					}		
				}
				this.iIdNuevoEmpleadoConstante=0L;
				this.empleadoconstantes.removeAll(empleadoconstantesAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoConstante 
					&& this.empleadoconstanteLogic.getEmpleadoConstantes().size()>0
					) {
					empleadoconstanteAux=this.empleadoconstanteLogic.getEmpleadoConstantes().get(this.empleadoconstanteLogic.getEmpleadoConstantes().size() - 1);
				
					if(empleadoconstanteAux.getId()<0) {
						this.empleadoconstanteLogic.getEmpleadoConstantes().remove(empleadoconstanteAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoConstante && this.empleadoconstantes.size()>0) {
					empleadoconstanteAux=this.empleadoconstantes.get(this.empleadoconstantes.size() - 1);
				
					if(empleadoconstanteAux.getId()<0) {
						this.empleadoconstantes.remove(empleadoconstanteAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoConstante(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadoconstante.getId()<0) {
				this.empleadoconstanteLogic.getEmpleadoConstantes().remove(this.empleadoconstante);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadoconstante.getId()<0) {
				this.empleadoconstantes.remove(this.empleadoconstante);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoConstante(List<EmpleadoConstante> empleadoconstantesAux) throws Exception {
		EmpleadoConstanteConstantesFunciones.setEstadosInicialesEmpleadoConstante(empleadoconstantesAux);
	}
	
	public void setEstadosInicialesEmpleadoConstante(EmpleadoConstante empleadoconstanteAux) throws Exception {
		EmpleadoConstanteConstantesFunciones.setEstadosInicialesEmpleadoConstante(empleadoconstanteAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoConstanteActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoConstante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoConstanteActual()) {
				if(!this.isEsNuevoEmpleadoConstante) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoConstante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoConstante=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoConstanteActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Constante ?", "MANTENIMIENTO DE Empleado Constante", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoConstante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoConstante empleadoconstante) throws Exception {
		EmpleadoConstanteConstantesFunciones.seleccionarAsignar(this.empleadoconstante,empleadoconstante);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoConstante=this.isPermisoActualizarOriginalEmpleadoConstante;
			
			
			this.seleccionarAsignar(empleadoconstante);
			
			
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoConstanteConstantesFunciones.quitarEspaciosEmpleadoConstante(this.empleadoconstante,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoConstante("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadoconstanteSessionBean.setsFuncionBusquedaRapida(this.empleadoconstanteSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	
	public void cancelar() throws Exception {
		this.cancelar(true);
	}
	
	public void cancelar(Boolean esParaCancelar) throws Exception {
		try {
														
			
			//SE UTILIZA COLUMNA ELIMINAR EN TABLA
			if(this.isEsNuevoEmpleadoConstante) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoConstante(esParaCancelar);				
				this.cancelarNuevoEmpleadoConstante(esParaCancelar);								
			}
			
			this.empleadoconstante=new EmpleadoConstante();
			
			this.inicializarEmpleadoConstante();
			
			this.actualizarEstadoCeldasBotonesEmpleadoConstante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoConstante() throws Exception {
		try {
			EmpleadoConstanteConstantesFunciones.inicializarEmpleadoConstante(this.empleadoconstante);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadoconstanteLogic.getEmpleadoConstantes().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoConstantes(String sAccionBusqueda,List<EmpleadoConstante> empleadoconstantesParaReportes) throws Exception {
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
					sPathReporteFinal="EmpleadoConstante"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoConstanteMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoConstanteMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoConstante"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empleado Constantes");		
		parameters.put("busquedapor", EmpleadoConstanteConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoConstante=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoConstanteConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoConstanteConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoConstante=new JRBeanArrayDataSource(EmpleadoConstanteJInternalFrame.TraerEmpleadoConstanteBeans(empleadoconstantesParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoConstante);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoConstanteConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoConstanteConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoConstanteBean.TraerEmpleadoConstanteBeans(empleadoconstantesParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpleadoConstantes(sAccionBusqueda,sTipoArchivoReporte,empleadoconstantesParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoConstantes(sAccionBusqueda,sTipoArchivoReporte,empleadoconstantesParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoConstanteActionPerformed(null);
					//this.generarExcelReporteEmpleadoConstantes(sAccionBusqueda,sTipoArchivoReporte,empleadoconstantesParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoConstantes(sAccionBusqueda,sTipoArchivoReporte,empleadoconstantesParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoConstantes(sAccionBusqueda,sTipoArchivoReporte,empleadoconstantesParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoConstantes(sAccionBusqueda,sTipoArchivoReporte,empleadoconstantesParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoConstantes(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoConstante> empleadoconstantesParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoconstante";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoConstantes");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoConstante("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoConstante empleadoconstante : empleadoconstantesParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoConstanteConstantesFunciones.generarExcelReporteDataEmpleadoConstante("NORMAL",row,workbook,empleadoconstante,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Constante",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoConstante(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoConstanteConstantesFunciones.generarExcelReporteHeaderEmpleadoConstante(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoConstantes(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoConstante> empleadoconstantesParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoconstante_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoConstantes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoConstante empleadoconstante : empleadoconstantesParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoConstanteConstantesFunciones.getEmpleadoConstanteDescripcion(empleadoconstante));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoconstante.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoconstante.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoconstante.getconstantenomi_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoConstanteConstantesFunciones.LABEL_VALOR))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_VALOR);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoconstante.getvalor());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(empleadoconstante.getesta_activo()));


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Constante",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoConstantes(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoConstante> empleadoconstantesParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoConstante> empleadoconstantesRespaldo=null;
		
		classes=EmpleadoConstanteConstantesFunciones.getClassesRelationshipsOfEmpleadoConstante(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadoconstanteLogic.setDatosCliente(this.datosCliente);
		this.empleadoconstanteLogic.setDatosDeep(this.datosDeep);
		this.empleadoconstanteLogic.setIsConDeep(true);
		
		empleadoconstantesRespaldo=this.empleadoconstanteLogic.getEmpleadoConstantes();
		
		this.empleadoconstanteLogic.setEmpleadoConstantes(empleadoconstantesParaReportes);	
		this.empleadoconstanteLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadoconstantesParaReportes=this.empleadoconstanteLogic.getEmpleadoConstantes();
		this.empleadoconstanteLogic.setEmpleadoConstantes(empleadoconstantesRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoconstante_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoConstantes");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoConstante("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoConstante empleadoconstante : empleadoconstantesParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoConstante("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoConstanteConstantesFunciones.generarExcelReporteDataEmpleadoConstante("NORMAL",row,workbook,empleadoconstante,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoConstanteConstantesFunciones.getEmpleadoConstanteDescripcion(empleadoconstante));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Constante",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoConstante() throws Exception {		
		this.startProcessEmpleadoConstante(true);
	}
	
	public void startProcessEmpleadoConstante(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoConstante ,this.jPanelParametrosReportesEmpleadoConstante, this.jScrollPanelDatosEmpleadoConstante,this.jPanelPaginacionEmpleadoConstante, this.jScrollPanelDatosEdicionEmpleadoConstante, this.jPanelAccionesEmpleadoConstante,this.jPanelAccionesFormularioEmpleadoConstante,this.jmenuBarEmpleadoConstante,this.jmenuBarDetalleEmpleadoConstante,this.jTtoolBarEmpleadoConstante,this.jTtoolBarDetalleEmpleadoConstante);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoConstante=this.jTabbedPaneBusquedasEmpleadoConstante; 
		
		final JPanel jPanelParametrosReportesEmpleadoConstante=this.jPanelParametrosReportesEmpleadoConstante;
		//final JScrollPane jScrollPanelDatosEmpleadoConstante=this.jScrollPanelDatosEmpleadoConstante;
		final JTable jTableDatosEmpleadoConstante=this.jTableDatosEmpleadoConstante;		
		final JPanel jPanelPaginacionEmpleadoConstante=this.jPanelPaginacionEmpleadoConstante;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoConstante=this.jScrollPanelDatosEdicionEmpleadoConstante;
		final JPanel jPanelAccionesEmpleadoConstante=this.jPanelAccionesEmpleadoConstante;
		
		JPanel jPanelCamposAuxiliarEmpleadoConstante=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoConstante=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			jPanelCamposAuxiliarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jPanelCamposEmpleadoConstante;
			jPanelAccionesFormularioAuxiliarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jPanelAccionesFormularioEmpleadoConstante;
		}
		
		final JPanel jPanelCamposEmpleadoConstante=jPanelCamposAuxiliarEmpleadoConstante;
		final JPanel jPanelAccionesFormularioEmpleadoConstante=jPanelAccionesFormularioAuxiliarEmpleadoConstante;
		
		
		final JMenuBar jmenuBarEmpleadoConstante=this.jmenuBarEmpleadoConstante;
		final JToolBar jTtoolBarEmpleadoConstante=this.jTtoolBarEmpleadoConstante;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoConstante=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoConstante=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			jmenuBarDetalleAuxiliarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jmenuBarDetalleEmpleadoConstante;
			jTtoolBarDetalleAuxiliarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jTtoolBarDetalleEmpleadoConstante;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoConstante=jmenuBarDetalleAuxiliarEmpleadoConstante;
		final JToolBar jTtoolBarDetalleEmpleadoConstante=jTtoolBarDetalleAuxiliarEmpleadoConstante;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoConstante;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoConstante;
			processRunnable.jTableDatos=jTableDatosEmpleadoConstante;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoConstante;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoConstante;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoConstante;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoConstante;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoConstante;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoConstante;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoConstante;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoConstante;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoConstante ,jPanelParametrosReportesEmpleadoConstante,jTableDatosEmpleadoConstante, /*jScrollPanelDatosEmpleadoConstante,*/jPanelCamposEmpleadoConstante,jPanelPaginacionEmpleadoConstante, /*jScrollPanelDatosEdicionEmpleadoConstante,*/ jPanelAccionesEmpleadoConstante,jPanelAccionesFormularioEmpleadoConstante,jmenuBarEmpleadoConstante,jmenuBarDetalleEmpleadoConstante,jTtoolBarEmpleadoConstante,jTtoolBarDetalleEmpleadoConstante);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoConstante ,jPanelParametrosReportesEmpleadoConstante, jScrollPanelDatosEmpleadoConstante,jPanelPaginacionEmpleadoConstante, jScrollPanelDatosEdicionEmpleadoConstante, jPanelAccionesEmpleadoConstante,jPanelAccionesFormularioEmpleadoConstante,jmenuBarEmpleadoConstante,jmenuBarDetalleEmpleadoConstante,jTtoolBarEmpleadoConstante,jTtoolBarDetalleEmpleadoConstante);
						
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
	
	public void finishProcessEmpleadoConstante() {// throws Exception 
		this.finishProcessEmpleadoConstante(true);
	}
	
	public void finishProcessEmpleadoConstante(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoConstante ,this.jPanelParametrosReportesEmpleadoConstante, this.jScrollPanelDatosEmpleadoConstante,this.jPanelPaginacionEmpleadoConstante, this.jScrollPanelDatosEdicionEmpleadoConstante, this.jPanelAccionesEmpleadoConstante,this.jPanelAccionesFormularioEmpleadoConstante,this.jmenuBarEmpleadoConstante,this.jmenuBarDetalleEmpleadoConstante,this.jTtoolBarEmpleadoConstante,this.jTtoolBarDetalleEmpleadoConstante);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoConstante=this.jTabbedPaneBusquedasEmpleadoConstante; 
		
		final JPanel jPanelParametrosReportesEmpleadoConstante=this.jPanelParametrosReportesEmpleadoConstante;
		//final JScrollPane jScrollPanelDatosEmpleadoConstante=this.jScrollPanelDatosEmpleadoConstante;
		final JTable jTableDatosEmpleadoConstante=this.jTableDatosEmpleadoConstante;		
		final JPanel jPanelPaginacionEmpleadoConstante=this.jPanelPaginacionEmpleadoConstante;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoConstante=this.jScrollPanelDatosEdicionEmpleadoConstante;
		final JPanel jPanelAccionesEmpleadoConstante=this.jPanelAccionesEmpleadoConstante;
		
		JPanel jPanelCamposAuxiliarEmpleadoConstante=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoConstante=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			jPanelCamposAuxiliarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jPanelCamposEmpleadoConstante;
			jPanelAccionesFormularioAuxiliarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jPanelAccionesFormularioEmpleadoConstante;
		}
		
		final JPanel jPanelCamposEmpleadoConstante=jPanelCamposAuxiliarEmpleadoConstante;
		final JPanel jPanelAccionesFormularioEmpleadoConstante=jPanelAccionesFormularioAuxiliarEmpleadoConstante;
		
		
		final JMenuBar jmenuBarEmpleadoConstante=this.jmenuBarEmpleadoConstante;		
		final JToolBar jTtoolBarEmpleadoConstante=this.jTtoolBarEmpleadoConstante;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoConstante=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoConstante=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			jmenuBarDetalleAuxiliarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jmenuBarDetalleEmpleadoConstante;
			jTtoolBarDetalleAuxiliarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jTtoolBarDetalleEmpleadoConstante;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoConstante=jmenuBarDetalleAuxiliarEmpleadoConstante;
		final JToolBar jTtoolBarDetalleEmpleadoConstante=jTtoolBarDetalleAuxiliarEmpleadoConstante;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoConstante;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoConstante;
			processRunnable.jTableDatos=jTableDatosEmpleadoConstante;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoConstante;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoConstante;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoConstante;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoConstante;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoConstante;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoConstante;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoConstante;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoConstante;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoConstante ,jPanelParametrosReportesEmpleadoConstante, jTableDatosEmpleadoConstante,/*jScrollPanelDatosEmpleadoConstante,*/jPanelCamposEmpleadoConstante,jPanelPaginacionEmpleadoConstante, /*jScrollPanelDatosEdicionEmpleadoConstante,*/ jPanelAccionesEmpleadoConstante,jPanelAccionesFormularioEmpleadoConstante,jmenuBarEmpleadoConstante,jmenuBarDetalleEmpleadoConstante,jTtoolBarEmpleadoConstante,jTtoolBarDetalleEmpleadoConstante));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoConstante(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoConstante(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoConstante(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoConstante(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoConstante,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoConstante,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoConstante(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoConstante,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoConstante,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadoconstanteConstantesFunciones.getsFinalQueryEmpleadoConstante();
		String  finalQueryPaginacionTodos=this.empleadoconstanteConstantesFunciones.getsFinalQueryEmpleadoConstante();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoConstanteConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoConstante(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoConstanteConstantesFunciones.getArrayColumnasGlobalesEmpleadoConstante(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoConstanteConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadoconstantesEliminados= new ArrayList<EmpleadoConstante>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoConstante();
		
				///*EmpleadoConstanteSessionBean*/this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
			
			if(this.empleadoconstanteSessionBean==null) {
				this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
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
					this.iNumeroPaginacion=EmpleadoConstanteConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoConstanteConstantesFunciones.getClassesForeignKeysOfEmpleadoConstante(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadoconstante."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadoconstantesAux= new ArrayList<EmpleadoConstante>();
			
				
			empleadoconstanteLogic.setDatosCliente(this.datosCliente);
			empleadoconstanteLogic.setDatosDeep(this.datosDeep);
			empleadoconstanteLogic.setIsConDeep(true);
			
			
			empleadoconstanteLogic.getEmpleadoConstanteDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadoconstanteLogic.getTodosEmpleadoConstantes(finalQueryGlobal,pagination);
					
					//empleadoconstanteLogic.getTodosEmpleadoConstantesWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadoconstanteLogic.getEmpleadoConstantes()==null|| empleadoconstanteLogic.getEmpleadoConstantes().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoconstantesAux= new ArrayList<EmpleadoConstante>();
							empleadoconstantesAux.addAll(empleadoconstanteLogic.getEmpleadoConstantes());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoconstantesAux= new ArrayList<EmpleadoConstante>();
							empleadoconstantesAux.addAll(empleadoconstantes);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoconstanteLogic.getTodosEmpleadoConstantes(finalQueryGlobal+"",this.pagination);												
							
							//empleadoconstanteLogic.getTodosEmpleadoConstantesWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoConstantes("Todos",empleadoconstanteLogic.getEmpleadoConstantes() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoconstanteLogic.setEmpleadoConstantes(new ArrayList<EmpleadoConstante>());					
							empleadoconstanteLogic.getEmpleadoConstantes().addAll(empleadoconstantesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoconstantes=new ArrayList<EmpleadoConstante>();
							empleadoconstantes.addAll(empleadoconstantesAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoConstante=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoConstante=this.idActual;
				
				} else if(this.idEmpleadoConstanteActual!=null && this.idEmpleadoConstanteActual!=0L) {
					idEmpleadoConstante=idEmpleadoConstanteActual;
				}
				
					
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndicePorId(idEmpleadoConstante);
				
				this.empleadoconstantes=new ArrayList<EmpleadoConstante>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadoconstanteLogic.getEntity(idEmpleadoConstante);
					
					//empleadoconstanteLogic.getEntityWithConnection(idEmpleadoConstante);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoconstanteLogic.setEmpleadoConstantes(new ArrayList<EmpleadoConstante>());
					empleadoconstanteLogic.getEmpleadoConstantes().add(empleadoconstanteLogic.getEmpleadoConstante());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoconstantes=new ArrayList<EmpleadoConstante>();
					this.empleadoconstantes.add(empleadoconstante);
				}
				
				if(empleadoconstanteLogic.getEmpleadoConstante()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdConstanteNomi")) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdConstanteNomi(id_constante_nomiFK_IdConstanteNomi);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoconstanteLogic.getEmpleadoConstantesFK_IdConstanteNomi(finalQueryGlobal,pagination,id_constante_nomiFK_IdConstanteNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdConstanteNomi(id_constante_nomiFK_IdConstanteNomi);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdConstanteNomi(id_constante_nomiFK_IdConstanteNomi);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoconstanteLogic.getEmpleadoConstantes()==null||empleadoconstanteLogic.getEmpleadoConstantes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoconstantes==null|| empleadoconstantes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstantesAux=new ArrayList<EmpleadoConstante>();
						empleadoconstantesAux.addAll(empleadoconstanteLogic.getEmpleadoConstantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoconstantesAux=new ArrayList<EmpleadoConstante>();
							empleadoconstantesAux.addAll(empleadoconstantes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoconstanteLogic.getEmpleadoConstantesFK_IdConstanteNomi(finalQueryGlobal,pagination,id_constante_nomiFK_IdConstanteNomi);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdConstanteNomi(id_constante_nomiFK_IdConstanteNomi);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdConstanteNomi(id_constante_nomiFK_IdConstanteNomi);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoConstantes("FK_IdConstanteNomi",empleadoconstanteLogic.getEmpleadoConstantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoConstantes("FK_IdConstanteNomi",empleadoconstantes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstanteLogic.setEmpleadoConstantes(new ArrayList<EmpleadoConstante>());
						empleadoconstanteLogic.getEmpleadoConstantes().addAll(empleadoconstantesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoconstantes=new ArrayList<EmpleadoConstante>();
							empleadoconstantes.addAll(empleadoconstantesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoconstanteLogic.getEmpleadoConstantesFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoconstanteLogic.getEmpleadoConstantes()==null||empleadoconstanteLogic.getEmpleadoConstantes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoconstantes==null|| empleadoconstantes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstantesAux=new ArrayList<EmpleadoConstante>();
						empleadoconstantesAux.addAll(empleadoconstanteLogic.getEmpleadoConstantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoconstantesAux=new ArrayList<EmpleadoConstante>();
							empleadoconstantesAux.addAll(empleadoconstantes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoconstanteLogic.getEmpleadoConstantesFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoConstantes("FK_IdEmpleado",empleadoconstanteLogic.getEmpleadoConstantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoConstantes("FK_IdEmpleado",empleadoconstantes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstanteLogic.setEmpleadoConstantes(new ArrayList<EmpleadoConstante>());
						empleadoconstanteLogic.getEmpleadoConstantes().addAll(empleadoconstantesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoconstantes=new ArrayList<EmpleadoConstante>();
							empleadoconstantes.addAll(empleadoconstantesAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoconstanteLogic.getEmpleadoConstantesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoconstanteLogic.getEmpleadoConstantes()==null||empleadoconstanteLogic.getEmpleadoConstantes().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoconstantes==null|| empleadoconstantes.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstantesAux=new ArrayList<EmpleadoConstante>();
						empleadoconstantesAux.addAll(empleadoconstanteLogic.getEmpleadoConstantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoconstantesAux=new ArrayList<EmpleadoConstante>();
							empleadoconstantesAux.addAll(empleadoconstantes);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoconstanteLogic.getEmpleadoConstantesFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoConstanteConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoConstantes("FK_IdEmpresa",empleadoconstanteLogic.getEmpleadoConstantes());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoConstantes("FK_IdEmpresa",empleadoconstantes);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstanteLogic.setEmpleadoConstantes(new ArrayList<EmpleadoConstante>());
						empleadoconstanteLogic.getEmpleadoConstantes().addAll(empleadoconstantesAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoconstantes=new ArrayList<EmpleadoConstante>();
							empleadoconstantes.addAll(empleadoconstantesAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoConstante();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoConstante();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoconstanteLogic.getEmpleadoConstantes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoconstantes.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoconstanteLogic.getEmpleadoConstantes().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoconstantes.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoConstante empleadoconstante) {
		Boolean permite=true;
		
		if(this.empleadoconstante.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoConstanteConstantesFunciones.getOrderByListaEmpleadoConstante();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoConstanteConstantesFunciones.getOrderByListaEmpleadoConstante();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoConstante empleadoconstante:empleadoconstanteLogic.getEmpleadoConstantes()) {
				if(empleadoconstante.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoconstanteTotales=empleadoconstante;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoConstante empleadoconstante:this.empleadoconstantes) {
				if(empleadoconstante.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoconstanteTotales=empleadoconstante;
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
			this.empleadoconstanteAux=new EmpleadoConstante();
			this.empleadoconstanteAux.setsType(Constantes2.S_TOTALES);
			this.empleadoconstanteAux.setIsNew(false);
			this.empleadoconstanteAux.setIsChanged(false);
			this.empleadoconstanteAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoConstanteConstantesFunciones.TotalizarValoresFilaEmpleadoConstante(this.empleadoconstanteLogic.getEmpleadoConstantes(),this.empleadoconstanteAux);
				
				this.empleadoconstanteLogic.getEmpleadoConstantes().add(this.empleadoconstanteAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoConstanteConstantesFunciones.TotalizarValoresFilaEmpleadoConstante(this.empleadoconstantes,this.empleadoconstanteAux);
				
				this.empleadoconstantes.add(this.empleadoconstanteAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadoconstanteTotales=new EmpleadoConstante();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoconstanteLogic.getEmpleadoConstantes().remove(empleadoconstanteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoconstantes.remove(empleadoconstanteTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadoconstanteTotales=new EmpleadoConstante();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoConstante empleadoconstante:empleadoconstanteLogic.getEmpleadoConstantes()) {
				if(empleadoconstante.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoconstanteTotales=empleadoconstante;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoConstanteConstantesFunciones.TotalizarValoresFilaEmpleadoConstante(this.empleadoconstanteLogic.getEmpleadoConstantes(),empleadoconstanteTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoConstante empleadoconstante:this.empleadoconstantes) {
				if(empleadoconstante.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoconstanteTotales=empleadoconstante;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoConstanteConstantesFunciones.TotalizarValoresFilaEmpleadoConstante(this.empleadoconstantes,empleadoconstanteTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoConstantesFK_IdConstanteNomi()throws Exception {
		try {
			sAccionBusqueda="FK_IdConstanteNomi";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoConstantesFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoConstantesFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoConstantesFK_IdConstanteNomi(String sFinalQuery,Long id_constante_nomi)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoconstanteLogic.getEmpleadoConstantesFK_IdConstanteNomi(sFinalQuery,this.pagination,id_constante_nomi);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoConstantesFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoconstanteLogic.getEmpleadoConstantesFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoConstantesFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoconstanteLogic.getEmpleadoConstantesFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
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
	
	public void inicializarPermisosEmpleadoConstante() {
		this.isPermisoTodoEmpleadoConstante=false;
		this.isPermisoNuevoEmpleadoConstante=false;
		this.isPermisoActualizarEmpleadoConstante=false;
		this.isPermisoActualizarOriginalEmpleadoConstante=false;
		this.isPermisoEliminarEmpleadoConstante=false;
		this.isPermisoGuardarCambiosEmpleadoConstante=false;
		this.isPermisoConsultaEmpleadoConstante=false;
		this.isPermisoBusquedaEmpleadoConstante=false;
		this.isPermisoReporteEmpleadoConstante=false;		
		this.isPermisoOrdenEmpleadoConstante=false;		
		this.isPermisoPaginacionMedioEmpleadoConstante=false;		
		this.isPermisoPaginacionAltoEmpleadoConstante=false;
		this.isPermisoPaginacionTodoEmpleadoConstante=false;
		this.isPermisoCopiarEmpleadoConstante=false;		
		this.isPermisoVerFormEmpleadoConstante=false;		
		this.isPermisoDuplicarEmpleadoConstante=false;		
		this.isPermisoOrdenEmpleadoConstante=false;		
	}
	
	public void setPermisosUsuarioEmpleadoConstante(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoConstante=isPermiso;
		this.isPermisoNuevoEmpleadoConstante=isPermiso;
		this.isPermisoActualizarEmpleadoConstante=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoConstante=isPermiso;
		this.isPermisoEliminarEmpleadoConstante=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoConstante=isPermiso;
		this.isPermisoConsultaEmpleadoConstante=isPermiso;
		this.isPermisoBusquedaEmpleadoConstante=isPermiso;
		this.isPermisoReporteEmpleadoConstante=isPermiso;
		this.isPermisoOrdenEmpleadoConstante=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoConstante=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoConstante=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoConstante=isPermiso;		
		this.isPermisoCopiarEmpleadoConstante=isPermiso;		
		this.isPermisoVerFormEmpleadoConstante=isPermiso;		
		this.isPermisoDuplicarEmpleadoConstante=isPermiso;
		this.isPermisoOrdenEmpleadoConstante=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoConstante(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoConstante=isPermiso;
		this.isPermisoNuevoEmpleadoConstante=isPermiso;
		this.isPermisoActualizarEmpleadoConstante=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoConstante=isPermiso;
		this.isPermisoEliminarEmpleadoConstante=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoConstante=isPermiso;
		//this.isPermisoConsultaEmpleadoConstante=isPermiso;
		//this.isPermisoBusquedaEmpleadoConstante=isPermiso;
		//this.isPermisoReporteEmpleadoConstante=isPermiso;
		//this.isPermisoOrdenEmpleadoConstante=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoConstante=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoConstante=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoConstante=isPermiso;		
		//this.isPermisoCopiarEmpleadoConstante=isPermiso;		
		//this.isPermisoDuplicarEmpleadoConstante=isPermiso;
		//this.isPermisoOrdenEmpleadoConstante=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoConstanteClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoConstanteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoConstante(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoConstanteClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoConstanteClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoConstanteClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoConstanteClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoConstante() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoConstanteJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoConstanteConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoConstante=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoConstante=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoConstante=this.isPermisoActualizarEmpleadoConstante;
			this.isPermisoEliminarEmpleadoConstante=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoConstante=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoConstante=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoConstante=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoConstante=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoConstante=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoConstante=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoConstante=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoConstante=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoConstante=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoConstante=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoConstante=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoConstante=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoConstante=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoConstante.setToolTipText(this.jTableDatosEmpleadoConstante.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoConstante(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoConstante(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoConstanteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpleadoConstanteJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpleadoConstante() throws Exception {
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
	public void inicializarCombosForeignKeyEmpleadoConstanteListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.constantenomisForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoConstanteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoConstanteJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoConstanteListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyConstanteNomiListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyConstanteNomiListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.constantenomisForeignKey==null||this.constantenomisForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=ConstanteNomiConstantesFunciones.getArrayColumnasGlobalesConstanteNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ConstanteNomiConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=ConstanteNomiConstantesFunciones.SFINALQUERY;

				this.cargarCombosConstanteNomisForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEmpleadoConstanteListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoConstanteParameterReturnGeneral empleadoconstanteReturnGeneral=new EmpleadoConstanteParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadoconstanteConstantesFunciones.cargarid_empresaEmpleadoConstante)
					 || (this.esRecargarFks && this.empleadoconstanteConstantesFunciones.cargarid_empresaEmpleadoConstante)) {

					if(!this.empleadoconstanteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadoconstanteSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadoconstanteConstantesFunciones.cargarid_empleadoEmpleadoConstante)
					 || (this.esRecargarFks && this.empleadoconstanteConstantesFunciones.cargarid_empleadoEmpleadoConstante)) {

					if(!this.empleadoconstanteSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadoconstanteSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalConstanteNomi="";

				if(((this.constantenomisForeignKey==null||this.constantenomisForeignKey.size()<=0) && this.empleadoconstanteConstantesFunciones.cargarid_constante_nomiEmpleadoConstante)
					 || (this.esRecargarFks && this.empleadoconstanteConstantesFunciones.cargarid_constante_nomiEmpleadoConstante)) {

					if(!this.empleadoconstanteSessionBean.getisBusquedaDesdeForeignKeySesionConstanteNomi()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=ConstanteNomiConstantesFunciones.getArrayColumnasGlobalesConstanteNomi(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalConstanteNomi=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,ConstanteNomiConstantesFunciones.TABLENAME);

						finalQueryGlobalConstanteNomi=Funciones.GetFinalQueryAppend(finalQueryGlobalConstanteNomi, "");
						finalQueryGlobalConstanteNomi+=ConstanteNomiConstantesFunciones.SFINALQUERY;

						//this.cargarCombosConstanteNomisForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalConstanteNomi=" WHERE " + ConstantesSql.ID + "="+empleadoconstanteSessionBean.getlidConstanteNomiActual();
					}
				} else {
					finalQueryGlobalConstanteNomi="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadoconstanteReturnGeneral=empleadoconstanteLogic.cargarCombosLoteForeignKeyEmpleadoConstante(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalConstanteNomi);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadoconstanteReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadoconstanteReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalConstanteNomi.equals("NONE")) {
				this.constantenomisForeignKey=empleadoconstanteReturnGeneral.getconstantenomisForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoConstante()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyConstanteNomi();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadoconstanteSessionBean==null) {
				this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
			}

			if(!this.empleadoconstanteSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.empleadoconstanteSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyConstanteNomi()throws Exception {
		try {

			if(!this.empleadoconstanteSessionBean.getisBusquedaDesdeForeignKeySesionConstanteNomi()) {
				ConstanteNomi constantenomi=new ConstanteNomi();
				ConstanteNomiConstantesFunciones.setConstanteNomiDescripcion(constantenomi,Constantes.SMENSAJE_ESCOJA_OPCION);
				constantenomi.setId(null);

				if(!ConstanteNomiConstantesFunciones.ExisteEnLista(this.constantenomisForeignKey,constantenomi,true)) {

					this.constantenomisForeignKey.add(0,constantenomi);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoConstante()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoConstante(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoConstante()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoConstante();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoConstante(EmpleadoConstante empleadoconstante)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(empleadoconstante.getid_empleado(),false,"Formulario");
			this.setActualConstanteNomiForeignKey(empleadoconstante.getid_constante_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoConstante(EmpleadoConstante empleadoconstante,String sTipoEvento)throws Exception {	
		try {
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoConstante()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.empleadoconstanteConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualConstanteNomiForeignKey(this.empleadoconstanteConstantesFunciones.getid_constante_nomi(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoConstante()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoConstante()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoConstante()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoConstante()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoConstante()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameConstanteNomisForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoConstante(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameConstanteNomisForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoConstante()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante!=null && this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante!=null && this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante!=null && this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public EmpleadoConstanteBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoConstanteBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoConstanteBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean(); 
		this.empleadoconstanteConstantesFunciones=new EmpleadoConstanteConstantesFunciones(); 
		this.empleadoconstanteBean=new EmpleadoConstante();//(this.empleadoconstanteConstantesFunciones); 		
		this.empleadoconstanteReturnGeneral=new EmpleadoConstanteParameterReturnGeneral(); 
		
		this.empleadoconstanteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoconstanteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoConstanteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoConstanteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoConstanteBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoConstante(true);
			
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
			
			this.empleadoconstanteConstantesFunciones=new EmpleadoConstanteConstantesFunciones(); 
			this.empleadoconstanteBean=new EmpleadoConstante();//this.empleadoconstanteConstantesFunciones); 			
			this.empleadoconstanteReturnGeneral=new EmpleadoConstanteParameterReturnGeneral(); 
		
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Constante Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.empleadoconstante=new EmpleadoConstante();
			this.empleadoconstantes = new ArrayList<EmpleadoConstante>();
			this.empleadoconstantesAux = new ArrayList<EmpleadoConstante>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic=new EmpleadoConstanteLogic();
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadoconstanteSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadoconstanteSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoConstante);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoConstante!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoConstante);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoConstante!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoConstante);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoConstante!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoConstante);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoConstante);
				this.jInternalFrameDetalleFormEmpleadoConstante.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoConstante.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoConstante!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoConstante);
					this.jInternalFrameReporteDinamicoEmpleadoConstante.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoConstante.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoConstante!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoConstante);
					this.jInternalFrameImportacionEmpleadoConstante.setVisible(false);
					this.jInternalFrameImportacionEmpleadoConstante.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoConstante!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoConstante);
					this.jInternalFrameOrderByEmpleadoConstante.setVisible(false);
					this.jInternalFrameOrderByEmpleadoConstante.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoConstanteActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoConstanteConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empleadoconstanteReturnGeneral=new EmpleadoConstanteParameterReturnGeneral();
			
			this.empleadoconstanteParameterGeneral=new EmpleadoConstanteParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadoconstanteLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpleadoConstanteJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoConstanteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoconstanteSessionBean.getEsGuardarRelacionado(),this.empleadoconstanteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoConstanteConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoconstanteSessionBean.getEsGuardarRelacionado(),this.empleadoconstanteSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpleadoConstante=false;
			this.isVisibilidadCeldaDuplicarEmpleadoConstante=true;
			this.isVisibilidadCeldaCopiarEmpleadoConstante=true;
			this.isVisibilidadCeldaVerFormEmpleadoConstante=true;
			this.isVisibilidadCeldaOrdenEmpleadoConstante=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=false;
			this.isVisibilidadCeldaModificarEmpleadoConstante=false;
			this.isVisibilidadCeldaActualizarEmpleadoConstante=false;
			this.isVisibilidadCeldaEliminarEmpleadoConstante=false;
			this.isVisibilidadCeldaCancelarEmpleadoConstante=false;
			this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=false;
			
			
			this.isVisibilidadFK_IdConstanteNomi=true;
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoConstante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoConstante();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoConstante(false);
			
			this.setPermisosUsuarioEmpleadoConstante();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado() 
				|| (this.empleadoconstanteSessionBean.getEsGuardarRelacionado() && this.empleadoconstanteSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoConstanteClasesRelacionadas();
			}
			
			if(this.empleadoconstanteSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoConstanteClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoConstante();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoConstante();
			}
			
			if(!this.isPermisoBusquedaEmpleadoConstante) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(true);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(true);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoConstante,this.isPermisoPaginacionMedioEmpleadoConstante,this.isPermisoPaginacionTodoEmpleadoConstante);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoConstanteConstantesFunciones.getTiposSeleccionarEmpleadoConstante());
				
				this.tiposColumnasSelect=EmpleadoConstanteConstantesFunciones.getTiposSeleccionarEmpleadoConstante(true);
				
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
			//if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoConstante();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(true,false,true);
				this.setAccionesUsuarioEmpleadoConstante(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(true,false,true);							
				this.setAccionesUsuarioEmpleadoConstante(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoConstante() ;
			
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
			this.constantenomiLogic=new ConstanteNomiLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empleadoconstanteImplementable= (EmpleadoConstanteImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoConstanteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadoconstanteImplementableHome= (EmpleadoConstanteImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoConstanteConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadoconstantes= new ArrayList<EmpleadoConstante>();
			this.empleadoconstantesEliminados= new ArrayList<EmpleadoConstante>();
						
			this.isEsNuevoEmpleadoConstante=false;
			this.esParaAccionDesdeFormularioEmpleadoConstante=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.constantenomisForeignKey=new ArrayList<ConstanteNomi>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoConstante(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoConstante();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoConstanteConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoConstante("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoConstante(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoConstante();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoConstante();
			}
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoConstante.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoConstante.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoConstante.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoConstante(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoConstante: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoConstante() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoConstante")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoConstante.jTabbedPaneRelacionesEmpleadoConstante.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoConstante.jTabbedPaneRelacionesEmpleadoConstante.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoConstante();	
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
	
	public void cargarCombosForeignKeyEmpleadoConstante(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoConstante(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoConstante(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoConstanteListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoConstante();
		
		this.cargarCombosFrameForeignKeyEmpleadoConstante();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoConstante();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoConstante();
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

	public void cargarCombosForeignKeyConstanteNomi(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyConstanteNomiListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyConstanteNomi();
				this.cargarCombosFrameConstanteNomisForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaConstanteNomi(this.constantenomisForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEmpleadoConstanteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadoconstanteSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
			
			if(jTableDatosEmpleadoConstante.getRowCount()>=1) {
				jTableDatosEmpleadoConstante.removeRowSelectionInterval(0, jTableDatosEmpleadoConstante.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoConstante=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoConstante(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoConstante(true);			
			//this.empleadoconstante=new EmpleadoConstante();
			//this.empleadoconstante.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoConstante(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoConstante() ;
			
			if(EmpleadoConstanteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoConstante(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadoconstante);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);				
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
			if(this.empleadoconstanteSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoConstante: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoConstanteActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoConstante.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoConstante.getSelectedRows().length;			
			}
			
			empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoConstante--;			
				//EmpleadoConstante empleadoconstanteAux= new EmpleadoConstante();			
				//empleadoconstanteAux.setId(this.iIdNuevoEmpleadoConstante);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoConstante empleadoconstanteOrigen=new EmpleadoConstante();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoConstante empleadoconstanteOrigen : empleadoconstantesSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadoconstanteOrigen =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoconstanteOrigen =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoConstante();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadoconstante.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoConstante(empleadoconstanteOrigen,this.empleadoconstante,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoconstanteLogic.getEmpleadoConstantes().add(this.empleadoconstanteAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoconstantes.add(this.empleadoconstanteAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoConstante(false);
				
				this.jTableDatosEmpleadoConstante.setRowSelectionInterval(this.getIndiceNuevoEmpleadoConstante(), this.getIndiceNuevoEmpleadoConstante());
				
				int iLastRow =  this.jTableDatosEmpleadoConstante.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoConstante.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoConstante.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoConstante(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();									
		
			EmpleadoConstante empleadoconstanteOrigen=new EmpleadoConstante();
			EmpleadoConstante empleadoconstanteDestino=new EmpleadoConstante();
				
			empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoConstante.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadoconstantesSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoConstante.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstanteOrigen =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoconstanteOrigen =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoconstanteDestino =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoconstanteDestino =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadoconstanteOrigen =empleadoconstantesSeleccionados.get(0);
				empleadoconstanteDestino =empleadoconstantesSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoConstante(empleadoconstanteOrigen,empleadoconstanteDestino,true,false);
				
				empleadoconstanteDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoconstanteDestino,empleadoconstanteLogic.getEmpleadoConstantes());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoconstanteDestino,empleadoconstantes);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoConstante(false);
				
				//this.jTableDatosEmpleadoConstante.setRowSelectionInterval(this.getIndiceNuevoEmpleadoConstante(), this.getIndiceNuevoEmpleadoConstante());
				
				int iLastRow =  this.jTableDatosEmpleadoConstante.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoConstante.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoConstante.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoConstante(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoConstante.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoConstante.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoConstante.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoConstante.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoConstante.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoConstante();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoConstante();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoConstante();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoConstante();
			
			this.abrirFrameOrderByEmpleadoConstante();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoConstante();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoConstante(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoConstante);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoConstante.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoConstante.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoConstante.setSize(this.jInternalFrameDetalleFormEmpleadoConstante.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoConstante.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoConstante.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoConstante.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoConstante.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoConstante.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoConstante.jContentPaneDetalleEmpleadoConstante.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoConstante.jTabbedPaneRelacionesEmpleadoConstante.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoConstante.jContentPaneDetalleEmpleadoConstante.getWidth(),EmpleadoConstanteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoConstante.jTabbedPaneRelacionesEmpleadoConstante.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoConstante.jContentPaneDetalleEmpleadoConstante.getWidth(),EmpleadoConstanteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoConstante.jTabbedPaneRelacionesEmpleadoConstante.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoConstante.jContentPaneDetalleEmpleadoConstante.getWidth(),EmpleadoConstanteConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoConstante.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoConstante.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoConstante() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoConstante==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoConstante=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoConstante,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoConstante=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoConstante,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoConstante);
				this.jInternalFrameOrderByEmpleadoConstante.setVisible(false);
				this.jInternalFrameOrderByEmpleadoConstante.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoConstante.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoConstante"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoConstante();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoConstante() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoConstante==null) {
				
				this.jInternalFrameImportacionEmpleadoConstante=new ImportacionJInternalFrame(EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoConstante);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoConstante);
				this.jInternalFrameImportacionEmpleadoConstante.setVisible(false);
				this.jInternalFrameImportacionEmpleadoConstante.setSelected(false);


				this.jInternalFrameImportacionEmpleadoConstante.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoConstante"));
				this.jInternalFrameImportacionEmpleadoConstante.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoConstante"));
				this.jInternalFrameImportacionEmpleadoConstante.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoConstante"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoConstante() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoConstante==null) {
				this.jInternalFrameReporteDinamicoEmpleadoConstante=new ReporteDinamicoJInternalFrame(EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoConstante);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoConstante);
				this.jInternalFrameReporteDinamicoEmpleadoConstante.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoConstante.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoConstante.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoConstante"));
				this.jInternalFrameReporteDinamicoEmpleadoConstante.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoConstante"));
				this.jInternalFrameReporteDinamicoEmpleadoConstante.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoConstante"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoConstante();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoConstante() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoConstante);
			
	       	this.jInternalFrameDetalleFormEmpleadoConstante.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoConstante.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoConstante.dispose();
			//this.jInternalFrameDetalleFormEmpleadoConstante=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoConstante() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoConstante.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoConstante.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoConstante() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoConstante.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoConstante.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoConstante() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoConstante.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoConstante.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoConstante() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoConstante.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoConstante.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoConstante() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoConstante.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoConstante.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoConstante() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoConstante.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoConstante.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoConstante(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoConstante(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoConstante(true);
			//this.isEsNuevoEmpleadoConstante=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoConstante("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoConstante(false) ;
			
			if(empleadoconstanteSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoConstanteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoConstante(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoConstante(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoConstanteActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoConstante(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoConstante(true);
			//this.isEsNuevoEmpleadoConstante=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadoconstante.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoConstante("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoConstante(false) ;
			
			if(EmpleadoConstanteJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoConstante(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoConstante(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
		} catch(Exception e) {
			throw e;
		}
	}
	
		
	
	public void recargarComboTablaEmpleado(List<Empleado> empleadosForeignKey)throws Exception{
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoConstante.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaConstanteNomi(List<ConstanteNomi> constantenomisForeignKey)throws Exception{
		TableColumn tableColumnConstanteNomi=this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI));
		TableCellEditor tableCellEditorConstanteNomi =tableColumnConstanteNomi.getCellEditor();

		ConstanteNomiTableCell constantenomiTableCellFk=(ConstanteNomiTableCell)tableCellEditorConstanteNomi;

		if(constantenomiTableCellFk!=null) {
			constantenomiTableCellFk.setconstantenomisForeignKey(constantenomisForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoConstante.getSelectedRow();

		//if(intSelectedRow<=0) {
			//constantenomiTableCellFk.setRowActual(intSelectedRow);
			//constantenomiTableCellFk.setconstantenomisForeignKeyActual(constantenomisForeignKey);
		//}


		if(constantenomiTableCellFk!=null) {
			constantenomiTableCellFk.RecargarConstanteNomisForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	
	public void jButtonActualizarEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoConstante(false);
			
			//if(!this.isEsNuevoEmpleadoConstante) {								
				int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
				
			}
			
			if(this.permiteMantenimiento(this.empleadoconstante)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoConstante=true;
					this.inicializarActualizarBindingTablaEmpleadoConstante(false);
					this.isEsNuevoEmpleadoConstante=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoConstante=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoConstante=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoConstante(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoConstante(false);
				
				this.habilitarDeshabilitarControlesEmpleadoConstante(false);
			
												
				
				if(EmpleadoConstanteJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoConstante();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoConstanteActionPerformed(evt,empleadoconstanteSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoConstante(this.empleadoconstante,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoConstante.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadoconstanteSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadoconstante.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				this.empleadoconstante.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				this.empleadoconstante.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadoconstante)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoConstanteModel) this.jTableDatosEmpleadoConstante.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoConstante=true;
				this.inicializarActualizarBindingTablaEmpleadoConstante(false);
				this.isEsNuevoEmpleadoConstante=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoConstante(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoConstante(false);
				
				this.habilitarDeshabilitarControlesEmpleadoConstante(false);
				
				
				
				if(EmpleadoConstanteJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoConstante();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoConstante.getRowCount()>=1) {
				jTableDatosEmpleadoConstante.removeRowSelectionInterval(0, jTableDatosEmpleadoConstante.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoConstante(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoConstante(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoConstante(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoConstante(false) ;
			
			this.isEsNuevoEmpleadoConstante=false;
			
			if(EmpleadoConstanteJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoConstante();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoConstante(false);
				
				//SI ES MANUAL
				if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoConstante();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoConstante--;			
			//EmpleadoConstante empleadoconstanteAux= new EmpleadoConstante();			
			//empleadoconstanteAux.setId(this.iIdNuevoEmpleadoConstante);
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoConstante();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
			
			this.empleadoconstante.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadoconstanteLogic.getEmpleadoConstantes().add(this.empleadoconstanteAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadoconstantes.add(this.empleadoconstanteAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoConstante(false);
			
			this.jTableDatosEmpleadoConstante.setRowSelectionInterval(this.getIndiceNuevoEmpleadoConstante(), this.getIndiceNuevoEmpleadoConstante());
			
			int iLastRow =  this.jTableDatosEmpleadoConstante.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoConstante.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoConstante.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoConstante(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoConstante(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoConstante(false);
			
			//SI ES MANUAL
			if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoConstante();
			}
			
			//this.abrirFrameTreeEmpleadoConstante();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado ConstanteS ?", "MANTENIMIENTO DE Empleado Constante", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoConstante.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoConstante();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadoconstanteReturnGeneral=empleadoconstanteLogic.procesarImportacionEmpleadoConstantesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadoconstanteParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoConstanteReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoConstante.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoConstante.setFileImportacion(this.jInternalFrameImportacionEmpleadoConstante.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoConstante.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoConstante.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoConstante.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoConstante.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();		

		empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoConstanteBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoConstanteBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpleadoConstantes("Todos",empleadoconstantesSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Constante",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_ConstanteNomi_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_ConstanteNomi_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_ConstanteNomi_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_ConstanteNomi_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_VALOR:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_lor_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_lor_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_lor_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_lor_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO:
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
		
		if(this.jInternalFrameReporteDinamicoEmpleadoConstante.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI:
					sNombreCampoCategoria="id_constante_nomi";
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoria="valor";
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoria="esta_activo";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI:
					sNombreCampoCategoriaValor="id_constante_nomi";
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_VALOR:
					sNombreCampoCategoriaValor="valor";
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO:
					sNombreCampoCategoriaValor="esta_activo";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Constante Nomi",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_constante_nomi");
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_VALOR:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Valor",sNombreCampoCategoria,sNombreCampoCategoriaValor,"valor");
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO:
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();		
		
		empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoconstante";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpleadoConstantes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoConstante empleadoconstante:empleadoconstantesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoconstante.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoConstante empleadoconstante:empleadoconstantesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoconstante.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI);
					iRow++;

					for(EmpleadoConstante empleadoconstante:empleadoconstantesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoconstante.getconstantenomi_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_VALOR:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_VALOR);
					iRow++;

					for(EmpleadoConstante empleadoconstante:empleadoconstantesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoconstante.getvalor());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO);
					iRow++;

					for(EmpleadoConstante empleadoconstante:empleadoconstantesSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoconstante.getesta_activo());
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
			//	this.getFilaCabeceraExportarExcelEmpleadoConstante(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoConstante empleadoconstanteAux:empleadoconstantesSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoConstante(empleadoconstanteAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Constante",JOptionPane.INFORMATION_MESSAGE);
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
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoConstante(false);
			
			//SI ES MANUAL
			if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoConstante();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoConstante(false);
			
			//SI ES MANUAL
			if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoConstante();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoConstante(false);
			
			//SI ES MANUAL
			if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoConstante();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoConstante() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoConstante.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoConstante.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoConstante.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoConstante.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoConstante.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoConstante.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoConstante.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoConstante(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoConstante(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoConstante(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoConstante(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoConstante(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoConstante(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoConstante(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoConstante(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoConstante() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoConstante();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoConstante(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoConstante();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoConstante() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoConstante(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoConstante(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoConstante.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoConstante.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoConstante.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxPostAccionNuevoEmpleadoConstante.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxPostAccionSinCerrarEmpleadoConstante.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxPostAccionSinMensajeEmpleadoConstante.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoConstante.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoConstante.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoConstante.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
				this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxPostAccionNuevoEmpleadoConstante.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxPostAccionSinCerrarEmpleadoConstante.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxPostAccionSinMensajeEmpleadoConstante.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoConstante.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoConstante.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoConstante.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoConstante!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoConstante.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoConstante.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoConstante.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoConstante.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoConstante!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoConstante.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoConstante.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoConstante(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoConstante(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoConstante() throws Exception {
		try	{
			if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoConstante();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoConstante() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoConstante() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoConstante.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoConstante.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoConstante.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoConstante.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoConstante.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoConstante.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoConstante.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoConstante.addItem(reporte);
			}
			
			
			if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoConstante.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoConstante.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoConstante.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoConstante.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoConstante.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoConstante.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoConstante.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoConstante.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoConstante.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoConstante();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoConstante() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoConstante!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoConstante!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoConstante!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
				
				//TIPOS COLUMNAS CATEGORIA DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxColumnaCategoriaGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxColumnaCategoriaGrafico().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoria=EmpleadoConstanteConstantesFunciones.getTiposSeleccionarEmpleadoConstante(true,true,false,true,true);
						
					for(Reporte reporte:tiposColumnasCategoria) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxColumnaCategoriaGrafico().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS CATEGORIA VALOR DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxColumnaCategoriaValor()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxColumnaCategoriaValor().removeAllItems();
						
					ArrayList<Reporte> tiposColumnasCategoriaValor=EmpleadoConstanteConstantesFunciones.getTiposSeleccionarEmpleadoConstante(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasCategoriaValor) {//this.tiposSeleccionar
						this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxColumnaCategoriaValor().addItem(reporte);
					}
					
				}
					
				//TIPOS COLUMNAS VALOR
				defaultListModel=new DefaultListModel<Reporte>();
					
				if(this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasValoresGrafico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasValoresGrafico().removeAll();
						
					ArrayList<Reporte> tiposColumnasValor=EmpleadoConstanteConstantesFunciones.getTiposSeleccionarEmpleadoConstante(false,false,true,false,false);
						
					for(Reporte reporte:tiposColumnasValor) {//this.tiposSeleccionar
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjListColumnasValoresGrafico().setModel(defaultListModel);									
						
				}
					
				//TIPOS GRAFICOS REPORTES DINAMICOS
				if(this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposGraficosReportesDinamico()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposGraficosReportesDinamico().removeAllItems();
						
					for(Reporte reporte:this.tiposGraficosReportes) {
						this.jInternalFrameReporteDinamicoEmpleadoConstante.getjComboBoxTiposGraficosReportesDinamico().addItem(reporte);
					}
					
				}
			
			
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoConstante()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.getSelectedItem()!=null){this.id_constante_nomiFK_IdConstanteNomi=((ConstanteNomi)this.jComboBoxid_constante_nomiFK_IdConstanteNomiEmpleadoConstante.getSelectedItem()).getId();}
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoConstante.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoConstante(Boolean esInicializar) throws Exception {				
		if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoConstante();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoConstante() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoConstante(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoConstante() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoConstantePropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoConstantePropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoConstanteOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstanteOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoConstantePropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoConstantePropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoConstante(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadoconstanteLogic.getEmpleadoConstantes().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadoconstantes.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoConstante.setModel(new EmpleadoConstanteModel(this.empleadoconstanteLogic.getEmpleadoConstantes(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoConstante.setModel(new EmpleadoConstanteModel(this.empleadoconstantes,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoConstante!=null && this.jInternalFrameOrderByEmpleadoConstante.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoConstante();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoConstantePropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO,empleadoconstanteConstantesFunciones.resaltarSeleccionarEmpleadoConstante,iSizeTabla,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoConstanteConstantesFunciones.SCLASSWEBTITULO,empleadoconstanteConstantesFunciones.resaltarSeleccionarEmpleadoConstante,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,EmpleadoConstanteConstantesFunciones.LABEL_ID));

		if(this.empleadoconstanteConstantesFunciones.mostraridEmpleadoConstante && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoConstanteConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoconstanteConstantesFunciones.resaltaridEmpleadoConstante,this.empleadoconstanteConstantesFunciones.activaridEmpleadoConstante,iSizeTabla,this,true,"idEmpleadoConstante","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoconstanteConstantesFunciones.resaltaridEmpleadoConstante,this.empleadoconstanteConstantesFunciones.activaridEmpleadoConstante,this,true,"idEmpleadoConstante","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadoconstanteConstantesFunciones.mostrarid_empresaEmpleadoConstante && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadoconstanteConstantesFunciones.resaltarid_empresaEmpleadoConstante,this,this.empleadoconstanteConstantesFunciones.activarid_empresaEmpleadoConstante,iSizeTabla));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadoconstanteConstantesFunciones.resaltarid_empresaEmpleadoConstante,this,this.empleadoconstanteConstantesFunciones.activarid_empresaEmpleadoConstante,false,"id_empresaEmpleadoConstante","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoConstantePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadoconstanteConstantesFunciones.mostrarid_empleadoEmpleadoConstante && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoconstanteConstantesFunciones.resaltarid_empleadoEmpleadoConstante,this,this.empleadoconstanteConstantesFunciones.activarid_empleadoEmpleadoConstante,iSizeTabla));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoconstanteConstantesFunciones.resaltarid_empleadoEmpleadoConstante,this,this.empleadoconstanteConstantesFunciones.activarid_empleadoEmpleadoConstante,true,"id_empleadoEmpleadoConstante","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoConstantePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI));

		if(this.empleadoconstanteConstantesFunciones.mostrarid_constante_nomiEmpleadoConstante && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new ConstanteNomiTableCell(this.constantenomisForeignKey,this.empleadoconstanteConstantesFunciones.resaltarid_constante_nomiEmpleadoConstante,this,this.empleadoconstanteConstantesFunciones.activarid_constante_nomiEmpleadoConstante,iSizeTabla));
			tableColumn.setCellEditor(new ConstanteNomiTableCell(this.constantenomisForeignKey,this.empleadoconstanteConstantesFunciones.resaltarid_constante_nomiEmpleadoConstante,this,this.empleadoconstanteConstantesFunciones.activarid_constante_nomiEmpleadoConstante,true,"id_constante_nomiEmpleadoConstante","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoConstantePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,EmpleadoConstanteConstantesFunciones.LABEL_VALOR));

		if(this.empleadoconstanteConstantesFunciones.mostrarvalorEmpleadoConstante && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoConstanteConstantesFunciones.LABEL_VALOR,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoconstanteConstantesFunciones.resaltarvalorEmpleadoConstante,this.empleadoconstanteConstantesFunciones.activarvalorEmpleadoConstante,iSizeTabla,this,true,"valorEmpleadoConstante","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoconstanteConstantesFunciones.resaltarvalorEmpleadoConstante,this.empleadoconstanteConstantesFunciones.activarvalorEmpleadoConstante,this,true,"valorEmpleadoConstante","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoConstantePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO));

		if(this.empleadoconstanteConstantesFunciones.mostraresta_activoEmpleadoConstante && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.empleadoconstanteConstantesFunciones.resaltaresta_activoEmpleadoConstante,this.empleadoconstanteConstantesFunciones.activaresta_activoEmpleadoConstante,iSizeTabla));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.empleadoconstanteConstantesFunciones.resaltaresta_activoEmpleadoConstante,this.empleadoconstanteConstantesFunciones.activaresta_activoEmpleadoConstante,this,true,"esta_activoEmpleadoConstante","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoConstantePropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoconstanteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoconstanteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoConstante.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoconstanteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoconstanteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoConstante.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadoconstanteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadoconstanteSessionBean.getEsGuardarRelacionado(),iSizeTabla));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoConstante.addColumn(tableColumn);
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
			
			this.jTableDatosEmpleadoConstante.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoConstante.moveColumn(this.jTableDatosEmpleadoConstante.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoConstante.moveColumn(this.jTableDatosEmpleadoConstante.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoConstante.moveColumn(this.jTableDatosEmpleadoConstante.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoConstante.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoConstante.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoConstante,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoConstante.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoConstante.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoConstante.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoConstante.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empleadoconstanteLogic.getEmpleadoConstantes().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadoconstantes.size()-1;
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
		//this.jTableDatosEmpleadoConstante.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoConstante.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoConstante();
			
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
				
				//this.isEsNuevoEmpleadoConstante=false;
					
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
				if(this.empleadoconstanteSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoConstante==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoConstante.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoConstante.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadoconstante.getsType().equals("DUPLICADO")
				   || this.empleadoconstante.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoConstante=true;
				
				} else {
					this.isEsNuevoEmpleadoConstante=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
					if(this.empleadoconstante.getId()>=0 && !this.empleadoconstante.getIsNew()) {						
						this.isEsNuevoEmpleadoConstante=false;
						
					} else {
						this.isEsNuevoEmpleadoConstante=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoConstante(esRelaciones);						
				
				this.seleccionarEmpleadoConstante(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadoconstante.getId()<0) {
					this.isEsNuevoEmpleadoConstante=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoConstante(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoConstante(evt,rowIndex);
				}	
				
				if(this.empleadoconstanteSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoConstante: " + this.dDif); 
					}
				}								
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoConstante(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadoconstante)) {
					if(this.empleadoconstante.getId()>0) {
						this.empleadoconstante.setIsDeleted(true);
						
						this.empleadoconstantesEliminados.add(this.empleadoconstante);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoconstanteLogic.getEmpleadoConstantes().remove(this.empleadoconstante);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoconstantes.remove(this.empleadoconstante);				
					}
					
					
					((EmpleadoConstanteModel) this.jTableDatosEmpleadoConstante.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoConstante(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoConstante(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoConstante) {
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoConstante.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoConstante.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoConstante(this.empleadoconstante);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadoconstanteConstantesFunciones.cargarid_empresaEmpleadoConstante || this.empleadoconstanteConstantesFunciones.event_dependid_empresaEmpleadoConstante) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadoconstante.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoConstante(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadoconstante.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadoconstante.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadoconstante.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.empleadoconstanteConstantesFunciones.cargarid_empleadoEmpleadoConstante || this.empleadoconstanteConstantesFunciones.event_dependid_empleadoEmpleadoConstante) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadoconstante.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoConstante(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadoconstante.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadoconstante.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadoconstante.getid_empleado(),false,"Formulario");

					//ConstanteNomi
					if(!this.empleadoconstanteConstantesFunciones.cargarid_constante_nomiEmpleadoConstante || this.empleadoconstanteConstantesFunciones.event_dependid_constante_nomiEmpleadoConstante) {
						//this.cargarCombosConstanteNomisForeignKeyLista(" where id="+this.empleadoconstante.getid_constante_nomi());
									//this.inicializarActualizarBindingEmpleadoConstante(false,false);
						this.constantenomisForeignKey=new ArrayList<ConstanteNomi>();

						if(empleadoconstante.getConstanteNomi()!=null) {
							this.constantenomisForeignKey.add(empleadoconstante.getConstanteNomi());
						}

						this.addItemDefectoCombosForeignKeyConstanteNomi();
						this.cargarCombosFrameConstanteNomisForeignKey("Todos");
					}
					this.setActualConstanteNomiForeignKey(this.empleadoconstante.getid_constante_nomi(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoConstante("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoConstante(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoConstante() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoConstante(EmpleadoConstante empleadoconstante) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoConstante(empleadoconstante,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoConstante(EmpleadoConstante empleadoconstante,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoConstante(empleadoconstante);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoConstante(empleadoconstante,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoConstante(empleadoconstante);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoConstante(EmpleadoConstante empleadoconstante) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.setText(empleadoconstante.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoConstante.jTextFieldvalorEmpleadoConstante.setText(empleadoconstante.getvalor().toString());
			this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxesta_activoEmpleadoConstante.setSelected(empleadoconstante.getesta_activo());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoConstante empleadoconstanteLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadoconstanteLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoConstante empleadoconstanteLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadoconstanteLocal=this.empleadoconstante;
			} else {
				empleadoconstanteLocal=this.empleadoconstanteAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadoconstanteLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoConstante(empleadoconstanteLocal,true);
					
					if(empleadoconstanteSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadoconstanteLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadoconstanteLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoConstante(EmpleadoConstante empleadoconstante,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoConstante(empleadoconstante,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(empleadoconstante);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoConstante(EmpleadoConstante empleadoconstante,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoConstante(empleadoconstante,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoConstante(EmpleadoConstante empleadoconstante,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.getText()==null || this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.getText()=="" || this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.setText("0");
			}

			if(conColumnasBase) {empleadoconstante.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoConstanteConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelIdEmpleadoConstante,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoconstante.setvalor(Double.parseDouble(this.jInternalFrameDetalleFormEmpleadoConstante.jTextFieldvalorEmpleadoConstante.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoConstanteConstantesFunciones.LABEL_VALOR+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelvalorEmpleadoConstante,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoconstante.setesta_activo(this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxesta_activoEmpleadoConstante.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoConstante.jLabelesta_activoEmpleadoConstante,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoConstante(EmpleadoConstante empleadoconstanteBean,EmpleadoConstante empleadoconstante,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && empleadoconstanteBean.getid_empleado()!=null && !empleadoconstanteBean.getid_empleado().equals(-1L))) {empleadoconstante.setid_empleado(empleadoconstanteBean.getid_empleado());}
			if(conDefault || (!conDefault && empleadoconstanteBean.getid_constante_nomi()!=null && !empleadoconstanteBean.getid_constante_nomi().equals(-1L))) {empleadoconstante.setid_constante_nomi(empleadoconstanteBean.getid_constante_nomi());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoConstante(EmpleadoConstante empleadoconstanteOrigen,EmpleadoConstante empleadoconstante,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoconstanteOrigen.getId()!=null && !empleadoconstanteOrigen.getId().equals(0L))) {empleadoconstante.setId(empleadoconstanteOrigen.getId());}}
			if(conDefault || (!conDefault && empleadoconstanteOrigen.getid_empleado()!=null && !empleadoconstanteOrigen.getid_empleado().equals(-1L))) {empleadoconstante.setid_empleado(empleadoconstanteOrigen.getid_empleado());}
			if(conDefault || (!conDefault && empleadoconstanteOrigen.getid_constante_nomi()!=null && !empleadoconstanteOrigen.getid_constante_nomi().equals(-1L))) {empleadoconstante.setid_constante_nomi(empleadoconstanteOrigen.getid_constante_nomi());}
			if(conDefault || (!conDefault && empleadoconstanteOrigen.getvalor()!=null && !empleadoconstanteOrigen.getvalor().equals(0.0))) {empleadoconstante.setvalor(empleadoconstanteOrigen.getvalor());}
			if(conDefault || (!conDefault && empleadoconstanteOrigen.getesta_activo()!=null && !empleadoconstanteOrigen.getesta_activo().equals(false))) {empleadoconstante.setesta_activo(empleadoconstanteOrigen.getesta_activo());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoConstante(EmpleadoConstante empleadoconstante) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.setText(empleadoconstante.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoConstante.jTextFieldvalorEmpleadoConstante.setText(empleadoconstante.getvalor().toString());
			this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxesta_activoEmpleadoConstante.setSelected(empleadoconstante.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoConstante(EmpleadoConstanteBean empleadoconstanteBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.setText(empleadoconstanteBean.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoConstante.jTextFieldvalorEmpleadoConstante.setText(empleadoconstanteBean.getvalor().toString());
			this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxesta_activoEmpleadoConstante.setSelected(empleadoconstanteBean.getesta_activo());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoConstante(EmpleadoConstanteParameterReturnGeneral empleadoconstanteReturnGeneral,EmpleadoConstanteBean empleadoconstanteBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoConstante empleadoconstanteLocal=new EmpleadoConstante();
			
			empleadoconstanteLocal=empleadoconstanteReturnGeneral.getEmpleadoConstante();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoconstanteLocal.getId()!=null && !empleadoconstanteLocal.getId().equals(0L))) {empleadoconstanteBean.setId(empleadoconstanteLocal.getId());}}
			if(conDefault || (!conDefault && empleadoconstanteLocal.getid_empleado()!=null && !empleadoconstanteLocal.getid_empleado().equals(-1L))) {empleadoconstanteBean.setid_empleado(empleadoconstanteLocal.getid_empleado());}
			if(conDefault || (!conDefault && empleadoconstanteLocal.getid_constante_nomi()!=null && !empleadoconstanteLocal.getid_constante_nomi().equals(-1L))) {empleadoconstanteBean.setid_constante_nomi(empleadoconstanteLocal.getid_constante_nomi());}
			if(conDefault || (!conDefault && empleadoconstanteLocal.getvalor()!=null && !empleadoconstanteLocal.getvalor().equals(0.0))) {empleadoconstanteBean.setvalor(empleadoconstanteLocal.getvalor());}
			if(conDefault || (!conDefault && empleadoconstanteLocal.getesta_activo()!=null && !empleadoconstanteLocal.getesta_activo().equals(false))) {empleadoconstanteBean.setesta_activo(empleadoconstanteLocal.getesta_activo());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoConstanteGenerico(Long idEmpleadoConstanteSeleccionado,JComboBox jComboBoxEmpleadoConstante,List<EmpleadoConstante> empleadoconstantesLocal)throws Exception {
		try {
			EmpleadoConstante  empleadoconstanteTemp=null;

			for(EmpleadoConstante empleadoconstanteAux:empleadoconstantesLocal) {
				if(empleadoconstanteAux.getId()!=null && empleadoconstanteAux.getId().equals(idEmpleadoConstanteSeleccionado)) {
					empleadoconstanteTemp=empleadoconstanteAux;
					break;
				}
			}

			jComboBoxEmpleadoConstante.setSelectedItem(empleadoconstanteTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoConstanteGenerico(JComboBox jComboBoxEmpleadoConstante,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoConstante.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoConstante.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoConstante.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoConstante.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoConstante.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoConstante.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoconstante=(EmpleadoConstante) empleadoconstanteLogic.getEmpleadoConstantes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoconstante =(EmpleadoConstante) empleadoconstantes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadoconstante.getIsNew() && !empleadoconstante.getIsChanged() && !empleadoconstante.getIsDeleted()) {
				sDescripcion=empleadoconstante.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoconstante.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadoconstante.getIsNew() && !empleadoconstante.getIsChanged() && !empleadoconstante.getIsDeleted()) {
				sDescripcion=empleadoconstante.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoconstante.getempleado_descripcion();
			}
		}

		if(sTipo.equals("ConstanteNomi")) {
			//sDescripcion=this.getActualConstanteNomiForeignKeyDescripcion((Long)value);
			if(!empleadoconstante.getIsNew() && !empleadoconstante.getIsChanged() && !empleadoconstante.getIsDeleted()) {
				sDescripcion=empleadoconstante.getconstantenomi_descripcion();
			} else {
				//sDescripcion=this.getActualConstanteNomiForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoconstante.getconstantenomi_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoConstante empleadoconstanteRow=new EmpleadoConstante();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoconstanteRow=(EmpleadoConstante) empleadoconstanteLogic.getEmpleadoConstantes().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoconstanteRow=(EmpleadoConstante) empleadoconstantes.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoConstante(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoConstante.setVisible((this.isVisibilidadCeldaNuevoEmpleadoConstante && this.isPermisoNuevoEmpleadoConstante));			
			this.jButtonDuplicarEmpleadoConstante.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoConstante && this.isPermisoDuplicarEmpleadoConstante));			
			this.jButtonCopiarEmpleadoConstante.setVisible((this.isVisibilidadCeldaCopiarEmpleadoConstante && this.isPermisoCopiarEmpleadoConstante));
			this.jButtonVerFormEmpleadoConstante.setVisible((this.isVisibilidadCeldaVerFormEmpleadoConstante && this.isPermisoVerFormEmpleadoConstante));
			
			this.jButtonAbrirOrderByEmpleadoConstante.setVisible((this.isVisibilidadCeldaOrdenEmpleadoConstante && this.isPermisoOrdenEmpleadoConstante));			
			
			this.jButtonNuevoRelacionesEmpleadoConstante.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante && this.isPermisoNuevoEmpleadoConstante));			
			this.jButtonNuevoGuardarCambiosEmpleadoConstante.setVisible((this.isVisibilidadCeldaNuevoEmpleadoConstante && this.isPermisoNuevoEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante));
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonModificarEmpleadoConstante.setVisible((this.isVisibilidadCeldaModificarEmpleadoConstante && this.isPermisoActualizarEmpleadoConstante));	
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonActualizarEmpleadoConstante.setVisible((this.isVisibilidadCeldaActualizarEmpleadoConstante && this.isPermisoActualizarEmpleadoConstante));	
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonEliminarEmpleadoConstante.setVisible((this.isVisibilidadCeldaEliminarEmpleadoConstante && this.isPermisoEliminarEmpleadoConstante));
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonCancelarEmpleadoConstante.setVisible(this.isVisibilidadCeldaCancelarEmpleadoConstante);							
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosEmpleadoConstante.setVisible((this.isVisibilidadCeldaGuardarEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoConstante.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaNuevoEmpleadoConstante && this.isPermisoNuevoEmpleadoConstante));						
			this.jButtonDuplicarToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoConstante && this.isPermisoDuplicarEmpleadoConstante));						
			this.jButtonCopiarToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaCopiarEmpleadoConstante && this.isPermisoCopiarEmpleadoConstante));			
			this.jButtonVerFormToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaVerFormEmpleadoConstante && this.isPermisoVerFormEmpleadoConstante));			
			this.jButtonAbrirOrderByToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaOrdenEmpleadoConstante && this.isPermisoOrdenEmpleadoConstante));
			this.jButtonNuevoRelacionesToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante && this.isPermisoNuevoEmpleadoConstante));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaNuevoEmpleadoConstante && this.isPermisoNuevoEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante));			
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonModificarToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaModificarEmpleadoConstante && this.isPermisoActualizarEmpleadoConstante));	
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonActualizarToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaActualizarEmpleadoConstante  && this.isPermisoActualizarEmpleadoConstante));	
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonEliminarToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaEliminarEmpleadoConstante && this.isPermisoEliminarEmpleadoConstante));
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonCancelarToolBarEmpleadoConstante.setVisible(this.isVisibilidadCeldaCancelarEmpleadoConstante);				
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaGuardarEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoConstante.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoConstante.setVisible((this.isVisibilidadCeldaNuevoEmpleadoConstante && this.isPermisoNuevoEmpleadoConstante));			
			this.jMenuItemDuplicarEmpleadoConstante.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoConstante && this.isPermisoDuplicarEmpleadoConstante));			
			this.jMenuItemCopiarEmpleadoConstante.setVisible((this.isVisibilidadCeldaCopiarEmpleadoConstante && this.isPermisoCopiarEmpleadoConstante));			
			this.jMenuItemVerFormEmpleadoConstante.setVisible((this.isVisibilidadCeldaVerFormEmpleadoConstante && this.isPermisoVerFormEmpleadoConstante));			
			this.jMenuItemAbrirOrderByEmpleadoConstante.setVisible((this.isVisibilidadCeldaOrdenEmpleadoConstante && this.isPermisoOrdenEmpleadoConstante));			
			//this.jMenuItemMostrarOcultarEmpleadoConstante.setVisible((this.isVisibilidadCeldaOrdenEmpleadoConstante && this.isPermisoOrdenEmpleadoConstante));
			this.jMenuItemDetalleAbrirOrderByEmpleadoConstante.setVisible((this.isVisibilidadCeldaOrdenEmpleadoConstante && this.isPermisoOrdenEmpleadoConstante));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoConstante.setVisible((this.isVisibilidadCeldaOrdenEmpleadoConstante && this.isPermisoOrdenEmpleadoConstante));			
			this.jMenuItemNuevoRelacionesEmpleadoConstante.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante && this.isPermisoNuevoEmpleadoConstante));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoConstante.setVisible((this.isVisibilidadCeldaNuevoEmpleadoConstante && this.isPermisoNuevoEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante));									
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemModificarEmpleadoConstante.setVisible((this.isVisibilidadCeldaModificarEmpleadoConstante && this.isPermisoActualizarEmpleadoConstante));	
			this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemActualizarEmpleadoConstante.setVisible((this.isVisibilidadCeldaActualizarEmpleadoConstante && this.isPermisoActualizarEmpleadoConstante));	
			this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemEliminarEmpleadoConstante.setVisible((this.isVisibilidadCeldaEliminarEmpleadoConstante && this.isPermisoEliminarEmpleadoConstante));
			this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemCancelarEmpleadoConstante.setVisible(this.isVisibilidadCeldaCancelarEmpleadoConstante);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoConstante.setVisible((this.isVisibilidadCeldaGuardarEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante));						
			this.jMenuItemGuardarCambiosTablaEmpleadoConstante.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoConstante=this.jButtonNuevoEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoConstante=this.jButtonDuplicarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoConstante=this.jButtonCopiarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoConstante=this.jButtonVerFormEmpleadoConstante.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoConstante=this.jButtonAbrirOrderByEmpleadoConstante.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=this.jButtonNuevoRelacionesEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoConstante=this.jButtonModificarEmpleadoConstante.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jButtonActualizarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jButtonEliminarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jButtonCancelarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosEmpleadoConstante.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=this.jButtonGuardarCambiosTablaEmpleadoConstante.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoConstante=this.jButtonNuevoToolBarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=this.jButtonNuevoRelacionesToolBarEmpleadoConstante.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			this.isVisibilidadCeldaModificarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jButtonModificarToolBarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jButtonActualizarToolBarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jButtonEliminarToolBarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jButtonCancelarToolBarEmpleadoConstante.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoConstante=this.jButtonGuardarCambiosToolBarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=this.jButtonGuardarCambiosTablaToolBarEmpleadoConstante.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoConstante=this.jMenuItemNuevoEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=this.jMenuItemNuevoRelacionesEmpleadoConstante.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			this.isVisibilidadCeldaModificarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemModificarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemActualizarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemEliminarEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoConstante=this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemCancelarEmpleadoConstante.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoConstante=this.jMenuItemGuardarCambiosEmpleadoConstante.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=this.jMenuItemGuardarCambiosTablaEmpleadoConstante.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoConstante(Boolean esInicializar) {
		if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadoconstanteSessionBean.getConGuardarRelaciones()) {
				//if(this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoConstante();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoConstante(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoConstante() {
		this.jButtonNuevoEmpleadoConstante.setVisible(this.isPermisoNuevoEmpleadoConstante);			
		this.jButtonDuplicarEmpleadoConstante.setVisible(this.isPermisoDuplicarEmpleadoConstante);			
		this.jButtonCopiarEmpleadoConstante.setVisible(this.isPermisoCopiarEmpleadoConstante);			
		this.jButtonVerFormEmpleadoConstante.setVisible(this.isPermisoVerFormEmpleadoConstante);			
		
		this.jButtonAbrirOrderByEmpleadoConstante.setVisible(this.isPermisoOrdenEmpleadoConstante);					
		
		this.jButtonNuevoRelacionesEmpleadoConstante.setVisible(this.isPermisoNuevoEmpleadoConstante);			
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonModificarEmpleadoConstante.setVisible(this.isPermisoActualizarEmpleadoConstante);	
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonActualizarEmpleadoConstante.setVisible(this.isPermisoActualizarEmpleadoConstante);	
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonEliminarEmpleadoConstante.setVisible(this.isPermisoEliminarEmpleadoConstante);
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonCancelarEmpleadoConstante.setVisible(this.isVisibilidadCeldaCancelarEmpleadoConstante);						
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosEmpleadoConstante.setVisible(this.isPermisoGuardarCambiosEmpleadoConstante);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoConstante.setVisible(this.isPermisoActualizarEmpleadoConstante);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoConstante() {
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonModificarEmpleadoConstante.setVisible(this.isPermisoActualizarEmpleadoConstante);	
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonActualizarEmpleadoConstante.setVisible(this.isPermisoActualizarEmpleadoConstante);	
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonEliminarEmpleadoConstante.setVisible(this.isPermisoEliminarEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonCancelarEmpleadoConstante.setVisible(this.isVisibilidadCeldaCancelarEmpleadoConstante);							
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosEmpleadoConstante.setVisible((this.isVisibilidadCeldaGuardarEmpleadoConstante && this.isPermisoGuardarCambiosEmpleadoConstante));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoConstante() {
		if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoConstante();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoConstante() {
	}
	
	public void jTableDatosEmpleadoConstanteListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoConstante(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoConstanteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.getempleadoconstante(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoconstante==null) {
						this.empleadoconstante = new EmpleadoConstante();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
				}

				if(this.empleadoconstante.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadoconstante.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoConstante(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoConstanteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoConstante(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoConstante.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoConstante.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.getempleadoconstante(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadoconstanteLogic.getConnexion());

				if(this.empleadoconstante.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadoconstante.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoConstante=(TitledBorder)this.jScrollPanelDatosEmpleadoConstante.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoConstante.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoConstanteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.getempleadoconstante(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoconstante==null) {
						this.empleadoconstante = new EmpleadoConstante();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
				}

				if(this.empleadoconstante.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadoconstante.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoConstante(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoConstanteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoConstante(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoConstante.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoConstante.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.getempleadoconstante(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadoconstanteLogic.getConnexion());

				if(this.empleadoconstante.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadoconstante.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoConstante=(TitledBorder)this.jScrollPanelDatosEmpleadoConstante.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoConstante.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoConstanteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.getempleadoconstante(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoconstante==null) {
						this.empleadoconstante = new EmpleadoConstante();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
				}

				if(this.empleadoconstante.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadoconstante.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoConstante(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_constante_nomiEmpleadoConstanteUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoconstantenomi=true;

			idTienePermisoconstantenomi=this.tienePermisosUsuarioEnPaginaWebEmpleadoConstante(ConstanteNomiConstantesFunciones.CLASSNAME);

			if(idTienePermisoconstantenomi) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoConstante.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoConstante.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.getempleadoconstante(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);

				this.constantenomiBeanSwingJInternalFrame=new ConstanteNomiBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.constantenomiBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.constantenomiBeanSwingJInternalFrame.getConstanteNomiLogic().setConnexion(this.empleadoconstanteLogic.getConnexion());

				if(this.empleadoconstante.getid_constante_nomi()!=null) {
					this.constantenomiBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.constantenomiBeanSwingJInternalFrame.setIdActual(this.empleadoconstante.getid_constante_nomi());
					this.constantenomiBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.constantenomiBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.constantenomiBeanSwingJInternalFrame.inicializarActualizarBindingTablaConstanteNomi();
				}

				JInternalFrameBase jinternalFrame =this.constantenomiBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoConstante=(TitledBorder)this.jScrollPanelDatosEmpleadoConstante.getBorder();
				TitledBorder titledBorderconstantenomi=(TitledBorder)this.constantenomiBeanSwingJInternalFrame.jScrollPanelDatosConstanteNomi.getBorder();

				titledBorderconstantenomi.setTitle(titledBorderEmpleadoConstante.getTitle() + " -> Constante Nomi");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_constante_nomiEmpleadoConstanteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.getempleadoconstante(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoconstante==null) {
						this.empleadoconstante = new EmpleadoConstante();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
				}

				if(this.empleadoconstante.getid_constante_nomi()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_constante_nomi = "+this.empleadoconstante.getid_constante_nomi().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoConstante(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonvalorEmpleadoConstanteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.getempleadoconstante(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoconstante==null) {
						this.empleadoconstante = new EmpleadoConstante();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
				}

				if(this.empleadoconstante.getvalor()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where valor = "+this.empleadoconstante.getvalor().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoConstante(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonesta_activoEmpleadoConstanteBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.getempleadoconstante(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoconstante==null) {
						this.empleadoconstante = new EmpleadoConstante();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);
				}

				if(this.empleadoconstante.getesta_activo()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where esta_activo = "+this.empleadoconstante.getesta_activo().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoConstante(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdConstanteNomiEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoConstante(false,false);

			this.getEmpleadoConstantesFK_IdConstanteNomi();

			this.inicializarActualizarBindingEmpleadoConstante(false);

			//if(EmpleadoConstanteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoConstante(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpleadoEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoConstante(false,false);

			this.getEmpleadoConstantesFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoConstante(false);

			//if(EmpleadoConstanteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoConstante(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoConstanteActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoConstante(false,false);

			this.getEmpleadoConstantesFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoConstante(false);

			//if(EmpleadoConstanteBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoConstante(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoconstanteLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoConstante() {
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
			this.jInternalFrameDetalleFormEmpleadoConstante.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoConstante.dispose();
			this.jInternalFrameDetalleFormEmpleadoConstante=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoConstante!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoConstante.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoConstante.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoConstante=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoConstante!=null) {
			this.jInternalFrameImportacionEmpleadoConstante.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoConstante.dispose();
			this.jInternalFrameImportacionEmpleadoConstante=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoConstante();
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoConstante")) {
				jButtonNuevoEmpleadoConstanteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoConstante")) {
				jButtonDuplicarEmpleadoConstanteActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoConstante")) {
				jButtonCopiarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoConstante")) {
				jButtonVerFormEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoConstante")) {
				jButtonNuevoEmpleadoConstanteActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoConstante")) {
				jButtonDuplicarEmpleadoConstanteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoConstante")) {
				jButtonNuevoEmpleadoConstanteActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoConstante")) {
				jButtonDuplicarEmpleadoConstanteActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoConstante")) {
				jButtonNuevoEmpleadoConstanteActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoConstante")) {
				jButtonNuevoEmpleadoConstanteActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoConstante")) {
				jButtonNuevoEmpleadoConstanteActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoConstante")) {
				jButtonModificarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoConstante")) {
				jButtonModificarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoConstante")) {
				jButtonModificarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoConstante")) {
				jButtonActualizarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoConstante")) {
				jButtonActualizarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoConstante")) {
				jButtonActualizarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoConstante")) {
				jButtonEliminarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoConstante")) {
				jButtonEliminarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoConstante")) {
				jButtonEliminarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoConstante")) {
				jButtonCancelarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoConstante")) {
				jButtonCancelarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoConstante")) {
				jButtonCancelarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoConstante")) {
				jButtonCerrarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoConstante")) {
				jButtonCerrarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoConstante")) {
				jButtonCerrarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoConstante")) {
				jButtonMostrarOcultarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoConstante")) {
				jButtonCancelarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoConstante")) {
				jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoConstante")) {
				jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoConstante")) {
				jButtonCopiarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoConstante")) {
				jButtonVerFormEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoConstante")) {
				jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoConstante")) {
				jButtonCopiarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoConstante")) {
				jButtonVerFormEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoConstante")) {
				jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoConstante")) {
				jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoConstante")) {
				jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoConstante")) {
				jButtonRecargarInformacionEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoConstante")) {
				jButtonRecargarInformacionEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoConstante")) {
				jButtonRecargarInformacionEmpleadoConstanteActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoConstante")) {
				jButtonAnterioresEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoConstante")) {
				jButtonAnterioresEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoConstante")) {
				jButtonAnterioresEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoConstante")) {
				jButtonSiguientesEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoConstante")) {
				jButtonSiguientesEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoConstante")) {
				jButtonSiguientesEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoConstante") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoConstante")) {
				jButtonAbrirOrderByEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoConstante") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoConstante")) {
				jButtonMostrarOcultarEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoConstante")) {
				jButtonNuevoGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoConstante")) {
				jButtonNuevoGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoConstante")) {
				jButtonNuevoGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoConstante")) {
				jButtonCerrarReporteDinamicoEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoConstante")) {
				jButtonGenerarReporteDinamicoEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoConstante")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoConstante")) {
				jButtonCerrarImportacionEmpleadoConstanteActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoConstante")) {
				
				jButtonGenerarImportacionEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoConstante")) {
				
				jButtonAbrirImportacionEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoConstante")) {
				jComboBoxTiposAccionesEmpleadoConstanteActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoConstante")) {
				jComboBoxTiposRelacionesEmpleadoConstanteActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoConstante")) {
				jComboBoxTiposAccionesEmpleadoConstanteActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoConstante")) {
				
				jComboBoxTiposSeleccionarEmpleadoConstanteActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoConstante")) {
				jTextFieldValorCampoGeneralEmpleadoConstanteActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoConstante")) {
				jButtonAbrirOrderByEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoConstante")) {
				jButtonAbrirOrderByEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoConstante")) {
				jButtonCerrarOrderByEmpleadoConstanteActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoConstanteBusqueda")) {
				this.jButtonidEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoConstanteUpdate")) {
				this.jButtonid_empresaEmpleadoConstanteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoConstanteBusqueda")) {
				this.jButtonid_empresaEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoConstanteUpdate")) {
				this.jButtonid_empleadoEmpleadoConstanteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoConstanteBusqueda")) {
				this.jButtonid_empleadoEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_constante_nomiEmpleadoConstanteUpdate")) {
				this.jButtonid_constante_nomiEmpleadoConstanteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_constante_nomiEmpleadoConstanteBusqueda")) {
				this.jButtonid_constante_nomiEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorEmpleadoConstanteBusqueda")) {
				this.jButtonvalorEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoEmpleadoConstanteBusqueda")) {
				this.jButtonesta_activoEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			
			
			
			
			else if(sTipo.equals("FK_IdConstanteNomiEmpleadoConstante")) {
				this.jButtonFK_IdConstanteNomiEmpleadoConstanteActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoConstante")) {
				this.jButtonFK_IdEmpleadoEmpleadoConstanteActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoConstante();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoConstanteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				


				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoConstante empleadoconstanteLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadoconstanteLocal=this.empleadoconstante;
			} else {
				empleadoconstanteLocal=this.empleadoconstanteAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
							
				
				


				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoConstanteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
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
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
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
			
			


			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoConstanteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
								
						
				


				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
								
				
				


				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoConstanteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoConstanteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoConstanteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
							
				
				


				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoConstanteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
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
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
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
			
			


			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoConstanteActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
								
				
				


				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoConstanteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoConstanteActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoConstanteActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoConstante")) {
					jCheckBoxSeleccionarTodosEmpleadoConstanteItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoConstante")) {
					jCheckBoxSeleccionadosEmpleadoConstanteItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoConstante")) {
					
				}
				
				


				
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
												
				
				


				
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoConstanteActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoConstanteActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
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
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
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
			
			


			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoConstanteActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoconstante);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoconstante);
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
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
				
				


				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoConstante.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoConstante.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoConstanteActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoconstanteAnterior =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoConstante")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoConstanteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoConstante.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadoconstante =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadoconstante =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadoconstante);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoConstante")) {
				
				}
				
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoConstante")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoConstante.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoConstante")) {
			
			}
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoConstante();
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoConstante")) {
				jButtonNuevoEmpleadoConstanteActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoConstante")) {
				jButtonDuplicarEmpleadoConstanteActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoConstante")) {
				jButtonCopiarEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoConstante")) {
				jButtonVerFormEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoConstante")) {
				jButtonNuevoEmpleadoConstanteActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoConstante")) {
				jButtonModificarEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoConstante")) {
				jButtonActualizarEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoConstante")) {
				jButtonEliminarEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoConstante")) {
				jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoConstante")) {
				jButtonCancelarEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoConstante")) {
				jButtonCerrarEmpleadoConstanteActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoConstante")) {
				jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoConstante")) {
				jButtonNuevoGuardarCambiosEmpleadoConstanteActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoConstante")) {
				jButtonAbrirOrderByEmpleadoConstanteActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoConstante")) {
				jButtonRecargarInformacionEmpleadoConstanteActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoConstante")) {
				jButtonAnterioresEmpleadoConstanteActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoConstante")) {
				jButtonSiguientesEmpleadoConstanteActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoConstanteBusqueda")) {
				this.jButtonidEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoConstanteUpdate")) {
				this.jButtonid_empresaEmpleadoConstanteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoConstanteBusqueda")) {
				this.jButtonid_empresaEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoConstanteUpdate")) {
				this.jButtonid_empleadoEmpleadoConstanteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoConstanteBusqueda")) {
				this.jButtonid_empleadoEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_constante_nomiEmpleadoConstanteUpdate")) {
				this.jButtonid_constante_nomiEmpleadoConstanteUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_constante_nomiEmpleadoConstanteBusqueda")) {
				this.jButtonid_constante_nomiEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("valorEmpleadoConstanteBusqueda")) {
				this.jButtonvalorEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("esta_activoEmpleadoConstanteBusqueda")) {
				this.jButtonesta_activoEmpleadoConstanteBusquedaActionPerformed(evt);
			}
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoConstante();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoConstante")) {
				closingInternalFrameEmpleadoConstante();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoConstante")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoConstante = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoConstanteBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoConstanteBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoConstante.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoConstanteActionPerformed(null);
			}
			
			EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoconstante,new Object(),this.empleadoconstanteParameterGeneral,this.empleadoconstanteReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoConstante(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoConstante(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoConstante(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadoconstante)) {
			if(!esControlTabla) {
				if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);			
				}
				
				if(this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoConstante(this.empleadoconstante,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoconstanteReturnGeneral=empleadoconstanteLogic.procesarEventosEmpleadoConstantesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoconstanteLogic.getEmpleadoConstantes(),this.empleadoconstante,this.empleadoconstanteParameterGeneral,this.isEsNuevoEmpleadoConstante,classes);//this.empleadoconstanteLogic.getEmpleadoConstante()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoConstante(this.empleadoconstanteReturnGeneral,this.empleadoconstanteBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoConstante(classes,this.empleadoconstanteReturnGeneral,this.empleadoconstanteBean,false);
					}
						
					if(this.empleadoconstanteReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoConstante(this.empleadoconstanteReturnGeneral.getEmpleadoConstante());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoConstante(this.empleadoconstanteReturnGeneral.getEmpleadoConstante());	
					}
						
					if(this.empleadoconstanteReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoConstante(this.empleadoconstanteReturnGeneral.getEmpleadoConstante(),classes);//this.empleadoconstanteBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoConstante(this.empleadoconstante,classes);//this.empleadoconstanteBean);									
				}
			
				if(EmpleadoConstanteJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoConstante(this.empleadoconstante,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoConstante(this.empleadoconstante);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadoconstanteAnterior!=null) {
						this.empleadoconstante=this.empleadoconstanteAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoconstanteReturnGeneral=empleadoconstanteLogic.procesarEventosEmpleadoConstantesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoconstanteLogic.getEmpleadoConstantes(),this.empleadoconstante,this.empleadoconstanteParameterGeneral,this.isEsNuevoEmpleadoConstante,classes);//this.empleadoconstanteLogic.getEmpleadoConstante()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoconstanteSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoconstanteSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadoconstanteReturnGeneral.getEmpleadoConstante(),empleadoconstanteLogic.getEmpleadoConstantes());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadoconstanteReturnGeneral.getEmpleadoConstante(),this.empleadoconstantes);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoConstante.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoConstante.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoConstante();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoConstante() throws Exception {
		
		EmpleadoConstanteModel empleadoconstanteModel=(EmpleadoConstanteModel)this.jTableDatosEmpleadoConstante.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoconstanteModel.empleadoconstantes=this.empleadoconstanteLogic.getEmpleadoConstantes();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadoconstanteModel.empleadoconstantes=this.empleadoconstantes;
		}
		
		
		((EmpleadoConstanteModel) this.jTableDatosEmpleadoConstante.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoConstante() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadoconstanteAnterior(),this.empleadoconstanteLogic.getEmpleadoConstantes());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadoconstanteAnterior(),this.empleadoconstantes);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoConstante();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoConstante(EmpleadoConstante empleadoconstante,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
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
										
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoconstante,new Object(),generalEntityParameterGeneral,this.empleadoconstanteReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadoconstanteSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoConstanteConstantesFunciones.getClassesRelationshipsOfEmpleadoConstante(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoConstanteConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoConstante(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoConstante(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoConstanteBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoconstante,new Object(),generalEntityParameterGeneral,this.empleadoconstanteReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoConstante(EmpleadoConstanteBean empleadoconstanteBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoConstante(ArrayList<Classe> classes,EmpleadoConstanteReturnGeneral empleadoconstanteReturnGeneral,EmpleadoConstanteBean empleadoconstanteBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoConstante(EmpleadoConstante empleadoconstante,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadoconstante)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoConstante = new EmpleadoConstanteDetalleFormJInternalFrame(jDesktopPane,this.empleadoconstanteSessionBean.getConGuardarRelaciones(),this.empleadoconstanteSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoConstante.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoConstante.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoConstante.empleadoconstanteLogic=this.empleadoconstanteLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoConstante("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoConstante();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoConstante();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoConstante("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoConstante();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoConstante.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoConstante"));
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonModificarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoConstante"));

		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonModificarToolBarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoConstante"));
					
		this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemModificarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoConstante"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonActualizarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoConstante"));
		
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonActualizarToolBarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoConstante"));
						
		this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemActualizarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoConstante"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonEliminarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoConstante"));
		
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonEliminarToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoConstante"));
								
		this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemEliminarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoConstante"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonCancelarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoConstante"));
		
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonCancelarToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoConstante"));
					
		this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemCancelarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoConstante"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemDetalleCerrarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoConstante"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoConstante"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoConstante"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoConstante"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonidEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoConstanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empresaEmpleadoConstanteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoConstanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empresaEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoConstanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empleadoEmpleadoConstanteUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoConstanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empleadoEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoConstanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_constante_nomiEmpleadoConstanteUpdate.addActionListener(new ButtonActionListener(this,"id_constante_nomiEmpleadoConstanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_constante_nomiEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"id_constante_nomiEmpleadoConstanteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonvalorEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"valorEmpleadoConstanteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonesta_activoEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEmpleadoConstanteBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoConstante.jTabbedPaneRelacionesEmpleadoConstante.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoConstante"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoConstante"));
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoConstante"));
		}
		
		this.jTableDatosEmpleadoConstante.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoConstante"));
		
		this.jTableDatosEmpleadoConstante.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoConstante"));
		
		this.jButtonNuevoEmpleadoConstante.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoConstante"));
		
		this.jButtonDuplicarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoConstante"));
		
		this.jButtonCopiarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoConstante"));
		
		this.jButtonVerFormEmpleadoConstante.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoConstante"));
		
		
		this.jButtonNuevoToolBarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoConstante"));
			
		this.jButtonDuplicarToolBarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoConstante"));
			
		this.jMenuItemNuevoEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoConstante"));
			
		this.jMenuItemDuplicarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoConstante"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoConstante.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoConstante"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoConstante"));
			
		this.jMenuItemNuevoRelacionesEmpleadoConstante.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoConstante"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonModificarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoConstante"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonModificarToolBarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoConstante"));
			
			this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemModificarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoConstante"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonActualizarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoConstante"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonActualizarToolBarEmpleadoConstante.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoConstante"));
				
			this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemActualizarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoConstante"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonEliminarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoConstante"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonEliminarToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoConstante"));
						
			this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemEliminarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoConstante"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonCancelarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoConstante"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonCancelarToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoConstante"));
			
			this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemCancelarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoConstante"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoConstante"));		
		
		
		this.jButtonCerrarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoConstante"));
		
		
		this.jButtonCerrarToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoConstante"));
			
		this.jMenuItemCerrarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoConstante"));
			
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jMenuItemDetalleCerrarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoConstante"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosEmpleadoConstante.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoConstante"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoConstante"));
		}
		
		this.jButtonCopiarToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoConstante"));
			
		this.jButtonVerFormToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoConstante"));
		
		this.jMenuItemGuardarCambiosEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoConstante"));
			
		this.jMenuItemCopiarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoConstante"));		
		
		this.jMenuItemVerFormEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoConstante"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoConstante.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoConstante"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoConstante"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoConstante.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoConstante"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoConstante.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoConstante"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoConstante"));
		
		this.jMenuItemRecargarInformacionEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoConstante"));		
		
		
		
		this.jButtonAnterioresEmpleadoConstante.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoConstante"));
		
		
		this.jButtonAnterioresToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoConstante"));
		
		this.jMenuItemAnterioresEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoConstante"));		
		
		
		this.jButtonSiguientesEmpleadoConstante.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoConstante"));
		
		
		this.jButtonSiguientesToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoConstante"));
			
		this.jMenuItemSiguientesEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoConstante"));
			
		this.jMenuItemAbrirOrderByEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoConstante"));
			
		this.jMenuItemMostrarOcultarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoConstante"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoConstante"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoConstante"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoConstante.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoConstante"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoConstante"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoConstante.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoConstante"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoConstante.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoConstante"));

		this.jCheckBoxSeleccionadosEmpleadoConstante.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoConstante"));
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoConstante"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoConstante.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoConstante"));
			
		this.jComboBoxTiposAccionesEmpleadoConstante.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoConstante"));
					
		this.jComboBoxTiposSeleccionarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoConstante"));
			
		this.jTextFieldValorCampoGeneralEmpleadoConstante.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoConstante"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonidEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoConstanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empresaEmpleadoConstanteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoConstanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empresaEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoConstanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empleadoEmpleadoConstanteUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoConstanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empleadoEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoConstanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_constante_nomiEmpleadoConstanteUpdate.addActionListener(new ButtonActionListener(this,"id_constante_nomiEmpleadoConstanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_constante_nomiEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"id_constante_nomiEmpleadoConstanteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonvalorEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"valorEmpleadoConstanteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonesta_activoEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEmpleadoConstanteBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdConstanteNomiEmpleadoConstante.addActionListener(new ButtonActionListener(this,"FK_IdConstanteNomiEmpleadoConstante"));

			this.jButtonFK_IdEmpleadoEmpleadoConstante.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoConstante"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoConstante!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoConstante.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoConstante"));
				this.jInternalFrameReporteDinamicoEmpleadoConstante.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoConstante"));
				this.jInternalFrameReporteDinamicoEmpleadoConstante.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoConstante"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoConstante.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoConstante"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoConstante.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoConstante"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoConstante.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoConstante"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoConstante!=null) {
				this.jInternalFrameImportacionEmpleadoConstante.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoConstante"));
				this.jInternalFrameImportacionEmpleadoConstante.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoConstante"));
				this.jInternalFrameImportacionEmpleadoConstante.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoConstante"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoConstante.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoConstante"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoConstante.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoConstante"));			
			
			if(this.jInternalFrameOrderByEmpleadoConstante!=null) {
				this.jInternalFrameOrderByEmpleadoConstante.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoConstante"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoConstante.jTabbedPaneRelacionesEmpleadoConstante.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoConstante"));
		
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
            		closingInternalFrameEmpleadoConstante();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoConstante.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoConstante = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoConstanteBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoConstanteBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoConstante.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoConstanteActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoConstante.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoConstanteListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoConstante.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoConstante.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoConstanteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoConstanteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoConstanteActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoConstante";
		inputMap = this.jButtonNuevoEmpleadoConstante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoConstante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoConstanteActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoConstanteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoConstanteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoConstanteActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoConstante";
		inputMap = this.jButtonNuevoRelacionesEmpleadoConstante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoConstante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoConstanteActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoConstante";
		inputMap = this.jButtonModificarEmpleadoConstante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoConstante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoConstanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoConstante";
		inputMap = this.jButtonActualizarEmpleadoConstante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoConstante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoConstanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoConstante";
		inputMap = this.jButtonEliminarEmpleadoConstante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoConstante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoConstanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoConstante";
		inputMap = this.jButtonCancelarEmpleadoConstante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoConstante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoConstanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoConstante";
		inputMap = this.jButtonCerrarEmpleadoConstante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoConstante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoConstanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoConstante";
		inputMap = this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosEmpleadoConstante.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonGuardarCambiosEmpleadoConstante.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoConstanteActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoConstante.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoConstanteItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoConstante.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoConstanteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoConstante.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoConstanteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoConstante.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoConstanteActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonidEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoConstanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empresaEmpleadoConstanteUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoConstanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empresaEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoConstanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empleadoEmpleadoConstanteUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoConstanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_empleadoEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoConstanteBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_constante_nomiEmpleadoConstanteUpdate.addActionListener(new ButtonActionListener(this,"id_constante_nomiEmpleadoConstanteUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonid_constante_nomiEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"id_constante_nomiEmpleadoConstanteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonvalorEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"valorEmpleadoConstanteBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoConstante.jButtonesta_activoEmpleadoConstanteBusqueda.addActionListener(new ButtonActionListener(this,"esta_activoEmpleadoConstanteBusqueda"));
		
		
		this.jButtonFK_IdConstanteNomiEmpleadoConstante.addActionListener(new ButtonActionListener(this,"FK_IdConstanteNomiEmpleadoConstante"));

		this.jButtonFK_IdEmpleadoEmpleadoConstante.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoConstante"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoConstante.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoConstanteActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoConstanteActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoConstante.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoConstante(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstanteLogic.getEmpleadoConstantes()) {
					empleadoconstanteAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoConstante empleadoconstanteAux:empleadoconstantes) {
					empleadoconstanteAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoConstanteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoConstante(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstanteLogic.getEmpleadoConstantes()) {
						empleadoconstanteAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoConstante empleadoconstanteAux:empleadoconstantes) {
						empleadoconstanteAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstanteLogic.getEmpleadoConstantes()) {
					
						if(sTipoSeleccionar.equals(EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							empleadoconstanteAux.setesta_activo(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoConstante empleadoconstanteAux:empleadoconstantes) {
						
						if(sTipoSeleccionar.equals(EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO)) {
							existe=true;
							empleadoconstanteAux.setesta_activo(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoConstante(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoConstante.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoConstante.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoConstanteItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoConstante(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoConstante.getSelectedRows();
			
			EmpleadoConstante empleadoconstanteLocal=new EmpleadoConstante();
			
			//this.seleccionarTodosEmpleadoConstante(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoconstanteLocal =(EmpleadoConstante) this.empleadoconstanteLogic.getEmpleadoConstantes().toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadoconstanteLocal =(EmpleadoConstante) this.empleadoconstantes.toArray()[this.jTableDatosEmpleadoConstante.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadoconstanteLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstanteLogic.getEmpleadoConstantes()) {
						empleadoconstanteAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoConstante empleadoconstanteAux:empleadoconstantes) {
						empleadoconstanteAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoConstante(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoConstante.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoConstante.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoConstante,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoConstanteItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoConstanteParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoConstanteActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoConstante(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoConstante.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstanteLogic.getEmpleadoConstantes()) {
				
						if(sTipoSeleccionar.equals(EmpleadoConstanteConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							empleadoconstanteAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoConstante empleadoconstanteAux:empleadoconstantes) {
					
						if(sTipoSeleccionar.equals(EmpleadoConstanteConstantesFunciones.LABEL_VALOR)) {
							existe=true;
							empleadoconstanteAux.setvalor(Double.parseDouble(this.sValorCampoGeneral));
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoConstante(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoConstanteActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoConstante(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoConstante=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoConstante.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoConstante) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoConstante(conSplash);
				
					this.generarReporteEmpleadoConstantesSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoConstantesSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoConstantesSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoConstantesSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoConstante();
				
				this.exportarEmpleadoConstantesSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoConstantes();
				//this.importarEmpleadoConstantes();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoConstante();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoConstantesSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Constante", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoConstante();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoConstante)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoConstante(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Constante",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoConstanteBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoConstante) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoConstante(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoConstante();
						
						this.generarReporteProcesoAccionEmpleadoConstantesSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoConstanteBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado ConstanteS SELECCIONADOS?", "MANTENIMIENTO DE Empleado Constante", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoConstante();
				
						this.actualizarParametrosGeneralEmpleadoConstante();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadoconstanteReturnGeneral=empleadoconstanteLogic.procesarAccionEmpleadoConstantesWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadoconstanteLogic.getEmpleadoConstantes(),this.empleadoconstanteParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoConstanteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoConstante();
					
					EmpleadoConstanteBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoConstanteReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoConstante.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxTiposAccionesFormularioEmpleadoConstante.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoConstante(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoConstanteActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoConstante();
			
			if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();		
			EmpleadoConstante empleadoconstante=new EmpleadoConstante();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoConstante(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoConstante.getSelectedItem();
			
			
			
			
			empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadoconstantesSeleccionados.size()==1) {
				for(EmpleadoConstante empleadoconstanteAux:empleadoconstantesSeleccionados) {
					empleadoconstante=empleadoconstanteAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoConstante();
			
      		//this.finishProcessEmpleadoConstante(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoConstanteReturnGeneral() throws Exception {
		if(this.empleadoconstanteReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadoconstanteReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadoconstanteReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadoconstanteReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadoconstanteReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadoconstanteReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoConstante(false);
		}
		
		if(this.empleadoconstanteReturnGeneral.getConRetornoLista() || this.empleadoconstanteReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadoconstanteReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoconstanteLogic.setEmpleadoConstantes(this.empleadoconstanteReturnGeneral.getEmpleadoConstantes());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadoconstanteReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoconstanteLogic.setEmpleadoConstante(this.empleadoconstanteReturnGeneral.getEmpleadoConstante());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoConstante(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoConstante() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoConstante> getEmpleadoConstantesSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoConstante) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoConstante empleadoconstanteAux:empleadoconstanteLogic.getEmpleadoConstantes()) {
					if(empleadoconstanteAux.getIsSelected()) {
						empleadoconstantesSeleccionados.add(empleadoconstanteAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoConstante empleadoconstanteAux:this.empleadoconstantes) {
					if(empleadoconstanteAux.getIsSelected()) {
						empleadoconstantesSeleccionados.add(empleadoconstanteAux);				
					}
				}
			}
			
			if(empleadoconstantesSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadoconstantesSeleccionados.addAll(this.empleadoconstanteLogic.getEmpleadoConstantes());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadoconstantesSeleccionados.addAll(this.empleadoconstantes);				
					}
				}
			}
		} else {
			empleadoconstantesSeleccionados.add(this.empleadoconstante);
		}
		
		return empleadoconstantesSeleccionados;
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
	
	public void generarReporteEmpleadoConstantesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoConstantesSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoConstantesSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoConstantesSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoConstantesSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Constante",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoConstantesSeleccionados() throws Exception {
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();		
		
		empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoConstantes("Todos",empleadoconstantesSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoConstantesSeleccionados() throws Exception {
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();		
		
		empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoConstantes("Todos",empleadoconstantesSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoConstantesSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();
		
		empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoConstantes("Todos",empleadoconstantesSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoConstantesSeleccionados() throws Exception {
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoConstante();
		
		
		empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoConstante();
		
		
		//this.generarReporteEmpleadoConstantes("Todos",empleadoconstantesSeleccionados ,empleadoconstanteImplementable,empleadoconstanteImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoConstantes() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoConstante();
		
		this.abrirFrameImportacionEmpleadoConstante();		
		
			
		//this.generarReporteEmpleadoConstantes("Todos",empleadoconstantesSeleccionados ,empleadoconstanteImplementable,empleadoconstanteImplementableHome);
	}
	
	public void importarEmpleadoConstantes() throws Exception {		
	
	}
	
	public void exportarEmpleadoConstantesSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoConstantesSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoConstantesSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoConstantesSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Constante",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoConstantesSeleccionados() throws Exception {
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();		
		
		empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoconstante."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoConstante(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoConstante empleadoconstanteAux:empleadoconstantesSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoConstante(empleadoconstanteAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadoconstanteAux.setsDetalleGeneralEntityReporte(empleadoconstanteAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Constante",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoConstante(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoConstanteConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoConstanteConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoConstanteConstantesFunciones.LABEL_VALOR;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoConstante(EmpleadoConstante empleadoconstante,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadoconstante.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoconstante.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoconstante.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoconstante.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoconstante.getconstantenomi_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoconstante.getvalor().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoconstante.getesta_activo().toString();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoConstantesSeleccionados() throws Exception {
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();		
		
		empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoconstante.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoConstantes");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoConstante(row);				
				iRow++;
			}				
			
			for(EmpleadoConstante empleadoconstanteAux:empleadoconstantesSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoConstante(empleadoconstanteAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Constante",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoConstantesSeleccionados() throws Exception {
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();		
		
		empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoconstante.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadoconstantes");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadoconstante");
			//elementRoot.appendChild(element);
		
			for(EmpleadoConstante empleadoconstanteAux:empleadoconstantesSeleccionados) {
				element = document.createElement("empleadoconstante");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoConstante(empleadoconstanteAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Constante",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoConstante(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_VALOR);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoConstante(EmpleadoConstante empleadoconstante,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoconstante.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoconstante.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoconstante.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoconstante.getconstantenomi_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoconstante.getvalor());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoconstante.getesta_activo());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoConstante(EmpleadoConstante empleadoconstante,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoConstanteConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadoconstante.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoConstanteConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadoconstante.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoConstanteConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadoconstante.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoConstanteConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadoconstante.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementconstantenomi_descripcion = document.createElement(EmpleadoConstanteConstantesFunciones.IDCONSTANTENOMI);
		elementconstantenomi_descripcion.appendChild(document.createTextNode(empleadoconstante.getconstantenomi_descripcion()));
		element.appendChild(elementconstantenomi_descripcion);

		Element elementvalor = document.createElement(EmpleadoConstanteConstantesFunciones.VALOR);
		elementvalor.appendChild(document.createTextNode(empleadoconstante.getvalor().toString().trim()));
		element.appendChild(elementvalor);

		Element elementesta_activo = document.createElement(EmpleadoConstanteConstantesFunciones.ESTAACTIVO);
		elementesta_activo.appendChild(document.createTextNode(empleadoconstante.getesta_activo().toString().trim()));
		element.appendChild(elementesta_activo);
	}
	
	public void generarReporteGroupGenericoEmpleadoConstantesSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados=new ArrayList<EmpleadoConstante>();
		
		empleadoconstantesSeleccionados=this.getEmpleadoConstantesSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoConstante(empleadoconstantesSeleccionados);
		
		this.generarReporteEmpleadoConstantes("Todos",empleadoconstantesSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoConstante(ArrayList<EmpleadoConstante> empleadoconstantesSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoConstante empleadoconstanteAux:empleadoconstantesSeleccionados) {
				empleadoconstanteAux.setsDetalleGeneralEntityReporte(empleadoconstanteAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadoconstanteAux.setsDescripcionGeneralEntityReporte1(empleadoconstanteAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoConstanteConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadoconstanteAux.setsDescripcionGeneralEntityReporte1(empleadoconstanteAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoConstanteConstantesFunciones.LABEL_IDCONSTANTENOMI)) {
					existe=true;
					empleadoconstanteAux.setsDescripcionGeneralEntityReporte1(empleadoconstanteAux.getconstantenomi_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoConstanteConstantesFunciones.LABEL_ESTAACTIVO)) {
					existe=true;
					empleadoconstanteAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(empleadoconstanteAux.getesta_activo()));
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoConstanteConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoConstante(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoConstante=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoConstante=false;
			this.isVisibilidadCeldaActualizarEmpleadoConstante=false;
			this.isVisibilidadCeldaEliminarEmpleadoConstante=false;
			this.isVisibilidadCeldaCancelarEmpleadoConstante=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoConstante=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=false;
			this.isVisibilidadCeldaModificarEmpleadoConstante=false;
			this.isVisibilidadCeldaActualizarEmpleadoConstante=true;
			this.isVisibilidadCeldaEliminarEmpleadoConstante=false;
			this.isVisibilidadCeldaCancelarEmpleadoConstante=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoConstante=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=false;
			this.isVisibilidadCeldaModificarEmpleadoConstante=false;
			this.isVisibilidadCeldaActualizarEmpleadoConstante=true;
			this.isVisibilidadCeldaEliminarEmpleadoConstante=true;
			this.isVisibilidadCeldaCancelarEmpleadoConstante=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoConstante=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=false;
			this.isVisibilidadCeldaModificarEmpleadoConstante=false;
			this.isVisibilidadCeldaActualizarEmpleadoConstante=true;
			this.isVisibilidadCeldaEliminarEmpleadoConstante=false;
			this.isVisibilidadCeldaCancelarEmpleadoConstante=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoConstante=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=true;
			this.isVisibilidadCeldaModificarEmpleadoConstante=false;
			this.isVisibilidadCeldaActualizarEmpleadoConstante=false;
			this.isVisibilidadCeldaEliminarEmpleadoConstante=false;
			this.isVisibilidadCeldaCancelarEmpleadoConstante=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoConstante=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=false;
			this.isVisibilidadCeldaActualizarEmpleadoConstante=false;
			this.isVisibilidadCeldaEliminarEmpleadoConstante=false;
			this.isVisibilidadCeldaCancelarEmpleadoConstante=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoConstante=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=false;
			this.isVisibilidadCeldaModificarEmpleadoConstante=true;
			this.isVisibilidadCeldaActualizarEmpleadoConstante=false;
			this.isVisibilidadCeldaEliminarEmpleadoConstante=false;
			this.isVisibilidadCeldaCancelarEmpleadoConstante=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoConstante=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoConstanteJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoConstante=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoConstante(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoConstante=false;
			//this.isVisibilidadCeldaVerFormEmpleadoConstante=false;
			this.isVisibilidadCeldaDuplicarEmpleadoConstante=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadoconstanteSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoConstante=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoConstante=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
			if(!empleadoconstanteSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=false;												
			}
			
			this.jButtonCerrarEmpleadoConstante.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoConstante=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadoconstante)) {
			this.isVisibilidadCeldaActualizarEmpleadoConstante=false;
			this.isVisibilidadCeldaEliminarEmpleadoConstante=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoConstante() {
	}
	
	public void actualizarEstadoPanelsEmpleadoConstante(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoConstante!=null) {
				this.jScrollPanelDatosEdicionEmpleadoConstante.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoConstante!=null) {
				this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoConstante!=null) {
				this.jScrollPanelDatosEmpleadoConstante.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoConstante!=null) {
				this.jPanelPaginacionEmpleadoConstante.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoConstante!=null) {
				this.jPanelParametrosReportesEmpleadoConstante.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoConstante!=null) {
				this.jScrollPanelDatosEdicionEmpleadoConstante.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoConstante!=null) {
				this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoConstante!=null) {
				this.jScrollPanelDatosEmpleadoConstante.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoConstante!=null) {
				this.jPanelPaginacionEmpleadoConstante.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoConstante!=null) {
				this.jPanelParametrosReportesEmpleadoConstante.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoConstante!=null) {
				this.jScrollPanelDatosEdicionEmpleadoConstante.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoConstante!=null) {
				this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoConstante!=null) {
				this.jScrollPanelDatosEmpleadoConstante.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoConstante!=null) {
				this.jPanelPaginacionEmpleadoConstante.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoConstante!=null) {
				this.jPanelParametrosReportesEmpleadoConstante.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoConstante!=null) {
				this.jScrollPanelDatosEdicionEmpleadoConstante.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoConstante!=null) {
				this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoConstante!=null) {
				this.jScrollPanelDatosEmpleadoConstante.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoConstante!=null) {
				this.jPanelPaginacionEmpleadoConstante.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoConstante!=null) {
				this.jPanelParametrosReportesEmpleadoConstante.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoConstante!=null) {
				this.jScrollPanelDatosEdicionEmpleadoConstante.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoConstante!=null) {
				this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoConstante!=null) {
				this.jScrollPanelDatosEmpleadoConstante.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoConstante!=null) {
				this.jPanelPaginacionEmpleadoConstante.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoConstante!=null) {
				this.jPanelParametrosReportesEmpleadoConstante.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoConstante!=null) {
				this.jScrollPanelDatosEdicionEmpleadoConstante.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoConstante!=null) {
				this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoConstante!=null) {
				this.jScrollPanelDatosEmpleadoConstante.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoConstante!=null) {
				this.jPanelPaginacionEmpleadoConstante.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoConstante!=null) {
				this.jPanelParametrosReportesEmpleadoConstante.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoConstante!=null) {
				this.jScrollPanelDatosEdicionEmpleadoConstante.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoConstante!=null) {
				this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoConstante!=null) {
				this.jScrollPanelDatosEmpleadoConstante.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoConstante!=null) {
				this.jPanelPaginacionEmpleadoConstante.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoConstante!=null) {
				this.jPanelParametrosReportesEmpleadoConstante.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoConstante!=null) {
					this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoConstante!=null) {
				this.jPanelParametrosReportesEmpleadoConstante.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadoconstanteSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoConstante!=null) {
				this.jTabbedPaneBusquedasEmpleadoConstante.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoConstante!=null) {
				this.jPanelParametrosReportesEmpleadoConstante.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdConstanteNomi=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdConstanteNomi) {this.jTabbedPaneBusquedasEmpleadoConstante.remove(jPanelFK_IdConstanteNomiEmpleadoConstante);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoConstante.remove(jPanelFK_IdEmpleadoEmpleadoConstante);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdConstanteNomi=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdConstanteNomi) {this.jTabbedPaneBusquedasEmpleadoConstante.remove(jPanelFK_IdConstanteNomiEmpleadoConstante);}

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoConstante.remove(jPanelFK_IdEmpleadoEmpleadoConstante);}
		}
		
	}

	public void setVisibilidadBusquedasParaConstanteNomi(Boolean isParaConstanteNomi){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaConstanteNomiNegation=!isParaConstanteNomi;

			this.isVisibilidadFK_IdConstanteNomi=isParaConstanteNomi;
			if(!this.isVisibilidadFK_IdConstanteNomi) {this.jTabbedPaneBusquedasEmpleadoConstante.remove(jPanelFK_IdConstanteNomiEmpleadoConstante);}

			this.isVisibilidadFK_IdEmpleado=isParaConstanteNomiNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoConstante.remove(jPanelFK_IdEmpleadoEmpleadoConstante);}
		}
		
	}
	
	
	
	
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoConstanteSessionBean empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
		
		if(this.empleadoconstanteSessionBean==null) {
			this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
		}
		
		this.empleadoconstanteSessionBean.setsUltimaBusquedaEmpleadoConstante(this.getsAccionBusqueda());
		this.empleadoconstanteSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadoconstanteSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdConstanteNomi")) {
			empleadoconstanteSessionBean.setid_constante_nomi(this.getid_constante_nomiFK_IdConstanteNomi());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadoconstanteSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadoconstanteSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoConstanteSessionBean empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
		
		if(this.empleadoconstanteSessionBean==null) {
			this.empleadoconstanteSessionBean=new EmpleadoConstanteSessionBean();
		}
		
		if(this.empleadoconstanteSessionBean.getsUltimaBusquedaEmpleadoConstante()!=null&&!this.empleadoconstanteSessionBean.getsUltimaBusquedaEmpleadoConstante().equals("")) {
			this.setsAccionBusqueda(empleadoconstanteSessionBean.getsUltimaBusquedaEmpleadoConstante());
			this.setiNumeroPaginacion(empleadoconstanteSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadoconstanteSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdConstanteNomi")) {
				this.setid_constante_nomiFK_IdConstanteNomi(empleadoconstanteSessionBean.getid_constante_nomi());
				empleadoconstanteSessionBean.setid_constante_nomi(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadoconstanteSessionBean.getid_empleado());
				empleadoconstanteSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadoconstanteSessionBean.getid_empresa());
				empleadoconstanteSessionBean.setid_empresa(-1L);
			}
		}
		
		this.empleadoconstanteSessionBean.setsUltimaBusquedaEmpleadoConstante("");
		this.empleadoconstanteSessionBean.setiNumeroPaginacion(EmpleadoConstanteConstantesFunciones.INUMEROPAGINACION);
		this.empleadoconstanteSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoConstante(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoConstante() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoConstante();
		this.updateVisibilidadBusquedasFormularioEmpleadoConstante();
		this.updateHabilitarBusquedasFormularioEmpleadoConstante();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoConstante() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoConstante.getComponents().length>0) {
	

		if(this.empleadoconstanteConstantesFunciones.resaltarFK_IdConstanteNomiEmpleadoConstante!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoConstante.indexOfComponent(this.jPanelFK_IdConstanteNomiEmpleadoConstante);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoConstante.getComponent(index);
				jPanel.setBorder(this.empleadoconstanteConstantesFunciones.resaltarFK_IdConstanteNomiEmpleadoConstante);
			}
		}

		if(this.empleadoconstanteConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoConstante!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoConstante.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoConstante);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoConstante.getComponent(index);
				jPanel.setBorder(this.empleadoconstanteConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoConstante);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoConstante() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoConstante.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoConstante.indexOfComponent(this.jPanelFK_IdConstanteNomiEmpleadoConstante);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoConstante.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoconstanteConstantesFunciones.mostrarFK_IdConstanteNomiEmpleadoConstante);
			if(!this.empleadoconstanteConstantesFunciones.mostrarFK_IdConstanteNomiEmpleadoConstante && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoConstante.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoConstante.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoConstante);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoConstante.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoconstanteConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoConstante);
			if(!this.empleadoconstanteConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoConstante && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoConstante.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoConstante() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoConstante.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoConstante.indexOfComponent(this.jPanelFK_IdConstanteNomiEmpleadoConstante);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoConstante.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoconstanteConstantesFunciones.activarFK_IdConstanteNomiEmpleadoConstante);
				this.jTabbedPaneBusquedasEmpleadoConstante.setEnabledAt(index,this.empleadoconstanteConstantesFunciones.activarFK_IdConstanteNomiEmpleadoConstante);
			}

			index= this.jTabbedPaneBusquedasEmpleadoConstante.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoConstante);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoConstante.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoconstanteConstantesFunciones.activarFK_IdEmpleadoEmpleadoConstante);
				this.jTabbedPaneBusquedasEmpleadoConstante.setEnabledAt(index,this.empleadoconstanteConstantesFunciones.activarFK_IdEmpleadoEmpleadoConstante);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoConstante(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdConstanteNomi")) {
			index= this.jTabbedPaneBusquedasEmpleadoConstante.indexOfComponent(this.jPanelFK_IdConstanteNomiEmpleadoConstante);

			this.jTabbedPaneBusquedasEmpleadoConstante.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoConstante.getComponent(index);

			this.empleadoconstanteConstantesFunciones.setResaltarFK_IdConstanteNomiEmpleadoConstante(resaltar);

			jPanel.setBorder(this.empleadoconstanteConstantesFunciones.resaltarFK_IdConstanteNomiEmpleadoConstante);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoConstante.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoConstante);

			this.jTabbedPaneBusquedasEmpleadoConstante.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoConstante.getComponent(index);

			this.empleadoconstanteConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoConstante(resaltar);

			jPanel.setBorder(this.empleadoconstanteConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoConstante);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoConstante.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpleadoConstante() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoConstante();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoConstante();
		this.updateHabilitarResaltarControlesFormularioEmpleadoConstante();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoConstante() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadoconstanteConstantesFunciones.resaltaridEmpleadoConstante!=null && this.jInternalFrameDetalleFormEmpleadoConstante!=null) {this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.setBorder(this.empleadoconstanteConstantesFunciones.resaltaridEmpleadoConstante);}
		if(this.empleadoconstanteConstantesFunciones.resaltarid_empresaEmpleadoConstante!=null && this.jInternalFrameDetalleFormEmpleadoConstante!=null) {this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.setBorder(this.empleadoconstanteConstantesFunciones.resaltarid_empresaEmpleadoConstante);}
		if(this.empleadoconstanteConstantesFunciones.resaltarid_empleadoEmpleadoConstante!=null && this.jInternalFrameDetalleFormEmpleadoConstante!=null) {this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.setBorder(this.empleadoconstanteConstantesFunciones.resaltarid_empleadoEmpleadoConstante);}
		if(this.empleadoconstanteConstantesFunciones.resaltarid_constante_nomiEmpleadoConstante!=null && this.jInternalFrameDetalleFormEmpleadoConstante!=null) {this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.setBorder(this.empleadoconstanteConstantesFunciones.resaltarid_constante_nomiEmpleadoConstante);}
		if(this.empleadoconstanteConstantesFunciones.resaltarvalorEmpleadoConstante!=null && this.jInternalFrameDetalleFormEmpleadoConstante!=null) {this.jInternalFrameDetalleFormEmpleadoConstante.jTextFieldvalorEmpleadoConstante.setBorder(this.empleadoconstanteConstantesFunciones.resaltarvalorEmpleadoConstante);}
		if(this.empleadoconstanteConstantesFunciones.resaltaresta_activoEmpleadoConstante!=null && this.jInternalFrameDetalleFormEmpleadoConstante!=null) {this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxesta_activoEmpleadoConstante.setBorderPainted(true);this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxesta_activoEmpleadoConstante.setBorder(this.empleadoconstanteConstantesFunciones.resaltaresta_activoEmpleadoConstante);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoConstante() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostraridEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jPanelidEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostraridEmpleadoConstante);
		//this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostrarid_empresaEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jPanelid_empresaEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostrarid_empresaEmpleadoConstante);
		//this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostrarid_empleadoEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jPanelid_empleadoEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostrarid_empleadoEmpleadoConstante);
		//this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostrarid_constante_nomiEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jPanelid_constante_nomiEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostrarid_constante_nomiEmpleadoConstante);
		//this.jInternalFrameDetalleFormEmpleadoConstante.jTextFieldvalorEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostrarvalorEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jPanelvalorEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostrarvalorEmpleadoConstante);
		//this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxesta_activoEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostraresta_activoEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jPanelesta_activoEmpleadoConstante.setVisible(this.empleadoconstanteConstantesFunciones.mostraresta_activoEmpleadoConstante);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoConstante() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoConstante==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoConstante!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoConstante.jLabelidEmpleadoConstante.setEnabled(this.empleadoconstanteConstantesFunciones.activaridEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empresaEmpleadoConstante.setEnabled(this.empleadoconstanteConstantesFunciones.activarid_empresaEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_empleadoEmpleadoConstante.setEnabled(this.empleadoconstanteConstantesFunciones.activarid_empleadoEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jComboBoxid_constante_nomiEmpleadoConstante.setEnabled(this.empleadoconstanteConstantesFunciones.activarid_constante_nomiEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jTextFieldvalorEmpleadoConstante.setEnabled(this.empleadoconstanteConstantesFunciones.activarvalorEmpleadoConstante);
		this.jInternalFrameDetalleFormEmpleadoConstante.jCheckBoxesta_activoEmpleadoConstante.setEnabled(this.empleadoconstanteConstantesFunciones.activaresta_activoEmpleadoConstante);
		}
	}
	
		
}