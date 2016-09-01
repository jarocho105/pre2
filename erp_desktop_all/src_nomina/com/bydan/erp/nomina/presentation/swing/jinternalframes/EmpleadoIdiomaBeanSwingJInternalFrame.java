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

import com.bydan.erp.nomina.util.EmpleadoIdiomaConstantesFunciones;
import com.bydan.erp.nomina.util.EmpleadoIdiomaParameterReturnGeneral;
//import com.bydan.erp.nomina.util.EmpleadoIdiomaParameterGeneral;
//import com.bydan.erp.nomina.presentation.report.source.EmpleadoIdiomaBean;
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
public class EmpleadoIdiomaBeanSwingJInternalFrame extends EmpleadoIdiomaJInternalFrame implements WindowListener,WindowFocusListener
{				
	
	public static final long serialVersionUID = 1L;
	
	public static Logger logger = Logger.getLogger(EmpleadoIdiomaBeanSwingJInternalFrame.class);  
	
	public static ClassValidator<EmpleadoIdioma> empleadoidiomaValidator = new ClassValidator<EmpleadoIdioma>(EmpleadoIdioma.class);
	
	public InvalidValue[] invalidValues=null;
		

	//Ejb Foreign Keys
	
	public EmpleadoIdioma empleadoidioma;	
	public EmpleadoIdioma empleadoidiomaAux;
	public EmpleadoIdioma empleadoidiomaAnterior;//USADO PARA MANEJAR FOCUS GAINED,LOST
	public EmpleadoIdioma empleadoidiomaTotales;
	public Long idEmpleadoIdiomaActual;
	public Long iIdNuevoEmpleadoIdioma=0L;
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

	public String sFinalQueryComboIdioma="";

	public List<Idioma> idiomasForeignKey;

	public List<Idioma> getidiomasForeignKey() {
		return idiomasForeignKey;
	}

	public void setidiomasForeignKey(List<Idioma> idiomasForeignKey) {
		this.idiomasForeignKey = idiomasForeignKey;
	}

	//OBJETO FK ACTUAL
	public Idioma idiomaForeignKey;

	public Idioma getidiomaForeignKey() {
		return idiomaForeignKey;
	}

	public void setidiomaForeignKey(Idioma idiomaForeignKey) {
		this.idiomaForeignKey = idiomaForeignKey;
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
	
	public Boolean isPermisoTodoEmpleadoIdioma;
	public Boolean isPermisoNuevoEmpleadoIdioma;
	public Boolean isPermisoActualizarEmpleadoIdioma;
	public Boolean isPermisoActualizarOriginalEmpleadoIdioma;
	public Boolean isPermisoEliminarEmpleadoIdioma;
	public Boolean isPermisoGuardarCambiosEmpleadoIdioma;
	public Boolean isPermisoConsultaEmpleadoIdioma;
	public Boolean isPermisoBusquedaEmpleadoIdioma;
	public Boolean isPermisoReporteEmpleadoIdioma;
	public Boolean isPermisoPaginacionMedioEmpleadoIdioma;
	public Boolean isPermisoPaginacionAltoEmpleadoIdioma;
	public Boolean isPermisoPaginacionTodoEmpleadoIdioma;
	public Boolean isPermisoCopiarEmpleadoIdioma;
	public Boolean isPermisoVerFormEmpleadoIdioma;
	public Boolean isPermisoDuplicarEmpleadoIdioma;
	public Boolean isPermisoOrdenEmpleadoIdioma;
	
	
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
	
	public EmpleadoIdiomaParameterReturnGeneral empleadoidiomaReturnGeneral;
	public EmpleadoIdiomaParameterReturnGeneral empleadoidiomaParameterGeneral;
	
	 	
	public JasperPrint jasperPrint = null;
	
	public Long lIdUsuarioSesion=0L;				
	
	public Boolean isEsNuevoEmpleadoIdioma=false;
	public Boolean esParaAccionDesdeFormularioEmpleadoIdioma=false;
	public Boolean isEsMantenimientoRelacionesRelacionadoUnico=false;
	public Boolean isEsMantenimientoRelaciones=false;
	public Boolean isEsMantenimientoRelacionado=false;	
	public Boolean isContieneImagenes=false;
		
	//public Boolean conTotales=false; //Viene heredado de JInternalFrameBase
	//public Boolean esParaBusquedaForeignKey=false;
	
	
	protected EmpleadoIdiomaSessionBeanAdditional empleadoidiomaSessionBeanAdditional=null;
	
	public EmpleadoIdiomaSessionBeanAdditional getEmpleadoIdiomaSessionBeanAdditional() {
		return this.empleadoidiomaSessionBeanAdditional;
	}
	
	public void setEmpleadoIdiomaSessionBeanAdditional(EmpleadoIdiomaSessionBeanAdditional empleadoidiomaSessionBeanAdditional) {
		try {
			this.empleadoidiomaSessionBeanAdditional=empleadoidiomaSessionBeanAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	protected EmpleadoIdiomaBeanSwingJInternalFrameAdditional empleadoidiomaBeanSwingJInternalFrameAdditional=null;
	//public class EmpleadoIdiomaBeanSwingJInternalFrame
	
	public EmpleadoIdiomaBeanSwingJInternalFrameAdditional getEmpleadoIdiomaBeanSwingJInternalFrameAdditional() {
		return this.empleadoidiomaBeanSwingJInternalFrameAdditional;
	}
	
	public void setEmpleadoIdiomaBeanSwingJInternalFrameAdditional(EmpleadoIdiomaBeanSwingJInternalFrameAdditional empleadoidiomaBeanSwingJInternalFrameAdditional) {
		try {
			this.empleadoidiomaBeanSwingJInternalFrameAdditional=empleadoidiomaBeanSwingJInternalFrameAdditional;
		} catch(Exception e) {
			;
		}
	}
	
	
	
	
	//ESTA EN PADRE
	
	//public EmpleadoIdiomaLogic empleadoidiomaLogic;
	public SistemaLogicAdditional sistemaLogicAdditional;
	
	
	public EmpleadoIdioma empleadoidiomaBean;
	public EmpleadoIdiomaConstantesFunciones empleadoidiomaConstantesFunciones;
	//public EmpleadoIdiomaParameterReturnGeneral empleadoidiomaReturnGeneral;
	
	//FK
	
	public EmpresaLogic empresaLogic;
	public EmpleadoLogic empleadoLogic;
	public IdiomaLogic idiomaLogic;
	
	//PARAMETROS
	
	
	//public List<EmpleadoIdioma> empleadoidiomas;	
	//public List<EmpleadoIdioma> empleadoidiomasEliminados;
	//public List<EmpleadoIdioma> empleadoidiomasAux;
	
	public String sAccionMantenimiento="";
	public String sAccionBusqueda="";
	public String sAccionAdicional="";
	public String sUltimaBusqueda="";
	
	public Mensaje mensaje;
	
	
	public String sVisibilidadTablaBusquedas="";					
	public String sVisibilidadTablaElementos="";	
	public String sVisibilidadTablaAcciones="";			
	
	public Boolean isVisibilidadCeldaNuevoEmpleadoIdioma=false;
	public Boolean isVisibilidadCeldaDuplicarEmpleadoIdioma=true;
	public Boolean isVisibilidadCeldaCopiarEmpleadoIdioma=true;
	public Boolean isVisibilidadCeldaVerFormEmpleadoIdioma=true;
	public Boolean isVisibilidadCeldaOrdenEmpleadoIdioma=true;
	public Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=false;
	public Boolean isVisibilidadCeldaModificarEmpleadoIdioma=false;
	public Boolean isVisibilidadCeldaActualizarEmpleadoIdioma=false;
	public Boolean isVisibilidadCeldaEliminarEmpleadoIdioma=false;
	public Boolean isVisibilidadCeldaCancelarEmpleadoIdioma=false;
	public Boolean isVisibilidadCeldaGuardarEmpleadoIdioma=false;	
	public Boolean isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=false;	
	
	
	public Boolean isVisibilidadFK_IdEmpleado=false;
	public Boolean isVisibilidadFK_IdEmpresa=false;
	public Boolean isVisibilidadFK_IdIdioma=false;
	
	public Long getiIdNuevoEmpleadoIdioma() {
		return this.iIdNuevoEmpleadoIdioma;
	}

	public void setiIdNuevoEmpleadoIdioma(Long iIdNuevoEmpleadoIdioma) {
		this.iIdNuevoEmpleadoIdioma = iIdNuevoEmpleadoIdioma;
	}
	
	public Long getidEmpleadoIdiomaActual() {
		return this.idEmpleadoIdiomaActual;
	}

	public void setidEmpleadoIdiomaActual(Long idEmpleadoIdiomaActual) {
		this.idEmpleadoIdiomaActual = idEmpleadoIdiomaActual;
	}
	
	public int getrowIndexActual() {
		return this.rowIndexActual;
	}

	public void setrowIndexActual(int rowIndexActual) {
		this.rowIndexActual=rowIndexActual;
	}
	
	
	public EmpleadoIdioma getempleadoidioma() {
		return this.empleadoidioma;
	}

	public void setempleadoidioma(EmpleadoIdioma empleadoidioma) {
		this.empleadoidioma = empleadoidioma;
	}
	
	public EmpleadoIdioma getempleadoidiomaAux() {
		return this.empleadoidiomaAux;
	}

	public void setempleadoidiomaAux(EmpleadoIdioma empleadoidiomaAux) {
		this.empleadoidiomaAux = empleadoidiomaAux;
	}				
	
	public EmpleadoIdioma getempleadoidiomaAnterior() {
		return this.empleadoidiomaAnterior;
	}

	public void setempleadoidiomaAnterior(EmpleadoIdioma empleadoidiomaAnterior) {
		this.empleadoidiomaAnterior = empleadoidiomaAnterior;
	}	
	
	public EmpleadoIdioma getempleadoidiomaTotales() {
		return this.empleadoidiomaTotales;
	}

	public void setempleadoidiomaTotales(EmpleadoIdioma empleadoidiomaTotales) {
		this.empleadoidiomaTotales = empleadoidiomaTotales;
	}	
	
	public EmpleadoIdioma getempleadoidiomaBean() {
		return this.empleadoidiomaBean;
	}

	public void setempleadoidiomaBean(EmpleadoIdioma empleadoidiomaBean) {
		this.empleadoidiomaBean = empleadoidiomaBean;
	}	
	
	public EmpleadoIdiomaParameterReturnGeneral getempleadoidiomaReturnGeneral() {
		return this.empleadoidiomaReturnGeneral;
	}

	public void setempleadoidiomaReturnGeneral(EmpleadoIdiomaParameterReturnGeneral empleadoidiomaReturnGeneral) {
		this.empleadoidiomaReturnGeneral = empleadoidiomaReturnGeneral;
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

	public Long id_idiomaFK_IdIdioma=-1L;

	public Long getid_idiomaFK_IdIdioma() {
		return this.id_idiomaFK_IdIdioma;
	}

	public void setid_idiomaFK_IdIdioma(Long id_idiomaFK_IdIdioma) {
		this.id_idiomaFK_IdIdioma = id_idiomaFK_IdIdioma;
	}

		
	
	//ELEMENTOS TABLAS PARAMETOS
	
	
	
	
	
	
	//ELEMENTOS TABLAS PARAMETOS_FIN
	
	
	public EmpleadoIdiomaLogic getEmpleadoIdiomaLogic()	{		
		return empleadoidiomaLogic;
	}

	public void setEmpleadoIdiomaLogic(EmpleadoIdiomaLogic empleadoidiomaLogic) {
		this.empleadoidiomaLogic = empleadoidiomaLogic;
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
	
	public Boolean getIsEsNuevoEmpleadoIdioma() {
		return isEsNuevoEmpleadoIdioma;
	}

	public void setIsEsNuevoEmpleadoIdioma(Boolean isEsNuevoEmpleadoIdioma) {
		this.isEsNuevoEmpleadoIdioma = isEsNuevoEmpleadoIdioma;
	}

	public Boolean getEsParaAccionDesdeFormularioEmpleadoIdioma() {
		return esParaAccionDesdeFormularioEmpleadoIdioma;
	}
	
	public void setEsParaAccionDesdeFormularioEmpleadoIdioma(Boolean esParaAccionDesdeFormularioEmpleadoIdioma) {
		this.esParaAccionDesdeFormularioEmpleadoIdioma = esParaAccionDesdeFormularioEmpleadoIdioma;
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

			if(this.empleadoidiomaSessionBean==null) {
				this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
			}

			if(!this.empleadoidiomaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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
					empresaLogic.getEntityWithConnection(empleadoidiomaSessionBean.getlidEmpresaActual());
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

			if(this.empleadoidiomaSessionBean==null) {
				this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
			}

			if(!this.empleadoidiomaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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
					empleadoLogic.getEntityWithConnection(empleadoidiomaSessionBean.getlidEmpleadoActual());
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

	public void cargarCombosIdiomasForeignKeyLista(String sFinalQuery)throws Exception
	{
		try
		{
			this.idiomasForeignKey=new ArrayList<Idioma>();

			ArrayList<Classe> clases=new ArrayList<Classe>();
			ArrayList<String> arrClasses=new ArrayList<String>();
			Classe classe=new Classe();
			DatosDeep datosDeep=new DatosDeep(false,DeepLoadType.INCLUDE,clases,"");

			IdiomaLogic idiomaLogic=new IdiomaLogic();

			//idiomaLogic.getIdiomaDataAccess().setIsForForeingKeyData(true);

			if(this.empleadoidiomaSessionBean==null) {
				this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
			}

			if(!this.empleadoidiomaSessionBean.getisBusquedaDesdeForeignKeySesionIdioma()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//idiomaLogic.getIdiomaDataAccess().setIsForForeingKeyData(true);

					idiomaLogic.getTodosIdiomasWithConnection(sFinalQuery,new Pagination());

					this.idiomasForeignKey=idiomaLogic.getIdiomas();

				} else if(Constantes.ISUSAEJBREMOTE) {

				} else if(Constantes.ISUSAEJBHOME) {
				}


				//ARCHITECTURE
			} else {
				if(!this.conCargarMinimo) {
					this.setVisibilidadBusquedasParaIdioma(true);
				}
				//ARCHITECTURE

				if(Constantes.ISUSAEJBLOGICLAYER) {
					idiomaLogic.getEntityWithConnection(empleadoidiomaSessionBean.getlidIdiomaActual());
					this.idiomasForeignKey.add(idiomaLogic.getIdioma());
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

					if(this.empleadoidioma!=null) {
						this.empleadoidioma.setEmpresa(empresaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
						this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.setSelectedItem(empresaTemp);
					}
				} else {
					//jComboBoxid_empresaEmpleadoIdioma.setSelectedItem(empresaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.setSelectedIndex(0);
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
	public void setActualEmpresaForeignKeyGenerico(Long idEmpresaSeleccionado,JComboBox jComboBoxid_empresaEmpleadoIdiomaGenerico)throws Exception
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
				jComboBoxid_empresaEmpleadoIdiomaGenerico.setSelectedItem(empresaTemp);
			} else {
				if(jComboBoxid_empresaEmpleadoIdiomaGenerico!=null && jComboBoxid_empresaEmpleadoIdiomaGenerico.getItemCount()>0) {
					jComboBoxid_empresaEmpleadoIdiomaGenerico.setSelectedIndex(0);
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

					if(this.empleadoidioma!=null) {
						this.empleadoidioma.setEmpleado(empleadoTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
						this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.setSelectedItem(empleadoTemp);
					}
				} else {
					//jComboBoxid_empleadoEmpleadoIdioma.setSelectedItem(empleadoTemp);
					if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){
					if(empleadoTemp!=null && jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma!=null) {
						jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.setSelectedItem(empleadoTemp);
					} else {
						if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma!=null) {
							//jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.setSelectedItem(empleadoTemp);
							if(jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.getItemCount()>0) {
								jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.setSelectedIndex(0);
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
	public void setActualEmpleadoForeignKeyGenerico(Long idEmpleadoSeleccionado,JComboBox jComboBoxid_empleadoEmpleadoIdiomaGenerico)throws Exception
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
				jComboBoxid_empleadoEmpleadoIdiomaGenerico.setSelectedItem(empleadoTemp);
			} else {
				if(jComboBoxid_empleadoEmpleadoIdiomaGenerico!=null && jComboBoxid_empleadoEmpleadoIdiomaGenerico.getItemCount()>0) {
					jComboBoxid_empleadoEmpleadoIdiomaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	public void setActualIdiomaForeignKey(Long idIdiomaSeleccionado,Boolean conCombosBusquedas,String sFormularioTipoBusqueda)throws Exception
	{
		try
		{
			Idioma  idiomaTemp=null;

			for(Idioma idiomaAux:idiomasForeignKey) {
				if(idiomaAux.getId()!=null && idiomaAux.getId().equals(idIdiomaSeleccionado)) {
					idiomaTemp=idiomaAux;
					break;
				}
			}

			if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){
				if(idiomaTemp!=null) {

					if(this.empleadoidioma!=null) {
						this.empleadoidioma.setIdioma(idiomaTemp);
					}

					if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
						this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.setSelectedItem(idiomaTemp);
					}
				} else {
					//jComboBoxid_idiomaEmpleadoIdioma.setSelectedItem(idiomaTemp);
					if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
						if(this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.getItemCount()>0) {
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.setSelectedIndex(0);
						}
					}
				}
			}

			if(conCombosBusquedas) {

		//BYDAN_BUSQUEDAS
						
				if(sFormularioTipoBusqueda.equals("FK_IdIdioma") || sFormularioTipoBusqueda.equals("Todos")){
					if(idiomaTemp!=null && jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma!=null) {
						jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.setSelectedItem(idiomaTemp);
					} else {
						if(jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma!=null) {
							//jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.setSelectedItem(idiomaTemp);
							if(jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.getItemCount()>0) {
								jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.setSelectedIndex(0);
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

	public String getActualIdiomaForeignKeyDescripcion(Long idIdiomaSeleccionado)throws Exception
	{
		String sDescripcion="";

		try
		{
			Idioma  idiomaTemp=null;

			for(Idioma idiomaAux:idiomasForeignKey) {
				if(idiomaAux.getId()!=null && idiomaAux.getId().equals(idIdiomaSeleccionado)) {
					idiomaTemp=idiomaAux;
					break;
				}
			}


			sDescripcion=IdiomaConstantesFunciones.getIdiomaDescripcion(idiomaTemp);
		}
		catch(Exception e)
		{
			throw e;
		}

		return sDescripcion;
	}

	@SuppressWarnings("rawtypes")
	public void setActualIdiomaForeignKeyGenerico(Long idIdiomaSeleccionado,JComboBox jComboBoxid_idiomaEmpleadoIdiomaGenerico)throws Exception
	{
		try
		{
			Idioma  idiomaTemp=null;

			for(Idioma idiomaAux:idiomasForeignKey) {
				if(idiomaAux.getId()!=null && idiomaAux.getId().equals(idIdiomaSeleccionado)) {
					idiomaTemp=idiomaAux;
					break;
				}
			}

			if(idiomaTemp!=null) {
				jComboBoxid_idiomaEmpleadoIdiomaGenerico.setSelectedItem(idiomaTemp);
			} else {
				if(jComboBoxid_idiomaEmpleadoIdiomaGenerico!=null && jComboBoxid_idiomaEmpleadoIdiomaGenerico.getItemCount()>0) {
					jComboBoxid_idiomaEmpleadoIdiomaGenerico.setSelectedIndex(0);
				}
			}

		}
		catch(Exception e)
		{
			throw e;
		}

	}

	
	
	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpresaForeignKey(EmpleadoIdioma empleadoidioma,JComboBox jComboBoxid_empresaEmpleadoIdiomaGenerico)throws Exception
	{
		try
		{
			Empresa  empresaAux=new Empresa();

			if(jComboBoxid_empresaEmpleadoIdiomaGenerico==null) {
				empresaAux=(Empresa)this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.getSelectedItem();
			} else {
				empresaAux=(Empresa)jComboBoxid_empresaEmpleadoIdiomaGenerico.getSelectedItem();
			}

			if(empresaAux!=null && empresaAux.getId()!=null) {
				empleadoidioma.setid_empresa(empresaAux.getId());
				empleadoidioma.setempresa_descripcion(EmpleadoIdiomaConstantesFunciones.getEmpresaDescripcion(empresaAux));
				empleadoidioma.setEmpresa(empresaAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarEmpleadoForeignKey(EmpleadoIdioma empleadoidioma,JComboBox jComboBoxid_empleadoEmpleadoIdiomaGenerico)throws Exception
	{
		try
		{
			Empleado  empleadoAux=new Empleado();

			if(jComboBoxid_empleadoEmpleadoIdiomaGenerico==null) {
				empleadoAux=(Empleado)this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.getSelectedItem();
			} else {
				empleadoAux=(Empleado)jComboBoxid_empleadoEmpleadoIdiomaGenerico.getSelectedItem();
			}

			if(empleadoAux!=null && empleadoAux.getId()!=null) {
				empleadoidioma.setid_empleado(empleadoAux.getId());
				empleadoidioma.setempleado_descripcion(EmpleadoIdiomaConstantesFunciones.getEmpleadoDescripcion(empleadoAux));
				empleadoidioma.setEmpleado(empleadoAux);			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

	@SuppressWarnings("rawtypes")
	public void setActualParaGuardarIdiomaForeignKey(EmpleadoIdioma empleadoidioma,JComboBox jComboBoxid_idiomaEmpleadoIdiomaGenerico)throws Exception
	{
		try
		{
			Idioma  idiomaAux=new Idioma();

			if(jComboBoxid_idiomaEmpleadoIdiomaGenerico==null) {
				idiomaAux=(Idioma)this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.getSelectedItem();
			} else {
				idiomaAux=(Idioma)jComboBoxid_idiomaEmpleadoIdiomaGenerico.getSelectedItem();
			}

			if(idiomaAux!=null && idiomaAux.getId()!=null) {
				empleadoidioma.setid_idioma(idiomaAux.getId());
				empleadoidioma.setidioma_descripcion(EmpleadoIdiomaConstantesFunciones.getIdiomaDescripcion(idiomaAux));
				empleadoidioma.setIdioma(idiomaAux);			}
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

					if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { 
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.removeAllItems();

							for(Empresa empresa:this.empresasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.addItem(empresa);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { 
					}

					if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
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

					if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { 
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.addItem(empleado);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { 
					}

					if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdEmpleado") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.removeAllItems();

							for(Empleado empleado:this.empleadosForeignKey) {
								this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.addItem(empleado);
							}
						}

						if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
						}

						
					}

				}

			}  catch(Exception e) {
				throw e;
			}
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void cargarCombosFrameIdiomasForeignKey(String sFormularioTipoBusqueda)throws Exception {
			try {

				JComboBoxBinding jComboBoxBindingIdioma=null;

				if(sFormularioTipoBusqueda.equals("Formulario") || sFormularioTipoBusqueda.equals("Todos")){

					if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { 
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.removeAllItems();

							for(Idioma idioma:this.idiomasForeignKey) {
								this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.addItem(idioma);
							}
						}
					}

					if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { 
					}

					if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
					}
				}


				if(!this.conCargarMinimo) {

					if(sFormularioTipoBusqueda.equals("FK_IdIdioma") || sFormularioTipoBusqueda.equals("Todos")){

						//BYDAN_BUSQUEDAS
						
						if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
						} else {
							this.jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.removeAllItems();

							for(Idioma idioma:this.idiomasForeignKey) {
								this.jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.addItem(idioma);
							}
						}

						if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
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
						if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.setSelectedItem(empresa);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.setSelectedIndex(iIndexSelected);
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
						if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.setSelectedItem(empleado);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.setSelectedItem(empleado);
						} else {
							this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

		public void setSelectedItemCombosFrameIdiomaForeignKey(Idioma idioma,int iIndexSelected,Boolean conSelectedIndex,Boolean conFormulario,Boolean conBusqueda)throws Exception {
			try {

				if(conFormulario) {
					if(!conSelectedIndex) {
						if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.setSelectedItem(idioma);
						}
					} else {
						if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.setSelectedIndex(iIndexSelected);
						}
					}
				}


				if(!this.conCargarMinimo) {
					if(conBusqueda) {

					//BYDAN_BUSQUEDAS
					
						if(!conSelectedIndex) {
							this.jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.setSelectedItem(idioma);
						} else {
							this.jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.setSelectedIndex(iIndexSelected);
						}

										}
				}
			} catch(Exception e) {
				throw e;
			}
		}

	


	
	public void refrescarForeignKeysDescripcionesEmpleadoIdioma() throws Exception {
		//SI FUNCIONA DEEPLOAD ESTO VA AL ULTIMO
		if(Constantes.ISUSAEJBLOGICLAYER) {
			EmpleadoIdiomaConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoIdioma(this.empleadoidiomaLogic.getEmpleadoIdiomas());
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			EmpleadoIdiomaConstantesFunciones.refrescarForeignKeysDescripcionesEmpleadoIdioma(this.empleadoidiomas);
		}
		
		/*
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		classes.add(new Classe(Empresa.class));
		classes.add(new Classe(Empleado.class));
		classes.add(new Classe(Idioma.class));
			
		if(Constantes.ISUSAEJBLOGICLAYER) {
			//USA LOS OBJETOS DE LOGIC DIRECTAMENTE
			//empleadoidiomaLogic.setEmpleadoIdiomas(this.empleadoidiomas);
			empleadoidiomaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
	
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
		
	public EmpleadoIdiomaParameterReturnGeneral getEmpleadoIdiomaParameterGeneral() {
		return this.empleadoidiomaParameterGeneral;
	}
	
	public void setEmpleadoIdiomaParameterGeneral(EmpleadoIdiomaParameterReturnGeneral empleadoidiomaParameterGeneral) {
		this.empleadoidiomaParameterGeneral = empleadoidiomaParameterGeneral;
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
	
	public Boolean getIsPermisoTodoEmpleadoIdioma() {
		return isPermisoTodoEmpleadoIdioma;
	}

	public void setIsPermisoTodoEmpleadoIdioma(Boolean isPermisoTodoEmpleadoIdioma) {
		this.isPermisoTodoEmpleadoIdioma = isPermisoTodoEmpleadoIdioma;
	}

	public Boolean getIsPermisoNuevoEmpleadoIdioma() {
		return isPermisoNuevoEmpleadoIdioma;
	}

	public void setIsPermisoNuevoEmpleadoIdioma(Boolean isPermisoNuevoEmpleadoIdioma) {
		this.isPermisoNuevoEmpleadoIdioma = isPermisoNuevoEmpleadoIdioma;
	}

	public Boolean getIsPermisoActualizarEmpleadoIdioma() {
		return isPermisoActualizarEmpleadoIdioma;
	}

	public void setIsPermisoActualizarEmpleadoIdioma(Boolean isPermisoActualizarEmpleadoIdioma) {
		this.isPermisoActualizarEmpleadoIdioma = isPermisoActualizarEmpleadoIdioma;
	}

	public Boolean getIsPermisoEliminarEmpleadoIdioma() {
		return isPermisoEliminarEmpleadoIdioma;
	}

	public void setIsPermisoEliminarEmpleadoIdioma(Boolean isPermisoEliminarEmpleadoIdioma) {
		this.isPermisoEliminarEmpleadoIdioma = isPermisoEliminarEmpleadoIdioma;
	}

	public Boolean getIsPermisoGuardarCambiosEmpleadoIdioma() {
		return isPermisoGuardarCambiosEmpleadoIdioma;
	}

	public void setIsPermisoGuardarCambiosEmpleadoIdioma(Boolean isPermisoGuardarCambiosEmpleadoIdioma) {
		this.isPermisoGuardarCambiosEmpleadoIdioma = isPermisoGuardarCambiosEmpleadoIdioma;
	}
	
	public Boolean getIsPermisoConsultaEmpleadoIdioma() {
		return isPermisoConsultaEmpleadoIdioma;
	}

	public void setIsPermisoConsultaEmpleadoIdioma(Boolean isPermisoConsultaEmpleadoIdioma) {
		this.isPermisoConsultaEmpleadoIdioma = isPermisoConsultaEmpleadoIdioma;
	}

	public Boolean getIsPermisoBusquedaEmpleadoIdioma() {
		return isPermisoBusquedaEmpleadoIdioma;
	}

	public void setIsPermisoBusquedaEmpleadoIdioma(Boolean isPermisoBusquedaEmpleadoIdioma) {
		this.isPermisoBusquedaEmpleadoIdioma = isPermisoBusquedaEmpleadoIdioma;
	}

	public Boolean getIsPermisoReporteEmpleadoIdioma() {
		return isPermisoReporteEmpleadoIdioma;
	}

	public void setIsPermisoReporteEmpleadoIdioma(Boolean isPermisoReporteEmpleadoIdioma) {
		this.isPermisoReporteEmpleadoIdioma = isPermisoReporteEmpleadoIdioma;
	}
	
	public Boolean getIsPermisoPaginacionMedioEmpleadoIdioma() {
		return isPermisoPaginacionMedioEmpleadoIdioma;
	}

	public void setIsPermisoPaginacionMedioEmpleadoIdioma(Boolean isPermisoPaginacionMedioEmpleadoIdioma) {
		this.isPermisoPaginacionMedioEmpleadoIdioma = isPermisoPaginacionMedioEmpleadoIdioma;
	}
	
	public Boolean getIsPermisoPaginacionTodoEmpleadoIdioma() {
		return isPermisoPaginacionTodoEmpleadoIdioma;
	}

	public void setIsPermisoPaginacionTodoEmpleadoIdioma(Boolean isPermisoPaginacionTodoEmpleadoIdioma) {
		this.isPermisoPaginacionTodoEmpleadoIdioma = isPermisoPaginacionTodoEmpleadoIdioma;
	}
	
	public Boolean getIsPermisoPaginacionAltoEmpleadoIdioma() {
		return isPermisoPaginacionAltoEmpleadoIdioma;
	}

	public void setIsPermisoPaginacionAltoEmpleadoIdioma(Boolean isPermisoPaginacionAltoEmpleadoIdioma) {
		this.isPermisoPaginacionAltoEmpleadoIdioma = isPermisoPaginacionAltoEmpleadoIdioma;
	}
	
	public Boolean getIsPermisoCopiarEmpleadoIdioma() {
		return isPermisoCopiarEmpleadoIdioma;
	}

	public void setIsPermisoCopiarEmpleadoIdioma(Boolean isPermisoCopiarEmpleadoIdioma) {
		this.isPermisoCopiarEmpleadoIdioma = isPermisoCopiarEmpleadoIdioma;
	}
	
	public Boolean getIsPermisoVerFormEmpleadoIdioma() {
		return isPermisoVerFormEmpleadoIdioma;
	}

	public void setIsPermisoVerFormEmpleadoIdioma(Boolean isPermisoVerFormEmpleadoIdioma) {
		this.isPermisoVerFormEmpleadoIdioma = isPermisoVerFormEmpleadoIdioma;
	}
	
	public Boolean getIsPermisoDuplicarEmpleadoIdioma() {
		return isPermisoDuplicarEmpleadoIdioma;
	}

	public void setIsPermisoDuplicarEmpleadoIdioma(Boolean isPermisoDuplicarEmpleadoIdioma) {
		this.isPermisoDuplicarEmpleadoIdioma = isPermisoDuplicarEmpleadoIdioma;
	}
	
	public Boolean getIsPermisoOrdenEmpleadoIdioma() {
		return isPermisoOrdenEmpleadoIdioma;
	}

	public void setIsPermisoOrdenEmpleadoIdioma(Boolean isPermisoOrdenEmpleadoIdioma) {
		this.isPermisoOrdenEmpleadoIdioma = isPermisoOrdenEmpleadoIdioma;
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
	
	public Boolean getIsVisibilidadCeldaNuevoEmpleadoIdioma() {
		return isVisibilidadCeldaNuevoEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaNuevoEmpleadoIdioma(Boolean isVisibilidadCeldaNuevoEmpleadoIdioma) {
		this.isVisibilidadCeldaNuevoEmpleadoIdioma = isVisibilidadCeldaNuevoEmpleadoIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaDuplicarEmpleadoIdioma() {
		return isVisibilidadCeldaDuplicarEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaDuplicarEmpleadoIdioma(Boolean isVisibilidadCeldaDuplicarEmpleadoIdioma) {
		this.isVisibilidadCeldaDuplicarEmpleadoIdioma = isVisibilidadCeldaDuplicarEmpleadoIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaCopiarEmpleadoIdioma() {
		return isVisibilidadCeldaCopiarEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaCopiarEmpleadoIdioma(Boolean isVisibilidadCeldaCopiarEmpleadoIdioma) {
		this.isVisibilidadCeldaCopiarEmpleadoIdioma = isVisibilidadCeldaCopiarEmpleadoIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaVerFormEmpleadoIdioma() {
		return isVisibilidadCeldaVerFormEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaVerFormEmpleadoIdioma(Boolean isVisibilidadCeldaVerFormEmpleadoIdioma) {
		this.isVisibilidadCeldaVerFormEmpleadoIdioma = isVisibilidadCeldaVerFormEmpleadoIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaOrdenEmpleadoIdioma() {
		return isVisibilidadCeldaOrdenEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaOrdenEmpleadoIdioma(Boolean isVisibilidadCeldaOrdenEmpleadoIdioma) {
		this.isVisibilidadCeldaOrdenEmpleadoIdioma = isVisibilidadCeldaOrdenEmpleadoIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaNuevoRelacionesEmpleadoIdioma() {
		return isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaNuevoRelacionesEmpleadoIdioma(Boolean isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma) {
		this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma = isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaModificarEmpleadoIdioma() {
		return isVisibilidadCeldaModificarEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaModificarEmpleadoIdioma(Boolean isVisibilidadCeldaModificarEmpleadoIdioma) {
		this.isVisibilidadCeldaModificarEmpleadoIdioma = isVisibilidadCeldaModificarEmpleadoIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaActualizarEmpleadoIdioma() {
		return isVisibilidadCeldaActualizarEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaActualizarEmpleadoIdioma(Boolean isVisibilidadCeldaActualizarEmpleadoIdioma) {
		this.isVisibilidadCeldaActualizarEmpleadoIdioma = isVisibilidadCeldaActualizarEmpleadoIdioma;
	}

	public Boolean getIsVisibilidadCeldaEliminarEmpleadoIdioma() {
		return isVisibilidadCeldaEliminarEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaEliminarEmpleadoIdioma(Boolean isVisibilidadCeldaEliminarEmpleadoIdioma) {
		this.isVisibilidadCeldaEliminarEmpleadoIdioma = isVisibilidadCeldaEliminarEmpleadoIdioma;
	}

	public Boolean getIsVisibilidadCeldaCancelarEmpleadoIdioma() {
		return isVisibilidadCeldaCancelarEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaCancelarEmpleadoIdioma(Boolean isVisibilidadCeldaCancelarEmpleadoIdioma) {
		this.isVisibilidadCeldaCancelarEmpleadoIdioma = isVisibilidadCeldaCancelarEmpleadoIdioma;
	}

	public Boolean getIsVisibilidadCeldaGuardarEmpleadoIdioma() {
		return isVisibilidadCeldaGuardarEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaGuardarEmpleadoIdioma(Boolean isVisibilidadCeldaGuardarEmpleadoIdioma) {
		this.isVisibilidadCeldaGuardarEmpleadoIdioma = isVisibilidadCeldaGuardarEmpleadoIdioma;
	}
	
	public Boolean getIsVisibilidadCeldaGuardarCambiosEmpleadoIdioma() {
		return isVisibilidadCeldaGuardarCambiosEmpleadoIdioma;
	}

	public void setIsVisibilidadCeldaGuardarCambiosEmpleadoIdioma(Boolean isVisibilidadCeldaGuardarCambiosEmpleadoIdioma) {
		this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma = isVisibilidadCeldaGuardarCambiosEmpleadoIdioma;
	}
		
	public EmpleadoIdiomaSessionBean getempleadoidiomaSessionBean() {
		return this.empleadoidiomaSessionBean;
	}
	
	public void setempleadoidiomaSessionBean(EmpleadoIdiomaSessionBean empleadoidiomaSessionBean) {
		this.empleadoidiomaSessionBean=empleadoidiomaSessionBean;
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

	public Boolean getisVisibilidadFK_IdIdioma() {
		return this.isVisibilidadFK_IdIdioma;
	}

	public void setisVisibilidadFK_IdIdioma(Boolean isVisibilidadFK_IdIdioma) {
		this.isVisibilidadFK_IdIdioma=isVisibilidadFK_IdIdioma;
	}

	
	
	public void setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(EmpleadoIdioma empleadoidioma)throws Exception {
		try {
			
				this.setActualParaGuardarEmpresaForeignKey(empleadoidioma,null);
				this.setActualParaGuardarEmpleadoForeignKey(empleadoidioma,null);
				this.setActualParaGuardarIdiomaForeignKey(empleadoidioma,null);
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
	
	public void bugActualizarReferenciaActual(EmpleadoIdioma empleadoidioma,EmpleadoIdioma empleadoidiomaAux) throws Exception {
		//ARCHITECTURE		
		//EL ID NEGATIVO GUARDADO EN ORIGINAL SIRVE PARA VERIFICAR Y ACTUALIZAR EL REGISTRO NUEVO (ID,VERSIONROW)
		this.setCamposBaseDesdeOriginalEmpleadoIdioma(empleadoidioma);
					
		//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
		empleadoidiomaAux.setId(empleadoidioma.getId());
		empleadoidiomaAux.setVersionRow(empleadoidioma.getVersionRow());					
	}
	
	public void ejecutarMantenimiento(MaintenanceType maintenanceType)throws Exception {	
		try	{								
			
			//this.startProcessEmpleadoIdioma();
		
			int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();	       
			
			//PUEDE SER -1 CUANDO SE ELIMINA EN GUARDAR CAMBIOS
			if(intSelectedRow>=0 && maintenanceType!=MaintenanceType.GUARDARCAMBIOS) {
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
					
				//ARCHITECTURE
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				
				//ARCHITECTURE
				
				if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					//this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
				}
				
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
			}
			
			//LUEGO DE TRAER DATOS CORRESPONDIENTES QUE COINCIDA LISTA TABLA QUITO FILA TOTALES
			if(this.conTotales) {
				//MEJOR LO DEJO, SI EXISTE EXCEPCION SE PIEDE FILA TOTALES Y ORDEN INDICE FILA ACTUAL
				//this.quitarFilaTotales();
			}
			
			this.cargarDatosCliente();
			
			this.datosDeep=new DatosDeep();
			
			//SE CAMBIA ESTADOS CON ERROR, ENTONCES SE EJECUTA ANTES
			//this.invalidValues = empleadoidiomaValidator.getInvalidValues(this.empleadoidioma);
			
			//if(this.invalidValues==null || this.invalidValues.length<=0) {
			
			empleadoidiomaLogic.setDatosCliente(datosCliente);
			empleadoidiomaLogic.setIsConDeep(false);
			
			if(maintenanceType==MaintenanceType.NUEVO) {
				empleadoidiomaAux=new  EmpleadoIdioma();
				
				empleadoidiomaAux.setIsNew(true);
				empleadoidiomaAux.setIsChanged(true);
				
				empleadoidiomaAux.setEmpleadoIdiomaOriginal(this.empleadoidioma);
				
				empleadoidiomaAux.setId(this.empleadoidioma.getId());	
				empleadoidiomaAux.setVersionRow(this.empleadoidioma.getVersionRow());	
				empleadoidiomaAux.setid_empresa(this.empleadoidioma.getid_empresa());	
				empleadoidiomaAux.setid_empleado(this.empleadoidioma.getid_empleado());	
				empleadoidiomaAux.setid_idioma(this.empleadoidioma.getid_idioma());	
				empleadoidiomaAux.setes_materna(this.empleadoidioma.getes_materna());	
				empleadoidiomaAux.setes_tecnico(this.empleadoidioma.getes_tecnico());	
				empleadoidiomaAux.setporcen_tecnico(this.empleadoidioma.getporcen_tecnico());	
				empleadoidiomaAux.setes_lectura(this.empleadoidioma.getes_lectura());	
				empleadoidiomaAux.setporcen_lectura(this.empleadoidioma.getporcen_lectura());	
				empleadoidiomaAux.setes_escrito(this.empleadoidioma.getes_escrito());	
				empleadoidiomaAux.setporcen_escrito(this.empleadoidioma.getporcen_escrito());	
				empleadoidiomaAux.setes_hablado(this.empleadoidioma.getes_hablado());	
				empleadoidiomaAux.setporcen_hablado(this.empleadoidioma.getporcen_hablado());	
				empleadoidiomaAux.setdescripcion(this.empleadoidioma.getdescripcion());	
								
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoidiomaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(empleadoidiomaAux,empleadoidiomaLogic.getEmpleadoIdiomas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoidiomaAux,empleadoidiomas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote  && !this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoidiomaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomaLogic.saveEmpleadoIdiomas();//WithConnection
						//empleadoidiomaLogic.getSetVersionRowEmpleadoIdiomas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE		
					
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoidioma,empleadoidiomaAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoIdioma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE	
						
						if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
												
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoidiomaLogic.saveEmpleadoIdiomaRelaciones(empleadoidiomaAux);//WithConnection
								//empleadoidiomaLogic.getSetVersionRowEmpleadoIdiomas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoidioma,empleadoidiomaAux);
					
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE	
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoidiomaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoidiomaAux,empleadoidiomaLogic.getEmpleadoIdiomas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoidiomaAux,empleadoidiomas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoidioma,empleadoidiomaAux);												
						}
					}
				}
			} else if(maintenanceType==MaintenanceType.ACTUALIZAR) {
				empleadoidiomaAux=new  EmpleadoIdioma();
				
				//PUEDE QUE SE ACTUALIZE ALGUN REGISTRO NUEVO
				if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado() 
					|| (this.empleadoidiomaSessionBean.getEsGuardarRelacionado() && this.empleadoidioma.getId()>=0)) {
						
					empleadoidiomaAux.setIsNew(false);
				}
				
				empleadoidiomaAux.setIsDeleted(false);
			
				empleadoidiomaAux.setId(this.empleadoidioma.getId());	
				empleadoidiomaAux.setVersionRow(this.empleadoidioma.getVersionRow());	
				empleadoidiomaAux.setid_empresa(this.empleadoidioma.getid_empresa());	
				empleadoidiomaAux.setid_empleado(this.empleadoidioma.getid_empleado());	
				empleadoidiomaAux.setid_idioma(this.empleadoidioma.getid_idioma());	
				empleadoidiomaAux.setes_materna(this.empleadoidioma.getes_materna());	
				empleadoidiomaAux.setes_tecnico(this.empleadoidioma.getes_tecnico());	
				empleadoidiomaAux.setporcen_tecnico(this.empleadoidioma.getporcen_tecnico());	
				empleadoidiomaAux.setes_lectura(this.empleadoidioma.getes_lectura());	
				empleadoidiomaAux.setporcen_lectura(this.empleadoidioma.getporcen_lectura());	
				empleadoidiomaAux.setes_escrito(this.empleadoidioma.getes_escrito());	
				empleadoidiomaAux.setporcen_escrito(this.empleadoidioma.getporcen_escrito());	
				empleadoidiomaAux.setes_hablado(this.empleadoidioma.getes_hablado());	
				empleadoidiomaAux.setporcen_hablado(this.empleadoidioma.getporcen_hablado());	
				empleadoidiomaAux.setdescripcion(this.empleadoidioma.getdescripcion());	
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoidiomaAux,empleadoidiomaLogic.getEmpleadoIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoidiomaAux,empleadoidiomas);
				}
				//ARCHITECTURE
				
				if(!isGuardarCambiosEnLote && !this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoidiomaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomaLogic.saveEmpleadoIdiomas();//WithConnection
						//empleadoidiomaLogic.getSetVersionRowEmpleadoIdiomas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
					
					//TALVEZ ESTA DEMAS POR SER UPDATE
					//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
					this.bugActualizarReferenciaActual(this.empleadoidioma,empleadoidiomaAux);
					
					this.refrescarForeignKeysDescripcionesEmpleadoIdioma();
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoidiomaLogic.saveEmpleadoIdiomaRelaciones(empleadoidiomaAux);//WithConnection
								//empleadoidiomaLogic.getSetVersionRowEmpleadoIdiomas();//WithConnection
							} else if(Constantes.ISUSAEJBREMOTE) {
							} else if(Constantes.ISUSAEJBHOME) {
							}
							//ARCHITECTURE
							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							this.bugActualizarReferenciaActual(this.empleadoidioma,empleadoidiomaAux);
					
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
						} else {
							
							
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								if(this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones() 
									|| this.empleadoidiomaSessionBean.getEsGuardarRelacionado())	{
									actualizarLista(empleadoidiomaAux,empleadoidiomaLogic.getEmpleadoIdiomas());
								}
							} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
								actualizarLista(empleadoidiomaAux,empleadoidiomas);
							}
							//ARCHITECTURE
							
							//AQUI EL ID NEGATIVO ES EL ID BUSCADO, YA QUE NO SE GENERA OTRO EN LA DB POR INGRESAR UNO NUEVO							
							//TALVEZ ESTA DEMAS POR SER UPDATE
							//POR BUG: EL OBJETO ACTUAL SE PERDIA, POR LO QUE SE GUARDA TAMBIEN VALORES EN AUX Y LUEGO DESPUES DEL MENSAJE SE HACE REFERENCIA EL OBJETO ACTUAL AL AUX
							//this.bugActualizarReferenciaActual(this.empleadoidioma,empleadoidiomaAux);
					
						}
					}
				}				
			} else if(maintenanceType==MaintenanceType.ELIMINAR) {
				empleadoidiomaAux=new  EmpleadoIdioma();
				
				empleadoidiomaAux.setIsNew(false);
				empleadoidiomaAux.setIsChanged(false);
				
				empleadoidiomaAux.setIsDeleted(true);
				
				empleadoidiomaAux.setId(this.empleadoidioma.getId());	
				empleadoidiomaAux.setVersionRow(this.empleadoidioma.getVersionRow());	
				empleadoidiomaAux.setid_empresa(this.empleadoidioma.getid_empresa());	
				empleadoidiomaAux.setid_empleado(this.empleadoidioma.getid_empleado());	
				empleadoidiomaAux.setid_idioma(this.empleadoidioma.getid_idioma());	
				empleadoidiomaAux.setes_materna(this.empleadoidioma.getes_materna());	
				empleadoidiomaAux.setes_tecnico(this.empleadoidioma.getes_tecnico());	
				empleadoidiomaAux.setporcen_tecnico(this.empleadoidioma.getporcen_tecnico());	
				empleadoidiomaAux.setes_lectura(this.empleadoidioma.getes_lectura());	
				empleadoidiomaAux.setporcen_lectura(this.empleadoidioma.getporcen_lectura());	
				empleadoidiomaAux.setes_escrito(this.empleadoidioma.getes_escrito());	
				empleadoidiomaAux.setporcen_escrito(this.empleadoidioma.getporcen_escrito());	
				empleadoidiomaAux.setes_hablado(this.empleadoidioma.getes_hablado());	
				empleadoidiomaAux.setporcen_hablado(this.empleadoidioma.getporcen_hablado());	
				empleadoidiomaAux.setdescripcion(this.empleadoidioma.getdescripcion());	
				
				if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
					//ELEMENTO ACTUAL NO SE HA INGRESADO AL SISTEMA, NO SE PUEDE ELIMINAR ALGO QUE NO EXISTE
					if(this.empleadoidiomaAux.getId()>=0) {	
						this.empleadoidiomasEliminados.add(empleadoidiomaAux);											
					}
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					actualizarLista(empleadoidiomaAux,empleadoidiomaLogic.getEmpleadoIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoidiomaAux,empleadoidiomas);
				}
				//ARCHITECTURE
				
				
				if(!isGuardarCambiosEnLote && !this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones() 
						&& !this.empleadoidiomaSessionBean.getEsGuardarRelacionado())	{
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomaLogic.saveEmpleadoIdiomas();//WithConnection
						//empleadoidiomaLogic.getSetVersionRowEmpleadoIdiomas();//WithConnection
					} else if(Constantes.ISUSAEJBREMOTE) {
					} else if(Constantes.ISUSAEJBHOME) {
					}	
					//ARCHITECTURE
				} else {
					//CUANDO ES MANTENIMIENTO MAESTRO DETALLE
					if(this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones()) {
						//GUARDAR RELACIONES
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							
						} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
							
						}
						//ARCHITECTURE
						
						
						if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
							//QUITAR FILA TOTAL
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
							
							} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
								
							}
							//ARCHITECTURE
							
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								empleadoidiomaLogic.saveEmpleadoIdiomaRelaciones(empleadoidiomaAux);//WithConnection
								//empleadoidiomaLogic.getSetVersionRowEmpleadoIdiomas();//WithConnection
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
							if(this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones() 
								|| this.empleadoidiomaSessionBean.getEsGuardarRelacionado())	{
								actualizarLista(empleadoidiomaAux,empleadoidiomaLogic.getEmpleadoIdiomas());
							}
						} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
							actualizarLista(empleadoidiomaAux,empleadoidiomas);
						}
						//ARCHITECTURE
					}
				}				
			} else if(maintenanceType==MaintenanceType.GUARDARCAMBIOS) {		
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getEmpleadoIdiomas().addAll(this.empleadoidiomasEliminados);
					
					empleadoidiomaLogic.saveEmpleadoIdiomas();//WithConnection
					//empleadoidiomaLogic.getSetVersionRowEmpleadoIdiomas();//WithConnection
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}	
				//ARCHITECTURE
				this.refrescarForeignKeysDescripcionesEmpleadoIdioma();
				
				this.empleadoidiomasEliminados= new ArrayList<EmpleadoIdioma>();		
			}
			
			if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
				 this.crearFilaTotales();
			}
			
			
									
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				if(!this.isPostAccionSinMensaje) {
					JOptionPane.showMessageDialog(this,"Empleado Idioma GUARDADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Idioma",JOptionPane.INFORMATION_MESSAGE);
					if(maintenanceType==MaintenanceType.NUEVO || maintenanceType==MaintenanceType.ACTUALIZAR) {
						//CUANDO ES NUEVO SE PIERDE REFERENCIA NO SE PORQUE
						this.empleadoidioma=empleadoidiomaAux;
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
      		//this.finishProcessEmpleadoIdioma();
      	}
		
	}	
	
	public void actualizarRelaciones(EmpleadoIdioma empleadoidiomaLocal) throws Exception {
		
		if(this.empleadoidiomaSessionBean.getConGuardarRelaciones()) {			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
			
			
			} else {
				
			}
		}
	}
	
	public void actualizarRelacionFkPadreActual(EmpleadoIdioma empleadoidiomaLocal) throws Exception {	
		if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {			
			
		
			if(this.jInternalFrameParent.getClass().equals(EmpresaDetalleFormJInternalFrame.class)) {
				EmpresaBeanSwingJInternalFrame empresaBeanSwingJInternalFrameLocal=(EmpresaBeanSwingJInternalFrame) ((EmpresaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empresaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpresa(empresaBeanSwingJInternalFrameLocal.getempresa(),true);
				empresaBeanSwingJInternalFrameLocal.actualizarLista(empresaBeanSwingJInternalFrameLocal.empresa,this.empresasForeignKey);

				empresaBeanSwingJInternalFrameLocal.actualizarRelaciones(empresaBeanSwingJInternalFrameLocal.empresa);

				empleadoidiomaLocal.setEmpresa(empresaBeanSwingJInternalFrameLocal.empresa);

				this.addItemDefectoCombosForeignKeyEmpresa();
				this.cargarCombosFrameEmpresasForeignKey("Formulario");
				this.setActualEmpresaForeignKey(empresaBeanSwingJInternalFrameLocal.empresa.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(EmpleadoDetalleFormJInternalFrame.class)) {
				EmpleadoBeanSwingJInternalFrame empleadoBeanSwingJInternalFrameLocal=(EmpleadoBeanSwingJInternalFrame) ((EmpleadoDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				empleadoBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoEmpleado(empleadoBeanSwingJInternalFrameLocal.getempleado(),true);
				empleadoBeanSwingJInternalFrameLocal.actualizarLista(empleadoBeanSwingJInternalFrameLocal.empleado,this.empleadosForeignKey);

				empleadoBeanSwingJInternalFrameLocal.actualizarRelaciones(empleadoBeanSwingJInternalFrameLocal.empleado);

				empleadoidiomaLocal.setEmpleado(empleadoBeanSwingJInternalFrameLocal.empleado);

				this.addItemDefectoCombosForeignKeyEmpleado();
				this.cargarCombosFrameEmpleadosForeignKey("Formulario");
				this.setActualEmpleadoForeignKey(empleadoBeanSwingJInternalFrameLocal.empleado.getId(),false,"Formulario");
			}
			 else if(this.jInternalFrameParent.getClass().equals(IdiomaDetalleFormJInternalFrame.class)) {
				IdiomaBeanSwingJInternalFrame idiomaBeanSwingJInternalFrameLocal=(IdiomaBeanSwingJInternalFrame) ((IdiomaDetalleFormJInternalFrame) this.jInternalFrameParent).jInternalFrameParent;

				idiomaBeanSwingJInternalFrameLocal.setVariablesFormularioToObjetoActualTodoIdioma(idiomaBeanSwingJInternalFrameLocal.getidioma(),true);
				idiomaBeanSwingJInternalFrameLocal.actualizarLista(idiomaBeanSwingJInternalFrameLocal.idioma,this.idiomasForeignKey);

				idiomaBeanSwingJInternalFrameLocal.actualizarRelaciones(idiomaBeanSwingJInternalFrameLocal.idioma);

				empleadoidiomaLocal.setIdioma(idiomaBeanSwingJInternalFrameLocal.idioma);

				this.addItemDefectoCombosForeignKeyIdioma();
				this.cargarCombosFrameIdiomasForeignKey("Formulario");
				this.setActualIdiomaForeignKey(idiomaBeanSwingJInternalFrameLocal.idioma.getId(),false,"Formulario");
			}
		
		}
	}
	
	public Boolean validarEmpleadoIdiomaActual() throws Exception {
		Boolean estaValidado=false;
		this.inicializarInvalidValues();
		
		/*
		int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE ||Constantes.ISUSAEJBHOME) {
			this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
		}
		//ARCHITECTURE
		*/
		
		this.invalidValues = empleadoidiomaValidator.getInvalidValues(this.empleadoidioma);
					
		if(this.invalidValues==null || this.invalidValues.length<=0) {
			estaValidado=true;
		} else {
			this.mostrarInvalidValues();	
		}
		
		return estaValidado;
	}
	
	public void actualizarLista(EmpleadoIdioma empleadoidioma,List<EmpleadoIdioma> empleadoidiomas) throws Exception {
		try	{		
			EmpleadoIdiomaConstantesFunciones.actualizarLista(empleadoidioma,empleadoidiomas,this.empleadoidiomaSessionBean.getEsGuardarRelacionado());		
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void actualizarSelectedLista(EmpleadoIdioma empleadoidioma,List<EmpleadoIdioma> empleadoidiomas) throws Exception {
		try	{			
			EmpleadoIdiomaConstantesFunciones.actualizarSelectedLista(empleadoidioma,empleadoidiomas);
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public Boolean tieneElementosSeleccionados() throws Exception {
		Boolean tiene=false;
		
		List<EmpleadoIdioma> empleadoidiomasLocal=null;
		
		try	{			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				empleadoidiomasLocal=this.empleadoidiomaLogic.getEmpleadoIdiomas();
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				empleadoidiomasLocal=this.empleadoidiomas;
			}
			//ARCHITECTURE
		
			for(EmpleadoIdioma empleadoidiomaLocal:empleadoidiomasLocal) {
				if(this.permiteMantenimiento(empleadoidiomaLocal) && empleadoidiomaLocal.getIsSelected()) {
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
			sMensaje+="\r\n"+EmpleadoIdiomaConstantesFunciones.getEmpleadoIdiomaLabelDesdeNombre(invalidValue.getPropertyName())+"->"+invalidValue.getMessage();
			
			//MOSTRAR CAMPOS INVALIDOS
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.IDEMPRESA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelid_empresaEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.IDEMPLEADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelid_empleadoEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.IDIDIOMA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelid_idiomaEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.ESMATERNA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_maternaEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.ESTECNICO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_tecnicoEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.PORCENTECNICO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_tecnicoEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.ESLECTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_lecturaEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.PORCENLECTURA)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_lecturaEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.ESESCRITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_escritoEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.PORCENESCRITO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_escritoEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.ESHABLADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_habladoEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.PORCENHABLADO)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_habladoEmpleadoIdioma,invalidValue.getMessage());}
			if(invalidValue.getPropertyName().equals(EmpleadoIdiomaConstantesFunciones.DESCRIPCION)) {FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeldescripcionEmpleadoIdioma,invalidValue.getMessage());}
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
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
		
		//MOSTRAR CAMPOS INVALIDOS
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelid_empresaEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelid_empleadoEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelid_idiomaEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_maternaEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_tecnicoEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_tecnicoEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_lecturaEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_lecturaEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_escritoEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_escritoEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_habladoEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_habladoEmpleadoIdioma,"");
		FuncionesSwing.mostrarCampoMensajeInvalido(true,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeldescripcionEmpleadoIdioma,"");
		
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
		this.iIdNuevoEmpleadoIdioma--;	
		
		
		this.empleadoidiomaAux=new EmpleadoIdioma();
		
		this.empleadoidiomaAux.setId(this.iIdNuevoEmpleadoIdioma);
		this.empleadoidiomaAux.setIsChanged(true);
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.empleadoidiomaLogic.getEmpleadoIdiomas().add(this.empleadoidiomaAux);
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.empleadoidiomas.add(this.empleadoidiomaAux);
		}
		//ARCHITECTURE
		
		this.empleadoidioma=this.empleadoidiomaAux;
		
		if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			this.setVariablesObjetoActualToFormularioEmpleadoIdioma(this.empleadoidioma);
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoIdioma(this.empleadoidioma);
		}
				
		//this.setDefaultControlesEmpleadoIdioma();
		
		this.inicializarInvalidValues();
				
		//SELECCIONA ITEM DEFECTO-->SET O SELECTED INDEX
		this.setItemDefectoCombosForeignKeyEmpleadoIdioma();
		
		
		//INICIALIZA VARIABLES COMBOS GLOBALES A FORMULARIO(ParametroGeneralUsuario)
		this.setVariablesGlobalesCombosForeignKeyEmpleadoIdioma();
		
		//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
		//this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoIdioma();
		
		//SI TIENE FOREIGN KEY CON CAMPO esDefecto=true, SE ACTUALIZA A OBJETO ACTUAL
		this.setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoIdioma(this.empleadoidiomaBean,this.empleadoidioma,false,false);
		
		//ACTUALIZA VALORES PARA EL OBJETO ACTUAL ANTES DE ENVIARLO A ACTUALIZAR
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				
		ArrayList<Classe> classes=new ArrayList<Classe>();
		
		if(this.jInternalFrameParent!=null) {
			this.jInternalFrameParent.actualizarObjetoPadreFk(EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}	
		
		
		if(this.empleadoidiomaSessionBean.getConGuardarRelaciones()) {
			classes=EmpleadoIdiomaConstantesFunciones.getClassesRelationshipsOfEmpleadoIdioma(new ArrayList<Classe>(),DeepLoadType.NONE);
		}
		
		this.classesActual=new ArrayList<Classe>();
		this.classesActual.addAll(classes);
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {						
			this.empleadoidiomaReturnGeneral=empleadoidiomaLogic.procesarEventosEmpleadoIdiomasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,EventoGlobalTipo.FORM_RECARGAR,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoidiomaLogic.getEmpleadoIdiomas(),this.empleadoidioma,this.empleadoidiomaParameterGeneral,this.isEsNuevoEmpleadoIdioma,classes);//this.empleadoidiomaLogic.getEmpleadoIdioma()
						
		} else if(Constantes.ISUSAEJBREMOTE) {
						
		} else if(Constantes.ISUSAEJBHOME) {
		}
		//ARCHITECTURE
		
		//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
		//this.setVariablesObjetoReturnGeneralToBeanEmpleadoIdioma(this.empleadoidiomaReturnGeneral,this.empleadoidiomaBean,false);
		
		if(this.empleadoidiomaReturnGeneral.getConRecargarPropiedades()) {
			//INICIALIZA VARIABLES COMBOS NORMALES (FK)
			this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoIdioma(this.empleadoidiomaReturnGeneral.getEmpleadoIdioma());
			
			//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
			this.setVariablesObjetoActualToFormularioEmpleadoIdioma(this.empleadoidiomaReturnGeneral.getEmpleadoIdioma());
		}
		
		if(this.empleadoidiomaReturnGeneral.getConRecargarRelaciones()) {
			//INICIALIZA VARIABLES RELACIONES A FORMULARIO
			this.setVariablesRelacionesObjetoActualToFormularioEmpleadoIdioma(this.empleadoidiomaReturnGeneral.getEmpleadoIdioma(),classes);//this.empleadoidiomaBean);	
		}
			
		//ACTUALIZA VARIABLES FORMULARIO A OBJETO ACTUAL (PARA NUEVO TABLA O GUARDAR CAMBIOS
		if(esNuevoGuardarCambios) {
			this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,false);
		}
		
		//INICIALIZA VARIABLES COMBOS DEFAULT DEL PROYECTO(|DEFAULT para FK)
		//this.setVariablesDefaultCombosForeignKeyEmpleadoIdioma();
		
		//INICIALIZA VARIABLES COMBOS PARAMETRO DEL PROYECTO(|VALORPARAM Era para ParametroModulo, ahora en logic)
		//this.setVariablesParametroCombosForeignKeyEmpleadoIdioma();						
		
		if(!esNuevoGuardarCambios) {
			//INICIALIZA VARIABLES POR OPCION MENU
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.RecargarFormEmpleadoIdioma(this,"NUEVO_PREPARAR","",this.arrDatoGeneral);
		
			//NO FUNCIONA BINDINGS			
			this.inicializarActualizarBindingEmpleadoIdioma(false);
						
			if(empleadoidiomaSessionBean.getConGuardarRelaciones()) {
				//DEBERIA YA ESTAR CARGADO LOS COMBOS Y SI SE NECESITA ALGO MAS SE DEBE CREAR FUNCION LIMITADA
				//SI DEBE TRAER Y RESETEAR TABLA
								
			}
				
			//SI ES MANUAL
			if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoIdioma();
			}
			
			this.actualizarVisualTableDatosEmpleadoIdioma();
			
			this.jTableDatosEmpleadoIdioma.setRowSelectionInterval(this.getIndiceNuevoEmpleadoIdioma(), this.getIndiceNuevoEmpleadoIdioma());
			
			this.seleccionarFilaTablaEmpleadoIdiomaActual();
						
			this.actualizarEstadoCeldasBotonesEmpleadoIdioma("a", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		}		
	}
	
	public void habilitarDeshabilitarControlesEmpleadoIdioma(Boolean isHabilitar) throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_maternaEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activares_maternaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_tecnicoEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activares_tecnicoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_tecnicoEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activarporcen_tecnicoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_lecturaEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activares_lecturaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_lecturaEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activarporcen_lecturaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_escritoEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activares_escritoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_escritoEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activarporcen_escritoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_habladoEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activares_habladoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_habladoEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activarporcen_habladoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTextAreadescripcionEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activardescripcionEmpleadoIdioma);	
		//
		this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activarid_empresaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activarid_empleadoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.setEnabled(isHabilitar && this.empleadoidiomaConstantesFunciones.activarid_idiomaEmpleadoIdioma);
	};
	
	public void setDefaultControlesEmpleadoIdioma() throws Exception {
			
	};
	
	
	public void habilitarDeshabilitarTipoMantenimientoEmpleadoIdioma(Boolean esRelaciones) throws Exception {
		if(esRelaciones) {
			//this.empleadoidiomaSessionBean.setConGuardarRelaciones(true);			
			this.empleadoidiomaSessionBean.setEstaModoGuardarRelaciones(true);				
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTabbedPaneRelacionesEmpleadoIdioma.setVisible(true);
			
					
		} else {
			//this.empleadoidiomaSessionBean.setConGuardarRelaciones(false);			
			this.empleadoidiomaSessionBean.setEstaModoGuardarRelaciones(false);						
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTabbedPaneRelacionesEmpleadoIdioma.setVisible(false);
			
			
		}
	};
	
	public int getIndiceNuevoEmpleadoIdioma() throws Exception {
		int iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomaLogic.getEmpleadoIdiomas()) {
				if(empleadoidiomaAux.getId().equals(this.iIdNuevoEmpleadoIdioma)) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomas) {
				if(empleadoidiomaAux.getId().equals(this.iIdNuevoEmpleadoIdioma)) {
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
	
	public int getIndiceActualEmpleadoIdioma(EmpleadoIdioma empleadoidioma,Integer iIndiceActual) throws Exception {
		Integer iIndice=0;
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomaLogic.getEmpleadoIdiomas()) {
				if(empleadoidiomaAux.getId().equals(empleadoidioma.getId())) {
					existe=true;
					break;
				}
				
				iIndice++;
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomas) {
				if(empleadoidiomaAux.getId().equals(empleadoidioma.getId())) {
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
	
	public void setCamposBaseDesdeOriginalEmpleadoIdioma(EmpleadoIdioma empleadoidiomaOriginal) throws Exception {
		Boolean existe=false;
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomaLogic.getEmpleadoIdiomas()) {
				if(empleadoidiomaAux.getEmpleadoIdiomaOriginal().getId().equals(empleadoidiomaOriginal.getId())) {
					existe=true;
					empleadoidiomaOriginal.setId(empleadoidiomaAux.getId());
					empleadoidiomaOriginal.setVersionRow(empleadoidiomaAux.getVersionRow());
					break;
				}
				
			}
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomas) {
				if(empleadoidiomaAux.getEmpleadoIdiomaOriginal().getId().equals(empleadoidiomaOriginal.getId())) {
					existe=true;
					empleadoidiomaOriginal.setId(empleadoidiomaAux.getId());
					empleadoidiomaOriginal.setVersionRow(empleadoidiomaAux.getVersionRow());
					break;
				}				
			}
		}
		//ARCHITECTURE
		
		if(!existe) {
			//SI NO EXISTE TOMA LA ULTIMA FILA
		}
	}
	
	public void cancelarNuevosEmpleadoIdioma(Boolean esParaCancelar) throws Exception {
		empleadoidiomasAux=new ArrayList<EmpleadoIdioma>();
		empleadoidiomaAux=new EmpleadoIdioma();
		
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomaLogic.getEmpleadoIdiomas()) {
					if(empleadoidiomaAux.getId()<0) {
						empleadoidiomasAux.add(empleadoidiomaAux);
					}		
				}
				this.iIdNuevoEmpleadoIdioma=0L;
				this.empleadoidiomaLogic.getEmpleadoIdiomas().removeAll(empleadoidiomasAux);
					
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomas) {
					if(empleadoidiomaAux.getId()<0) {
						empleadoidiomasAux.add(empleadoidiomaAux);
					}		
				}
				this.iIdNuevoEmpleadoIdioma=0L;
				this.empleadoidiomas.removeAll(empleadoidiomasAux);
			}	
		} else {			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				if(esParaCancelar && this.isEsNuevoEmpleadoIdioma 
					&& this.empleadoidiomaLogic.getEmpleadoIdiomas().size()>0
					) {
					empleadoidiomaAux=this.empleadoidiomaLogic.getEmpleadoIdiomas().get(this.empleadoidiomaLogic.getEmpleadoIdiomas().size() - 1);
				
					if(empleadoidiomaAux.getId()<0) {
						this.empleadoidiomaLogic.getEmpleadoIdiomas().remove(empleadoidiomaAux);
					}
				}
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				if(esParaCancelar && this.isEsNuevoEmpleadoIdioma && this.empleadoidiomas.size()>0) {
					empleadoidiomaAux=this.empleadoidiomas.get(this.empleadoidiomas.size() - 1);
				
					if(empleadoidiomaAux.getId()<0) {
						this.empleadoidiomas.remove(empleadoidiomaAux);
					}
				}
			}	
		}
	}
	
	public void cancelarNuevoEmpleadoIdioma(Boolean esParaCancelar) throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			if(empleadoidioma.getId()<0) {
				this.empleadoidiomaLogic.getEmpleadoIdiomas().remove(this.empleadoidioma);
			}					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			if(empleadoidioma.getId()<0) {
				this.empleadoidiomas.remove(this.empleadoidioma);
			}
		}			
	}
	
	public void setEstadosInicialesEmpleadoIdioma(List<EmpleadoIdioma> empleadoidiomasAux) throws Exception {
		EmpleadoIdiomaConstantesFunciones.setEstadosInicialesEmpleadoIdioma(empleadoidiomasAux);
	}
	
	public void setEstadosInicialesEmpleadoIdioma(EmpleadoIdioma empleadoidiomaAux) throws Exception {
		EmpleadoIdiomaConstantesFunciones.setEstadosInicialesEmpleadoIdioma(empleadoidiomaAux);		
	}
	
	public void nuevo() throws Exception {
		try	{
			//ESTA VALIDADO EN FUNCION ACTUALIZAR
			//if(this.validarEmpleadoIdiomaActual()) {
				this.ejecutarMantenimiento(MaintenanceType.NUEVO);
				
				this.actualizarEstadoCeldasBotonesEmpleadoIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
				
			//}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void actualizar() throws Exception {
		try	{
			if(this.validarEmpleadoIdiomaActual()) {
				if(!this.isEsNuevoEmpleadoIdioma) {
					this.ejecutarMantenimiento(MaintenanceType.ACTUALIZAR);
					
					this.actualizarEstadoCeldasBotonesEmpleadoIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
					
				} else {					
					this.nuevo();
					this.isEsNuevoEmpleadoIdioma=false;
				}
				
				//SE CANCELA AL FINAL DEL PROCESO JBUTTONACTUALIZAR
				//this.cancelar(false);
			}		
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void eliminar() throws Exception {
		try	{	
			if(this.validarEmpleadoIdiomaActual()) {
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE ELIMINAR EL/LA Empleado Idioma ?", "MANTENIMIENTO DE Empleado Idioma", JOptionPane.OK_CANCEL_OPTION) == 0) {
					this.ejecutarMantenimiento(MaintenanceType.ELIMINAR);			
					this.actualizarEstadoCeldasBotonesEmpleadoIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
				}
			
			}
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void guardarCambios() throws Exception {
		try	{
			this.ejecutarMantenimiento(MaintenanceType.GUARDARCAMBIOS);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarAsignar(EmpleadoIdioma empleadoidioma) throws Exception {
		EmpleadoIdiomaConstantesFunciones.seleccionarAsignar(this.empleadoidioma,empleadoidioma);
	}
	
	public void seleccionar() throws Exception {
		try	{
			//ACTUALIZO EL PERMISO ACTUALIZAR CON EL PERMISO ACTUALIZAR ORIGINAL ESTE PERMISO SE UTILIZA PARA EL NUEVO TAMBIEN
			this.isPermisoActualizarEmpleadoIdioma=this.isPermisoActualizarOriginalEmpleadoIdioma;
			
			
			this.seleccionarAsignar(empleadoidioma);
			
			

			idEmpleadoActual=empleadoidioma.getid_empleado();
			this.seleccionarEmpleadoActual();
			
			this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
			this.arrDatoGeneralNo= new  ArrayList<String>();
			
			EmpleadoIdiomaConstantesFunciones.quitarEspaciosEmpleadoIdioma(this.empleadoidioma,this.arrDatoGeneral);
			
			
			this.actualizarEstadoCeldasBotonesEmpleadoIdioma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarBusqueda(Long id) throws Exception {
		try	{
			this.empleadoidiomaSessionBean.setsFuncionBusquedaRapida(this.empleadoidiomaSessionBean.getsFuncionBusquedaRapida().replace("TO_REPLACE", id.toString()));
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
			if(this.isEsNuevoEmpleadoIdioma) {
				//NO CANCELA TODOS NUEVOS POR FUNCIONALIDAD GUARDAR CAMBIOS
				//this.cancelarNuevosEmpleadoIdioma(esParaCancelar);				
				this.cancelarNuevoEmpleadoIdioma(esParaCancelar);								
			}
			
			this.empleadoidioma=new EmpleadoIdioma();
			
			this.inicializarEmpleadoIdioma();
			
			this.actualizarEstadoCeldasBotonesEmpleadoIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);			
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void inicializarEmpleadoIdioma() throws Exception {
		try {
			EmpleadoIdiomaConstantesFunciones.inicializarEmpleadoIdioma(this.empleadoidioma);
			
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
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void siguientes()throws Exception {
		try	{			
			if(this.empleadoidiomaLogic.getEmpleadoIdiomas().size()>0) {
					
				this.iNumeroPaginacionPagina=this.iNumeroPaginacionPagina+this.iNumeroPaginacion;
			}
				
			this.procesarBusqueda(this.sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void generarReporteEmpleadoIdiomas(String sAccionBusqueda,List<EmpleadoIdioma> empleadoidiomasParaReportes) throws Exception {
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
					sPathReporteFinal="EmpleadoIdioma"+this.sTipoReporteExtra+"Design.jasper";
					reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);	
				} else {
					sPathReporteFinal=this.sPathReporteDinamico;
					reportFile = new FileInputStream(sPathReporteFinal);
				}
			} else {
				sPathReporteFinal="EmpleadoIdiomaMasterRelaciones"+this.sTipoReporteExtra+"Design.jasper";
				reportFile = AuxiliarReportes.class.getResourceAsStream(sPathReporteFinal);
				//sPathReportes=reportFile.getPath().replace("EmpleadoIdiomaMasterRelacionesDesign.jasper", "");
			}
		} else {
				sPathReporteFinal="EmpleadoIdioma"+this.sTipoReporteExtra+"Design.jasper";
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
		parameters.put("subtitulo", "Reporte De  Empleado Idiomas");		
		parameters.put("busquedapor", EmpleadoIdiomaConstantesFunciones.getNombreIndice(sAccionBusqueda)+sDetalleReporte);
		
		
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
		
		JRBeanArrayDataSource jrbeanArrayDataSourceEmpleadoIdioma=null;
		
		if(this.sTipoReporteExtra!=null && !this.sTipoReporteExtra.equals("")) {
			EmpleadoIdiomaConstantesFunciones.S_TIPOREPORTE_EXTRA=this.sTipoReporteExtra;
		} else {
			EmpleadoIdiomaConstantesFunciones.S_TIPOREPORTE_EXTRA="";
		}
		
		jrbeanArrayDataSourceEmpleadoIdioma=new JRBeanArrayDataSource(EmpleadoIdiomaJInternalFrame.TraerEmpleadoIdiomaBeans(empleadoidiomasParaReportes,classes).toArray());
		
		jasperPrint = JasperFillManager.fillReport(jasperReport,parameters,jrbeanArrayDataSourceEmpleadoIdioma);
				
		
		String sPathDest=Constantes.SUNIDAD_ARCHIVOS+":/"+Constantes.SCONTEXTSERVER+"/"+EmpleadoIdiomaConstantesFunciones.SCHEMA+"/reportes";
		
		File filePathDest = new File(sPathDest);
		
		if(!filePathDest.exists()) {
			filePathDest.mkdirs();				
		}
				
		String sDestFileName=sPathDest+"/"+EmpleadoIdiomaConstantesFunciones.CLASSNAME;
				
		if(this.sTipoArchivoReporte=="VISUALIZAR") {
			JasperViewer jasperViewer = new JasperViewer(jasperPrint,false) ;
			jasperViewer.setVisible(true) ; 

		} else if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML") {	
			//JasperFillManager.fillReportToFile(reportFile.getAbsolutePath(),parameters, new JRBeanArrayDataSource(EmpleadoIdiomaBean.TraerEmpleadoIdiomaBeans(empleadoidiomasParaReportes).toArray()));
							
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
				this.generarExcelReporteEmpleadoIdiomas(sAccionBusqueda,sTipoArchivoReporte,empleadoidiomasParaReportes);
			
			} else if(this.sTipoReporte.equals("FORMULARIO")){
				this.generarExcelReporteVerticalEmpleadoIdiomas(sAccionBusqueda,sTipoArchivoReporte,empleadoidiomasParaReportes,false);
			
			} else if(this.sTipoReporte.equals("DINAMICO")){
				
				if(this.sTipoReporteDinamico.equals("NORMAL")) {
					
					this.jButtonGenerarExcelReporteDinamicoEmpleadoIdiomaActionPerformed(null);
					//this.generarExcelReporteEmpleadoIdiomas(sAccionBusqueda,sTipoArchivoReporte,empleadoidiomasParaReportes);
					
				
				} else if(this.sTipoReporteDinamico.equals("FORMULARIO")){
					this.generarExcelReporteVerticalEmpleadoIdiomas(sAccionBusqueda,sTipoArchivoReporte,empleadoidiomasParaReportes,true);
				
				} else if(this.sTipoReporteDinamico.equals("RELACIONES")){
					this.generarExcelReporteRelacionesEmpleadoIdiomas(sAccionBusqueda,sTipoArchivoReporte,empleadoidiomasParaReportes,true);
				}
				
			} else if(this.sTipoReporte.equals("RELACIONES")){
				this.generarExcelReporteRelacionesEmpleadoIdiomas(sAccionBusqueda,sTipoArchivoReporte,empleadoidiomasParaReportes,false);
			}
		}
		
		if(this.sTipoArchivoReporte=="HTML"||this.sTipoArchivoReporte=="PDF"||this.sTipoArchivoReporte=="XML"||this.sTipoArchivoReporte=="WORD"||this.sTipoArchivoReporte=="EXCEL") {				
			JOptionPane.showMessageDialog(this,"REPORTE "+sDestFileName+" GENERADO SATISFACTORIAMENTE","REPORTES ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteEmpleadoIdiomas(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoIdioma> empleadoidiomasParaReportes) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoidioma";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoIdiomas");
         
        int iRow = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoIdioma("NORMAL",row,workbook);
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux=null;
		
		int i=0;
		
      	for(EmpleadoIdioma empleadoidioma : empleadoidiomasParaReportes) {            
			row = sheet.createRow(iRow++);
			iCell = 0;
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				cellStyleDataAux=cellStyleData;
			}
			
			EmpleadoIdiomaConstantesFunciones.generarExcelReporteDataEmpleadoIdioma("NORMAL",row,workbook,empleadoidioma,cellStyleDataAux);
		
			
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
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Idioma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteHeaderEmpleadoIdioma(String sTipo,Row row,Workbook workbook) {
		
		EmpleadoIdiomaConstantesFunciones.generarExcelReporteHeaderEmpleadoIdioma(sTipo,row,workbook);
		
		/*
		Cell cell=null;
		int iCell=0;
		
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
		cellStyle.setFillPattern(CellStyle.ALIGN_FILL);
		*/
		
	}
	
	public void generarExcelReporteVerticalEmpleadoIdiomas(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoIdioma> empleadoidiomasParaReportes,Boolean paraDinamico) throws Exception {
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoidioma_vertical";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoIdiomas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		CellStyle cellStyle = Funciones2.getStyleTitulo(workbook,"ZEBRA");;
		
		CellStyle cellStyleTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL_VERTICAL");
		
		
		for(EmpleadoIdioma empleadoidioma : empleadoidiomasParaReportes) {
			row = sheet.createRow(iRow++);
			iRowLast=iRow - 1;
			
			cell = row.createCell(0);
			cell.setCellValue(EmpleadoIdiomaConstantesFunciones.getEmpleadoIdiomaDescripcion(empleadoidioma));
			cell.setCellStyle(cellStyleTitulo);
			
			sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
	
			


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoidioma.getempresa_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoidioma.getempleado_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoidioma.getidioma_descripcion());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(empleadoidioma.getes_materna()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(empleadoidioma.getes_tecnico()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoidioma.getporcen_tecnico());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(empleadoidioma.getes_lectura()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoidioma.getporcen_lectura());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(empleadoidioma.getes_escrito()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoidioma.getporcen_escrito());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(Funciones2.getDescripcionBoolean(empleadoidioma.getes_hablado()));


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoidioma.getporcen_hablado());


			}


			if(!paraDinamico || (paraDinamico && this.existeColumnaReporteDinamico(EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION))) {
				row = sheet.createRow(iRow++);

				cell = row.createCell(0);
				cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION);
				cell.setCellStyle(cellStyle);

				cell = row.createCell(1);
				cell.setCellValue(empleadoidioma.getdescripcion());


			}						
        }
        
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Idioma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	public void generarExcelReporteRelacionesEmpleadoIdiomas(String sAccionBusqueda,String sTipoArchivoReporte,List<EmpleadoIdioma> empleadoidiomasParaReportes,Boolean paraDinamico) throws Exception {
		
		ArrayList<Classe> classes=new ArrayList<Classe>();
		List<EmpleadoIdioma> empleadoidiomasRespaldo=null;
		
		classes=EmpleadoIdiomaConstantesFunciones.getClassesRelationshipsOfEmpleadoIdioma(new ArrayList<Classe>(),DeepLoadType.NONE,false);
					
		this.datosDeep=new DatosDeep();
		
		this.datosDeep.setIsDeep(false);
		this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
		this.datosDeep.setClases(classes);
			
		this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
		this.datosCliente.setIsConDeep(true);	
		this.datosCliente.setIsConExportar(false);
		
						
		this.empleadoidiomaLogic.setDatosCliente(this.datosCliente);
		this.empleadoidiomaLogic.setDatosDeep(this.datosDeep);
		this.empleadoidiomaLogic.setIsConDeep(true);
		
		empleadoidiomasRespaldo=this.empleadoidiomaLogic.getEmpleadoIdiomas();
		
		this.empleadoidiomaLogic.setEmpleadoIdiomas(empleadoidiomasParaReportes);	
		this.empleadoidiomaLogic.deepLoadsWithConnection(false, DeepLoadType.INCLUDE, classes,"");
		
		empleadoidiomasParaReportes=this.empleadoidiomaLogic.getEmpleadoIdiomas();
		this.empleadoidiomaLogic.setEmpleadoIdiomas(empleadoidiomasRespaldo);
		
		
	 	Workbook workbook = null;
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoidioma_relacion";
		
		if(sTipoArchivoReporte=="EXCEL2") {
			workbook = new HSSFWorkbook();
			sPath+=".xls";
		
		} else if(sTipoArchivoReporte=="EXCEL2_2") {
			workbook = new XSSFWorkbook();
			sPath+=".xlsx";			
		}
		
		
		
		Sheet sheet = workbook.createSheet("EmpleadoIdiomas");
         
        int iRow = 0;
		int iRowLast = 0;
		int iCell = 0;
		Row row =null;
		Cell cell=null;
		
		row = sheet.createRow(iRow++);
		
		this.generarExcelReporteHeaderEmpleadoIdioma("NORMAL",row,workbook);
		
		int i=0;
		int i2=0;
		
		CellStyle cellStyleData = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataTitulo = Funciones2.getStyleTitulo(workbook,"PRINCIPAL");
		CellStyle cellStyleDataZebra = Funciones2.getStyleTitulo(workbook,"ZEBRA");
		CellStyle cellStyleDataAux =null;
		CellStyle cellStyleDataAuxHijo =null;
		
		for(EmpleadoIdioma empleadoidioma : empleadoidiomasParaReportes) {			
			if(i!=0) {
				row = sheet.createRow(iRow++);				
				this.generarExcelReporteHeaderEmpleadoIdioma("NORMAL",row,workbook);
			}
			
			cellStyleDataAux=null;
			
			if(i%2==0) {
				//cellStyleDataAux=cellStyleData;
			}
			
			row = sheet.createRow(iRow++);						
			EmpleadoIdiomaConstantesFunciones.generarExcelReporteDataEmpleadoIdioma("NORMAL",row,workbook,empleadoidioma,cellStyleDataAux);
		
			
			
			
			i++;
        }
        
		/*
		row = sheet.createRow(iRow++);
		iRowLast=iRow - 1;
			
		cell = row.createCell(0);
		cell.setCellValue(EmpleadoIdiomaConstantesFunciones.getEmpleadoIdiomaDescripcion(empleadoidioma));
		cell.setCellStyle(cellStyleTitulo);
			
		sheet.addMergedRegion(new CellRangeAddress(iRowLast,iRowLast,0,2));			
		*/
		
			
		
        FileOutputStream fileOutputStream = new FileOutputStream(sPath);
		
        workbook.write(fileOutputStream);
		
        fileOutputStream.close();
		
		Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
		if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
			JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Idioma",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	
	
	public Boolean existeColumnaReporteDinamico(String sColumna) {
		Boolean existe=false;
		
		Reporte reporte=new Reporte();
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
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
		
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListRelacionesSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListRelacionesSelectReporte().getModel().getElementAt(index);
			
			if(sColumna.equals(reporte.getsCodigo())) {
				existe=true;
				break;
			}
		
		}
		
		
		return existe;
	}
	
	public void startProcessEmpleadoIdioma() throws Exception {		
		this.startProcessEmpleadoIdioma(true);
	}
	
	public void startProcessEmpleadoIdioma(Boolean conSplash) throws Exception {		
		//FuncionesSwing.enableDisablePanels(false,this.jTabbedPaneBusquedasEmpleadoIdioma ,this.jPanelParametrosReportesEmpleadoIdioma, this.jScrollPanelDatosEmpleadoIdioma,this.jPanelPaginacionEmpleadoIdioma, this.jScrollPanelDatosEdicionEmpleadoIdioma, this.jPanelAccionesEmpleadoIdioma,this.jPanelAccionesFormularioEmpleadoIdioma,this.jmenuBarEmpleadoIdioma,this.jmenuBarDetalleEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,this.jTtoolBarDetalleEmpleadoIdioma);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoIdioma=this.jTabbedPaneBusquedasEmpleadoIdioma; 
		
		final JPanel jPanelParametrosReportesEmpleadoIdioma=this.jPanelParametrosReportesEmpleadoIdioma;
		//final JScrollPane jScrollPanelDatosEmpleadoIdioma=this.jScrollPanelDatosEmpleadoIdioma;
		final JTable jTableDatosEmpleadoIdioma=this.jTableDatosEmpleadoIdioma;		
		final JPanel jPanelPaginacionEmpleadoIdioma=this.jPanelPaginacionEmpleadoIdioma;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoIdioma=this.jScrollPanelDatosEdicionEmpleadoIdioma;
		final JPanel jPanelAccionesEmpleadoIdioma=this.jPanelAccionesEmpleadoIdioma;
		
		JPanel jPanelCamposAuxiliarEmpleadoIdioma=new JPanelMe();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoIdioma=new JPanelMe();
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			jPanelCamposAuxiliarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelCamposEmpleadoIdioma;
			jPanelAccionesFormularioAuxiliarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelAccionesFormularioEmpleadoIdioma;
		}
		
		final JPanel jPanelCamposEmpleadoIdioma=jPanelCamposAuxiliarEmpleadoIdioma;
		final JPanel jPanelAccionesFormularioEmpleadoIdioma=jPanelAccionesFormularioAuxiliarEmpleadoIdioma;
		
		
		final JMenuBar jmenuBarEmpleadoIdioma=this.jmenuBarEmpleadoIdioma;
		final JToolBar jTtoolBarEmpleadoIdioma=this.jTtoolBarEmpleadoIdioma;		
		
		
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoIdioma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoIdioma=new JToolBar();		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			jmenuBarDetalleAuxiliarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jmenuBarDetalleEmpleadoIdioma;
			jTtoolBarDetalleAuxiliarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jTtoolBarDetalleEmpleadoIdioma;
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoIdioma=jmenuBarDetalleAuxiliarEmpleadoIdioma;
		final JToolBar jTtoolBarDetalleEmpleadoIdioma=jTtoolBarDetalleAuxiliarEmpleadoIdioma;		
		
		
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoIdioma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoIdioma;
			processRunnable.jTableDatos=jTableDatosEmpleadoIdioma;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoIdioma;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoIdioma;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoIdioma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoIdioma;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoIdioma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoIdioma;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoIdioma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoIdioma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoIdioma ,jPanelParametrosReportesEmpleadoIdioma,jTableDatosEmpleadoIdioma, /*jScrollPanelDatosEmpleadoIdioma,*/jPanelCamposEmpleadoIdioma,jPanelPaginacionEmpleadoIdioma, /*jScrollPanelDatosEdicionEmpleadoIdioma,*/ jPanelAccionesEmpleadoIdioma,jPanelAccionesFormularioEmpleadoIdioma,jmenuBarEmpleadoIdioma,jmenuBarDetalleEmpleadoIdioma,jTtoolBarEmpleadoIdioma,jTtoolBarDetalleEmpleadoIdioma);
		
			startProcess();//this.
		}
						
		/*
		if(conSplash) {
			SwingUtilities.invokeLater(new Runnable() {
			      public void run() {
			    	  try {
							FuncionesSwing.enableDisablePanels(false,jTabbedPaneBusquedasEmpleadoIdioma ,jPanelParametrosReportesEmpleadoIdioma, jScrollPanelDatosEmpleadoIdioma,jPanelPaginacionEmpleadoIdioma, jScrollPanelDatosEdicionEmpleadoIdioma, jPanelAccionesEmpleadoIdioma,jPanelAccionesFormularioEmpleadoIdioma,jmenuBarEmpleadoIdioma,jmenuBarDetalleEmpleadoIdioma,jTtoolBarEmpleadoIdioma,jTtoolBarDetalleEmpleadoIdioma);
						
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
	
	public void finishProcessEmpleadoIdioma() {// throws Exception 
		this.finishProcessEmpleadoIdioma(true);
	}
	
	public void finishProcessEmpleadoIdioma(Boolean conSplash) {// throws Exception 
		//FuncionesSwing.enableDisablePanels(true,this.jTabbedPaneBusquedasEmpleadoIdioma ,this.jPanelParametrosReportesEmpleadoIdioma, this.jScrollPanelDatosEmpleadoIdioma,this.jPanelPaginacionEmpleadoIdioma, this.jScrollPanelDatosEdicionEmpleadoIdioma, this.jPanelAccionesEmpleadoIdioma,this.jPanelAccionesFormularioEmpleadoIdioma,this.jmenuBarEmpleadoIdioma,this.jmenuBarDetalleEmpleadoIdioma,this.jTtoolBarEmpleadoIdioma,this.jTtoolBarDetalleEmpleadoIdioma);		
		
		final JTabbedPane jTabbedPaneBusquedasEmpleadoIdioma=this.jTabbedPaneBusquedasEmpleadoIdioma; 
		
		final JPanel jPanelParametrosReportesEmpleadoIdioma=this.jPanelParametrosReportesEmpleadoIdioma;
		//final JScrollPane jScrollPanelDatosEmpleadoIdioma=this.jScrollPanelDatosEmpleadoIdioma;
		final JTable jTableDatosEmpleadoIdioma=this.jTableDatosEmpleadoIdioma;		
		final JPanel jPanelPaginacionEmpleadoIdioma=this.jPanelPaginacionEmpleadoIdioma;
		//final JScrollPane jScrollPanelDatosEdicionEmpleadoIdioma=this.jScrollPanelDatosEdicionEmpleadoIdioma;
		final JPanel jPanelAccionesEmpleadoIdioma=this.jPanelAccionesEmpleadoIdioma;
		
		JPanel jPanelCamposAuxiliarEmpleadoIdioma=new JPanel();
		JPanel jPanelAccionesFormularioAuxiliarEmpleadoIdioma=new JPanel();
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			jPanelCamposAuxiliarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelCamposEmpleadoIdioma;
			jPanelAccionesFormularioAuxiliarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelAccionesFormularioEmpleadoIdioma;
		}
		
		final JPanel jPanelCamposEmpleadoIdioma=jPanelCamposAuxiliarEmpleadoIdioma;
		final JPanel jPanelAccionesFormularioEmpleadoIdioma=jPanelAccionesFormularioAuxiliarEmpleadoIdioma;
		
		
		final JMenuBar jmenuBarEmpleadoIdioma=this.jmenuBarEmpleadoIdioma;		
		final JToolBar jTtoolBarEmpleadoIdioma=this.jTtoolBarEmpleadoIdioma;
				
		JMenuBar jmenuBarDetalleAuxiliarEmpleadoIdioma=new JMenuBar();
		JToolBar jTtoolBarDetalleAuxiliarEmpleadoIdioma=new JToolBar();
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			jmenuBarDetalleAuxiliarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jmenuBarDetalleEmpleadoIdioma;
			jTtoolBarDetalleAuxiliarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jTtoolBarDetalleEmpleadoIdioma;		
		}
		
		final JMenuBar jmenuBarDetalleEmpleadoIdioma=jmenuBarDetalleAuxiliarEmpleadoIdioma;
		final JToolBar jTtoolBarDetalleEmpleadoIdioma=jTtoolBarDetalleAuxiliarEmpleadoIdioma;
		
		
		
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
			
			processRunnable.jTabbedPaneBusquedas=jTabbedPaneBusquedasEmpleadoIdioma;
			processRunnable.jPanelParametrosReportes=jPanelParametrosReportesEmpleadoIdioma;
			processRunnable.jTableDatos=jTableDatosEmpleadoIdioma;
			processRunnable.jPanelCampos=jPanelCamposEmpleadoIdioma;
			processRunnable.jPanelPaginacion=jPanelPaginacionEmpleadoIdioma;
			processRunnable.jPanelAcciones=jPanelAccionesEmpleadoIdioma;
			processRunnable.jPanelAccionesFormulario=jPanelAccionesFormularioEmpleadoIdioma;
			
			
			processRunnable.jmenuBar=jmenuBarEmpleadoIdioma;
			processRunnable.jmenuBarDetalle=jmenuBarDetalleEmpleadoIdioma;
			processRunnable.jTtoolBar=jTtoolBarEmpleadoIdioma;
			processRunnable.jTtoolBarDetalle=jTtoolBarDetalleEmpleadoIdioma;
			processRunnable.jInternalFrameBase=this;
			
			//processRunnable.CargarObjetosRendimientoCriticoModuloInventario();
			
			
			threadRunnableProcess=new Thread(processRunnable);//.start();
					
			threadRunnableProcess.start();
			
		} else {
			if(conSplash) {
				SwingUtilities.invokeLater(new RunnableProceso(true,this,jTabbedPaneBusquedasEmpleadoIdioma ,jPanelParametrosReportesEmpleadoIdioma, jTableDatosEmpleadoIdioma,/*jScrollPanelDatosEmpleadoIdioma,*/jPanelCamposEmpleadoIdioma,jPanelPaginacionEmpleadoIdioma, /*jScrollPanelDatosEdicionEmpleadoIdioma,*/ jPanelAccionesEmpleadoIdioma,jPanelAccionesFormularioEmpleadoIdioma,jmenuBarEmpleadoIdioma,jmenuBarDetalleEmpleadoIdioma,jTtoolBarEmpleadoIdioma,jTtoolBarDetalleEmpleadoIdioma));
			}
		}						
	}
	
	/*
	public void habilitarDeshabilitarControlesEmpleadoIdioma(Boolean esHabilitar,Boolean conDetalle) {
		this.habilitarDeshabilitarToolBarEmpleadoIdioma(esHabilitar,conDetalle);
		this.habilitarDeshabilitarMenuEmpleadoIdioma(esHabilitar,conDetalle);
	}
	
	public void habilitarDeshabilitarToolBarEmpleadoIdioma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jTtoolBarEmpleadoIdioma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jTtoolBarDetalleEmpleadoIdioma,esHabilitar,1,1);
		}
	}
	
	public void habilitarDeshabilitarMenuEmpleadoIdioma(Boolean esHabilitar,Boolean conDetalle) {
		FuncionesSwing.enableDisableComponents(this.jmenuBarEmpleadoIdioma,esHabilitar,1,1);
		
		if(conDetalle) {
			FuncionesSwing.enableDisableComponents(this.jmenuBarDetalleEmpleadoIdioma,esHabilitar,1,1);
		}
	}
	*/
	
	
	
	public void procesarBusqueda(String sAccionBusqueda) throws Exception {		
		String  finalQueryPaginacion=this.empleadoidiomaConstantesFunciones.getsFinalQueryEmpleadoIdioma();
		String  finalQueryPaginacionTodos=this.empleadoidiomaConstantesFunciones.getsFinalQueryEmpleadoIdioma();
		
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
		
		ArrayList<String> arrColumnasGlobalesNo=EmpleadoIdiomaConstantesFunciones.getArrayColumnasGlobalesNoEmpleadoIdioma(this.arrDatoGeneral);
		ArrayList<String> arrColumnasGlobales=EmpleadoIdiomaConstantesFunciones.getArrayColumnasGlobalesEmpleadoIdioma(this.arrDatoGeneral,arrColumnasGlobalesNo);
		
			
		String  finalQueryGlobal="";
		
		finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,!esBusqueda,esBusqueda,arrColumnasGlobales,EmpleadoIdiomaConstantesFunciones.TABLENAME);
		
		String sOrderBy="";
		
		
		sOrderBy=Funciones2.getFinalQueryOrderBy(this.arrOrderBy);
		
		
		if(!sOrderBy.equals("")) {			
			finalQueryPaginacion=sOrderBy;
			finalQueryPaginacionTodos=sOrderBy;
		}
		
		
		//INICIALIZA ELIMINADOS
		this.empleadoidiomasEliminados= new ArrayList<EmpleadoIdioma>();
		
		if(!this.isEntroOnLoad) {
			this.onLoad();
		}/* else {
			this.isEntroOnLoad=false;
		}*/
		
		
		
				
		try	{		
			
			//this.startProcessEmpleadoIdioma();
		
				///*EmpleadoIdiomaSessionBean*/this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
			
			if(this.empleadoidiomaSessionBean==null) {
				this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
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
					this.iNumeroPaginacion=EmpleadoIdiomaConstantesFunciones.INUMEROPAGINACION;
				}
			}
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);
			
			this.cargarDatosCliente();
			
			ArrayList<Classe> classes=new ArrayList<Classe>();
			
			classes=EmpleadoIdiomaConstantesFunciones.getClassesForeignKeysOfEmpleadoIdioma(new ArrayList<Classe>(),DeepLoadType.NONE);
			
		
			this.datosDeep=new DatosDeep();
			this.datosDeep.setIsDeep(false);
			this.datosDeep.setDeepLoadType(DeepLoadType.INCLUDE);
			this.datosDeep.setClases(classes);
			
			this.datosCliente.setDatosDeepParametros(false, DeepLoadType.INCLUDE, classes, "");
			this.datosCliente.setIsConDeep(true);
			
			if(false) {//this.conExportar
				this.datosCliente.setIsConExportar(true);
				this.datosCliente.setDatosExportarParametros(Funciones2.getTipoExportar(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getcon_exportar_cabecera(),Funciones2.getTipoDelimiter(this.parametroGeneralUsuario),this.parametroGeneralUsuario.getpath_exportar()+"/empleadoidioma."+Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario));
			} else {
				this.datosCliente.setIsConExportar(false);
			}
			
			empleadoidiomasAux= new ArrayList<EmpleadoIdioma>();
			
				
			empleadoidiomaLogic.setDatosCliente(this.datosCliente);
			empleadoidiomaLogic.setDatosDeep(this.datosDeep);
			empleadoidiomaLogic.setIsConDeep(true);
			
			
			empleadoidiomaLogic.getEmpleadoIdiomaDataAccess().setIsForForeingsKeysDataRelationships(true);
			
			if(sAccionBusqueda.equals("Todos") || sAccionBusqueda.equals("Query"))	{	
				if(sAccionBusqueda.equals("Todos")) {
					//FALTA:PARA BUSQUEDAS POR CAMPO EN FORMULARIO
					//this.sFinalQueryGeneral="";
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacionTodos );
					
					empleadoidiomaLogic.getTodosEmpleadoIdiomas(finalQueryGlobal,pagination);
					
					//empleadoidiomaLogic.getTodosEmpleadoIdiomasWithConnection(finalQueryGlobal,pagination);										
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
				
				if(empleadoidiomaLogic.getEmpleadoIdiomas()==null|| empleadoidiomaLogic.getEmpleadoIdiomas().size()==0)	{
					
				
				}
				
				if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(-1);
						this.pagination.setiMaxResults(-1);
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoidiomasAux= new ArrayList<EmpleadoIdioma>();
							empleadoidiomasAux.addAll(empleadoidiomaLogic.getEmpleadoIdiomas());						
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoidiomasAux= new ArrayList<EmpleadoIdioma>();
							empleadoidiomasAux.addAll(empleadoidiomas);
						}
						//ARCHITECTURE
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoidiomaLogic.getTodosEmpleadoIdiomas(finalQueryGlobal+"",this.pagination);												
							
							//empleadoidiomaLogic.getTodosEmpleadoIdiomasWithConnection(finalQueryGlobal+"",this.pagination);												
						} else if(Constantes.ISUSAEJBREMOTE) {
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
					}
					
					this.generarReporteEmpleadoIdiomas("Todos",empleadoidiomaLogic.getEmpleadoIdiomas() );
					
					if(false) {//isMostrarTodosResultadosReporte						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {	
							empleadoidiomaLogic.setEmpleadoIdiomas(new ArrayList<EmpleadoIdioma>());					
							empleadoidiomaLogic.getEmpleadoIdiomas().addAll(empleadoidiomasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoidiomas=new ArrayList<EmpleadoIdioma>();
							empleadoidiomas.addAll(empleadoidiomasAux);
						}
						//ARCHITECTURE
						
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);														
					}
				}
			}
			else if(sAccionBusqueda.equals("PorId")) {
				Long idEmpleadoIdioma=0L;
				
				if(this.idActual!=null && this.idActual!=0L) {
					idEmpleadoIdioma=this.idActual;
				
				} else if(this.idEmpleadoIdiomaActual!=null && this.idEmpleadoIdiomaActual!=0L) {
					idEmpleadoIdioma=idEmpleadoIdiomaActual;
				}
				
					
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndicePorId(idEmpleadoIdioma);
				
				this.empleadoidiomas=new ArrayList<EmpleadoIdioma>();
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {					
					empleadoidiomaLogic.getEntity(idEmpleadoIdioma);
					
					//empleadoidiomaLogic.getEntityWithConnection(idEmpleadoIdioma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
								
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoidiomaLogic.setEmpleadoIdiomas(new ArrayList<EmpleadoIdioma>());
					empleadoidiomaLogic.getEmpleadoIdiomas().add(empleadoidiomaLogic.getEmpleadoIdioma());
				
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoidiomas=new ArrayList<EmpleadoIdioma>();
					this.empleadoidiomas.add(empleadoidioma);
				}
				
				if(empleadoidiomaLogic.getEmpleadoIdioma()==null)	{
					
				
				}			
			}
			
		
			else if(sAccionBusqueda.equals("FK_IdEmpleado")) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoidiomaLogic.getEmpleadoIdiomasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoidiomaLogic.getEmpleadoIdiomas()==null||empleadoidiomaLogic.getEmpleadoIdiomas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoidiomas==null|| empleadoidiomas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomasAux=new ArrayList<EmpleadoIdioma>();
						empleadoidiomasAux.addAll(empleadoidiomaLogic.getEmpleadoIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoidiomasAux=new ArrayList<EmpleadoIdioma>();
							empleadoidiomasAux.addAll(empleadoidiomas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoidiomaLogic.getEmpleadoIdiomasFK_IdEmpleado(finalQueryGlobal,pagination,id_empleadoFK_IdEmpleado);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdEmpleado(id_empleadoFK_IdEmpleado);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoIdiomas("FK_IdEmpleado",empleadoidiomaLogic.getEmpleadoIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoIdiomas("FK_IdEmpleado",empleadoidiomas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomaLogic.setEmpleadoIdiomas(new ArrayList<EmpleadoIdioma>());
						empleadoidiomaLogic.getEmpleadoIdiomas().addAll(empleadoidiomasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoidiomas=new ArrayList<EmpleadoIdioma>();
							empleadoidiomas.addAll(empleadoidiomasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdEmpresa")) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoidiomaLogic.getEmpleadoIdiomasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoidiomaLogic.getEmpleadoIdiomas()==null||empleadoidiomaLogic.getEmpleadoIdiomas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoidiomas==null|| empleadoidiomas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomasAux=new ArrayList<EmpleadoIdioma>();
						empleadoidiomasAux.addAll(empleadoidiomaLogic.getEmpleadoIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoidiomasAux=new ArrayList<EmpleadoIdioma>();
							empleadoidiomasAux.addAll(empleadoidiomas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoidiomaLogic.getEmpleadoIdiomasFK_IdEmpresa(finalQueryGlobal,pagination,id_empresaFK_IdEmpresa);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdEmpresa(id_empresaFK_IdEmpresa);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoIdiomas("FK_IdEmpresa",empleadoidiomaLogic.getEmpleadoIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoIdiomas("FK_IdEmpresa",empleadoidiomas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomaLogic.setEmpleadoIdiomas(new ArrayList<EmpleadoIdioma>());
						empleadoidiomaLogic.getEmpleadoIdiomas().addAll(empleadoidiomasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoidiomas=new ArrayList<EmpleadoIdioma>();
							empleadoidiomas.addAll(empleadoidiomasAux);
						}
						//ARCHITECTURE
					}
				}

			}
			else if(sAccionBusqueda.equals("FK_IdIdioma")) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdIdioma(id_idiomaFK_IdIdioma);

				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {

					finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,finalQueryPaginacion);

					empleadoidiomaLogic.getEmpleadoIdiomasFK_IdIdioma(finalQueryGlobal,pagination,id_idiomaFK_IdIdioma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdIdioma(id_idiomaFK_IdIdioma);

				
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdIdioma(id_idiomaFK_IdIdioma);

				
				}
				//ARCHITECTURE

				Boolean isNoExiste=false;
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					isNoExiste=empleadoidiomaLogic.getEmpleadoIdiomas()==null||empleadoidiomaLogic.getEmpleadoIdiomas().size()==0;
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					isNoExiste=empleadoidiomas==null|| empleadoidiomas.size()==0;
				}
				//ARCHITECTURE

		if(false && sTipoArchivoReporte!=""&&sTipoArchivoReporte!=null) {//this.isTipoArchivoReporte
			if(false) {//isMostrarTodosResultadosReporte
				this.pagination.setiFirstResult(-1);
				this.pagination.setiMaxResults(-1);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomasAux=new ArrayList<EmpleadoIdioma>();
						empleadoidiomasAux.addAll(empleadoidiomaLogic.getEmpleadoIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoidiomasAux=new ArrayList<EmpleadoIdioma>();
							empleadoidiomasAux.addAll(empleadoidiomas);
				}
				//ARCHITECTURE
								
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
							finalQueryGlobal=Funciones.GetFinalQueryAppendBusqueda(finalQueryGlobal, this.sFinalQueryGeneral,"");
							empleadoidiomaLogic.getEmpleadoIdiomasFK_IdIdioma(finalQueryGlobal,pagination,id_idiomaFK_IdIdioma);
				} else if(Constantes.ISUSAEJBREMOTE) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdIdioma(id_idiomaFK_IdIdioma);
						
				} else if(Constantes.ISUSAEJBHOME) {
				this.sDetalleReporte=EmpleadoIdiomaConstantesFunciones.getDetalleIndiceFK_IdIdioma(id_idiomaFK_IdIdioma);
						
				}
				//ARCHITECTURE
					}
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					generarReporteEmpleadoIdiomas("FK_IdIdioma",empleadoidiomaLogic.getEmpleadoIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					generarReporteEmpleadoIdiomas("FK_IdIdioma",empleadoidiomas);
				}
				//ARCHITECTURE

					if(false) {//isMostrarTodosResultadosReporte
						this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
						this.pagination.setiMaxResults(this.iNumeroPaginacion);

						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomaLogic.setEmpleadoIdiomas(new ArrayList<EmpleadoIdioma>());
						empleadoidiomaLogic.getEmpleadoIdiomas().addAll(empleadoidiomasAux);
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoidiomas=new ArrayList<EmpleadoIdioma>();
							empleadoidiomas.addAll(empleadoidiomasAux);
						}
						//ARCHITECTURE
					}
				}

			} 
		
		
		
		this.redimensionarTablaDatos();
		//this.refrescarForeignKeysDescripcionesEmpleadoIdioma();
		
		
		if(this.conTotales) {
			this.crearFilaTotales();
		}		
		} catch (JRException e) {
			throw e;
		} catch(Exception e) {
			throw e;
      	} finally {
      		//this.finishProcessEmpleadoIdioma();
      	}
		
	}				
	
	public void redimensionarTablaDatos() throws Exception {
		int iSizeTabla=0;
				
		iSizeTabla=this.getSizeTablaDatos();
		
		//ARCHITECTURE
		/*
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoidiomaLogic.getEmpleadoIdiomas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoidiomas.size();
		}
		*/
		//ARCHITECTURE
											
		this.redimensionarTablaDatos(iSizeTabla);		
	}
	
	public Integer getSizeTablaDatos() throws Exception {
		Integer iSizeTabla=0;
				
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {	
			iSizeTabla=empleadoidiomaLogic.getEmpleadoIdiomas().size();
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			iSizeTabla=empleadoidiomas.size();
		}
		//ARCHITECTURE
											
		return iSizeTabla;		
	}
	
			
	public Boolean permiteMantenimiento(EmpleadoIdioma empleadoidioma) {
		Boolean permite=true;
		
		if(this.empleadoidioma.getsType().equals(Constantes2.S_TOTALES)) {
			permite=false;
		}
		
		return permite;
	}
	
	public void traerValoresTablaTotales() throws Exception {
	}
	
	
	public void traerValoresTablaOrderBy() throws Exception {
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.arrOrderBy=EmpleadoIdiomaConstantesFunciones.getOrderByListaEmpleadoIdioma();							
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			this.arrOrderBy=EmpleadoIdiomaConstantesFunciones.getOrderByListaEmpleadoIdioma();
		}		
	}
	
	
	public Boolean existeFilaTotales() throws Exception {
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoIdioma empleadoidioma:empleadoidiomaLogic.getEmpleadoIdiomas()) {
				if(empleadoidioma.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoidiomaTotales=empleadoidioma;
					existe=true;
					break;
				}
			}
								
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoIdioma empleadoidioma:this.empleadoidiomas) {
				if(empleadoidioma.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoidiomaTotales=empleadoidioma;
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
			this.empleadoidiomaAux=new EmpleadoIdioma();
			this.empleadoidiomaAux.setsType(Constantes2.S_TOTALES);
			this.empleadoidiomaAux.setIsNew(false);
			this.empleadoidiomaAux.setIsChanged(false);
			this.empleadoidiomaAux.setIsDeleted(false);
				
			if(Constantes.ISUSAEJBLOGICLAYER) {
				EmpleadoIdiomaConstantesFunciones.TotalizarValoresFilaEmpleadoIdioma(this.empleadoidiomaLogic.getEmpleadoIdiomas(),this.empleadoidiomaAux);
				
				this.empleadoidiomaLogic.getEmpleadoIdiomas().add(this.empleadoidiomaAux);
				
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
				EmpleadoIdiomaConstantesFunciones.TotalizarValoresFilaEmpleadoIdioma(this.empleadoidiomas,this.empleadoidiomaAux);
				
				this.empleadoidiomas.add(this.empleadoidiomaAux);
			}
		}
	}
	
	public void quitarFilaTotales() throws Exception {
		empleadoidiomaTotales=new EmpleadoIdioma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoidiomaLogic.getEmpleadoIdiomas().remove(empleadoidiomaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			existe=this.existeFilaTotales();
			
			if(existe) {
				this.empleadoidiomas.remove(empleadoidiomaTotales);
			}
		}
	}
	
	public void actualizarFilaTotales() throws Exception {
		empleadoidiomaTotales=new EmpleadoIdioma();
		Boolean existe=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			for(EmpleadoIdioma empleadoidioma:empleadoidiomaLogic.getEmpleadoIdiomas()) {
				if(empleadoidioma.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoidiomaTotales=empleadoidioma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoIdiomaConstantesFunciones.TotalizarValoresFilaEmpleadoIdioma(this.empleadoidiomaLogic.getEmpleadoIdiomas(),empleadoidiomaTotales);
			}			
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			for(EmpleadoIdioma empleadoidioma:this.empleadoidiomas) {
				if(empleadoidioma.getsType().equals(Constantes2.S_TOTALES)) {
					empleadoidiomaTotales=empleadoidioma;
					existe=true;
					break;
				}
			}
			
			if(existe) {
				EmpleadoIdiomaConstantesFunciones.TotalizarValoresFilaEmpleadoIdioma(this.empleadoidiomas,empleadoidiomaTotales);
			}
		}
	}		
	
	public void recargarInformacion()throws Exception {
		try {
			sAccionBusqueda="Todos";
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda(sAccionBusqueda);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}	
	}		
	
	
	public void getEmpleadoIdiomasFK_IdEmpleado()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpleado";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoIdiomasFK_IdEmpresa()throws Exception {
		try {
			sAccionBusqueda="FK_IdEmpresa";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	public void getEmpleadoIdiomasFK_IdIdioma()throws Exception {
		try {
			sAccionBusqueda="FK_IdIdioma";
			this.iNumeroPaginacionPagina=0;
			this.procesarBusqueda(sAccionBusqueda);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
	}

	
	
	public void getEmpleadoIdiomasFK_IdEmpleado(String sFinalQuery,Long id_empleado)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoidiomaLogic.getEmpleadoIdiomasFK_IdEmpleado(sFinalQuery,this.pagination,id_empleado);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoIdiomasFK_IdEmpresa(String sFinalQuery,Long id_empresa)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoidiomaLogic.getEmpleadoIdiomasFK_IdEmpresa(sFinalQuery,this.pagination,id_empresa);
				
				} else if(Constantes.ISUSAEJBREMOTE) {
				
				} else if(Constantes.ISUSAEJBHOME) {
				
				}
				//ARCHITECTURE
		} catch(Exception e) {
			throw e;
		}
	}

	public void getEmpleadoIdiomasFK_IdIdioma(String sFinalQuery,Long id_idioma)throws Exception {
		try {
			
			this.pagination=new Pagination();
			this.pagination.setiFirstResult(this.iNumeroPaginacionPagina);
			this.pagination.setiMaxResults(this.iNumeroPaginacion);

				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoidiomaLogic.getEmpleadoIdiomasFK_IdIdioma(sFinalQuery,this.pagination,id_idioma);
				
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
	
	public void inicializarPermisosEmpleadoIdioma() {
		this.isPermisoTodoEmpleadoIdioma=false;
		this.isPermisoNuevoEmpleadoIdioma=false;
		this.isPermisoActualizarEmpleadoIdioma=false;
		this.isPermisoActualizarOriginalEmpleadoIdioma=false;
		this.isPermisoEliminarEmpleadoIdioma=false;
		this.isPermisoGuardarCambiosEmpleadoIdioma=false;
		this.isPermisoConsultaEmpleadoIdioma=false;
		this.isPermisoBusquedaEmpleadoIdioma=false;
		this.isPermisoReporteEmpleadoIdioma=false;		
		this.isPermisoOrdenEmpleadoIdioma=false;		
		this.isPermisoPaginacionMedioEmpleadoIdioma=false;		
		this.isPermisoPaginacionAltoEmpleadoIdioma=false;
		this.isPermisoPaginacionTodoEmpleadoIdioma=false;
		this.isPermisoCopiarEmpleadoIdioma=false;		
		this.isPermisoVerFormEmpleadoIdioma=false;		
		this.isPermisoDuplicarEmpleadoIdioma=false;		
		this.isPermisoOrdenEmpleadoIdioma=false;		
	}
	
	public void setPermisosUsuarioEmpleadoIdioma(Boolean isPermiso) {
		this.isPermisoTodoEmpleadoIdioma=isPermiso;
		this.isPermisoNuevoEmpleadoIdioma=isPermiso;
		this.isPermisoActualizarEmpleadoIdioma=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoIdioma=isPermiso;
		this.isPermisoEliminarEmpleadoIdioma=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoIdioma=isPermiso;
		this.isPermisoConsultaEmpleadoIdioma=isPermiso;
		this.isPermisoBusquedaEmpleadoIdioma=isPermiso;
		this.isPermisoReporteEmpleadoIdioma=isPermiso;
		this.isPermisoOrdenEmpleadoIdioma=isPermiso;		
		this.isPermisoPaginacionMedioEmpleadoIdioma=isPermiso;		
		this.isPermisoPaginacionAltoEmpleadoIdioma=isPermiso;		
		this.isPermisoPaginacionTodoEmpleadoIdioma=isPermiso;		
		this.isPermisoCopiarEmpleadoIdioma=isPermiso;		
		this.isPermisoVerFormEmpleadoIdioma=isPermiso;		
		this.isPermisoDuplicarEmpleadoIdioma=isPermiso;
		this.isPermisoOrdenEmpleadoIdioma=isPermiso;
	}
	
	public void setPermisosMantenimientoUsuarioEmpleadoIdioma(Boolean isPermiso) {
		//this.isPermisoTodoEmpleadoIdioma=isPermiso;
		this.isPermisoNuevoEmpleadoIdioma=isPermiso;
		this.isPermisoActualizarEmpleadoIdioma=isPermiso;
		this.isPermisoActualizarOriginalEmpleadoIdioma=isPermiso;
		this.isPermisoEliminarEmpleadoIdioma=isPermiso;
		this.isPermisoGuardarCambiosEmpleadoIdioma=isPermiso;
		//this.isPermisoConsultaEmpleadoIdioma=isPermiso;
		//this.isPermisoBusquedaEmpleadoIdioma=isPermiso;
		//this.isPermisoReporteEmpleadoIdioma=isPermiso;
		//this.isPermisoOrdenEmpleadoIdioma=isPermiso;		
		//this.isPermisoPaginacionMedioEmpleadoIdioma=isPermiso;		
		//this.isPermisoPaginacionAltoEmpleadoIdioma=isPermiso;		
		//this.isPermisoPaginacionTodoEmpleadoIdioma=isPermiso;		
		//this.isPermisoCopiarEmpleadoIdioma=isPermiso;		
		//this.isPermisoDuplicarEmpleadoIdioma=isPermiso;
		//this.isPermisoOrdenEmpleadoIdioma=isPermiso;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoIdiomaClasesRelacionadas() throws Exception {
		ArrayList<String> arrPaginas=new ArrayList<String>();		
		ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
		
		
		if(EmpleadoIdiomaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public Boolean tienePermisosUsuarioEnPaginaWebEmpleadoIdioma(String sPagina) throws Exception {
		Boolean tienePermisos=false;
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			tienePermisos=sistemaLogicAdditional.tienePermisosEnPaginaWeb(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, sPagina);
		} else if(Constantes.ISUSAEJBREMOTE) {
		} else if(Constantes.ISUSAEJBHOME) {
		}
		
		return tienePermisos;
	}
	
	public void inicializarSetPermisosUsuarioEmpleadoIdiomaClasesRelacionadas(Boolean conPermiso) throws Exception {
		
	}
	
	public Boolean verificarGetPermisosUsuarioEmpleadoIdiomaClaseRelacionada(ArrayList<String> arrPaginasFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioClaseRelacionada(arrPaginasFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public Boolean verificarGetPermisosUsuarioOpcionEmpleadoIdiomaClaseRelacionada(List<Opcion> opcionsFinal,String sPaginaActual) throws Exception {
		Boolean verificado=false;
		
		verificado=Funciones2.verificarGetPermisosUsuarioOpcionClaseRelacionada(opcionsFinal,sPaginaActual);				
		
		return verificado;
	}
	
	public void actualizarTabsSetPermisosUsuarioEmpleadoIdiomaClasesRelacionadas() throws Exception {
		
	}
	
	public void setPermisosUsuarioEmpleadoIdioma() throws Exception {
		
		PerfilOpcion perfilOpcionUsuario=new PerfilOpcion();		
		Long idOpcion=this.opcionActual.getId();
		
		if(EmpleadoIdiomaJInternalFrame.CON_LLAMADA_SIMPLE) {
			perfilOpcionUsuario=this.sistemaReturnGeneral.getPerfilOpcion();
			
		} else {
			if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
				idOpcion=0L;
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				perfilOpcionUsuario=sistemaLogicAdditional.traerPermisosPaginaWebPerfilOpcion(this.usuarioActual, Constantes.LIDSISTEMAACTUAL, EmpleadoIdiomaConstantesFunciones.SNOMBREOPCION,idOpcion);				
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}
		}
		
		if(perfilOpcionUsuario!=null && perfilOpcionUsuario.getId()>0) {
			this.isPermisoNuevoEmpleadoIdioma=perfilOpcionUsuario.getingreso()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarEmpleadoIdioma=perfilOpcionUsuario.getmodificacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoActualizarOriginalEmpleadoIdioma=this.isPermisoActualizarEmpleadoIdioma;
			this.isPermisoEliminarEmpleadoIdioma=perfilOpcionUsuario.geteliminacion()||perfilOpcionUsuario.gettodo();
			this.isPermisoGuardarCambiosEmpleadoIdioma=perfilOpcionUsuario.getguardar_cambios()||perfilOpcionUsuario.gettodo();
			this.isPermisoConsultaEmpleadoIdioma=perfilOpcionUsuario.getconsulta()||perfilOpcionUsuario.gettodo();
			this.isPermisoBusquedaEmpleadoIdioma=perfilOpcionUsuario.getbusqueda()||perfilOpcionUsuario.gettodo();
			this.isPermisoTodoEmpleadoIdioma=perfilOpcionUsuario.gettodo()||perfilOpcionUsuario.gettodo();
			this.isPermisoReporteEmpleadoIdioma=perfilOpcionUsuario.getreporte()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoIdioma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionMedioEmpleadoIdioma=perfilOpcionUsuario.getpaginacion_medio()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionAltoEmpleadoIdioma=perfilOpcionUsuario.getpaginacion_alto()||perfilOpcionUsuario.gettodo();
			this.isPermisoPaginacionTodoEmpleadoIdioma=perfilOpcionUsuario.getpaginacion_todo()||perfilOpcionUsuario.gettodo();
			this.isPermisoCopiarEmpleadoIdioma=perfilOpcionUsuario.getcopiar()||perfilOpcionUsuario.gettodo();
			this.isPermisoVerFormEmpleadoIdioma=true;//perfilOpcionUsuario.getver_form()||perfilOpcionUsuario.gettodo();
			this.isPermisoDuplicarEmpleadoIdioma=perfilOpcionUsuario.getduplicar()||perfilOpcionUsuario.gettodo();
			this.isPermisoOrdenEmpleadoIdioma=perfilOpcionUsuario.getorden()||perfilOpcionUsuario.gettodo();
			
			if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
				this.opcionActual.setId(perfilOpcionUsuario.getid_opcion());
				
				this.jTableDatosEmpleadoIdioma.setToolTipText(this.jTableDatosEmpleadoIdioma.getToolTipText()+"_"+perfilOpcionUsuario.getid_opcion());		
			}
		} else {
			this.setPermisosUsuarioEmpleadoIdioma(false);
		}
		
		//SI SE NECESITA PONER TODOS LOS PERMISOS POR DEFECTO
		//
		
	}
	
	public void setAccionesUsuarioEmpleadoIdioma(Boolean esParaAccionesFormulario) throws Exception {		
		Reporte reporte=null;
		
		if(!esParaAccionesFormulario) {
			this.accions=new ArrayList<Accion>();
			
			if(EmpleadoIdiomaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
			
			if(EmpleadoIdiomaJInternalFrame.CON_LLAMADA_SIMPLE) {
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
	
	public void setRelacionesUsuarioEmpleadoIdioma() throws Exception {
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
	public void inicializarCombosForeignKeyEmpleadoIdiomaListas()throws Exception {
		try	{						
			
				this.empresasForeignKey=new ArrayList();
				this.empleadosForeignKey=new ArrayList();
				this.idiomasForeignKey=new ArrayList();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void cargarCombosTodosForeignKeyEmpleadoIdiomaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			String sFinalQueryCombo="";
			
			Modulo  moduloActualAux=new Modulo();
			
			if(EmpleadoIdiomaJInternalFrame.ISLOAD_FKLOTE) {
				this.cargarCombosLoteForeignKeyEmpleadoIdiomaListas(false);
			} else {
			
				this.cargarCombosForeignKeyEmpresaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyEmpleadoListas(cargarCombosDependencia,sFinalQueryCombo);
				this.cargarCombosForeignKeyIdiomaListas(cargarCombosDependencia,sFinalQueryCombo);
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

	public void cargarCombosForeignKeyIdiomaListas(Boolean cargarCombosDependencia,String sFinalQuery)throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();

			String  finalQueryGlobal="";

			Modulo  moduloActualAux=new Modulo();

			if((this.idiomasForeignKey==null||this.idiomasForeignKey.size()<=0)) {
				this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
				this.arrDatoGeneralNo= new  ArrayList<String>();

				arrColumnasGlobales=IdiomaConstantesFunciones.getArrayColumnasGlobalesIdioma(this.arrDatoGeneral,this.arrDatoGeneralNo);
				finalQueryGlobal=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,IdiomaConstantesFunciones.TABLENAME);

				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, sFinalQuery);
				finalQueryGlobal=Funciones.GetFinalQueryAppend(finalQueryGlobal, "");

				finalQueryGlobal+=IdiomaConstantesFunciones.SFINALQUERY;

				this.cargarCombosIdiomasForeignKeyLista(finalQueryGlobal);
			}

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void cargarCombosLoteForeignKeyEmpleadoIdiomaListas(Boolean cargarCombosDependencia)throws Exception {
		try	{
			
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			Modulo  moduloActualAux=new Modulo();
			
			
			EmpleadoIdiomaParameterReturnGeneral empleadoidiomaReturnGeneral=new EmpleadoIdiomaParameterReturnGeneral();
						
			


				String finalQueryGlobalEmpresa="";

				if(((this.empresasForeignKey==null||this.empresasForeignKey.size()<=0) && this.empleadoidiomaConstantesFunciones.cargarid_empresaEmpleadoIdioma)
					 || (this.esRecargarFks && this.empleadoidiomaConstantesFunciones.cargarid_empresaEmpleadoIdioma)) {

					if(!this.empleadoidiomaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpresaConstantesFunciones.getArrayColumnasGlobalesEmpresa(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpresa=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpresaConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpresa=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpresa, "");
						finalQueryGlobalEmpresa+=EmpresaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpresasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpresa=" WHERE " + ConstantesSql.ID + "="+empleadoidiomaSessionBean.getlidEmpresaActual();
					}
				} else {
					finalQueryGlobalEmpresa="NONE";
				}


				String finalQueryGlobalEmpleado="";

				if(((this.empleadosForeignKey==null||this.empleadosForeignKey.size()<=0) && this.empleadoidiomaConstantesFunciones.cargarid_empleadoEmpleadoIdioma)
					 || (this.esRecargarFks && this.empleadoidiomaConstantesFunciones.cargarid_empleadoEmpleadoIdioma)) {

					if(!this.empleadoidiomaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=EmpleadoConstantesFunciones.getArrayColumnasGlobalesEmpleado(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalEmpleado=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,EmpleadoConstantesFunciones.TABLENAME);

						finalQueryGlobalEmpleado=Funciones.GetFinalQueryAppend(finalQueryGlobalEmpleado, "");
						finalQueryGlobalEmpleado+=EmpleadoConstantesFunciones.SFINALQUERY;

						//this.cargarCombosEmpleadosForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalEmpleado=" WHERE " + ConstantesSql.ID + "="+empleadoidiomaSessionBean.getlidEmpleadoActual();
					}
				} else {
					finalQueryGlobalEmpleado="NONE";
				}


				String finalQueryGlobalIdioma="";

				if(((this.idiomasForeignKey==null||this.idiomasForeignKey.size()<=0) && this.empleadoidiomaConstantesFunciones.cargarid_idiomaEmpleadoIdioma)
					 || (this.esRecargarFks && this.empleadoidiomaConstantesFunciones.cargarid_idiomaEmpleadoIdioma)) {

					if(!this.empleadoidiomaSessionBean.getisBusquedaDesdeForeignKeySesionIdioma()) {

						this.arrDatoGeneral= new  ArrayList<DatoGeneral>();
						this.arrDatoGeneralNo= new  ArrayList<String>();


						arrColumnasGlobales=IdiomaConstantesFunciones.getArrayColumnasGlobalesIdioma(this.arrDatoGeneral,this.arrDatoGeneralNo);
						finalQueryGlobalIdioma=Funciones.GetWhereGlobalConstants(this.parametroGeneralUsuario,this.moduloActual,true,false,arrColumnasGlobales,IdiomaConstantesFunciones.TABLENAME);

						finalQueryGlobalIdioma=Funciones.GetFinalQueryAppend(finalQueryGlobalIdioma, "");
						finalQueryGlobalIdioma+=IdiomaConstantesFunciones.SFINALQUERY;

						//this.cargarCombosIdiomasForeignKeyLista(finalQueryGlobal);
					} else {
						finalQueryGlobalIdioma=" WHERE " + ConstantesSql.ID + "="+empleadoidiomaSessionBean.getlidIdiomaActual();
					}
				} else {
					finalQueryGlobalIdioma="NONE";
				}
			
			//ARCHITECTURE			
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				empleadoidiomaReturnGeneral=empleadoidiomaLogic.cargarCombosLoteForeignKeyEmpleadoIdioma(finalQueryGlobalEmpresa,finalQueryGlobalEmpleado,finalQueryGlobalIdioma);//WithConnection
			} else if(Constantes.ISUSAEJBREMOTE) {
			} else if(Constantes.ISUSAEJBHOME) {
			}			
			//ARCHITECTURE
			
			

			if(!finalQueryGlobalEmpresa.equals("NONE")) {
				this.empresasForeignKey=empleadoidiomaReturnGeneral.getempresasForeignKey();
			}

			if(!finalQueryGlobalEmpleado.equals("NONE")) {
				this.empleadosForeignKey=empleadoidiomaReturnGeneral.getempleadosForeignKey();
			}

			if(!finalQueryGlobalIdioma.equals("NONE")) {
				this.idiomasForeignKey=empleadoidiomaReturnGeneral.getidiomasForeignKey();
			}
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void addItemDefectoCombosTodosForeignKeyEmpleadoIdioma()throws Exception {
		try {
			
			this.addItemDefectoCombosForeignKeyEmpresa();
			this.addItemDefectoCombosForeignKeyEmpleado();
			this.addItemDefectoCombosForeignKeyIdioma();
		} catch(Exception e) {
			throw e;
		}		
	}
	
	



	public void addItemDefectoCombosForeignKeyEmpresa()throws Exception {
		try {
			if(this.empleadoidiomaSessionBean==null) {
				this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
			}

			if(!this.empleadoidiomaSessionBean.getisBusquedaDesdeForeignKeySesionEmpresa()) {
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

			if(!this.empleadoidiomaSessionBean.getisBusquedaDesdeForeignKeySesionEmpleado()) {
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

	public void addItemDefectoCombosForeignKeyIdioma()throws Exception {
		try {

			if(!this.empleadoidiomaSessionBean.getisBusquedaDesdeForeignKeySesionIdioma()) {
				Idioma idioma=new Idioma();
				IdiomaConstantesFunciones.setIdiomaDescripcion(idioma,Constantes.SMENSAJE_ESCOJA_OPCION);
				idioma.setId(null);

				if(!IdiomaConstantesFunciones.ExisteEnLista(this.idiomasForeignKey,idioma,true)) {

					this.idiomasForeignKey.add(0,idioma);
				}
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoIdioma()throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	public void initActionsCombosTodosForeignKeyEmpleadoIdioma(String sFormularioTipoBusqueda)throws Exception {
		try {
			
		} catch(Exception e) {
			throw e;
		}		
	}
	
	


	
	


	
	public void setVariablesGlobalesCombosForeignKeyEmpleadoIdioma()throws Exception {	
		try {
			if(this.parametroGeneralUsuario!=null && this.parametroGeneralUsuario.getId()>0) {
			
				this.setActualEmpresaForeignKey(this.parametroGeneralUsuario.getid_empresa(),false,"Formulario");
			
			
			}
			
			//INICIALIZA VARIABLES COMBOS GLOBALES AUXILIARES A FORMULARIO(Anio,Mes)
			this.setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoIdioma();
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToFormularioForeignKeyEmpleadoIdioma(EmpleadoIdioma empleadoidioma)throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(empleadoidioma.getid_empleado(),false,"Formulario");
			this.setActualIdiomaForeignKey(empleadoidioma.getid_idioma(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesObjetoActualToListasForeignKeyEmpleadoIdioma(EmpleadoIdioma empleadoidioma,String sTipoEvento)throws Exception {	
		try {
			
			

				if(empleadoidioma.getEmpleado()!=null && !sTipoEvento.equals("id_empleadoEmpleadoIdioma")) { //sTipoEvento Evita Bucle Infinito

					this.empleadosForeignKey=new ArrayList<Empleado>();
					this.empleadosForeignKey.add(empleadoidioma.getEmpleado());

					this.addItemDefectoCombosForeignKeyEmpleado();
					this.cargarCombosFrameEmpleadosForeignKey("Todos");
				}
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	/*
	public void setVariablesCombosFromBeanForeignKeyEmpleadoIdioma()throws Exception {	
		try {
			
			this.setActualEmpleadoForeignKey(this.empleadoidiomaConstantesFunciones.getid_empleado(),false,"Formulario");
			this.setActualIdiomaForeignKey(this.empleadoidiomaConstantesFunciones.getid_idioma(),false,"Formulario");			
		} catch(Exception e) {
			throw e;
		}
	}
	*/
	
	public void setVariablesGlobalesAuxiliaresCombosForeignKeyEmpleadoIdioma()throws Exception {	
		try {
			
		
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesDefaultCombosForeignKeyEmpleadoIdioma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void setVariablesParametroCombosForeignKeyEmpleadoIdioma()throws Exception {	
		try {
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	public void cargarCombosParametroEmpleadoIdioma()throws Exception {
		try	{
			ArrayList<String> arrColumnasGlobales=new ArrayList<String>();
			String  finalQueryGlobal="";
			
			//this.cargarDatosCliente();
			
			
			
		} catch(Exception e) {
			throw e;
		}		
	}
		
	public void cargarCombosFrameForeignKeyEmpleadoIdioma()throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey("Todos");
			this.cargarCombosFrameEmpleadosForeignKey("Todos");
			this.cargarCombosFrameIdiomasForeignKey("Todos");

		} catch(Exception e) {
			throw e;
		}		
	}		
	
	public void cargarCombosFrameForeignKeyEmpleadoIdioma(String sFormularioTipoBusqueda)throws Exception {
		try {
			

			this.cargarCombosFrameEmpresasForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameEmpleadosForeignKey(sFormularioTipoBusqueda);
			this.cargarCombosFrameIdiomasForeignKey(sFormularioTipoBusqueda);

		} catch(Exception e) {
			throw e;
		}		
	}	
	
	public void setItemDefectoCombosForeignKeyEmpleadoIdioma()throws Exception {
		try {
			



			if(this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.setSelectedIndex(0);
			}

			if(this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.getItemCount()>0) {
				this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.setSelectedIndex(0);
			}
		} catch(Exception e) {
			throw e;
		}		
	}		
	
	






	
	

	public EmpleadoIdiomaBeanSwingJInternalFrame() throws Exception {
		super(false,PaginaTipo.PRINCIPAL);
	}
	
	public EmpleadoIdiomaBeanSwingJInternalFrame(Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
	}
	
	public EmpleadoIdiomaBeanSwingJInternalFrame(Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,PaginaTipo paginaTipo) throws Exception {
		super(cargarRelaciones,paginaTipo);
		
		this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean(); 
		this.empleadoidiomaConstantesFunciones=new EmpleadoIdiomaConstantesFunciones(); 
		this.empleadoidiomaBean=new EmpleadoIdioma();//(this.empleadoidiomaConstantesFunciones); 		
		this.empleadoidiomaReturnGeneral=new EmpleadoIdiomaParameterReturnGeneral(); 
		
		this.empleadoidiomaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
		this.empleadoidiomaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
				
	}
	
	public EmpleadoIdiomaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,cargarTodosDatos);
	}
		
	public EmpleadoIdiomaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,Boolean cargarRelaciones,Boolean cargarTodosDatos,PaginaTipo paginaTipo) throws Exception {
		this(blncargarCombostrForeignKey,blnCargarInformacionInicial,jdesktopPane,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo,false,false,cargarRelaciones,cargarTodosDatos);
	}	
	
	public EmpleadoIdiomaBeanSwingJInternalFrame(Boolean blncargarCombostrForeignKey,Boolean blnCargarInformacionInicial,JDesktopPane jdesktopPane,Usuario usuarioActual,ResumenUsuario resumenUsuarioActual,Modulo moduloActual,Opcion opcionActual,ParametroGeneralSg parametroGeneralSg,ParametroGeneralUsuario parametroGeneralUsuario,PaginaTipo paginaTipo,Boolean conGuardarRelaciones,Boolean esGuardarRelacionado,Boolean cargarRelaciones,Boolean cargarTodosDatos) throws Exception //Boolean esParaBusquedaForeignKey
    {
		super(jdesktopPane,conGuardarRelaciones,esGuardarRelacionado,cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		try {
			
			this.permiteRecargarForm=false;
			
			this.startProcessEmpleadoIdioma(true);
			
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
			
			this.empleadoidiomaConstantesFunciones=new EmpleadoIdiomaConstantesFunciones(); 
			this.empleadoidiomaBean=new EmpleadoIdioma();//this.empleadoidiomaConstantesFunciones); 			
			this.empleadoidiomaReturnGeneral=new EmpleadoIdiomaParameterReturnGeneral(); 
		
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.CargaInicialInicio(this, "NORMAL", null);
			
			this.setTitle(Funciones.GetTituloSistema(this.parametroGeneralSg,this.moduloActual,this.usuarioActual,"Empleado Idioma Mantenimiento",paginaTipo));			
			
			this.conTotales=false;
			
			this.conTotales=true;
			
			
			this.empleadoidioma=new EmpleadoIdioma();
			this.empleadoidiomas = new ArrayList<EmpleadoIdioma>();
			this.empleadoidiomasAux = new ArrayList<EmpleadoIdioma>();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic=new EmpleadoIdiomaLogic();
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}
			
			//this.empleadoidiomaSessionBean.setConGuardarRelaciones(conGuardarRelaciones);
			//this.empleadoidiomaSessionBean.setEsGuardarRelacionado(esGuardarRelacionado);
			
			this.jDesktopPane=jdesktopPane;
			
			if(this.jDesktopPane.getClass().equals(JDesktopPaneMe.class)) {
				this.constantes2=((JDesktopPaneMe)this.jDesktopPane).constantes2;
			}
			
			if(!Constantes.CON_VARIAS_VENTANAS) {
    			MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameDetalleFormEmpleadoIdioma);
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameReporteDinamicoEmpleadoIdioma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoIdioma);	
					}
					
					if(this.jInternalFrameImportacionEmpleadoIdioma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoIdioma);							
					}
					
				}
				
				
				if(!this.conCargarMinimo) {
					
					if(this.jInternalFrameOrderByEmpleadoIdioma!=null) {
						MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameOrderByEmpleadoIdioma);					
					}
					
				}
			}
			
			//DETALLE DATOS
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //this.conCargarFormDetalle) {
				this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoIdioma);
				this.jInternalFrameDetalleFormEmpleadoIdioma.setVisible(false);
				this.jInternalFrameDetalleFormEmpleadoIdioma.setSelected(false);						
			}
			
			if(!this.conCargarMinimo) {
				
				//REPORTE DINAMICO
				if(this.jInternalFrameReporteDinamicoEmpleadoIdioma!=null) {
					this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoIdioma);
					this.jInternalFrameReporteDinamicoEmpleadoIdioma.setVisible(false);
					this.jInternalFrameReporteDinamicoEmpleadoIdioma.setSelected(false);
				}
				
				//IMPORTACION
				if(this.jInternalFrameImportacionEmpleadoIdioma!=null) {
					this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoIdioma);
					this.jInternalFrameImportacionEmpleadoIdioma.setVisible(false);
					this.jInternalFrameImportacionEmpleadoIdioma.setSelected(false);
				}
				
				
			}
			
			
			if(!this.conCargarMinimo) {
				
				if(this.jInternalFrameOrderByEmpleadoIdioma!=null) {
					this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoIdioma);
					this.jInternalFrameOrderByEmpleadoIdioma.setVisible(false);
					this.jInternalFrameOrderByEmpleadoIdioma.setSelected(false);				
				}
				
			}
			
			
			//this.esParaBusquedaForeignKey=false;
			this.esParaBusquedaForeignKey=esParaBusquedaForeignKey;
			
			this.invalidValues=new InvalidValue[0];
			
			
			
			this.idEmpleadoIdiomaActual=0L;
			this.rowIndexActual=0;
			
			
			this.iNumeroPaginacionPagina=0;
			this.iNumeroPaginacion=EmpleadoIdiomaConstantesFunciones.INUMEROPAGINACION;
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
			
			this.empleadoidiomaReturnGeneral=new EmpleadoIdiomaParameterReturnGeneral();
			
			this.empleadoidiomaParameterGeneral=new EmpleadoIdiomaParameterReturnGeneral();
			
			
			
			this.sistemaLogicAdditional=new SistemaLogicAdditional();
			
			this.sistemaLogicAdditional.setConnexion(this.empleadoidiomaLogic.getConnexion());			
			
			
			
			
			
			
			
			//VERIFICAR GLOBAL
			this.cargarDatosCliente();			
			
			
			if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
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
			
			if(EmpleadoIdiomaJInternalFrame.CON_LLAMADA_SIMPLE) {
				if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
					this.opcionActual.setId(0L);
					
					//idOpcion=0L;					
				}
				
				ArrayList<String> arrPaginas=new ArrayList<String>();		
				ArrayList<Opcion> opcionsFinal=new ArrayList<Opcion>();	
				
		
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					//this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActualWithConnection(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoIdiomaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoidiomaSessionBean.getEsGuardarRelacionado(),this.empleadoidiomaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
					this.sistemaReturnGeneral=sistemaLogicAdditional.validarCargarSesionUsuarioActual(this.usuarioActual,this.datosCliente,this.resumenUsuarioActual,Constantes.LIDSISTEMAACTUAL,EmpleadoIdiomaConstantesFunciones.SNOMBREOPCION,this.opcionActual,this.empleadoidiomaSessionBean.getEsGuardarRelacionado(),this.empleadoidiomaSessionBean.getConGuardarRelaciones(),arrPaginas);
					
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
			
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=false;
			this.isVisibilidadCeldaDuplicarEmpleadoIdioma=true;
			this.isVisibilidadCeldaCopiarEmpleadoIdioma=true;
			this.isVisibilidadCeldaVerFormEmpleadoIdioma=true;
			this.isVisibilidadCeldaOrdenEmpleadoIdioma=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=false;
			this.isVisibilidadCeldaModificarEmpleadoIdioma=false;
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=false;
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=false;
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=false;
			this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=false;
			
			
			this.isVisibilidadFK_IdEmpleado=true;
			this.isVisibilidadFK_IdEmpresa=true;
			this.isVisibilidadFK_IdIdioma=true;
			
			//ELEMENTOS TABLAS PARAMETOS
			
			
			
			//ELEMENTOS TABLAS PARAMETOS_FIN
			
			//this.actualizarEstadoCeldasBotonesEmpleadoIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
						
			
			
			this.inicializarPermisosEmpleadoIdioma();
			
			//INICIALIZAR FALSE, TALVEZ COMENTAR
			this.setPermisosUsuarioEmpleadoIdioma(false);
			
			this.setPermisosUsuarioEmpleadoIdioma();
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado() 
				|| (this.empleadoidiomaSessionBean.getEsGuardarRelacionado() && this.empleadoidiomaSessionBean.getConGuardarRelaciones())) {
				
				this.inicializarSetPermisosUsuarioEmpleadoIdiomaClasesRelacionadas();
			}
			
			if(this.empleadoidiomaSessionBean.getConGuardarRelaciones()) {
				this.actualizarTabsSetPermisosUsuarioEmpleadoIdiomaClasesRelacionadas();
			}
			
			
			
			//SOLO SE EJECUTA LA PRIMERA VEZ, BINDINGS SI FUNCIONA
			if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingBotonesPermisosEmpleadoIdioma();
			} else {
				this.inicializarActualizarBindingBotonesPermisosManualEmpleadoIdioma();
			}
			
			if(!this.isPermisoBusquedaEmpleadoIdioma) {
				//BYDAN_BUSQUEDAS
				
				this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(false);				
				
			}
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {				
				this.tiposArchivosReportes=Funciones.getListTiposArchivosReportes();
				this.tiposArchivosReportesDinamico=Funciones.getListTiposArchivosReportes();
				this.tiposReportes=Funciones.getListTiposReportes(false);
				this.tiposReportesDinamico=Funciones.getListTiposReportesDinamico(false);
				
				
				
				this.tiposGraficosReportes=Funciones2.getListTiposGraficosReportes();
				this.tiposPaginacion=Funciones2.getListTiposPaginacion(this.isPermisoPaginacionMedioEmpleadoIdioma,this.isPermisoPaginacionMedioEmpleadoIdioma,this.isPermisoPaginacionTodoEmpleadoIdioma);
				this.tiposSeleccionar=Funciones2.getListTiposSeleccionar();
				this.tiposSeleccionar.addAll(EmpleadoIdiomaConstantesFunciones.getTiposSeleccionarEmpleadoIdioma());
				
				this.tiposColumnasSelect=EmpleadoIdiomaConstantesFunciones.getTiposSeleccionarEmpleadoIdioma(true);
				
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
			//if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
				//SE ENCUENTRA MAS ADELANTE CON ACCIONES POR USUARIO
				//ACCIONES GENERALES Y POR USUARIO
				this.tiposRelaciones=Funciones2.getListTiposRelaciones();
				this.setRelacionesUsuarioEmpleadoIdioma();
				
				this.tiposAcciones=Funciones2.getListTiposAcciones(false,false,true);
				this.setAccionesUsuarioEmpleadoIdioma(false);	
				
				this.tiposAccionesFormulario=Funciones2.getListTiposAccionesFormulario(false,false,true);							
				this.setAccionesUsuarioEmpleadoIdioma(true);	
				
				this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoIdioma() ;
			
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
			this.idiomaLogic=new IdiomaLogic();
			
			//PARAMETROS
			
			
			/*
			if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {		
				hashtableEnv =  Funciones.getHashtableEnv();		
				initialContext = new InitialContext(hashtableEnv);	
			}
			*/
			/*
			if(Constantes.ISUSAEJBREMOTE) {
				empleadoidiomaImplementable= (EmpleadoIdiomaImplementable) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoIdiomaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBREMOTE);
			} else if(Constantes.ISUSAEJBHOME) {
				empleadoidiomaImplementableHome= (EmpleadoIdiomaImplementableHome) initialContext.lookup(Constantes.SEJBPACKAGE+Constantes.SEJBSEPARATOR+EmpleadoIdiomaConstantesFunciones.SEJBNAME+Constantes.SEJBSEPARATOR+Constantes.SEJBLOCAL);
			}			
			*/
			
			
			this.empleadoidiomas= new ArrayList<EmpleadoIdioma>();
			this.empleadoidiomasEliminados= new ArrayList<EmpleadoIdioma>();
						
			this.isEsNuevoEmpleadoIdioma=false;
			this.esParaAccionDesdeFormularioEmpleadoIdioma=false;
			this.isEsMantenimientoRelacionesRelacionadoUnico=false;
			this.isEsMantenimientoRelaciones=false;
			this.isEsMantenimientoRelacionado=false;
			this.isContieneImagenes=false;
			
			
			
			
			//BUSQUEDA INTERNA FK
			this.idEmpleadoActual=0L;
			
			//INICIALIZAR LISTAS FK
			
			this.empresasForeignKey=new ArrayList<Empresa>() ;
			this.empleadosForeignKey=new ArrayList<Empleado>() ;
			this.idiomasForeignKey=new ArrayList<Idioma>() ;
			
			
			
			
			if(blncargarCombostrForeignKey) {
				this.cargarCombosForeignKeyEmpleadoIdioma(this.isCargarCombosDependencia);
			}
			
			this.cargarCombosParametroEmpleadoIdioma();
			
			
			
			
			
			//FUNCIONALIDAD_RELACIONADO
			if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
				this.onLoad();
			}
						
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.RecargarVentanaSegunOpcion(this,opcionActual);
			
			/*
			if(blnCargarInformacionInicial) {
				this.recargarInformacion();
			}
			*/
			//this.iNumeroPaginacionPagina=0;
			//this.iNumeroPaginacion=EmpleadoIdiomaConstantesFunciones.INUMEROPAGINACION;
			
			this.actualizarEstadoCeldasBotonesEmpleadoIdioma("n", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			//SOLO LA PRIMERA VEZ HACE LOS BINDINGS, SOLO AHI FUNCIONA
			this.inicializarActualizarBindingEmpleadoIdioma(true); 
			
			//SE REDIMENSIONA SINO NO SE ACTUALIZA
			this.redimensionarTablaDatos();
			
			
			this.initActions();
			
			;
						
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {//if(this.conCargarFormDetalle) {
				this.cargarMenuRelaciones();
			}
			
			//OBLIGA CARGAR DETALLE, MEJOR DESHABILITAR, FALTA TALVEZ PONER EN SELECCIONAR
			//MAYBE
			//this.updateControlesFormularioEmpleadoIdioma();
			
			if(!this.conCargarMinimo) {
				this.updateBusquedasFormularioEmpleadoIdioma();
			}
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.CargaInicial(this, "NORMAL", null);
			
			
			//SE REALIZA ESTO PARA QUE SE PUEDA RECORRER TAB SIN IMPORTAR ORDEN
			Boolean existeTabBusqueda=false;
			
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				
				for(int i=0; i<this.jTabbedPaneBusquedasEmpleadoIdioma.getTabCount(); i++) {
					this.jTabbedPaneBusquedasEmpleadoIdioma.setSelectedIndex(i);
						
					if(!existeTabBusqueda) {
						existeTabBusqueda=true;
					}
				}
					
				if(existeTabBusqueda) {
					this.jTabbedPaneBusquedasEmpleadoIdioma.setSelectedIndex(0);
				}	
				
				
			}
			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
			
			
			if(Constantes2.ISDEVELOPING2) {
				end_time = System.currentTimeMillis();			
				String sTipo="Load Ventana";
				Funciones2.getMensajeTiempoEjecucion(start_time, end_time, sTipo,false);
			}  
			
			this.finishProcessEmpleadoIdioma(true);
			
			this.dEnd=(double)System.currentTimeMillis();
			
			this.dDif=this.dEnd - this.dStart;
			
			if(Constantes.ISDEVELOPING) {
				System.out.println("Tiempo(ms) Carga EmpleadoIdioma: " + this.dDif); 
			}
			
			this.permiteRecargarForm=true;
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
		}	 
    }
	
	public void cargarTiposRelacionesSelectEmpleadoIdioma() {
		Reporte reporte=new Reporte();
		
	
	}
	
	
	
	public void jTabbedPaneChangeListenerGeneral(String sTipo,ChangeEvent evt) { 	  
		Boolean procesaCargarParteTab=false;
			
		try {
			int iIndex=0;		    			
			String sTitle="";
			
			//TABBED PANE RELACIONES
			if(sTipo.equals("RelacionesEmpleadoIdioma")) {
				iIndex=this.jInternalFrameDetalleFormEmpleadoIdioma.jTabbedPaneRelacionesEmpleadoIdioma.getSelectedIndex();		    
			
				sTitle=this.jInternalFrameDetalleFormEmpleadoIdioma.jTabbedPaneRelacionesEmpleadoIdioma.getTitleAt(iIndex);
				
				Integer intSelectedRow = 0;	
			
				intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();	
				
				
				
			}
			
			//TABBED PANE RELACIONES FIN(EXTRA TAB)
			;
			
  		} catch(Exception e) {
  			e.printStackTrace();
  		} finally {
			if(procesaCargarParteTab) {				
				this.finishProcessEmpleadoIdioma();	
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
	
	public void cargarCombosForeignKeyEmpleadoIdioma(Boolean cargarCombosDependencia) throws Exception {   
		this.cargarCombosForeignKeyEmpleadoIdioma(cargarCombosDependencia,true,true);
	}
	
	//CARGAR COMBOS EN LOTE
	public void cargarCombosForeignKeyEmpleadoIdioma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales) throws Exception {   
		this.cargarCombosTodosForeignKeyEmpleadoIdiomaListas(cargarCombosDependencia);
				
		this.addItemDefectoCombosTodosForeignKeyEmpleadoIdioma();
		
		this.cargarCombosFrameForeignKeyEmpleadoIdioma();						
		
		if(conInitActions) {
			this.initActionsCombosTodosForeignKeyEmpleadoIdioma();
		}
		
		if(conSetVariablesGlobales) {
			this.setVariablesGlobalesCombosForeignKeyEmpleadoIdioma();
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

	public void cargarCombosForeignKeyIdioma(Boolean cargarCombosDependencia,Boolean conInitActions,Boolean conSetVariablesGlobales,String sFinalQueryCombo,String sFormularioTipoBusqueda) throws Exception {
		try {
				this.cargarCombosForeignKeyIdiomaListas(cargarCombosDependencia,sFinalQueryCombo);
				this.addItemDefectoCombosForeignKeyIdioma();
				this.cargarCombosFrameIdiomasForeignKey(sFormularioTipoBusqueda);

				if(conInitActions) {
				}

			this.recargarComboTablaIdioma(this.idiomasForeignKey);

		} catch(Exception e) {
			throw e;
		}
	}
	
	public void jButtonNuevoEmpleadoIdiomaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			EventoGlobalTipo eventoGlobalTipo=EventoGlobalTipo.FORM_RECARGAR;
			String sTipo="NUEVO_NORMAL";
			
			this.estaModoNuevo=true;
			
			if(this.empleadoidiomaSessionBean.getConGuardarRelaciones()) {
				this.dStart=(double)System.currentTimeMillis();
			}
				
			//if(this.esUsoDesdeHijo) {
			//	eventoGlobalTipo=EventoGlobalTipo.FORM_HIJO_ACTUALIZAR;
			//}
											
			if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}			
				
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
			
			if(jTableDatosEmpleadoIdioma.getRowCount()>=1) {
				jTableDatosEmpleadoIdioma.removeRowSelectionInterval(0, jTableDatosEmpleadoIdioma.getRowCount()-1);						
			}
			
			this.isEsNuevoEmpleadoIdioma=true;
			
			//ESTABLECE SI ES RELACIONADO O NO 
			this.habilitarDeshabilitarTipoMantenimientoEmpleadoIdioma(esRelaciones);
			
			this.nuevoPreparar(false); 
			this.habilitarDeshabilitarControlesEmpleadoIdioma(true);			
			//this.empleadoidioma=new EmpleadoIdioma();
			//this.empleadoidioma.setIsChanged(true);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoIdioma(false) ;						
			 
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoIdioma() ;
			
			if(EmpleadoIdiomaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoIdioma(esRelaciones);
			}
					
			//Se Duplica, sin sentido
			//this.actualizarInformacion("EVENTO_NUEVO",false,this.empleadoidioma);	
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);				
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.NEW,"FORM",this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
			if(this.empleadoidiomaSessionBean.getConGuardarRelaciones()) {
				this.dEnd=(double)System.currentTimeMillis();					
				this.dDif=this.dEnd - this.dStart;
					
				if(Constantes.ISDEVELOPING) {
					System.out.println("Tiempo(ms) Nuevo Preparar EmpleadoIdioma: " + this.dDif); 
				}
			}
			
			//false para que pueda generar eventos
			this.estaModoNuevo=false;
							
			//Con this.estaModoNuevo=false;, se permite actualizar y usar eventos control al mismo tiempo (FuncionTipo.LAST)			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.LAST,ControlTipo.FORM,EventoTipo.CLIC,EventoSubTipo.NEW,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;			
		}
	}
	
	public void jButtonDuplicarEmpleadoIdiomaActionPerformed(ActionEvent evt,Boolean esRelaciones) throws Exception {   
		try {
			Boolean soloDuplicarUno=false;
			Boolean conSeleccionarFilaTabla=false;
			
			this.estaModoNuevo=true;
			this.estaModoDuplicar=true;
			
			ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();
			int intSelectedRow =-1;
			Integer iNumRowsSeleccionados=0;
			int[] arrNumRowsSeleccionados=null;
			
			//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
			if(conSeleccionarFilaTabla) {
				arrNumRowsSeleccionados=this.jTableDatosEmpleadoIdioma.getSelectedRows();
				iNumRowsSeleccionados=this.jTableDatosEmpleadoIdioma.getSelectedRows().length;			
			}
			
			empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(false);
				
			if((soloDuplicarUno && iNumRowsSeleccionados.equals(1)) || !soloDuplicarUno) {
				//LO HACE NUEVOPREPARAR
				//this.iIdNuevoEmpleadoIdioma--;			
				//EmpleadoIdioma empleadoidiomaAux= new EmpleadoIdioma();			
				//empleadoidiomaAux.setId(this.iIdNuevoEmpleadoIdioma);																
				
				//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
				//EmpleadoIdioma empleadoidiomaOrigen=new EmpleadoIdioma();
				//for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {				
				
				for(EmpleadoIdioma empleadoidiomaOrigen : empleadoidiomasSeleccionados) {
					if(conSeleccionarFilaTabla) {
						if(!soloDuplicarUno) {
							//NO SE TOMA EN CUENTA, SI LOS SELECCIONADOS
							//intSelectedRow =iNumRowSeleccionado;
						} else {
							intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
						}
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {
							empleadoidiomaOrigen =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							empleadoidiomaOrigen =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
						}
					}
					
					this.aumentarTamanioFilaNuevaTablaEmpleadoIdioma();
					
					if(this.conTotales) {
						this.quitarFilaTotales();
					}
					
					this.nuevoPreparar(true);
					
					this.empleadoidioma.setsType("DUPLICADO");
					
					this.setCopiarVariablesObjetosEmpleadoIdioma(empleadoidiomaOrigen,this.empleadoidioma,true,true);
					
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					
					//LO HACE NUEVOPREPARAR
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoidiomaLogic.getEmpleadoIdiomas().add(this.empleadoidiomaAux);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoidiomas.add(this.empleadoidiomaAux);				
					}
					*/
				}
				
				this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
				
				this.jTableDatosEmpleadoIdioma.setRowSelectionInterval(this.getIndiceNuevoEmpleadoIdioma(), this.getIndiceNuevoEmpleadoIdioma());
				
				int iLastRow =  this.jTableDatosEmpleadoIdioma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoIdioma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoIdioma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
				}
			} else {
				throw new Exception("DEBE ESTAR SELECCIONADO 1 REGISTRO");
			}
			
		} catch(Exception e) {			
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			this.estaModoNuevo=false;
			this.estaModoDuplicar=false;
		}
	}
	
	public void jButtonCopiarEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			Boolean conSeleccionarFilaTabla=false;
			Integer iNumRowsSeleccionados=0;
			int[] intSelectedRows =null;
			int intSelectedRow =0;
			
			this.estaModoCopiar=true;
			
			ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();									
		
			EmpleadoIdioma empleadoidiomaOrigen=new EmpleadoIdioma();
			EmpleadoIdioma empleadoidiomaDestino=new EmpleadoIdioma();
				
			empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(false);
			
			if(conSeleccionarFilaTabla) {
				iNumRowsSeleccionados=this.jTableDatosEmpleadoIdioma.getSelectedRows().length;	
			}
			
			if(iNumRowsSeleccionados.equals(2) || empleadoidiomasSeleccionados.size()==2) {
				if(conSeleccionarFilaTabla) {
					intSelectedRows =this.jTableDatosEmpleadoIdioma.getSelectedRows();
					intSelectedRow = intSelectedRows[0];	
									
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomaOrigen =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoidiomaOrigen =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					intSelectedRow = intSelectedRows[1];
					
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						empleadoidiomaDestino =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						empleadoidiomaDestino =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
				}
				
				empleadoidiomaOrigen =empleadoidiomasSeleccionados.get(0);
				empleadoidiomaDestino =empleadoidiomasSeleccionados.get(1);
				
				this.setCopiarVariablesObjetosEmpleadoIdioma(empleadoidiomaOrigen,empleadoidiomaDestino,true,false);
				
				empleadoidiomaDestino.setsType("DUPLICADO");
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					actualizarLista(empleadoidiomaDestino,empleadoidiomaLogic.getEmpleadoIdiomas());					
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(empleadoidiomaDestino,empleadoidiomas);
				}
				//ARCHITECTURE
				
				this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
				
				//this.jTableDatosEmpleadoIdioma.setRowSelectionInterval(this.getIndiceNuevoEmpleadoIdioma(), this.getIndiceNuevoEmpleadoIdioma());
				
				int iLastRow =  this.jTableDatosEmpleadoIdioma.getRowCount () - 1;
				Rectangle rectangle = this.jTableDatosEmpleadoIdioma.getCellRect(iLastRow, 0, true);
				
				this.jTableDatosEmpleadoIdioma.scrollRectToVisible(rectangle);
				
				//FILA TOTALES
				if(this.conTotales) {
					//this.crearFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
				}
			} else {
				throw new Exception("DEBEN ESTAR SELECCIONADOS 2 REGISTROS");
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.estaModoCopiar=false;
		}
	}
	
	public void jButtonVerFormEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.jInternalFrameDetalleFormEmpleadoIdioma.setSelected(true);
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonMostrarOcultarEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			Boolean isVisible=this.jPanelParametrosReportesEmpleadoIdioma.isVisible();
			
			//BYDAN_BUSQUEDAS
			
			this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(!isVisible);			
			
			
			this.jPanelParametrosReportesEmpleadoIdioma.setVisible(!isVisible);
			this.jPanelPaginacionEmpleadoIdioma.setVisible(!isVisible);
			this.jPanelAccionesEmpleadoIdioma.setVisible(!isVisible);
							
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.closingInternalFrameEmpleadoIdioma();
			
			//if(this.jInternalFrameParent==null) {
				//this.dispose();
			/*} else {
				this.setVisible(false);
	        	this.setSelected(false);	
			}*/			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarReporteDinamicoEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameReporteDinamicoEmpleadoIdioma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarImportacionEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameImportacionEmpleadoIdioma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonAbrirOrderByEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			
			this.abrirInicializarFrameOrderByEmpleadoIdioma();
			
			this.abrirFrameOrderByEmpleadoIdioma();
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonCerrarOrderByEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			
			this.cerrarFrameOrderByEmpleadoIdioma();
			
						
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void abrirFrameDetalleEmpleadoIdioma(Boolean esRelaciones) throws Exception {	    	        
	    try {
			//CAUSA PROBLEMAS, SE ADICIONA EN CONSTRUCTOR, LUEGO SOLO VISIBLE true y false
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoIdioma);
			
			if(!esRelaciones) {
				if(this.jInternalFrameDetalleFormEmpleadoIdioma.isMaximum()) {
					this.jInternalFrameDetalleFormEmpleadoIdioma.setMaximum(false);
				}								
				
	    		this.jInternalFrameDetalleFormEmpleadoIdioma.setSize(this.jInternalFrameDetalleFormEmpleadoIdioma.iWidthFormulario,this.jInternalFrameDetalleFormEmpleadoIdioma.iHeightFormulario);
	    	} else {
				if(this.iWidthScroll<this.jInternalFrameDetalleFormEmpleadoIdioma.iWidthFormularioMaximo) {
	    			this.jInternalFrameDetalleFormEmpleadoIdioma.setSize(this.iWidthScroll,this.iHeightScroll);
				} else {
					if(!this.jInternalFrameDetalleFormEmpleadoIdioma.isMaximum()) {
						this.jInternalFrameDetalleFormEmpleadoIdioma.setMaximum(true);
					}
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoIdioma.jContentPaneDetalleEmpleadoIdioma.getWidth() > this.getWidth()) {
					this.jInternalFrameDetalleFormEmpleadoIdioma.jTabbedPaneRelacionesEmpleadoIdioma.setMinimumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoIdioma.jContentPaneDetalleEmpleadoIdioma.getWidth(),EmpleadoIdiomaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoIdioma.jTabbedPaneRelacionesEmpleadoIdioma.setMaximumSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoIdioma.jContentPaneDetalleEmpleadoIdioma.getWidth(),EmpleadoIdiomaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					this.jInternalFrameDetalleFormEmpleadoIdioma.jTabbedPaneRelacionesEmpleadoIdioma.setPreferredSize(new Dimension(this.jInternalFrameDetalleFormEmpleadoIdioma.jContentPaneDetalleEmpleadoIdioma.getWidth(),EmpleadoIdiomaConstantesFunciones.ALTO_TABPANE_RELACIONES));
					
					Dimension dimension=new Dimension(); 
					
					
					
				}
	    	}
			
		
	       	this.jInternalFrameDetalleFormEmpleadoIdioma.setVisible(true);
	        this.jInternalFrameDetalleFormEmpleadoIdioma.setSelected(true);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirInicializarFrameOrderByEmpleadoIdioma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameOrderByEmpleadoIdioma==null) {
				
				if(!this.conCargarMinimo) {
					this.jInternalFrameOrderByEmpleadoIdioma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoIdioma,false,this);
				} else {
					this.jInternalFrameOrderByEmpleadoIdioma=new OrderByJInternalFrame(STIPO_TAMANIO_GENERAL,this.jButtonAbrirOrderByEmpleadoIdioma,true,this);
				}
				
				this.jDesktopPane.add(this.jInternalFrameOrderByEmpleadoIdioma);
				this.jInternalFrameOrderByEmpleadoIdioma.setVisible(false);
				this.jInternalFrameOrderByEmpleadoIdioma.setSelected(false);
				
				this.jInternalFrameOrderByEmpleadoIdioma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoIdioma"));
				
				this.inicializarActualizarBindingTablaOrderByEmpleadoIdioma();
			}
		} catch (final Exception e) {
			
		}
	}
	
	
	
	public void abrirInicializarFrameImportacionEmpleadoIdioma() throws Exception {	    	        
	    try {
			if(this.jInternalFrameImportacionEmpleadoIdioma==null) {
				
				this.jInternalFrameImportacionEmpleadoIdioma=new ImportacionJInternalFrame(EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO,this);			
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameImportacionEmpleadoIdioma);							
				
				this.jDesktopPane.add(this.jInternalFrameImportacionEmpleadoIdioma);
				this.jInternalFrameImportacionEmpleadoIdioma.setVisible(false);
				this.jInternalFrameImportacionEmpleadoIdioma.setSelected(false);


				this.jInternalFrameImportacionEmpleadoIdioma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoIdioma"));
				this.jInternalFrameImportacionEmpleadoIdioma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoIdioma"));
				this.jInternalFrameImportacionEmpleadoIdioma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoIdioma"));


			}
		} catch (final Exception e) {
			
		}
	}		
	
	
	
	public void abrirInicializarFrameReporteDinamicoEmpleadoIdioma() throws Exception {	    	        
	    try {
			
			if(this.jInternalFrameReporteDinamicoEmpleadoIdioma==null) {
				this.jInternalFrameReporteDinamicoEmpleadoIdioma=new ReporteDinamicoJInternalFrame(EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO,this);	
				
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,this.jInternalFrameReporteDinamicoEmpleadoIdioma);	
	
	
				this.jDesktopPane.add(this.jInternalFrameReporteDinamicoEmpleadoIdioma);
				this.jInternalFrameReporteDinamicoEmpleadoIdioma.setVisible(false);
				this.jInternalFrameReporteDinamicoEmpleadoIdioma.setSelected(false);
	
	
	
				this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoIdioma"));
				this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoIdioma"));
				this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoIdioma"));
	
				this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoIdioma();
			}

		} catch (final Exception e) {
			
		}
	}	
	
	
	
		
					
	public void cerrarFrameDetalleEmpleadoIdioma() throws Exception {	    	        
	    try {
			//this.jDesktopPane.add(jInternalFrameDetalleFormEmpleadoIdioma);
			
	       	this.jInternalFrameDetalleFormEmpleadoIdioma.setVisible(false);
	        this.jInternalFrameDetalleFormEmpleadoIdioma.setSelected(false);
			
			//this.jInternalFrameDetalleFormEmpleadoIdioma.dispose();
			//this.jInternalFrameDetalleFormEmpleadoIdioma=null;
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
	    }
	}
	
	
	public void abrirFrameReporteDinamicoEmpleadoIdioma() throws Exception {	    	        
	    try {
			
			this.jInternalFrameReporteDinamicoEmpleadoIdioma.setVisible(true);
	        this.jInternalFrameReporteDinamicoEmpleadoIdioma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void abrirFrameImportacionEmpleadoIdioma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameImportacionEmpleadoIdioma.setVisible(true);
	        this.jInternalFrameImportacionEmpleadoIdioma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
	    }		
	}	
	
	
	
	
	
	public void abrirFrameOrderByEmpleadoIdioma() throws Exception {	    	        		
	    try {
			this.jInternalFrameOrderByEmpleadoIdioma.setVisible(true);
	        this.jInternalFrameOrderByEmpleadoIdioma.setSelected(true);			
			
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameOrderByEmpleadoIdioma() throws Exception {	    	        		
	    try {			
			this.jInternalFrameOrderByEmpleadoIdioma.setVisible(false);
	        this.jInternalFrameOrderByEmpleadoIdioma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameReporteDinamicoEmpleadoIdioma() throws Exception {			
	    try {
			this.jInternalFrameReporteDinamicoEmpleadoIdioma.setVisible(false);
	        this.jInternalFrameReporteDinamicoEmpleadoIdioma.setSelected(false);			
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	public void cerrarFrameImportacionEmpleadoIdioma() throws Exception {	    	        		
	    try {
			this.jInternalFrameImportacionEmpleadoIdioma.setVisible(false);
	        this.jInternalFrameImportacionEmpleadoIdioma.setSelected(false);
		
	    } catch (final java.beans.PropertyVetoException e) {
		
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
	    }		
	}
	
	
	
	
	public void jButtonModificarEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try {
			this.modificarEmpleadoIdioma(evt,-1,false);
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void modificarEmpleadoIdioma(ActionEvent evt,int rowIndex,Boolean esRelaciones) throws Exception {   
		try {
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
			}
			
			this.habilitarDeshabilitarControlesEmpleadoIdioma(true);
			//this.isEsNuevoEmpleadoIdioma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.actualizarEstadoCeldasBotonesEmpleadoIdioma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoIdioma(false) ;
			
			if(empleadoidiomaSessionBean.getConGuardarRelaciones()) {
			
			}
			
			if(EmpleadoIdiomaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoIdioma(esRelaciones);
			}
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoIdioma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void seleccionarFilaTablaEmpleadoIdiomaActual() { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL
			Integer intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void seleccionarEmpleadoIdioma(ActionEvent evt,int rowIndex) throws Exception {   
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			int intSelectedRow = 0;	
			
			if(rowIndex>=0) {
				intSelectedRow=rowIndex;
			} else {
				intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
			}
			
			//this.habilitarDeshabilitarControlesEmpleadoIdioma(true);
			//this.isEsNuevoEmpleadoIdioma=false;
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
			}
			//ARCHITECTURE
			
			this.jInternalFrameParent.setIdCombosCodigoDesdeBusquedaForeignKey(this.empleadoidioma.getId(),this.sTipoBusqueda);
			
			this.dispose();
			
			//this.actualizarEstadoCeldasBotonesEmpleadoIdioma("ae", isGuardarCambiosEnLote, isEsMantenimientoRelacionado);
			
			//NO FUNCIONA BINDINGS
			/*
			this.inicializarActualizarBindingBotonesEmpleadoIdioma(false) ;
			
			if(EmpleadoIdiomaJInternalFrame.CON_DATOS_FRAME) {
				this.abrirFrameDetalleEmpleadoIdioma(esRelaciones);
			}
			*/
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoIdioma(false) ;
		
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}		
	
	public void setIdCombosCodigoDesdeBusquedaForeignKey(Long id,String sType)throws Exception{
		
		try {
			
			if(sType.equals("Empleado")) {
				if(!this.empleadoidiomaConstantesFunciones.cargarid_empleadoEmpleadoIdioma) {
					this.cargarCombosEmpleadosForeignKeyLista(" where id="+id);
					//this.inicializarActualizarBindingEmpleadoIdioma(false,false);
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
		TableColumn tableColumnEmpleado=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO));
		TableCellEditor tableCellEditorEmpleado =tableColumnEmpleado.getCellEditor();

		EmpleadoTableCell empleadoTableCellFk=(EmpleadoTableCell)tableCellEditorEmpleado;

		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.setempleadosForeignKey(empleadosForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoIdioma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//empleadoTableCellFk.setRowActual(intSelectedRow);
			//empleadoTableCellFk.setempleadosForeignKeyActual(empleadosForeignKey);
		//}


		if(empleadoTableCellFk!=null) {
			empleadoTableCellFk.RecargarEmpleadosForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	public void recargarComboTablaIdioma(List<Idioma> idiomasForeignKey)throws Exception{
		TableColumn tableColumnIdioma=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA));
		TableCellEditor tableCellEditorIdioma =tableColumnIdioma.getCellEditor();

		IdiomaTableCell idiomaTableCellFk=(IdiomaTableCell)tableCellEditorIdioma;

		if(idiomaTableCellFk!=null) {
			idiomaTableCellFk.setidiomasForeignKey(idiomasForeignKey);
		}


		//SIEMPRE rowActual<0 , NO USADO POR EL MOMENTO
		//COMBO DE FILA ACTUAL SE ACTUALIZA, LOS DEMAS USAN EL ANTERIOR COMBO
		//int intSelectedRow = -1;
		//intSelectedRow=this.jTableDatosEmpleadoIdioma.getSelectedRow();

		//if(intSelectedRow<=0) {
			//idiomaTableCellFk.setRowActual(intSelectedRow);
			//idiomaTableCellFk.setidiomasForeignKeyActual(idiomasForeignKey);
		//}


		if(idiomaTableCellFk!=null) {
			idiomaTableCellFk.RecargarIdiomasForeignKey();
			//ACTUALIZA COMBOS DE TABLA-FIN
		}

	}	
	
	
	

	public void setCombosCodigoDesdeBusquedaid_empleado (Long id) throws Exception {
		this.setActualEmpleadoForeignKey(id,true,"Todos");

	};
	
	public void jButtonActualizarEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoIdioma(false);
			
			//if(!this.isEsNuevoEmpleadoIdioma) {								
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();	
				
				//SE PIEDE INDICE SELECTED CON FILA TOTALES, ASEGURARSE QUE OBJETO ACTUAL ESTE EN FORMULARIO
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
			//}
				
			if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
				this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				
			}
			
			if(this.permiteMantenimiento(this.empleadoidioma)) {	
				this.actualizar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
					
					this.isEsNuevoEmpleadoIdioma=true;
					this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
					this.isEsNuevoEmpleadoIdioma=false;
				
				} else {					
					
					//PARA RELACIONADO ACTUALIZAR FILA TOTALES
					this.isEsNuevoEmpleadoIdioma=true;
					this.procesoActualizarFilaTotales(false,"MANTENIMIENTO");
					this.isEsNuevoEmpleadoIdioma=false;
				}
						
								
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoIdioma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoIdioma(false);
				
				this.habilitarDeshabilitarControlesEmpleadoIdioma(false);
			
												
				
				if(EmpleadoIdiomaJInternalFrame.CON_DATOS_FRAME) {
					if(!this.isPostAccionSinCerrar) {
						this.cerrarFrameDetalleEmpleadoIdioma();
					}
				}
				
				if(this.isPostAccionNuevo) {
					this.jButtonNuevoEmpleadoIdiomaActionPerformed(evt,empleadoidiomaSessionBean.getConGuardarRelaciones());
				} else {
					if(this.isPostAccionSinCerrar) {
						Integer intSelectedRowActual=this.getIndiceActualEmpleadoIdioma(this.empleadoidioma,intSelectedRow);
						
						if(intSelectedRow>-1) {
							this.jTableDatosEmpleadoIdioma.setRowSelectionInterval(intSelectedRowActual, intSelectedRowActual);
							this.jButtonIdActionPerformed(evt,intSelectedRowActual,empleadoidiomaSessionBean.getConGuardarRelaciones(),false);
						}
					}
				}
				
				this.cancelar(false);
				
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
			
			
			if(this.jInternalFrameParent!=null) { //&& this.isEsMantenimientoRelacionado) {
				Boolean esUsoDesdeHijoLocal=true;
				String sTipo="Formulario";
				Boolean conIrServidorAplicacionParent=false;
				Long id=this.empleadoidioma.getId();
				ArrayList<String> arrClasses=new ArrayList<String>();
				
				GeneralEntityParameterGeneral generalEntityParameterGeneral=new GeneralEntityParameterGeneral();
				
				generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
				generalEntityParameterGeneral.setsDominio("Formulario");
				generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
				
				this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"FORMULARIO",esControlTabla,conIrServidorAplicacionParent,
					id,this, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.FORM,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
					evt,generalEntityParameterGeneral,this);
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonEliminarEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {   
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}
			
			int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();	       
							
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				this.empleadoidioma.setIsDeleted(true);
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				this.empleadoidioma.setIsDeleted(true);
			}
			//ARCHITECTURE
			
			if(this.permiteMantenimiento(this.empleadoidioma)) {
				this.eliminar();
				
				if(!this.isGuardarCambiosEnLote && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
					this.procesarBusqueda(sAccionBusqueda);
				}
				
				((EmpleadoIdiomaModel) this.jTableDatosEmpleadoIdioma.getModel()).fireTableRowsDeleted(intSelectedRow,intSelectedRow);
				
				this.isEsNuevoEmpleadoIdioma=true;
				this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
				this.isEsNuevoEmpleadoIdioma=false;									
					
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingBotonesEmpleadoIdioma(false);
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoIdioma(false);
				
				this.habilitarDeshabilitarControlesEmpleadoIdioma(false);
				
				
				
				if(EmpleadoIdiomaJInternalFrame.CON_DATOS_FRAME) {
					this.cerrarFrameDetalleEmpleadoIdioma();
				}
			} else {
				JOptionPane.showMessageDialog(this,"ESTE REGISTRO NO PUEDE ACTUALIZARSE","EDITAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
		}		
	}
		
	public void jButtonCancelarEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {                                         	   	       
	  	try {
			if(jTableDatosEmpleadoIdioma.getRowCount()>=1) {
				jTableDatosEmpleadoIdioma.removeRowSelectionInterval(0, jTableDatosEmpleadoIdioma.getRowCount()-1);						
			}
						
			this.invalidValues=new InvalidValue[0];
			this.habilitarDeshabilitarControlesEmpleadoIdioma(false);
			this.cancelar(true);			
			this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingBotonesEmpleadoIdioma(false) ;
			
			//SI ES MANUAL
			//this.inicializarActualizarBindingBotonesManualEmpleadoIdioma(false) ;
			
			this.isEsNuevoEmpleadoIdioma=false;
			
			if(EmpleadoIdiomaJInternalFrame.CON_DATOS_FRAME) {
				this.cerrarFrameDetalleEmpleadoIdioma();
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}
			
			//this.estaModoGuardarCambios=true;
			
	    	this.guardarCambios();
			
			if(!this.isErrorGuardar) {
				this.procesarBusqueda(this.sAccionBusqueda);
				
				//NO FUNCIONA BINDINGS
				this.inicializarActualizarBindingEmpleadoIdioma(false);
				
				//SI ES MANUAL
				if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {				
					//this.inicializarActualizarBindingManualEmpleadoIdioma();				
				}
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
			
			//this.estaModoGuardarCambios=false;
		}
	}
	
	public void jButtonNuevoGuardarCambiosEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			
			this.estaModoNuevo=true;
			this.estaModoNuevoGuardarCambios=true;
			
			//LO HACE NUEVOPREPARAR
			//this.iIdNuevoEmpleadoIdioma--;			
			//EmpleadoIdioma empleadoidiomaAux= new EmpleadoIdioma();			
			//empleadoidiomaAux.setId(this.iIdNuevoEmpleadoIdioma);
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			this.aumentarTamanioFilaNuevaTablaEmpleadoIdioma();
			
			if(this.conTotales) {
				this.quitarFilaTotales();
			}
			
			this.nuevoPreparar(true);
			
			this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
			
			this.empleadoidioma.setsType("NUEVO_GUARDAR_CAMBIOS");
			
			//LO HACE NUEVOPREPARAR
			/*
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				this.empleadoidiomaLogic.getEmpleadoIdiomas().add(this.empleadoidiomaAux);
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				this.empleadoidiomas.add(this.empleadoidiomaAux);				
			}
			*/
			
			this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
			
			this.jTableDatosEmpleadoIdioma.setRowSelectionInterval(this.getIndiceNuevoEmpleadoIdioma(), this.getIndiceNuevoEmpleadoIdioma());
			
			int iLastRow =  this.jTableDatosEmpleadoIdioma.getRowCount () - 1;
			Rectangle rectangle = this.jTableDatosEmpleadoIdioma.getCellRect(iLastRow, 0, true);
			
			this.jTableDatosEmpleadoIdioma.scrollRectToVisible(rectangle);
			
			//FILA TOTALES
			if(this.conTotales) {
				this.crearFilaTotales();
				
				this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
			}

		} catch(Exception e) {									
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoNuevo=false;
			this.estaModoNuevoGuardarCambios=false;
		}
	}		
	
	public void jButtonRecargarInformacionEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		try {
			this.iNumeroPaginacionPagina=0;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}
			
			this.inicializarActualizarBindingEmpleadoIdioma(false,false);
			
	    	this.recargarInformacion();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoIdioma(false);
			
			//SI ES MANUAL
			if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoIdioma();
			}
			
			//this.abrirFrameTreeEmpleadoIdioma();
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
		}	
	}
	
	
	public void jButtonGenerarImportacionEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedReader bufferedReader = null;
		String sXmlStringFile="";
		String sPath="";
		this.arrDatoGeneralMinimos= new  ArrayList<DatoGeneralMinimo>();
		DatoGeneralMinimo datoGeneralMinimo=new DatoGeneralMinimo();
		String sLine="";
		
		try {			
			if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR IMPORTACION DE Empleado IdiomaS ?", "MANTENIMIENTO DE Empleado Idioma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				bufferedReader = new BufferedReader(new FileReader(this.jInternalFrameImportacionEmpleadoIdioma.getFileImportacion().getAbsolutePath()));
								
				while ((sLine = bufferedReader.readLine()) != null) {
					datoGeneralMinimo=new DatoGeneralMinimo();
					datoGeneralMinimo.setsDescripcion(sLine);
					
					this.arrDatoGeneralMinimos.add(datoGeneralMinimo);
				}
				
				this.actualizarParametrosGeneralEmpleadoIdioma();
						
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {						
					this.empleadoidiomaReturnGeneral=empleadoidiomaLogic.procesarImportacionEmpleadoIdiomasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this.arrDatoGeneralMinimos,this.empleadoidiomaParameterGeneral);
						
				} else if(Constantes.ISUSAEJBREMOTE) {
						
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
						
				this.procesarEmpleadoIdiomaReturnGeneral();
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedReader != null) {
				bufferedReader.close();
			}	
		}				
	}
	
	
	
	public void jButtonAbrirImportacionEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {    				
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {
			int iReturnArchivo = this.jInternalFrameImportacionEmpleadoIdioma.getjFileChooserImportacion().showOpenDialog(this);
 
            if (iReturnArchivo == JFileChooser.APPROVE_OPTION) {
            	this.jInternalFrameImportacionEmpleadoIdioma.setFileImportacion(this.jInternalFrameImportacionEmpleadoIdioma.getjFileChooserImportacion().getSelectedFile());
            	
				this.jInternalFrameImportacionEmpleadoIdioma.getjTextFieldPathArchivoImportacion().setText(this.jInternalFrameImportacionEmpleadoIdioma.getFileImportacion().getName());
				
				//System.out.println("ARCHIVO ESCOGIDO: "+this.fileImportacionEmpleadoIdioma.getName());
				
            } else {
                //System.out.println("CANCELAR SELECCION");
				this.jInternalFrameImportacionEmpleadoIdioma.getjTextFieldPathArchivoImportacion().setText("SELECCION CANCELADA");
            }			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		} finally {			
			if (bufferedWriter != null) {
				bufferedWriter.close();
			}	
		}		
	}
	
	
	public void jButtonGenerarReporteDinamicoEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		BufferedWriter bufferedWriter = null;
		String sXmlStringFile="";
		String sPath="";
		
		try {	
		
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();		

		empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
		
		
		this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();
		
		this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
		
		
		this.sTipoArchivoReporte=this.sTipoArchivoReporteDinamico;
		
		//this.sTipoReporteExtra="Base";
		
			InputStream reportFile=null;
			InputStream imageFile=null;
			
			imageFile=AuxiliarImagenes.class.getResourceAsStream("LogoReporte.jpg");			
				
		
		
			reportFile = AuxiliarReportes.class.getResourceAsStream("EmpleadoIdiomaBaseDesign.jrxml");	
			
			sPath=this.parametroGeneralUsuario.getpath_exportar()+"EmpleadoIdiomaBaseDesign.jrxml";
			
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
			
			this.generarReporteEmpleadoIdiomas("Todos",empleadoidiomasSeleccionados );

			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				//DEBE APARECER EL REPORTE DIRECTAMENTE
				//JOptionPane.showMessageDialog(this,"GENERADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Idioma",JOptionPane.INFORMATION_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
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
		
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasSelectReporte().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasSelectReporte().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empresa_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empresa_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empresa_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empresa_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Empleado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Empleado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Empleado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Empleado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA:
					iAnchoColumna=100;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Idioma_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Idioma_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Idioma_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Idioma_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Materna_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Materna_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Materna_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Materna_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Tecnico_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Tecnico_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Tecnico_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Tecnico_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcenTecnico_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcenTecnico_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcenTecnico_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcenTecnico_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Lectura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Lectura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Lectura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Lectura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcenLectura_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcenLectura_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcenLectura_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcenLectura_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Escrito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Escrito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Escrito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Escrito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcenEscrito_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcenEscrito_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcenEscrito_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcenEscrito_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_Hablado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_Hablado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_Hablado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_Hablado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO:
					iAnchoColumna=50;

					if(iAnchoSum+iAnchoColumna<=iAnchoMaximoHorizontal) {
						sXmlStringFile=sXmlStringFile.replace("<!--col_rcenHablado_col", "");
						sXmlStringFile=sXmlStringFile.replace("col_rcenHablado_col-->", "");

						sXmlStringFile=sXmlStringFile.replace("colancho_rcenHablado_colancho", iAnchoColumna.toString());
						sXmlStringFile=sXmlStringFile.replace("colx_rcenHablado_colx", iAnchoSum.toString());

						iAnchoSum+=iAnchoColumna;
					}

					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION:
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
		
		if(this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjCheckBoxConGraficoDinamico().isSelected()) {
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
		reporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxColumnaCategoriaGrafico().getSelectedItem());
				
		//TIPO GRAFICO REPORTE
		reporteTipoGraficoReporte=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxTiposGraficosReportesDinamico().getSelectedItem());
		
		String sTipoGraficoReporte=reporteTipoGraficoReporte.getsCodigo();
		
		switch(reporte.getsCodigo()) {
			
				case EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoria="id_empresa";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoria="id_empleado";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA:
					sNombreCampoCategoria="id_idioma";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA:
					sNombreCampoCategoria="es_materna";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO:
					sNombreCampoCategoria="es_tecnico";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO:
					sNombreCampoCategoria="porcen_tecnico";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA:
					sNombreCampoCategoria="es_lectura";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA:
					sNombreCampoCategoria="porcen_lectura";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO:
					sNombreCampoCategoria="es_escrito";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO:
					sNombreCampoCategoria="porcen_escrito";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO:
					sNombreCampoCategoria="es_hablado";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO:
					sNombreCampoCategoria="porcen_hablado";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoria="descripcion";
					break;
					
			default :
				break;
		}		
		//CATEGORIA GRAFICO
		
		//CATEGORIA VALOR				
		reporteCategoriaValor=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxColumnaCategoriaValor().getSelectedItem());
		
		switch(reporteCategoriaValor.getsCodigo()) {
			
				case EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA:
					sNombreCampoCategoriaValor="id_empresa";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO:
					sNombreCampoCategoriaValor="id_empleado";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA:
					sNombreCampoCategoriaValor="id_idioma";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA:
					sNombreCampoCategoriaValor="es_materna";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO:
					sNombreCampoCategoriaValor="es_tecnico";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO:
					sNombreCampoCategoriaValor="porcen_tecnico";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA:
					sNombreCampoCategoriaValor="es_lectura";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA:
					sNombreCampoCategoriaValor="porcen_lectura";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO:
					sNombreCampoCategoriaValor="es_escrito";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO:
					sNombreCampoCategoriaValor="porcen_escrito";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO:
					sNombreCampoCategoriaValor="es_hablado";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO:
					sNombreCampoCategoriaValor="porcen_hablado";
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION:
					sNombreCampoCategoriaValor="descripcion";
					break;
					
			default :
				break;
		}	
		//CATEGORIA VALOR
		
		//VALORES GRAFICO
		for(int index:this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasValoresGrafico().getSelectedIndices()) {
			reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasValoresGrafico().getModel().getElementAt(index);
			
			switch(reporte.getsCodigo()) {
				
				case EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empresa",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empresa");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Empleado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_empleado");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Idioma",sNombreCampoCategoria,sNombreCampoCategoriaValor,"id_idioma");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Materna",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_materna");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Tecnico",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_tecnico");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcen Tecnico",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcen_tecnico");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Lectura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_lectura");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcen Lectura",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcen_lectura");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Escrito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_escrito");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcen Escrito",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcen_escrito");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Es Hablado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"es_hablado");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO:
					strCategorySeries+=FuncionesReporte.getStringCategoryGraficoNormalReporte(sTipoGraficoReporte,"Porcen Hablado",sNombreCampoCategoria,sNombreCampoCategoriaValor,"porcen_hablado");
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION:
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
	
	public void jButtonGenerarExcelReporteDinamicoEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {		
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();		
		
		empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoidioma";//.xls";
		
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
		
			Sheet sheet = workbook.createSheet("EmpleadoIdiomas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			Row row = sheet.createRow(iRow);
			Cell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");
			
			for(int index:this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasSelectReporte().getSelectedIndices()) {
				reporte=(Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasSelectReporte().getModel().getElementAt(index);
				
				switch(reporte.getsCodigo()) {
					
				case EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getempresa_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getempleado_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getidioma_descripcion());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getes_materna());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getes_tecnico());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getporcen_tecnico());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getes_lectura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getporcen_lectura());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getes_escrito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getporcen_escrito());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getes_hablado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getporcen_hablado());
						iRow++;
					}

					existeFilas=true;
					iCell++;
					break;

				case EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION:
					iRow=0;

					if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

					cell = row.createCell(iCell);
					cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION);
					iRow++;

					for(EmpleadoIdioma empleadoidioma:empleadoidiomasSeleccionados) {
						if(!existeFilas) {row = sheet.createRow(iRow);} else {row=sheet.getRow(iRow);}

						cell = row.createCell(iCell);
						cell.setCellValue(empleadoidioma.getdescripcion());
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
			//	this.getFilaCabeceraExportarExcelEmpleadoIdioma(row);				
			//	iRow++;
			//}				
			
			//for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomasSeleccionados) {
			//	row = sheet.createRow(iRow);
				
			//	this.getFilaDatosExportarExcelEmpleadoIdioma(empleadoidiomaAux,row);
				
			//	iRow++;
			//}
			
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Idioma",JOptionPane.INFORMATION_MESSAGE);
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
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}
			
			this.idActual=idActual;
			this.iNumeroPaginacionPagina=0;
			
			this.procesarBusqueda("PorId");
				    	
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoIdioma(false);
			
			//SI ES MANUAL
			if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
				//this.inicializarActualizarBindingManualEmpleadoIdioma();
			}	
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger);
			
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonAnterioresEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion-=this.iNumeroPaginacion;
			/*
			if(this.iNumeroPaginacion<0) {
				this.iNumeroPaginacion=0;
			}
			*/
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}
			
			this.anteriores();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoIdioma(false);
			
			//SI ES MANUAL
			if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoIdioma();
			}
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void jButtonSiguientesEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {    		
		try	{
			//this.iNumeroPaginacion+=this.iNumeroPaginacion;
			//this.iNumeroPaginacionPagina=10;			
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}
			
			this.siguientes();
			
			//NO FUNCIONA BINDINGS
			this.inicializarActualizarBindingEmpleadoIdioma(false);
			
			//SI ES MANUAL
			if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
	    		//this.inicializarActualizarBindingManualEmpleadoIdioma();
			}		
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
			
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
		}
	}
	
	public void aumentarTamanioFilaNuevaTablaEmpleadoIdioma() throws Exception {		
		Dimension dimensionMinimum=this.jTableDatosEmpleadoIdioma.getMinimumSize();
		Dimension dimensionMaximum=this.jTableDatosEmpleadoIdioma.getMaximumSize();
		Dimension dimensionPreferred=this.jTableDatosEmpleadoIdioma.getPreferredSize();
	
		double iHeightConFilaNueva=dimensionPreferred.getHeight();
		
		iHeightConFilaNueva+=this.jTableDatosEmpleadoIdioma.getRowHeight();
		
		dimensionMinimum.setSize(dimensionMinimum.getWidth(),iHeightConFilaNueva);
		dimensionMaximum.setSize(dimensionMaximum.getWidth(),iHeightConFilaNueva);
		dimensionPreferred.setSize(dimensionPreferred.getWidth(),iHeightConFilaNueva);
		
		this.jTableDatosEmpleadoIdioma.setMinimumSize(dimensionMinimum);
		this.jTableDatosEmpleadoIdioma.setMaximumSize(dimensionMaximum);
		this.jTableDatosEmpleadoIdioma.setPreferredSize(dimensionPreferred);	
	}
	
	public void inicializarActualizarBindingEmpleadoIdioma(Boolean esInicializar) throws Exception {
		this.inicializarActualizarBindingEmpleadoIdioma(esInicializar,true);
	}
	
	public void inicializarActualizarBindingEmpleadoIdioma(Boolean esInicializar,Boolean conTabla) throws Exception {		
		if(conTabla) {
			this.inicializarActualizarBindingTablaEmpleadoIdioma(esInicializar);
		}
		
		this.inicializarActualizarBindingBotonesEmpleadoIdioma(esInicializar);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
			try{this.inicializarActualizarBindingBusquedasEmpleadoIdioma(esInicializar);}catch(Exception e){e.printStackTrace();}
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoIdioma(esInicializar) ;
			
			this.inicializarActualizarBindingParametrosReportesEmpleadoIdioma(esInicializar) ;
		}
		
		if(esInicializar) {
			if( !EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA ||
			   	!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
			   	
			}
		}
	}
	
	public void inicializarActualizarBindingManualEmpleadoIdioma() throws Exception {		
		//NO SE NECESITA HACER BINDING OTRA VEZ
		//this.inicializarActualizarBindingTablaEmpleadoIdioma();
		
		this.inicializarActualizarBindingBotonesManualEmpleadoIdioma(true);
		
		//FUNCIONALIDAD_RELACIONADO
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoIdioma();			
			
			
			//this.inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoIdioma() ;
			
			this.inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoIdioma(false) ;			
			
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoIdioma(Boolean esSetControles) throws Exception {
		try	{					
			if(!esSetControles) {
				this.isSeleccionarTodos=this.jCheckBoxSeleccionarTodosEmpleadoIdioma.isSelected();
				this.isSeleccionados=this.jCheckBoxSeleccionadosEmpleadoIdioma.isSelected();
				
				
				this.conGraficoReporte=this.jCheckBoxConGraficoReporteEmpleadoIdioma.isSelected();															
				
				
				if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
				this.isPostAccionNuevo=this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxPostAccionNuevoEmpleadoIdioma.isSelected();
				this.isPostAccionSinCerrar=this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxPostAccionSinCerrarEmpleadoIdioma.isSelected();
				this.isPostAccionSinMensaje=this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxPostAccionSinMensajeEmpleadoIdioma.isSelected();
				}
			
			} else {
				this.jCheckBoxSeleccionarTodosEmpleadoIdioma.setSelected(this.isSeleccionarTodos);
				this.jCheckBoxSeleccionadosEmpleadoIdioma.setSelected(this.isSeleccionados);
				
				
				this.jCheckBoxConGraficoReporteEmpleadoIdioma.setSelected(this.conGraficoReporte);				
				
				
				if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
				this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxPostAccionNuevoEmpleadoIdioma.setSelected(this.isPostAccionNuevo);
				this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxPostAccionSinCerrarEmpleadoIdioma.setSelected(this.isPostAccionSinCerrar);
				this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxPostAccionSinMensajeEmpleadoIdioma.setSelected(this.isPostAccionSinMensaje);
				}
			}
			
			
			if(this.jComboBoxTiposPaginacionEmpleadoIdioma.getSelectedItem()!=null) {
				this.sTipoPaginacion=((Reporte)this.jComboBoxTiposPaginacionEmpleadoIdioma.getSelectedItem()).getsCodigo();			
			}
			
			
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			this.sTipoAccionFormulario=((Reporte)this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.getSelectedItem()).getsCodigo();
			}
			
			
			
			if(!this.conCargarMinimo) {
				this.sTipoArchivoReporte=((Reporte)this.jComboBoxTiposArchivosReportesEmpleadoIdioma.getSelectedItem()).getsCodigo();			
				
				if(this.jInternalFrameReporteDinamicoEmpleadoIdioma!=null) {
					this.sTipoArchivoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxTiposArchivosReportesDinamico().getSelectedItem()).getsCodigo();			
				}
				
				this.sTipoRelacion=((Reporte)this.jComboBoxTiposRelacionesEmpleadoIdioma.getSelectedItem()).getsCodigo();
									
				this.sTipoAccion=((Reporte)this.jComboBoxTiposAccionesEmpleadoIdioma.getSelectedItem()).getsCodigo();
													
				this.sTipoSeleccionar=((Reporte)this.jComboBoxTiposSeleccionarEmpleadoIdioma.getSelectedItem()).getsCodigo();
									
				this.sTipoReporte=((Reporte)this.jComboBoxTiposReportesEmpleadoIdioma.getSelectedItem()).getsCodigo();							
					
				if(this.jInternalFrameReporteDinamicoEmpleadoIdioma!=null) {
					this.sTipoReporteDinamico=((Reporte)this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxTiposReportesDinamico().getSelectedItem()).getsCodigo();							
				}
				
				this.sTipoGraficoReporte=((Reporte)this.jComboBoxTiposGraficosReportesEmpleadoIdioma.getSelectedItem()).getsCodigo();											
			}			
			
			this.sValorCampoGeneral=this.jTextFieldValorCampoGeneralEmpleadoIdioma.getText();						
			
			
			
		} catch(Exception e) {
			throw e;
		}
	}
	
	public void inicializarActualizarBindingParametrosReportesEmpleadoIdioma(Boolean esInicializar) throws Exception {
		try	{	
			if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
				this. inicializarActualizarBindingParametrosReportesPostAccionesManualEmpleadoIdioma(false);
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	public void inicializarActualizarBindingtiposArchivosReportesAccionesEmpleadoIdioma() throws Exception {
		try	{
			if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
				this.inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoIdioma();
			} else {
			}
		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoIdioma() throws Exception {
		//TIPOS ACCIONES FORMULARIO	
		this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.removeAllItems();
				
		for(Reporte reporte:this.tiposAccionesFormulario) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.addItem(reporte);
		}
		
		//TIPOS ACCIONES FORMULARIO
	}
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesAccionesManualEmpleadoIdioma() throws Exception {
		try	{
			
			//TIPOS ARCHIVOS REPORTES
			this.jComboBoxTiposArchivosReportesEmpleadoIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposArchivosReportes) {
				this.jComboBoxTiposArchivosReportesEmpleadoIdioma.addItem(reporte);
			}
			
			
				
			//TIPOS REPORTES
			this.jComboBoxTiposReportesEmpleadoIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposReportes) {
				this.jComboBoxTiposReportesEmpleadoIdioma.addItem(reporte);
			}
			
			
			//TIPOS GRAFICOS REPORTES
			this.jComboBoxTiposGraficosReportesEmpleadoIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposGraficosReportes) {
				this.jComboBoxTiposGraficosReportesEmpleadoIdioma.addItem(reporte);
			}
			
			
			//TIPOS PAGINACION
			this.jComboBoxTiposPaginacionEmpleadoIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposPaginacion) {
				this.jComboBoxTiposPaginacionEmpleadoIdioma.addItem(reporte);
			}
			
			
			if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
				this.jComboBoxTiposPaginacionEmpleadoIdioma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("NORMAL",this.tiposPaginacion));
			} else {
				this.jComboBoxTiposPaginacionEmpleadoIdioma.setSelectedItem(Funciones2.getTipoPaginacionDefecto("RELACIONADO",this.tiposPaginacion));
			}
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposRelacionesEmpleadoIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposRelaciones) {
				this.jComboBoxTiposRelacionesEmpleadoIdioma.addItem(reporte);
			}
			
			//TIPOS ACCIONES
				
				
			//TIPOS ACCIONES	
			this.jComboBoxTiposAccionesEmpleadoIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposAcciones) {
				this.jComboBoxTiposAccionesEmpleadoIdioma.addItem(reporte);
			}
			
			//TIPOS ACCIONES			
			
			
			
			//TIPOS ACCIONES FORMULARIO	
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
				this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.removeAllItems();
				
				for(Reporte reporte:this.tiposAccionesFormulario) {
					this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.addItem(reporte);
				}
				
			}
			//TIPOS ACCIONES FORMULARIO
			
			
			
			//TIPOS SELECCIONAR
			this.jComboBoxTiposSeleccionarEmpleadoIdioma.removeAllItems();
				
			for(Reporte reporte:this.tiposSeleccionar) {
				this.jComboBoxTiposSeleccionarEmpleadoIdioma.addItem(reporte);
			}
			
			
			if(this.tiposSeleccionar!=null && this.tiposSeleccionar.size()>1) {
				this.jComboBoxTiposSeleccionarEmpleadoIdioma.setSelectedIndex(1);
			}
				
			//REPORTE DINAMICO
			this.inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoIdioma();
							
			//TIPOS COLUMNAS SELECT
			//TIPOS SELECCIONAR
			
			
		} catch(Exception e) {
			throw e;
		}
	}		
	
	
	@SuppressWarnings("unchecked")
	public void inicializarActualizarBindingtiposArchivosReportesDinamicoAccionesManualEmpleadoIdioma() throws Exception {
		try	{
			DefaultListModel<Reporte> defaultListModel=new DefaultListModel<Reporte>();
			
			
			//TIPOS ARCHIVOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoIdioma!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxTiposArchivosReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposArchivosReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxTiposArchivosReportesDinamico().addItem(reporte);
				}
				
			}
			
			//TIPOS REPORTES DINAMICO
			if(this.jInternalFrameReporteDinamicoEmpleadoIdioma!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxTiposReportesDinamico().removeAllItems();
					
				for(Reporte reporte:this.tiposReportesDinamico) {
					this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjComboBoxTiposReportesDinamico().addItem(reporte);
				}
				
			}
			
			defaultListModel=new DefaultListModel<Reporte>();
			
			if(this.jInternalFrameReporteDinamicoEmpleadoIdioma!=null) {
				
				if(this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposColumnasSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListColumnasSelectReporte().setModel(defaultListModel);									
						
				}	
					
				//TIPOS RELACIONES SELECT
				//TIPOS SELECCIONAR
				defaultListModel=new DefaultListModel<Reporte>();
				if(this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListRelacionesSelectReporte()!=null) {
					this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListRelacionesSelectReporte().removeAll();
						
					for(Reporte reporte:this.tiposRelacionesSelect) {
						defaultListModel.addElement(reporte);
					}						
						
					this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjListRelacionesSelectReporte().setModel(defaultListModel);									
						
				}	
				
			}
		} catch(Exception e) {
			throw e;
		}
	}	
	
	
	
	public void inicializarActualizarBindingBusquedasManualEmpleadoIdioma()  throws Exception {				
		//BYDAN_BUSQUEDAS		
		
		if(this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.getSelectedItem()!=null){this.id_empleadoFK_IdEmpleado=((Empleado)this.jComboBoxid_empleadoFK_IdEmpleadoEmpleadoIdioma.getSelectedItem()).getId();}
		if(this.jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.getSelectedItem()!=null){this.id_idiomaFK_IdIdioma=((Idioma)this.jComboBoxid_idiomaFK_IdIdiomaEmpleadoIdioma.getSelectedItem()).getId();}
		
	}
	
	
	
	
	public void inicializarActualizarBindingBusquedasEmpleadoIdioma(Boolean esInicializar) throws Exception {				
		if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
			
			this.inicializarActualizarBindingBusquedasManualEmpleadoIdioma();			
			
		} else {
		}
	}		
		
	public void inicializarActualizarBindingTablaEmpleadoIdioma() throws Exception {
		this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
	}
	
	
	public void inicializarActualizarBindingTablaOrderByEmpleadoIdioma() {
		//TABLA OrderBy	
		TableColumn tableColumn=new TableColumn();
		Integer iWidthTableDefinicionOrderBy=0;			
			
		this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy().setModel(new TablaGeneralOrderByModel(this.arrOrderBy));
					
		//DEFINIR RENDERERS OrderBy
		tableColumn=this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy(),OrderBy.ISSELECTED));			
		//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		iWidthTableDefinicionOrderBy+=50;
					
		tableColumn=this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy(),OrderBy.NOMBRE));
		//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
					
		tableColumn.setPreferredWidth(150); 	 
		tableColumn.setWidth(150); 	 
		tableColumn.setMinWidth(150);
		tableColumn.setMaxWidth(150);
				
		iWidthTableDefinicionOrderBy+=150;
					
		//tableColumn=this.jTableDatosEmpleadoIdiomaOrderBy.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdiomaOrderBy,OrderBy.NOMBREDB));			
		////tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
								
		tableColumn=this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy().getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy(),OrderBy.ESDESC));
		//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
												
		tableColumn.setPreferredWidth(50); 	 
		tableColumn.setWidth(50); 	 
		tableColumn.setMinWidth(50);
		tableColumn.setMaxWidth(50);
				
		((AbstractTableModel) this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy().getModel()).fireTableDataChanged();
				
		iWidthTableDefinicionOrderBy+=50;
	}
	
	
	
	public void inicializarActualizarBindingTablaEmpleadoIdioma(Boolean esInicializar) throws Exception {
		Boolean isNoExiste=false;
		Integer iCountNumeroColumnasNormal=0;
		Integer iCountNumeroColumnasFk=0;
		
		this.iWidthTableDefinicion=0;
		
		int iSizeTabla=0;
		
		iSizeTabla=this.getSizeTablaDatos();
		
	if(esInicializar || ConstantesSwing.FORZAR_INICIALIZAR_TABLA) {//esInicializar
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			isNoExiste=empleadoidiomaLogic.getEmpleadoIdiomas().size()==0;
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
			isNoExiste=empleadoidiomas.size()==0;
		}
		//ARCHITECTURE
			
		if(isNoExiste) {
			if(this.iNumeroPaginacion-this.iNumeroPaginacion>0) {
				this.iNumeroPaginacion-=this.iNumeroPaginacion;
			}
		}
		
		TableColumn tableColumn=new TableColumn();
		
		if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			
			//ARCHITECTURE
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.jTableDatosEmpleadoIdioma.setModel(new EmpleadoIdiomaModel(this.empleadoidiomaLogic.getEmpleadoIdiomas(),this));
			} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
				this.jTableDatosEmpleadoIdioma.setModel(new EmpleadoIdiomaModel(this.empleadoidiomas,this));
			}
			//ARCHITECTURE
			
							
			
			
			if(this.jInternalFrameOrderByEmpleadoIdioma!=null && this.jInternalFrameOrderByEmpleadoIdioma.getjTableDatosOrderBy()!=null) {
				this.inicializarActualizarBindingTablaOrderByEmpleadoIdioma();
			}
			
								
			//DEFINIR RENDERERS
			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,Constantes2.S_SELECCIONAR));
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
			tableColumn.setCellRenderer(new BooleanRenderer(true,"Seleccionar "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO,empleadoidiomaConstantesFunciones.resaltarSeleccionarEmpleadoIdioma,true,false,"","",this));
			tableColumn.setCellEditor(new BooleanEditorRenderer(true,"Seleccionar "+EmpleadoIdiomaConstantesFunciones.SCLASSWEBTITULO,empleadoidiomaConstantesFunciones.resaltarSeleccionarEmpleadoIdioma,false,"","",this));			
			
			tableColumn.setPreferredWidth(50); 	 
			tableColumn.setWidth(50); 	 
			tableColumn.setMinWidth(50); 
			tableColumn.setMaxWidth(50); 
			
			this.iWidthTableDefinicion+=50;
			
			


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_ID));

		if(this.empleadoidiomaConstantesFunciones.mostraridEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_ID,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoidiomaConstantesFunciones.resaltaridEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activaridEmpleadoIdioma,this,true,"idEmpleadoIdioma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltaridEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activaridEmpleadoIdioma,this,true,"idEmpleadoIdioma","BASICO",false));

			tableColumn.setPreferredWidth(50);
			tableColumn.setWidth(50);
			tableColumn.setMinWidth(50);
			tableColumn.setMaxWidth(50);

			this.iWidthTableDefinicion+=50;
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA));

		if(this.empleadoidiomaConstantesFunciones.mostrarid_empresaEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++) && Constantes.ISDEVELOPING) {
			tableColumn.setCellRenderer(new EmpresaTableCell(this.empresasForeignKey,this.empleadoidiomaConstantesFunciones.resaltarid_empresaEmpleadoIdioma,this,this.empleadoidiomaConstantesFunciones.activarid_empresaEmpleadoIdioma));
			tableColumn.setCellEditor(new EmpresaTableCell(this.empresasForeignKey,this.empleadoidiomaConstantesFunciones.resaltarid_empresaEmpleadoIdioma,this,this.empleadoidiomaConstantesFunciones.activarid_empresaEmpleadoIdioma,false,"id_empresaEmpleadoIdioma","GLOBAL"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO));

		if(this.empleadoidiomaConstantesFunciones.mostrarid_empleadoEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoidiomaConstantesFunciones.resaltarid_empleadoEmpleadoIdioma,this,this.empleadoidiomaConstantesFunciones.activarid_empleadoEmpleadoIdioma));
			tableColumn.setCellEditor(new EmpleadoTableCell(this.empleadosForeignKey,this.empleadoidiomaConstantesFunciones.resaltarid_empleadoEmpleadoIdioma,this,this.empleadoidiomaConstantesFunciones.activarid_empleadoEmpleadoIdioma,true,"id_empleadoEmpleadoIdioma","CON_BUSQUEDA"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,100);
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA));

		if(this.empleadoidiomaConstantesFunciones.mostrarid_idiomaEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA,true,iCountNumeroColumnasNormal,iCountNumeroColumnasFk++)) {
			tableColumn.setCellRenderer(new IdiomaTableCell(this.idiomasForeignKey,this.empleadoidiomaConstantesFunciones.resaltarid_idiomaEmpleadoIdioma,this,this.empleadoidiomaConstantesFunciones.activarid_idiomaEmpleadoIdioma));
			tableColumn.setCellEditor(new IdiomaTableCell(this.idiomasForeignKey,this.empleadoidiomaConstantesFunciones.resaltarid_idiomaEmpleadoIdioma,this,this.empleadoidiomaConstantesFunciones.activarid_idiomaEmpleadoIdioma,true,"id_idiomaEmpleadoIdioma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA));

		if(this.empleadoidiomaConstantesFunciones.mostrares_maternaEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.empleadoidiomaConstantesFunciones.resaltares_maternaEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activares_maternaEmpleadoIdioma));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltares_maternaEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activares_maternaEmpleadoIdioma,this,true,"es_maternaEmpleadoIdioma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO));

		if(this.empleadoidiomaConstantesFunciones.mostrares_tecnicoEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.empleadoidiomaConstantesFunciones.resaltares_tecnicoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activares_tecnicoEmpleadoIdioma));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltares_tecnicoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activares_tecnicoEmpleadoIdioma,this,true,"es_tecnicoEmpleadoIdioma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO));

		if(this.empleadoidiomaConstantesFunciones.mostrarporcen_tecnicoEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoidiomaConstantesFunciones.resaltarporcen_tecnicoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activarporcen_tecnicoEmpleadoIdioma,this,true,"porcen_tecnicoEmpleadoIdioma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltarporcen_tecnicoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activarporcen_tecnicoEmpleadoIdioma,this,true,"porcen_tecnicoEmpleadoIdioma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA));

		if(this.empleadoidiomaConstantesFunciones.mostrares_lecturaEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.empleadoidiomaConstantesFunciones.resaltares_lecturaEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activares_lecturaEmpleadoIdioma));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltares_lecturaEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activares_lecturaEmpleadoIdioma,this,true,"es_lecturaEmpleadoIdioma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA));

		if(this.empleadoidiomaConstantesFunciones.mostrarporcen_lecturaEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoidiomaConstantesFunciones.resaltarporcen_lecturaEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activarporcen_lecturaEmpleadoIdioma,this,true,"porcen_lecturaEmpleadoIdioma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltarporcen_lecturaEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activarporcen_lecturaEmpleadoIdioma,this,true,"porcen_lecturaEmpleadoIdioma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO));

		if(this.empleadoidiomaConstantesFunciones.mostrares_escritoEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.empleadoidiomaConstantesFunciones.resaltares_escritoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activares_escritoEmpleadoIdioma));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltares_escritoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activares_escritoEmpleadoIdioma,this,true,"es_escritoEmpleadoIdioma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO));

		if(this.empleadoidiomaConstantesFunciones.mostrarporcen_escritoEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoidiomaConstantesFunciones.resaltarporcen_escritoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activarporcen_escritoEmpleadoIdioma,this,true,"porcen_escritoEmpleadoIdioma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltarporcen_escritoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activarporcen_escritoEmpleadoIdioma,this,true,"porcen_escritoEmpleadoIdioma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO));

		if(this.empleadoidiomaConstantesFunciones.mostrares_habladoEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new BooleanRenderer(this.empleadoidiomaConstantesFunciones.resaltares_habladoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activares_habladoEmpleadoIdioma));
			tableColumn.setCellEditor(new BooleanEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltares_habladoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activares_habladoEmpleadoIdioma,this,true,"es_habladoEmpleadoIdioma","BASICO"));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO));

		if(this.empleadoidiomaConstantesFunciones.mostrarporcen_habladoEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new TextFieldRenderer(this.empleadoidiomaConstantesFunciones.resaltarporcen_habladoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activarporcen_habladoEmpleadoIdioma,this,true,"porcen_habladoEmpleadoIdioma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltarporcen_habladoEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activarporcen_habladoEmpleadoIdioma,this,true,"porcen_habladoEmpleadoIdioma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA);
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA);

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}


			tableColumn=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION));

		if(this.empleadoidiomaConstantesFunciones.mostrardescripcionEmpleadoIdioma && Funciones2.permiteMostarParaBusqueda(this.esParaBusquedaForeignKey,EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION,false,iCountNumeroColumnasNormal++,iCountNumeroColumnasFk)) {
			tableColumn.setCellRenderer(new LabelRenderer(this.empleadoidiomaConstantesFunciones.resaltardescripcionEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activardescripcionEmpleadoIdioma,this,true,"descripcionEmpleadoIdioma","BASICO"));
			tableColumn.setCellEditor(new TextFieldEditorRenderer(this.empleadoidiomaConstantesFunciones.resaltardescripcionEmpleadoIdioma,this.empleadoidiomaConstantesFunciones.activardescripcionEmpleadoIdioma,this,true,"descripcionEmpleadoIdioma","BASICO",false));

			tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));
			tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0));

			this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA + FuncionesSwing.getValorProporcion(Constantes.ISWING_ANCHO_CONTROL,0);
			//tableColumn.addPropertyChangeListener(new EmpleadoIdiomaPropertyChangeListener());
		} else {
			Funciones2.setTableColumnOcultar(tableColumn);
		}
			
		} else {
		}			
					
		if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()
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
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoidiomaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoidiomaSessionBean.getEsGuardarRelacionado()));
	
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoIdioma.addColumn(tableColumn);
			
			} else {				
				
				//LO MISMO QUE IF
				
				tableColumn= new TableColumn();
				tableColumn.setIdentifier(sLabelColumnAccion);
				tableColumn.setHeaderValue(sLabelColumnAccion);
				tableColumn.setCellRenderer(new IdTableCell(this,false,false,this.empleadoidiomaSessionBean.getEsGuardarRelacionado()));
				tableColumn.setCellEditor(new IdTableCell(this,false,false,this.empleadoidiomaSessionBean.getEsGuardarRelacionado()));
		
				tableColumn.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
				tableColumn.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				tableColumn.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 
				
				this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
				
				this.jTableDatosEmpleadoIdioma.addColumn(tableColumn);				
					
				//ELIMINAR
				if(this.isPermisoEliminarEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma) {
					tableColumn= new TableColumn();
					tableColumn.setIdentifier(Constantes2.S_ELI);
					tableColumn.setHeaderValue(sLabelColumnAccionEli);
					tableColumn.setCellRenderer(new IdTableCell(this,false,true,this.empleadoidiomaSessionBean.getEsGuardarRelacionado()));
					tableColumn.setCellEditor(new IdTableCell(this,false,true,this.empleadoidiomaSessionBean.getEsGuardarRelacionado()));
			
					tableColumn.setPreferredWidth(65); 	 
					tableColumn.setWidth(65); 	 
					tableColumn.setMinWidth(65); 
					tableColumn.setMaxWidth(65);
					
					this.iWidthTableDefinicion+=65;
						
					this.jTableDatosEmpleadoIdioma.addColumn(tableColumn);
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
			
			this.jTableDatosEmpleadoIdioma.addColumn(tableColumn);
			*/
		}
		
		Integer iUltimaColumna=0;//1
		Integer iNuevaPosicionColumna=0;
		
		
		//PERMITE ELIMINAR SIMPLE
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma) {
				iUltimaColumna++;
			}	
		}
		
		//PERMITE EDITAR SIMPLE
		iUltimaColumna++;	
		
				
		
		//MOVIA SELECCIONAR
		//iUltimaColumna++;
		
		if(!this.esParaBusquedaForeignKey)  {
			if(this.isPermisoEliminarEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma) {
				//REUBICA ELIMINAR SIMPLE
				jTableDatosEmpleadoIdioma.moveColumn(this.jTableDatosEmpleadoIdioma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3
					
				iUltimaColumna--;
			}
		}
		//REUBICA EDITAR SIMPLE
		jTableDatosEmpleadoIdioma.moveColumn(this.jTableDatosEmpleadoIdioma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1,-2 o -3				
		
		
		
		
		//REUBICABA SELECCIONAR
		/*
		if(iUltimaColumna>1) {
			iUltimaColumna--;
		}
		
		//iNuevaPosicionColumna++;
			
		//REUBICA SELECCIONAR FILA CHECK
		jTableDatosEmpleadoIdioma.moveColumn(this.jTableDatosEmpleadoIdioma.getColumnModel().getColumnCount()-iUltimaColumna, iNuevaPosicionColumna++);//-1		
		*/
		
		//DEFINEN HEADERS
		final TableCellRenderer tableHeaderDefaultCellRenderer = this.jTableDatosEmpleadoIdioma.getTableHeader().getDefaultRenderer();
		
		this.jTableDatosEmpleadoIdioma.getTableHeader().setDefaultRenderer(new TableCellRendererHeader(this.jTableDatosEmpleadoIdioma,tableHeaderDefaultCellRenderer));
	    
		TableColumn column=null;
		
		if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
			for(int i = 0; i < this.jTableDatosEmpleadoIdioma.getColumnModel().getColumnCount(); i++) { 
				column = this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(i); 
				
				if(column.getIdentifier()!=null) {
					//SI SE UTILIZA UN HEADER ES GENERICO
					//column.setHeaderRenderer(new HeaderRenderer(column.getIdentifier().toString()));
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_ELI)) {
					continue;
				}
				
				if(column.getIdentifier()!=null && column.getIdentifier().equals(Constantes2.S_SELECCIONAR)) {
					if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(50); 	 
						column.setWidth(50); 	 
						column.setMinWidth(50); 	
						column.setMaxWidth(50); 
						
						this.iWidthTableDefinicion+=50;
					}
					
				} else {
					if(!EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
						column.setPreferredWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setWidth(Constantes.ISWING_ANCHO_COLUMNA); 	 
						column.setMinWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						column.setMaxWidth(Constantes.ISWING_ANCHO_COLUMNA); 	
						
						this.iWidthTableDefinicion+=Constantes.ISWING_ANCHO_COLUMNA;
					}
				}
			}
		}
		
		this.jTableDatosEmpleadoIdioma.setSelectionBackground(FuncionesSwing.getColorSelectedBackground());
		this.jTableDatosEmpleadoIdioma.setSelectionForeground(FuncionesSwing.getColorSelectedForeground());
		
		/*
		this.jTableDatosEmpleadoIdioma.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
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
							iSize=empleadoidiomaLogic.getEmpleadoIdiomas().size()-1;
								
						} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
							iSize=empleadoidiomas.size()-1;
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
		//this.jTableDatosEmpleadoIdioma.setRowHeight(Constantes.ISWING_ALTO_FILA_TABLA);
		
		/*
		column=this.jTableDatosEmpleadoIdioma.getColumnModel().getColumn(Funciones2.getColumnIndexByName(this.jTableDatosSistema,Constantes2.S_SELECCIONAR));
		
		if(column!=null) {
			column.setPreferredWidth(25); 	 
			column.setWidth(25); 	 
			column.setMinWidth(25); 	
		}
		*/
			
			//CopyTableToTableTotal();
		} else {
			
			this.actualizarVisualTableDatosEmpleadoIdioma();
			
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
				
				//this.isEsNuevoEmpleadoIdioma=false;
					
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
				if(this.empleadoidiomaSessionBean.getConGuardarRelaciones()) {
					this.dStart=(double)System.currentTimeMillis();
				}
				
				if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) {
					this.inicializarFormDetalle();
				}
				
				this.inicializarInvalidValues();
				
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoIdioma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoIdioma.getSelectedRow();	       
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//PUEDE SER PARA DUPLICADO O NUEVO TABLA
				
				if(this.empleadoidioma.getsType().equals("DUPLICADO")
				   || this.empleadoidioma.getsType().equals("NUEVO_GUARDAR_CAMBIOS")) {
					
					this.isEsNuevoEmpleadoIdioma=true;
				
				} else {
					this.isEsNuevoEmpleadoIdioma=false;	
				}
				
				//CONTROL VERSION ANTERIOR
				/*
				if(!this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
					if(this.empleadoidioma.getId()>=0 && !this.empleadoidioma.getIsNew()) {						
						this.isEsNuevoEmpleadoIdioma=false;
						
					} else {
						this.isEsNuevoEmpleadoIdioma=true;
					}
					
				} else {
					//CONTROLAR PARA RELACIONADO
				}
				*/
				
				//ESTABLECE SI ES RELACIONADO O NO 
				this.habilitarDeshabilitarTipoMantenimientoEmpleadoIdioma(esRelaciones);						
				
				this.seleccionarEmpleadoIdioma(evt,null,rowIndex);
				
				//SELECCIONA ACTUAL PERO AUN NO SE HA INGRESADO AL SISTEMA
				//SE DESHABILITA POR GUARDAR CAMBIOS
				/*
				if(this.empleadoidioma.getId()<0) {
					this.isEsNuevoEmpleadoIdioma=true;
				}
				*/
				
				if(!this.esParaBusquedaForeignKey) {
					this.modificarEmpleadoIdioma(evt,rowIndex,esRelaciones);
				} else {
					this.seleccionarEmpleadoIdioma(evt,rowIndex);
				}	
				
				if(this.empleadoidiomaSessionBean.getConGuardarRelaciones()) {
					this.dEnd=(double)System.currentTimeMillis();					
					this.dDif=this.dEnd - this.dStart;
					
					if(Constantes.ISDEVELOPING) {
						System.out.println("Tiempo(ms) Seleccion EmpleadoIdioma: " + this.dDif); 
					}
				}								
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.FORM,EventoTipo.LOAD,EventoSubTipo.SELECTED,"FORM",this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
			} else {
				this.estaModoEliminarGuardarCambios=true;
				
				this.seleccionarEmpleadoIdioma(evt,null,rowIndex);
				
				if(this.permiteMantenimiento(this.empleadoidioma)) {
					if(this.empleadoidioma.getId()>0) {
						this.empleadoidioma.setIsDeleted(true);
						
						this.empleadoidiomasEliminados.add(this.empleadoidioma);
					}
					
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						this.empleadoidiomaLogic.getEmpleadoIdiomas().remove(this.empleadoidioma);
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						this.empleadoidiomas.remove(this.empleadoidioma);				
					}
					
					
					((EmpleadoIdiomaModel) this.jTableDatosEmpleadoIdioma.getModel()).fireTableRowsDeleted(rowIndex,rowIndex);
					
					this.actualizarFilaTotales();
					
					this.inicializarActualizarBindingTablaEmpleadoIdioma(false);					
				}								
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
			
		} finally {
			this.estaModoSeleccionar=false;				
			this.estaModoEliminarGuardarCambios=false;
		}
	}
	
	
	public void seleccionarEmpleadoIdioma(ActionEvent evt,javax.swing.event.ListSelectionEvent evt2,int rowIndex) throws Exception { 
		try {
			//SI PUEDE SER NUEVO Y SELECCIONAR (PARA DUPLICAR Y NUEVO TABLA)
			//if(!this.isEsNuevoEmpleadoIdioma) {
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
				int intSelectedRow = 0;
				
				if(rowIndex>=0) {
					intSelectedRow=rowIndex;
					this.jTableDatosEmpleadoIdioma.getSelectionModel().setSelectionInterval(intSelectedRow, intSelectedRow);
				} else {	
					intSelectedRow=this.jTableDatosEmpleadoIdioma.getSelectedRow();	       
				}
				
				//CUANDO SE RECARGA TABLA TAMBIEN SE SELECCIONA PERO CON -1 POR LO QUE SE NECESITA VALIDAR ANTES
				if(intSelectedRow<0) {
					return;
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				
				if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesObjetoActualToFormularioEmpleadoIdioma(this.empleadoidioma);
				}
				
				//ARCHITECTURE
				try {
					

					//Empresa
					if(!this.empleadoidiomaConstantesFunciones.cargarid_empresaEmpleadoIdioma || this.empleadoidiomaConstantesFunciones.event_dependid_empresaEmpleadoIdioma) {
						//this.cargarCombosEmpresasForeignKeyLista(" where id="+this.empleadoidioma.getid_empresa());
									//this.inicializarActualizarBindingEmpleadoIdioma(false,false);
						this.empresasForeignKey=new ArrayList<Empresa>();

						if(empleadoidioma.getEmpresa()!=null) {
							this.empresasForeignKey.add(empleadoidioma.getEmpresa());
						}

						this.addItemDefectoCombosForeignKeyEmpresa();
						this.cargarCombosFrameEmpresasForeignKey("Todos");
					}
					this.setActualEmpresaForeignKey(this.empleadoidioma.getid_empresa(),false,"Formulario");

					//Empleado
					if(!this.empleadoidiomaConstantesFunciones.cargarid_empleadoEmpleadoIdioma || this.empleadoidiomaConstantesFunciones.event_dependid_empleadoEmpleadoIdioma) {
						//this.cargarCombosEmpleadosForeignKeyLista(" where id="+this.empleadoidioma.getid_empleado());
									//this.inicializarActualizarBindingEmpleadoIdioma(false,false);
						this.empleadosForeignKey=new ArrayList<Empleado>();

						if(empleadoidioma.getEmpleado()!=null) {
							this.empleadosForeignKey.add(empleadoidioma.getEmpleado());
						}

						this.addItemDefectoCombosForeignKeyEmpleado();
						this.cargarCombosFrameEmpleadosForeignKey("Todos");
					}
					this.setActualEmpleadoForeignKey(this.empleadoidioma.getid_empleado(),false,"Formulario");

					//Idioma
					if(!this.empleadoidiomaConstantesFunciones.cargarid_idiomaEmpleadoIdioma || this.empleadoidiomaConstantesFunciones.event_dependid_idiomaEmpleadoIdioma) {
						//this.cargarCombosIdiomasForeignKeyLista(" where id="+this.empleadoidioma.getid_idioma());
									//this.inicializarActualizarBindingEmpleadoIdioma(false,false);
						this.idiomasForeignKey=new ArrayList<Idioma>();

						if(empleadoidioma.getIdioma()!=null) {
							this.idiomasForeignKey.add(empleadoidioma.getIdioma());
						}

						this.addItemDefectoCombosForeignKeyIdioma();
						this.cargarCombosFrameIdiomasForeignKey("Todos");
					}
					this.setActualIdiomaForeignKey(this.empleadoidioma.getid_idioma(),false,"Formulario");
				} catch(Exception e) {
					throw e;
				}
				
				this.actualizarEstadoCeldasBotonesEmpleadoIdioma("s", this.isGuardarCambiosEnLote, this.isEsMantenimientoRelacionado);
				
				//NO FUNCIONA BINDING PERO SE MANTIENE
				this.inicializarActualizarBindingBotonesEmpleadoIdioma(false) ;
				
				//SI ES MANUAL
				//this.inicializarActualizarBindingBotonesManualEmpleadoIdioma() ;
			//}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoIdioma(EmpleadoIdioma empleadoidioma) throws Exception { 
		this.setVariablesObjetoActualToFormularioTodoEmpleadoIdioma(empleadoidioma,false,"NINGUNO");
	}
	
	public void setVariablesObjetoActualToFormularioTodoEmpleadoIdioma(EmpleadoIdioma empleadoidioma,Boolean conCargarListasDesdeObjetoActual,String sTipoEvento) throws Exception { 
		this.setVariablesObjetoActualToFormularioEmpleadoIdioma(empleadoidioma);
		
		if(conCargarListasDesdeObjetoActual) {
			this.setVariablesObjetoActualToListasForeignKeyEmpleadoIdioma(empleadoidioma,sTipoEvento);
		}
		
		this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoIdioma(empleadoidioma);
	}
	
	public void setVariablesObjetoActualToFormularioEmpleadoIdioma(EmpleadoIdioma empleadoidioma) throws Exception { 
		try {			
			Image imageActual=null;
			ImageIcon imageIcon = null;
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			
			this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.setText(empleadoidioma.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_maternaEmpleadoIdioma.setSelected(empleadoidioma.getes_materna());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_tecnicoEmpleadoIdioma.setSelected(empleadoidioma.getes_tecnico());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_tecnicoEmpleadoIdioma.setText(empleadoidioma.getporcen_tecnico().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_lecturaEmpleadoIdioma.setSelected(empleadoidioma.getes_lectura());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_lecturaEmpleadoIdioma.setText(empleadoidioma.getporcen_lectura().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_escritoEmpleadoIdioma.setSelected(empleadoidioma.getes_escrito());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_escritoEmpleadoIdioma.setText(empleadoidioma.getporcen_escrito().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_habladoEmpleadoIdioma.setSelected(empleadoidioma.getes_hablado());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_habladoEmpleadoIdioma.setText(empleadoidioma.getporcen_hablado().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextAreadescripcionEmpleadoIdioma.setText(empleadoidioma.getdescripcion());
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
		
	public void actualizarInformacion(String sTipo,EmpleadoIdioma empleadoidiomaLocal) throws Exception {
		this.actualizarInformacion(sTipo,false,empleadoidiomaLocal);
	}	
	
	public void actualizarInformacion(String sTipo,Boolean conParametroObjeto,EmpleadoIdioma empleadoidiomaLocal) throws Exception {
		
		if(!conParametroObjeto) {
			if(!this.getEsControlTabla()) {
				empleadoidiomaLocal=this.empleadoidioma;
			} else {
				empleadoidiomaLocal=this.empleadoidiomaAnterior;
			}
		}
		
		if(this.permiteMantenimiento(empleadoidiomaLocal)) {
			if(sTipo.equals("EVENTO_CONTROL")) { // || sTipo.equals("EVENTO_NUEVO")
				if(!this.esControlTabla) {
					this.setVariablesFormularioToObjetoActualTodoEmpleadoIdioma(empleadoidiomaLocal,true);
					
					if(empleadoidiomaSessionBean.getConGuardarRelaciones()) {
						this.actualizarRelaciones(empleadoidiomaLocal);
					}
				}
			
			} else if(sTipo.equals("INFO_PADRE")) {
				
				if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
					this.actualizarRelacionFkPadreActual(empleadoidiomaLocal);
				}
			}
		}
	}
	
	public void setVariablesFormularioToObjetoActualTodoEmpleadoIdioma(EmpleadoIdioma empleadoidioma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoIdioma(empleadoidioma,conColumnasBase);
		this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(empleadoidioma);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoIdioma(EmpleadoIdioma empleadoidioma,Boolean conColumnasBase) throws Exception { 
		this.setVariablesFormularioToObjetoActualEmpleadoIdioma(empleadoidioma,conColumnasBase,true);
	}
	
	public void setVariablesFormularioToObjetoActualEmpleadoIdioma(EmpleadoIdioma empleadoidioma,Boolean conColumnasBase,Boolean conInicializarInvalidValues) throws Exception { 
		String sMensajeCampoActual="";
		Boolean estaValidado=true;
		try {
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {
				this.inicializarFormDetalle();
			}
			
			if(conInicializarInvalidValues) {
				this.inicializarInvalidValues();
			}
			
			

		try {
			if(this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.getText()==null || this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.getText()=="" || this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.getText()=="Id") {
				this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.setText("0");
			}

			if(conColumnasBase) {empleadoidioma.setId(Long.parseLong(this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.getText()));}
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_ID+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelIdEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoidioma.setes_materna(this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_maternaEmpleadoIdioma.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_maternaEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoidioma.setes_tecnico(this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_tecnicoEmpleadoIdioma.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_tecnicoEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoidioma.setporcen_tecnico(Integer.parseInt(this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_tecnicoEmpleadoIdioma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_tecnicoEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoidioma.setes_lectura(this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_lecturaEmpleadoIdioma.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_lecturaEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoidioma.setporcen_lectura(Integer.parseInt(this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_lecturaEmpleadoIdioma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_lecturaEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoidioma.setes_escrito(this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_escritoEmpleadoIdioma.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_escritoEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoidioma.setporcen_escrito(Integer.parseInt(this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_escritoEmpleadoIdioma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_escritoEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoidioma.setes_hablado(this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_habladoEmpleadoIdioma.isSelected());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeles_habladoEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoidioma.setporcen_hablado(Integer.parseInt(this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_habladoEmpleadoIdioma.getText()));
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelporcen_habladoEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}

		try {
			empleadoidioma.setdescripcion(this.jInternalFrameDetalleFormEmpleadoIdioma.jTextAreadescripcionEmpleadoIdioma.getText());
		} catch(Exception e) {
			estaValidado=false;
			sMensajeCampoActual+="\r\n"+EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION+"-->"+ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR;FuncionesSwing.mostrarCampoMensajeInvalido(false,this.jInternalFrameDetalleFormEmpleadoIdioma.jLabeldescripcionEmpleadoIdioma,ConstantesMensajes.SMENSAJEEXCEPCION_VALIDACIONVALOR);
		}
			
			if(!estaValidado) {
				throw new Exception(sMensajeCampoActual);
			}
		} catch(NumberFormatException e) {
			throw new Exception(sMensajeCampoActual);
			//FuncionesSwing.manageException(this, e,logger,MovimientoInventarioConstantesFunciones.CLASSNAME);
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setVariablesForeignKeyObjetoBeanDefectoActualToObjetoActualEmpleadoIdioma(EmpleadoIdioma empleadoidiomaBean,EmpleadoIdioma empleadoidioma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conDefault || (!conDefault && empleadoidiomaBean.getid_empleado()!=null && !empleadoidiomaBean.getid_empleado().equals(-1L))) {empleadoidioma.setid_empleado(empleadoidiomaBean.getid_empleado());}
			if(conDefault || (!conDefault && empleadoidiomaBean.getid_idioma()!=null && !empleadoidiomaBean.getid_idioma().equals(-1L))) {empleadoidioma.setid_idioma(empleadoidiomaBean.getid_idioma());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void setCopiarVariablesObjetosEmpleadoIdioma(EmpleadoIdioma empleadoidiomaOrigen,EmpleadoIdioma empleadoidioma,Boolean conDefault,Boolean conColumnasBase) throws Exception { 
		try {
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoidiomaOrigen.getId()!=null && !empleadoidiomaOrigen.getId().equals(0L))) {empleadoidioma.setId(empleadoidiomaOrigen.getId());}}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getid_empleado()!=null && !empleadoidiomaOrigen.getid_empleado().equals(-1L))) {empleadoidioma.setid_empleado(empleadoidiomaOrigen.getid_empleado());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getid_idioma()!=null && !empleadoidiomaOrigen.getid_idioma().equals(-1L))) {empleadoidioma.setid_idioma(empleadoidiomaOrigen.getid_idioma());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getes_materna()!=null && !empleadoidiomaOrigen.getes_materna().equals(false))) {empleadoidioma.setes_materna(empleadoidiomaOrigen.getes_materna());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getes_tecnico()!=null && !empleadoidiomaOrigen.getes_tecnico().equals(false))) {empleadoidioma.setes_tecnico(empleadoidiomaOrigen.getes_tecnico());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getporcen_tecnico()!=null && !empleadoidiomaOrigen.getporcen_tecnico().equals(0))) {empleadoidioma.setporcen_tecnico(empleadoidiomaOrigen.getporcen_tecnico());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getes_lectura()!=null && !empleadoidiomaOrigen.getes_lectura().equals(false))) {empleadoidioma.setes_lectura(empleadoidiomaOrigen.getes_lectura());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getporcen_lectura()!=null && !empleadoidiomaOrigen.getporcen_lectura().equals(0))) {empleadoidioma.setporcen_lectura(empleadoidiomaOrigen.getporcen_lectura());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getes_escrito()!=null && !empleadoidiomaOrigen.getes_escrito().equals(false))) {empleadoidioma.setes_escrito(empleadoidiomaOrigen.getes_escrito());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getporcen_escrito()!=null && !empleadoidiomaOrigen.getporcen_escrito().equals(0))) {empleadoidioma.setporcen_escrito(empleadoidiomaOrigen.getporcen_escrito());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getes_hablado()!=null && !empleadoidiomaOrigen.getes_hablado().equals(false))) {empleadoidioma.setes_hablado(empleadoidiomaOrigen.getes_hablado());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getporcen_hablado()!=null && !empleadoidiomaOrigen.getporcen_hablado().equals(0))) {empleadoidioma.setporcen_hablado(empleadoidiomaOrigen.getporcen_hablado());}
			if(conDefault || (!conDefault && empleadoidiomaOrigen.getdescripcion()!=null && !empleadoidiomaOrigen.getdescripcion().equals(""))) {empleadoidioma.setdescripcion(empleadoidiomaOrigen.getdescripcion());}
			
		} catch(Exception e) {
			throw e;
			//FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoIdioma(EmpleadoIdioma empleadoidioma) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.setText(empleadoidioma.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_maternaEmpleadoIdioma.setSelected(empleadoidioma.getes_materna());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_tecnicoEmpleadoIdioma.setSelected(empleadoidioma.getes_tecnico());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_tecnicoEmpleadoIdioma.setText(empleadoidioma.getporcen_tecnico().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_lecturaEmpleadoIdioma.setSelected(empleadoidioma.getes_lectura());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_lecturaEmpleadoIdioma.setText(empleadoidioma.getporcen_lectura().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_escritoEmpleadoIdioma.setSelected(empleadoidioma.getes_escrito());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_escritoEmpleadoIdioma.setText(empleadoidioma.getporcen_escrito().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_habladoEmpleadoIdioma.setSelected(empleadoidioma.getes_hablado());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_habladoEmpleadoIdioma.setText(empleadoidioma.getporcen_hablado().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextAreadescripcionEmpleadoIdioma.setText(empleadoidioma.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoBeanActualToFormularioEmpleadoIdioma(EmpleadoIdiomaBean empleadoidiomaBean) throws Exception { 
		try {
			
			this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.setText(empleadoidiomaBean.getId().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_maternaEmpleadoIdioma.setSelected(empleadoidiomaBean.getes_materna());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_tecnicoEmpleadoIdioma.setSelected(empleadoidiomaBean.getes_tecnico());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_tecnicoEmpleadoIdioma.setText(empleadoidiomaBean.getporcen_tecnico().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_lecturaEmpleadoIdioma.setSelected(empleadoidiomaBean.getes_lectura());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_lecturaEmpleadoIdioma.setText(empleadoidiomaBean.getporcen_lectura().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_escritoEmpleadoIdioma.setSelected(empleadoidiomaBean.getes_escrito());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_escritoEmpleadoIdioma.setText(empleadoidiomaBean.getporcen_escrito().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_habladoEmpleadoIdioma.setSelected(empleadoidiomaBean.getes_hablado());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_habladoEmpleadoIdioma.setText(empleadoidiomaBean.getporcen_hablado().toString());
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTextAreadescripcionEmpleadoIdioma.setText(empleadoidiomaBean.getdescripcion());
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesObjetoReturnGeneralToBeanEmpleadoIdioma(EmpleadoIdiomaParameterReturnGeneral empleadoidiomaReturnGeneral,EmpleadoIdiomaBean empleadoidiomaBean,Boolean conDefault) throws Exception { 
		try {
			EmpleadoIdioma empleadoidiomaLocal=new EmpleadoIdioma();
			
			empleadoidiomaLocal=empleadoidiomaReturnGeneral.getEmpleadoIdioma();
			
			
			if(conColumnasBase) {if(conDefault || (!conDefault && empleadoidiomaLocal.getId()!=null && !empleadoidiomaLocal.getId().equals(0L))) {empleadoidiomaBean.setId(empleadoidiomaLocal.getId());}}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getid_empleado()!=null && !empleadoidiomaLocal.getid_empleado().equals(-1L))) {empleadoidiomaBean.setid_empleado(empleadoidiomaLocal.getid_empleado());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getid_idioma()!=null && !empleadoidiomaLocal.getid_idioma().equals(-1L))) {empleadoidiomaBean.setid_idioma(empleadoidiomaLocal.getid_idioma());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getes_materna()!=null && !empleadoidiomaLocal.getes_materna().equals(false))) {empleadoidiomaBean.setes_materna(empleadoidiomaLocal.getes_materna());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getes_tecnico()!=null && !empleadoidiomaLocal.getes_tecnico().equals(false))) {empleadoidiomaBean.setes_tecnico(empleadoidiomaLocal.getes_tecnico());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getporcen_tecnico()!=null && !empleadoidiomaLocal.getporcen_tecnico().equals(0))) {empleadoidiomaBean.setporcen_tecnico(empleadoidiomaLocal.getporcen_tecnico());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getes_lectura()!=null && !empleadoidiomaLocal.getes_lectura().equals(false))) {empleadoidiomaBean.setes_lectura(empleadoidiomaLocal.getes_lectura());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getporcen_lectura()!=null && !empleadoidiomaLocal.getporcen_lectura().equals(0))) {empleadoidiomaBean.setporcen_lectura(empleadoidiomaLocal.getporcen_lectura());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getes_escrito()!=null && !empleadoidiomaLocal.getes_escrito().equals(false))) {empleadoidiomaBean.setes_escrito(empleadoidiomaLocal.getes_escrito());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getporcen_escrito()!=null && !empleadoidiomaLocal.getporcen_escrito().equals(0))) {empleadoidiomaBean.setporcen_escrito(empleadoidiomaLocal.getporcen_escrito());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getes_hablado()!=null && !empleadoidiomaLocal.getes_hablado().equals(false))) {empleadoidiomaBean.setes_hablado(empleadoidiomaLocal.getes_hablado());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getporcen_hablado()!=null && !empleadoidiomaLocal.getporcen_hablado().equals(0))) {empleadoidiomaBean.setporcen_hablado(empleadoidiomaLocal.getporcen_hablado());}
			if(conDefault || (!conDefault && empleadoidiomaLocal.getdescripcion()!=null && !empleadoidiomaLocal.getdescripcion().equals(""))) {empleadoidiomaBean.setdescripcion(empleadoidiomaLocal.getdescripcion());}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	@SuppressWarnings("rawtypes")
	public static void setActualComboBoxEmpleadoIdiomaGenerico(Long idEmpleadoIdiomaSeleccionado,JComboBox jComboBoxEmpleadoIdioma,List<EmpleadoIdioma> empleadoidiomasLocal)throws Exception {
		try {
			EmpleadoIdioma  empleadoidiomaTemp=null;

			for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomasLocal) {
				if(empleadoidiomaAux.getId()!=null && empleadoidiomaAux.getId().equals(idEmpleadoIdiomaSeleccionado)) {
					empleadoidiomaTemp=empleadoidiomaAux;
					break;
				}
			}

			jComboBoxEmpleadoIdioma.setSelectedItem(empleadoidiomaTemp);

		} catch(Exception e) {
			throw e;
		}
	}
	
	@SuppressWarnings("rawtypes")
	public static void setHotKeysComboBoxEmpleadoIdiomaGenerico(JComboBox jComboBoxEmpleadoIdioma,JInternalFrameBase jInternalFrameBase,String sNombreHotKeyAbstractAction,String sTipoBusqueda)throws Exception {
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
				
				jComboBoxEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Busqueda"));
				//BUSCAR
				
				
				//ACTUALIZAR
				sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_ACTUALIZAR");
				keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_ACTUALIZAR");
				
				jComboBoxEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
				jComboBoxEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction+"Update"));
				//ACTUALIZAR
				
				if(sTipoBusqueda.contains("CON_EVENT_CHANGE")) {
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoIdioma.addFocusListener(new ComboBoxFocusListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
						jComboBoxEmpleadoIdioma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));						
					}
					
					/*
					if(Constantes2.CON_COMBOBOX_ITEMLISTENER) {
						jComboBoxEmpleadoIdioma.addItemListener(new ComboBoxItemListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					} else {
						jComboBoxEmpleadoIdioma.addActionListener(new ComboBoxActionListener(jInternalFrameBase,sNombreHotKeyAbstractAction));
					}
					*/
				}								
				
				//CON_BUSQUEDA								
				if(sTipoBusqueda.contains("CON_BUSQUEDA")) {
					sKeyStrokeName = FuncionesSwing.getKeyNameControl("CONTROL_BUSQUEDA");
					keyStrokeControl=FuncionesSwing.getKeyStrokeControl("CONTROL_BUSQUEDA");
							
					jComboBoxEmpleadoIdioma.getInputMap().put(keyStrokeControl, sKeyStrokeName);
					jComboBoxEmpleadoIdioma.getActionMap().put(sKeyStrokeName, new ButtonAbstractAction(jInternalFrameBase,sNombreHotKeyAbstractAction));
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
			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public String getDescripcionFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		String sDescripcion="";
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoidioma=(EmpleadoIdioma) empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoidioma =(EmpleadoIdioma) empleadoidiomas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		if(sTipo.equals("Empresa")) {
			//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
			if(!empleadoidioma.getIsNew() && !empleadoidioma.getIsChanged() && !empleadoidioma.getIsDeleted()) {
				sDescripcion=empleadoidioma.getempresa_descripcion();
			} else {
				//sDescripcion=this.getActualEmpresaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoidioma.getempresa_descripcion();
			}
		}

		if(sTipo.equals("Empleado")) {
			//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
			if(!empleadoidioma.getIsNew() && !empleadoidioma.getIsChanged() && !empleadoidioma.getIsDeleted()) {
				sDescripcion=empleadoidioma.getempleado_descripcion();
			} else {
				//sDescripcion=this.getActualEmpleadoForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoidioma.getempleado_descripcion();
			}
		}

		if(sTipo.equals("Idioma")) {
			//sDescripcion=this.getActualIdiomaForeignKeyDescripcion((Long)value);
			if(!empleadoidioma.getIsNew() && !empleadoidioma.getIsChanged() && !empleadoidioma.getIsDeleted()) {
				sDescripcion=empleadoidioma.getidioma_descripcion();
			} else {
				//sDescripcion=this.getActualIdiomaForeignKeyDescripcion((Long)value);
				sDescripcion=empleadoidioma.getidioma_descripcion();
			}
		}

		
		return sDescripcion;
	}
	
	public Color getColorFk(String sTipo,JTable table,Object value,int intSelectedRow) throws Exception {
		//DESCRIPCIONES FK		
		Color color=Color.WHITE;
		
		EmpleadoIdioma empleadoidiomaRow=new EmpleadoIdioma();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoidiomaRow=(EmpleadoIdioma) empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[table.convertRowIndexToModel(intSelectedRow)];
		} else if(Constantes.ISUSAEJBREMOTE) {
			empleadoidiomaRow=(EmpleadoIdioma) empleadoidiomas.toArray()[table.convertRowIndexToModel(intSelectedRow)];
		}
					
		
		
		return color;
	}
	
	
	
	
	
	
	
	public void refrescarBindingTabla(Boolean blnSoloTabla) {
	}
	
	public void inicializarActualizarBindingBotonesManualEmpleadoIdioma(Boolean esSetControles) {						
		if(esSetControles) {
			this.jButtonNuevoEmpleadoIdioma.setVisible((this.isVisibilidadCeldaNuevoEmpleadoIdioma && this.isPermisoNuevoEmpleadoIdioma));			
			this.jButtonDuplicarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoIdioma && this.isPermisoDuplicarEmpleadoIdioma));			
			this.jButtonCopiarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaCopiarEmpleadoIdioma && this.isPermisoCopiarEmpleadoIdioma));
			this.jButtonVerFormEmpleadoIdioma.setVisible((this.isVisibilidadCeldaVerFormEmpleadoIdioma && this.isPermisoVerFormEmpleadoIdioma));
			
			this.jButtonAbrirOrderByEmpleadoIdioma.setVisible((this.isVisibilidadCeldaOrdenEmpleadoIdioma && this.isPermisoOrdenEmpleadoIdioma));			
			
			this.jButtonNuevoRelacionesEmpleadoIdioma.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma && this.isPermisoNuevoEmpleadoIdioma));			
			this.jButtonNuevoGuardarCambiosEmpleadoIdioma.setVisible((this.isVisibilidadCeldaNuevoEmpleadoIdioma && this.isPermisoNuevoEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma));
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonModificarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaModificarEmpleadoIdioma && this.isPermisoActualizarEmpleadoIdioma));	
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonActualizarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaActualizarEmpleadoIdioma && this.isPermisoActualizarEmpleadoIdioma));	
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonEliminarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaEliminarEmpleadoIdioma && this.isPermisoEliminarEmpleadoIdioma));
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonCancelarEmpleadoIdioma.setVisible(this.isVisibilidadCeldaCancelarEmpleadoIdioma);							
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosEmpleadoIdioma.setVisible((this.isVisibilidadCeldaGuardarEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma));			
			
			}
						
			this.jButtonGuardarCambiosTablaEmpleadoIdioma.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma));							
			
			//TOOLBAR
			
			this.jButtonNuevoToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaNuevoEmpleadoIdioma && this.isPermisoNuevoEmpleadoIdioma));						
			this.jButtonDuplicarToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoIdioma && this.isPermisoDuplicarEmpleadoIdioma));						
			this.jButtonCopiarToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaCopiarEmpleadoIdioma && this.isPermisoCopiarEmpleadoIdioma));			
			this.jButtonVerFormToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaVerFormEmpleadoIdioma && this.isPermisoVerFormEmpleadoIdioma));			
			this.jButtonAbrirOrderByToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaOrdenEmpleadoIdioma && this.isPermisoOrdenEmpleadoIdioma));
			this.jButtonNuevoRelacionesToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma && this.isPermisoNuevoEmpleadoIdioma));			
			this.jButtonNuevoGuardarCambiosToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaNuevoEmpleadoIdioma && this.isPermisoNuevoEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma));			
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonModificarToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaModificarEmpleadoIdioma && this.isPermisoActualizarEmpleadoIdioma));	
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonActualizarToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaActualizarEmpleadoIdioma  && this.isPermisoActualizarEmpleadoIdioma));	
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonEliminarToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaEliminarEmpleadoIdioma && this.isPermisoEliminarEmpleadoIdioma));
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonCancelarToolBarEmpleadoIdioma.setVisible(this.isVisibilidadCeldaCancelarEmpleadoIdioma);				
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaGuardarEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma));									
			}
			
			this.jButtonGuardarCambiosTablaToolBarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma));									
			
			//TOOLBAR
			
			//MENUS
			
			this.jMenuItemNuevoEmpleadoIdioma.setVisible((this.isVisibilidadCeldaNuevoEmpleadoIdioma && this.isPermisoNuevoEmpleadoIdioma));			
			this.jMenuItemDuplicarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaDuplicarEmpleadoIdioma && this.isPermisoDuplicarEmpleadoIdioma));			
			this.jMenuItemCopiarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaCopiarEmpleadoIdioma && this.isPermisoCopiarEmpleadoIdioma));			
			this.jMenuItemVerFormEmpleadoIdioma.setVisible((this.isVisibilidadCeldaVerFormEmpleadoIdioma && this.isPermisoVerFormEmpleadoIdioma));			
			this.jMenuItemAbrirOrderByEmpleadoIdioma.setVisible((this.isVisibilidadCeldaOrdenEmpleadoIdioma && this.isPermisoOrdenEmpleadoIdioma));			
			//this.jMenuItemMostrarOcultarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaOrdenEmpleadoIdioma && this.isPermisoOrdenEmpleadoIdioma));
			this.jMenuItemDetalleAbrirOrderByEmpleadoIdioma.setVisible((this.isVisibilidadCeldaOrdenEmpleadoIdioma && this.isPermisoOrdenEmpleadoIdioma));			
			//this.jMenuItemDetalleMostrarOcultarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaOrdenEmpleadoIdioma && this.isPermisoOrdenEmpleadoIdioma));			
			this.jMenuItemNuevoRelacionesEmpleadoIdioma.setVisible((this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma && this.isPermisoNuevoEmpleadoIdioma));			
			this.jMenuItemNuevoGuardarCambiosEmpleadoIdioma.setVisible((this.isVisibilidadCeldaNuevoEmpleadoIdioma && this.isPermisoNuevoEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma));									
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemModificarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaModificarEmpleadoIdioma && this.isPermisoActualizarEmpleadoIdioma));	
			this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemActualizarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaActualizarEmpleadoIdioma && this.isPermisoActualizarEmpleadoIdioma));	
			this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemEliminarEmpleadoIdioma.setVisible((this.isVisibilidadCeldaEliminarEmpleadoIdioma && this.isPermisoEliminarEmpleadoIdioma));
			this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemCancelarEmpleadoIdioma.setVisible(this.isVisibilidadCeldaCancelarEmpleadoIdioma);				
			}
			
			this.jMenuItemGuardarCambiosEmpleadoIdioma.setVisible((this.isVisibilidadCeldaGuardarEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma));						
			this.jMenuItemGuardarCambiosTablaEmpleadoIdioma.setVisible((this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma));						
			
			//MENUS
			
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=this.jButtonNuevoEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaDuplicarEmpleadoIdioma=this.jButtonDuplicarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaCopiarEmpleadoIdioma=this.jButtonCopiarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaVerFormEmpleadoIdioma=this.jButtonVerFormEmpleadoIdioma.isVisible();
			
			this.isVisibilidadCeldaOrdenEmpleadoIdioma=this.jButtonAbrirOrderByEmpleadoIdioma.isVisible();			
			
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=this.jButtonNuevoRelacionesEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaModificarEmpleadoIdioma=this.jButtonModificarEmpleadoIdioma.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonActualizarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonEliminarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonCancelarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaGuardarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosEmpleadoIdioma.isVisible();			
			}
			
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=this.jButtonGuardarCambiosTablaEmpleadoIdioma.isVisible();
			
			//TOOLBAR
			
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=this.jButtonNuevoToolBarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=this.jButtonNuevoRelacionesToolBarEmpleadoIdioma.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			this.isVisibilidadCeldaModificarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonModificarToolBarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonActualizarToolBarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonEliminarToolBarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonCancelarToolBarEmpleadoIdioma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoIdioma=this.jButtonGuardarCambiosToolBarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=this.jButtonGuardarCambiosTablaToolBarEmpleadoIdioma.isVisible();						
			
			//TOOLBAR
			
			//MENUS
			
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=this.jMenuItemNuevoEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=this.jMenuItemNuevoRelacionesEmpleadoIdioma.isVisible();
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			this.isVisibilidadCeldaModificarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemModificarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemActualizarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemEliminarEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemCancelarEmpleadoIdioma.isVisible();
			}
			
			this.isVisibilidadCeldaGuardarEmpleadoIdioma=this.jMenuItemGuardarCambiosEmpleadoIdioma.isVisible();
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=this.jMenuItemGuardarCambiosTablaEmpleadoIdioma.isVisible();						
			
			//MENUS
		}
	}
	
	public void inicializarActualizarBindingBotonesEmpleadoIdioma(Boolean esInicializar) {
		if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {			
			if(this.empleadoidiomaSessionBean.getConGuardarRelaciones()) {
				//if(this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
				
				this.actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoIdioma();
			}
			
			this.inicializarActualizarBindingBotonesManualEmpleadoIdioma(true);
			
		} else {	
		}
	}		
	
	public void inicializarActualizarBindingBotonesPermisosManualEmpleadoIdioma() {
		this.jButtonNuevoEmpleadoIdioma.setVisible(this.isPermisoNuevoEmpleadoIdioma);			
		this.jButtonDuplicarEmpleadoIdioma.setVisible(this.isPermisoDuplicarEmpleadoIdioma);			
		this.jButtonCopiarEmpleadoIdioma.setVisible(this.isPermisoCopiarEmpleadoIdioma);			
		this.jButtonVerFormEmpleadoIdioma.setVisible(this.isPermisoVerFormEmpleadoIdioma);			
		
		this.jButtonAbrirOrderByEmpleadoIdioma.setVisible(this.isPermisoOrdenEmpleadoIdioma);					
		
		this.jButtonNuevoRelacionesEmpleadoIdioma.setVisible(this.isPermisoNuevoEmpleadoIdioma);			
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonModificarEmpleadoIdioma.setVisible(this.isPermisoActualizarEmpleadoIdioma);	
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonActualizarEmpleadoIdioma.setVisible(this.isPermisoActualizarEmpleadoIdioma);	
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonEliminarEmpleadoIdioma.setVisible(this.isPermisoEliminarEmpleadoIdioma);
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonCancelarEmpleadoIdioma.setVisible(this.isVisibilidadCeldaCancelarEmpleadoIdioma);						
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosEmpleadoIdioma.setVisible(this.isPermisoGuardarCambiosEmpleadoIdioma);							
		}
		
		this.jButtonGuardarCambiosTablaEmpleadoIdioma.setVisible(this.isPermisoActualizarEmpleadoIdioma);
	}
	
	public void inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoIdioma() {
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonModificarEmpleadoIdioma.setVisible(this.isPermisoActualizarEmpleadoIdioma);	
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonActualizarEmpleadoIdioma.setVisible(this.isPermisoActualizarEmpleadoIdioma);	
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonEliminarEmpleadoIdioma.setVisible(this.isPermisoEliminarEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonCancelarEmpleadoIdioma.setVisible(this.isVisibilidadCeldaCancelarEmpleadoIdioma);							
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosEmpleadoIdioma.setVisible((this.isVisibilidadCeldaGuardarEmpleadoIdioma && this.isPermisoGuardarCambiosEmpleadoIdioma));			
	}
	
	public void inicializarActualizarBindingBotonesPermisosEmpleadoIdioma() {
		if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL) {
			this.inicializarActualizarBindingBotonesPermisosManualEmpleadoIdioma();
		} else {
		}
	}
	
	
	public void refrescarBindingBotonesEmpleadoIdioma() {
	}
	
	public void jTableDatosEmpleadoIdiomaListSelectionListener(javax.swing.event.ListSelectionEvent evt) throws Exception { 
		try {
			this.seleccionarEmpleadoIdioma(null,evt,-1);
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void jButtonidEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getId()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id = "+this.empleadoidioma.getId().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empresaEmpleadoIdiomaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempresa=true;

			idTienePermisoempresa=this.tienePermisosUsuarioEnPaginaWebEmpleadoIdioma(EmpresaConstantesFunciones.CLASSNAME);

			if(idTienePermisoempresa) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoIdioma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoIdioma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);

				this.empresaBeanSwingJInternalFrame=new EmpresaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empresaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empresaBeanSwingJInternalFrame.getEmpresaLogic().setConnexion(this.empleadoidiomaLogic.getConnexion());

				if(this.empleadoidioma.getid_empresa()!=null) {
					this.empresaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empresaBeanSwingJInternalFrame.setIdActual(this.empleadoidioma.getid_empresa());
					this.empresaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empresaBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpresa();
				}

				JInternalFrameBase jinternalFrame =this.empresaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoIdioma=(TitledBorder)this.jScrollPanelDatosEmpleadoIdioma.getBorder();
				TitledBorder titledBorderempresa=(TitledBorder)this.empresaBeanSwingJInternalFrame.jScrollPanelDatosEmpresa.getBorder();

				titledBorderempresa.setTitle(titledBorderEmpleadoIdioma.getTitle() + " -> Empresa");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empresaEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getid_empresa()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empresa = "+this.empleadoidioma.getid_empresa().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_empleadoEmpleadoIdiomaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
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


			TitledBorder titledBorderEmpleadoIdioma=null;
			TitledBorder titledBorderempleado=null;

			if(!this.jScrollPanelDatosEmpleadoIdioma.getBorder().getClass().equals(EmptyBorder.class)) {
				titledBorderEmpleadoIdioma=(TitledBorder)this.jScrollPanelDatosEmpleadoIdioma.getBorder();
				titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoIdioma.getTitle() + " -> Empleado");
			}

			if(!Constantes.CON_VARIAS_VENTANAS) {
				MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
			}

			this.jDesktopPane.add(jinternalFrame);

			jinternalFrame.setSelected(true);

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}

	public void jButtonid_empleadoEmpleadoIdiomaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoempleado=true;

			idTienePermisoempleado=this.tienePermisosUsuarioEnPaginaWebEmpleadoIdioma(EmpleadoConstantesFunciones.CLASSNAME);

			if(idTienePermisoempleado) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoIdioma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoIdioma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);

				this.empleadoBeanSwingJInternalFrame=new EmpleadoBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.empleadoBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.empleadoBeanSwingJInternalFrame.getEmpleadoLogic().setConnexion(this.empleadoidiomaLogic.getConnexion());

				if(this.empleadoidioma.getid_empleado()!=null) {
					this.empleadoBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.empleadoBeanSwingJInternalFrame.setIdActual(this.empleadoidioma.getid_empleado());
					this.empleadoBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.empleadoBeanSwingJInternalFrame.inicializarActualizarBindingTablaEmpleado();
				}

				JInternalFrameBase jinternalFrame =this.empleadoBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoIdioma=(TitledBorder)this.jScrollPanelDatosEmpleadoIdioma.getBorder();
				TitledBorder titledBorderempleado=(TitledBorder)this.empleadoBeanSwingJInternalFrame.jScrollPanelDatosEmpleado.getBorder();

				titledBorderempleado.setTitle(titledBorderEmpleadoIdioma.getTitle() + " -> Empleado");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_empleadoEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getid_empleado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_empleado = "+this.empleadoidioma.getid_empleado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonid_idiomaEmpleadoIdiomaUpdateActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}

			Boolean idTienePermisoidioma=true;

			idTienePermisoidioma=this.tienePermisosUsuarioEnPaginaWebEmpleadoIdioma(IdiomaConstantesFunciones.CLASSNAME);

			if(idTienePermisoidioma) {
				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow<0 && this.jTableDatosEmpleadoIdioma.getRowCount()>0) {
					intSelectedRow =0;
					this.jTableDatosEmpleadoIdioma.setRowSelectionInterval(intSelectedRow,intSelectedRow);
				}
				//ARCHITECTURE
				/*
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				*/
				//ARCHITECTURE

				this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
				this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);

				this.idiomaBeanSwingJInternalFrame=new IdiomaBeanSwingJInternalFrame(true,true,this.jDesktopPane,this.usuarioActual,this.resumenUsuarioActual,this.moduloActual,this.opcionActual,this.parametroGeneralSg,this.parametroGeneralUsuario,PaginaTipo.AUXILIAR,false,false,false,true);
				this.idiomaBeanSwingJInternalFrame.setJInternalFrameParent(this);

				this.idiomaBeanSwingJInternalFrame.getIdiomaLogic().setConnexion(this.empleadoidiomaLogic.getConnexion());

				if(this.empleadoidioma.getid_idioma()!=null) {
					this.idiomaBeanSwingJInternalFrame.sTipoBusqueda="PorId";
					this.idiomaBeanSwingJInternalFrame.setIdActual(this.empleadoidioma.getid_idioma());
					this.idiomaBeanSwingJInternalFrame.procesarBusqueda("PorId");
					this.idiomaBeanSwingJInternalFrame.setsAccionBusqueda("PorId");
					this.idiomaBeanSwingJInternalFrame.inicializarActualizarBindingTablaIdioma();
				}

				JInternalFrameBase jinternalFrame =this.idiomaBeanSwingJInternalFrame;
				jinternalFrame.setAutoscrolls(true);
				//frame.setSize(screenSize.width-inset*7 , screenSize.height-inset*9);
				jinternalFrame.setVisible(true); 


				TitledBorder titledBorderEmpleadoIdioma=(TitledBorder)this.jScrollPanelDatosEmpleadoIdioma.getBorder();
				TitledBorder titledBorderidioma=(TitledBorder)this.idiomaBeanSwingJInternalFrame.jScrollPanelDatosIdioma.getBorder();

				titledBorderidioma.setTitle(titledBorderEmpleadoIdioma.getTitle() + " -> Idioma");


				if(!Constantes.CON_VARIAS_VENTANAS) {
					MainJFrame.cerrarJInternalFramesExistentes(this.jDesktopPane,jinternalFrame);
				}

				this.jDesktopPane.add(jinternalFrame);

				jinternalFrame.setSelected(true);
			} else {
				throw new Exception("NO TIENE PERMISO PARA TRABAJAR CON ESTA INFORMACION");
			}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}


		} catch(Exception e) {

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}

		}
	}

	public void jButtonid_idiomaEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getid_idioma()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where id_idioma = "+this.empleadoidioma.getid_idioma().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_maternaEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getes_materna()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_materna = "+this.empleadoidioma.getes_materna().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_tecnicoEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getes_tecnico()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_tecnico = "+this.empleadoidioma.getes_tecnico().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcen_tecnicoEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getporcen_tecnico()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcen_tecnico = "+this.empleadoidioma.getporcen_tecnico().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_lecturaEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getes_lectura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_lectura = "+this.empleadoidioma.getes_lectura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcen_lecturaEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getporcen_lectura()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcen_lectura = "+this.empleadoidioma.getporcen_lectura().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_escritoEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getes_escrito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_escrito = "+this.empleadoidioma.getes_escrito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcen_escritoEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getporcen_escrito()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcen_escrito = "+this.empleadoidioma.getporcen_escrito().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtones_habladoEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getes_hablado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where es_hablado = "+this.empleadoidioma.getes_hablado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtonporcen_habladoEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getporcen_hablado()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where porcen_hablado = "+this.empleadoidioma.getporcen_hablado().toString()+" ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	public void jButtondescripcionEmpleadoIdiomaBusquedaActionPerformed(java.awt.event.ActionEvent evt) throws Exception {
		try {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.getNewConnexionToDeep("");
				}

				//TOCA TRAER NUEVAMENTE, YA QUE SE PIERDE REGISTRO ACTUAL
				int intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();

				if(intSelectedRow>-1) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.getempleadoidioma(),true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
					//ARCHITECTURE
					/*
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
						this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					*/
					//ARCHITECTURE

				} else {
					if(this.empleadoidioma==null) {
						this.empleadoidioma = new EmpleadoIdioma();
					}

					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);
				}

				if(this.empleadoidioma.getdescripcion()!=null) {

					this.sAccionBusqueda="Query";

					this.sFinalQueryGeneral=" where descripcion like '%"+this.empleadoidioma.getdescripcion()+"%' ";

					if(Constantes.ISDEVELOPING) {
						System.out.println(this.sFinalQueryGeneral);
					}

					this.procesarBusqueda(this.sAccionBusqueda);

					this.inicializarActualizarBindingEmpleadoIdioma(false);
				}

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.commitNewConnexionToDeep();
				}

			} catch(Exception e) {

				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
				}

				FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

			} finally {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaLogic.closeNewConnexionToDeep();
				}

			}
		}

	
	
	public void jButtonFK_IdEmpleadoEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoIdioma(false,false);

			this.getEmpleadoIdiomasFK_IdEmpleado();

			this.inicializarActualizarBindingEmpleadoIdioma(false);

			//if(EmpleadoIdiomaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoIdioma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdEmpresaEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoIdioma(false,false);

			this.getEmpleadoIdiomasFK_IdEmpresa();

			this.inicializarActualizarBindingEmpleadoIdioma(false);

			//if(EmpleadoIdiomaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoIdioma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
		}
	}

	public void jButtonFK_IdIdiomaEmpleadoIdiomaActionPerformed(ActionEvent evt) throws Exception {
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.getNewConnexionToDeep("");
			}

			this.iNumeroPaginacionPagina=0;
			this.inicializarActualizarBindingEmpleadoIdioma(false,false);

			this.getEmpleadoIdiomasFK_IdIdioma();

			this.inicializarActualizarBindingEmpleadoIdioma(false);

			//if(EmpleadoIdiomaBeanSwingJInternalFrame.ISBINDING_MANUAL) {
			//this.inicializarActualizarBindingEmpleadoIdioma(false,false);
			//}

			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.commitNewConnexionToDeep();
			}
		} catch(Exception e) {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.rollbackNewConnexionToDeep();
			}

			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);

		} finally {
			if(Constantes.ISUSAEJBLOGICLAYER) {
				this.empleadoidiomaLogic.closeNewConnexionToDeep();
			}
		}
	}

	
	public void closingInternalFrameEmpleadoIdioma() {
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			
		
		
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.setVisible(false);	    			
			this.jInternalFrameDetalleFormEmpleadoIdioma.dispose();
			this.jInternalFrameDetalleFormEmpleadoIdioma=null;
		}
		
		
		if(this.jInternalFrameReporteDinamicoEmpleadoIdioma!=null) {
			this.jInternalFrameReporteDinamicoEmpleadoIdioma.setVisible(false);	    			
			this.jInternalFrameReporteDinamicoEmpleadoIdioma.dispose();
			this.jInternalFrameReporteDinamicoEmpleadoIdioma=null;
		}
		
		if(this.jInternalFrameImportacionEmpleadoIdioma!=null) {
			this.jInternalFrameImportacionEmpleadoIdioma.setVisible(false);	    			
			this.jInternalFrameImportacionEmpleadoIdioma.dispose();
			this.jInternalFrameImportacionEmpleadoIdioma=null;
		}		
		
		
		this.setVisible(false);
		this.dispose();
		//this=null;
	}
	
	
	
	public void jButtonActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {			
			this.startProcessEmpleadoIdioma();
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
			
			if(sTipo.equals("NuevoEmpleadoIdioma")) {
				jButtonNuevoEmpleadoIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarEmpleadoIdioma")) {
				jButtonDuplicarEmpleadoIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("CopiarEmpleadoIdioma")) {
				jButtonCopiarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("VerFormEmpleadoIdioma")) {
				jButtonVerFormEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("NuevoToolBarEmpleadoIdioma")) {
				jButtonNuevoEmpleadoIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("DuplicarToolBarEmpleadoIdioma")) {
				jButtonDuplicarEmpleadoIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemNuevoEmpleadoIdioma")) {
				jButtonNuevoEmpleadoIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("MenuItemDuplicarEmpleadoIdioma")) {
				jButtonDuplicarEmpleadoIdiomaActionPerformed(evt,false);
			} else if(sTipo.equals("NuevoRelacionesEmpleadoIdioma")) {
				jButtonNuevoEmpleadoIdiomaActionPerformed(evt,true);
			} else if(sTipo.equals("NuevoRelacionesToolBarEmpleadoIdioma")) {
				jButtonNuevoEmpleadoIdiomaActionPerformed(evt,true);
			} else if(sTipo.equals("MenuItemNuevoRelacionesEmpleadoIdioma")) {
				jButtonNuevoEmpleadoIdiomaActionPerformed(evt,true);
			} else if(sTipo.equals("ModificarEmpleadoIdioma")) {
				jButtonModificarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("ModificarToolBarEmpleadoIdioma")) {
				jButtonModificarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemModificarEmpleadoIdioma")) {
				jButtonModificarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarEmpleadoIdioma")) {
				jButtonActualizarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("ActualizarToolBarEmpleadoIdioma")) {
				jButtonActualizarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemActualizarEmpleadoIdioma")) {
				jButtonActualizarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("EliminarEmpleadoIdioma")) {
				jButtonEliminarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("EliminarToolBarEmpleadoIdioma")) {
				jButtonEliminarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemEliminarEmpleadoIdioma")) {
				jButtonEliminarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("CancelarEmpleadoIdioma")) {
				jButtonCancelarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("CancelarToolBarEmpleadoIdioma")) {
				jButtonCancelarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCancelarEmpleadoIdioma")) {
				jButtonCancelarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("CerrarEmpleadoIdioma")) {
				jButtonCerrarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("CerrarToolBarEmpleadoIdioma")) {
				jButtonCerrarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCerrarEmpleadoIdioma")) {
				jButtonCerrarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MostrarOcultarToolBarEmpleadoIdioma")) {
				jButtonMostrarOcultarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemDetalleCerrarEmpleadoIdioma")) {
				jButtonCancelarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosEmpleadoIdioma")) {
				jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosToolBarEmpleadoIdioma")) {
				jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("CopiarToolBarEmpleadoIdioma")) {
				jButtonCopiarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("VerFormToolBarEmpleadoIdioma")) {
				jButtonVerFormEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosEmpleadoIdioma")) {
				jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemCopiarEmpleadoIdioma")) {
				jButtonCopiarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemVerFormEmpleadoIdioma")) {
				jButtonVerFormEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoIdioma")) {
				jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GuardarCambiosTablaToolBarEmpleadoIdioma")) {
				jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemGuardarCambiosTablaEmpleadoIdioma")) {
				jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionEmpleadoIdioma")) {
				jButtonRecargarInformacionEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("RecargarInformacionToolBarEmpleadoIdioma")) {
				jButtonRecargarInformacionEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemRecargarInformacionEmpleadoIdioma")) {
				jButtonRecargarInformacionEmpleadoIdiomaActionPerformed(evt);
			}
			else if(sTipo.equals("AnterioresEmpleadoIdioma")) {
				jButtonAnterioresEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("AnterioresToolBarEmpleadoIdioma")) {
				jButtonAnterioresEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAnterioreEmpleadoIdioma")) {
				jButtonAnterioresEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesEmpleadoIdioma")) {
				jButtonSiguientesEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("SiguientesToolBarEmpleadoIdioma")) {
				jButtonSiguientesEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemSiguientesEmpleadoIdioma")) {
				jButtonSiguientesEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemAbrirOrderByEmpleadoIdioma") || sTipo.equals("MenuItemDetalleAbrirOrderByEmpleadoIdioma")) {
				jButtonAbrirOrderByEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemMostrarOcultarEmpleadoIdioma") || sTipo.equals("MenuItemDetalleMostrarOcultarEmpleadoIdioma")) {
				jButtonMostrarOcultarEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoIdioma")) {
				jButtonNuevoGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("NuevoGuardarCambiosToolBarEmpleadoIdioma")) {
				jButtonNuevoGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("MenuItemNuevoGuardarCambiosEmpleadoIdioma")) {
				jButtonNuevoGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			} 
			else if(sTipo.equals("CerrarReporteDinamicoEmpleadoIdioma")) {
				jButtonCerrarReporteDinamicoEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GenerarReporteDinamicoEmpleadoIdioma")) {
				jButtonGenerarReporteDinamicoEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GenerarExcelReporteDinamicoEmpleadoIdioma")) {
				
				jButtonGenerarExcelReporteDinamicoEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarImportacionEmpleadoIdioma")) {
				jButtonCerrarImportacionEmpleadoIdiomaActionPerformed(evt);
			} else if(sTipo.equals("GenerarImportacionEmpleadoIdioma")) {
				
				jButtonGenerarImportacionEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirImportacionEmpleadoIdioma")) {
				
				jButtonAbrirImportacionEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("TiposAccionesEmpleadoIdioma")) {
				jComboBoxTiposAccionesEmpleadoIdiomaActionListener(evt,false);
			} else if(sTipo.equals("TiposRelacionesEmpleadoIdioma")) {
				jComboBoxTiposRelacionesEmpleadoIdiomaActionListener(evt);
			} else if(sTipo.equals("TiposAccionesFormularioEmpleadoIdioma")) {
				jComboBoxTiposAccionesEmpleadoIdiomaActionListener(evt,true);
			} else if(sTipo.equals("TiposSeleccionarEmpleadoIdioma")) {
				
				jComboBoxTiposSeleccionarEmpleadoIdiomaActionListener(evt);
				
			} else if(sTipo.equals("ValorCampoGeneralEmpleadoIdioma")) {
				jTextFieldValorCampoGeneralEmpleadoIdiomaActionListener(evt);
			}
			
			
			else if(sTipo.equals("AbrirOrderByEmpleadoIdioma")) {
				jButtonAbrirOrderByEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("AbrirOrderByToolBarEmpleadoIdioma")) {
				jButtonAbrirOrderByEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarOrderByEmpleadoIdioma")) {
				jButtonCerrarOrderByEmpleadoIdiomaActionPerformed(evt);
			} 
						
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoIdiomaBusqueda")) {
				this.jButtonidEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoIdiomaUpdate")) {
				this.jButtonid_empresaEmpleadoIdiomaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoIdiomaBusqueda")) {
				this.jButtonid_empresaEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoIdioma")) {
				this.jButtonid_empleadoEmpleadoIdiomaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoIdiomaUpdate")) {
				this.jButtonid_empleadoEmpleadoIdiomaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoIdiomaBusqueda")) {
				this.jButtonid_empleadoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_idiomaEmpleadoIdiomaUpdate")) {
				this.jButtonid_idiomaEmpleadoIdiomaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_idiomaEmpleadoIdiomaBusqueda")) {
				this.jButtonid_idiomaEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_maternaEmpleadoIdiomaBusqueda")) {
				this.jButtones_maternaEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_tecnicoEmpleadoIdiomaBusqueda")) {
				this.jButtones_tecnicoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_tecnicoEmpleadoIdiomaBusqueda")) {
				this.jButtonporcen_tecnicoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_lecturaEmpleadoIdiomaBusqueda")) {
				this.jButtones_lecturaEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_lecturaEmpleadoIdiomaBusqueda")) {
				this.jButtonporcen_lecturaEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_escritoEmpleadoIdiomaBusqueda")) {
				this.jButtones_escritoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_escritoEmpleadoIdiomaBusqueda")) {
				this.jButtonporcen_escritoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_habladoEmpleadoIdiomaBusqueda")) {
				this.jButtones_habladoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_habladoEmpleadoIdiomaBusqueda")) {
				this.jButtonporcen_habladoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpleadoIdiomaBusqueda")) {
				this.jButtondescripcionEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("id_empleadoEmpleadoIdioma")) {
				this.jButtonid_empleadoEmpleadoIdiomaActionPerformed(evt);
			}
			
			
			else if(sTipo.equals("FK_IdEmpleadoEmpleadoIdioma")) {
				this.jButtonFK_IdEmpleadoEmpleadoIdiomaActionPerformed(evt);
			}
			else if(sTipo.equals("FK_IdIdiomaEmpleadoIdioma")) {
				this.jButtonFK_IdIdiomaEmpleadoIdiomaActionPerformed(evt);
			}
			
			;
			
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.BUTTON,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
			
  		} finally {
      		this.finishProcessEmpleadoIdioma();
      	}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoIdiomaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				


				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
				}
				
			} catch(Exception e) {
  				FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  			}
    }
	
	public Boolean existeCambioValor(ControlTipo controlTipo,String sTipo) throws Exception {
		Boolean existeCambio=true;
		
		try {
			EmpleadoIdioma empleadoidiomaLocal=null;
			
			if(!this.getEsControlTabla()) {
				empleadoidiomaLocal=this.empleadoidioma;
			} else {
				empleadoidiomaLocal=this.empleadoidiomaAnterior;
			}
			
			if(controlTipo.equals(ControlTipo.TEXTBOX)) {
				


			}
		
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
							
				
				


				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoIdiomaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
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
			
			


			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE QUITA ALGUN CARACTER
	public void jTextFieldRemoveUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//CUANDO SE INGRESA ALGUN CARACTER
	public void jTextFieldInsertUpdateGeneral(String sTipo,JTextField jTextField,DocumentEvent evt) { 	  
		try {
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//FUNCIONA AL APLASTAR ENTER
	public void jFormattedTextFieldActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoIdiomaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
								
						
				


				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"DATE",esControlTabla,conIrServidorAplicacionParent,
							id,JFormattedTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
								
				
				


				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.DATE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jTextField, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jFormattedTextFieldFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoIdiomaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusLostGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl() && this.existeCambioValor(ControlTipo.DATE,sTipo)) {
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
			}	
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoIdiomaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }	
	
	public void jDateChooserActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoIdiomaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
							
				
				


				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"TEXTAREA",esControlTabla,conIrServidorAplicacionParent,
							id,jTextArea, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoIdiomaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
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
			
			


			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTAREA,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
			*/
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaRemoveUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			//System.out.println("REMOVE");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jTextAreaInsertUpdateGeneral(String sTipo,JTextArea jTextArea,DocumentEvent evt) { 	  
		try {
			
			//System.out.println("INSERT");
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jTextAreaActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoIdiomaActual();
			
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
								
				
				


				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jLabel, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.TEXTBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jLabelFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoIdiomaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	//NO EXISTE O NO ES APLICABLE
	public void jLabelActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoIdiomaActual();
				
			this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
			
			this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxItemListenerGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoIdiomaActual();
				
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
												
				
				if(sTipo.equals("SeleccionarTodosEmpleadoIdioma")) {
					jCheckBoxSeleccionarTodosEmpleadoIdiomaItemListener(evt);
				
				} else if(sTipo.equals("SeleccionadosEmpleadoIdioma")) {
					jCheckBoxSeleccionadosEmpleadoIdiomaItemListener(evt);
				
				} else if(sTipo.equals("NuevoToolBarEmpleadoIdioma")) {
					
				}
				
				


				
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}	
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
				
				//this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				//this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
												
				
				


				
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
					
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jCheckBox, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoIdiomaActual();
			
				//SELECCIONA FILA A OBJETO ANTERIOR
				Integer intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
						
				if(intSelectedRow!=null && intSelectedRow>-1) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {
						this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
						this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
					}
					//ARCHITECTURE
					
					//System.out.println(this.banco);
				}
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void jCheckBoxActionPerformedGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoIdiomaActual();
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.CHECKBOX,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
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
			
			


			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			*/						
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}		
    }
	
	@SuppressWarnings("rawtypes")
	public void jComboBoxItemStateChangedGeneral(String sTipo,ItemEvent evt) { 	  
		try {
			if (evt.getStateChange() == ItemEvent.SELECTED && this.permiteManejarEventosControl()) {
				//SELECCIONA FILA A OBJETO ACTUAL			
				this.seleccionarFilaTablaEmpleadoIdiomaActual();
			
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
				
				
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				String sFinalQueryCombo="";
				
				


				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
				
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
								
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"COMBOBOX",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
			
				this.actualizarInformacion("EVENTO_CONTROL",false,this.empleadoidioma);
				
				this.actualizarInformacion("INFO_PADRE",false,this.empleadoidioma);
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
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
				
				


				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				
				if(esUsoDesdeHijoLocal) {
					Long id=0L;
					
					generalEntityParameterGeneral.setEventoGlobalTipo(EventoGlobalTipo.FORM_HIJO_ACTUALIZAR);
					generalEntityParameterGeneral.setsDominio("Formulario");
					generalEntityParameterGeneral.setsDominioTipo(EmpleadoIdioma.class.getName());
				
					if(this.jInternalFrameParent!=null) {
						this.jInternalFrameParent.setEventoParentGeneral(esUsoDesdeHijoLocal,"Formulario",EmpleadoIdioma.class.getName(),sTipo,"TEXTFIELD",esControlTabla,conIrServidorAplicacionParent,
							id,jComboBoxGenerico, EventoGlobalTipo.FORM_HIJO_ACTUALIZAR,ControlTipo.COMBOBOX,EventoTipo.CHANGE,EventoSubTipo.CHANGED,arrClasses,
							evt,generalEntityParameterGeneral,null);
					}
				}			
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
		
		*/
    }
	
	public void jComboBoxFocusGainedGeneral(String sTipo,java.awt.event.FocusEvent evt) { 	  
		try {
			//SELECCIONA FILA A OBJETO ACTUAL			
			this.seleccionarFilaTablaEmpleadoIdiomaActual();
			
			//SELECCIONA FILA A OBJETO ANTERIOR
			Integer intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
					
			if(intSelectedRow!=null && intSelectedRow>-1) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
					this.empleadoidiomaAnterior =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
				}
				//ARCHITECTURE
				
				//System.out.println(this.banco);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }		
	
	public void tableValueChangedGeneral(String sTipo,ListSelectionEvent evt) { 	  
		try {
			if(this.permiteManejarEventosControl()) {
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				if(sTipo.equals("TableDatosSeleccionarEmpleadoIdioma")) {
					//BYDAN_DESHABILITADO
					//try {jTableDatosEmpleadoIdiomaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
					
					//SOLO CUANDO MOUSE ES SOLTADO
					if (!evt.getValueIsAdjusting()) {
						//SELECCIONA FILA A OBJETO ACTUAL
						Integer intSelectedRow = this.jTableDatosEmpleadoIdioma.getSelectedRow();
						
						if(intSelectedRow!=null && intSelectedRow>-1) {
							//ARCHITECTURE
							if(Constantes.ISUSAEJBLOGICLAYER) {
								this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
							} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
								this.empleadoidioma =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(intSelectedRow)];
							}
							//ARCHITECTURE
							
							//System.out.println(this.empleadoidioma);
						}
					}
					
				} else if(sTipo.equals("jButtonCancelarEmpleadoIdioma")) {
				
				}
				
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.CHANGE,EventoSubTipo.CHANGED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			}
			
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void tableMouseAdapterGeneral(String sTipo,MouseEvent evt) { 	  
		try {
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
			if(sTipo.equals("DatosSeleccionarEmpleadoIdioma")) {
				if (evt.getClickCount() == 2) {
					jButtonIdActionPerformed(null,jTableDatosEmpleadoIdioma.getSelectedRow(),false,false);
				}	
			} else if(sTipo.equals("jButtonCancelarEmpleadoIdioma")) {
			
			}
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.TABLE,EventoTipo.MOUSE,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	;
	
	public void jButtonActionPerformedTecladoGeneral(String sTipo,ActionEvent evt) { 	  
		try {
			this.startProcessEmpleadoIdioma();
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
			if(sTipo.equals("NuevoEmpleadoIdioma")) {
				jButtonNuevoEmpleadoIdiomaActionPerformed(evt,false);
				
			} else if(sTipo.equals("DuplicarEmpleadoIdioma")) {
				jButtonDuplicarEmpleadoIdiomaActionPerformed(evt,false);
				
			} else if(sTipo.equals("CopiarEmpleadoIdioma")) {
				jButtonCopiarEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("VerFormEmpleadoIdioma")) {
				jButtonVerFormEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("NuevoRelacionesEmpleadoIdioma")) {
				jButtonNuevoEmpleadoIdiomaActionPerformed(evt,true);
				
			} else if(sTipo.equals("ModificarEmpleadoIdioma")) {
				jButtonModificarEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("ActualizarEmpleadoIdioma")) {
				jButtonActualizarEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("EliminarEmpleadoIdioma")) {
				jButtonEliminarEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosTablaEmpleadoIdioma")) {
				jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("CancelarEmpleadoIdioma")) {
				jButtonCancelarEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("CerrarEmpleadoIdioma")) {
				jButtonCerrarEmpleadoIdiomaActionPerformed(evt);
				
			} else if(sTipo.equals("GuardarCambiosEmpleadoIdioma")) {
				jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			
			} else if(sTipo.equals("NuevoGuardarCambiosEmpleadoIdioma")) {
				jButtonNuevoGuardarCambiosEmpleadoIdiomaActionPerformed(evt);
			
			} else if(sTipo.equals("AbrirOrderByEmpleadoIdioma")) {
				jButtonAbrirOrderByEmpleadoIdiomaActionPerformed(evt);
			
			} else if(sTipo.equals("RecargarInformacionEmpleadoIdioma")) {
				jButtonRecargarInformacionEmpleadoIdiomaActionPerformed(evt);
			
			} else if(sTipo.equals("AnterioresEmpleadoIdioma")) {
				jButtonAnterioresEmpleadoIdiomaActionPerformed(evt);			
			
			}  else if(sTipo.equals("SiguientesEmpleadoIdioma")) {
				jButtonSiguientesEmpleadoIdiomaActionPerformed(evt);			
			} 
			
			
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("idEmpleadoIdiomaBusqueda")) {
				this.jButtonidEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empresaEmpleadoIdiomaUpdate")) {
				this.jButtonid_empresaEmpleadoIdiomaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empresaEmpleadoIdiomaBusqueda")) {
				this.jButtonid_empresaEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoIdioma")) {
				this.jButtonid_empleadoEmpleadoIdiomaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoIdiomaUpdate")) {
				this.jButtonid_empleadoEmpleadoIdiomaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_empleadoEmpleadoIdiomaBusqueda")) {
				this.jButtonid_empleadoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//ACTUALIZAR CAMPO
			else if(sTipo.equals("id_idiomaEmpleadoIdiomaUpdate")) {
				this.jButtonid_idiomaEmpleadoIdiomaUpdateActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("id_idiomaEmpleadoIdiomaBusqueda")) {
				this.jButtonid_idiomaEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_maternaEmpleadoIdiomaBusqueda")) {
				this.jButtones_maternaEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_tecnicoEmpleadoIdiomaBusqueda")) {
				this.jButtones_tecnicoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_tecnicoEmpleadoIdiomaBusqueda")) {
				this.jButtonporcen_tecnicoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_lecturaEmpleadoIdiomaBusqueda")) {
				this.jButtones_lecturaEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_lecturaEmpleadoIdiomaBusqueda")) {
				this.jButtonporcen_lecturaEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_escritoEmpleadoIdiomaBusqueda")) {
				this.jButtones_escritoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_escritoEmpleadoIdiomaBusqueda")) {
				this.jButtonporcen_escritoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("es_habladoEmpleadoIdiomaBusqueda")) {
				this.jButtones_habladoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("porcen_habladoEmpleadoIdiomaBusqueda")) {
				this.jButtonporcen_habladoEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			//BUSQUEDA GENERAL CAMPO
			else if(sTipo.equals("descripcionEmpleadoIdiomaBusqueda")) {
				this.jButtondescripcionEmpleadoIdiomaBusquedaActionPerformed(evt);
			}
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.KEY,EventoTipo.CLIC,EventoSubTipo.CLICKED,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
			
  		}  finally {
      		this.finishProcessEmpleadoIdioma();
      	}
    }
	
	public void internalFrameClosingInternalFrameGeneral(String sTipo,InternalFrameEvent evt) { 	  
		try {
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
			
			if(sTipo.equals("CloseInternalFrameEmpleadoIdioma")) {
				closingInternalFrameEmpleadoIdioma();
				
			} else if(sTipo.equals("jButtonCancelarEmpleadoIdioma")) {
				JInternalFrameBase jInternalFrameDetalleFormEmpleadoIdioma = (JInternalFrameBase)evt.getSource();
	            	
	            EmpleadoIdiomaBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoIdiomaBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoIdioma.getjInternalFrameParent();
	            
				jInternalFrameParent.jButtonCancelarEmpleadoIdiomaActionPerformed(null);
			}
			
			EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,ControlTipo.WINDOW,EventoTipo.CLIC,EventoSubTipo.CLOSING,sTipo,this.empleadoidioma,new Object(),this.empleadoidiomaParameterGeneral,this.empleadoidiomaReturnGeneral);
  		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	public void recargarFormEmpleadoIdioma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion) throws Exception {
		this.recargarFormEmpleadoIdioma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,false);
	}
	
	public void recargarFormEmpleadoIdioma(String sTipo,String sDominio,EventoGlobalTipo eventoGlobalTipo,ControlTipo controlTipo,EventoTipo eventoTipo,EventoSubTipo eventoSubTipo,String sTipoGeneral,ArrayList<Classe> classes,Boolean conIrServidorAplicacion,Boolean esControlTabla) throws Exception {
		if(this.permiteRecargarForm && this.permiteMantenimiento(this.empleadoidioma)) {
			if(!esControlTabla) {
				if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {			
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);			
				}
				
				if(this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones()) {
					this.setVariablesFormularioRelacionesToObjetoActualEmpleadoIdioma(this.empleadoidioma,classes);				
				}
			
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoidiomaReturnGeneral=empleadoidiomaLogic.procesarEventosEmpleadoIdiomasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoidiomaLogic.getEmpleadoIdiomas(),this.empleadoidioma,this.empleadoidiomaParameterGeneral,this.isEsNuevoEmpleadoIdioma,classes);//this.empleadoidiomaLogic.getEmpleadoIdioma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
					
					//ACTUALIZA VARIABLES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					//this.setVariablesObjetoReturnGeneralToBeanEmpleadoIdioma(this.empleadoidiomaReturnGeneral,this.empleadoidiomaBean,false);
						
					//ACTUALIZA VARIABLES RELACIONES DEFECTO DESDE LOGIC A RETURN GENERAL Y LUEGO A BEAN
					if(this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones()) {
						//this.setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoIdioma(classes,this.empleadoidiomaReturnGeneral,this.empleadoidiomaBean,false);
					}
						
					if(this.empleadoidiomaReturnGeneral.getConRecargarPropiedades()) {
						//INICIALIZA VARIABLES COMBOS NORMALES (FK)
						this.setVariablesObjetoActualToFormularioForeignKeyEmpleadoIdioma(this.empleadoidiomaReturnGeneral.getEmpleadoIdioma());
							
						//INICIALIZA VARIABLES NORMALES A FORMULARIO(SIN FK)
						this.setVariablesObjetoActualToFormularioEmpleadoIdioma(this.empleadoidiomaReturnGeneral.getEmpleadoIdioma());	
					}
						
					if(this.empleadoidiomaReturnGeneral.getConRecargarRelaciones()) {
						//INICIALIZA VARIABLES RELACIONES A FORMULARIO
						this.setVariablesRelacionesObjetoActualToFormularioEmpleadoIdioma(this.empleadoidiomaReturnGeneral.getEmpleadoIdioma(),classes);//this.empleadoidiomaBean);	
					}									
					
				} else {				
					//INICIALIZA VARIABLES RELACIONES A FORMULARIO
					this.setVariablesRelacionesObjetoActualToFormularioEmpleadoIdioma(this.empleadoidioma,classes);//this.empleadoidiomaBean);									
				}
			
				if(EmpleadoIdiomaJInternalFrame.ISBINDING_MANUAL_TABLA) {
					this.setVariablesFormularioToObjetoActualEmpleadoIdioma(this.empleadoidioma,true,false);
					this.setVariablesFormularioToObjetoActualForeignKeysEmpleadoIdioma(this.empleadoidioma);				
				}
				
			} else {
				
				if(((controlTipo.equals(ControlTipo.TEXTBOX) || controlTipo.equals(ControlTipo.DATE)
					|| controlTipo.equals(ControlTipo.TEXTAREA) || controlTipo.equals(ControlTipo.COMBOBOX)
					)				
					&& eventoTipo.equals(EventoTipo.CHANGE)
					)
					
					|| (controlTipo.equals(ControlTipo.CHECKBOX) && eventoTipo.equals(EventoTipo.CLIC))
					
				) { // && sTipoGeneral.equals("TEXTBOX")
					
					if(this.empleadoidiomaAnterior!=null) {
						this.empleadoidioma=this.empleadoidiomaAnterior;
					}
				}
				
				if(conIrServidorAplicacion) {
					//ARCHITECTURE
					if(Constantes.ISUSAEJBLOGICLAYER) {						
						this.empleadoidiomaReturnGeneral=empleadoidiomaLogic.procesarEventosEmpleadoIdiomasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoidiomaLogic.getEmpleadoIdiomas(),this.empleadoidioma,this.empleadoidiomaParameterGeneral,this.isEsNuevoEmpleadoIdioma,classes);//this.empleadoidiomaLogic.getEmpleadoIdioma()//sTipoGeneral
									
					} else if(Constantes.ISUSAEJBREMOTE) {
									
					} else if(Constantes.ISUSAEJBHOME) {
					}
					//ARCHITECTURE
				}
				
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {
					//NO ENTENDIBLE PORQUE PONER
					//if(this.empleadoidiomaSessionBean.getEstaModoGuardarRelaciones() 
					//	|| this.empleadoidiomaSessionBean.getEsGuardarRelacionado())	{
						actualizarLista(this.empleadoidiomaReturnGeneral.getEmpleadoIdioma(),empleadoidiomaLogic.getEmpleadoIdiomas());
					//}
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					actualizarLista(this.empleadoidiomaReturnGeneral.getEmpleadoIdioma(),this.empleadoidiomas);
				}
				//ARCHITECTURE
				
				//this.jTableDatosEmpleadoIdioma.repaint();
				
				//((AbstractTableModel) this.jTableDatosEmpleadoIdioma.getModel()).fireTableDataChanged();
				
				this.actualizarVisualTableDatosEmpleadoIdioma();
			}
		}
	}
	
	public void actualizarVisualTableDatosEmpleadoIdioma() throws Exception {
		
		EmpleadoIdiomaModel empleadoidiomaModel=(EmpleadoIdiomaModel)this.jTableDatosEmpleadoIdioma.getModel();
		
		if(Constantes.ISUSAEJBLOGICLAYER) {
			empleadoidiomaModel.empleadoidiomas=this.empleadoidiomaLogic.getEmpleadoIdiomas();
		
		} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME ) {
			empleadoidiomaModel.empleadoidiomas=this.empleadoidiomas;
		}
		
		
		((EmpleadoIdiomaModel) this.jTableDatosEmpleadoIdioma.getModel()).fireTableDataChanged();
	}
	
	public void actualizarVisualTableDatosEventosVistaEmpleadoIdioma() throws Exception {
		
		//ARCHITECTURE
		if(Constantes.ISUSAEJBLOGICLAYER) {
			this.actualizarLista(this.getempleadoidiomaAnterior(),this.empleadoidiomaLogic.getEmpleadoIdiomas());
					
		} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
			this.actualizarLista(this.getempleadoidiomaAnterior(),this.empleadoidiomas);
		}
		//ARCHITECTURE
						
		this.actualizarFilaTotales();
						
		this.actualizarVisualTableDatosEmpleadoIdioma();	
	}
	
	public void setVariablesRelacionesObjetoActualToFormularioEmpleadoIdioma(EmpleadoIdioma empleadoidioma,ArrayList<Classe> classes) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
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
										
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.BEFORE,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoidioma,new Object(),generalEntityParameterGeneral,this.empleadoidiomaReturnGeneral);
				
				ArrayList<Classe> classes=new ArrayList<Classe>();
				
				for(String sClasse:arrClasses) {
					if(sClasse.equals("TODOS")) {
						conTodasRelaciones=true;
						break;
					}
				}
				
				if(this.empleadoidiomaSessionBean.getConGuardarRelaciones()) {
					if(conTodasRelaciones) {
						classes=EmpleadoIdiomaConstantesFunciones.getClassesRelationshipsOfEmpleadoIdioma(new ArrayList<Classe>(),DeepLoadType.NONE);
					} else {
						classes=EmpleadoIdiomaConstantesFunciones.getClassesRelationshipsFromStringsOfEmpleadoIdioma(arrClasses,DeepLoadType.NONE);
					}
				}
	
				this.classesActual=new ArrayList<Classe>();
				this.classesActual.addAll(classes);
	
				this.recargarFormEmpleadoIdioma(sTipo,sDominio,eventoGlobalTipo,controlTipo,eventoTipo,eventoSubTipo,sTipoGeneral,classes,conIrServidorAplicacion,esControlTabla);
										
				EmpleadoIdiomaBeanSwingJInternalFrameAdditional.procesarEventosVista(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,this,FuncionTipo.AFTER,controlTipo,eventoTipo,eventoSubTipo,sTipo,this.empleadoidioma,new Object(),generalEntityParameterGeneral,this.empleadoidiomaReturnGeneral);
			}
			
		} catch(Exception e) {
  			FuncionesSwing.manageException2(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
  		}
    }
	
	/*
	public void setVariablesRelacionesObjetoBeanActualToFormularioEmpleadoIdioma(EmpleadoIdiomaBean empleadoidiomaBean) throws Exception { 
		try {
			
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	*/
	
	/*
	public void setVariablesRelacionesObjetoReturnGeneralToBeanEmpleadoIdioma(ArrayList<Classe> classes,EmpleadoIdiomaReturnGeneral empleadoidiomaReturnGeneral,EmpleadoIdiomaBean empleadoidiomaBean,Boolean conDefault) throws Exception {
		
	}
	*/
	
	public void setVariablesFormularioRelacionesToObjetoActualEmpleadoIdioma(EmpleadoIdioma empleadoidioma,ArrayList<Classe> classes) throws Exception {
		
	}
	
	public Boolean permiteManejarEventosControl() {
		Boolean permite=true;				
		
		if(this.estaModoNuevo || this.estaModoSeleccionar || this.estaModoEliminarGuardarCambios) {
			permite=false;
			
		} 
		
		//NO DEBE MEZCLARSE CONCEPTOS
		/*	
		if(!paraTabla && !this.permiteMantenimiento(this.empleadoidioma)) {
			System.out.println("ERROR:EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES");
				
			//JOptionPane.showMessageDialog(this,"EL OBJETO ACTUAL NO PUEDE SER FILA TOTALES","EVENTO",JOptionPane.ERROR_MESSAGE);			
		}
		*/
		
		return permite;
	}
	
	public void inicializarFormDetalle() throws Exception {
		
		this.jInternalFrameDetalleFormEmpleadoIdioma = new EmpleadoIdiomaDetalleFormJInternalFrame(jDesktopPane,this.empleadoidiomaSessionBean.getConGuardarRelaciones(),this.empleadoidiomaSessionBean.getEsGuardarRelacionado(),this.cargarRelaciones,usuarioActual,resumenUsuarioActual,moduloActual,opcionActual,parametroGeneralSg,parametroGeneralUsuario,paginaTipo);
		
		this.jDesktopPane.add(this.jInternalFrameDetalleFormEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.setVisible(false);
		this.jInternalFrameDetalleFormEmpleadoIdioma.setSelected(false);						
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.setJInternalFrameParent(this);
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.empleadoidiomaLogic=this.empleadoidiomaLogic;
		
		this.cargarCombosFrameForeignKeyEmpleadoIdioma("Formulario");
		
		this.inicializarActualizarBindingBotonesPermisosManualFormDetalleEmpleadoIdioma();
		this.inicializarActualizarBindingtiposArchivosReportesAccionesManualFormDetalleEmpleadoIdioma();
		
		this.initActionsFormDetalle();		
		
		this.initActionsCombosTodosForeignKeyEmpleadoIdioma("Formulario");
		
		//TALVEZ conSetVariablesGlobales COMO if() 
		this.setVariablesGlobalesCombosForeignKeyEmpleadoIdioma();
		
		this.cargarMenuRelaciones();
		
	}
	
	public void initActionsFormDetalle() {	
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoIdioma"));
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonModificarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoIdioma"));

		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonModificarToolBarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoIdioma"));
					
		this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemModificarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoIdioma"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonActualizarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoIdioma"));
		
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonActualizarToolBarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoIdioma"));
						
		this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemActualizarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoIdioma"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonEliminarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoIdioma"));
		
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonEliminarToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoIdioma"));
								
		this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemEliminarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoIdioma"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonCancelarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoIdioma"));
		
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonCancelarToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoIdioma"));
					
		this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemCancelarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoIdioma"));		
		
		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemDetalleCerrarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoIdioma"));		
		
		
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoIdioma"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoIdioma"));
		
		
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoIdioma"));
		
		
				
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonidEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoIdiomaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empresaEmpleadoIdiomaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoIdiomaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empresaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoIdiomaBusqueda"));
		//jButtonid_empleadoEmpleadoIdioma.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoIdiomaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdioma"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdiomaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdiomaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdiomaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_idiomaEmpleadoIdiomaUpdate.addActionListener(new ButtonActionListener(this,"id_idiomaEmpleadoIdiomaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_idiomaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"id_idiomaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_maternaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_maternaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_tecnicoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_tecnicoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_tecnicoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_lecturaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_lecturaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_lecturaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_lecturaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_escritoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_escritoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_escritoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_escritoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_habladoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_habladoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_habladoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_habladoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtondescripcionEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoIdiomaBusqueda"));
		
		
		;

		//TABBED PANE RELACIONES
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTabbedPaneRelacionesEmpleadoIdioma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoIdioma"));
		
		;		
		//TABBED PANE RELACIONES FIN(EXTRA TAB)	
	}
	
	public void initActions() {				
		this.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"CloseInternalFrameEmpleadoIdioma"));
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.addInternalFrameListener(new InternalFrameInternalFrameAdapter(this,"jButtonCancelarEmpleadoIdioma"));
		}
		
		this.jTableDatosEmpleadoIdioma.getSelectionModel().addListSelectionListener(new TableListSelectionListener(this,"TableDatosSeleccionarEmpleadoIdioma"));
		
		this.jTableDatosEmpleadoIdioma.addMouseListener(new TableMouseAdapter(this,"DatosSeleccionarEmpleadoIdioma"));
		
		this.jButtonNuevoEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"NuevoEmpleadoIdioma"));
		
		this.jButtonDuplicarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"DuplicarEmpleadoIdioma"));
		
		this.jButtonCopiarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"CopiarEmpleadoIdioma"));
		
		this.jButtonVerFormEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"VerFormEmpleadoIdioma"));
		
		
		this.jButtonNuevoToolBarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"NuevoToolBarEmpleadoIdioma"));
			
		this.jButtonDuplicarToolBarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"DuplicarToolBarEmpleadoIdioma"));
			
		this.jMenuItemNuevoEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoEmpleadoIdioma"));
			
		this.jMenuItemDuplicarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemDuplicarEmpleadoIdioma"));		
		
		
		this.jButtonNuevoRelacionesEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"NuevoRelacionesEmpleadoIdioma"));
		
		
		this.jButtonNuevoRelacionesToolBarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"NuevoRelacionesToolBarEmpleadoIdioma"));
			
		this.jMenuItemNuevoRelacionesEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"MenuItemNuevoRelacionesEmpleadoIdioma"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonModificarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"ModificarEmpleadoIdioma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonModificarToolBarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"ModificarToolBarEmpleadoIdioma"));
			
			this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemModificarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"MenuItemModificarEmpleadoIdioma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {			
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonActualizarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"ActualizarEmpleadoIdioma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonActualizarToolBarEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"ActualizarToolBarEmpleadoIdioma"));
				
			this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemActualizarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemActualizarEmpleadoIdioma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonEliminarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"EliminarEmpleadoIdioma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonEliminarToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"EliminarToolBarEmpleadoIdioma"));
						
			this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemEliminarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemEliminarEmpleadoIdioma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonCancelarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"CancelarEmpleadoIdioma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonCancelarToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"CancelarToolBarEmpleadoIdioma"));
			
			this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemCancelarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemCancelarEmpleadoIdioma"));		
		}
		
		this.jButtonMostrarOcultarTablaToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MostrarOcultarToolBarEmpleadoIdioma"));		
		
		
		this.jButtonCerrarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"CerrarEmpleadoIdioma"));
		
		
		this.jButtonCerrarToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"CerrarToolBarEmpleadoIdioma"));
			
		this.jMenuItemCerrarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemCerrarEmpleadoIdioma"));
			
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jMenuItemDetalleCerrarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleCerrarEmpleadoIdioma"));		
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosEmpleadoIdioma"));
		}
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosToolBarEmpleadoIdioma"));
		}
		
		this.jButtonCopiarToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"CopiarToolBarEmpleadoIdioma"));
			
		this.jButtonVerFormToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"VerFormToolBarEmpleadoIdioma"));
		
		this.jMenuItemGuardarCambiosEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemGuardarCambiosEmpleadoIdioma"));
			
		this.jMenuItemCopiarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemCopiarEmpleadoIdioma"));		
		
		this.jMenuItemVerFormEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemVerFormEmpleadoIdioma"));		
		
		
		this.jButtonGuardarCambiosTablaEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoIdioma"));
		
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaToolBarEmpleadoIdioma"));
			
		this.jMenuItemGuardarCambiosTablaEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"GuardarCambiosTablaEmpleadoIdioma"));		
		
		
		
		this.jButtonRecargarInformacionEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"RecargarInformacionEmpleadoIdioma"));
					
		this.jButtonRecargarInformacionToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"RecargarInformacionToolBarEmpleadoIdioma"));
		
		this.jMenuItemRecargarInformacionEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemRecargarInformacionEmpleadoIdioma"));		
		
		
		
		this.jButtonAnterioresEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"AnterioresEmpleadoIdioma"));
		
		
		this.jButtonAnterioresToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"AnterioresToolBarEmpleadoIdioma"));
		
		this.jMenuItemAnterioresEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemAnterioresEmpleadoIdioma"));		
		
		
		this.jButtonSiguientesEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"SiguientesEmpleadoIdioma"));
		
		
		this.jButtonSiguientesToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"SiguientesToolBarEmpleadoIdioma"));
			
		this.jMenuItemSiguientesEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemSiguientesEmpleadoIdioma"));
			
		this.jMenuItemAbrirOrderByEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemAbrirOrderByEmpleadoIdioma"));
			
		this.jMenuItemMostrarOcultarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemMostrarOcultarEmpleadoIdioma"));
			
		this.jMenuItemDetalleAbrirOrderByEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleAbrirOrderByEmpleadoIdioma"));
			
		this.jMenuItemDetalleMostarOcultarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemDetalleMostrarOcultarEmpleadoIdioma"));		
		
		
		this.jButtonNuevoGuardarCambiosEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosEmpleadoIdioma"));
		
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"NuevoGuardarCambiosToolBarEmpleadoIdioma"));
			
		this.jMenuItemNuevoGuardarCambiosEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"MenuItemNuevoGuardarCambiosEmpleadoIdioma"));		
		
		
		
		//SELECCIONAR TODOS
		
		this.jCheckBoxSeleccionarTodosEmpleadoIdioma.addItemListener(new CheckBoxItemListener(this,"SeleccionarTodosEmpleadoIdioma"));

		this.jCheckBoxSeleccionadosEmpleadoIdioma.addItemListener(new CheckBoxItemListener(this,"SeleccionadosEmpleadoIdioma"));
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"TiposAccionesFormularioEmpleadoIdioma"));
		}
		
		
		this.jComboBoxTiposRelacionesEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"TiposRelacionesEmpleadoIdioma"));
			
		this.jComboBoxTiposAccionesEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"TiposAccionesEmpleadoIdioma"));
					
		this.jComboBoxTiposSeleccionarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"TiposSeleccionarEmpleadoIdioma"));
			
		this.jTextFieldValorCampoGeneralEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"ValorCampoGeneralEmpleadoIdioma"));		
		
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
		
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonidEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoIdiomaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empresaEmpleadoIdiomaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoIdiomaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empresaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoIdiomaBusqueda"));
		//jButtonid_empleadoEmpleadoIdioma.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoIdiomaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdioma"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdiomaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdiomaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdiomaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_idiomaEmpleadoIdiomaUpdate.addActionListener(new ButtonActionListener(this,"id_idiomaEmpleadoIdiomaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_idiomaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"id_idiomaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_maternaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_maternaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_tecnicoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_tecnicoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_tecnicoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_lecturaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_lecturaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_lecturaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_lecturaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_escritoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_escritoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_escritoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_escritoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_habladoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_habladoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_habladoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_habladoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtondescripcionEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoIdiomaBusqueda"));
		}
		
		if(!this.conCargarMinimo) {
		//BYDAN_BUSQUEDAS
		
		
			this.jButtonFK_IdEmpleadoEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoIdioma"));

			this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdioma"));

			this.jButtonFK_IdIdiomaEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"FK_IdIdiomaEmpleadoIdioma"));
		
		
		
			//REPORTE DINAMICO
			
			if(this.jInternalFrameReporteDinamicoEmpleadoIdioma!=null) {
				this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjButtonCerrarReporteDinamico().addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoIdioma"));
				this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjButtonGenerarReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoIdioma"));
				this.jInternalFrameReporteDinamicoEmpleadoIdioma.getjButtonGenerarExcelReporteDinamico().addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoIdioma"));
			}
			
			//this.jButtonCerrarReporteDinamicoEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"CerrarReporteDinamicoEmpleadoIdioma"));				
			//this.jButtonGenerarReporteDinamicoEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"GenerarReporteDinamicoEmpleadoIdioma"));
			//this.jButtonGenerarExcelReporteDinamicoEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"GenerarExcelReporteDinamicoEmpleadoIdioma"));
				
				
			//IMPORTACION			
			if(this.jInternalFrameImportacionEmpleadoIdioma!=null) {
				this.jInternalFrameImportacionEmpleadoIdioma.getjButtonCerrarImportacion().addActionListener (new ButtonActionListener(this,"CerrarImportacionEmpleadoIdioma"));
				this.jInternalFrameImportacionEmpleadoIdioma.getjButtonGenerarImportacion().addActionListener (new ButtonActionListener(this,"GenerarImportacionEmpleadoIdioma"));
				this.jInternalFrameImportacionEmpleadoIdioma.getjButtonAbrirImportacion().addActionListener (new ButtonActionListener(this,"AbrirImportacionEmpleadoIdioma"));
			}
			
			//ORDER BY
			this.jButtonAbrirOrderByEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"AbrirOrderByEmpleadoIdioma"));
			
			this.jButtonAbrirOrderByToolBarEmpleadoIdioma.addActionListener (new ButtonActionListener(this,"AbrirOrderByToolBarEmpleadoIdioma"));			
			
			if(this.jInternalFrameOrderByEmpleadoIdioma!=null) {
				this.jInternalFrameOrderByEmpleadoIdioma.getjButtonCerrarOrderBy().addActionListener (new ButtonActionListener(this,"CerrarOrderByEmpleadoIdioma"));				
			}
			
			
		}
		
		
		
		if(!this.conCargarMinimo) {
			if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			;
			}
		}
		
		
		//TABBED PANE RELACIONES
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) { //if(this.conCargarFormDetalle) {
			this.jInternalFrameDetalleFormEmpleadoIdioma.jTabbedPaneRelacionesEmpleadoIdioma.addChangeListener(new TabbedPaneChangeListener(this,"RelacionesEmpleadoIdioma"));
		
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
            		closingInternalFrameEmpleadoIdioma();
				} catch (Exception e) {
					e.printStackTrace();
				}
            }
        });
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.addInternalFrameListener(new javax.swing.event.InternalFrameAdapter() {
	        public void internalFrameClosing(InternalFrameEvent event) {
	            JInternalFrameBase jInternalFrameDetalleFormEmpleadoIdioma = (JInternalFrameBase)event.getSource();
	            	
	            EmpleadoIdiomaBeanSwingJInternalFrame jInternalFrameParent=(EmpleadoIdiomaBeanSwingJInternalFrame)jInternalFrameDetalleFormEmpleadoIdioma.getjInternalFrameParent();
	                
	            try {
					jInternalFrameParent.jButtonCancelarEmpleadoIdiomaActionPerformed(null);
					
					//jInternalFrameParent.dispose();
					//jInternalFrameParent=null;
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	        }
	    });
			
		this.jTableDatosEmpleadoIdioma.getSelectionModel().addListSelectionListener (
	                new ListSelectionListener() {
	                    public void valueChanged(ListSelectionEvent e) {
							//BYDAN_DESHABILITADO
	                    	//try {jTableDatosEmpleadoIdiomaListSelectionListener(e);}catch(Exception e1){e1.printStackTrace();}
	                    }
	                }
	     );
		
		this.jTableDatosEmpleadoIdioma.addMouseListener(new MouseAdapter() {
			   public void mouseClicked(MouseEvent evt) {
				      if (evt.getClickCount() == 2) {
				    	  jButtonIdActionPerformed(null,jTableDatosEmpleadoIdioma.getSelectedRow(),false,false);
				      }
				   }
		});
		
		this.jButtonNuevoEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoIdiomaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoIdiomaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoIdiomaActionPerformed(evt,false);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoEmpleadoIdioma";
		inputMap = this.jButtonNuevoEmpleadoIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_N , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoEmpleadoIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoIdiomaActionPerformed(evt,false);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonNuevoRelacionesEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoIdiomaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoRelacionesToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoIdiomaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoRelacionesEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoEmpleadoIdiomaActionPerformed(evt,true);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "NuevoRelacionesEmpleadoIdioma";
		inputMap = this.jButtonNuevoRelacionesEmpleadoIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_R , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonNuevoRelacionesEmpleadoIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonNuevoEmpleadoIdiomaActionPerformed(evt,true);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonModificarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonModificarToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemModificarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonModificarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ModificarEmpleadoIdioma";
		inputMap = this.jButtonModificarEmpleadoIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_M , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonModificarEmpleadoIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonModificarEmpleadoIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonActualizarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonActualizarToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemActualizarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonActualizarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "ActualizarEmpleadoIdioma";
		inputMap = this.jButtonActualizarEmpleadoIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonActualizarEmpleadoIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonActualizarEmpleadoIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonEliminarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonEliminarToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
				
		this.jMenuItemEliminarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonEliminarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "EliminarEmpleadoIdioma";
		inputMap = this.jButtonEliminarEmpleadoIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_E , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonEliminarEmpleadoIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonEliminarEmpleadoIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCancelarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCancelarToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCancelarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCancelarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CancelarEmpleadoIdioma";
		inputMap = this.jButtonCancelarEmpleadoIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_Q , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jButtonCancelarEmpleadoIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCancelarEmpleadoIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonCerrarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonCerrarToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemCerrarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemDetalleCerrarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  //try {jButtonCerrarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
					try {jButtonCancelarEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "CerrarEmpleadoIdioma";
		inputMap = this.jButtonCerrarEmpleadoIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_C , KeyEvent.ALT_MASK), sMapKey);
			
		this.jButtonCerrarEmpleadoIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonCerrarEmpleadoIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGuardarCambiosTablaToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemGuardarCambiosTablaEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		sMapKey = "GuardarCambiosEmpleadoIdioma";
		inputMap = this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosEmpleadoIdioma.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_G , KeyEvent.CTRL_MASK), sMapKey);
			
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonGuardarCambiosEmpleadoIdioma.getActionMap().put(sMapKey, new AbstractAction() {
			public static final long serialVersionUID = 1L;
			public void actionPerformed(ActionEvent evt) {
			    try {jButtonGuardarCambiosEmpleadoIdiomaActionPerformed(evt);} catch (Exception e) {e.printStackTrace();}
			}
		});
		
		this.jButtonRecargarInformacionEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonRecargarInformacionToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemRecargarInformacionEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonRecargarInformacionEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		this.jButtonAnterioresEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAnterioresToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemAnterioresEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAnterioresEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonSiguientesToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemSiguientesEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonSiguientesEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonNuevoGuardarCambiosToolBarEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jMenuItemNuevoGuardarCambiosEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonNuevoGuardarCambiosEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		
		//SELECCIONAR TODOS
		this.jCheckBoxSeleccionarTodosEmpleadoIdioma.addItemListener(new ItemListener() {		
			public void itemStateChanged(ItemEvent evt) {
				try {jCheckBoxSeleccionarTodosEmpleadoIdiomaItemListener(evt);}catch(Exception e){e.printStackTrace();}
			}
		});

		this.jComboBoxTiposAccionesEmpleadoIdioma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposAccionesEmpleadoIdiomaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jComboBoxTiposSeleccionarEmpleadoIdioma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jComboBoxTiposSeleccionarEmpleadoIdiomaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		this.jTextFieldValorCampoGeneralEmpleadoIdioma.addActionListener (new ActionListener () {
			public void actionPerformed(ActionEvent e) {
				try {jTextFieldValorCampoGeneralEmpleadoIdiomaActionListener(e);} catch (Exception e1) { e1.printStackTrace();}
			};
		});
		
		
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonidEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"idEmpleadoIdiomaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empresaEmpleadoIdiomaUpdate.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoIdiomaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empresaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"id_empresaEmpleadoIdiomaBusqueda"));
		//jButtonid_empleadoEmpleadoIdioma.addActionListener (
		//	new java.awt.event.ActionListener() {
		//		public void actionPerformed(java.awt.event.ActionEvent evt) {
		//			jButtonid_empleadoEmpleadoIdiomaActionPerformed(evt);
		//		}
		//	}
		//);

		//BUSQUEDA CAMPO
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdioma"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdiomaUpdate.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdiomaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdiomaBusqueda"));
		//ACTUALIZAR FK
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_idiomaEmpleadoIdiomaUpdate.addActionListener(new ButtonActionListener(this,"id_idiomaEmpleadoIdiomaUpdate"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_idiomaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"id_idiomaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_maternaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_maternaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_tecnicoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_tecnicoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_tecnicoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_tecnicoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_lecturaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_lecturaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_lecturaEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_lecturaEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_escritoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_escritoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_escritoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_escritoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtones_habladoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"es_habladoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonporcen_habladoEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"porcen_habladoEmpleadoIdiomaBusqueda"));
		//BUSQUEDA GENERAL
		this.jInternalFrameDetalleFormEmpleadoIdioma.jButtondescripcionEmpleadoIdiomaBusqueda.addActionListener(new ButtonActionListener(this,"descripcionEmpleadoIdiomaBusqueda"));
		
		
		this.jButtonFK_IdEmpleadoEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"FK_IdEmpleadoEmpleadoIdioma"));

		this.jButtonBuscarFK_IdEmpleadoid_empleadoEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"id_empleadoEmpleadoIdioma"));

		this.jButtonFK_IdIdiomaEmpleadoIdioma.addActionListener(new ButtonActionListener(this,"FK_IdIdiomaEmpleadoIdioma"));

		
		//REPORTE DINAMICO
		this.jButtonCerrarReporteDinamicoEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarReporteDinamicoEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarReporteDinamicoEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarReporteDinamicoEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarExcelReporteDinamicoEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarExcelReporteDinamicoEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		//IMPORTACION
		this.jButtonCerrarImportacionEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonCerrarImportacionEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonGenerarImportacionEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonGenerarImportacionEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
		
		this.jButtonAbrirImportacionEmpleadoIdioma.addActionListener (
	          new java.awt.event.ActionListener() {
	              public void actionPerformed(ActionEvent evt) {
	            	  try {jButtonAbrirImportacionEmpleadoIdiomaActionPerformed(evt);}catch(Exception e){e.printStackTrace();}
	              }
	          }
        );
	}
	*/
	
	
	public void jComboBoxTiposSeleccionarEmpleadoIdiomaActionListener(ActionEvent evt) throws Exception {    		
		try {			
			Reporte reporte=(Reporte)this.jComboBoxTiposSeleccionarEmpleadoIdioma.getSelectedItem();
			
			//if(reporte.getsCodigo().equals("SELECCIONAR")) {
			//}					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}	
	
	
	
	public void seleccionarTodosEmpleadoIdioma(Boolean conSeleccionarTodos) throws Exception {    		
		try {
			if(Constantes.ISUSAEJBLOGICLAYER) {				
				for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomaLogic.getEmpleadoIdiomas()) {
					empleadoidiomaAux.setIsSelected(conSeleccionarTodos);
				}			
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomas) {
					empleadoidiomaAux.setIsSelected(conSeleccionarTodos);
				}
			}
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarTodosEmpleadoIdiomaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoIdioma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			
			if(sTipoSeleccionar.equals("COLUMNAS")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomaLogic.getEmpleadoIdiomas()) {
						empleadoidiomaAux.setIsSelected(this.isSeleccionarTodos);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomas) {
						empleadoidiomaAux.setIsSelected(this.isSeleccionarTodos);
					}
				}
			} else {
				if(Constantes.ISUSAEJBLOGICLAYER) {
					for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomaLogic.getEmpleadoIdiomas()) {
					
						if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA)) {
							existe=true;
							empleadoidiomaAux.setes_materna(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO)) {
							existe=true;
							empleadoidiomaAux.setes_tecnico(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA)) {
							existe=true;
							empleadoidiomaAux.setes_lectura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO)) {
							existe=true;
							empleadoidiomaAux.setes_escrito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO)) {
							existe=true;
							empleadoidiomaAux.setes_hablado(this.isSeleccionarTodos);
						}
					}	
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomas) {
						
						if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA)) {
							existe=true;
							empleadoidiomaAux.setes_materna(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO)) {
							existe=true;
							empleadoidiomaAux.setes_tecnico(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA)) {
							existe=true;
							empleadoidiomaAux.setes_lectura(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO)) {
							existe=true;
							empleadoidiomaAux.setes_escrito(this.isSeleccionarTodos);
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO)) {
							existe=true;
							empleadoidiomaAux.setes_hablado(this.isSeleccionarTodos);
						}
					}
				}
			}
					
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoIdioma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoIdioma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionadosEmpleadoIdiomaItemListener(ItemEvent evt) throws Exception {    		
		try {			
			this.inicializarActualizarBindingEmpleadoIdioma(false,false);
			
			//JCheckBox jCheckBox=(JCheckBox)evt.getSource();			
			//System.out.println("ok");		
			
			Boolean existe=false;
			int[] arrNumRowsSeleccionados=null;
			
			arrNumRowsSeleccionados=this.jTableDatosEmpleadoIdioma.getSelectedRows();
			
			EmpleadoIdioma empleadoidiomaLocal=new EmpleadoIdioma();
			
			//this.seleccionarTodosEmpleadoIdioma(false);
			
			for(Integer iNumRowSeleccionado:arrNumRowsSeleccionados) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {
					empleadoidiomaLocal =(EmpleadoIdioma) this.empleadoidiomaLogic.getEmpleadoIdiomas().toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(iNumRowSeleccionado)];
				} else if(Constantes.ISUSAEJBREMOTE || Constantes.ISUSAEJBHOME) {
					empleadoidiomaLocal =(EmpleadoIdioma) this.empleadoidiomas.toArray()[this.jTableDatosEmpleadoIdioma.convertRowIndexToModel(iNumRowSeleccionado)];
				}
				
				empleadoidiomaLocal.setIsSelected(this.isSeleccionados);
			}
			
			/*
			if(sTipoSeleccionar.equals("SELECCIONAR")) {
				existe=true;
				
				if(Constantes.ISUSAEJBLOGICLAYER) {				
					for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomaLogic.getEmpleadoIdiomas()) {
						empleadoidiomaAux.setIsSelected(this.isSeleccionados);
					}			
				} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
					for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomas) {
						empleadoidiomaAux.setIsSelected(this.isSeleccionados);
					}
				}
			}
			*/
			
			//if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
			/*
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}	
			*/
			
			
			//TableCellRenderer tableCellRenderer=null;			
			
			//TableCellEditor tableCellEditor=null;						
						
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			/*
			for(int i = 0; i < this.jTableDatosEmpleadoIdioma.getRowCount(); i++) {				
				tableCellRenderer=this.jTableDatosSistema.getCellRenderer(i, 2);
				tableCellEditor=this.jTableDatosSistema.getCellEditor(i, 2);
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellRenderer;				
				idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				
				idSeleccionarTableCell=(IdSeleccionarTableCell)tableCellEditor;
				
				if(idSeleccionarTableCell.jCheckBoxId!=null) {
					idSeleccionarTableCell.jCheckBoxId.setSelected(jCheckBox.isSelected());
				}
				
				//System.out.println(idSeleccionarTableCell.valor);
				
				//this.jTableDatosEmpleadoIdioma.getModel().setValueAt(jCheckBox.isSelected(), i, Funciones2.getColumnIndexByName(this.jTableDatosEmpleadoIdioma,Constantes2.S_SELECCIONAR));
		    } 
			*/
					
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jCheckBoxSeleccionarActualEmpleadoIdiomaItemListener(ItemEvent evt,Long idActual) throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void ejecutarAuxiliarEmpleadoIdiomaParaAjaxPostBack() throws Exception {    		
		try {
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jTextFieldValorCampoGeneralEmpleadoIdiomaActionListener(ActionEvent evt) throws Exception {    		
		try {
			this.inicializarActualizarBindingEmpleadoIdioma(false,false);
			
			//System.out.println(this.jTextFieldValorCampoGeneralEmpleadoIdioma.getText());		
			
			Boolean existe=false;
			
			if(Constantes.ISUSAEJBLOGICLAYER) {
				for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomaLogic.getEmpleadoIdiomas()) {
				
						if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO)) {
							existe=true;
							empleadoidiomaAux.setporcen_tecnico(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA)) {
							existe=true;
							empleadoidiomaAux.setporcen_lectura(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO)) {
							existe=true;
							empleadoidiomaAux.setporcen_escrito(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO)) {
							existe=true;
							empleadoidiomaAux.setporcen_hablado(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empleadoidiomaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}	
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomas) {
					
						if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO)) {
							existe=true;
							empleadoidiomaAux.setporcen_tecnico(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA)) {
							existe=true;
							empleadoidiomaAux.setporcen_lectura(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO)) {
							existe=true;
							empleadoidiomaAux.setporcen_escrito(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO)) {
							existe=true;
							empleadoidiomaAux.setporcen_hablado(Integer.parseInt(this.sValorCampoGeneral));
						}
						 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION)) {
							existe=true;
							empleadoidiomaAux.setdescripcion(this.sValorCampoGeneral);
						}
				}
			}
								
			if(existe) {
				this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
			} else {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	public void jComboBoxTiposAccionesEmpleadoIdiomaActionListener(ActionEvent evt,Boolean esParaAccionDesdeFormulario) throws Exception {    				
		Boolean conSplash=true;
		
		try {							
		
			this.inicializarActualizarBindingEmpleadoIdioma(false,false);
			
			Reporte reporte=new Reporte();
			
			this.esParaAccionDesdeFormularioEmpleadoIdioma=esParaAccionDesdeFormulario;
			
			if(!esParaAccionDesdeFormulario) {
				
				reporte=(Reporte)this.jComboBoxTiposAccionesEmpleadoIdioma.getSelectedItem();
				
			} else {
				reporte=(Reporte)this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.getSelectedItem();
			}
			String sTipoAccionLocal=this.sTipoAccion;
			
			if(!esParaAccionDesdeFormulario) {
				sTipoAccionLocal=this.sTipoAccion;
			} else {
				sTipoAccionLocal=this.sTipoAccionFormulario;
			}
			
			if(sTipoAccionLocal.equals("GENERAR REPORTE")) {//reporte.getsCodigo().equals("GENERAR REPORTE")) {
				if(this.isPermisoReporteEmpleadoIdioma) {				
					conSplash=true;//false;										
					
					//this.startProcessEmpleadoIdioma(conSplash);
				
					this.generarReporteEmpleadoIdiomasSeleccionados();
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setSelectedIndex(0);					
				}
			} else if(sTipoAccionLocal.equals("GENERAR REPORTE DINAMICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.mostrarReporteDinamicoEmpleadoIdiomasSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("GENERAR_REPORTE_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoIdiomasSeleccionados(false);
				//this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("GENERAR_REPORTE_TOTALES_GROUP_GENERICO")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//SE GENERA REPORTE SEGUN TIPO REPORTE SELECCIONADO
				//this.generarReporteGroupGenericoEmpleadoIdiomasSeleccionados(true);
				//this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoIdioma();
				
				this.exportarEmpleadoIdiomasSeleccionados();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("IMPORTAR_DATOS")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				this.mostrarImportacionEmpleadoIdiomas();
				//this.importarEmpleadoIdiomas();
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setSelectedIndex(0);					
				}					
			} else if(sTipoAccionLocal.equals("EXPORTAR_DATOS_EXCEL")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {
				//this.startProcessEmpleadoIdioma();
				//SE EXPORTA SEGUN TIPO ARCHIVO SELECCIONADO
				//this.exportarExcelEmpleadoIdiomasSeleccionados();
				//this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
			}  else if(sTipoAccionLocal.equals("RECARGAR_FK")) {//reporte.getsCodigo().equals("GENERAR_REPORTE_GROUP_GENERICO")) {								
				if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE RECARGAR REFERENCIAS ?", "MANTENIMIENTO DE Empleado Idioma", JOptionPane.OK_CANCEL_OPTION) == 0) {
				
				//this.startProcessEmpleadoIdioma();
				
					if(!esParaAccionDesdeFormulario || (esParaAccionDesdeFormulario && this.isEsNuevoEmpleadoIdioma)) {
						this.esRecargarFks=true;
						this.cargarCombosForeignKeyEmpleadoIdioma(false,false,false);
						this.esRecargarFks=false;
						
						JOptionPane.showMessageDialog(this,"PROCESO EJECUTADO CORRECTAMENTE","MANTENIMIENTO DE Empleado Idioma",JOptionPane.INFORMATION_MESSAGE);
					} else {
						JOptionPane.showMessageDialog(this,"ESTE PROCESO SOLO FUNCIONA AL INGRESAR UN NUEVO ELEMENTO","MANTENIMIENTO",JOptionPane.ERROR_MESSAGE);	
					}
					
					
				}
				
				if(!esParaAccionDesdeFormulario) {
					
					this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
					
				} else {
					this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setSelectedIndex(0);					
				}	
			} 			
			else if(EmpleadoIdiomaBeanSwingJInternalFrame.EsProcesoReporte(reporte.getsCodigo())){
				if(this.isPermisoReporteEmpleadoIdioma) {				
					if(this.tieneElementosSeleccionados()) {
						this.quitarFilaTotales();
						
						conSplash=false;
						
						//this.startProcessEmpleadoIdioma(conSplash);
					
						//this.actualizarParametrosGeneralEmpleadoIdioma();
						
						this.generarReporteProcesoAccionEmpleadoIdiomasSeleccionados(reporte.getsCodigo());
						
						if(!esParaAccionDesdeFormulario) {
							
							this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
							
						} else {
							this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setSelectedIndex(0);					
						}
					} else {
						JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO TIENE PERMISO PARA GENERAR REPORTES","REPORTE",JOptionPane.ERROR_MESSAGE);					
				}
			} 
			else if(EmpleadoIdiomaBeanSwingJInternalFrameAdditional.EsProcesoAccionNormal(reporte.getsCodigo())){
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					if(JOptionPane.showConfirmDialog(this, "ESTA SEGURO DE PROCESAR "+reporte.getsDescripcion()+" EN PROCESO Empleado IdiomaS SELECCIONADOS?", "MANTENIMIENTO DE Empleado Idioma", JOptionPane.OK_CANCEL_OPTION) == 0) {
						//this.startProcessEmpleadoIdioma();
				
						this.actualizarParametrosGeneralEmpleadoIdioma();
						
						//ARCHITECTURE
						if(Constantes.ISUSAEJBLOGICLAYER) {						
							this.empleadoidiomaReturnGeneral=empleadoidiomaLogic.procesarAccionEmpleadoIdiomasWithConnection(this.parametroGeneralUsuario,this.moduloActual,this.opcionActual,this.usuarioActual,sTipoAccionLocal,this.empleadoidiomaLogic.getEmpleadoIdiomas(),this.empleadoidiomaParameterGeneral);
						
						} else if(Constantes.ISUSAEJBREMOTE) {
						
						} else if(Constantes.ISUSAEJBHOME) {
						}
						//ARCHITECTURE
						
						this.procesarEmpleadoIdiomaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setSelectedIndex(0);					
					}
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}				
			} 
			else {
				if(this.tieneElementosSeleccionados()) {
					this.quitarFilaTotales();
					
					this.actualizarParametrosGeneralEmpleadoIdioma();
					
					EmpleadoIdiomaBeanSwingJInternalFrameAdditional.ProcesarAccion(reporte.getsCodigo(),reporte.getsDescripcion(),this);
					
					this.procesarEmpleadoIdiomaReturnGeneral();
					
					if(!esParaAccionDesdeFormulario) {
						
						this.jComboBoxTiposAccionesEmpleadoIdioma.setSelectedIndex(0);					
						
					} else {
						this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxTiposAccionesFormularioEmpleadoIdioma.setSelectedIndex(0);					
					}
				} else {
					JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUN ELEMENTO","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
				}
			}
		} catch(Exception e) {
			this.esRecargarFks=false;
			
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		}  finally {
      		//this.finishProcessEmpleadoIdioma(conSplash);
      	}
	}
	
	public void jComboBoxTiposRelacionesEmpleadoIdiomaActionListener(ActionEvent evt) throws Exception {    				
		Boolean conSplash=true;
		
		try {			
			this.startProcessEmpleadoIdioma();
			
			if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {			
				this.inicializarFormDetalle();
			}
			
			ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();		
			EmpleadoIdioma empleadoidioma=new EmpleadoIdioma();
			
			int rowIndex=-1;//CON ESTO SE DESHABILITA SELECCION POR INDICE
			
			this.inicializarActualizarBindingEmpleadoIdioma(false,false);
			
			Reporte reporte=new Reporte();
			
			
			reporte=(Reporte)this.jComboBoxTiposRelacionesEmpleadoIdioma.getSelectedItem();
			
			
			
			
			empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
			//this.sTipoAccion;
			
			if(empleadoidiomasSeleccionados.size()==1) {
				for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomasSeleccionados) {
					empleadoidioma=empleadoidiomaAux;
				}
				
				if(this.sTipoAccion.equals("NONE")) {
				
				}
				
			} else {
				JOptionPane.showMessageDialog(this,"SELECCIONE SOLO UN REGISTRO","RELACIONES",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		
		}  finally {
			this.finishProcessEmpleadoIdioma();
			
      		//this.finishProcessEmpleadoIdioma(conSplash);
      	}
	}
			
	public static Boolean EsProcesoReporte(String sTipoProceso) throws Exception {
		Boolean esProcesoAccionRepoorte=false;

		if(sTipoProceso.contains("REPORTE_")) {
			 esProcesoAccionRepoorte=true;
		}

		return esProcesoAccionRepoorte;
	}
	
	public void procesarEmpleadoIdiomaReturnGeneral() throws Exception {
		if(this.empleadoidiomaReturnGeneral.getConRetornoEstaProcesado()) {
			JOptionPane.showMessageDialog(this,this.empleadoidiomaReturnGeneral.getsMensajeProceso(),"PROCESO",JOptionPane.INFORMATION_MESSAGE);
		}
		
		if(this.empleadoidiomaReturnGeneral.getConMostrarMensaje()) {
			JOptionPane.showMessageDialog(this,this.empleadoidiomaReturnGeneral.getsMensajeProceso(),"PROCESO",FuncionesSwing.getColorSelectedBackground(this.empleadoidiomaReturnGeneral.getsTipoMensaje()));
		}
		
		if(this.empleadoidiomaReturnGeneral.getConRecargarInformacion()) {
			this.procesarBusqueda(this.sAccionBusqueda);
			
			this.inicializarActualizarBindingEmpleadoIdioma(false);
		}
		
		if(this.empleadoidiomaReturnGeneral.getConRetornoLista() || this.empleadoidiomaReturnGeneral.getConRetornoObjeto()) {
			if(this.empleadoidiomaReturnGeneral.getConRetornoLista()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoidiomaLogic.setEmpleadoIdiomas(this.empleadoidiomaReturnGeneral.getEmpleadoIdiomas());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			if(this.empleadoidiomaReturnGeneral.getConRetornoObjeto()) {
				//ARCHITECTURE
				if(Constantes.ISUSAEJBLOGICLAYER) {	
					this.empleadoidiomaLogic.setEmpleadoIdioma(this.empleadoidiomaReturnGeneral.getEmpleadoIdioma());
				} else if(Constantes.ISUSAEJBREMOTE) {
				} else if(Constantes.ISUSAEJBHOME) {
				}
				//ARCHITECTURE
			}
			
			this.inicializarActualizarBindingEmpleadoIdioma(false);
		}
	}
	
	public void actualizarParametrosGeneralEmpleadoIdioma() throws Exception {
		
		
	}
	
	public ArrayList<EmpleadoIdioma> getEmpleadoIdiomasSeleccionados(Boolean conSeleccionarTodosAutomatico) throws Exception {
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();
		Boolean existe=false;
		
		if(!this.esParaAccionDesdeFormularioEmpleadoIdioma) {
			if(Constantes.ISUSAEJBLOGICLAYER) {	
				
				for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomaLogic.getEmpleadoIdiomas()) {
					if(empleadoidiomaAux.getIsSelected()) {
						empleadoidiomasSeleccionados.add(empleadoidiomaAux);				
					}
				}
				
			} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
				for(EmpleadoIdioma empleadoidiomaAux:this.empleadoidiomas) {
					if(empleadoidiomaAux.getIsSelected()) {
						empleadoidiomasSeleccionados.add(empleadoidiomaAux);				
					}
				}
			}
			
			if(empleadoidiomasSeleccionados.size()>0) {
				existe=true;
			}
			
			//SI NO ESTA NINGUNO SELECCIONADO SE SELECCIONA TODOS
			if(!existe) {
				if(conSeleccionarTodosAutomatico) {
					if(Constantes.ISUSAEJBLOGICLAYER) {				
						empleadoidiomasSeleccionados.addAll(this.empleadoidiomaLogic.getEmpleadoIdiomas());
					} else if(Constantes.ISUSAEJBREMOTE||Constantes.ISUSAEJBHOME) {
						empleadoidiomasSeleccionados.addAll(this.empleadoidiomas);				
					}
				}
			}
		} else {
			empleadoidiomasSeleccionados.add(this.empleadoidioma);
		}
		
		return empleadoidiomasSeleccionados;
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
	
	public void generarReporteEmpleadoIdiomasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoReporte.equals("NORMAL") || this.sTipoReporte.equals("FORMULARIO")) {
			existe=true;								
			this.generarReporteNormalEmpleadoIdiomasSeleccionados();
			
		} else if(this.sTipoReporte.equals("DINAMICO")) {
			existe=true;
			this.mostrarReporteDinamicoEmpleadoIdiomasSeleccionados();
			
		} else if(this.sTipoReporte.equals("GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoIdiomasSeleccionados(false);
			
		} else if(this.sTipoReporte.equals("TOTALES_GRUPO_GENERICO")) {
			existe=true;
			this.generarReporteGroupGenericoEmpleadoIdiomasSeleccionados(true);
		}
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE REPORTE VALIDO","REPORTE DE Empleado Idioma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void generarReporteRelacionesEmpleadoIdiomasSeleccionados() throws Exception {
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();		
		
		empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
					
		//this.sTipoReporteExtra="MasterRelaciones";
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		
		this.generarReporteEmpleadoIdiomas("Todos",empleadoidiomasSeleccionados);
		
	}	
	
	public void generarReporteNormalEmpleadoIdiomasSeleccionados() throws Exception {
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();		
		
		empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(true,false,false,"");
								
		if(this.sTipoReporte.equals("FORMULARIO")) {
			this.sTipoReporteExtra="Vertical";					
		}
		
		/*
		this.sTipoReporteExtra="";
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.generarReporteEmpleadoIdiomas("Todos",empleadoidiomasSeleccionados);
	}		
	
	public void generarReporteProcesoAccionEmpleadoIdiomasSeleccionados(String sProcesoReporte) throws Exception {
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();
		
		empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
		
		this.actualizarVariablesTipoReporte(false,false,true,"");
		
		/*
		this.esReporteDinamico=false;
		this.sPathReporteDinamico="";
		*/
		
		this.sTipoReporteExtra=sProcesoReporte.toLowerCase();
		
		this.esReporteAccionProceso=true;
		this.generarReporteEmpleadoIdiomas("Todos",empleadoidiomasSeleccionados);
		this.esReporteAccionProceso=false;
	}
	
	
	public void mostrarReporteDinamicoEmpleadoIdiomasSeleccionados() throws Exception {
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();		
		
		
		this.abrirInicializarFrameReporteDinamicoEmpleadoIdioma();
		
		
		empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
		
		this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirFrameReporteDinamicoEmpleadoIdioma();
		
		
		//this.generarReporteEmpleadoIdiomas("Todos",empleadoidiomasSeleccionados ,empleadoidiomaImplementable,empleadoidiomaImplementableHome);
	}
	
	public void mostrarImportacionEmpleadoIdiomas() throws Exception {
		//this.sTipoReporteExtra="";
		//this.actualizarVariablesTipoReporte(true,false,false,"");
		
		
		this.abrirInicializarFrameImportacionEmpleadoIdioma();
		
		this.abrirFrameImportacionEmpleadoIdioma();		
		
			
		//this.generarReporteEmpleadoIdiomas("Todos",empleadoidiomasSeleccionados ,empleadoidiomaImplementable,empleadoidiomaImplementableHome);
	}
	
	public void importarEmpleadoIdiomas() throws Exception {		
	
	}
	
	public void exportarEmpleadoIdiomasSeleccionados() throws Exception {
		Boolean existe=false;
		
		if(this.sTipoArchivoReporte.equals("EXCEL")) {
			existe=true;
			this.exportarExcelEmpleadoIdiomasSeleccionados();
			
		} else if(this.sTipoArchivoReporte.equals("TEXTO")) {
			existe=true;
			this.exportarTextoEmpleadoIdiomasSeleccionados();
		
		} else if(this.sTipoArchivoReporte.equals("XML")) {
			existe=true;
			this.exportarXmlEmpleadoIdiomasSeleccionados();
		} 
		
		if(!existe) {
			JOptionPane.showMessageDialog(this,"SELECCIONE UN TIPO DE ARCHIVO VALIDO","EXPORTACION DE Empleado Idioma",JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public void exportarTextoEmpleadoIdiomasSeleccionados() throws Exception {
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();		
		
		empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoidioma."+"txt";//Funciones2.getTipoExtensionArchivoExportar(this.parametroGeneralUsuario);
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		BufferedWriter bufferedWriter = null;
		FileWriter fileWriter=null;
		
		fileWriter=new FileWriter(sPath);
		
		bufferedWriter = new BufferedWriter(fileWriter);
		
		try {
			if(conCabecera) {
				sFilaCabecera=this.getFilaCabeceraExportarEmpleadoIdioma(sDelimiter);
				
				bufferedWriter.write(sFilaCabecera);
			}				
			
			for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomasSeleccionados) {
				sFilaDatos=this.getFilaDatosExportarEmpleadoIdioma(empleadoidiomaAux,sDelimiter);
				
				bufferedWriter.write(sFilaDatos);
				
				//empleadoidiomaAux.setsDetalleGeneralEntityReporte(empleadoidiomaAux.toString());			
			}
			
			bufferedWriter.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Idioma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {
       		if (bufferedWriter != null) {
				bufferedWriter.close();
			}
		}
	}
	
	public String getFilaCabeceraExportarEmpleadoIdioma(String sDelimiter) {
		String sFilaCabecera="";
		
		
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_ID;

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_VERSIONROW;
		}

		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO;
		sFilaCabecera+=sDelimiter;
		sFilaCabecera+=EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION;
		
		return sFilaCabecera;
	}
	
	public String getFilaDatosExportarEmpleadoIdioma(EmpleadoIdioma empleadoidioma,String sDelimiter) {
		String sFilaDatos="";
		
		sFilaDatos+="\r\n";
		
		
		sFilaDatos+=empleadoidioma.getId().toString();

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
			sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getVersionRow().toString();
		}

		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getempresa_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getempleado_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getidioma_descripcion();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getes_materna().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getes_tecnico().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getporcen_tecnico().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getes_lectura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getporcen_lectura().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getes_escrito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getporcen_escrito().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getes_hablado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getporcen_hablado().toString();
		sFilaDatos+=sDelimiter;
		sFilaDatos+=empleadoidioma.getdescripcion();
		
		return sFilaDatos;
	}
	
	//@SuppressWarnings("deprecation")
	public void exportarExcelEmpleadoIdiomasSeleccionados() throws Exception {
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();		
		
		empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
		
		String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoidioma.xls";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		FileOutputStream fileOutputStream=null;
		
		try {
			HSSFWorkbook workbook = new HSSFWorkbook();
			HSSFSheet sheet = workbook.createSheet("EmpleadoIdiomas");
						
		    			
			Integer iRow=0;
			Integer iCell=0;
			
			HSSFRow row = sheet.createRow(iRow);
			HSSFCell cell = row.createCell(iCell);
			//cell.setCellValue("Blahblah");

			if(conCabecera) {
				this.getFilaCabeceraExportarExcelEmpleadoIdioma(row);				
				iRow++;
			}				
			
			for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomasSeleccionados) {
				row = sheet.createRow(iRow);
				
				this.getFilaDatosExportarExcelEmpleadoIdioma(empleadoidiomaAux,row);
				
				iRow++;
			}
			
			
			fileOutputStream = new FileOutputStream(new File(sPath));
		    
			workbook.write(fileOutputStream);
			
			//fileOutputStream.close();
			
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Idioma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			
       		if (fileOutputStream != null) {
				fileOutputStream.close();
			}			
		}
	}		
	
	public void exportarXmlEmpleadoIdiomasSeleccionados() throws Exception {
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();		
		
		empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
		
		//String sTipo=Funciones2.getTipoExportar(this.parametroGeneralUsuario);
		//Boolean conCabecera=this.parametroGeneralUsuario.getcon_exportar_cabecera();
		//String sDelimiter=Funciones2.getTipoDelimiter(this.parametroGeneralUsuario);
		String sPath=this.parametroGeneralUsuario.getpath_exportar()+"empleadoidioma.xml";
		
		String sFilaCabecera="";
		String sFilaDatos="";
		
		DocumentBuilderFactory documentBuilderFactory=null;
		DocumentBuilder documentBuilder =null;
		
		try {
			documentBuilderFactory = DocumentBuilderFactory.newInstance();
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
	
			Document document = documentBuilder.newDocument();
			Element elementRoot = document.createElement("empleadoidiomas");
			
			document.appendChild(elementRoot);
		    			
												
			Element element = null;//document.createElement("empleadoidioma");
			//elementRoot.appendChild(element);
		
			for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomasSeleccionados) {
				element = document.createElement("empleadoidioma");
				elementRoot.appendChild(element);
			
				this.setFilaDatosExportarXmlEmpleadoIdioma(empleadoidiomaAux,document,element);
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
			
			StreamResult streamResult = new StreamResult(new File(sPath));
	
			transformer.transform(domSource, streamResult);
						
			Constantes2.S_PATH_ULTIMO_ARCHIVO=sPath;
			
			if(this.parametroGeneralUsuario.getcon_mensaje_confirmacion() && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {//Constantes.ISMOSTRARMENSAJESMANTENIMIENTO && 
				JOptionPane.showMessageDialog(this,"EXPORTADO CORRECTAMENTE:"+sPath,"MANTENIMIENTO DE Empleado Idioma",JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			throw e;
			
		} finally {			       				
		}
	}	
	
	//@SuppressWarnings("deprecation")
	public void getFilaCabeceraExportarExcelEmpleadoIdioma(HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ID);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_VERSIONROW);
		}

		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO);
		cell = row.createCell(iColumn++);cell.setCellValue(EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION);
	}
	
	//@SuppressWarnings("deprecation")
	public void getFilaDatosExportarExcelEmpleadoIdioma(EmpleadoIdioma empleadoidioma,HSSFRow row) {
		Integer iColumn=0;
		
		
		HSSFCell cell =null;
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getId());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getempresa_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getempleado_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getidioma_descripcion());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getes_materna());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getes_tecnico());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getporcen_tecnico());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getes_lectura());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getporcen_lectura());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getes_escrito());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getporcen_escrito());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getes_hablado());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getporcen_hablado());
		cell = row.createCell(iColumn++);cell.setCellValue(empleadoidioma.getdescripcion());				
	}
	
	public void setFilaDatosExportarXmlEmpleadoIdioma(EmpleadoIdioma empleadoidioma,Document document,Element element) {
		/*
		Element lastname = document.createElement("lastname");
		lastname.appendChild(document.createTextNode("mook kim"));
		element.appendChild(lastname);
		*/
		

		Element elementId = document.createElement(EmpleadoIdiomaConstantesFunciones.ID);
		elementId.appendChild(document.createTextNode(empleadoidioma.getId().toString().trim()));
		element.appendChild(elementId);

		if(parametroGeneralUsuario.getcon_exportar_campo_version()){

		Element elementVersionRow = document.createElement(EmpleadoIdiomaConstantesFunciones.VERSIONROW);
		elementVersionRow.appendChild(document.createTextNode(empleadoidioma.getVersionRow().toString().trim()));
		element.appendChild(elementVersionRow);
		}


		Element elementempresa_descripcion = document.createElement(EmpleadoIdiomaConstantesFunciones.IDEMPRESA);
		elementempresa_descripcion.appendChild(document.createTextNode(empleadoidioma.getempresa_descripcion()));
		element.appendChild(elementempresa_descripcion);

		Element elementempleado_descripcion = document.createElement(EmpleadoIdiomaConstantesFunciones.IDEMPLEADO);
		elementempleado_descripcion.appendChild(document.createTextNode(empleadoidioma.getempleado_descripcion()));
		element.appendChild(elementempleado_descripcion);

		Element elementidioma_descripcion = document.createElement(EmpleadoIdiomaConstantesFunciones.IDIDIOMA);
		elementidioma_descripcion.appendChild(document.createTextNode(empleadoidioma.getidioma_descripcion()));
		element.appendChild(elementidioma_descripcion);

		Element elementes_materna = document.createElement(EmpleadoIdiomaConstantesFunciones.ESMATERNA);
		elementes_materna.appendChild(document.createTextNode(empleadoidioma.getes_materna().toString().trim()));
		element.appendChild(elementes_materna);

		Element elementes_tecnico = document.createElement(EmpleadoIdiomaConstantesFunciones.ESTECNICO);
		elementes_tecnico.appendChild(document.createTextNode(empleadoidioma.getes_tecnico().toString().trim()));
		element.appendChild(elementes_tecnico);

		Element elementporcen_tecnico = document.createElement(EmpleadoIdiomaConstantesFunciones.PORCENTECNICO);
		elementporcen_tecnico.appendChild(document.createTextNode(empleadoidioma.getporcen_tecnico().toString().trim()));
		element.appendChild(elementporcen_tecnico);

		Element elementes_lectura = document.createElement(EmpleadoIdiomaConstantesFunciones.ESLECTURA);
		elementes_lectura.appendChild(document.createTextNode(empleadoidioma.getes_lectura().toString().trim()));
		element.appendChild(elementes_lectura);

		Element elementporcen_lectura = document.createElement(EmpleadoIdiomaConstantesFunciones.PORCENLECTURA);
		elementporcen_lectura.appendChild(document.createTextNode(empleadoidioma.getporcen_lectura().toString().trim()));
		element.appendChild(elementporcen_lectura);

		Element elementes_escrito = document.createElement(EmpleadoIdiomaConstantesFunciones.ESESCRITO);
		elementes_escrito.appendChild(document.createTextNode(empleadoidioma.getes_escrito().toString().trim()));
		element.appendChild(elementes_escrito);

		Element elementporcen_escrito = document.createElement(EmpleadoIdiomaConstantesFunciones.PORCENESCRITO);
		elementporcen_escrito.appendChild(document.createTextNode(empleadoidioma.getporcen_escrito().toString().trim()));
		element.appendChild(elementporcen_escrito);

		Element elementes_hablado = document.createElement(EmpleadoIdiomaConstantesFunciones.ESHABLADO);
		elementes_hablado.appendChild(document.createTextNode(empleadoidioma.getes_hablado().toString().trim()));
		element.appendChild(elementes_hablado);

		Element elementporcen_hablado = document.createElement(EmpleadoIdiomaConstantesFunciones.PORCENHABLADO);
		elementporcen_hablado.appendChild(document.createTextNode(empleadoidioma.getporcen_hablado().toString().trim()));
		element.appendChild(elementporcen_hablado);

		Element elementdescripcion = document.createElement(EmpleadoIdiomaConstantesFunciones.DESCRIPCION);
		elementdescripcion.appendChild(document.createTextNode(empleadoidioma.getdescripcion().trim()));
		element.appendChild(elementdescripcion);
	}
	
	public void generarReporteGroupGenericoEmpleadoIdiomasSeleccionados(Boolean soloTotales) throws Exception {
		ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados=new ArrayList<EmpleadoIdioma>();
		
		empleadoidiomasSeleccionados=this.getEmpleadoIdiomasSeleccionados(true);
		
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
		
		this.setColumnaDescripcionReporteGroupGenericoEmpleadoIdioma(empleadoidiomasSeleccionados);
		
		this.generarReporteEmpleadoIdiomas("Todos",empleadoidiomasSeleccionados);
	}
	
	public void setColumnaDescripcionReporteGroupGenericoEmpleadoIdioma(ArrayList<EmpleadoIdioma> empleadoidiomasSeleccionados) throws Exception {    		
		try {
			//FUNCIONA CON MODEL PERO SE DANA MANTENIMIENTO
			
			Boolean existe=false;
			
			for(EmpleadoIdioma empleadoidiomaAux:empleadoidiomasSeleccionados) {
				empleadoidiomaAux.setsDetalleGeneralEntityReporte(empleadoidiomaAux.toString());
			
				if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPRESA)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(empleadoidiomaAux.getempresa_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_IDEMPLEADO)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(empleadoidiomaAux.getempleado_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_IDIDIOMA)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(empleadoidiomaAux.getidioma_descripcion());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESMATERNA)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(empleadoidiomaAux.getes_materna()));
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESTECNICO)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(empleadoidiomaAux.getes_tecnico()));
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENTECNICO)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(empleadoidiomaAux.getporcen_tecnico().toString());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESLECTURA)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(empleadoidiomaAux.getes_lectura()));
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENLECTURA)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(empleadoidiomaAux.getporcen_lectura().toString());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESESCRITO)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(empleadoidiomaAux.getes_escrito()));
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENESCRITO)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(empleadoidiomaAux.getporcen_escrito().toString());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_ESHABLADO)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(Funciones2.getDescripcionBoolean(empleadoidiomaAux.getes_hablado()));
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_PORCENHABLADO)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(empleadoidiomaAux.getporcen_hablado().toString());
				}
				 else if(sTipoSeleccionar.equals(EmpleadoIdiomaConstantesFunciones.LABEL_DESCRIPCION)) {
					existe=true;
					empleadoidiomaAux.setsDescripcionGeneralEntityReporte1(empleadoidiomaAux.getdescripcion());
				}
			}	
											
			if(!existe) {
				JOptionPane.showMessageDialog(this,"NO SE HA SELECCIONADO ALGUNA COLUMNA VALIDA","SELECCIONAR",JOptionPane.ERROR_MESSAGE);
			}										
		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger,EmpleadoIdiomaConstantesFunciones.CLASSNAME);
		}
	}
	
	
	public void actualizarEstadoCeldasBotonesEmpleadoIdioma(String sAccion,Boolean isGuardarCambiosEnLote,Boolean isEsMantenimientoRelacionado) throws Exception {
		if(sAccion=="n") {
			if(!this.esParaBusquedaForeignKey) {
				this.isVisibilidadCeldaNuevoEmpleadoIdioma=true;
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=true;
				this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=true;
			}
			
			this.isVisibilidadCeldaModificarEmpleadoIdioma=false;
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=false;
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=false;
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
				}
			}
		} else if(sAccion=="a") {
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=false;
			this.isVisibilidadCeldaModificarEmpleadoIdioma=false;
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=true;
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=false;
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
				}
			}
		} else if(sAccion=="ae") {
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=false;
			this.isVisibilidadCeldaModificarEmpleadoIdioma=false;
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=true;
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=true;
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
				}
			}
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=false;
			this.isVisibilidadCeldaModificarEmpleadoIdioma=false;
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=true;
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=false;
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
				}
			}
		} else if(sAccion=="c") {
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=true;
			this.isVisibilidadCeldaModificarEmpleadoIdioma=false;
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=false;
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=false;
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=true;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
				}
			}
		} else if(sAccion=="t") {
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=false;
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=false;
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=false;
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=false;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
				}
			}
		}  else if(sAccion=="s"||sAccion=="s2") {
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=false;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=false;
			this.isVisibilidadCeldaModificarEmpleadoIdioma=true;
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=false;
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=false;
			this.isVisibilidadCeldaCancelarEmpleadoIdioma=true;
			
			if(isEsMantenimientoRelacionado==false) {
				if(isGuardarCambiosEnLote==true) {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
				} else {
					this.isVisibilidadCeldaGuardarEmpleadoIdioma=false;
				}
			}
		}
		
		//ACTUALIZA VISIBILIDAD PANELES
		if(EmpleadoIdiomaJInternalFrame.CON_DATOS_FRAME && !this.esParaBusquedaForeignKey) {
			//SIEMPRE VISIBLE
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=true;
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=true;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=true;
		} else {
			this.actualizarEstadoPanelsEmpleadoIdioma(sAccion);						
		}
		
		if(this.esParaBusquedaForeignKey) {
			this.isVisibilidadCeldaCopiarEmpleadoIdioma=false;
			//this.isVisibilidadCeldaVerFormEmpleadoIdioma=false;
			this.isVisibilidadCeldaDuplicarEmpleadoIdioma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONES
		if(!empleadoidiomaSessionBean.getConGuardarRelaciones()) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=false;
		} else {
			this.isVisibilidadCeldaNuevoEmpleadoIdioma=false;
			this.isVisibilidadCeldaGuardarCambiosEmpleadoIdioma=false;
		}
		
		//SI ES MANTENIMIENTO RELACIONADO
		if(empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
			if(!empleadoidiomaSessionBean.getConGuardarRelaciones()) {	
				this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=false;												
			}
			
			this.jButtonCerrarEmpleadoIdioma.setVisible(false);
		}
		
		//SI NO TIENE MAXIMO DE RELACIONES PERMITIDAS
		if(!this.conMaximoRelaciones) {
			this.isVisibilidadCeldaNuevoRelacionesEmpleadoIdioma=false;
		}
		
		if(!this.permiteMantenimiento(this.empleadoidioma)) {
			this.isVisibilidadCeldaActualizarEmpleadoIdioma=false;
			this.isVisibilidadCeldaEliminarEmpleadoIdioma=false;
		}
		
		
		
	}
	
	public void actualizarEstadoCeldasBotonesConGuardarRelacionesEmpleadoIdioma() {
	}
	
	public void actualizarEstadoPanelsEmpleadoIdioma(String sAccion) {
		if(sAccion=="n") {
			if(this.jScrollPanelDatosEdicionEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEdicionEmpleadoIdioma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoIdioma!=null) {
				this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEmpleadoIdioma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoIdioma!=null) {
				this.jPanelPaginacionEmpleadoIdioma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoIdioma!=null) {
				this.jPanelParametrosReportesEmpleadoIdioma.setVisible(true);		    
			}
			
		} else if(sAccion=="a") {				
			if(this.jScrollPanelDatosEdicionEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEdicionEmpleadoIdioma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoIdioma!=null) {
				this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(false);			
			}
			
			
			
			if(this.jScrollPanelDatosEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEmpleadoIdioma.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoIdioma!=null) {
				this.jPanelPaginacionEmpleadoIdioma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoIdioma!=null) {
				this.jPanelParametrosReportesEmpleadoIdioma.setVisible(false);
			}
						
		} else if(sAccion=="ae") {		
			if(this.jScrollPanelDatosEdicionEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEdicionEmpleadoIdioma.setVisible(true);		
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoIdioma!=null) {
				this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEmpleadoIdioma.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoIdioma!=null) {
				this.jPanelPaginacionEmpleadoIdioma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoIdioma!=null) {
				this.jPanelParametrosReportesEmpleadoIdioma.setVisible(false);
			}
						
		}
		//Para Mantenimientos de tablas relacionados con mas de columnas minimas
		else if(sAccion=="ae2") {	
			if(this.jScrollPanelDatosEdicionEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEdicionEmpleadoIdioma.setVisible(true);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoIdioma!=null) {
				this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(false);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEmpleadoIdioma.setVisible(false);
			}
			
			if(this.jPanelPaginacionEmpleadoIdioma!=null) {
				this.jPanelPaginacionEmpleadoIdioma.setVisible(false);
			}
			
			if(this.jPanelParametrosReportesEmpleadoIdioma!=null) {
				this.jPanelParametrosReportesEmpleadoIdioma.setVisible(false);
			}
						
		} else if(sAccion=="c") {	
			if(this.jScrollPanelDatosEdicionEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEdicionEmpleadoIdioma.setVisible(false);			
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoIdioma!=null) {
				this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEmpleadoIdioma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoIdioma!=null) {
				this.jPanelPaginacionEmpleadoIdioma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoIdioma!=null) {
				this.jPanelParametrosReportesEmpleadoIdioma.setVisible(true);
			}
						
		} else if(sAccion=="t") {
			
			if(this.jScrollPanelDatosEdicionEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEdicionEmpleadoIdioma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoIdioma!=null) {
				this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEmpleadoIdioma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoIdioma!=null) {
				this.jPanelPaginacionEmpleadoIdioma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoIdioma!=null) {
				this.jPanelParametrosReportesEmpleadoIdioma.setVisible(true);
			}
						
		}  else if(sAccion=="s"||sAccion=="s2") {
			if(this.jScrollPanelDatosEdicionEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEdicionEmpleadoIdioma.setVisible(false);
			}
			
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoIdioma!=null) {
				this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(true);			
			}
			
			
			if(this.jScrollPanelDatosEmpleadoIdioma!=null) {
				this.jScrollPanelDatosEmpleadoIdioma.setVisible(true);
			}
			
			if(this.jPanelPaginacionEmpleadoIdioma!=null) {
				this.jPanelPaginacionEmpleadoIdioma.setVisible(true);
			}
			
			if(this.jPanelParametrosReportesEmpleadoIdioma!=null) {
				this.jPanelParametrosReportesEmpleadoIdioma.setVisible(true);
			}
			
		} 
		
		if(sAccion.equals("relacionado") || this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
			if(!this.conCargarMinimo) {
				//BYDAN_BUSQUEDAS
				
				if(this.jTabbedPaneBusquedasEmpleadoIdioma!=null) {
					this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(false);				
				}
				
			}
			
			if(this.jPanelParametrosReportesEmpleadoIdioma!=null) {
				this.jPanelParametrosReportesEmpleadoIdioma.setVisible(false);
			}
		
		} else if(sAccion.equals("no_relacionado") && !this.empleadoidiomaSessionBean.getEsGuardarRelacionado()) {
			//BYDAN_BUSQUEDAS
			
			if(this.jTabbedPaneBusquedasEmpleadoIdioma!=null) {
				this.jTabbedPaneBusquedasEmpleadoIdioma.setVisible(true);			
			}
			
			if(this.jPanelParametrosReportesEmpleadoIdioma!=null) {
				this.jPanelParametrosReportesEmpleadoIdioma.setVisible(true);
			}
		}
	}	
	
	

	public void setVisibilidadBusquedasParaEmpresa(Boolean isParaEmpresa){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpresaNegation=!isParaEmpresa;

			this.isVisibilidadFK_IdEmpleado=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoIdioma.remove(jPanelFK_IdEmpleadoEmpleadoIdioma);}

			this.isVisibilidadFK_IdIdioma=isParaEmpresaNegation;
			if(!this.isVisibilidadFK_IdIdioma) {this.jTabbedPaneBusquedasEmpleadoIdioma.remove(jPanelFK_IdIdiomaEmpleadoIdioma);}
		}
		
	}

	public void setVisibilidadBusquedasParaEmpleado(Boolean isParaEmpleado){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaEmpleadoNegation=!isParaEmpleado;

			this.isVisibilidadFK_IdEmpleado=isParaEmpleado;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoIdioma.remove(jPanelFK_IdEmpleadoEmpleadoIdioma);}

			this.isVisibilidadFK_IdIdioma=isParaEmpleadoNegation;
			if(!this.isVisibilidadFK_IdIdioma) {this.jTabbedPaneBusquedasEmpleadoIdioma.remove(jPanelFK_IdIdiomaEmpleadoIdioma);}
		}
		
	}

	public void setVisibilidadBusquedasParaIdioma(Boolean isParaIdioma){
		//BYDAN_BUSQUEDAS
		
		if(!this.conCargarMinimo) {

			Boolean isParaIdiomaNegation=!isParaIdioma;

			this.isVisibilidadFK_IdEmpleado=isParaIdiomaNegation;
			if(!this.isVisibilidadFK_IdEmpleado) {this.jTabbedPaneBusquedasEmpleadoIdioma.remove(jPanelFK_IdEmpleadoEmpleadoIdioma);}

			this.isVisibilidadFK_IdIdioma=isParaIdioma;
			if(!this.isVisibilidadFK_IdIdioma) {this.jTabbedPaneBusquedasEmpleadoIdioma.remove(jPanelFK_IdIdiomaEmpleadoIdioma);}
		}
		
	}
	
	
	
	

	public String registrarSesionEmpleadoIdiomaParaBusquedaEmpleados() throws Exception {
		Boolean isPaginaPopupEmpleado=false;

		try {

			if(empleadoidiomaSessionBean==null) {
				empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
			}

			if(empleadoSessionBean==null) {
				empleadoSessionBean=new EmpleadoSessionBean();
			}

			empleadoSessionBean.setsPathNavegacionActual(empleadoidiomaSessionBean.getsPathNavegacionActual()+Constantes.SHTMLFLECHA+EmpleadoConstantesFunciones.SCLASSWEBTITULO);
			empleadoSessionBean.setisPermiteRecargarInformacion(false);
			empleadoSessionBean.setisPaginaPopup(true);
			isPaginaPopupEmpleado=empleadoSessionBean.getisPaginaPopup();
			empleadoSessionBean.setisPaginaPopup(false);
			empleadoSessionBean.setEstaModoBusqueda(true);
			empleadoSessionBean.setsFuncionBusquedaRapida("window.opener.empleadoidiomaFuncionGeneral.setCombosCodigoDesdeBusquedaid_empleado(TO_REPLACE);");
			empleadoSessionBean.setisPermiteNavegacionHaciaForeignKeyDesdeEmpleado(true);
			empleadoSessionBean.setsNombrePaginaNavegacionHaciaForeignKeyDesdeEmpleado(EmpleadoIdiomaConstantesFunciones.SNOMBREOPCION);
			//empleadoSessionBean.setisBusquedaDesdeForeignKeySesionEmpleadoIdioma(true);
			//empleadoSessionBean.setlidEmpleadoIdiomaActual(this.idEmpleadoIdiomaActual);

			empleadoidiomaSessionBean.setisBusquedaDesdeForeignKeySesionForeignKeyEmpleadoIdioma(true);
			empleadoidiomaSessionBean.setlIdEmpleadoIdiomaActualForeignKey(this.idEmpleadoIdiomaActual);

			String strPagina=Constantes.SNONE;
			SistemaLogicAdditional sistemaLogicAdditional=new SistemaLogicAdditional();

			guardarDatosBusquedaSession();

		} catch(Exception e) {
			FuncionesSwing.manageException(this, e,logger);
		}
			return "";
	}
	
	
	public void guardarDatosBusquedaSession() throws Exception {
		
		//EmpleadoIdiomaSessionBean empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
		
		if(this.empleadoidiomaSessionBean==null) {
			this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
		}
		
		this.empleadoidiomaSessionBean.setsUltimaBusquedaEmpleadoIdioma(this.getsAccionBusqueda());
		this.empleadoidiomaSessionBean.setiNumeroPaginacion(this.getiNumeroPaginacion());
		this.empleadoidiomaSessionBean.setiNumeroPaginacionPagina(this.getiNumeroPaginacionPagina());
		
		if(this.getsAccionBusqueda().equals("Todos")) {
			;
		}
		

		else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
			empleadoidiomaSessionBean.setid_empleado(this.getid_empleadoFK_IdEmpleado());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
			empleadoidiomaSessionBean.setid_empresa(this.getid_empresaFK_IdEmpresa());	
		}
		else if(this.getsAccionBusqueda().equals("FK_IdIdioma")) {
			empleadoidiomaSessionBean.setid_idioma(this.getid_idiomaFK_IdIdioma());	
		}
		
	}
	
	public void traerDatosBusquedaDesdeSession() throws Exception {
		//EmpleadoIdiomaSessionBean empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
		
		if(this.empleadoidiomaSessionBean==null) {
			this.empleadoidiomaSessionBean=new EmpleadoIdiomaSessionBean();
		}
		
		if(this.empleadoidiomaSessionBean.getsUltimaBusquedaEmpleadoIdioma()!=null&&!this.empleadoidiomaSessionBean.getsUltimaBusquedaEmpleadoIdioma().equals("")) {
			this.setsAccionBusqueda(empleadoidiomaSessionBean.getsUltimaBusquedaEmpleadoIdioma());
			this.setiNumeroPaginacion(empleadoidiomaSessionBean.getiNumeroPaginacion());
			this.setiNumeroPaginacionPagina(empleadoidiomaSessionBean.getiNumeroPaginacionPagina());		
				
			if(this.getsAccionBusqueda().equals("Todos")) {
				;
			}
			

			 else if(this.getsAccionBusqueda().equals("FK_IdEmpleado")) {
				this.setid_empleadoFK_IdEmpleado(empleadoidiomaSessionBean.getid_empleado());
				empleadoidiomaSessionBean.setid_empleado(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdEmpresa")) {
				this.setid_empresaFK_IdEmpresa(empleadoidiomaSessionBean.getid_empresa());
				empleadoidiomaSessionBean.setid_empresa(-1L);
			}
			 else if(this.getsAccionBusqueda().equals("FK_IdIdioma")) {
				this.setid_idiomaFK_IdIdioma(empleadoidiomaSessionBean.getid_idioma());
				empleadoidiomaSessionBean.setid_idioma(-1L);
			}
		}
		
		this.empleadoidiomaSessionBean.setsUltimaBusquedaEmpleadoIdioma("");
		this.empleadoidiomaSessionBean.setiNumeroPaginacion(EmpleadoIdiomaConstantesFunciones.INUMEROPAGINACION);
		this.empleadoidiomaSessionBean.setiNumeroPaginacionPagina(0);
		
	}
	
	public void procesoActualizarFilaTotales(Boolean esCampoValor,String sTipo) {
		try {
			this.actualizarFilaTotales();
				
			this.traerValoresTablaTotales();
			
			this.inicializarActualizarBindingTablaEmpleadoIdioma(false);
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void updateBusquedasFormularioEmpleadoIdioma() {
		this.updateBorderResaltarBusquedasFormularioEmpleadoIdioma();
		this.updateVisibilidadBusquedasFormularioEmpleadoIdioma();
		this.updateHabilitarBusquedasFormularioEmpleadoIdioma();
	}
	
	public void updateBorderResaltarBusquedasFormularioEmpleadoIdioma() {					
	//BYDAN_BUSQUEDAS
		
	int index=0;
		
	if(this.jTabbedPaneBusquedasEmpleadoIdioma.getComponents().length>0) {
	

		if(this.empleadoidiomaConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoIdioma!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoIdioma.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoIdioma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoIdioma.getComponent(index);
				jPanel.setBorder(this.empleadoidiomaConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoIdioma);
			}
		}

		if(this.empleadoidiomaConstantesFunciones.resaltarFK_IdIdiomaEmpleadoIdioma!=null) {
			index= this.jTabbedPaneBusquedasEmpleadoIdioma.indexOfComponent(this.jPanelFK_IdIdiomaEmpleadoIdioma);
			if(index>-1) {
				JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoIdioma.getComponent(index);
				jPanel.setBorder(this.empleadoidiomaConstantesFunciones.resaltarFK_IdIdiomaEmpleadoIdioma);
			}
		}
	}	
	
	}
	
	public void updateVisibilidadBusquedasFormularioEmpleadoIdioma() {
	//BYDAN_BUSQUEDAS
	
	int index=0;
	JPanel jPanel=null;
		
	if(this.jTabbedPaneBusquedasEmpleadoIdioma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoIdioma.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoIdioma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoIdioma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoidiomaConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoIdioma);
			if(!this.empleadoidiomaConstantesFunciones.mostrarFK_IdEmpleadoEmpleadoIdioma && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoIdioma.remove(index);
			}

			index= this.jTabbedPaneBusquedasEmpleadoIdioma.indexOfComponent(this.jPanelFK_IdIdiomaEmpleadoIdioma);
			jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoIdioma.getComponent(index);
			//NO VALE SOLO PONIENDO VISIBLE=FALSE, HAY QUE USAR REMOVE
			jPanel.setVisible(this.empleadoidiomaConstantesFunciones.mostrarFK_IdIdiomaEmpleadoIdioma);
			if(!this.empleadoidiomaConstantesFunciones.mostrarFK_IdIdiomaEmpleadoIdioma && index>-1) {
				this.jTabbedPaneBusquedasEmpleadoIdioma.remove(index);
			}
	}	
	
	}
	
	public void updateHabilitarBusquedasFormularioEmpleadoIdioma() {
	
	//BYDAN_BUSQUEDAS		
		int index=0;
		JPanel jPanel=null;
			
		if(this.jTabbedPaneBusquedasEmpleadoIdioma.getComponents().length>0) {
	

			index= this.jTabbedPaneBusquedasEmpleadoIdioma.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoIdioma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoIdioma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoidiomaConstantesFunciones.activarFK_IdEmpleadoEmpleadoIdioma);
				this.jTabbedPaneBusquedasEmpleadoIdioma.setEnabledAt(index,this.empleadoidiomaConstantesFunciones.activarFK_IdEmpleadoEmpleadoIdioma);
			}

			index= this.jTabbedPaneBusquedasEmpleadoIdioma.indexOfComponent(this.jPanelFK_IdIdiomaEmpleadoIdioma);
			if(index>-1) {
				jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoIdioma.getComponent(index);
				//ENABLE PANE=FALSE NO FUNCIONA, ENABLEAT SI
				jPanel.setEnabled(this.empleadoidiomaConstantesFunciones.activarFK_IdIdiomaEmpleadoIdioma);
				this.jTabbedPaneBusquedasEmpleadoIdioma.setEnabledAt(index,this.empleadoidiomaConstantesFunciones.activarFK_IdIdiomaEmpleadoIdioma);
			}
		}	
	
	}
	
	
	public void resaltarPanelBusquedaEmpleadoIdioma(String sTipoBusqueda) {
		Boolean existe=false;
		//BYDAN_BUSQUEDAS
		
		int index=0;
		Border resaltar = Funciones2.getBorderResaltar(this.parametroGeneralUsuario,"TAB");

		if(sTipoBusqueda.equals("FK_IdEmpleado")) {
			index= this.jTabbedPaneBusquedasEmpleadoIdioma.indexOfComponent(this.jPanelFK_IdEmpleadoEmpleadoIdioma);

			this.jTabbedPaneBusquedasEmpleadoIdioma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoIdioma.getComponent(index);

			this.empleadoidiomaConstantesFunciones.setResaltarFK_IdEmpleadoEmpleadoIdioma(resaltar);

			jPanel.setBorder(this.empleadoidiomaConstantesFunciones.resaltarFK_IdEmpleadoEmpleadoIdioma);
			existe=true;
		}
		else if(sTipoBusqueda.equals("FK_IdIdioma")) {
			index= this.jTabbedPaneBusquedasEmpleadoIdioma.indexOfComponent(this.jPanelFK_IdIdiomaEmpleadoIdioma);

			this.jTabbedPaneBusquedasEmpleadoIdioma.setSelectedIndex(index);

			JPanel jPanel=(JPanel)this.jTabbedPaneBusquedasEmpleadoIdioma.getComponent(index);

			this.empleadoidiomaConstantesFunciones.setResaltarFK_IdIdiomaEmpleadoIdioma(resaltar);

			jPanel.setBorder(this.empleadoidiomaConstantesFunciones.resaltarFK_IdIdiomaEmpleadoIdioma);
			existe=true;
		}
		

		if(existe) {
			
			this.jTtoolBarEmpleadoIdioma.setBorder(resaltar);
			
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
	
	public void updateControlesFormularioEmpleadoIdioma() throws Exception {

		if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {			
			this.inicializarFormDetalle();
		}
		
		this.updateBorderResaltarControlesFormularioEmpleadoIdioma();
		this.updateVisibilidadResaltarControlesFormularioEmpleadoIdioma();
		this.updateHabilitarResaltarControlesFormularioEmpleadoIdioma();
		
	}
	
	public void updateBorderResaltarControlesFormularioEmpleadoIdioma() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
	
		if(this.empleadoidiomaConstantesFunciones.resaltaridEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltaridEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltarid_empresaEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltarid_empresaEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltarid_empleadoEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltarid_empleadoEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltarid_idiomaEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltarid_idiomaEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltares_maternaEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_maternaEmpleadoIdioma.setBorderPainted(true);this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_maternaEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltares_maternaEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltares_tecnicoEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_tecnicoEmpleadoIdioma.setBorderPainted(true);this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_tecnicoEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltares_tecnicoEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltarporcen_tecnicoEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_tecnicoEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltarporcen_tecnicoEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltares_lecturaEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_lecturaEmpleadoIdioma.setBorderPainted(true);this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_lecturaEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltares_lecturaEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltarporcen_lecturaEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_lecturaEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltarporcen_lecturaEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltares_escritoEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_escritoEmpleadoIdioma.setBorderPainted(true);this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_escritoEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltares_escritoEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltarporcen_escritoEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_escritoEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltarporcen_escritoEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltares_habladoEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_habladoEmpleadoIdioma.setBorderPainted(true);this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_habladoEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltares_habladoEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltarporcen_habladoEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_habladoEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltarporcen_habladoEmpleadoIdioma);}
		if(this.empleadoidiomaConstantesFunciones.resaltardescripcionEmpleadoIdioma!=null && this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {this.jInternalFrameDetalleFormEmpleadoIdioma.jTextAreadescripcionEmpleadoIdioma.setBorder(this.empleadoidiomaConstantesFunciones.resaltardescripcionEmpleadoIdioma);}
	}
	
	public void updateVisibilidadResaltarControlesFormularioEmpleadoIdioma() throws Exception {		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
	
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostraridEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelidEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostraridEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarid_empresaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelid_empresaEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarid_empresaEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarid_empleadoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelid_empleadoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarid_empleadoEmpleadoIdioma);
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarid_empleadoEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarid_idiomaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelid_idiomaEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarid_idiomaEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_maternaEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrares_maternaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPaneles_maternaEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrares_maternaEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_tecnicoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrares_tecnicoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPaneles_tecnicoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrares_tecnicoEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_tecnicoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarporcen_tecnicoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelporcen_tecnicoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarporcen_tecnicoEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_lecturaEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrares_lecturaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPaneles_lecturaEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrares_lecturaEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_lecturaEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarporcen_lecturaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelporcen_lecturaEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarporcen_lecturaEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_escritoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrares_escritoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPaneles_escritoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrares_escritoEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_escritoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarporcen_escritoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelporcen_escritoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarporcen_escritoEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_habladoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrares_habladoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPaneles_habladoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrares_habladoEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_habladoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarporcen_habladoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPanelporcen_habladoEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrarporcen_habladoEmpleadoIdioma);
		//this.jInternalFrameDetalleFormEmpleadoIdioma.jTextAreadescripcionEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrardescripcionEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jPaneldescripcionEmpleadoIdioma.setVisible(this.empleadoidiomaConstantesFunciones.mostrardescripcionEmpleadoIdioma);
		}
	}
	
	public void updateHabilitarResaltarControlesFormularioEmpleadoIdioma() throws Exception {
		if(this.jInternalFrameDetalleFormEmpleadoIdioma==null) { //if(!this.conCargarFormDetalle) {
			this.inicializarFormDetalle();
		}
		
		if(this.jInternalFrameDetalleFormEmpleadoIdioma!=null) {
	
		this.jInternalFrameDetalleFormEmpleadoIdioma.jLabelidEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activaridEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empresaEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activarid_empresaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_empleadoEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activarid_empleadoEmpleadoIdioma);
			this.jInternalFrameDetalleFormEmpleadoIdioma.jButtonid_empleadoEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activarid_empleadoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jComboBoxid_idiomaEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activarid_idiomaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_maternaEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activares_maternaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_tecnicoEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activares_tecnicoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_tecnicoEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activarporcen_tecnicoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_lecturaEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activares_lecturaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_lecturaEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activarporcen_lecturaEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_escritoEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activares_escritoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_escritoEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activarporcen_escritoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jCheckBoxes_habladoEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activares_habladoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTextFieldporcen_habladoEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activarporcen_habladoEmpleadoIdioma);
		this.jInternalFrameDetalleFormEmpleadoIdioma.jTextAreadescripcionEmpleadoIdioma.setEnabled(this.empleadoidiomaConstantesFunciones.activardescripcionEmpleadoIdioma);
		}
	}
	
		
}